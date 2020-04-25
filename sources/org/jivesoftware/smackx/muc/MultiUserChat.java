package org.jivesoftware.smackx.muc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.PacketCollector;
import org.jivesoftware.smack.PresenceListener;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.chat.Chat;
import org.jivesoftware.smack.chat.ChatManager;
import org.jivesoftware.smack.chat.ChatMessageListener;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.FromMatchesFilter;
import org.jivesoftware.smack.filter.MessageTypeFilter;
import org.jivesoftware.smack.filter.MessageWithSubjectFilter;
import org.jivesoftware.smack.filter.NotFilter;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.filter.ToFilter;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Presence.Mode;
import org.jivesoftware.smack.packet.Presence.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo.Identity;
import org.jivesoftware.smackx.iqregister.packet.Registration;
import org.jivesoftware.smackx.muc.packet.Destroy;
import org.jivesoftware.smackx.muc.packet.MUCAdmin;
import org.jivesoftware.smackx.muc.packet.MUCInitialPresence;
import org.jivesoftware.smackx.muc.packet.MUCItem;
import org.jivesoftware.smackx.muc.packet.MUCOwner;
import org.jivesoftware.smackx.muc.packet.MUCUser;
import org.jivesoftware.smackx.muc.packet.MUCUser.Invite;
import org.jivesoftware.smackx.muc.packet.MUCUser.Status;
import org.jivesoftware.smackx.xdata.Form;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.packet.DataForm;

public class MultiUserChat {
    private static final Logger LOGGER = Logger.getLogger(MultiUserChat.class.getName());
    private final XMPPConnection connection;
    private final StanzaListener declinesListener;
    private final StanzaFilter fromRoomFilter;
    private final StanzaFilter fromRoomGroupchatFilter;
    private final Set<InvitationRejectionListener> invitationRejectionListeners = new CopyOnWriteArraySet();
    private boolean joined = false;
    private PacketCollector messageCollector;
    private final StanzaListener messageListener;
    /* access modifiers changed from: private */
    public final Set<MessageListener> messageListeners = new CopyOnWriteArraySet();
    private final MultiUserChatManager multiUserChatManager;
    /* access modifiers changed from: private */
    public String nickname = null;
    /* access modifiers changed from: private */
    public final Map<String, Presence> occupantsMap = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public final Set<ParticipantStatusListener> participantStatusListeners = new CopyOnWriteArraySet();
    private final StanzaListener presenceInterceptor;
    /* access modifiers changed from: private */
    public final Set<PresenceListener> presenceInterceptors = new CopyOnWriteArraySet();
    private final StanzaListener presenceListener;
    /* access modifiers changed from: private */
    public final Set<PresenceListener> presenceListeners = new CopyOnWriteArraySet();
    /* access modifiers changed from: private */
    public final String room;
    /* access modifiers changed from: private */
    public String subject;
    private final StanzaListener subjectListener;
    /* access modifiers changed from: private */
    public final Set<SubjectUpdatedListener> subjectUpdatedListeners = new CopyOnWriteArraySet();
    private final Set<UserStatusListener> userStatusListeners = new CopyOnWriteArraySet();

    /* renamed from: org.jivesoftware.smackx.muc.MultiUserChat$7 */
    static /* synthetic */ class C157007 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$packet$Presence$Type = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.jivesoftware.smack.packet.Presence$Type[] r0 = org.jivesoftware.smack.packet.Presence.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jivesoftware$smack$packet$Presence$Type = r0
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$Presence$Type     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.packet.Presence$Type r1 = org.jivesoftware.smack.packet.Presence.Type.available     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$Presence$Type     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.packet.Presence$Type r1 = org.jivesoftware.smack.packet.Presence.Type.unavailable     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.muc.MultiUserChat.C157007.<clinit>():void");
        }
    }

    MultiUserChat(XMPPConnection xMPPConnection, String str, MultiUserChatManager multiUserChatManager2) {
        this.connection = xMPPConnection;
        this.room = str.toLowerCase(Locale.US);
        this.multiUserChatManager = multiUserChatManager2;
        this.fromRoomFilter = FromMatchesFilter.create(str);
        this.fromRoomGroupchatFilter = new AndFilter(this.fromRoomFilter, MessageTypeFilter.GROUPCHAT);
        this.messageListener = new StanzaListener() {
            public void processPacket(Stanza stanza) throws NotConnectedException {
                Message message = (Message) stanza;
                for (MessageListener processMessage : MultiUserChat.this.messageListeners) {
                    processMessage.processMessage(message);
                }
            }
        };
        this.subjectListener = new StanzaListener() {
            public void processPacket(Stanza stanza) {
                Message message = (Message) stanza;
                MultiUserChat.this.subject = message.getSubject();
                for (SubjectUpdatedListener subjectUpdated : MultiUserChat.this.subjectUpdatedListeners) {
                    subjectUpdated.subjectUpdated(MultiUserChat.this.subject, message.getFrom());
                }
            }
        };
        this.presenceListener = new StanzaListener() {
            public void processPacket(Stanza stanza) {
                Presence presence = (Presence) stanza;
                String from = presence.getFrom();
                StringBuilder sb = new StringBuilder();
                sb.append(MultiUserChat.this.room);
                sb.append("/");
                sb.append(MultiUserChat.this.nickname);
                String sb2 = sb.toString();
                boolean equals = presence.getFrom().equals(sb2);
                int i = C157007.$SwitchMap$org$jivesoftware$smack$packet$Presence$Type[presence.getType().ordinal()];
                if (i == 1) {
                    Presence presence2 = (Presence) MultiUserChat.this.occupantsMap.put(from, presence);
                    if (presence2 != null) {
                        MUCUser from2 = MUCUser.from(presence2);
                        MUCAffiliation affiliation = from2.getItem().getAffiliation();
                        MUCRole role = from2.getItem().getRole();
                        MUCUser from3 = MUCUser.from(stanza);
                        MUCAffiliation affiliation2 = from3.getItem().getAffiliation();
                        MultiUserChat.this.checkRoleModifications(role, from3.getItem().getRole(), equals, from);
                        MultiUserChat.this.checkAffiliationModifications(affiliation, affiliation2, equals, from);
                    } else if (!equals) {
                        for (ParticipantStatusListener joined : MultiUserChat.this.participantStatusListeners) {
                            joined.joined(from);
                        }
                    }
                } else if (i == 2) {
                    MultiUserChat.this.occupantsMap.remove(from);
                    MUCUser from4 = MUCUser.from(stanza);
                    if (from4 != null && from4.hasStatus()) {
                        MultiUserChat.this.checkPresenceCode(from4.getStatus(), presence.getFrom().equals(sb2), from4, from);
                    } else if (!equals) {
                        for (ParticipantStatusListener left : MultiUserChat.this.participantStatusListeners) {
                            left.left(from);
                        }
                    }
                }
                for (PresenceListener processPresence : MultiUserChat.this.presenceListeners) {
                    processPresence.processPresence(presence);
                }
            }
        };
        this.declinesListener = new StanzaListener() {
            public void processPacket(Stanza stanza) {
                MUCUser from = MUCUser.from(stanza);
                if (from.getDecline() != null) {
                    MultiUserChat.this.fireInvitationRejectionListeners(from.getDecline().getFrom(), from.getDecline().getReason());
                }
            }
        };
        this.presenceInterceptor = new StanzaListener() {
            public void processPacket(Stanza stanza) {
                Presence presence = (Presence) stanza;
                for (PresenceListener processPresence : MultiUserChat.this.presenceInterceptors) {
                    processPresence.processPresence(presence);
                }
            }
        };
    }

    private void changeAffiliationByAdmin(String str, MUCAffiliation mUCAffiliation) throws NoResponseException, XMPPErrorException, NotConnectedException {
        changeAffiliationByAdmin(str, mUCAffiliation, null);
    }

    private void changeRole(String str, MUCRole mUCRole, String str2) throws NoResponseException, XMPPErrorException, NotConnectedException {
        MUCAdmin mUCAdmin = new MUCAdmin();
        mUCAdmin.setTo(this.room);
        mUCAdmin.setType(C15617IQ.Type.set);
        mUCAdmin.addItem(new MUCItem(mUCRole, str, str2));
        this.connection.createPacketCollectorAndSend(mUCAdmin).nextResultOrThrow();
    }

    /* access modifiers changed from: private */
    public void checkAffiliationModifications(MUCAffiliation mUCAffiliation, MUCAffiliation mUCAffiliation2, boolean z, String str) {
        String str2 = "owner";
        String str3 = "member";
        String str4 = "admin";
        if (!str2.equals(mUCAffiliation) || str2.equals(mUCAffiliation2)) {
            if (!str4.equals(mUCAffiliation) || str4.equals(mUCAffiliation2)) {
                if (str3.equals(mUCAffiliation) && !str3.equals(mUCAffiliation2)) {
                    if (z) {
                        for (UserStatusListener membershipRevoked : this.userStatusListeners) {
                            membershipRevoked.membershipRevoked();
                        }
                    } else {
                        for (ParticipantStatusListener membershipRevoked2 : this.participantStatusListeners) {
                            membershipRevoked2.membershipRevoked(str);
                        }
                    }
                }
            } else if (z) {
                for (UserStatusListener adminRevoked : this.userStatusListeners) {
                    adminRevoked.adminRevoked();
                }
            } else {
                for (ParticipantStatusListener adminRevoked2 : this.participantStatusListeners) {
                    adminRevoked2.adminRevoked(str);
                }
            }
        } else if (z) {
            for (UserStatusListener ownershipRevoked : this.userStatusListeners) {
                ownershipRevoked.ownershipRevoked();
            }
        } else {
            for (ParticipantStatusListener ownershipRevoked2 : this.participantStatusListeners) {
                ownershipRevoked2.ownershipRevoked(str);
            }
        }
        if (str2.equals(mUCAffiliation) || !str2.equals(mUCAffiliation2)) {
            if (str4.equals(mUCAffiliation) || !str4.equals(mUCAffiliation2)) {
                if (!str3.equals(mUCAffiliation) && str3.equals(mUCAffiliation2)) {
                    if (z) {
                        for (UserStatusListener membershipGranted : this.userStatusListeners) {
                            membershipGranted.membershipGranted();
                        }
                        return;
                    }
                    for (ParticipantStatusListener membershipGranted2 : this.participantStatusListeners) {
                        membershipGranted2.membershipGranted(str);
                    }
                }
            } else if (z) {
                for (UserStatusListener adminGranted : this.userStatusListeners) {
                    adminGranted.adminGranted();
                }
            } else {
                for (ParticipantStatusListener adminGranted2 : this.participantStatusListeners) {
                    adminGranted2.adminGranted(str);
                }
            }
        } else if (z) {
            for (UserStatusListener ownershipGranted : this.userStatusListeners) {
                ownershipGranted.ownershipGranted();
            }
        } else {
            for (ParticipantStatusListener ownershipGranted2 : this.participantStatusListeners) {
                ownershipGranted2.ownershipGranted(str);
            }
        }
    }

    /* access modifiers changed from: private */
    public void checkPresenceCode(Set<Status> set, boolean z, MUCUser mUCUser, String str) {
        if (set.contains(Status.KICKED_307)) {
            if (z) {
                this.joined = false;
                for (UserStatusListener kicked : this.userStatusListeners) {
                    kicked.kicked(mUCUser.getItem().getActor(), mUCUser.getItem().getReason());
                }
                this.occupantsMap.clear();
                this.nickname = null;
                userHasLeft();
            } else {
                for (ParticipantStatusListener kicked2 : this.participantStatusListeners) {
                    kicked2.kicked(str, mUCUser.getItem().getActor(), mUCUser.getItem().getReason());
                }
            }
        }
        if (set.contains(Status.BANNED_301)) {
            if (z) {
                this.joined = false;
                for (UserStatusListener banned : this.userStatusListeners) {
                    banned.banned(mUCUser.getItem().getActor(), mUCUser.getItem().getReason());
                }
                this.occupantsMap.clear();
                this.nickname = null;
                userHasLeft();
            } else {
                for (ParticipantStatusListener banned2 : this.participantStatusListeners) {
                    banned2.banned(str, mUCUser.getItem().getActor(), mUCUser.getItem().getReason());
                }
            }
        }
        if (set.contains(Status.REMOVED_AFFIL_CHANGE_321) && z) {
            this.joined = false;
            for (UserStatusListener membershipRevoked : this.userStatusListeners) {
                membershipRevoked.membershipRevoked();
            }
            this.occupantsMap.clear();
            this.nickname = null;
            userHasLeft();
        }
        if (set.contains(Status.NEW_NICKNAME_303)) {
            for (ParticipantStatusListener nicknameChanged : this.participantStatusListeners) {
                nicknameChanged.nicknameChanged(str, mUCUser.getItem().getNick());
            }
        }
    }

    /* access modifiers changed from: private */
    public void checkRoleModifications(MUCRole mUCRole, MUCRole mUCRole2, boolean z, String str) {
        String str2 = "visitor";
        String str3 = "participant";
        String str4 = "none";
        if ((str2.equals(mUCRole) || str4.equals(mUCRole)) && str3.equals(mUCRole2)) {
            if (z) {
                for (UserStatusListener voiceGranted : this.userStatusListeners) {
                    voiceGranted.voiceGranted();
                }
            } else {
                for (ParticipantStatusListener voiceGranted2 : this.participantStatusListeners) {
                    voiceGranted2.voiceGranted(str);
                }
            }
        } else if (str3.equals(mUCRole) && (str2.equals(mUCRole2) || str4.equals(mUCRole2))) {
            if (z) {
                for (UserStatusListener voiceRevoked : this.userStatusListeners) {
                    voiceRevoked.voiceRevoked();
                }
            } else {
                for (ParticipantStatusListener voiceRevoked2 : this.participantStatusListeners) {
                    voiceRevoked2.voiceRevoked(str);
                }
            }
        }
        String str5 = "moderator";
        if (!str5.equals(mUCRole) && str5.equals(mUCRole2)) {
            if (str2.equals(mUCRole) || str4.equals(mUCRole)) {
                if (z) {
                    for (UserStatusListener voiceGranted3 : this.userStatusListeners) {
                        voiceGranted3.voiceGranted();
                    }
                } else {
                    for (ParticipantStatusListener voiceGranted4 : this.participantStatusListeners) {
                        voiceGranted4.voiceGranted(str);
                    }
                }
            }
            if (z) {
                for (UserStatusListener moderatorGranted : this.userStatusListeners) {
                    moderatorGranted.moderatorGranted();
                }
                return;
            }
            for (ParticipantStatusListener moderatorGranted2 : this.participantStatusListeners) {
                moderatorGranted2.moderatorGranted(str);
            }
        } else if (str5.equals(mUCRole) && !str5.equals(mUCRole2)) {
            if (str2.equals(mUCRole2) || str4.equals(mUCRole2)) {
                if (z) {
                    for (UserStatusListener voiceRevoked3 : this.userStatusListeners) {
                        voiceRevoked3.voiceRevoked();
                    }
                } else {
                    for (ParticipantStatusListener voiceRevoked4 : this.participantStatusListeners) {
                        voiceRevoked4.voiceRevoked(str);
                    }
                }
            }
            if (z) {
                for (UserStatusListener moderatorRevoked : this.userStatusListeners) {
                    moderatorRevoked.moderatorRevoked();
                }
                return;
            }
            for (ParticipantStatusListener moderatorRevoked2 : this.participantStatusListeners) {
                moderatorRevoked2.moderatorRevoked(str);
            }
        }
    }

    private Presence enter(String str, String str2, DiscussionHistory discussionHistory, long j) throws NotConnectedException, NoResponseException, XMPPErrorException {
        StringUtils.requireNotNullOrEmpty(str, "Nickname must not be null or blank.");
        Presence presence = new Presence(Type.available);
        StringBuilder sb = new StringBuilder();
        sb.append(this.room);
        String str3 = "/";
        sb.append(str3);
        sb.append(str);
        presence.setTo(sb.toString());
        MUCInitialPresence mUCInitialPresence = new MUCInitialPresence();
        if (str2 != null) {
            mUCInitialPresence.setPassword(str2);
        }
        if (discussionHistory != null) {
            mUCInitialPresence.setHistory(discussionHistory.getMUCHistory());
        }
        presence.addExtension(mUCInitialPresence);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.room);
        sb2.append(str3);
        sb2.append(str);
        AndFilter andFilter = new AndFilter(FromMatchesFilter.createFull(sb2.toString()), new StanzaTypeFilter(Presence.class));
        this.connection.addSyncStanzaListener(this.messageListener, this.fromRoomGroupchatFilter);
        this.connection.addSyncStanzaListener(this.presenceListener, new AndFilter(this.fromRoomFilter, StanzaTypeFilter.PRESENCE));
        this.connection.addSyncStanzaListener(this.subjectListener, new AndFilter(this.fromRoomFilter, MessageWithSubjectFilter.INSTANCE));
        this.connection.addSyncStanzaListener(this.declinesListener, new AndFilter(new StanzaExtensionFilter("x", MUCUser.NAMESPACE), new NotFilter(MessageTypeFilter.ERROR)));
        this.connection.addPacketInterceptor(this.presenceInterceptor, new AndFilter(new ToFilter(this.room), StanzaTypeFilter.PRESENCE));
        this.messageCollector = this.connection.createPacketCollector(this.fromRoomGroupchatFilter);
        try {
            Presence presence2 = (Presence) this.connection.createPacketCollectorAndSend(andFilter, presence).nextResultOrThrow(j);
            this.nickname = str;
            this.joined = true;
            this.multiUserChatManager.addJoinedRoom(this.room);
            return presence2;
        } catch (NoResponseException | XMPPErrorException e) {
            removeConnectionCallbacks();
            throw e;
        }
    }

    /* access modifiers changed from: private */
    public void fireInvitationRejectionListeners(String str, String str2) {
        InvitationRejectionListener[] invitationRejectionListenerArr;
        synchronized (this.invitationRejectionListeners) {
            invitationRejectionListenerArr = new InvitationRejectionListener[this.invitationRejectionListeners.size()];
            this.invitationRejectionListeners.toArray(invitationRejectionListenerArr);
        }
        for (InvitationRejectionListener invitationDeclined : invitationRejectionListenerArr) {
            invitationDeclined.invitationDeclined(str, str2);
        }
    }

    private List<Affiliate> getAffiliatesByAdmin(MUCAffiliation mUCAffiliation) throws NoResponseException, XMPPErrorException, NotConnectedException {
        MUCAdmin mUCAdmin = new MUCAdmin();
        mUCAdmin.setTo(this.room);
        mUCAdmin.setType(C15617IQ.Type.get);
        mUCAdmin.addItem(new MUCItem(mUCAffiliation));
        MUCAdmin mUCAdmin2 = (MUCAdmin) this.connection.createPacketCollectorAndSend(mUCAdmin).nextResultOrThrow();
        ArrayList arrayList = new ArrayList();
        for (MUCItem affiliate : mUCAdmin2.getItems()) {
            arrayList.add(new Affiliate(affiliate));
        }
        return arrayList;
    }

    private void removeConnectionCallbacks() {
        this.connection.removeSyncStanzaListener(this.messageListener);
        this.connection.removeSyncStanzaListener(this.presenceListener);
        this.connection.removeSyncStanzaListener(this.declinesListener);
        this.connection.removePacketInterceptor(this.presenceInterceptor);
        PacketCollector packetCollector = this.messageCollector;
        if (packetCollector != null) {
            packetCollector.cancel();
            this.messageCollector = null;
        }
    }

    private synchronized void userHasLeft() {
        this.multiUserChatManager.removeJoinedRoom(this.room);
        removeConnectionCallbacks();
    }

    public boolean addInvitationRejectionListener(InvitationRejectionListener invitationRejectionListener) {
        return this.invitationRejectionListeners.add(invitationRejectionListener);
    }

    public boolean addMessageListener(MessageListener messageListener2) {
        return this.messageListeners.add(messageListener2);
    }

    public boolean addParticipantListener(PresenceListener presenceListener2) {
        return this.presenceListeners.add(presenceListener2);
    }

    public boolean addParticipantStatusListener(ParticipantStatusListener participantStatusListener) {
        return this.participantStatusListeners.add(participantStatusListener);
    }

    public void addPresenceInterceptor(PresenceListener presenceListener2) {
        this.presenceInterceptors.add(presenceListener2);
    }

    public boolean addSubjectUpdatedListener(SubjectUpdatedListener subjectUpdatedListener) {
        return this.subjectUpdatedListeners.add(subjectUpdatedListener);
    }

    public boolean addUserStatusListener(UserStatusListener userStatusListener) {
        return this.userStatusListeners.add(userStatusListener);
    }

    public void banUser(String str, String str2) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeAffiliationByAdmin(str, MUCAffiliation.outcast, str2);
    }

    public void banUsers(Collection<String> collection) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeAffiliationByAdmin(collection, MUCAffiliation.outcast);
    }

    public void changeAvailabilityStatus(String str, Mode mode) throws NotConnectedException {
        StringUtils.requireNotNullOrEmpty(this.nickname, "Nickname must not be null or blank.");
        if (this.joined) {
            Presence presence = new Presence(Type.available);
            presence.setStatus(str);
            presence.setMode(mode);
            StringBuilder sb = new StringBuilder();
            sb.append(this.room);
            sb.append("/");
            sb.append(this.nickname);
            presence.setTo(sb.toString());
            this.connection.sendStanza(presence);
            return;
        }
        throw new IllegalStateException("Must be logged into the room to change the availability status.");
    }

    public void changeNickname(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        StringUtils.requireNotNullOrEmpty(str, "Nickname must not be null or blank.");
        if (this.joined) {
            Presence presence = new Presence(Type.available);
            StringBuilder sb = new StringBuilder();
            sb.append(this.room);
            String str2 = "/";
            sb.append(str2);
            sb.append(str);
            presence.setTo(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.room);
            sb2.append(str2);
            sb2.append(str);
            this.connection.createPacketCollectorAndSend(new AndFilter(FromMatchesFilter.createFull(sb2.toString()), new StanzaTypeFilter(Presence.class)), presence).nextResultOrThrow();
            this.nickname = str;
            return;
        }
        throw new IllegalStateException("Must be logged into the room to change nickname.");
    }

    public void changeSubject(final String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        Message createMessage = createMessage();
        createMessage.setSubject(str);
        this.connection.createPacketCollectorAndSend(new AndFilter(this.fromRoomGroupchatFilter, new StanzaFilter() {
            public boolean accept(Stanza stanza) {
                return str.equals(((Message) stanza).getSubject());
            }
        }), createMessage).nextResultOrThrow();
    }

    public synchronized void create(String str) throws NoResponseException, XMPPErrorException, SmackException {
        if (this.joined) {
            throw new IllegalStateException("Creation failed - User already joined the room.");
        } else if (!createOrJoin(str)) {
            leave();
            throw new SmackException("Creation failed - Missing acknowledge of room creation.");
        }
    }

    public Message createMessage() {
        return new Message(this.room, Message.Type.groupchat);
    }

    public synchronized boolean createOrJoin(String str) throws NoResponseException, XMPPErrorException, SmackException {
        return createOrJoin(str, null, null, this.connection.getPacketReplyTimeout());
    }

    public Chat createPrivateChat(String str, ChatMessageListener chatMessageListener) {
        return ChatManager.getInstanceFor(this.connection).createChat(str, chatMessageListener);
    }

    public void destroy(String str, String str2) throws NoResponseException, XMPPErrorException, NotConnectedException {
        MUCOwner mUCOwner = new MUCOwner();
        mUCOwner.setTo(this.room);
        mUCOwner.setType(C15617IQ.Type.set);
        Destroy destroy = new Destroy();
        destroy.setReason(str);
        destroy.setJid(str2);
        mUCOwner.setDestroy(destroy);
        this.connection.createPacketCollectorAndSend(mUCOwner).nextResultOrThrow();
        this.occupantsMap.clear();
        this.nickname = null;
        this.joined = false;
        userHasLeft();
    }

    public List<Affiliate> getAdmins() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return getAffiliatesByAdmin(MUCAffiliation.admin);
    }

    public Form getConfigurationForm() throws NoResponseException, XMPPErrorException, NotConnectedException {
        MUCOwner mUCOwner = new MUCOwner();
        mUCOwner.setTo(this.room);
        mUCOwner.setType(C15617IQ.Type.get);
        return Form.getFormFrom((C15617IQ) this.connection.createPacketCollectorAndSend(mUCOwner).nextResultOrThrow());
    }

    public List<Affiliate> getMembers() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return getAffiliatesByAdmin(MUCAffiliation.member);
    }

    public List<Occupant> getModerators() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return getOccupants(MUCRole.moderator);
    }

    public String getNickname() {
        return this.nickname;
    }

    public Occupant getOccupant(String str) {
        Presence presence = (Presence) this.occupantsMap.get(str);
        if (presence != null) {
            return new Occupant(presence);
        }
        return null;
    }

    public Presence getOccupantPresence(String str) {
        return (Presence) this.occupantsMap.get(str);
    }

    public List<String> getOccupants() {
        return Collections.unmodifiableList(new ArrayList(this.occupantsMap.keySet()));
    }

    public int getOccupantsCount() {
        return this.occupantsMap.size();
    }

    public List<Affiliate> getOutcasts() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return getAffiliatesByAdmin(MUCAffiliation.outcast);
    }

    public List<Affiliate> getOwners() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return getAffiliatesByAdmin(MUCAffiliation.owner);
    }

    public List<Occupant> getParticipants() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return getOccupants(MUCRole.participant);
    }

    public Form getRegistrationForm() throws NoResponseException, XMPPErrorException, NotConnectedException {
        Registration registration = new Registration();
        registration.setType(C15617IQ.Type.get);
        registration.setTo(this.room);
        return Form.getFormFrom((C15617IQ) this.connection.createPacketCollectorAndSend(registration).nextResultOrThrow());
    }

    public String getReservedNickname() throws SmackException {
        try {
            Iterator it = ServiceDiscoveryManager.getInstanceFor(this.connection).discoverInfo(this.room, "x-roomuser-item").getIdentities().iterator();
            if (it.hasNext()) {
                return ((Identity) it.next()).getName();
            }
        } catch (XMPPException e) {
            LOGGER.log(Level.SEVERE, "Error retrieving room nickname", e);
        }
        return null;
    }

    public String getRoom() {
        return this.room;
    }

    public String getSubject() {
        return this.subject;
    }

    public void grantAdmin(Collection<String> collection) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeAffiliationByAdmin(collection, MUCAffiliation.admin);
    }

    public void grantMembership(Collection<String> collection) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeAffiliationByAdmin(collection, MUCAffiliation.member);
    }

    public void grantModerator(Collection<String> collection) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeRole(collection, MUCRole.moderator);
    }

    public void grantOwnership(Collection<String> collection) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeAffiliationByAdmin(collection, MUCAffiliation.owner);
    }

    public void grantVoice(Collection<String> collection) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeRole(collection, MUCRole.participant);
    }

    public void invite(String str, String str2) throws NotConnectedException {
        invite(new Message(), str, str2);
    }

    public boolean isJoined() {
        return this.joined;
    }

    public void join(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        join(str, null, null, this.connection.getPacketReplyTimeout());
    }

    public void kickParticipant(String str, String str2) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeRole(str, MUCRole.none, str2);
    }

    public synchronized void leave() throws NotConnectedException {
        if (this.joined) {
            Presence presence = new Presence(Type.unavailable);
            StringBuilder sb = new StringBuilder();
            sb.append(this.room);
            sb.append("/");
            sb.append(this.nickname);
            presence.setTo(sb.toString());
            this.connection.sendStanza(presence);
            this.occupantsMap.clear();
            this.nickname = null;
            this.joined = false;
            userHasLeft();
        }
    }

    public Message nextMessage() throws MUCNotJoinedException {
        PacketCollector packetCollector = this.messageCollector;
        if (packetCollector != null) {
            return (Message) packetCollector.nextResult();
        }
        throw new MUCNotJoinedException(this);
    }

    public Message pollMessage() throws MUCNotJoinedException {
        PacketCollector packetCollector = this.messageCollector;
        if (packetCollector != null) {
            return (Message) packetCollector.pollResult();
        }
        throw new MUCNotJoinedException(this);
    }

    public boolean removeInvitationRejectionListener(InvitationRejectionListener invitationRejectionListener) {
        return this.invitationRejectionListeners.remove(invitationRejectionListener);
    }

    public boolean removeMessageListener(MessageListener messageListener2) {
        return this.messageListeners.remove(messageListener2);
    }

    public boolean removeParticipantListener(PresenceListener presenceListener2) {
        return this.presenceListeners.remove(presenceListener2);
    }

    public boolean removeParticipantStatusListener(ParticipantStatusListener participantStatusListener) {
        return this.participantStatusListeners.remove(participantStatusListener);
    }

    public void removePresenceInterceptor(StanzaListener stanzaListener) {
        this.presenceInterceptors.remove(stanzaListener);
    }

    public boolean removeSubjectUpdatedListener(SubjectUpdatedListener subjectUpdatedListener) {
        return this.subjectUpdatedListeners.remove(subjectUpdatedListener);
    }

    public boolean removeUserStatusListener(UserStatusListener userStatusListener) {
        return this.userStatusListeners.remove(userStatusListener);
    }

    public void requestVoice() throws NotConnectedException {
        DataForm dataForm = new DataForm(DataForm.Type.submit);
        FormField formField = new FormField(FormField.FORM_TYPE);
        formField.addValue("http://jabber.org/protocol/muc#request");
        dataForm.addField(formField);
        FormField formField2 = new FormField("muc#role");
        formField2.setType(FormField.Type.text_single);
        formField2.setLabel("Requested role");
        formField2.addValue("participant");
        dataForm.addField(formField2);
        Message message = new Message(this.room);
        message.addExtension(dataForm);
        this.connection.sendStanza(message);
    }

    public void revokeAdmin(Collection<String> collection) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeAffiliationByAdmin(collection, MUCAffiliation.admin);
    }

    public void revokeMembership(Collection<String> collection) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeAffiliationByAdmin(collection, MUCAffiliation.none);
    }

    public void revokeModerator(Collection<String> collection) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeRole(collection, MUCRole.participant);
    }

    public void revokeOwnership(Collection<String> collection) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeAffiliationByAdmin(collection, MUCAffiliation.admin);
    }

    public void revokeVoice(Collection<String> collection) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeRole(collection, MUCRole.visitor);
    }

    public void sendConfigurationForm(Form form) throws NoResponseException, XMPPErrorException, NotConnectedException {
        MUCOwner mUCOwner = new MUCOwner();
        mUCOwner.setTo(this.room);
        mUCOwner.setType(C15617IQ.Type.set);
        mUCOwner.addExtension(form.getDataFormToSend());
        this.connection.createPacketCollectorAndSend(mUCOwner).nextResultOrThrow();
    }

    public void sendMessage(String str) throws NotConnectedException {
        Message createMessage = createMessage();
        createMessage.setBody(str);
        this.connection.sendStanza(createMessage);
    }

    public void sendRegistrationForm(Form form) throws NoResponseException, XMPPErrorException, NotConnectedException {
        Registration registration = new Registration();
        registration.setType(C15617IQ.Type.set);
        registration.setTo(this.room);
        registration.addExtension(form.getDataFormToSend());
        this.connection.createPacketCollectorAndSend(registration).nextResultOrThrow();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MUC: ");
        sb.append(this.room);
        sb.append("(");
        sb.append(this.connection.getUser());
        sb.append(")");
        return sb.toString();
    }

    private void changeAffiliationByAdmin(String str, MUCAffiliation mUCAffiliation, String str2) throws NoResponseException, XMPPErrorException, NotConnectedException {
        MUCAdmin mUCAdmin = new MUCAdmin();
        mUCAdmin.setTo(this.room);
        mUCAdmin.setType(C15617IQ.Type.set);
        mUCAdmin.addItem(new MUCItem(mUCAffiliation, str, str2));
        this.connection.createPacketCollectorAndSend(mUCAdmin).nextResultOrThrow();
    }

    private List<Occupant> getOccupants(MUCRole mUCRole) throws NoResponseException, XMPPErrorException, NotConnectedException {
        MUCAdmin mUCAdmin = new MUCAdmin();
        mUCAdmin.setTo(this.room);
        mUCAdmin.setType(C15617IQ.Type.get);
        mUCAdmin.addItem(new MUCItem(mUCRole));
        MUCAdmin mUCAdmin2 = (MUCAdmin) this.connection.createPacketCollectorAndSend(mUCAdmin).nextResultOrThrow();
        ArrayList arrayList = new ArrayList();
        for (MUCItem occupant : mUCAdmin2.getItems()) {
            arrayList.add(new Occupant(occupant));
        }
        return arrayList;
    }

    public synchronized boolean createOrJoin(String str, String str2, DiscussionHistory discussionHistory, long j) throws NoResponseException, XMPPErrorException, SmackException {
        if (!this.joined) {
            MUCUser from = MUCUser.from(enter(str, str2, discussionHistory, j));
            if (from == null || !from.getStatus().contains(Status.ROOM_CREATED_201)) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("Creation failed - User already joined the room.");
    }

    public void grantAdmin(String str) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeAffiliationByAdmin(str, MUCAffiliation.admin);
    }

    public void grantMembership(String str) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeAffiliationByAdmin(str, MUCAffiliation.member, null);
    }

    public void grantModerator(String str) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeRole(str, MUCRole.moderator, null);
    }

    public void grantOwnership(String str) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeAffiliationByAdmin(str, MUCAffiliation.owner, null);
    }

    public void grantVoice(String str) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeRole(str, MUCRole.participant, null);
    }

    public void invite(Message message, String str, String str2) throws NotConnectedException {
        message.setTo(this.room);
        MUCUser mUCUser = new MUCUser();
        Invite invite = new Invite();
        invite.setTo(str);
        invite.setReason(str2);
        mUCUser.setInvite(invite);
        message.addExtension(mUCUser);
        this.connection.sendStanza(message);
    }

    public void join(String str, String str2) throws XMPPErrorException, SmackException {
        join(str, str2, null, this.connection.getPacketReplyTimeout());
    }

    public void revokeAdmin(String str) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeAffiliationByAdmin(str, MUCAffiliation.member);
    }

    public void revokeMembership(String str) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeAffiliationByAdmin(str, MUCAffiliation.none, null);
    }

    public void revokeModerator(String str) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeRole(str, MUCRole.participant, null);
    }

    public void revokeOwnership(String str) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeAffiliationByAdmin(str, MUCAffiliation.admin, null);
    }

    public void revokeVoice(String str) throws XMPPErrorException, NoResponseException, NotConnectedException {
        changeRole(str, MUCRole.visitor, null);
    }

    public synchronized void join(String str, String str2, DiscussionHistory discussionHistory, long j) throws XMPPErrorException, NoResponseException, NotConnectedException {
        if (this.joined) {
            leave();
        }
        enter(str, str2, discussionHistory, j);
    }

    public Message nextMessage(long j) throws MUCNotJoinedException {
        PacketCollector packetCollector = this.messageCollector;
        if (packetCollector != null) {
            return (Message) packetCollector.nextResult(j);
        }
        throw new MUCNotJoinedException(this);
    }

    public void sendMessage(Message message) throws NotConnectedException {
        message.setTo(this.room);
        message.setType(Message.Type.groupchat);
        this.connection.sendStanza(message);
    }

    private void changeRole(Collection<String> collection, MUCRole mUCRole) throws NoResponseException, XMPPErrorException, NotConnectedException {
        MUCAdmin mUCAdmin = new MUCAdmin();
        mUCAdmin.setTo(this.room);
        mUCAdmin.setType(C15617IQ.Type.set);
        for (String mUCItem : collection) {
            mUCAdmin.addItem(new MUCItem(mUCRole, mUCItem));
        }
        this.connection.createPacketCollectorAndSend(mUCAdmin).nextResultOrThrow();
    }

    private void changeAffiliationByAdmin(Collection<String> collection, MUCAffiliation mUCAffiliation) throws NoResponseException, XMPPErrorException, NotConnectedException {
        MUCAdmin mUCAdmin = new MUCAdmin();
        mUCAdmin.setTo(this.room);
        mUCAdmin.setType(C15617IQ.Type.set);
        for (String mUCItem : collection) {
            mUCAdmin.addItem(new MUCItem(mUCAffiliation, mUCItem));
        }
        this.connection.createPacketCollectorAndSend(mUCAdmin).nextResultOrThrow();
    }
}
