package org.jivesoftware.smack.roster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.AbstractConnectionClosedListener;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.ExceptionCallback;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.SmackException.NotLoggedInException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Presence.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.roster.packet.RosterPacket;
import org.jivesoftware.smack.roster.packet.RosterPacket.Item;
import org.jivesoftware.smack.roster.packet.RosterPacket.ItemType;
import org.jivesoftware.smack.roster.packet.RosterVer;
import org.jivesoftware.smack.roster.rosterstore.RosterStore;
import org.jivesoftware.smack.util.Objects;
import p205i.p486d.p487a.C14055b;

public class Roster extends Manager {
    private static final Map<XMPPConnection, Roster> INSTANCES = new WeakHashMap();
    /* access modifiers changed from: private */
    public static final Logger LOGGER = Logger.getLogger(Roster.class.getName());
    private static final StanzaFilter PRESENCE_PACKET_FILTER = StanzaTypeFilter.PRESENCE;
    private static SubscriptionMode defaultSubscriptionMode = SubscriptionMode.accept_all;
    private static boolean rosterLoadedAtLoginDefault = true;
    /* access modifiers changed from: private */
    public final Map<String, RosterEntry> entries = new ConcurrentHashMap();
    private final Map<String, RosterGroup> groups = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public final Map<String, Map<String, Presence>> presenceMap = new ConcurrentHashMap();
    private final PresencePacketListener presencePacketListener = new PresencePacketListener();
    private final Set<RosterListener> rosterListeners = new LinkedHashSet();
    private final Object rosterListenersAndEntriesLock = new Object();
    /* access modifiers changed from: private */
    public boolean rosterLoadedAtLogin = rosterLoadedAtLoginDefault;
    /* access modifiers changed from: private */
    public final Set<RosterLoadedListener> rosterLoadedListeners = new LinkedHashSet();
    /* access modifiers changed from: private */
    public RosterState rosterState = RosterState.uninitialized;
    /* access modifiers changed from: private */
    public RosterStore rosterStore;
    /* access modifiers changed from: private */
    public SubscriptionMode subscriptionMode = getDefaultSubscriptionMode();
    private final Set<RosterEntry> unfiledEntries = new CopyOnWriteArraySet();

    /* renamed from: org.jivesoftware.smack.roster.Roster$4 */
    static /* synthetic */ class C156264 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$packet$Presence$Type = new int[Type.values().length];
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$roster$Roster$SubscriptionMode = new int[SubscriptionMode.values().length];

        /* renamed from: $SwitchMap$org$jivesoftware$smack$roster$packet$RosterPacket$ItemType */
        static final /* synthetic */ int[] f44986x69f76037 = new int[ItemType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008e */
        static {
            /*
                org.jivesoftware.smack.packet.Presence$Type[] r0 = org.jivesoftware.smack.packet.Presence.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jivesoftware$smack$packet$Presence$Type = r0
                r0 = 1
                int[] r1 = $SwitchMap$org$jivesoftware$smack$packet$Presence$Type     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.packet.Presence$Type r2 = org.jivesoftware.smack.packet.Presence.Type.available     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = $SwitchMap$org$jivesoftware$smack$packet$Presence$Type     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.packet.Presence$Type r3 = org.jivesoftware.smack.packet.Presence.Type.unavailable     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = $SwitchMap$org$jivesoftware$smack$packet$Presence$Type     // Catch:{ NoSuchFieldError -> 0x002a }
                org.jivesoftware.smack.packet.Presence$Type r4 = org.jivesoftware.smack.packet.Presence.Type.subscribe     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = $SwitchMap$org$jivesoftware$smack$packet$Presence$Type     // Catch:{ NoSuchFieldError -> 0x0035 }
                org.jivesoftware.smack.packet.Presence$Type r5 = org.jivesoftware.smack.packet.Presence.Type.unsubscribe     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r4 = $SwitchMap$org$jivesoftware$smack$packet$Presence$Type     // Catch:{ NoSuchFieldError -> 0x0040 }
                org.jivesoftware.smack.packet.Presence$Type r5 = org.jivesoftware.smack.packet.Presence.Type.error     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                org.jivesoftware.smack.roster.Roster$SubscriptionMode[] r4 = org.jivesoftware.smack.roster.Roster.SubscriptionMode.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$org$jivesoftware$smack$roster$Roster$SubscriptionMode = r4
                int[] r4 = $SwitchMap$org$jivesoftware$smack$roster$Roster$SubscriptionMode     // Catch:{ NoSuchFieldError -> 0x0053 }
                org.jivesoftware.smack.roster.Roster$SubscriptionMode r5 = org.jivesoftware.smack.roster.Roster.SubscriptionMode.accept_all     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r4 = $SwitchMap$org$jivesoftware$smack$roster$Roster$SubscriptionMode     // Catch:{ NoSuchFieldError -> 0x005d }
                org.jivesoftware.smack.roster.Roster$SubscriptionMode r5 = org.jivesoftware.smack.roster.Roster.SubscriptionMode.reject_all     // Catch:{ NoSuchFieldError -> 0x005d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                int[] r4 = $SwitchMap$org$jivesoftware$smack$roster$Roster$SubscriptionMode     // Catch:{ NoSuchFieldError -> 0x0067 }
                org.jivesoftware.smack.roster.Roster$SubscriptionMode r5 = org.jivesoftware.smack.roster.Roster.SubscriptionMode.manual     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                org.jivesoftware.smack.roster.packet.RosterPacket$ItemType[] r4 = org.jivesoftware.smack.roster.packet.RosterPacket.ItemType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f44986x69f76037 = r4
                int[] r4 = f44986x69f76037     // Catch:{ NoSuchFieldError -> 0x007a }
                org.jivesoftware.smack.roster.packet.RosterPacket$ItemType r5 = org.jivesoftware.smack.roster.packet.RosterPacket.ItemType.from     // Catch:{ NoSuchFieldError -> 0x007a }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f44986x69f76037     // Catch:{ NoSuchFieldError -> 0x0084 }
                org.jivesoftware.smack.roster.packet.RosterPacket$ItemType r4 = org.jivesoftware.smack.roster.packet.RosterPacket.ItemType.both     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f44986x69f76037     // Catch:{ NoSuchFieldError -> 0x008e }
                org.jivesoftware.smack.roster.packet.RosterPacket$ItemType r1 = org.jivesoftware.smack.roster.packet.RosterPacket.ItemType.none     // Catch:{ NoSuchFieldError -> 0x008e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                int[] r0 = f44986x69f76037     // Catch:{ NoSuchFieldError -> 0x0098 }
                org.jivesoftware.smack.roster.packet.RosterPacket$ItemType r1 = org.jivesoftware.smack.roster.packet.RosterPacket.ItemType.to     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.roster.Roster.C156264.<clinit>():void");
        }
    }

    private class PresencePacketListener implements StanzaListener {
        private PresencePacketListener() {
        }

        private Map<String, Presence> getUserPresences(String str) {
            Map<String, Presence> map = (Map) Roster.this.presenceMap.get(str);
            if (map != null) {
                return map;
            }
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            Roster.this.presenceMap.put(str, concurrentHashMap);
            return concurrentHashMap;
        }

        public void processPacket(Stanza stanza) throws NotConnectedException {
            if (Roster.this.rosterState == RosterState.loading) {
                try {
                    Roster.this.waitUntilLoaded();
                } catch (InterruptedException e) {
                    Roster.LOGGER.log(Level.INFO, "Presence listener was interrupted", e);
                }
            }
            if (!Roster.this.isLoaded() && Roster.this.rosterLoadedAtLogin) {
                Roster.LOGGER.warning("Roster not loaded while processing presence stanza");
            }
            XMPPConnection access$800 = Roster.this.connection();
            Presence presence = (Presence) stanza;
            String from = presence.getFrom();
            String access$900 = Roster.this.getMapKey(from);
            Presence presence2 = null;
            int i = C156264.$SwitchMap$org$jivesoftware$smack$packet$Presence$Type[presence.getType().ordinal()];
            String str = "";
            if (i == 1) {
                Map userPresences = getUserPresences(access$900);
                userPresences.remove(str);
                userPresences.put(C14055b.m60648h(from), presence);
                if (Roster.this.entries.containsKey(access$900)) {
                    Roster.this.fireRosterPresenceEvent(presence);
                }
            } else if (i == 2) {
                if (str.equals(C14055b.m60648h(from))) {
                    getUserPresences(access$900).put(str, presence);
                } else if (Roster.this.presenceMap.get(access$900) != null) {
                    ((Map) Roster.this.presenceMap.get(access$900)).put(C14055b.m60648h(from), presence);
                }
                if (Roster.this.entries.containsKey(access$900)) {
                    Roster.this.fireRosterPresenceEvent(presence);
                }
            } else if (i == 3) {
                int i2 = C156264.$SwitchMap$org$jivesoftware$smack$roster$Roster$SubscriptionMode[Roster.this.subscriptionMode.ordinal()];
                if (i2 == 1) {
                    presence2 = new Presence(Type.subscribed);
                } else if (i2 == 2) {
                    presence2 = new Presence(Type.unsubscribed);
                }
                if (presence2 != null) {
                    presence2.setTo(presence.getFrom());
                    access$800.sendStanza(presence2);
                }
            } else if (i != 4) {
                if (i == 5 && str.equals(C14055b.m60648h(from))) {
                    Map userPresences2 = getUserPresences(access$900);
                    userPresences2.clear();
                    userPresences2.put(str, presence);
                    if (Roster.this.entries.containsKey(access$900)) {
                        Roster.this.fireRosterPresenceEvent(presence);
                    }
                }
            } else if (Roster.this.subscriptionMode != SubscriptionMode.manual) {
                Presence presence3 = new Presence(Type.unsubscribed);
                presence3.setTo(presence.getFrom());
                access$800.sendStanza(presence3);
            }
        }
    }

    private class RosterPushListener extends AbstractIqRequestHandler {
        public C15617IQ handleIQRequest(C15617IQ iq) {
            XMPPConnection access$2100 = Roster.this.connection();
            RosterPacket rosterPacket = (RosterPacket) iq;
            String e = C14055b.m60645e(access$2100.getUser());
            String from = rosterPacket.getFrom();
            if (from == null || from.equals(e)) {
                List rosterItems = rosterPacket.getRosterItems();
                if (rosterItems.size() != 1) {
                    Logger access$200 = Roster.LOGGER;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Ignoring roster push with not exaclty one entry. size=");
                    sb.append(rosterItems.size());
                    access$200.warning(sb.toString());
                    return C15617IQ.createErrorResponse(iq, new XMPPError(Condition.bad_request));
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Item item = (Item) rosterItems.iterator().next();
                RosterEntry rosterEntry = new RosterEntry(item.getUser(), item.getName(), item.getItemType(), item.getItemStatus(), Roster.this, access$2100);
                String version = rosterPacket.getVersion();
                if (item.getItemType().equals(ItemType.remove)) {
                    Roster.this.deleteEntry(arrayList3, rosterEntry);
                    if (Roster.this.rosterStore != null) {
                        Roster.this.rosterStore.removeEntry(rosterEntry.getUser(), version);
                    }
                } else if (Roster.hasValidSubscriptionType(item)) {
                    Roster.this.addUpdateEntry(arrayList, arrayList2, arrayList4, item, rosterEntry);
                    if (Roster.this.rosterStore != null) {
                        Roster.this.rosterStore.addEntry(item, version);
                    }
                }
                Roster.this.removeEmptyGroups();
                Roster.this.fireRosterChangedEvent(arrayList, arrayList2, arrayList3);
                return C15617IQ.createResultIQ(rosterPacket);
            }
            Logger access$2002 = Roster.LOGGER;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ignoring roster push with a non matching 'from' ourJid='");
            sb2.append(e);
            sb2.append("' from='");
            sb2.append(from);
            sb2.append("'");
            access$2002.warning(sb2.toString());
            return C15617IQ.createErrorResponse(iq, new XMPPError(Condition.service_unavailable));
        }

        private RosterPushListener() {
            super("query", RosterPacket.NAMESPACE, C15617IQ.Type.set, Mode.sync);
        }
    }

    private class RosterResultListener implements StanzaListener {
        private RosterResultListener() {
        }

        public void processPacket(Stanza stanza) {
            Stanza stanza2 = stanza;
            XMPPConnection access$1300 = Roster.this.connection();
            Roster.LOGGER.fine("RosterResultListener received stanza");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (stanza2 instanceof RosterPacket) {
                RosterPacket rosterPacket = (RosterPacket) stanza2;
                ArrayList arrayList5 = new ArrayList();
                for (Item item : rosterPacket.getRosterItems()) {
                    if (Roster.hasValidSubscriptionType(item)) {
                        arrayList5.add(item);
                    }
                }
                Iterator it = arrayList5.iterator();
                while (it.hasNext()) {
                    Item item2 = (Item) it.next();
                    RosterEntry rosterEntry = new RosterEntry(item2.getUser(), item2.getName(), item2.getItemType(), item2.getItemStatus(), Roster.this, access$1300);
                    Roster.this.addUpdateEntry(arrayList, arrayList2, arrayList4, item2, rosterEntry);
                }
                HashSet<String> hashSet = new HashSet<>();
                for (RosterEntry user : Roster.this.entries.values()) {
                    hashSet.add(user.getUser());
                }
                hashSet.removeAll(arrayList);
                hashSet.removeAll(arrayList2);
                hashSet.removeAll(arrayList4);
                for (String str : hashSet) {
                    Roster roster = Roster.this;
                    roster.deleteEntry(arrayList3, (RosterEntry) roster.entries.get(str));
                }
                if (Roster.this.rosterStore != null) {
                    Roster.this.rosterStore.resetEntries(arrayList5, rosterPacket.getVersion());
                }
                Roster.this.removeEmptyGroups();
            } else {
                for (Item item3 : Roster.this.rosterStore.getEntries()) {
                    RosterEntry rosterEntry2 = new RosterEntry(item3.getUser(), item3.getName(), item3.getItemType(), item3.getItemStatus(), Roster.this, access$1300);
                    Roster.this.addUpdateEntry(arrayList, arrayList2, arrayList4, item3, rosterEntry2);
                }
            }
            Roster.this.rosterState = RosterState.loaded;
            synchronized (Roster.this) {
                Roster.this.notifyAll();
            }
            Roster.this.fireRosterChangedEvent(arrayList, arrayList2, arrayList3);
            try {
                synchronized (Roster.this.rosterLoadedListeners) {
                    for (RosterLoadedListener onRosterLoaded : Roster.this.rosterLoadedListeners) {
                        onRosterLoaded.onRosterLoaded(Roster.this);
                    }
                }
            } catch (Exception e) {
                Roster.LOGGER.log(Level.WARNING, "RosterLoadedListener threw exception", e);
            }
        }
    }

    private enum RosterState {
        uninitialized,
        loading,
        loaded
    }

    public enum SubscriptionMode {
        accept_all,
        reject_all,
        manual
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                Roster.getInstanceFor(xMPPConnection);
            }
        });
    }

    private Roster(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.registerIQRequestHandler(new RosterPushListener());
        xMPPConnection.addSyncStanzaListener(this.presencePacketListener, PRESENCE_PACKET_FILTER);
        xMPPConnection.addConnectionListener(new AbstractConnectionClosedListener() {
            public void authenticated(XMPPConnection xMPPConnection, boolean z) {
                if (!xMPPConnection.isAnonymous() && Roster.this.isRosterLoadedAtLogin() && !z) {
                    try {
                        Roster.this.reload();
                    } catch (SmackException e) {
                        Roster.LOGGER.log(Level.SEVERE, "Could not reload Roster", e);
                    }
                }
            }

            public void connectionTerminated() {
                Roster.this.setOfflinePresencesAndResetLoaded();
            }
        });
        if (xMPPConnection.isAuthenticated()) {
            try {
                reload();
            } catch (SmackException e) {
                LOGGER.log(Level.SEVERE, "Could not reload Roster", e);
            }
        }
    }

    /* access modifiers changed from: private */
    public void addUpdateEntry(Collection<String> collection, Collection<String> collection2, Collection<String> collection3, Item item, RosterEntry rosterEntry) {
        RosterEntry rosterEntry2;
        synchronized (this.rosterListenersAndEntriesLock) {
            rosterEntry2 = (RosterEntry) this.entries.put(item.getUser(), rosterEntry);
        }
        if (rosterEntry2 == null) {
            collection.add(item.getUser());
        } else {
            Item rosterItem = RosterEntry.toRosterItem(rosterEntry2);
            if (!rosterEntry2.equalsDeep(rosterEntry) || !item.getGroupNames().equals(rosterItem.getGroupNames())) {
                collection2.add(item.getUser());
            } else {
                collection3.add(item.getUser());
            }
        }
        if (item.getGroupNames().isEmpty()) {
            this.unfiledEntries.add(rosterEntry);
        } else {
            this.unfiledEntries.remove(rosterEntry);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : item.getGroupNames()) {
            arrayList.add(str);
            RosterGroup group = getGroup(str);
            if (group == null) {
                group = createGroup(str);
                this.groups.put(str, group);
            }
            group.addEntryLocal(rosterEntry);
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (RosterGroup name : getGroups()) {
            arrayList2.add(name.getName());
        }
        arrayList2.removeAll(arrayList);
        for (String str2 : arrayList2) {
            RosterGroup group2 = getGroup(str2);
            group2.removeEntryLocal(rosterEntry);
            if (group2.getEntryCount() == 0) {
                this.groups.remove(str2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void deleteEntry(Collection<String> collection, RosterEntry rosterEntry) {
        String user = rosterEntry.getUser();
        this.entries.remove(user);
        this.unfiledEntries.remove(rosterEntry);
        this.presenceMap.remove(C14055b.m60645e(user));
        collection.add(user);
        for (Entry entry : this.groups.entrySet()) {
            RosterGroup rosterGroup = (RosterGroup) entry.getValue();
            rosterGroup.removeEntryLocal(rosterEntry);
            if (rosterGroup.getEntryCount() == 0) {
                this.groups.remove(entry.getKey());
            }
        }
    }

    /* access modifiers changed from: private */
    public void fireRosterChangedEvent(Collection<String> collection, Collection<String> collection2, Collection<String> collection3) {
        synchronized (this.rosterListenersAndEntriesLock) {
            for (RosterListener rosterListener : this.rosterListeners) {
                if (!collection.isEmpty()) {
                    rosterListener.entriesAdded(collection);
                }
                if (!collection2.isEmpty()) {
                    rosterListener.entriesUpdated(collection2);
                }
                if (!collection3.isEmpty()) {
                    rosterListener.entriesDeleted(collection3);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void fireRosterPresenceEvent(Presence presence) {
        synchronized (this.rosterListenersAndEntriesLock) {
            for (RosterListener presenceChanged : this.rosterListeners) {
                presenceChanged.presenceChanged(presence);
            }
        }
    }

    public static SubscriptionMode getDefaultSubscriptionMode() {
        return defaultSubscriptionMode;
    }

    public static synchronized Roster getInstanceFor(XMPPConnection xMPPConnection) {
        Roster roster;
        synchronized (Roster.class) {
            roster = (Roster) INSTANCES.get(xMPPConnection);
            if (roster == null) {
                roster = new Roster(xMPPConnection);
                INSTANCES.put(xMPPConnection, roster);
            }
        }
        return roster;
    }

    /* access modifiers changed from: private */
    public String getMapKey(String str) {
        if (str == null) {
            return null;
        }
        if (this.entries.containsKey(str)) {
            return str;
        }
        return C14055b.m60645e(str).toLowerCase(Locale.US);
    }

    /* access modifiers changed from: private */
    public static boolean hasValidSubscriptionType(Item item) {
        int i = C156264.f44986x69f76037[item.getItemType().ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    /* access modifiers changed from: private */
    public void removeEmptyGroups() {
        for (RosterGroup rosterGroup : getGroups()) {
            if (rosterGroup.getEntryCount() == 0) {
                this.groups.remove(rosterGroup.getName());
            }
        }
    }

    public static void setDefaultSubscriptionMode(SubscriptionMode subscriptionMode2) {
        defaultSubscriptionMode = subscriptionMode2;
    }

    /* access modifiers changed from: private */
    public void setOfflinePresencesAndResetLoaded() {
        for (String str : this.presenceMap.keySet()) {
            Map map = (Map) this.presenceMap.get(str);
            if (map != null) {
                for (String str2 : map.keySet()) {
                    Presence presence = new Presence(Type.unavailable);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("/");
                    sb.append(str2);
                    presence.setFrom(sb.toString());
                    try {
                        this.presencePacketListener.processPacket(presence);
                    } catch (NotConnectedException e) {
                        throw new IllegalStateException("presencePakcetListener should never throw a NotConnectedException when processPacket is called with a presence of type unavailable", e);
                    }
                }
            }
        }
        this.rosterState = RosterState.uninitialized;
    }

    public boolean addRosterListener(RosterListener rosterListener) {
        boolean add;
        synchronized (this.rosterListenersAndEntriesLock) {
            add = this.rosterListeners.add(rosterListener);
        }
        return add;
    }

    public boolean addRosterLoadedListener(RosterLoadedListener rosterLoadedListener) {
        boolean add;
        synchronized (rosterLoadedListener) {
            add = this.rosterLoadedListeners.add(rosterLoadedListener);
        }
        return add;
    }

    public boolean contains(String str) {
        return getEntry(str) != null;
    }

    public void createEntry(String str, String str2, String[] strArr) throws NotLoggedInException, NoResponseException, XMPPErrorException, NotConnectedException {
        XMPPConnection connection = connection();
        if (!connection.isAuthenticated()) {
            throw new NotLoggedInException();
        } else if (!connection.isAnonymous()) {
            RosterPacket rosterPacket = new RosterPacket();
            rosterPacket.setType(C15617IQ.Type.set);
            Item item = new Item(str, str2);
            if (strArr != null) {
                for (String str3 : strArr) {
                    if (str3 != null && str3.trim().length() > 0) {
                        item.addGroupName(str3);
                    }
                }
            }
            rosterPacket.addRosterItem(item);
            connection.createPacketCollectorAndSend(rosterPacket).nextResultOrThrow();
            Presence presence = new Presence(Type.subscribe);
            presence.setTo(str);
            connection.sendStanza(presence);
        } else {
            throw new IllegalStateException("Anonymous users can't have a roster.");
        }
    }

    public RosterGroup createGroup(String str) {
        XMPPConnection connection = connection();
        if (connection.isAnonymous()) {
            throw new IllegalStateException("Anonymous users can't have a roster.");
        } else if (this.groups.containsKey(str)) {
            return (RosterGroup) this.groups.get(str);
        } else {
            RosterGroup rosterGroup = new RosterGroup(str, connection);
            this.groups.put(str, rosterGroup);
            return rosterGroup;
        }
    }

    public List<Presence> getAllPresences(String str) {
        Map map = (Map) this.presenceMap.get(getMapKey(str));
        if (map == null) {
            Presence presence = new Presence(Type.unavailable);
            presence.setFrom(str);
            return new ArrayList(Arrays.asList(new Presence[]{presence}));
        }
        ArrayList arrayList = new ArrayList(map.values().size());
        for (Presence clone : map.values()) {
            arrayList.add(clone.clone());
        }
        return arrayList;
    }

    public List<Presence> getAvailablePresences(String str) {
        List<Presence> allPresences = getAllPresences(str);
        ArrayList arrayList = new ArrayList(allPresences.size());
        for (Presence presence : allPresences) {
            if (presence.isAvailable()) {
                arrayList.add(presence);
            }
        }
        return arrayList;
    }

    public Set<RosterEntry> getEntries() {
        HashSet hashSet;
        synchronized (this.rosterListenersAndEntriesLock) {
            hashSet = new HashSet(this.entries.size());
            for (RosterEntry add : this.entries.values()) {
                hashSet.add(add);
            }
        }
        return hashSet;
    }

    public void getEntriesAndAddListener(RosterListener rosterListener, RosterEntries rosterEntries) {
        Objects.requireNonNull(rosterListener, "listener must not be null");
        Objects.requireNonNull(rosterEntries, "rosterEntries must not be null");
        synchronized (this.rosterListenersAndEntriesLock) {
            rosterEntries.rosterEntires(this.entries.values());
            addRosterListener(rosterListener);
        }
    }

    public RosterEntry getEntry(String str) {
        if (str == null) {
            return null;
        }
        return (RosterEntry) this.entries.get(getMapKey(str));
    }

    public int getEntryCount() {
        return getEntries().size();
    }

    public RosterGroup getGroup(String str) {
        return (RosterGroup) this.groups.get(str);
    }

    public int getGroupCount() {
        return this.groups.size();
    }

    public Collection<RosterGroup> getGroups() {
        return Collections.unmodifiableCollection(this.groups.values());
    }

    public Presence getPresence(String str) {
        Map map = (Map) this.presenceMap.get(getMapKey(C14055b.m60645e(str)));
        if (map == null) {
            Presence presence = new Presence(Type.unavailable);
            presence.setFrom(str);
            return presence;
        }
        Presence presence2 = null;
        Presence presence3 = null;
        for (String str2 : map.keySet()) {
            Presence presence4 = (Presence) map.get(str2);
            if (!presence4.isAvailable()) {
                presence3 = presence4;
            } else {
                if (presence2 != null && presence4.getPriority() <= presence2.getPriority()) {
                    if (presence4.getPriority() == presence2.getPriority()) {
                        Presence.Mode mode = presence4.getMode();
                        if (mode == null) {
                            mode = Presence.Mode.available;
                        }
                        Presence.Mode mode2 = presence2.getMode();
                        if (mode2 == null) {
                            mode2 = Presence.Mode.available;
                        }
                        if (mode.compareTo(mode2) >= 0) {
                        }
                    }
                }
                presence2 = presence4;
            }
        }
        if (presence2 != null) {
            return presence2.clone();
        }
        if (presence3 != null) {
            return presence3.clone();
        }
        Presence presence5 = new Presence(Type.unavailable);
        presence5.setFrom(str);
        return presence5;
    }

    public Presence getPresenceResource(String str) {
        String mapKey = getMapKey(str);
        String h = C14055b.m60648h(str);
        Map map = (Map) this.presenceMap.get(mapKey);
        if (map == null) {
            Presence presence = new Presence(Type.unavailable);
            presence.setFrom(str);
            return presence;
        }
        Presence presence2 = (Presence) map.get(h);
        if (presence2 != null) {
            return presence2.clone();
        }
        Presence presence3 = new Presence(Type.unavailable);
        presence3.setFrom(str);
        return presence3;
    }

    public List<Presence> getPresences(String str) {
        Map map = (Map) this.presenceMap.get(getMapKey(str));
        if (map == null) {
            Presence presence = new Presence(Type.unavailable);
            presence.setFrom(str);
            return Arrays.asList(new Presence[]{presence});
        }
        ArrayList arrayList = new ArrayList();
        Presence presence2 = null;
        for (Presence presence3 : map.values()) {
            if (presence3.isAvailable()) {
                arrayList.add(presence3.clone());
            } else {
                presence2 = presence3;
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        if (presence2 != null) {
            return Arrays.asList(new Presence[]{presence2.clone()});
        }
        Presence presence4 = new Presence(Type.unavailable);
        presence4.setFrom(str);
        return Arrays.asList(new Presence[]{presence4});
    }

    /* access modifiers changed from: 0000 */
    public RosterStore getRosterStore() {
        return this.rosterStore;
    }

    public SubscriptionMode getSubscriptionMode() {
        return this.subscriptionMode;
    }

    public Set<RosterEntry> getUnfiledEntries() {
        return Collections.unmodifiableSet(this.unfiledEntries);
    }

    public int getUnfiledEntryCount() {
        return this.unfiledEntries.size();
    }

    public boolean isLoaded() {
        return this.rosterState == RosterState.loaded;
    }

    public boolean isRosterLoadedAtLogin() {
        return this.rosterLoadedAtLogin;
    }

    public boolean isRosterVersioningSupported() {
        return connection().hasFeature(RosterVer.ELEMENT, RosterVer.NAMESPACE);
    }

    public boolean isSubscribedToMyPresence(String str) {
        if (connection().getServiceName().equals(str)) {
            return true;
        }
        RosterEntry entry = getEntry(str);
        if (entry == null) {
            return false;
        }
        int i = C156264.f44986x69f76037[entry.getType().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public void reload() throws NotLoggedInException, NotConnectedException {
        XMPPConnection connection = connection();
        if (!connection.isAuthenticated()) {
            throw new NotLoggedInException();
        } else if (!connection.isAnonymous()) {
            RosterPacket rosterPacket = new RosterPacket();
            if (this.rosterStore != null && isRosterVersioningSupported()) {
                rosterPacket.setVersion(this.rosterStore.getRosterVersion());
            }
            this.rosterState = RosterState.loading;
            connection.sendIqWithResponseCallback(rosterPacket, new RosterResultListener(), new ExceptionCallback() {
                public void processException(Exception exc) {
                    Roster.this.rosterState = RosterState.uninitialized;
                    Roster.LOGGER.log(Level.SEVERE, "Exception reloading roster", exc);
                }
            });
        } else {
            throw new IllegalStateException("Anonymous users can't have a roster.");
        }
    }

    public void reloadAndWait() throws NotLoggedInException, NotConnectedException, InterruptedException {
        reload();
        waitUntilLoaded();
    }

    public void removeEntry(RosterEntry rosterEntry) throws NotLoggedInException, NoResponseException, XMPPErrorException, NotConnectedException {
        XMPPConnection connection = connection();
        if (!connection.isAuthenticated()) {
            throw new NotLoggedInException();
        } else if (connection.isAnonymous()) {
            throw new IllegalStateException("Anonymous users can't have a roster.");
        } else if (this.entries.containsKey(rosterEntry.getUser())) {
            RosterPacket rosterPacket = new RosterPacket();
            rosterPacket.setType(C15617IQ.Type.set);
            Item rosterItem = RosterEntry.toRosterItem(rosterEntry);
            rosterItem.setItemType(ItemType.remove);
            rosterPacket.addRosterItem(rosterItem);
            connection.createPacketCollectorAndSend(rosterPacket).nextResultOrThrow();
        }
    }

    public boolean removeRosterListener(RosterListener rosterListener) {
        boolean remove;
        synchronized (this.rosterListenersAndEntriesLock) {
            remove = this.rosterListeners.remove(rosterListener);
        }
        return remove;
    }

    public boolean removeRosterLoadedListener(RosterLoadedListener rosterLoadedListener) {
        boolean remove;
        synchronized (rosterLoadedListener) {
            remove = this.rosterLoadedListeners.remove(rosterLoadedListener);
        }
        return remove;
    }

    public void setRosterLoadedAtLogin(boolean z) {
        this.rosterLoadedAtLogin = z;
    }

    public boolean setRosterStore(RosterStore rosterStore2) {
        this.rosterStore = rosterStore2;
        try {
            reload();
            return true;
        } catch (NotConnectedException | NotLoggedInException e) {
            LOGGER.log(Level.FINER, "Could not reload roster", e);
            return false;
        }
    }

    public void setSubscriptionMode(SubscriptionMode subscriptionMode2) {
        this.subscriptionMode = subscriptionMode2;
    }

    /* access modifiers changed from: protected */
    public boolean waitUntilLoaded() throws InterruptedException {
        long packetReplyTimeout = connection().getPacketReplyTimeout();
        long currentTimeMillis = System.currentTimeMillis();
        while (!isLoaded() && packetReplyTimeout > 0) {
            synchronized (this) {
                if (!isLoaded()) {
                    wait(packetReplyTimeout);
                }
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            packetReplyTimeout -= currentTimeMillis2 - currentTimeMillis;
            currentTimeMillis = currentTimeMillis2;
        }
        return isLoaded();
    }
}
