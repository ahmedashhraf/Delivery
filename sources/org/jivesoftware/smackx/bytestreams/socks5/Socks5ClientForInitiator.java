package org.jivesoftware.smackx.bytestreams.socks5;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeoutException;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.StreamHost;

class Socks5ClientForInitiator extends Socks5Client {
    private WeakReference<XMPPConnection> connection;
    private String sessionID;
    private String target;

    public Socks5ClientForInitiator(StreamHost streamHost, String str, XMPPConnection xMPPConnection, String str2, String str3) {
        super(streamHost, str);
        this.connection = new WeakReference<>(xMPPConnection);
        this.sessionID = str2;
        this.target = str3;
    }

    private void activate() throws NoResponseException, XMPPErrorException, NotConnectedException {
        ((XMPPConnection) this.connection.get()).createPacketCollectorAndSend(createStreamHostActivation()).nextResultOrThrow();
    }

    private Bytestream createStreamHostActivation() {
        Bytestream bytestream = new Bytestream(this.sessionID);
        bytestream.setMode(null);
        bytestream.setType(Type.set);
        bytestream.setTo(this.streamHost.getJID());
        bytestream.setToActivate(this.target);
        return bytestream;
    }

    public Socket getSocket(int i) throws IOException, InterruptedException, TimeoutException, XMPPException, SmackException {
        Socket socket;
        if (this.streamHost.getJID().equals(((XMPPConnection) this.connection.get()).getUser())) {
            socket = Socks5Proxy.getSocks5Proxy().getSocket(this.digest);
            if (socket == null) {
                throw new SmackException("target is not connected to SOCKS5 proxy");
            }
        } else {
            socket = super.getSocket(i);
            try {
                activate();
            } catch (XMPPException e) {
                socket.close();
                throw e;
            } catch (NoResponseException e2) {
                socket.close();
                throw e2;
            }
        }
        return socket;
    }
}
