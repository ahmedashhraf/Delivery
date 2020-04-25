package org.jivesoftware.smackx.offline;

import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smack.PacketCollector;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.jivesoftware.smackx.offline.packet.OfflineMessageInfo;
import org.jivesoftware.smackx.offline.packet.OfflineMessageRequest;
import org.jivesoftware.smackx.offline.packet.OfflineMessageRequest.Item;
import org.jivesoftware.smackx.xdata.Form;

public class OfflineMessageManager {
    private static final StanzaFilter PACKET_FILTER = new AndFilter(new StanzaExtensionFilter((ExtensionElement) new OfflineMessageInfo()), StanzaTypeFilter.MESSAGE);
    private static final String namespace = "http://jabber.org/protocol/offline";
    private final XMPPConnection connection;

    public OfflineMessageManager(XMPPConnection xMPPConnection) {
        this.connection = xMPPConnection;
    }

    public void deleteMessages(List<String> list) throws NoResponseException, XMPPErrorException, NotConnectedException {
        OfflineMessageRequest offlineMessageRequest = new OfflineMessageRequest();
        for (String item : list) {
            Item item2 = new Item(item);
            item2.setAction(DiscoverItems.Item.REMOVE_ACTION);
            offlineMessageRequest.addItem(item2);
        }
        this.connection.createPacketCollectorAndSend(offlineMessageRequest).nextResultOrThrow();
    }

    public List<OfflineMessageHeader> getHeaders() throws NoResponseException, XMPPErrorException, NotConnectedException {
        ArrayList arrayList = new ArrayList();
        for (DiscoverItems.Item offlineMessageHeader : ServiceDiscoveryManager.getInstanceFor(this.connection).discoverItems(null, "http://jabber.org/protocol/offline").getItems()) {
            arrayList.add(new OfflineMessageHeader(offlineMessageHeader));
        }
        return arrayList;
    }

    public int getMessageCount() throws NoResponseException, XMPPErrorException, NotConnectedException {
        Form formFrom = Form.getFormFrom(ServiceDiscoveryManager.getInstanceFor(this.connection).discoverInfo(null, "http://jabber.org/protocol/offline"));
        if (formFrom != null) {
            return Integer.parseInt((String) formFrom.getField("number_of_messages").getValues().get(0));
        }
        return 0;
    }

    public List<Message> getMessages(final List<String> list) throws NoResponseException, XMPPErrorException, NotConnectedException {
        ArrayList arrayList = new ArrayList();
        OfflineMessageRequest offlineMessageRequest = new OfflineMessageRequest();
        for (String item : list) {
            Item item2 = new Item(item);
            item2.setAction("view");
            offlineMessageRequest.addItem(item2);
        }
        PacketCollector createPacketCollector = this.connection.createPacketCollector((StanzaFilter) new AndFilter(PACKET_FILTER, new StanzaFilter() {
            public boolean accept(Stanza stanza) {
                return list.contains(((OfflineMessageInfo) stanza.getExtension("offline", "http://jabber.org/protocol/offline")).getNode());
            }
        }));
        try {
            this.connection.createPacketCollectorAndSend(offlineMessageRequest).nextResultOrThrow();
            for (Message message = (Message) createPacketCollector.nextResult(); message != null; message = (Message) createPacketCollector.nextResult()) {
                arrayList.add(message);
            }
            return arrayList;
        } finally {
            createPacketCollector.cancel();
        }
    }

    public boolean supportsFlexibleRetrieval() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ServiceDiscoveryManager.getInstanceFor(this.connection).serverSupportsFeature("http://jabber.org/protocol/offline");
    }

    public void deleteMessages() throws NoResponseException, XMPPErrorException, NotConnectedException {
        OfflineMessageRequest offlineMessageRequest = new OfflineMessageRequest();
        offlineMessageRequest.setPurge(true);
        this.connection.createPacketCollectorAndSend(offlineMessageRequest).nextResultOrThrow();
    }

    public List<Message> getMessages() throws NoResponseException, XMPPErrorException, NotConnectedException {
        OfflineMessageRequest offlineMessageRequest = new OfflineMessageRequest();
        offlineMessageRequest.setFetch(true);
        PacketCollector createPacketCollectorAndSend = this.connection.createPacketCollectorAndSend(offlineMessageRequest);
        PacketCollector createPacketCollector = this.connection.createPacketCollector(PacketCollector.newConfiguration().setStanzaFilter(PACKET_FILTER).setCollectorToReset(createPacketCollectorAndSend));
        try {
            createPacketCollectorAndSend.nextResultOrThrow();
            createPacketCollector.cancel();
            ArrayList arrayList = new ArrayList(createPacketCollector.getCollectedCount());
            while (true) {
                Message message = (Message) createPacketCollector.pollResult();
                if (message == null) {
                    return arrayList;
                }
                arrayList.add(message);
            }
        } finally {
            createPacketCollector.cancel();
        }
    }
}
