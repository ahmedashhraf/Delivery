package org.jivesoftware.smackx.xroster;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.roster.RosterEntry;
import org.jivesoftware.smack.roster.RosterGroup;
import org.jivesoftware.smackx.xroster.packet.RosterExchange;

public class RosterExchangeManager {
    public static final String ELEMENT = "x";
    private static final Map<XMPPConnection, RosterExchangeManager> INSTANCES = new WeakHashMap();
    public static final String NAMESPACE = "jabber:x:roster";
    private static final StanzaFilter PACKET_FILTER = new StanzaExtensionFilter("x", NAMESPACE);
    private final StanzaListener packetListener;
    private final Set<RosterExchangeListener> rosterExchangeListeners = Collections.synchronizedSet(new HashSet());
    private final WeakReference<XMPPConnection> weakRefConnection;

    public RosterExchangeManager(XMPPConnection xMPPConnection) {
        this.weakRefConnection = new WeakReference<>(xMPPConnection);
        this.packetListener = new StanzaListener() {
            public void processPacket(Stanza stanza) {
                Message message = (Message) stanza;
                RosterExchangeManager.this.fireRosterExchangeListeners(message.getFrom(), ((RosterExchange) message.getExtension("x", RosterExchangeManager.NAMESPACE)).getRosterEntries());
            }
        };
        xMPPConnection.addAsyncStanzaListener(this.packetListener, PACKET_FILTER);
    }

    /* access modifiers changed from: private */
    public void fireRosterExchangeListeners(String str, Iterator<RemoteRosterEntry> it) {
        RosterExchangeListener[] rosterExchangeListenerArr;
        synchronized (this.rosterExchangeListeners) {
            rosterExchangeListenerArr = new RosterExchangeListener[this.rosterExchangeListeners.size()];
            this.rosterExchangeListeners.toArray(rosterExchangeListenerArr);
        }
        for (RosterExchangeListener entriesReceived : rosterExchangeListenerArr) {
            entriesReceived.entriesReceived(str, it);
        }
    }

    public static synchronized RosterExchangeManager getInstanceFor(XMPPConnection xMPPConnection) {
        RosterExchangeManager rosterExchangeManager;
        synchronized (RosterExchangeManager.class) {
            rosterExchangeManager = (RosterExchangeManager) INSTANCES.get(xMPPConnection);
            if (rosterExchangeManager == null) {
                rosterExchangeManager = new RosterExchangeManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, rosterExchangeManager);
            }
        }
        return rosterExchangeManager;
    }

    public void addRosterListener(RosterExchangeListener rosterExchangeListener) {
        this.rosterExchangeListeners.add(rosterExchangeListener);
    }

    public void removeRosterListener(RosterExchangeListener rosterExchangeListener) {
        this.rosterExchangeListeners.remove(rosterExchangeListener);
    }

    public void send(Roster roster, String str) throws NotConnectedException {
        Message message = new Message(str);
        message.addExtension(new RosterExchange(roster));
        ((XMPPConnection) this.weakRefConnection.get()).sendStanza(message);
    }

    public void send(RosterEntry rosterEntry, String str) throws NotConnectedException {
        Message message = new Message(str);
        RosterExchange rosterExchange = new RosterExchange();
        rosterExchange.addRosterEntry(rosterEntry);
        message.addExtension(rosterExchange);
        ((XMPPConnection) this.weakRefConnection.get()).sendStanza(message);
    }

    public void send(RosterGroup rosterGroup, String str) throws NotConnectedException {
        Message message = new Message(str);
        RosterExchange rosterExchange = new RosterExchange();
        for (RosterEntry addRosterEntry : rosterGroup.getEntries()) {
            rosterExchange.addRosterEntry(addRosterEntry);
        }
        message.addExtension(rosterExchange);
        ((XMPPConnection) this.weakRefConnection.get()).sendStanza(message);
    }
}
