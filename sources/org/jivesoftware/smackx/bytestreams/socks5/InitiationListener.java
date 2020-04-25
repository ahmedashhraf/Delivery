package org.jivesoftware.smackx.bytestreams.socks5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.bytestreams.BytestreamListener;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream;
import org.jivesoftware.smackx.filetransfer.StreamNegotiator;

final class InitiationListener extends AbstractIqRequestHandler {
    /* access modifiers changed from: private */
    public static final Logger LOGGER = Logger.getLogger(InitiationListener.class.getName());
    private final ExecutorService initiationListenerExecutor = Executors.newCachedThreadPool();
    private final Socks5BytestreamManager manager;

    protected InitiationListener(Socks5BytestreamManager socks5BytestreamManager) {
        super("query", Bytestream.NAMESPACE, Type.set, Mode.async);
        this.manager = socks5BytestreamManager;
    }

    /* access modifiers changed from: private */
    public void processRequest(Stanza stanza) throws NotConnectedException {
        Bytestream bytestream = (Bytestream) stanza;
        StringBuilder sb = new StringBuilder();
        sb.append(bytestream.getFrom());
        sb.append(9);
        sb.append(bytestream.getSessionID());
        StreamNegotiator.signal(sb.toString(), bytestream);
        if (!this.manager.getIgnoredBytestreamRequests().remove(bytestream.getSessionID())) {
            Socks5BytestreamRequest socks5BytestreamRequest = new Socks5BytestreamRequest(this.manager, bytestream);
            BytestreamListener userListener = this.manager.getUserListener(bytestream.getFrom());
            if (userListener != null) {
                userListener.incomingBytestreamRequest(socks5BytestreamRequest);
            } else if (!this.manager.getAllRequestListeners().isEmpty()) {
                for (BytestreamListener incomingBytestreamRequest : this.manager.getAllRequestListeners()) {
                    incomingBytestreamRequest.incomingBytestreamRequest(socks5BytestreamRequest);
                }
            } else {
                this.manager.replyRejectPacket(bytestream);
            }
        }
    }

    public C15617IQ handleIQRequest(final C15617IQ iq) {
        this.initiationListenerExecutor.execute(new Runnable() {
            public void run() {
                try {
                    InitiationListener.this.processRequest(iq);
                } catch (NotConnectedException e) {
                    InitiationListener.LOGGER.log(Level.WARNING, "process request", e);
                }
            }
        });
        return null;
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
        this.initiationListenerExecutor.shutdownNow();
    }
}
