package org.jivesoftware.smackx.filetransfer;

import java.io.InputStream;
import java.io.OutputStream;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Open;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream;
import org.jivesoftware.smackx.p558si.packet.StreamInitiation;

public class FaultTolerantNegotiator extends StreamNegotiator {
    private final XMPPConnection connection;
    private final StreamNegotiator primaryNegotiator;
    private final StreamNegotiator secondaryNegotiator;

    public FaultTolerantNegotiator(XMPPConnection xMPPConnection, StreamNegotiator streamNegotiator, StreamNegotiator streamNegotiator2) {
        this.primaryNegotiator = streamNegotiator;
        this.secondaryNegotiator = streamNegotiator2;
        this.connection = xMPPConnection;
    }

    private StreamNegotiator determineNegotiator(Stanza stanza) {
        if (stanza instanceof Bytestream) {
            return this.primaryNegotiator;
        }
        if (stanza instanceof Open) {
            return this.secondaryNegotiator;
        }
        throw new IllegalStateException("Unknown stream initation type");
    }

    public InputStream createIncomingStream(StreamInitiation streamInitiation) throws SmackException, XMPPErrorException {
        C15617IQ initiateIncomingStream = initiateIncomingStream(this.connection, streamInitiation);
        try {
            return determineNegotiator(initiateIncomingStream).negotiateIncomingStream(initiateIncomingStream);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    public OutputStream createOutgoingStream(String str, String str2, String str3) throws SmackException, XMPPException {
        try {
            return this.primaryNegotiator.createOutgoingStream(str, str2, str3);
        } catch (Exception unused) {
            return this.secondaryNegotiator.createOutgoingStream(str, str2, str3);
        }
    }

    public String[] getNamespaces() {
        String[] namespaces = this.primaryNegotiator.getNamespaces();
        String[] namespaces2 = this.secondaryNegotiator.getNamespaces();
        String[] strArr = new String[(namespaces.length + namespaces2.length)];
        System.arraycopy(namespaces, 0, strArr, 0, namespaces.length);
        System.arraycopy(namespaces2, 0, strArr, namespaces.length, namespaces2.length);
        return strArr;
    }

    /* access modifiers changed from: 0000 */
    public InputStream negotiateIncomingStream(Stanza stanza) {
        throw new UnsupportedOperationException("Negotiation only handled by create incoming stream method.");
    }

    public void newStreamInitiation(String str, String str2) {
        this.primaryNegotiator.newStreamInitiation(str, str2);
        this.secondaryNegotiator.newStreamInitiation(str, str2);
    }
}
