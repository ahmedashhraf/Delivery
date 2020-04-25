package org.jivesoftware.smackx.pubsub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.jivesoftware.smackx.pubsub.ItemsExtension.ItemsElementType;
import org.jivesoftware.smackx.pubsub.packet.PubSub;

public class LeafNode extends Node {
    LeafNode(XMPPConnection xMPPConnection, String str) {
        super(xMPPConnection, str);
    }

    public void deleteAllItems() throws NoResponseException, XMPPErrorException, NotConnectedException {
        this.con.createPacketCollectorAndSend(createPubsubPacket(Type.set, new NodeExtension(PubSubElementType.PURGE_OWNER, getId()), PubSubElementType.PURGE_OWNER.getNamespace())).nextResultOrThrow();
    }

    public void deleteItem(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        deleteItem((Collection<String>) arrayList);
    }

    public DiscoverItems discoverItems() throws NoResponseException, XMPPErrorException, NotConnectedException {
        DiscoverItems discoverItems = new DiscoverItems();
        discoverItems.setTo(this.f45005to);
        discoverItems.setNode(getId());
        return (DiscoverItems) this.con.createPacketCollectorAndSend(discoverItems).nextResultOrThrow();
    }

    public <T extends Item> List<T> getItems() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return getItems(null, null);
    }

    public void publish() throws NotConnectedException {
        this.con.sendStanza(createPubsubPacket(Type.set, new NodeExtension(PubSubElementType.PUBLISH, getId())));
    }

    public void send() throws NoResponseException, XMPPErrorException, NotConnectedException {
        this.con.createPacketCollectorAndSend(createPubsubPacket(Type.set, new NodeExtension(PubSubElementType.PUBLISH, getId()))).nextResultOrThrow();
    }

    public <T extends Item> List<T> getItems(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return getItems(createPubsubPacket(Type.get, new GetItemsRequest(getId(), str)));
    }

    public <T extends Item> void publish(T t) throws NotConnectedException {
        ArrayList arrayList = new ArrayList(1);
        if (t == null) {
            t = new Item();
        }
        arrayList.add(t);
        publish((Collection<T>) arrayList);
    }

    public <T extends Item> void send(T t) throws NoResponseException, XMPPErrorException, NotConnectedException {
        ArrayList arrayList = new ArrayList(1);
        if (t == null) {
            t = new Item();
        }
        arrayList.add(t);
        send((Collection<T>) arrayList);
    }

    public void deleteItem(Collection<String> collection) throws NoResponseException, XMPPErrorException, NotConnectedException {
        ArrayList arrayList = new ArrayList(collection.size());
        for (String item : collection) {
            arrayList.add(new Item(item));
        }
        this.con.createPacketCollectorAndSend(createPubsubPacket(Type.set, new ItemsExtension(ItemsElementType.retract, getId(), (List<? extends ExtensionElement>) arrayList))).nextResultOrThrow();
    }

    public <T extends Item> List<T> getItems(Collection<String> collection) throws NoResponseException, XMPPErrorException, NotConnectedException {
        ArrayList arrayList = new ArrayList(collection.size());
        for (String item : collection) {
            arrayList.add(new Item(item));
        }
        return getItems(createPubsubPacket(Type.get, new ItemsExtension(ItemsElementType.items, getId(), (List<? extends ExtensionElement>) arrayList)));
    }

    public <T extends Item> void publish(Collection<T> collection) throws NotConnectedException {
        this.con.sendStanza(createPubsubPacket(Type.set, new PublishItem(getId(), collection)));
    }

    public <T extends Item> void send(Collection<T> collection) throws NoResponseException, XMPPErrorException, NotConnectedException {
        this.con.createPacketCollectorAndSend(createPubsubPacket(Type.set, new PublishItem(getId(), collection))).nextResultOrThrow();
    }

    public <T extends Item> List<T> getItems(int i) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return getItems(createPubsubPacket(Type.get, new GetItemsRequest(getId(), i)));
    }

    public <T extends Item> List<T> getItems(int i, String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return getItems(createPubsubPacket(Type.get, new GetItemsRequest(getId(), str, i)));
    }

    public <T extends Item> List<T> getItems(List<ExtensionElement> list, List<ExtensionElement> list2) throws NoResponseException, XMPPErrorException, NotConnectedException {
        PubSub createPubsubPacket = createPubsubPacket(Type.get, new GetItemsRequest(getId()));
        createPubsubPacket.addExtensions(list);
        return getItems(createPubsubPacket, list2);
    }

    private <T extends Item> List<T> getItems(PubSub pubSub) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return getItems(pubSub, null);
    }

    private <T extends Item> List<T> getItems(PubSub pubSub, List<ExtensionElement> list) throws NoResponseException, XMPPErrorException, NotConnectedException {
        PubSub pubSub2 = (PubSub) this.con.createPacketCollectorAndSend(pubSub).nextResultOrThrow();
        ItemsExtension itemsExtension = (ItemsExtension) pubSub2.getExtension(PubSubElementType.ITEMS);
        if (list != null) {
            list.addAll(pubSub2.getExtensions());
        }
        return itemsExtension.getItems();
    }
}
