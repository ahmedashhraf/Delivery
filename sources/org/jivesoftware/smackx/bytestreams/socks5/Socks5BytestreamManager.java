package org.jivesoftware.smackx.bytestreams.socks5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.bytestreams.BytestreamListener;
import org.jivesoftware.smackx.bytestreams.BytestreamManager;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.StreamHost;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;

public final class Socks5BytestreamManager extends Manager implements BytestreamManager {
    private static final String SESSION_ID_PREFIX = "js5_";
    private static final Map<XMPPConnection, Socks5BytestreamManager> managers = new WeakHashMap();
    private static final Random randomGenerator = new Random();
    private final List<BytestreamListener> allRequestListeners = Collections.synchronizedList(new LinkedList());
    private List<String> ignoredBytestreamRequests = Collections.synchronizedList(new LinkedList());
    private final InitiationListener initiationListener = new InitiationListener(this);
    private String lastWorkingProxy = null;
    private final List<String> proxyBlacklist = Collections.synchronizedList(new LinkedList());
    private int proxyConnectionTimeout = C14236a.DEFAULT_TIMEOUT;
    private boolean proxyPrioritizationEnabled = true;
    private int targetResponseTimeout = C14236a.DEFAULT_TIMEOUT;
    private final Map<String, BytestreamListener> userListeners = new ConcurrentHashMap();

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                Socks5BytestreamManager.getBytestreamManager(xMPPConnection);
            }
        });
    }

    private Socks5BytestreamManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        activate();
    }

    private void activate() {
        connection().registerIQRequestHandler(this.initiationListener);
        enableService();
    }

    private Bytestream createBytestreamInitiation(String str, String str2, List<StreamHost> list) {
        Bytestream bytestream = new Bytestream(str);
        for (StreamHost addStreamHost : list) {
            bytestream.addStreamHost(addStreamHost);
        }
        bytestream.setType(Type.set);
        bytestream.setTo(str2);
        return bytestream;
    }

    private Bytestream createStreamHostRequest(String str) {
        Bytestream bytestream = new Bytestream();
        bytestream.setType(Type.get);
        bytestream.setTo(str);
        return bytestream;
    }

    private List<String> determineProxies() throws NoResponseException, XMPPErrorException, NotConnectedException {
        XMPPConnection connection = connection();
        ServiceDiscoveryManager instanceFor = ServiceDiscoveryManager.getInstanceFor(connection);
        ArrayList arrayList = new ArrayList();
        for (Item item : instanceFor.discoverItems(connection.getServiceName()).getItems()) {
            if (!this.proxyBlacklist.contains(item.getEntityID())) {
                try {
                    if (instanceFor.discoverInfo(item.getEntityID()).hasIdentity("proxy", "bytestreams")) {
                        arrayList.add(item.getEntityID());
                    } else {
                        this.proxyBlacklist.add(item.getEntityID());
                    }
                } catch (NoResponseException | XMPPErrorException unused) {
                    this.proxyBlacklist.add(item.getEntityID());
                }
            }
        }
        return arrayList;
    }

    private List<StreamHost> determineStreamHostInfos(List<String> list) {
        XMPPConnection connection = connection();
        ArrayList arrayList = new ArrayList();
        List localStreamHost = getLocalStreamHost();
        if (localStreamHost != null) {
            arrayList.addAll(localStreamHost);
        }
        for (String str : list) {
            try {
                arrayList.addAll(((Bytestream) connection.createPacketCollectorAndSend(createStreamHostRequest(str)).nextResultOrThrow()).getStreamHosts());
            } catch (Exception unused) {
                this.proxyBlacklist.add(str);
            }
        }
        return arrayList;
    }

    private void enableService() {
        ServiceDiscoveryManager.getInstanceFor(connection()).addFeature(Bytestream.NAMESPACE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager getBytestreamManager(org.jivesoftware.smack.XMPPConnection r3) {
        /*
            java.lang.Class<org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager> r0 = org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager.class
            monitor-enter(r0)
            if (r3 != 0) goto L_0x0008
            r3 = 0
            monitor-exit(r0)
            return r3
        L_0x0008:
            java.util.Map<org.jivesoftware.smack.XMPPConnection, org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager> r1 = managers     // Catch:{ all -> 0x001e }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x001e }
            org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager r1 = (org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager) r1     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x001c
            org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager r1 = new org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager     // Catch:{ all -> 0x001e }
            r1.<init>(r3)     // Catch:{ all -> 0x001e }
            java.util.Map<org.jivesoftware.smack.XMPPConnection, org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager> r2 = managers     // Catch:{ all -> 0x001e }
            r2.put(r3, r1)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)
            return r1
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager.getBytestreamManager(org.jivesoftware.smack.XMPPConnection):org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager");
    }

    private List<StreamHost> getLocalStreamHost() {
        XMPPConnection connection = connection();
        Socks5Proxy socks5Proxy = Socks5Proxy.getSocks5Proxy();
        if (!socks5Proxy.isRunning()) {
            return null;
        }
        List<String> localAddresses = socks5Proxy.getLocalAddresses();
        if (localAddresses.isEmpty()) {
            return null;
        }
        int port = socks5Proxy.getPort();
        ArrayList arrayList = new ArrayList();
        for (String str : localAddresses) {
            int i = 0;
            String[] strArr = {"127.0.0.1", "0:0:0:0:0:0:0:1", "::1"};
            int length = strArr.length;
            while (true) {
                if (i >= length) {
                    arrayList.add(new StreamHost(connection.getUser(), str, port));
                    break;
                } else if (str.startsWith(strArr[i])) {
                    break;
                } else {
                    i++;
                }
            }
        }
        return arrayList;
    }

    private String getNextSessionID() {
        StringBuilder sb = new StringBuilder();
        sb.append(SESSION_ID_PREFIX);
        sb.append(Math.abs(randomGenerator.nextLong()));
        return sb.toString();
    }

    private boolean supportsSocks5(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(str, Bytestream.NAMESPACE);
    }

    public void addIncomingBytestreamListener(BytestreamListener bytestreamListener) {
        this.allRequestListeners.add(bytestreamListener);
    }

    public synchronized void disableService() {
        XMPPConnection connection = connection();
        connection.unregisterIQRequestHandler(this.initiationListener);
        this.initiationListener.shutdown();
        this.allRequestListeners.clear();
        this.userListeners.clear();
        this.lastWorkingProxy = null;
        this.proxyBlacklist.clear();
        this.ignoredBytestreamRequests.clear();
        managers.remove(connection);
        if (managers.size() == 0) {
            Socks5Proxy.getSocks5Proxy().stop();
        }
        ServiceDiscoveryManager instanceFor = ServiceDiscoveryManager.getInstanceFor(connection);
        if (instanceFor != null) {
            instanceFor.removeFeature(Bytestream.NAMESPACE);
        }
    }

    /* access modifiers changed from: protected */
    public List<BytestreamListener> getAllRequestListeners() {
        return this.allRequestListeners;
    }

    /* access modifiers changed from: protected */
    public XMPPConnection getConnection() {
        return connection();
    }

    /* access modifiers changed from: protected */
    public List<String> getIgnoredBytestreamRequests() {
        return this.ignoredBytestreamRequests;
    }

    public int getProxyConnectionTimeout() {
        if (this.proxyConnectionTimeout <= 0) {
            this.proxyConnectionTimeout = C14236a.DEFAULT_TIMEOUT;
        }
        return this.proxyConnectionTimeout;
    }

    public int getTargetResponseTimeout() {
        if (this.targetResponseTimeout <= 0) {
            this.targetResponseTimeout = C14236a.DEFAULT_TIMEOUT;
        }
        return this.targetResponseTimeout;
    }

    /* access modifiers changed from: protected */
    public BytestreamListener getUserListener(String str) {
        return (BytestreamListener) this.userListeners.get(str);
    }

    public void ignoreBytestreamRequestOnce(String str) {
        this.ignoredBytestreamRequests.add(str);
    }

    public boolean isProxyPrioritizationEnabled() {
        return this.proxyPrioritizationEnabled;
    }

    public void removeIncomingBytestreamListener(BytestreamListener bytestreamListener) {
        this.allRequestListeners.remove(bytestreamListener);
    }

    /* access modifiers changed from: protected */
    public void replyRejectPacket(C15617IQ iq) throws NotConnectedException {
        connection().sendStanza(C15617IQ.createErrorResponse(iq, new XMPPError(Condition.not_acceptable)));
    }

    public void setProxyConnectionTimeout(int i) {
        this.proxyConnectionTimeout = i;
    }

    public void setProxyPrioritizationEnabled(boolean z) {
        this.proxyPrioritizationEnabled = z;
    }

    public void setTargetResponseTimeout(int i) {
        this.targetResponseTimeout = i;
    }

    public void addIncomingBytestreamListener(BytestreamListener bytestreamListener, String str) {
        this.userListeners.put(str, bytestreamListener);
    }

    public void removeIncomingBytestreamListener(String str) {
        this.userListeners.remove(str);
    }

    public Socks5BytestreamSession establishSession(String str) throws XMPPException, IOException, InterruptedException, SmackException {
        return establishSession(str, getNextSessionID());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:36|37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c3, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        throw new java.io.IOException("Timeout while connecting to SOCKS5 proxy");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        r8.removeTransfer(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d0, code lost:
        throw r12;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00c5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamSession establishSession(java.lang.String r12, java.lang.String r13) throws java.io.IOException, java.lang.InterruptedException, org.jivesoftware.smack.SmackException.NoResponseException, org.jivesoftware.smack.SmackException, org.jivesoftware.smack.XMPPException {
        /*
            r11 = this;
            org.jivesoftware.smack.XMPPConnection r6 = r11.connection()
            boolean r0 = r11.supportsSocks5(r12)
            if (r0 == 0) goto L_0x00d1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.List r2 = r11.determineProxies()     // Catch:{ XMPPErrorException -> 0x0019 }
            r0.addAll(r2)     // Catch:{ XMPPErrorException -> 0x0019 }
            r2 = r1
            goto L_0x001a
        L_0x0019:
            r2 = move-exception
        L_0x001a:
            java.util.List r0 = r11.determineStreamHostInfos(r0)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x002f
            if (r2 == 0) goto L_0x0027
            throw r2
        L_0x0027:
            org.jivesoftware.smack.SmackException r12 = new org.jivesoftware.smack.SmackException
            java.lang.String r13 = "no SOCKS5 proxies available"
            r12.<init>(r13)
            throw r12
        L_0x002f:
            java.lang.String r2 = r6.getUser()
            java.lang.String r7 = org.jivesoftware.smackx.bytestreams.socks5.Socks5Utils.createDigest(r13, r2, r12)
            boolean r2 = r11.proxyPrioritizationEnabled
            if (r2 == 0) goto L_0x0065
            java.lang.String r2 = r11.lastWorkingProxy
            if (r2 == 0) goto L_0x0065
            java.util.Iterator r2 = r0.iterator()
        L_0x0043:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005c
            java.lang.Object r3 = r2.next()
            org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream$StreamHost r3 = (org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.StreamHost) r3
            java.lang.String r4 = r3.getJID()
            java.lang.String r5 = r11.lastWorkingProxy
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0043
            r1 = r3
        L_0x005c:
            if (r1 == 0) goto L_0x0065
            r0.remove(r1)
            r2 = 0
            r0.add(r2, r1)
        L_0x0065:
            org.jivesoftware.smackx.bytestreams.socks5.Socks5Proxy r8 = org.jivesoftware.smackx.bytestreams.socks5.Socks5Proxy.getSocks5Proxy()
            r8.addTransfer(r7)     // Catch:{ TimeoutException -> 0x00c5 }
            org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream r0 = r11.createBytestreamInitiation(r13, r12, r0)     // Catch:{ TimeoutException -> 0x00c5 }
            org.jivesoftware.smack.PacketCollector r1 = r6.createPacketCollectorAndSend(r0)     // Catch:{ TimeoutException -> 0x00c5 }
            int r2 = r11.getTargetResponseTimeout()     // Catch:{ TimeoutException -> 0x00c5 }
            long r2 = (long) r2     // Catch:{ TimeoutException -> 0x00c5 }
            org.jivesoftware.smack.packet.Stanza r1 = r1.nextResultOrThrow(r2)     // Catch:{ TimeoutException -> 0x00c5 }
            org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream r1 = (org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream) r1     // Catch:{ TimeoutException -> 0x00c5 }
            org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream$StreamHostUsed r1 = r1.getUsedHost()     // Catch:{ TimeoutException -> 0x00c5 }
            java.lang.String r1 = r1.getJID()     // Catch:{ TimeoutException -> 0x00c5 }
            org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream$StreamHost r9 = r0.getStreamHost(r1)     // Catch:{ TimeoutException -> 0x00c5 }
            if (r9 == 0) goto L_0x00bb
            org.jivesoftware.smackx.bytestreams.socks5.Socks5ClientForInitiator r10 = new org.jivesoftware.smackx.bytestreams.socks5.Socks5ClientForInitiator     // Catch:{ TimeoutException -> 0x00c5 }
            r0 = r10
            r1 = r9
            r2 = r7
            r3 = r6
            r4 = r13
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ TimeoutException -> 0x00c5 }
            int r12 = r11.getProxyConnectionTimeout()     // Catch:{ TimeoutException -> 0x00c5 }
            java.net.Socket r12 = r10.getSocket(r12)     // Catch:{ TimeoutException -> 0x00c5 }
            java.lang.String r13 = r9.getJID()     // Catch:{ TimeoutException -> 0x00c5 }
            r11.lastWorkingProxy = r13     // Catch:{ TimeoutException -> 0x00c5 }
            org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamSession r13 = new org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamSession     // Catch:{ TimeoutException -> 0x00c5 }
            java.lang.String r0 = r9.getJID()     // Catch:{ TimeoutException -> 0x00c5 }
            java.lang.String r1 = r6.getUser()     // Catch:{ TimeoutException -> 0x00c5 }
            boolean r0 = r0.equals(r1)     // Catch:{ TimeoutException -> 0x00c5 }
            r13.<init>(r12, r0)     // Catch:{ TimeoutException -> 0x00c5 }
            r8.removeTransfer(r7)
            return r13
        L_0x00bb:
            org.jivesoftware.smack.SmackException r12 = new org.jivesoftware.smack.SmackException     // Catch:{ TimeoutException -> 0x00c5 }
            java.lang.String r13 = "Remote user responded with unknown host"
            r12.<init>(r13)     // Catch:{ TimeoutException -> 0x00c5 }
            throw r12     // Catch:{ TimeoutException -> 0x00c5 }
        L_0x00c3:
            r12 = move-exception
            goto L_0x00cd
        L_0x00c5:
            java.io.IOException r12 = new java.io.IOException     // Catch:{ all -> 0x00c3 }
            java.lang.String r13 = "Timeout while connecting to SOCKS5 proxy"
            r12.<init>(r13)     // Catch:{ all -> 0x00c3 }
            throw r12     // Catch:{ all -> 0x00c3 }
        L_0x00cd:
            r8.removeTransfer(r7)
            throw r12
        L_0x00d1:
            org.jivesoftware.smack.SmackException$FeatureNotSupportedException r13 = new org.jivesoftware.smack.SmackException$FeatureNotSupportedException
            java.lang.String r0 = "SOCKS5 Bytestream"
            r13.<init>(r0, r12)
            goto L_0x00da
        L_0x00d9:
            throw r13
        L_0x00da:
            goto L_0x00d9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager.establishSession(java.lang.String, java.lang.String):org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamSession");
    }
}
