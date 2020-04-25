package org.jivesoftware.smackx.privacy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jivesoftware.smack.AbstractConnectionListener;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.IQResultReplyFilter;
import org.jivesoftware.smack.filter.IQTypeFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.privacy.filter.SetActiveListFilter;
import org.jivesoftware.smackx.privacy.filter.SetDefaultListFilter;
import org.jivesoftware.smackx.privacy.packet.Privacy;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;

public class PrivacyListManager extends Manager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Map<XMPPConnection, PrivacyListManager> INSTANCES = new WeakHashMap();
    public static final String NAMESPACE = "jabber:iq:privacy";
    public static final StanzaFilter PRIVACY_FILTER = new StanzaTypeFilter(Privacy.class);
    private static final StanzaFilter PRIVACY_RESULT = new AndFilter(IQTypeFilter.RESULT, PRIVACY_FILTER);
    /* access modifiers changed from: private */
    public volatile String cachedActiveListName;
    /* access modifiers changed from: private */
    public volatile String cachedDefaultListName;
    /* access modifiers changed from: private */
    public final Set<PrivacyListListener> listeners = new CopyOnWriteArraySet();

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                PrivacyListManager.getInstanceFor(xMPPConnection);
            }
        });
    }

    private PrivacyListManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        C157142 r1 = new AbstractIqRequestHandler("query", "jabber:iq:privacy", Type.set, Mode.sync) {
            public C15617IQ handleIQRequest(C15617IQ iq) {
                Privacy privacy = (Privacy) iq;
                for (PrivacyListListener privacyListListener : PrivacyListManager.this.listeners) {
                    for (Entry entry : privacy.getItemLists().entrySet()) {
                        String str = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        if (list.isEmpty()) {
                            privacyListListener.updatedPrivacyList(str);
                        } else {
                            privacyListListener.setPrivacyList(str, list);
                        }
                    }
                }
                return C15617IQ.createResultIQ(privacy);
            }
        };
        xMPPConnection.registerIQRequestHandler(r1);
        xMPPConnection.addPacketSendingListener(new StanzaListener() {
            public void processPacket(Stanza stanza) throws NotConnectedException {
                XMPPConnection access$100 = PrivacyListManager.this.connection();
                Privacy privacy = (Privacy) stanza;
                IQResultReplyFilter iQResultReplyFilter = new IQResultReplyFilter(privacy, access$100);
                final String activeName = privacy.getActiveName();
                final boolean isDeclineActiveList = privacy.isDeclineActiveList();
                access$100.addOneTimeSyncCallback(new StanzaListener() {
                    public void processPacket(Stanza stanza) throws NotConnectedException {
                        if (isDeclineActiveList) {
                            PrivacyListManager.this.cachedActiveListName = null;
                        } else {
                            PrivacyListManager.this.cachedActiveListName = activeName;
                        }
                    }
                }, iQResultReplyFilter);
            }
        }, SetActiveListFilter.INSTANCE);
        xMPPConnection.addPacketSendingListener(new StanzaListener() {
            public void processPacket(Stanza stanza) throws NotConnectedException {
                XMPPConnection access$300 = PrivacyListManager.this.connection();
                Privacy privacy = (Privacy) stanza;
                IQResultReplyFilter iQResultReplyFilter = new IQResultReplyFilter(privacy, access$300);
                final String defaultName = privacy.getDefaultName();
                final boolean isDeclineDefaultList = privacy.isDeclineDefaultList();
                access$300.addOneTimeSyncCallback(new StanzaListener() {
                    public void processPacket(Stanza stanza) throws NotConnectedException {
                        if (isDeclineDefaultList) {
                            PrivacyListManager.this.cachedDefaultListName = null;
                        } else {
                            PrivacyListManager.this.cachedDefaultListName = defaultName;
                        }
                    }
                }, iQResultReplyFilter);
            }
        }, SetDefaultListFilter.INSTANCE);
        xMPPConnection.addSyncStanzaListener(new StanzaListener() {
            public void processPacket(Stanza stanza) throws NotConnectedException {
                Privacy privacy = (Privacy) stanza;
                String activeName = privacy.getActiveName();
                if (activeName != null) {
                    PrivacyListManager.this.cachedActiveListName = activeName;
                }
                String defaultName = privacy.getDefaultName();
                if (defaultName != null) {
                    PrivacyListManager.this.cachedDefaultListName = defaultName;
                }
            }
        }, PRIVACY_RESULT);
        xMPPConnection.addConnectionListener(new AbstractConnectionListener() {
            public void authenticated(XMPPConnection xMPPConnection, boolean z) {
                if (!z) {
                    PrivacyListManager privacyListManager = PrivacyListManager.this;
                    privacyListManager.cachedActiveListName = privacyListManager.cachedDefaultListName = null;
                }
            }
        });
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature("jabber:iq:privacy");
    }

    public static synchronized PrivacyListManager getInstanceFor(XMPPConnection xMPPConnection) {
        PrivacyListManager privacyListManager;
        synchronized (PrivacyListManager.class) {
            privacyListManager = (PrivacyListManager) INSTANCES.get(xMPPConnection);
            if (privacyListManager == null) {
                privacyListManager = new PrivacyListManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, privacyListManager);
            }
        }
        return privacyListManager;
    }

    private List<PrivacyItem> getPrivacyListItems(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        Privacy privacy = new Privacy();
        privacy.setPrivacyList(str, new ArrayList());
        return getRequest(privacy).getPrivacyList(str);
    }

    private Privacy getPrivacyWithListNames() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return getRequest(new Privacy());
    }

    private Privacy getRequest(Privacy privacy) throws NoResponseException, XMPPErrorException, NotConnectedException {
        privacy.setType(Type.get);
        return (Privacy) connection().createPacketCollectorAndSend(privacy).nextResultOrThrow();
    }

    private Stanza setRequest(Privacy privacy) throws NoResponseException, XMPPErrorException, NotConnectedException {
        privacy.setType(Type.set);
        return connection().createPacketCollectorAndSend(privacy).nextResultOrThrow();
    }

    public boolean addListener(PrivacyListListener privacyListListener) {
        return this.listeners.add(privacyListListener);
    }

    public void createPrivacyList(String str, List<PrivacyItem> list) throws NoResponseException, XMPPErrorException, NotConnectedException {
        updatePrivacyList(str, list);
    }

    public void declineActiveList() throws NoResponseException, XMPPErrorException, NotConnectedException {
        Privacy privacy = new Privacy();
        privacy.setDeclineActiveList(true);
        setRequest(privacy);
    }

    public void declineDefaultList() throws NoResponseException, XMPPErrorException, NotConnectedException {
        Privacy privacy = new Privacy();
        privacy.setDeclineDefaultList(true);
        setRequest(privacy);
    }

    public void deletePrivacyList(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        Privacy privacy = new Privacy();
        privacy.setPrivacyList(str, new ArrayList());
        setRequest(privacy);
    }

    public PrivacyList getActiveList() throws NoResponseException, XMPPErrorException, NotConnectedException {
        Privacy privacyWithListNames = getPrivacyWithListNames();
        String activeName = privacyWithListNames.getActiveName();
        if (StringUtils.isNullOrEmpty(activeName)) {
            return null;
        }
        return new PrivacyList(true, activeName != null && activeName.equals(privacyWithListNames.getDefaultName()), activeName, getPrivacyListItems(activeName));
    }

    public String getActiveListName() throws NoResponseException, XMPPErrorException, NotConnectedException {
        if (this.cachedActiveListName != null) {
            return this.cachedActiveListName;
        }
        return getPrivacyWithListNames().getActiveName();
    }

    public PrivacyList getDefaultList() throws NoResponseException, XMPPErrorException, NotConnectedException {
        Privacy privacyWithListNames = getPrivacyWithListNames();
        String defaultName = privacyWithListNames.getDefaultName();
        if (StringUtils.isNullOrEmpty(defaultName)) {
            return null;
        }
        return new PrivacyList(defaultName.equals(privacyWithListNames.getActiveName()), true, defaultName, getPrivacyListItems(defaultName));
    }

    public String getDefaultListName() throws NoResponseException, XMPPErrorException, NotConnectedException {
        if (this.cachedDefaultListName != null) {
            return this.cachedDefaultListName;
        }
        return getPrivacyWithListNames().getDefaultName();
    }

    public String getEffectiveListName() throws NoResponseException, XMPPErrorException, NotConnectedException {
        String activeListName = getActiveListName();
        if (activeListName != null) {
            return activeListName;
        }
        return getDefaultListName();
    }

    public PrivacyList getPrivacyList(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        String str2 = (String) StringUtils.requireNotNullOrEmpty(str, "List name must not be null");
        return new PrivacyList(false, false, str2, getPrivacyListItems(str2));
    }

    public List<PrivacyList> getPrivacyLists() throws NoResponseException, XMPPErrorException, NotConnectedException {
        Privacy privacyWithListNames = getPrivacyWithListNames();
        Set<String> privacyListNames = privacyWithListNames.getPrivacyListNames();
        ArrayList arrayList = new ArrayList(privacyListNames.size());
        for (String str : privacyListNames) {
            arrayList.add(new PrivacyList(str.equals(privacyWithListNames.getActiveName()), str.equals(privacyWithListNames.getDefaultName()), str, getPrivacyListItems(str)));
        }
        return arrayList;
    }

    public boolean isSupported() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ServiceDiscoveryManager.getInstanceFor(connection()).serverSupportsFeature("jabber:iq:privacy");
    }

    public boolean removeListener(PrivacyListListener privacyListListener) {
        return this.listeners.remove(privacyListListener);
    }

    public void setActiveListName(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        Privacy privacy = new Privacy();
        privacy.setActiveName(str);
        setRequest(privacy);
    }

    public void setDefaultListName(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        Privacy privacy = new Privacy();
        privacy.setDefaultName(str);
        setRequest(privacy);
    }

    public void updatePrivacyList(String str, List<PrivacyItem> list) throws NoResponseException, XMPPErrorException, NotConnectedException {
        Privacy privacy = new Privacy();
        privacy.setPrivacyList(str, list);
        setRequest(privacy);
    }
}
