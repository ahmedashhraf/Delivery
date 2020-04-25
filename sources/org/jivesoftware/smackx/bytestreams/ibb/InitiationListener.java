package org.jivesoftware.smackx.bytestreams.ibb;

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
import org.jivesoftware.smackx.bytestreams.ibb.packet.Open;
import org.jivesoftware.smackx.filetransfer.StreamNegotiator;

class InitiationListener extends AbstractIqRequestHandler {
    /* access modifiers changed from: private */
    public static final Logger LOGGER = Logger.getLogger(InitiationListener.class.getName());
    private final ExecutorService initiationListenerExecutor = Executors.newCachedThreadPool();
    private final InBandBytestreamManager manager;

    protected InitiationListener(InBandBytestreamManager inBandBytestreamManager) {
        super("open", "http://jabber.org/protocol/ibb", Type.set, Mode.async);
        this.manager = inBandBytestreamManager;
    }

    /* access modifiers changed from: private */
    public void processRequest(Stanza stanza) throws NotConnectedException {
        Open open = (Open) stanza;
        if (open.getBlockSize() > this.manager.getMaximumBlockSize()) {
            this.manager.replyResourceConstraintPacket(open);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(open.getFrom());
        sb.append(9);
        sb.append(open.getSessionID());
        StreamNegotiator.signal(sb.toString(), open);
        if (!this.manager.getIgnoredBytestreamRequests().remove(open.getSessionID())) {
            InBandBytestreamRequest inBandBytestreamRequest = new InBandBytestreamRequest(this.manager, open);
            BytestreamListener userListener = this.manager.getUserListener(open.getFrom());
            if (userListener != null) {
                userListener.incomingBytestreamRequest(inBandBytestreamRequest);
            } else if (!this.manager.getAllRequestListeners().isEmpty()) {
                for (BytestreamListener incomingBytestreamRequest : this.manager.getAllRequestListeners()) {
                    incomingBytestreamRequest.incomingBytestreamRequest(inBandBytestreamRequest);
                }
            } else {
                this.manager.replyRejectPacket(open);
            }
        }
    }

    public C15617IQ handleIQRequest(final C15617IQ iq) {
        this.initiationListenerExecutor.execute(new Runnable() {
            public void run() {
                try {
                    InitiationListener.this.processRequest(iq);
                } catch (NotConnectedException e) {
                    InitiationListener.LOGGER.log(Level.WARNING, "proccessRequest", e);
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
