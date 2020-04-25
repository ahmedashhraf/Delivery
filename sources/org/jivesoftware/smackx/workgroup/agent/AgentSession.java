package org.jivesoftware.smackx.workgroup.agent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.FromMatchesFilter;
import org.jivesoftware.smack.filter.OrFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.DefaultExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Presence.Mode;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.muc.packet.MUCUser;
import org.jivesoftware.smackx.muc.packet.MUCUser.Invite;
import org.jivesoftware.smackx.search.ReportedData;
import org.jivesoftware.smackx.workgroup.MetaData;
import org.jivesoftware.smackx.workgroup.QueueUser;
import org.jivesoftware.smackx.workgroup.WorkgroupInvitation;
import org.jivesoftware.smackx.workgroup.WorkgroupInvitationListener;
import org.jivesoftware.smackx.workgroup.agent.WorkgroupQueue.Status;
import org.jivesoftware.smackx.workgroup.ext.history.AgentChatHistory;
import org.jivesoftware.smackx.workgroup.ext.history.ChatMetadata;
import org.jivesoftware.smackx.workgroup.ext.macros.MacroGroup;
import org.jivesoftware.smackx.workgroup.ext.macros.Macros;
import org.jivesoftware.smackx.workgroup.ext.notes.ChatNotes;
import org.jivesoftware.smackx.workgroup.packet.AgentStatus;
import org.jivesoftware.smackx.workgroup.packet.DepartQueuePacket;
import org.jivesoftware.smackx.workgroup.packet.MonitorPacket;
import org.jivesoftware.smackx.workgroup.packet.OccupantsInfo;
import org.jivesoftware.smackx.workgroup.packet.OfferRequestProvider.OfferRequestPacket;
import org.jivesoftware.smackx.workgroup.packet.OfferRevokeProvider.OfferRevokePacket;
import org.jivesoftware.smackx.workgroup.packet.QueueDetails;
import org.jivesoftware.smackx.workgroup.packet.QueueOverview;
import org.jivesoftware.smackx.workgroup.packet.RoomInvitation;
import org.jivesoftware.smackx.workgroup.packet.RoomInvitation.RoomInvitationIQ;
import org.jivesoftware.smackx.workgroup.packet.RoomTransfer;
import org.jivesoftware.smackx.workgroup.packet.RoomTransfer.RoomTransferIQ;
import org.jivesoftware.smackx.workgroup.packet.SessionID;
import org.jivesoftware.smackx.workgroup.packet.Transcript;
import org.jivesoftware.smackx.workgroup.packet.Transcripts;
import org.jivesoftware.smackx.workgroup.settings.GenericSettings;
import org.jivesoftware.smackx.workgroup.settings.SearchSettings;
import org.jivesoftware.smackx.xdata.Form;
import p205i.p486d.p487a.C14055b;

public class AgentSession {
    /* access modifiers changed from: private */
    public static final Logger LOGGER = Logger.getLogger(AgentSession.class.getName());
    private Agent agent;
    private AgentRoster agentRoster = null;
    private XMPPConnection connection;
    private final List<WorkgroupInvitationListener> invitationListeners;
    private int maxChats;
    private final Map<String, List<String>> metaData;
    private final List<OfferListener> offerListeners;
    private boolean online = false;
    private StanzaListener packetListener;
    private Mode presenceMode;
    private final List<QueueUsersListener> queueUsersListeners;
    private Map<String, WorkgroupQueue> queues;
    private TranscriptManager transcriptManager;
    private TranscriptSearchManager transcriptSearchManager;
    private String workgroupJID;

    public AgentSession(String str, XMPPConnection xMPPConnection) {
        if (xMPPConnection.isAuthenticated()) {
            this.workgroupJID = str;
            this.connection = xMPPConnection;
            this.transcriptManager = new TranscriptManager(xMPPConnection);
            this.transcriptSearchManager = new TranscriptSearchManager(xMPPConnection);
            this.maxChats = -1;
            this.metaData = new HashMap();
            this.queues = new HashMap();
            this.offerListeners = new ArrayList();
            this.invitationListeners = new ArrayList();
            this.queueUsersListeners = new ArrayList();
            OrFilter orFilter = new OrFilter(new StanzaTypeFilter(Presence.class), new StanzaTypeFilter(Message.class));
            this.packetListener = new StanzaListener() {
                public void processPacket(Stanza stanza) {
                    try {
                        AgentSession.this.handlePacket(stanza);
                    } catch (Exception e) {
                        AgentSession.LOGGER.log(Level.SEVERE, "Error processing packet", e);
                    }
                }
            };
            xMPPConnection.addAsyncStanzaListener(this.packetListener, orFilter);
            C157332 r0 = new AbstractIqRequestHandler("offer", "http://jabber.org/protocol/workgroup", Type.set, IQRequestHandler.Mode.async) {
                public C15617IQ handleIQRequest(C15617IQ iq) {
                    C15617IQ createResultIQ = C15617IQ.createResultIQ(iq);
                    AgentSession.this.fireOfferRequestEvent((OfferRequestPacket) iq);
                    return createResultIQ;
                }
            };
            xMPPConnection.registerIQRequestHandler(r0);
            C157343 r02 = new AbstractIqRequestHandler(OfferRevokePacket.ELEMENT, "http://jabber.org/protocol/workgroup", Type.set, IQRequestHandler.Mode.async) {
                public C15617IQ handleIQRequest(C15617IQ iq) {
                    C15617IQ createResultIQ = C15617IQ.createResultIQ(iq);
                    AgentSession.this.fireOfferRevokeEvent((OfferRevokePacket) iq);
                    return createResultIQ;
                }
            };
            xMPPConnection.registerIQRequestHandler(r02);
            this.agent = new Agent(xMPPConnection, str);
            return;
        }
        throw new IllegalStateException("Must login to server before creating workgroup.");
    }

    private void fireInvitationEvent(String str, String str2, String str3, String str4, Map<String, List<String>> map) {
        WorkgroupInvitation workgroupInvitation = new WorkgroupInvitation(this.connection.getUser(), str, this.workgroupJID, str2, str3, str4, map);
        synchronized (this.invitationListeners) {
            for (WorkgroupInvitationListener invitationReceived : this.invitationListeners) {
                invitationReceived.invitationReceived(workgroupInvitation);
            }
        }
    }

    /* access modifiers changed from: private */
    public void fireOfferRequestEvent(OfferRequestPacket offerRequestPacket) {
        Offer offer = new Offer(this.connection, this, offerRequestPacket.getUserID(), offerRequestPacket.getUserJID(), getWorkgroupJID(), new Date(new Date().getTime() + ((long) (offerRequestPacket.getTimeout() * 1000))), offerRequestPacket.getSessionID(), offerRequestPacket.getMetaData(), offerRequestPacket.getContent());
        synchronized (this.offerListeners) {
            for (OfferListener offerReceived : this.offerListeners) {
                offerReceived.offerReceived(offer);
            }
        }
    }

    /* access modifiers changed from: private */
    public void fireOfferRevokeEvent(OfferRevokePacket offerRevokePacket) {
        RevokedOffer revokedOffer = new RevokedOffer(offerRevokePacket.getUserJID(), offerRevokePacket.getUserID(), getWorkgroupJID(), offerRevokePacket.getSessionID(), offerRevokePacket.getReason(), new Date());
        synchronized (this.offerListeners) {
            for (OfferListener offerRevoked : this.offerListeners) {
                offerRevoked.offerRevoked(revokedOffer);
            }
        }
    }

    private void fireQueueUsersEvent(WorkgroupQueue workgroupQueue, Status status, int i, Date date, Set<QueueUser> set) {
        synchronized (this.queueUsersListeners) {
            for (QueueUsersListener queueUsersListener : this.queueUsersListeners) {
                if (status != null) {
                    queueUsersListener.statusUpdated(workgroupQueue, status);
                }
                if (i != -1) {
                    queueUsersListener.averageWaitTimeUpdated(workgroupQueue, i);
                }
                if (date != null) {
                    queueUsersListener.oldestEntryUpdated(workgroupQueue, date);
                }
                if (set != null) {
                    queueUsersListener.usersUpdated(workgroupQueue, set);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void handlePacket(Stanza stanza) {
        if (stanza instanceof Presence) {
            Presence presence = (Presence) stanza;
            String h = C14055b.m60648h(presence.getFrom());
            WorkgroupQueue workgroupQueue = (WorkgroupQueue) this.queues.get(h);
            if (workgroupQueue == null) {
                workgroupQueue = new WorkgroupQueue(h);
                this.queues.put(h, workgroupQueue);
            }
            WorkgroupQueue workgroupQueue2 = workgroupQueue;
            QueueOverview queueOverview = (QueueOverview) presence.getExtension(QueueOverview.ELEMENT_NAME, QueueOverview.NAMESPACE);
            if (queueOverview != null) {
                if (queueOverview.getStatus() == null) {
                    workgroupQueue2.setStatus(Status.CLOSED);
                } else {
                    workgroupQueue2.setStatus(queueOverview.getStatus());
                }
                workgroupQueue2.setAverageWaitTime(queueOverview.getAverageWaitTime());
                workgroupQueue2.setOldestEntry(queueOverview.getOldestEntry());
                fireQueueUsersEvent(workgroupQueue2, queueOverview.getStatus(), queueOverview.getAverageWaitTime(), queueOverview.getOldestEntry(), null);
                return;
            }
            String str = "http://jabber.org/protocol/workgroup";
            QueueDetails queueDetails = (QueueDetails) stanza.getExtension(QueueDetails.ELEMENT_NAME, str);
            if (queueDetails != null) {
                workgroupQueue2.setUsers(queueDetails.getUsers());
                fireQueueUsersEvent(workgroupQueue2, null, -1, null, queueDetails.getUsers());
                return;
            }
            DefaultExtensionElement defaultExtensionElement = (DefaultExtensionElement) presence.getExtension("notify-agents", str);
            if (defaultExtensionElement != null) {
                int parseInt = Integer.parseInt(defaultExtensionElement.getValue("current-chats"));
                int parseInt2 = Integer.parseInt(defaultExtensionElement.getValue("max-chats"));
                workgroupQueue2.setCurrentChats(parseInt);
                workgroupQueue2.setMaxChats(parseInt2);
            }
        } else if (stanza instanceof Message) {
            Message message = (Message) stanza;
            MUCUser mUCUser = (MUCUser) message.getExtension("x", MUCUser.NAMESPACE);
            Map map = null;
            Invite invite = mUCUser != null ? mUCUser.getInvite() : null;
            if (invite != null && this.workgroupJID.equals(invite.getFrom())) {
                String str2 = "http://jivesoftware.com/protocol/workgroup";
                SessionID sessionID = (SessionID) message.getExtension("session", str2);
                String sessionID2 = sessionID != null ? sessionID.getSessionID() : null;
                MetaData metaData2 = (MetaData) message.getExtension(MetaData.ELEMENT_NAME, str2);
                if (metaData2 != null) {
                    map = metaData2.getMetaData();
                }
                fireInvitationEvent(message.getFrom(), sessionID2, message.getBody(), message.getFrom(), map);
            }
        }
    }

    public void addInvitationListener(WorkgroupInvitationListener workgroupInvitationListener) {
        synchronized (this.invitationListeners) {
            if (!this.invitationListeners.contains(workgroupInvitationListener)) {
                this.invitationListeners.add(workgroupInvitationListener);
            }
        }
    }

    public void addOfferListener(OfferListener offerListener) {
        synchronized (this.offerListeners) {
            if (!this.offerListeners.contains(offerListener)) {
                this.offerListeners.add(offerListener);
            }
        }
    }

    public void addQueueUsersListener(QueueUsersListener queueUsersListener) {
        synchronized (this.queueUsersListeners) {
            if (!this.queueUsersListeners.contains(queueUsersListener)) {
                this.queueUsersListeners.add(queueUsersListener);
            }
        }
    }

    public void close() {
        this.connection.removeAsyncStanzaListener(this.packetListener);
    }

    public void dequeueUser(String str) throws XMPPException, NotConnectedException {
        this.connection.sendStanza(new DepartQueuePacket(this.workgroupJID));
    }

    public Agent getAgent() {
        return this.agent;
    }

    public AgentChatHistory getAgentHistory(String str, int i, Date date) throws XMPPException, NotConnectedException {
        AgentChatHistory agentChatHistory;
        if (date != null) {
            agentChatHistory = new AgentChatHistory(str, i, date);
        } else {
            agentChatHistory = new AgentChatHistory(str, i);
        }
        agentChatHistory.setType(Type.get);
        agentChatHistory.setTo(this.workgroupJID);
        return (AgentChatHistory) this.connection.createPacketCollectorAndSend(agentChatHistory).nextResult();
    }

    public AgentRoster getAgentRoster() throws NotConnectedException {
        if (this.agentRoster == null) {
            this.agentRoster = new AgentRoster(this.connection, this.workgroupJID);
        }
        int i = 0;
        while (!this.agentRoster.rosterInitialized && i <= 2000) {
            try {
                Thread.sleep(500);
            } catch (Exception unused) {
            }
            i += 500;
        }
        return this.agentRoster;
    }

    public Map<String, List<String>> getChatMetadata(String str) throws XMPPException, NotConnectedException {
        ChatMetadata chatMetadata = new ChatMetadata();
        chatMetadata.setType(Type.get);
        chatMetadata.setTo(this.workgroupJID);
        chatMetadata.setSessionID(str);
        return ((ChatMetadata) this.connection.createPacketCollectorAndSend(chatMetadata).nextResult()).getMetadata();
    }

    public GenericSettings getGenericSettings(XMPPConnection xMPPConnection, String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        GenericSettings genericSettings = new GenericSettings();
        genericSettings.setType(Type.get);
        genericSettings.setTo(this.workgroupJID);
        return (GenericSettings) this.connection.createPacketCollectorAndSend(genericSettings).nextResultOrThrow();
    }

    public MacroGroup getMacros(boolean z) throws NoResponseException, XMPPErrorException, NotConnectedException {
        Macros macros = new Macros();
        macros.setType(Type.get);
        macros.setTo(this.workgroupJID);
        macros.setPersonal(!z);
        return ((Macros) this.connection.createPacketCollectorAndSend(macros).nextResultOrThrow()).getRootGroup();
    }

    public int getMaxChats() {
        return this.maxChats;
    }

    public List<String> getMetaData(String str) {
        return (List) this.metaData.get(str);
    }

    public ChatNotes getNote(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        ChatNotes chatNotes = new ChatNotes();
        chatNotes.setType(Type.get);
        chatNotes.setTo(this.workgroupJID);
        chatNotes.setSessionID(str);
        return (ChatNotes) this.connection.createPacketCollectorAndSend(chatNotes).nextResultOrThrow();
    }

    public OccupantsInfo getOccupantsInfo(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        OccupantsInfo occupantsInfo = new OccupantsInfo(str);
        occupantsInfo.setType(Type.get);
        occupantsInfo.setTo(this.workgroupJID);
        return (OccupantsInfo) this.connection.createPacketCollectorAndSend(occupantsInfo).nextResultOrThrow();
    }

    public Mode getPresenceMode() {
        return this.presenceMode;
    }

    public WorkgroupQueue getQueue(String str) {
        return (WorkgroupQueue) this.queues.get(str);
    }

    public Iterator<WorkgroupQueue> getQueues() {
        return Collections.unmodifiableMap(new HashMap(this.queues)).values().iterator();
    }

    public SearchSettings getSearchSettings() throws NoResponseException, XMPPErrorException, NotConnectedException {
        SearchSettings searchSettings = new SearchSettings();
        searchSettings.setType(Type.get);
        searchSettings.setTo(this.workgroupJID);
        return (SearchSettings) this.connection.createPacketCollectorAndSend(searchSettings).nextResultOrThrow();
    }

    public Transcript getTranscript(String str) throws XMPPException, SmackException {
        return this.transcriptManager.getTranscript(this.workgroupJID, str);
    }

    public Form getTranscriptSearchForm() throws XMPPException, SmackException {
        return this.transcriptSearchManager.getSearchForm(C14055b.m60646f(this.workgroupJID));
    }

    public Transcripts getTranscripts(String str) throws XMPPException, SmackException {
        return this.transcriptManager.getTranscripts(this.workgroupJID, str);
    }

    public String getWorkgroupJID() {
        return this.workgroupJID;
    }

    public boolean hasMonitorPrivileges(XMPPConnection xMPPConnection) throws NoResponseException, XMPPErrorException, NotConnectedException {
        MonitorPacket monitorPacket = new MonitorPacket();
        monitorPacket.setType(Type.get);
        monitorPacket.setTo(this.workgroupJID);
        return ((MonitorPacket) this.connection.createPacketCollectorAndSend(monitorPacket).nextResultOrThrow()).isMonitor();
    }

    public boolean isOnline() {
        return this.online;
    }

    public void makeRoomOwner(XMPPConnection xMPPConnection, String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        MonitorPacket monitorPacket = new MonitorPacket();
        monitorPacket.setType(Type.set);
        monitorPacket.setTo(this.workgroupJID);
        monitorPacket.setSessionID(str);
        this.connection.createPacketCollectorAndSend(monitorPacket).nextResultOrThrow();
    }

    public void removeInvitationListener(WorkgroupInvitationListener workgroupInvitationListener) {
        synchronized (this.invitationListeners) {
            this.invitationListeners.remove(workgroupInvitationListener);
        }
    }

    public void removeMetaData(String str) throws XMPPException, SmackException {
        synchronized (this.metaData) {
            if (((List) this.metaData.remove(str)) != null) {
                setStatus(this.presenceMode, this.maxChats);
            }
        }
    }

    public void removeOfferListener(OfferListener offerListener) {
        synchronized (this.offerListeners) {
            this.offerListeners.remove(offerListener);
        }
    }

    public void removeQueueUsersListener(QueueUsersListener queueUsersListener) {
        synchronized (this.queueUsersListeners) {
            this.queueUsersListeners.remove(queueUsersListener);
        }
    }

    public void saveMacros(MacroGroup macroGroup) throws NoResponseException, XMPPErrorException, NotConnectedException {
        Macros macros = new Macros();
        macros.setType(Type.set);
        macros.setTo(this.workgroupJID);
        macros.setPersonal(true);
        macros.setPersonalMacroGroup(macroGroup);
        this.connection.createPacketCollectorAndSend(macros).nextResultOrThrow();
    }

    public ReportedData searchTranscripts(Form form) throws XMPPException, SmackException {
        return this.transcriptSearchManager.submitSearch(C14055b.m60646f(this.workgroupJID), form);
    }

    public void sendRoomInvitation(RoomInvitation.Type type, String str, String str2, String str3) throws NoResponseException, XMPPErrorException, NotConnectedException {
        RoomInvitationIQ roomInvitationIQ = new RoomInvitationIQ(new RoomInvitation(type, str, str2, str3));
        roomInvitationIQ.setType(Type.set);
        roomInvitationIQ.setTo(this.workgroupJID);
        roomInvitationIQ.setFrom(this.connection.getUser());
        this.connection.createPacketCollectorAndSend(roomInvitationIQ).nextResultOrThrow();
    }

    public void sendRoomTransfer(RoomTransfer.Type type, String str, String str2, String str3) throws NoResponseException, XMPPErrorException, NotConnectedException {
        RoomTransferIQ roomTransferIQ = new RoomTransferIQ(new RoomTransfer(type, str, str2, str3));
        roomTransferIQ.setType(Type.set);
        roomTransferIQ.setTo(this.workgroupJID);
        roomTransferIQ.setFrom(this.connection.getUser());
        this.connection.createPacketCollectorAndSend(roomTransferIQ).nextResultOrThrow();
    }

    public void setMetaData(String str, String str2) throws XMPPException, SmackException {
        synchronized (this.metaData) {
            List list = (List) this.metaData.get(str);
            if (list == null || !((String) list.get(0)).equals(str2)) {
                list.set(0, str2);
                setStatus(this.presenceMode, this.maxChats);
            }
        }
    }

    public void setNote(String str, String str2) throws NoResponseException, XMPPErrorException, NotConnectedException {
        ChatNotes chatNotes = new ChatNotes();
        chatNotes.setType(Type.set);
        chatNotes.setTo(this.workgroupJID);
        chatNotes.setSessionID(str);
        chatNotes.setNotes(str2);
        this.connection.createPacketCollectorAndSend(chatNotes).nextResultOrThrow();
    }

    public void setOnline(boolean z) throws XMPPException, SmackException {
        if (this.online != z) {
            String str = "http://jabber.org/protocol/workgroup";
            String str2 = AgentStatus.ELEMENT_NAME;
            if (z) {
                Presence presence = new Presence(Presence.Type.available);
                presence.setTo(this.workgroupJID);
                presence.addExtension(new DefaultExtensionElement(str2, str));
                Presence presence2 = (Presence) this.connection.createPacketCollectorAndSend(new AndFilter(new StanzaTypeFilter(Presence.class), FromMatchesFilter.create(this.workgroupJID)), presence).nextResultOrThrow();
                this.online = z;
            } else {
                this.online = z;
                Presence presence3 = new Presence(Presence.Type.unavailable);
                presence3.setTo(this.workgroupJID);
                presence3.addExtension(new DefaultExtensionElement(str2, str));
                this.connection.sendStanza(presence3);
            }
        }
    }

    public void setStatus(Mode mode, int i) throws XMPPException, SmackException {
        setStatus(mode, i, null);
    }

    public void setStatus(Mode mode, int i, String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        if (this.online) {
            if (mode == null) {
                mode = Mode.available;
            }
            this.presenceMode = mode;
            this.maxChats = i;
            Presence presence = new Presence(Presence.Type.available);
            presence.setMode(mode);
            presence.setTo(getWorkgroupJID());
            if (str != null) {
                presence.setStatus(str);
            }
            DefaultExtensionElement defaultExtensionElement = new DefaultExtensionElement(AgentStatus.ELEMENT_NAME, "http://jabber.org/protocol/workgroup");
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(i);
            defaultExtensionElement.setValue("max-chats", sb.toString());
            presence.addExtension(defaultExtensionElement);
            presence.addExtension(new MetaData(this.metaData));
            this.connection.createPacketCollectorAndSend(new AndFilter(new StanzaTypeFilter(Presence.class), FromMatchesFilter.create(this.workgroupJID)), presence).nextResultOrThrow();
            return;
        }
        throw new IllegalStateException("Cannot set status when the agent is not online.");
    }

    public void setStatus(Mode mode, String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        if (this.online) {
            if (mode == null) {
                mode = Mode.available;
            }
            this.presenceMode = mode;
            Presence presence = new Presence(Presence.Type.available);
            presence.setMode(mode);
            presence.setTo(getWorkgroupJID());
            if (str != null) {
                presence.setStatus(str);
            }
            presence.addExtension(new MetaData(this.metaData));
            this.connection.createPacketCollectorAndSend(new AndFilter(new StanzaTypeFilter(Presence.class), FromMatchesFilter.create(this.workgroupJID)), presence).nextResultOrThrow();
            return;
        }
        throw new IllegalStateException("Cannot set status when the agent is not online.");
    }
}
