package org.jivesoftware.smackx.caps;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import org.jivesoftware.smack.filter.NotFilter;
import org.jivesoftware.smack.filter.PresenceTypeFilter;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.stringencoder.Base64;
import org.jivesoftware.smackx.caps.cache.EntityCapsPersistentCache;
import org.jivesoftware.smackx.caps.packet.CapsExtension;
import org.jivesoftware.smackx.disco.AbstractNodeInformationProvider;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo.Feature;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo.Identity;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import p205i.p486d.p487a.p488c.C14060c;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;

public class EntityCapsManager extends Manager {
    private static final C14060c<String, DiscoverInfo> CAPS_CACHE = new C14060c<>(1000);
    private static String DEFAULT_ENTITY_NODE = "http://www.igniterealtime.org/projects/smack";
    private static final String DEFAULT_HASH = "SHA-1";
    public static final String ELEMENT = "c";
    /* access modifiers changed from: private */
    public static final C14060c<String, NodeVerHash> JID_TO_NODEVER_CACHE = new C14060c<>(C14236a.DEFAULT_TIMEOUT);
    private static final Logger LOGGER = Logger.getLogger(EntityCapsManager.class.getName());
    public static final String NAMESPACE = "http://jabber.org/protocol/caps";
    private static final StanzaFilter PRESENCES_WITHOUT_CAPS;
    private static final StanzaFilter PRESENCES_WITH_CAPS;
    private static final Map<String, MessageDigest> SUPPORTED_HASHES = new HashMap();
    private static boolean autoEnableEntityCaps = true;
    private static Map<XMPPConnection, EntityCapsManager> instances = new WeakHashMap();
    protected static EntityCapsPersistentCache persistentCache;
    private CapsVersionAndHash currentCapsVersion;
    /* access modifiers changed from: private */
    public boolean entityCapsEnabled;
    /* access modifiers changed from: private */
    public String entityNode = DEFAULT_ENTITY_NODE;
    private final Queue<CapsVersionAndHash> lastLocalCapsVersions = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */
    public volatile Presence presenceSend;
    /* access modifiers changed from: private */
    public final ServiceDiscoveryManager sdm;

    public static class NodeVerHash {
        private String hash;
        private String node;
        /* access modifiers changed from: private */
        public String nodeVer;
        private String ver;

        NodeVerHash(String str, CapsVersionAndHash capsVersionAndHash) {
            this(str, capsVersionAndHash.version, capsVersionAndHash.hash);
        }

        public String getHash() {
            return this.hash;
        }

        public String getNode() {
            return this.node;
        }

        public String getNodeVer() {
            return this.nodeVer;
        }

        public String getVer() {
            return this.ver;
        }

        NodeVerHash(String str, String str2, String str3) {
            this.node = str;
            this.ver = str2;
            this.hash = str3;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("#");
            sb.append(str2);
            this.nodeVer = sb.toString();
        }
    }

    static {
        String str = "SHA-1";
        String str2 = "http://jabber.org/protocol/caps";
        String str3 = "c";
        PRESENCES_WITH_CAPS = new AndFilter(new StanzaTypeFilter(Presence.class), new StanzaExtensionFilter(str3, str2));
        PRESENCES_WITHOUT_CAPS = new AndFilter(new StanzaTypeFilter(Presence.class), new NotFilter(new StanzaExtensionFilter(str3, str2)));
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                EntityCapsManager.getInstanceFor(xMPPConnection);
            }
        });
        try {
            SUPPORTED_HASHES.put(str, MessageDigest.getInstance(str));
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    private EntityCapsManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.sdm = ServiceDiscoveryManager.getInstanceFor(xMPPConnection);
        instances.put(xMPPConnection, this);
        xMPPConnection.addConnectionListener(new AbstractConnectionListener() {
            private void processCapsStreamFeatureIfAvailable(XMPPConnection xMPPConnection) {
                CapsExtension capsExtension = (CapsExtension) xMPPConnection.getFeature("c", "http://jabber.org/protocol/caps");
                if (capsExtension != null) {
                    EntityCapsManager.addCapsExtensionInfo(xMPPConnection.getServiceName(), capsExtension);
                }
            }

            public void authenticated(XMPPConnection xMPPConnection, boolean z) {
                processCapsStreamFeatureIfAvailable(xMPPConnection);
                if (!z) {
                    EntityCapsManager.this.presenceSend = null;
                }
            }

            public void connected(XMPPConnection xMPPConnection) {
                processCapsStreamFeatureIfAvailable(xMPPConnection);
            }
        });
        updateLocalEntityCaps();
        if (autoEnableEntityCaps) {
            enableEntityCaps();
        }
        xMPPConnection.addAsyncStanzaListener(new StanzaListener() {
            public void processPacket(Stanza stanza) {
                if (EntityCapsManager.this.entityCapsEnabled()) {
                    EntityCapsManager.addCapsExtensionInfo(stanza.getFrom(), CapsExtension.from(stanza));
                }
            }
        }, PRESENCES_WITH_CAPS);
        xMPPConnection.addAsyncStanzaListener(new StanzaListener() {
            public void processPacket(Stanza stanza) {
                EntityCapsManager.JID_TO_NODEVER_CACHE.remove(stanza.getFrom());
            }
        }, PRESENCES_WITHOUT_CAPS);
        xMPPConnection.addPacketSendingListener(new StanzaListener() {
            public void processPacket(Stanza stanza) {
                EntityCapsManager.this.presenceSend = (Presence) stanza;
            }
        }, PresenceTypeFilter.AVAILABLE);
        xMPPConnection.addPacketInterceptor(new StanzaListener() {
            public void processPacket(Stanza stanza) {
                if (!EntityCapsManager.this.entityCapsEnabled) {
                    stanza.removeExtension("c", "http://jabber.org/protocol/caps");
                    return;
                }
                CapsVersionAndHash capsVersionAndHash = EntityCapsManager.this.getCapsVersionAndHash();
                stanza.overrideExtension(new CapsExtension(EntityCapsManager.this.entityNode, capsVersionAndHash.version, capsVersionAndHash.hash));
            }
        }, PresenceTypeFilter.AVAILABLE);
        this.sdm.setEntityCapsManager(this);
    }

    /* access modifiers changed from: private */
    public static void addCapsExtensionInfo(String str, CapsExtension capsExtension) {
        String hash = capsExtension.getHash();
        if (SUPPORTED_HASHES.containsKey(hash.toUpperCase(Locale.US))) {
            String lowerCase = hash.toLowerCase(Locale.US);
            JID_TO_NODEVER_CACHE.put(str, new NodeVerHash(capsExtension.getNode(), capsExtension.getVer(), lowerCase));
        }
    }

    public static void addDiscoverInfoByNode(String str, DiscoverInfo discoverInfo) {
        CAPS_CACHE.put(str, discoverInfo);
        EntityCapsPersistentCache entityCapsPersistentCache = persistentCache;
        if (entityCapsPersistentCache != null) {
            entityCapsPersistentCache.addDiscoverInfoByNodePersistent(str, discoverInfo);
        }
    }

    public static void clearMemoryCache() {
        JID_TO_NODEVER_CACHE.clear();
        CAPS_CACHE.clear();
    }

    private static void formFieldValuesToCaps(List<String> list, StringBuilder sb) {
        TreeSet<String> treeSet = new TreeSet<>();
        for (String add : list) {
            treeSet.add(add);
        }
        for (String append : treeSet) {
            sb.append(append);
            sb.append("<");
        }
    }

    protected static CapsVersionAndHash generateVerificationString(DiscoverInfo discoverInfo) {
        return generateVerificationString(discoverInfo, null);
    }

    public static DiscoverInfo getDiscoverInfoByUser(String str) {
        NodeVerHash nodeVerHash = (NodeVerHash) JID_TO_NODEVER_CACHE.get(str);
        if (nodeVerHash == null) {
            return null;
        }
        return getDiscoveryInfoByNodeVer(nodeVerHash.nodeVer);
    }

    public static DiscoverInfo getDiscoveryInfoByNodeVer(String str) {
        DiscoverInfo discoverInfo = (DiscoverInfo) CAPS_CACHE.get(str);
        if (discoverInfo == null) {
            EntityCapsPersistentCache entityCapsPersistentCache = persistentCache;
            if (entityCapsPersistentCache != null) {
                discoverInfo = entityCapsPersistentCache.lookup(str);
                if (discoverInfo != null) {
                    CAPS_CACHE.put(str, discoverInfo);
                }
            }
        }
        return discoverInfo != null ? new DiscoverInfo(discoverInfo) : discoverInfo;
    }

    public static synchronized EntityCapsManager getInstanceFor(XMPPConnection xMPPConnection) {
        EntityCapsManager entityCapsManager;
        synchronized (EntityCapsManager.class) {
            if (SUPPORTED_HASHES.size() > 0) {
                entityCapsManager = (EntityCapsManager) instances.get(xMPPConnection);
                if (entityCapsManager == null) {
                    entityCapsManager = new EntityCapsManager(xMPPConnection);
                }
            } else {
                throw new IllegalStateException("No supported hashes for EntityCapsManager");
            }
        }
        return entityCapsManager;
    }

    public static NodeVerHash getNodeVerHashByJid(String str) {
        return (NodeVerHash) JID_TO_NODEVER_CACHE.get(str);
    }

    public static String getNodeVersionByJid(String str) {
        NodeVerHash nodeVerHash = (NodeVerHash) JID_TO_NODEVER_CACHE.get(str);
        if (nodeVerHash != null) {
            return nodeVerHash.nodeVer;
        }
        return null;
    }

    public static void setDefaultEntityNode(String str) {
        DEFAULT_ENTITY_NODE = str;
    }

    public static void setMaxsCacheSizes(int i, int i2) {
        JID_TO_NODEVER_CACHE.mo44384a(i);
        CAPS_CACHE.mo44384a(i2);
    }

    public static void setPersistentCache(EntityCapsPersistentCache entityCapsPersistentCache) {
        persistentCache = entityCapsPersistentCache;
    }

    public static boolean verifyDiscoverInfoVersion(String str, String str2, DiscoverInfo discoverInfo) {
        if (!discoverInfo.containsDuplicateIdentities() && !discoverInfo.containsDuplicateFeatures() && !verifyPacketExtensions(discoverInfo) && str.equals(generateVerificationString(discoverInfo, str2).version)) {
            return true;
        }
        return false;
    }

    protected static boolean verifyPacketExtensions(DiscoverInfo discoverInfo) {
        LinkedList<FormField> linkedList = new LinkedList<>();
        for (ExtensionElement extensionElement : discoverInfo.getExtensions()) {
            if (extensionElement.getNamespace().equals("jabber:x:data")) {
                for (FormField formField : ((DataForm) extensionElement).getFields()) {
                    if (formField.getVariable().equals(FormField.FORM_TYPE)) {
                        for (FormField equals : linkedList) {
                            if (formField.equals(equals)) {
                                return true;
                            }
                        }
                        linkedList.add(formField);
                    }
                }
                continue;
            }
        }
        return false;
    }

    public boolean areEntityCapsSupported(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return this.sdm.supportsFeature(str, "http://jabber.org/protocol/caps");
    }

    public boolean areEntityCapsSupportedByServer() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return areEntityCapsSupported(connection().getServiceName());
    }

    public synchronized void disableEntityCaps() {
        this.entityCapsEnabled = false;
        this.sdm.removeFeature("http://jabber.org/protocol/caps");
    }

    public synchronized void enableEntityCaps() {
        this.sdm.addFeature("http://jabber.org/protocol/caps");
        updateLocalEntityCaps();
        this.entityCapsEnabled = true;
    }

    public boolean entityCapsEnabled() {
        return this.entityCapsEnabled;
    }

    public CapsVersionAndHash getCapsVersionAndHash() {
        return this.currentCapsVersion;
    }

    public String getLocalNodeVer() {
        CapsVersionAndHash capsVersionAndHash = getCapsVersionAndHash();
        if (capsVersionAndHash == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.entityNode);
        sb.append('#');
        sb.append(capsVersionAndHash.version);
        return sb.toString();
    }

    public void removeUserCapsNode(String str) {
        JID_TO_NODEVER_CACHE.remove(str);
    }

    public void setEntityNode(String str) throws NotConnectedException {
        this.entityNode = str;
        updateLocalEntityCaps();
    }

    public void updateLocalEntityCaps() {
        XMPPConnection connection = connection();
        DiscoverInfo discoverInfo = new DiscoverInfo();
        discoverInfo.setType(Type.result);
        this.sdm.addDiscoverInfoTo(discoverInfo);
        this.currentCapsVersion = generateVerificationString(discoverInfo);
        String localNodeVer = getLocalNodeVer();
        discoverInfo.setNode(localNodeVer);
        addDiscoverInfoByNode(localNodeVer, discoverInfo);
        if (this.lastLocalCapsVersions.size() > 10) {
            CapsVersionAndHash capsVersionAndHash = (CapsVersionAndHash) this.lastLocalCapsVersions.poll();
            ServiceDiscoveryManager serviceDiscoveryManager = this.sdm;
            StringBuilder sb = new StringBuilder();
            sb.append(this.entityNode);
            sb.append('#');
            sb.append(capsVersionAndHash.version);
            serviceDiscoveryManager.removeNodeInformationProvider(sb.toString());
        }
        this.lastLocalCapsVersions.add(this.currentCapsVersion);
        if (connection != null) {
            JID_TO_NODEVER_CACHE.put(connection.getUser(), new NodeVerHash(this.entityNode, this.currentCapsVersion));
        }
        final LinkedList linkedList = new LinkedList(ServiceDiscoveryManager.getInstanceFor(connection).getIdentities());
        this.sdm.setNodeInformationProvider(localNodeVer, new AbstractNodeInformationProvider() {
            List<String> features = EntityCapsManager.this.sdm.getFeatures();
            List<ExtensionElement> packetExtensions = EntityCapsManager.this.sdm.getExtendedInfoAsList();

            public List<String> getNodeFeatures() {
                return this.features;
            }

            public List<Identity> getNodeIdentities() {
                return linkedList;
            }

            public List<ExtensionElement> getNodePacketExtensions() {
                return this.packetExtensions;
            }
        });
        if (connection != null && connection.isAuthenticated() && this.presenceSend != null) {
            try {
                connection.sendStanza(this.presenceSend.cloneWithNewId());
            } catch (NotConnectedException e) {
                LOGGER.log(Level.WARNING, "Could could not update presence with caps info", e);
            }
        }
    }

    protected static CapsVersionAndHash generateVerificationString(DiscoverInfo discoverInfo, String str) {
        byte[] digest;
        if (str == null) {
            str = "SHA-1";
        }
        MessageDigest messageDigest = (MessageDigest) SUPPORTED_HASHES.get(str.toUpperCase(Locale.US));
        FormField formField = null;
        if (messageDigest == null) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        DataForm from = DataForm.from(discoverInfo);
        StringBuilder sb = new StringBuilder();
        TreeSet<Identity> treeSet = new TreeSet<>();
        for (Identity add : discoverInfo.getIdentities()) {
            treeSet.add(add);
        }
        for (Identity identity : treeSet) {
            sb.append(identity.getCategory());
            sb.append("/");
            sb.append(identity.getType());
            sb.append("/");
            sb.append(identity.getLanguage() == null ? "" : identity.getLanguage());
            sb.append("/");
            sb.append(identity.getName() == null ? "" : identity.getName());
            sb.append("<");
        }
        TreeSet<String> treeSet2 = new TreeSet<>();
        for (Feature var : discoverInfo.getFeatures()) {
            treeSet2.add(var.getVar());
        }
        for (String append : treeSet2) {
            sb.append(append);
            sb.append("<");
        }
        if (from != null && from.hasHiddenFormTypeField()) {
            synchronized (from) {
                TreeSet<FormField> treeSet3 = new TreeSet<>(new Comparator<FormField>() {
                    public int compare(FormField formField, FormField formField2) {
                        return formField.getVariable().compareTo(formField2.getVariable());
                    }
                });
                for (FormField formField2 : from.getFields()) {
                    if (!formField2.getVariable().equals(FormField.FORM_TYPE)) {
                        treeSet3.add(formField2);
                    } else {
                        formField = formField2;
                    }
                }
                if (formField != null) {
                    formFieldValuesToCaps(formField.getValues(), sb);
                }
                for (FormField formField3 : treeSet3) {
                    sb.append(formField3.getVariable());
                    sb.append("<");
                    formFieldValuesToCaps(formField3.getValues(), sb);
                }
            }
        }
        synchronized (messageDigest) {
            digest = messageDigest.digest(sb.toString().getBytes());
        }
        return new CapsVersionAndHash(Base64.encodeToString(digest), lowerCase);
    }
}
