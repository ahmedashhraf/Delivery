package org.jivesoftware.smackx.bytestreams.ibb;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.jivesoftware.smack.AbstractConnectionClosedListener;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.bytestreams.BytestreamListener;
import org.jivesoftware.smackx.bytestreams.BytestreamManager;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Open;

public class InBandBytestreamManager implements BytestreamManager {
    public static final int MAXIMUM_BLOCK_SIZE = 65535;
    private static final String SESSION_ID_PREFIX = "jibb_";
    private static final Map<XMPPConnection, InBandBytestreamManager> managers = new HashMap();
    private static final Random randomGenerator = new Random();
    private final List<BytestreamListener> allRequestListeners = Collections.synchronizedList(new LinkedList());
    private final CloseListener closeListener;
    private final XMPPConnection connection;
    private final DataListener dataListener;
    private int defaultBlockSize = 4096;
    private List<String> ignoredBytestreamRequests = Collections.synchronizedList(new LinkedList());
    private final InitiationListener initiationListener;
    private int maximumBlockSize = 65535;
    private final Map<String, InBandBytestreamSession> sessions = new ConcurrentHashMap();
    private StanzaType stanza = StanzaType.IQ;
    private final Map<String, BytestreamListener> userListeners = new ConcurrentHashMap();

    public enum StanzaType {
        IQ,
        MESSAGE
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(final XMPPConnection xMPPConnection) {
                InBandBytestreamManager.getByteStreamManager(xMPPConnection);
                xMPPConnection.addConnectionListener(new AbstractConnectionClosedListener() {
                    public void connectionTerminated() {
                        InBandBytestreamManager.getByteStreamManager(xMPPConnection).disableService();
                    }

                    public void reconnectionSuccessful() {
                        InBandBytestreamManager.getByteStreamManager(xMPPConnection);
                    }
                });
            }
        });
    }

    private InBandBytestreamManager(XMPPConnection xMPPConnection) {
        this.connection = xMPPConnection;
        this.initiationListener = new InitiationListener(this);
        xMPPConnection.registerIQRequestHandler(this.initiationListener);
        this.dataListener = new DataListener(this);
        xMPPConnection.registerIQRequestHandler(this.dataListener);
        this.closeListener = new CloseListener(this);
        xMPPConnection.registerIQRequestHandler(this.closeListener);
    }

    /* access modifiers changed from: private */
    public void disableService() {
        managers.remove(this.connection);
        this.connection.unregisterIQRequestHandler(this.initiationListener);
        this.connection.unregisterIQRequestHandler(this.dataListener);
        this.connection.unregisterIQRequestHandler(this.closeListener);
        this.initiationListener.shutdown();
        this.userListeners.clear();
        this.allRequestListeners.clear();
        this.sessions.clear();
        this.ignoredBytestreamRequests.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager getByteStreamManager(org.jivesoftware.smack.XMPPConnection r3) {
        /*
            java.lang.Class<org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager> r0 = org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager.class
            monitor-enter(r0)
            if (r3 != 0) goto L_0x0008
            r3 = 0
            monitor-exit(r0)
            return r3
        L_0x0008:
            java.util.Map<org.jivesoftware.smack.XMPPConnection, org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager> r1 = managers     // Catch:{ all -> 0x001e }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x001e }
            org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager r1 = (org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager) r1     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x001c
            org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager r1 = new org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager     // Catch:{ all -> 0x001e }
            r1.<init>(r3)     // Catch:{ all -> 0x001e }
            java.util.Map<org.jivesoftware.smack.XMPPConnection, org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager> r2 = managers     // Catch:{ all -> 0x001e }
            r2.put(r3, r1)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)
            return r1
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager.getByteStreamManager(org.jivesoftware.smack.XMPPConnection):org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager");
    }

    private String getNextSessionID() {
        StringBuilder sb = new StringBuilder();
        sb.append(SESSION_ID_PREFIX);
        sb.append(Math.abs(randomGenerator.nextLong()));
        return sb.toString();
    }

    public void addIncomingBytestreamListener(BytestreamListener bytestreamListener) {
        this.allRequestListeners.add(bytestreamListener);
    }

    /* access modifiers changed from: protected */
    public List<BytestreamListener> getAllRequestListeners() {
        return this.allRequestListeners;
    }

    /* access modifiers changed from: protected */
    public XMPPConnection getConnection() {
        return this.connection;
    }

    public int getDefaultBlockSize() {
        return this.defaultBlockSize;
    }

    /* access modifiers changed from: protected */
    public List<String> getIgnoredBytestreamRequests() {
        return this.ignoredBytestreamRequests;
    }

    public int getMaximumBlockSize() {
        return this.maximumBlockSize;
    }

    /* access modifiers changed from: protected */
    public Map<String, InBandBytestreamSession> getSessions() {
        return this.sessions;
    }

    public StanzaType getStanza() {
        return this.stanza;
    }

    /* access modifiers changed from: protected */
    public BytestreamListener getUserListener(String str) {
        return (BytestreamListener) this.userListeners.get(str);
    }

    public void ignoreBytestreamRequestOnce(String str) {
        this.ignoredBytestreamRequests.add(str);
    }

    public void removeIncomingBytestreamListener(BytestreamListener bytestreamListener) {
        this.allRequestListeners.remove(bytestreamListener);
    }

    /* access modifiers changed from: protected */
    public void replyItemNotFoundPacket(C15617IQ iq) throws NotConnectedException {
        this.connection.sendStanza(C15617IQ.createErrorResponse(iq, new XMPPError(Condition.item_not_found)));
    }

    /* access modifiers changed from: protected */
    public void replyRejectPacket(C15617IQ iq) throws NotConnectedException {
        this.connection.sendStanza(C15617IQ.createErrorResponse(iq, new XMPPError(Condition.not_acceptable)));
    }

    /* access modifiers changed from: protected */
    public void replyResourceConstraintPacket(C15617IQ iq) throws NotConnectedException {
        this.connection.sendStanza(C15617IQ.createErrorResponse(iq, new XMPPError(Condition.resource_constraint)));
    }

    public void setDefaultBlockSize(int i) {
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("Default block size must be between 1 and 65535");
        }
        this.defaultBlockSize = i;
    }

    public void setMaximumBlockSize(int i) {
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("Maximum block size must be between 1 and 65535");
        }
        this.maximumBlockSize = i;
    }

    public void setStanza(StanzaType stanzaType) {
        this.stanza = stanzaType;
    }

    public void addIncomingBytestreamListener(BytestreamListener bytestreamListener, String str) {
        this.userListeners.put(str, bytestreamListener);
    }

    public void removeIncomingBytestreamListener(String str) {
        this.userListeners.remove(str);
    }

    public InBandBytestreamSession establishSession(String str) throws XMPPException, SmackException {
        return establishSession(str, getNextSessionID());
    }

    public InBandBytestreamSession establishSession(String str, String str2) throws NoResponseException, XMPPErrorException, NotConnectedException {
        Open open = new Open(str2, this.defaultBlockSize, this.stanza);
        open.setTo(str);
        this.connection.createPacketCollectorAndSend(open).nextResultOrThrow();
        InBandBytestreamSession inBandBytestreamSession = new InBandBytestreamSession(this.connection, open, str);
        this.sessions.put(str2, inBandBytestreamSession);
        return inBandBytestreamSession;
    }
}
