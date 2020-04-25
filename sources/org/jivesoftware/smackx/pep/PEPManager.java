package org.jivesoftware.smackx.pep;

import androidx.core.app.C0770p;
import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.pep.packet.PEPEvent;
import org.jivesoftware.smackx.pep.packet.PEPItem;
import org.jivesoftware.smackx.pep.packet.PEPPubSub;

public class PEPManager {
    private XMPPConnection connection;
    private StanzaFilter packetFilter = new StanzaExtensionFilter(C0770p.f3524g0, "http://jabber.org/protocol/pubsub#event");
    private StanzaListener packetListener;
    private List<PEPListener> pepListeners = new ArrayList();

    public PEPManager(XMPPConnection xMPPConnection) {
        this.connection = xMPPConnection;
        init();
    }

    /* access modifiers changed from: private */
    public void firePEPListeners(String str, PEPEvent pEPEvent) {
        PEPListener[] pEPListenerArr;
        synchronized (this.pepListeners) {
            pEPListenerArr = new PEPListener[this.pepListeners.size()];
            this.pepListeners.toArray(pEPListenerArr);
        }
        for (PEPListener eventReceived : pEPListenerArr) {
            eventReceived.eventReceived(str, pEPEvent);
        }
    }

    private void init() {
        this.packetListener = new StanzaListener() {
            public void processPacket(Stanza stanza) {
                Message message = (Message) stanza;
                PEPManager.this.firePEPListeners(message.getFrom(), (PEPEvent) message.getExtension(C0770p.f3524g0, "http://jabber.org/protocol/pubsub#event"));
            }
        };
        this.connection.addSyncStanzaListener(this.packetListener, this.packetFilter);
    }

    public void addPEPListener(PEPListener pEPListener) {
        synchronized (this.pepListeners) {
            if (!this.pepListeners.contains(pEPListener)) {
                this.pepListeners.add(pEPListener);
            }
        }
    }

    public void destroy() {
        XMPPConnection xMPPConnection = this.connection;
        if (xMPPConnection != null) {
            xMPPConnection.removeSyncStanzaListener(this.packetListener);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        destroy();
        super.finalize();
    }

    public void publish(PEPItem pEPItem) throws NotConnectedException {
        PEPPubSub pEPPubSub = new PEPPubSub(pEPItem);
        pEPPubSub.setType(Type.set);
        this.connection.sendStanza(pEPPubSub);
    }

    public void removePEPListener(PEPListener pEPListener) {
        synchronized (this.pepListeners) {
            this.pepListeners.remove(pEPListener);
        }
    }
}
