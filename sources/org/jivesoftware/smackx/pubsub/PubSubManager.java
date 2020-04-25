package org.jivesoftware.smackx.pubsub;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.EmptyResultIQ;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.jivesoftware.smackx.pubsub.packet.PubSub;
import org.jivesoftware.smackx.pubsub.packet.PubSubNamespace;
import org.jivesoftware.smackx.pubsub.util.NodeUtils;

public final class PubSubManager {
    private XMPPConnection con;
    private Map<String, Node> nodeMap = new ConcurrentHashMap();

    /* renamed from: to */
    private String f45008to;

    public PubSubManager(XMPPConnection xMPPConnection) {
        this.con = xMPPConnection;
        StringBuilder sb = new StringBuilder();
        sb.append("pubsub.");
        sb.append(xMPPConnection.getServiceName());
        this.f45008to = sb.toString();
    }

    private PubSub sendPubsubPacket(Type type, ExtensionElement extensionElement, PubSubNamespace pubSubNamespace) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return sendPubsubPacket(this.con, this.f45008to, type, Collections.singletonList(extensionElement), pubSubNamespace);
    }

    public LeafNode createNode() throws NoResponseException, XMPPErrorException, NotConnectedException {
        LeafNode leafNode = new LeafNode(this.con, ((NodeExtension) sendPubsubPacket(Type.set, new NodeExtension(PubSubElementType.CREATE), null).getExtension("create", PubSubNamespace.BASIC.getXmlns())).getNode());
        leafNode.setTo(this.f45008to);
        this.nodeMap.put(leafNode.getId(), leafNode);
        return leafNode;
    }

    public void deleteNode(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        sendPubsubPacket(Type.set, new NodeExtension(PubSubElementType.DELETE, str), PubSubElementType.DELETE.getNamespace());
        this.nodeMap.remove(str);
    }

    public DiscoverItems discoverNodes(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        DiscoverItems discoverItems = new DiscoverItems();
        if (str != null) {
            discoverItems.setNode(str);
        }
        discoverItems.setTo(this.f45008to);
        return (DiscoverItems) this.con.createPacketCollectorAndSend(discoverItems).nextResultOrThrow();
    }

    public List<Affiliation> getAffiliations() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ((AffiliationsExtension) sendPubsubPacket(Type.get, new NodeExtension(PubSubElementType.AFFILIATIONS), null).getExtension(PubSubElementType.AFFILIATIONS)).getAffiliations();
    }

    public ConfigureForm getDefaultConfiguration() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return NodeUtils.getFormFromPacket(sendPubsubPacket(Type.get, new NodeExtension(PubSubElementType.DEFAULT), PubSubElementType.DEFAULT.getNamespace()), PubSubElementType.DEFAULT);
    }

    public <T extends Node> T getNode(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        T t = (Node) this.nodeMap.get(str);
        if (t == null) {
            DiscoverInfo discoverInfo = new DiscoverInfo();
            discoverInfo.setTo(this.f45008to);
            discoverInfo.setNode(str);
            DiscoverInfo discoverInfo2 = (DiscoverInfo) this.con.createPacketCollectorAndSend(discoverInfo).nextResultOrThrow();
            String str2 = "pubsub";
            if (discoverInfo2.hasIdentity(str2, "leaf")) {
                t = new LeafNode(this.con, str);
            } else if (discoverInfo2.hasIdentity(str2, "collection")) {
                t = new CollectionNode(this.con, str);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("PubSub service '");
                sb.append(this.f45008to);
                sb.append("' returned disco info result for node '");
                sb.append(str);
                sb.append("', but it did not contain an Identity of type 'leaf' or 'collection' (and category 'pubsub'), which is not allowed according to XEP-60 5.3.");
                throw new AssertionError(sb.toString());
            }
            t.setTo(this.f45008to);
            this.nodeMap.put(str, t);
        }
        return t;
    }

    public List<Subscription> getSubscriptions() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ((SubscriptionsExtension) sendPubsubPacket(Type.get, new NodeExtension(PubSubElementType.SUBSCRIPTIONS), null).getExtension(PubSubElementType.SUBSCRIPTIONS.getElementName(), PubSubElementType.SUBSCRIPTIONS.getNamespace().getXmlns())).getSubscriptions();
    }

    public DiscoverInfo getSupportedFeatures() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ServiceDiscoveryManager.getInstanceFor(this.con).discoverInfo(this.f45008to);
    }

    static PubSub sendPubsubPacket(XMPPConnection xMPPConnection, String str, Type type, List<ExtensionElement> list, PubSubNamespace pubSubNamespace) throws NoResponseException, XMPPErrorException, NotConnectedException {
        PubSub pubSub = new PubSub(str, type, pubSubNamespace);
        for (ExtensionElement addExtension : list) {
            pubSub.addExtension(addExtension);
        }
        return sendPubsubPacket(xMPPConnection, pubSub);
    }

    public PubSubManager(XMPPConnection xMPPConnection, String str) {
        this.con = xMPPConnection;
        this.f45008to = str;
    }

    static PubSub sendPubsubPacket(XMPPConnection xMPPConnection, PubSub pubSub) throws NoResponseException, XMPPErrorException, NotConnectedException {
        C15617IQ iq = (C15617IQ) xMPPConnection.createPacketCollectorAndSend(pubSub).nextResultOrThrow();
        if (iq instanceof EmptyResultIQ) {
            return null;
        }
        return (PubSub) iq;
    }

    public LeafNode createNode(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return (LeafNode) createNode(str, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jivesoftware.smackx.pubsub.Node createNode(java.lang.String r5, org.jivesoftware.smackx.xdata.Form r6) throws org.jivesoftware.smack.SmackException.NoResponseException, org.jivesoftware.smack.XMPPException.XMPPErrorException, org.jivesoftware.smack.SmackException.NotConnectedException {
        /*
            r4 = this;
            java.lang.String r0 = r4.f45008to
            org.jivesoftware.smack.packet.IQ$Type r1 = org.jivesoftware.smack.packet.C15617IQ.Type.set
            org.jivesoftware.smackx.pubsub.NodeExtension r2 = new org.jivesoftware.smackx.pubsub.NodeExtension
            org.jivesoftware.smackx.pubsub.PubSubElementType r3 = org.jivesoftware.smackx.pubsub.PubSubElementType.CREATE
            r2.<init>(r3, r5)
            r3 = 0
            org.jivesoftware.smackx.pubsub.packet.PubSub r0 = org.jivesoftware.smackx.pubsub.packet.PubSub.createPubsubPacket(r0, r1, r2, r3)
            if (r6 == 0) goto L_0x003e
            org.jivesoftware.smackx.pubsub.FormNode r1 = new org.jivesoftware.smackx.pubsub.FormNode
            org.jivesoftware.smackx.pubsub.FormNodeType r2 = org.jivesoftware.smackx.pubsub.FormNodeType.CONFIGURE
            r1.<init>(r2, r6)
            r0.addExtension(r1)
            org.jivesoftware.smackx.pubsub.ConfigureNodeFields r1 = org.jivesoftware.smackx.pubsub.ConfigureNodeFields.node_type
            java.lang.String r1 = r1.getFieldName()
            org.jivesoftware.smackx.xdata.FormField r6 = r6.getField(r1)
            if (r6 == 0) goto L_0x003e
            java.util.List r6 = r6.getValues()
            r1 = 0
            java.lang.Object r6 = r6.get(r1)
            java.lang.String r6 = (java.lang.String) r6
            org.jivesoftware.smackx.pubsub.NodeType r1 = org.jivesoftware.smackx.pubsub.NodeType.leaf
            java.lang.String r1 = r1.toString()
            boolean r6 = r6.equals(r1)
            goto L_0x003f
        L_0x003e:
            r6 = 1
        L_0x003f:
            org.jivesoftware.smack.XMPPConnection r1 = r4.con
            sendPubsubPacket(r1, r0)
            if (r6 == 0) goto L_0x004e
            org.jivesoftware.smackx.pubsub.LeafNode r6 = new org.jivesoftware.smackx.pubsub.LeafNode
            org.jivesoftware.smack.XMPPConnection r0 = r4.con
            r6.<init>(r0, r5)
            goto L_0x0055
        L_0x004e:
            org.jivesoftware.smackx.pubsub.CollectionNode r6 = new org.jivesoftware.smackx.pubsub.CollectionNode
            org.jivesoftware.smack.XMPPConnection r0 = r4.con
            r6.<init>(r0, r5)
        L_0x0055:
            java.lang.String r5 = r4.f45008to
            r6.setTo(r5)
            java.util.Map<java.lang.String, org.jivesoftware.smackx.pubsub.Node> r5 = r4.nodeMap
            java.lang.String r0 = r6.getId()
            r5.put(r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.pubsub.PubSubManager.createNode(java.lang.String, org.jivesoftware.smackx.xdata.Form):org.jivesoftware.smackx.pubsub.Node");
    }
}
