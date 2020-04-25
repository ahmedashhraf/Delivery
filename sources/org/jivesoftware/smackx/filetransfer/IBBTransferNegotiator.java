package org.jivesoftware.smackx.filetransfer;

import java.io.InputStream;
import java.io.OutputStream;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamRequest;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Open;
import org.jivesoftware.smackx.p558si.packet.StreamInitiation;

public class IBBTransferNegotiator extends StreamNegotiator {
    private XMPPConnection connection;
    private InBandBytestreamManager manager;

    private static class ByteStreamRequest extends InBandBytestreamRequest {
        private ByteStreamRequest(InBandBytestreamManager inBandBytestreamManager, Open open) {
            super(inBandBytestreamManager, open);
        }
    }

    protected IBBTransferNegotiator(XMPPConnection xMPPConnection) {
        this.connection = xMPPConnection;
        this.manager = InBandBytestreamManager.getByteStreamManager(xMPPConnection);
    }

    public InputStream createIncomingStream(StreamInitiation streamInitiation) throws NoResponseException, XMPPErrorException, NotConnectedException {
        this.manager.ignoreBytestreamRequestOnce(streamInitiation.getSessionID());
        return negotiateIncomingStream(initiateIncomingStream(this.connection, streamInitiation));
    }

    public OutputStream createOutgoingStream(String str, String str2, String str3) throws NoResponseException, XMPPErrorException, NotConnectedException {
        InBandBytestreamSession establishSession = this.manager.establishSession(str3, str);
        establishSession.setCloseBothStreamsEnabled(true);
        return establishSession.getOutputStream();
    }

    public String[] getNamespaces() {
        return new String[]{"http://jabber.org/protocol/ibb"};
    }

    /* access modifiers changed from: 0000 */
    public InputStream negotiateIncomingStream(Stanza stanza) throws NotConnectedException {
        InBandBytestreamSession accept = new ByteStreamRequest(this.manager, (Open) stanza).accept();
        accept.setCloseBothStreamsEnabled(true);
        return accept.getInputStream();
    }

    public void newStreamInitiation(String str, String str2) {
        this.manager.ignoreBytestreamRequestOnce(str2);
    }
}
