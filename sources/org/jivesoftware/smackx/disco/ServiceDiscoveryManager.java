package org.jivesoftware.smackx.disco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smackx.caps.EntityCapsManager;
import org.jivesoftware.smackx.caps.EntityCapsManager.NodeVerHash;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo.Identity;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import p205i.p486d.p487a.p488c.C14056a;
import p205i.p486d.p487a.p488c.C14057b;

public class ServiceDiscoveryManager extends Manager {
    private static final String DEFAULT_IDENTITY_CATEGORY = "client";
    private static final String DEFAULT_IDENTITY_NAME = "Smack";
    private static final String DEFAULT_IDENTITY_TYPE = "pc";
    private static final Logger LOGGER = Logger.getLogger(ServiceDiscoveryManager.class.getName());
    private static Identity defaultIdentity = new Identity(DEFAULT_IDENTITY_CATEGORY, DEFAULT_IDENTITY_NAME, DEFAULT_IDENTITY_TYPE);
    private static Map<XMPPConnection, ServiceDiscoveryManager> instances = new WeakHashMap();
    private EntityCapsManager capsManager;
    private DataForm extendedInfo = null;
    private final Set<String> features = new HashSet();
    private Set<Identity> identities = new HashSet();
    private Identity identity = defaultIdentity;
    private Map<String, NodeInformationProvider> nodeInformationProviders = new ConcurrentHashMap();
    private C14056a<String, List<String>> services = new C14057b(25, 86400000);

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                ServiceDiscoveryManager.getInstanceFor(xMPPConnection);
            }
        });
    }

    private ServiceDiscoveryManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        addFeature(DiscoverInfo.NAMESPACE);
        addFeature(DiscoverItems.NAMESPACE);
        C156752 r1 = new AbstractIqRequestHandler("query", DiscoverItems.NAMESPACE, Type.get, Mode.async) {
            public C15617IQ handleIQRequest(C15617IQ iq) {
                DiscoverItems discoverItems = (DiscoverItems) iq;
                DiscoverItems discoverItems2 = new DiscoverItems();
                discoverItems2.setType(Type.result);
                discoverItems2.setTo(discoverItems.getFrom());
                discoverItems2.setStanzaId(discoverItems.getStanzaId());
                discoverItems2.setNode(discoverItems.getNode());
                NodeInformationProvider access$000 = ServiceDiscoveryManager.this.getNodeInformationProvider(discoverItems.getNode());
                if (access$000 != null) {
                    discoverItems2.addItems(access$000.getNodeItems());
                    discoverItems2.addExtensions(access$000.getNodePacketExtensions());
                } else if (discoverItems.getNode() != null) {
                    discoverItems2.setType(Type.error);
                    discoverItems2.setError(new XMPPError(Condition.item_not_found));
                }
                return discoverItems2;
            }
        };
        xMPPConnection.registerIQRequestHandler(r1);
        C156763 r7 = new AbstractIqRequestHandler("query", DiscoverInfo.NAMESPACE, Type.get, Mode.async) {
            public C15617IQ handleIQRequest(C15617IQ iq) {
                DiscoverInfo discoverInfo = (DiscoverInfo) iq;
                DiscoverInfo discoverInfo2 = new DiscoverInfo();
                discoverInfo2.setType(Type.result);
                discoverInfo2.setTo(discoverInfo.getFrom());
                discoverInfo2.setStanzaId(discoverInfo.getStanzaId());
                discoverInfo2.setNode(discoverInfo.getNode());
                if (discoverInfo.getNode() == null) {
                    ServiceDiscoveryManager.this.addDiscoverInfoTo(discoverInfo2);
                } else {
                    NodeInformationProvider access$000 = ServiceDiscoveryManager.this.getNodeInformationProvider(discoverInfo.getNode());
                    if (access$000 != null) {
                        discoverInfo2.addFeatures(access$000.getNodeFeatures());
                        discoverInfo2.addIdentities(access$000.getNodeIdentities());
                        discoverInfo2.addExtensions(access$000.getNodePacketExtensions());
                    } else {
                        discoverInfo2.setType(Type.error);
                        discoverInfo2.setError(new XMPPError(Condition.item_not_found));
                    }
                }
                return discoverInfo2;
            }
        };
        xMPPConnection.registerIQRequestHandler(r7);
    }

    public static synchronized ServiceDiscoveryManager getInstanceFor(XMPPConnection xMPPConnection) {
        ServiceDiscoveryManager serviceDiscoveryManager;
        synchronized (ServiceDiscoveryManager.class) {
            serviceDiscoveryManager = (ServiceDiscoveryManager) instances.get(xMPPConnection);
            if (serviceDiscoveryManager == null) {
                serviceDiscoveryManager = new ServiceDiscoveryManager(xMPPConnection);
                instances.put(xMPPConnection, serviceDiscoveryManager);
            }
        }
        return serviceDiscoveryManager;
    }

    /* access modifiers changed from: private */
    public NodeInformationProvider getNodeInformationProvider(String str) {
        if (str == null) {
            return null;
        }
        return (NodeInformationProvider) this.nodeInformationProviders.get(str);
    }

    private void renewEntityCapsVersion() {
        EntityCapsManager entityCapsManager = this.capsManager;
        if (entityCapsManager != null && entityCapsManager.entityCapsEnabled()) {
            this.capsManager.updateLocalEntityCaps();
        }
    }

    public static void setDefaultIdentity(Identity identity2) {
        defaultIdentity = identity2;
    }

    public synchronized void addDiscoverInfoTo(DiscoverInfo discoverInfo) {
        discoverInfo.addIdentities(getIdentities());
        for (String addFeature : getFeatures()) {
            discoverInfo.addFeature(addFeature);
        }
        discoverInfo.addExtension(this.extendedInfo);
    }

    public synchronized void addFeature(String str) {
        this.features.add(str);
        renewEntityCapsVersion();
    }

    public synchronized void addIdentity(Identity identity2) {
        this.identities.add(identity2);
        renewEntityCapsVersion();
    }

    public boolean canPublishItems(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return canPublishItems(discoverInfo(str));
    }

    public DiscoverInfo discoverInfo(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        String str2 = null;
        if (str == null) {
            return discoverInfo(null, null);
        }
        DiscoverInfo discoverInfoByUser = EntityCapsManager.getDiscoverInfoByUser(str);
        if (discoverInfoByUser != null) {
            return discoverInfoByUser;
        }
        NodeVerHash nodeVerHashByJid = EntityCapsManager.getNodeVerHashByJid(str);
        if (nodeVerHashByJid != null) {
            str2 = nodeVerHashByJid.getNodeVer();
        }
        DiscoverInfo discoverInfo = discoverInfo(str, str2);
        if (nodeVerHashByJid != null && EntityCapsManager.verifyDiscoverInfoVersion(nodeVerHashByJid.getVer(), nodeVerHashByJid.getHash(), discoverInfo)) {
            EntityCapsManager.addDiscoverInfoByNode(nodeVerHashByJid.getNodeVer(), discoverInfo);
        }
        return discoverInfo;
    }

    public DiscoverItems discoverItems(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return discoverItems(str, null);
    }

    public List<String> findServices(String str, boolean z, boolean z2) throws NoResponseException, XMPPErrorException, NotConnectedException {
        String serviceName = connection().getServiceName();
        if (z2) {
            List<String> list = (List) this.services.get(str);
            if (list != null) {
                return list;
            }
        }
        LinkedList linkedList = new LinkedList();
        try {
            if (discoverInfo(serviceName).containsFeature(str)) {
                linkedList.add(serviceName);
                if (z) {
                    if (z2) {
                        this.services.put(str, linkedList);
                    }
                    return linkedList;
                }
            }
            try {
                for (Item item : discoverItems(serviceName).getItems()) {
                    try {
                        if (discoverInfo(item.getEntityID()).containsFeature(str)) {
                            linkedList.add(item.getEntityID());
                            if (z) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } catch (NoResponseException | XMPPErrorException e) {
                        Logger logger = LOGGER;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception while discovering info for feature ");
                        sb.append(str);
                        sb.append(" of ");
                        sb.append(item.getEntityID());
                        sb.append(" node: ");
                        sb.append(item.getNode());
                        logger.log(level, sb.toString(), e);
                    }
                }
                if (z2) {
                    this.services.put(str, linkedList);
                }
                return linkedList;
            } catch (XMPPErrorException e2) {
                LOGGER.log(Level.WARNING, "Could not discover items about service", e2);
                return linkedList;
            }
        } catch (XMPPErrorException e3) {
            LOGGER.log(Level.WARNING, "Could not discover information about service", e3);
            return linkedList;
        }
    }

    public DataForm getExtendedInfo() {
        return this.extendedInfo;
    }

    public List<ExtensionElement> getExtendedInfoAsList() {
        if (this.extendedInfo == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.extendedInfo);
        return arrayList;
    }

    public synchronized List<String> getFeatures() {
        return new ArrayList(this.features);
    }

    public Set<Identity> getIdentities() {
        HashSet hashSet = new HashSet(this.identities);
        hashSet.add(defaultIdentity);
        return Collections.unmodifiableSet(hashSet);
    }

    public Identity getIdentity() {
        return this.identity;
    }

    public String getIdentityName() {
        return this.identity.getName();
    }

    public String getIdentityType() {
        return this.identity.getType();
    }

    public synchronized boolean includesFeature(String str) {
        return this.features.contains(str);
    }

    public void publishItems(String str, DiscoverItems discoverItems) throws NoResponseException, XMPPErrorException, NotConnectedException {
        publishItems(str, null, discoverItems);
    }

    public synchronized void removeExtendedInfo() {
        this.extendedInfo = null;
        renewEntityCapsVersion();
    }

    public synchronized void removeFeature(String str) {
        this.features.remove(str);
        renewEntityCapsVersion();
    }

    public synchronized boolean removeIdentity(Identity identity2) {
        if (identity2.equals(this.identity)) {
            return false;
        }
        this.identities.remove(identity2);
        renewEntityCapsVersion();
        return true;
    }

    public void removeNodeInformationProvider(String str) {
        this.nodeInformationProviders.remove(str);
    }

    public boolean serverSupportsFeature(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return supportsFeature(connection().getServiceName(), str);
    }

    public void setEntityCapsManager(EntityCapsManager entityCapsManager) {
        this.capsManager = entityCapsManager;
    }

    public synchronized void setExtendedInfo(DataForm dataForm) {
        this.extendedInfo = dataForm;
        renewEntityCapsVersion();
    }

    public synchronized void setIdentity(Identity identity2) {
        this.identity = (Identity) Objects.requireNonNull(identity2, "Identity can not be null");
        renewEntityCapsVersion();
    }

    public void setNodeInformationProvider(String str, NodeInformationProvider nodeInformationProvider) {
        this.nodeInformationProviders.put(str, nodeInformationProvider);
    }

    public boolean supportsFeature(String str, String str2) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return discoverInfo(str).containsFeature(str2);
    }

    public DiscoverItems discoverItems(String str, String str2) throws NoResponseException, XMPPErrorException, NotConnectedException {
        DiscoverItems discoverItems = new DiscoverItems();
        discoverItems.setType(Type.get);
        discoverItems.setTo(str);
        discoverItems.setNode(str2);
        return (DiscoverItems) connection().createPacketCollectorAndSend(discoverItems).nextResultOrThrow();
    }

    public void publishItems(String str, String str2, DiscoverItems discoverItems) throws NoResponseException, XMPPErrorException, NotConnectedException {
        discoverItems.setType(Type.set);
        discoverItems.setTo(str);
        discoverItems.setNode(str2);
        connection().createPacketCollectorAndSend(discoverItems).nextResultOrThrow();
    }

    public static boolean canPublishItems(DiscoverInfo discoverInfo) {
        return discoverInfo.containsFeature("http://jabber.org/protocol/disco#publish");
    }

    public DiscoverInfo discoverInfo(String str, String str2) throws NoResponseException, XMPPErrorException, NotConnectedException {
        DiscoverInfo discoverInfo = new DiscoverInfo();
        discoverInfo.setType(Type.get);
        discoverInfo.setTo(str);
        discoverInfo.setNode(str2);
        return (DiscoverInfo) connection().createPacketCollectorAndSend(discoverInfo).nextResultOrThrow();
    }
}
