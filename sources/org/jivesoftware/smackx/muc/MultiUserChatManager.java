package org.jivesoftware.smackx.muc;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.MessageTypeFilter;
import org.jivesoftware.smack.filter.NotFilter;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.disco.AbstractNodeInformationProvider;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;
import org.jivesoftware.smackx.muc.packet.MUCInitialPresence;
import org.jivesoftware.smackx.muc.packet.MUCUser;
import org.jivesoftware.smackx.muc.packet.MUCUser.Decline;

public class MultiUserChatManager extends Manager {
    private static final String DISCO_NODE = "http://jabber.org/protocol/muc#rooms";
    private static final Map<XMPPConnection, MultiUserChatManager> INSTANCES = new WeakHashMap();
    private static final StanzaFilter INVITATION_FILTER = new AndFilter(StanzaTypeFilter.MESSAGE, new StanzaExtensionFilter((ExtensionElement) new MUCUser()), new NotFilter(MessageTypeFilter.ERROR));
    /* access modifiers changed from: private */
    public final Set<InvitationListener> invitationsListeners = new CopyOnWriteArraySet();
    private final Set<String> joinedRooms = new HashSet();
    private final Map<String, WeakReference<MultiUserChat>> multiUserChats = new HashMap();

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature(MUCInitialPresence.NAMESPACE);
                final WeakReference weakReference = new WeakReference(xMPPConnection);
                ServiceDiscoveryManager.getInstanceFor(xMPPConnection).setNodeInformationProvider(MultiUserChatManager.DISCO_NODE, new AbstractNodeInformationProvider() {
                    public List<Item> getNodeItems() {
                        XMPPConnection xMPPConnection = (XMPPConnection) weakReference.get();
                        if (xMPPConnection == null) {
                            return Collections.emptyList();
                        }
                        Set<String> joinedRooms = MultiUserChatManager.getInstanceFor(xMPPConnection).getJoinedRooms();
                        ArrayList arrayList = new ArrayList();
                        for (String item : joinedRooms) {
                            arrayList.add(new Item(item));
                        }
                        return arrayList;
                    }
                });
            }
        });
    }

    private MultiUserChatManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.addAsyncStanzaListener(new StanzaListener() {
            public void processPacket(Stanza stanza) {
                Message message = (Message) stanza;
                MUCUser from = MUCUser.from(message);
                if (from.getInvite() != null) {
                    MultiUserChat multiUserChat = MultiUserChatManager.this.getMultiUserChat(stanza.getFrom());
                    for (InvitationListener invitationReceived : MultiUserChatManager.this.invitationsListeners) {
                        invitationReceived.invitationReceived(MultiUserChatManager.this.connection(), multiUserChat, from.getInvite().getFrom(), from.getInvite().getReason(), from.getPassword(), message);
                    }
                }
            }
        }, INVITATION_FILTER);
    }

    private MultiUserChat createNewMucAndAddToMap(String str) {
        MultiUserChat multiUserChat = new MultiUserChat(connection(), str, this);
        this.multiUserChats.put(str, new WeakReference(multiUserChat));
        return multiUserChat;
    }

    public static synchronized MultiUserChatManager getInstanceFor(XMPPConnection xMPPConnection) {
        MultiUserChatManager multiUserChatManager;
        synchronized (MultiUserChatManager.class) {
            multiUserChatManager = (MultiUserChatManager) INSTANCES.get(xMPPConnection);
            if (multiUserChatManager == null) {
                multiUserChatManager = new MultiUserChatManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, multiUserChatManager);
            }
        }
        return multiUserChatManager;
    }

    public void addInvitationListener(InvitationListener invitationListener) {
        this.invitationsListeners.add(invitationListener);
    }

    /* access modifiers changed from: 0000 */
    public void addJoinedRoom(String str) {
        this.joinedRooms.add(str);
    }

    public void decline(String str, String str2, String str3) throws NotConnectedException {
        Message message = new Message(str);
        MUCUser mUCUser = new MUCUser();
        Decline decline = new Decline();
        decline.setTo(str2);
        decline.setReason(str3);
        mUCUser.setDecline(decline);
        message.addExtension(mUCUser);
        connection().sendStanza(message);
    }

    public List<HostedRoom> getHostedRooms(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        List<Item> items = ServiceDiscoveryManager.getInstanceFor(connection()).discoverItems(str).getItems();
        ArrayList arrayList = new ArrayList(items.size());
        for (Item hostedRoom : items) {
            arrayList.add(new HostedRoom(hostedRoom));
        }
        return arrayList;
    }

    public Set<String> getJoinedRooms() {
        return Collections.unmodifiableSet(this.joinedRooms);
    }

    public synchronized MultiUserChat getMultiUserChat(String str) {
        WeakReference weakReference = (WeakReference) this.multiUserChats.get(str);
        if (weakReference == null) {
            return createNewMucAndAddToMap(str);
        }
        MultiUserChat multiUserChat = (MultiUserChat) weakReference.get();
        if (multiUserChat != null) {
            return multiUserChat;
        }
        return createNewMucAndAddToMap(str);
    }

    public RoomInfo getRoomInfo(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return new RoomInfo(ServiceDiscoveryManager.getInstanceFor(connection()).discoverInfo(str));
    }

    public List<String> getServiceNames() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ServiceDiscoveryManager.getInstanceFor(connection()).findServices(MUCInitialPresence.NAMESPACE, false, false);
    }

    public boolean isServiceEnabled(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(str, MUCInitialPresence.NAMESPACE);
    }

    public void removeInvitationListener(InvitationListener invitationListener) {
        this.invitationsListeners.remove(invitationListener);
    }

    /* access modifiers changed from: 0000 */
    public void removeJoinedRoom(String str) {
        this.joinedRooms.remove(str);
    }

    public List<String> getJoinedRooms(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        List<Item> items = ServiceDiscoveryManager.getInstanceFor(connection()).discoverItems(str, DISCO_NODE).getItems();
        ArrayList arrayList = new ArrayList(items.size());
        for (Item entityID : items) {
            arrayList.add(entityID.getEntityID());
        }
        return arrayList;
    }
}
