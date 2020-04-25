package org.jivesoftware.smackx.filetransfer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager;
import org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamRequest;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream;
import org.jivesoftware.smackx.p558si.packet.StreamInitiation;

public class Socks5TransferNegotiator extends StreamNegotiator {
    private XMPPConnection connection;
    private Socks5BytestreamManager manager = Socks5BytestreamManager.getBytestreamManager(this.connection);

    private static class ByteStreamRequest extends Socks5BytestreamRequest {
        private ByteStreamRequest(Socks5BytestreamManager socks5BytestreamManager, Bytestream bytestream) {
            super(socks5BytestreamManager, bytestream);
        }
    }

    Socks5TransferNegotiator(XMPPConnection xMPPConnection) {
        this.connection = xMPPConnection;
    }

    public InputStream createIncomingStream(StreamInitiation streamInitiation) throws XMPPErrorException, InterruptedException, SmackException {
        this.manager.ignoreBytestreamRequestOnce(streamInitiation.getSessionID());
        return negotiateIncomingStream(initiateIncomingStream(this.connection, streamInitiation));
    }

    public OutputStream createOutgoingStream(String str, String str2, String str3) throws NoResponseException, SmackException, XMPPException {
        String str4 = "error establishing SOCKS5 Bytestream";
        try {
            return this.manager.establishSession(str3, str).getOutputStream();
        } catch (IOException e) {
            throw new SmackException(str4, e);
        } catch (InterruptedException e2) {
            throw new SmackException(str4, e2);
        }
    }

    public String[] getNamespaces() {
        return new String[]{Bytestream.NAMESPACE};
    }

    /* access modifiers changed from: 0000 */
    public InputStream negotiateIncomingStream(Stanza stanza) throws InterruptedException, SmackException, XMPPErrorException {
        try {
            PushbackInputStream pushbackInputStream = new PushbackInputStream(new ByteStreamRequest(this.manager, (Bytestream) stanza).accept().getInputStream());
            pushbackInputStream.unread(pushbackInputStream.read());
            return pushbackInputStream;
        } catch (IOException e) {
            throw new SmackException("Error establishing input stream", e);
        }
    }

    public void newStreamInitiation(String str, String str2) {
        this.manager.ignoreBytestreamRequestOnce(str2);
    }
}
