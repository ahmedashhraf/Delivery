package org.jivesoftware.smackx.workgroup.user;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.FromMatchesFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.muc.InvitationListener;
import org.jivesoftware.smackx.muc.MultiUserChat;
import org.jivesoftware.smackx.muc.MultiUserChatManager;
import org.jivesoftware.smackx.muc.packet.MUCUser;
import org.jivesoftware.smackx.muc.packet.MUCUser.Invite;
import org.jivesoftware.smackx.workgroup.MetaData;
import org.jivesoftware.smackx.workgroup.WorkgroupInvitation;
import org.jivesoftware.smackx.workgroup.WorkgroupInvitationListener;
import org.jivesoftware.smackx.workgroup.ext.forms.WorkgroupForm;
import org.jivesoftware.smackx.workgroup.packet.DepartQueuePacket;
import org.jivesoftware.smackx.workgroup.packet.QueueUpdate;
import org.jivesoftware.smackx.workgroup.packet.SessionID;
import org.jivesoftware.smackx.workgroup.packet.UserID;
import org.jivesoftware.smackx.workgroup.settings.ChatSetting;
import org.jivesoftware.smackx.workgroup.settings.ChatSettings;
import org.jivesoftware.smackx.workgroup.settings.OfflineSettings;
import org.jivesoftware.smackx.workgroup.settings.SoundSettings;
import org.jivesoftware.smackx.workgroup.settings.WorkgroupProperties;
import org.jivesoftware.smackx.xdata.Form;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import p205i.p486d.p487a.C14055b;

public class Workgroup {
    /* access modifiers changed from: private */
    public XMPPConnection connection;
    /* access modifiers changed from: private */
    public boolean inQueue;
    private CopyOnWriteArraySet<WorkgroupInvitationListener> invitationListeners;
    private CopyOnWriteArraySet<QueueListener> queueListeners;
    /* access modifiers changed from: private */
    public int queuePosition = -1;
    /* access modifiers changed from: private */
    public int queueRemainingTime = -1;
    private String workgroupJID;

    private class JoinQueuePacket extends C15617IQ {
        private DataForm form;
        private String userID = null;

        public JoinQueuePacket(String str, Form form2, String str2) {
            super("join-queue", "http://jabber.org/protocol/workgroup");
            this.userID = str2;
            setTo(str);
            setType(Type.set);
            this.form = form2.getDataFormToSend();
            addExtension(this.form);
        }

        /* access modifiers changed from: protected */
        public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
            iQChildElementXmlStringBuilder.rightAngleBracket();
            iQChildElementXmlStringBuilder.append((CharSequence) "<queue-notifications/>");
            if (Workgroup.this.connection.isAnonymous()) {
                iQChildElementXmlStringBuilder.append((CharSequence) new UserID(this.userID).toXML());
            }
            iQChildElementXmlStringBuilder.append(this.form.toXML());
            return iQChildElementXmlStringBuilder;
        }
    }

    public Workgroup(String str, XMPPConnection xMPPConnection) {
        if (xMPPConnection.isAuthenticated()) {
            this.workgroupJID = str;
            this.connection = xMPPConnection;
            this.inQueue = false;
            this.invitationListeners = new CopyOnWriteArraySet<>();
            this.queueListeners = new CopyOnWriteArraySet<>();
            addQueueListener(new QueueListener() {
                public void departedQueue() {
                    Workgroup.this.inQueue = false;
                    Workgroup.this.queuePosition = -1;
                    Workgroup.this.queueRemainingTime = -1;
                }

                public void joinedQueue() {
                    Workgroup.this.inQueue = true;
                }

                public void queuePositionUpdated(int i) {
                    Workgroup.this.queuePosition = i;
                }

                public void queueWaitTimeUpdated(int i) {
                    Workgroup.this.queueRemainingTime = i;
                }
            });
            MultiUserChatManager.getInstanceFor(xMPPConnection).addInvitationListener(new InvitationListener() {
                public void invitationReceived(XMPPConnection xMPPConnection, MultiUserChat multiUserChat, String str, String str2, String str3, Message message) {
                    Workgroup.this.inQueue = false;
                    Workgroup.this.queuePosition = -1;
                    Workgroup.this.queueRemainingTime = -1;
                }
            });
            xMPPConnection.addAsyncStanzaListener(new StanzaListener() {
                public void processPacket(Stanza stanza) {
                    Workgroup.this.handlePacket(stanza);
                }
            }, new StanzaTypeFilter(Message.class));
            return;
        }
        throw new IllegalStateException("Must login to server before creating workgroup.");
    }

    private void fireInvitationEvent(WorkgroupInvitation workgroupInvitation) {
        Iterator it = this.invitationListeners.iterator();
        while (it.hasNext()) {
            ((WorkgroupInvitationListener) it.next()).invitationReceived(workgroupInvitation);
        }
    }

    private void fireQueueDepartedEvent() {
        Iterator it = this.queueListeners.iterator();
        while (it.hasNext()) {
            ((QueueListener) it.next()).departedQueue();
        }
    }

    private void fireQueueJoinedEvent() {
        Iterator it = this.queueListeners.iterator();
        while (it.hasNext()) {
            ((QueueListener) it.next()).joinedQueue();
        }
    }

    private void fireQueuePositionEvent(int i) {
        Iterator it = this.queueListeners.iterator();
        while (it.hasNext()) {
            ((QueueListener) it.next()).queuePositionUpdated(i);
        }
    }

    private void fireQueueTimeEvent(int i) {
        Iterator it = this.queueListeners.iterator();
        while (it.hasNext()) {
            ((QueueListener) it.next()).queueWaitTimeUpdated(i);
        }
    }

    /* access modifiers changed from: private */
    public void handlePacket(Stanza stanza) {
        if (stanza instanceof Message) {
            Message message = (Message) stanza;
            String str = "http://jabber.org/protocol/workgroup";
            ExtensionElement extension = message.getExtension("depart-queue", str);
            ExtensionElement extension2 = message.getExtension(QueueUpdate.ELEMENT_NAME, str);
            if (extension != null) {
                fireQueueDepartedEvent();
            } else if (extension2 != null) {
                QueueUpdate queueUpdate = (QueueUpdate) extension2;
                if (queueUpdate.getPosition() != -1) {
                    fireQueuePositionEvent(queueUpdate.getPosition());
                }
                if (queueUpdate.getRemaingTime() != -1) {
                    fireQueueTimeEvent(queueUpdate.getRemaingTime());
                }
            } else {
                MUCUser mUCUser = (MUCUser) message.getExtension("x", MUCUser.NAMESPACE);
                Map map = null;
                Invite invite = mUCUser != null ? mUCUser.getInvite() : null;
                if (invite != null && this.workgroupJID.equals(invite.getFrom())) {
                    String str2 = "http://jivesoftware.com/protocol/workgroup";
                    ExtensionElement extension3 = message.getExtension("session", str2);
                    String sessionID = extension3 != null ? ((SessionID) extension3).getSessionID() : null;
                    ExtensionElement extension4 = message.getExtension(MetaData.ELEMENT_NAME, str2);
                    if (extension4 != null) {
                        map = ((MetaData) extension4).getMetaData();
                    }
                    WorkgroupInvitation workgroupInvitation = new WorkgroupInvitation(this.connection.getUser(), message.getFrom(), this.workgroupJID, sessionID, message.getBody(), message.getFrom(), map);
                    fireInvitationEvent(workgroupInvitation);
                }
            }
        }
    }

    public void addInvitationListener(WorkgroupInvitationListener workgroupInvitationListener) {
        this.invitationListeners.add(workgroupInvitationListener);
    }

    public void addQueueListener(QueueListener queueListener) {
        this.queueListeners.add(queueListener);
    }

    public void departQueue() throws NoResponseException, XMPPErrorException, NotConnectedException {
        if (this.inQueue) {
            this.connection.createPacketCollectorAndSend(new DepartQueuePacket(this.workgroupJID)).nextResultOrThrow();
            fireQueueDepartedEvent();
        }
    }

    public ChatSetting getChatSetting(String str) throws XMPPException, SmackException {
        return getChatSettings(str, -1).getFirstEntry();
    }

    public ChatSettings getChatSettings(int i) throws XMPPException, SmackException {
        return getChatSettings(null, i);
    }

    public OfflineSettings getOfflineSettings() throws NoResponseException, XMPPErrorException, NotConnectedException {
        OfflineSettings offlineSettings = new OfflineSettings();
        offlineSettings.setType(Type.get);
        offlineSettings.setTo(this.workgroupJID);
        return (OfflineSettings) this.connection.createPacketCollectorAndSend(offlineSettings).nextResultOrThrow();
    }

    public int getQueuePosition() {
        return this.queuePosition;
    }

    public int getQueueRemainingTime() {
        return this.queueRemainingTime;
    }

    public SoundSettings getSoundSettings() throws NoResponseException, XMPPErrorException, NotConnectedException {
        SoundSettings soundSettings = new SoundSettings();
        soundSettings.setType(Type.get);
        soundSettings.setTo(this.workgroupJID);
        return (SoundSettings) this.connection.createPacketCollectorAndSend(soundSettings).nextResultOrThrow();
    }

    public Form getWorkgroupForm() throws NoResponseException, XMPPErrorException, NotConnectedException {
        WorkgroupForm workgroupForm = new WorkgroupForm();
        workgroupForm.setType(Type.get);
        workgroupForm.setTo(this.workgroupJID);
        return Form.getFormFrom((WorkgroupForm) this.connection.createPacketCollectorAndSend(workgroupForm).nextResultOrThrow());
    }

    public String getWorkgroupJID() {
        return this.workgroupJID;
    }

    public WorkgroupProperties getWorkgroupProperties() throws NoResponseException, XMPPErrorException, NotConnectedException {
        WorkgroupProperties workgroupProperties = new WorkgroupProperties();
        workgroupProperties.setType(Type.get);
        workgroupProperties.setTo(this.workgroupJID);
        return (WorkgroupProperties) this.connection.createPacketCollectorAndSend(workgroupProperties).nextResultOrThrow();
    }

    public boolean isAvailable() throws NoResponseException, XMPPErrorException, NotConnectedException {
        Presence presence = new Presence(Presence.Type.available);
        presence.setTo(this.workgroupJID);
        StanzaTypeFilter stanzaTypeFilter = new StanzaTypeFilter(Presence.class);
        FromMatchesFilter create = FromMatchesFilter.create(this.workgroupJID);
        if (Presence.Type.available == ((Presence) this.connection.createPacketCollectorAndSend(new AndFilter(create, stanzaTypeFilter), presence).nextResultOrThrow()).getType()) {
            return true;
        }
        return false;
    }

    public boolean isEmailAvailable() throws SmackException {
        try {
            return ServiceDiscoveryManager.getInstanceFor(this.connection).discoverInfo(C14055b.m60646f(this.workgroupJID)).containsFeature("jive:email:provider");
        } catch (XMPPException unused) {
            return false;
        }
    }

    public boolean isInQueue() {
        return this.inQueue;
    }

    public void joinQueue() throws XMPPException, SmackException {
        joinQueue(null);
    }

    public void removeQueueListener(QueueListener queueListener) {
        this.queueListeners.remove(queueListener);
    }

    public ChatSettings getChatSettings() throws XMPPException, SmackException {
        return getChatSettings(null, -1);
    }

    public void joinQueue(Form form) throws XMPPException, SmackException {
        joinQueue(form, (String) null);
    }

    public void removeQueueListener(WorkgroupInvitationListener workgroupInvitationListener) {
        this.invitationListeners.remove(workgroupInvitationListener);
    }

    private ChatSettings getChatSettings(String str, int i) throws NoResponseException, XMPPErrorException, NotConnectedException {
        ChatSettings chatSettings = new ChatSettings();
        if (str != null) {
            chatSettings.setKey(str);
        }
        if (i != -1) {
            chatSettings.setType(i);
        }
        chatSettings.setType(Type.get);
        chatSettings.setTo(this.workgroupJID);
        return (ChatSettings) this.connection.createPacketCollectorAndSend(chatSettings).nextResultOrThrow();
    }

    public void joinQueue(Form form, String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        if (!this.inQueue) {
            this.connection.createPacketCollectorAndSend(new JoinQueuePacket(this.workgroupJID, form, str)).nextResultOrThrow();
            fireQueueJoinedEvent();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Already in queue ");
        sb.append(this.workgroupJID);
        throw new IllegalStateException(sb.toString());
    }

    public WorkgroupProperties getWorkgroupProperties(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        WorkgroupProperties workgroupProperties = new WorkgroupProperties();
        workgroupProperties.setJid(str);
        workgroupProperties.setType(Type.get);
        workgroupProperties.setTo(this.workgroupJID);
        return (WorkgroupProperties) this.connection.createPacketCollectorAndSend(workgroupProperties).nextResultOrThrow();
    }

    public void joinQueue(Map<String, Object> map, String str) throws XMPPException, SmackException {
        if (!this.inQueue) {
            Form form = new Form(DataForm.Type.submit);
            for (String str2 : map.keySet()) {
                String obj = map.get(str2).toString();
                FormField formField = new FormField(str2);
                formField.setType(FormField.Type.text_single);
                form.addField(formField);
                form.setAnswer(str2, obj);
            }
            joinQueue(form, str);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Already in queue ");
        sb.append(this.workgroupJID);
        throw new IllegalStateException(sb.toString());
    }
}
