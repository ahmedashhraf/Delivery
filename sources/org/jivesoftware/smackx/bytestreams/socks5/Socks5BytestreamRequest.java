package org.jivesoftware.smackx.bytestreams.socks5;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.bytestreams.BytestreamRequest;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.StreamHost;
import p205i.p486d.p487a.p488c.C14056a;
import p205i.p486d.p487a.p488c.C14057b;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;

public class Socks5BytestreamRequest implements BytestreamRequest {
    private static final C14056a<String, Integer> ADDRESS_BLACKLIST = new C14057b(100, BLACKLIST_LIFETIME);
    private static final long BLACKLIST_LIFETIME = 7200000;
    private static final int BLACKLIST_MAX_SIZE = 100;
    private static int CONNECTION_FAILURE_THRESHOLD = 2;
    private Bytestream bytestreamRequest;
    private Socks5BytestreamManager manager;
    private int minimumConnectTimeout = 2000;
    private int totalConnectTimeout = C14236a.DEFAULT_TIMEOUT;

    protected Socks5BytestreamRequest(Socks5BytestreamManager socks5BytestreamManager, Bytestream bytestream) {
        this.manager = socks5BytestreamManager;
        this.bytestreamRequest = bytestream;
    }

    private void cancelRequest() throws XMPPErrorException, NotConnectedException {
        String str = "Could not establish socket with any provided host";
        XMPPError from = XMPPError.from(Condition.item_not_found, str);
        this.manager.getConnection().sendStanza(C15617IQ.createErrorResponse(this.bytestreamRequest, from));
        throw new XMPPErrorException(str, from);
    }

    private Bytestream createUsedHostResponse(StreamHost streamHost) {
        Bytestream bytestream = new Bytestream(this.bytestreamRequest.getSessionID());
        bytestream.setTo(this.bytestreamRequest.getFrom());
        bytestream.setType(Type.result);
        bytestream.setStanzaId(this.bytestreamRequest.getStanzaId());
        bytestream.setUsedHost(streamHost.getJID());
        return bytestream;
    }

    public static int getConnectFailureThreshold() {
        return CONNECTION_FAILURE_THRESHOLD;
    }

    private int getConnectionFailures(String str) {
        Integer num = (Integer) ADDRESS_BLACKLIST.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private void incrementConnectionFailures(String str) {
        Integer num = (Integer) ADDRESS_BLACKLIST.get(str);
        C14056a<String, Integer> aVar = ADDRESS_BLACKLIST;
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        aVar.put(str, Integer.valueOf(i));
    }

    public static void setConnectFailureThreshold(int i) {
        CONNECTION_FAILURE_THRESHOLD = i;
    }

    public String getFrom() {
        return this.bytestreamRequest.getFrom();
    }

    public int getMinimumConnectTimeout() {
        int i = this.minimumConnectTimeout;
        if (i <= 0) {
            return 2000;
        }
        return i;
    }

    public String getSessionID() {
        return this.bytestreamRequest.getSessionID();
    }

    public int getTotalConnectTimeout() {
        int i = this.totalConnectTimeout;
        return i <= 0 ? C14236a.DEFAULT_TIMEOUT : i;
    }

    public void reject() throws NotConnectedException {
        this.manager.replyRejectPacket(this.bytestreamRequest);
    }

    public void setMinimumConnectTimeout(int i) {
        this.minimumConnectTimeout = i;
    }

    public void setTotalConnectTimeout(int i) {
        this.totalConnectTimeout = i;
    }

    public Socks5BytestreamSession accept() throws InterruptedException, XMPPErrorException, SmackException {
        StreamHost streamHost;
        Socket socket;
        List streamHosts = this.bytestreamRequest.getStreamHosts();
        if (streamHosts.size() == 0) {
            cancelRequest();
        }
        String createDigest = Socks5Utils.createDigest(this.bytestreamRequest.getSessionID(), this.bytestreamRequest.getFrom(), this.manager.getConnection().getUser());
        int max = Math.max(getTotalConnectTimeout() / streamHosts.size(), getMinimumConnectTimeout());
        Iterator it = streamHosts.iterator();
        while (true) {
            streamHost = null;
            if (!it.hasNext()) {
                socket = null;
                break;
            }
            streamHost = (StreamHost) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(streamHost.getAddress());
            sb.append(":");
            sb.append(streamHost.getPort());
            String sb2 = sb.toString();
            int connectionFailures = getConnectionFailures(sb2);
            int i = CONNECTION_FAILURE_THRESHOLD;
            if (i <= 0 || connectionFailures < i) {
                try {
                    socket = new Socks5Client(streamHost, createDigest).getSocket(max);
                    break;
                } catch (TimeoutException unused) {
                    incrementConnectionFailures(sb2);
                } catch (IOException unused2) {
                    incrementConnectionFailures(sb2);
                } catch (XMPPException unused3) {
                    incrementConnectionFailures(sb2);
                }
            }
        }
        if (streamHost == null || socket == null) {
            cancelRequest();
        }
        this.manager.getConnection().sendStanza(createUsedHostResponse(streamHost));
        return new Socks5BytestreamSession(socket, streamHost.getJID().equals(this.bytestreamRequest.getFrom()));
    }
}
