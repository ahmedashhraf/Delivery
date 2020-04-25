package org.jivesoftware.smackx.ping;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.jivesoftware.smack.AbstractConnectionClosedListener;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.util.SmackExecutorThreadFactory;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.ping.packet.Ping;

public class PingManager extends Manager {
    private static final Map<XMPPConnection, PingManager> INSTANCES = new WeakHashMap();
    /* access modifiers changed from: private */
    public static final Logger LOGGER = Logger.getLogger(PingManager.class.getName());
    private static int defaultPingInterval = 1800;
    private final ScheduledExecutorService executorService;
    private ScheduledFuture<?> nextAutomaticPing;
    private final Set<PingFailedListener> pingFailedListeners = Collections.synchronizedSet(new HashSet());
    private int pingInterval = defaultPingInterval;
    private final Runnable pingServerRunnable = new Runnable() {
        public void run() {
            PingManager.LOGGER.fine("ServerPingTask run()");
            PingManager.this.pingServerIfNecessary();
        }
    };

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                PingManager.getInstanceFor(xMPPConnection);
            }
        });
    }

    private PingManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.executorService = Executors.newSingleThreadScheduledExecutor(new SmackExecutorThreadFactory(xMPPConnection.getConnectionCounter(), "Ping"));
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature(Ping.NAMESPACE);
        C157072 r2 = new AbstractIqRequestHandler(Ping.ELEMENT, Ping.NAMESPACE, Type.get, Mode.async) {
            public C15617IQ handleIQRequest(C15617IQ iq) {
                return ((Ping) iq).getPong();
            }
        };
        xMPPConnection.registerIQRequestHandler(r2);
        xMPPConnection.addConnectionListener(new AbstractConnectionClosedListener() {
            public void authenticated(XMPPConnection xMPPConnection, boolean z) {
                PingManager.this.maybeSchedulePingServerTask();
            }

            public void connectionTerminated() {
                PingManager.this.maybeStopPingServerTask();
            }
        });
        maybeSchedulePingServerTask();
    }

    public static synchronized PingManager getInstanceFor(XMPPConnection xMPPConnection) {
        PingManager pingManager;
        synchronized (PingManager.class) {
            pingManager = (PingManager) INSTANCES.get(xMPPConnection);
            if (pingManager == null) {
                pingManager = new PingManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, pingManager);
            }
        }
        return pingManager;
    }

    /* access modifiers changed from: private */
    public void maybeSchedulePingServerTask() {
        maybeSchedulePingServerTask(0);
    }

    /* access modifiers changed from: private */
    public void maybeStopPingServerTask() {
        ScheduledFuture<?> scheduledFuture = this.nextAutomaticPing;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.nextAutomaticPing = null;
        }
    }

    public static void setDefaultPingInterval(int i) {
        defaultPingInterval = i;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        LOGGER.fine("finalizing PingManager: Shutting down executor service");
        try {
            this.executorService.shutdown();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
        super.finalize();
    }

    public int getPingInterval() {
        return this.pingInterval;
    }

    public boolean isPingSupported(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(str, Ping.NAMESPACE);
    }

    public boolean ping(String str, long j) throws NotConnectedException, NoResponseException {
        XMPPConnection connection = connection();
        if (connection.isAuthenticated()) {
            try {
                connection.createPacketCollectorAndSend(new Ping(str)).nextResultOrThrow(j);
                return true;
            } catch (XMPPException unused) {
                return str.equals(connection.getServiceName());
            }
        } else {
            throw new NotConnectedException();
        }
    }

    public boolean pingMyServer() throws NotConnectedException {
        return pingMyServer(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0079, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void pingServerIfNecessary() {
        /*
            r8 = this;
            monitor-enter(r8)
            org.jivesoftware.smack.XMPPConnection r0 = r8.connection()     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r8)
            return
        L_0x0009:
            int r1 = r8.pingInterval     // Catch:{ all -> 0x007a }
            if (r1 > 0) goto L_0x000f
            monitor-exit(r8)
            return
        L_0x000f:
            long r1 = r0.getLastStanzaReceived()     // Catch:{ all -> 0x007a }
            r3 = 0
            r5 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x002b
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007a }
            long r3 = r3 - r1
            long r3 = r3 / r5
            int r1 = (int) r3     // Catch:{ all -> 0x007a }
            int r2 = r8.pingInterval     // Catch:{ all -> 0x007a }
            if (r1 >= r2) goto L_0x002b
            r8.maybeSchedulePingServerTask(r1)     // Catch:{ all -> 0x007a }
            monitor-exit(r8)
            return
        L_0x002b:
            boolean r0 = r0.isAuthenticated()     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0071
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x0034:
            r3 = 3
            if (r1 >= r3) goto L_0x0055
            if (r1 == 0) goto L_0x003f
            java.lang.Thread.sleep(r5)     // Catch:{ InterruptedException -> 0x003d }
            goto L_0x003f
        L_0x003d:
            monitor-exit(r8)
            return
        L_0x003f:
            boolean r2 = r8.pingMyServer(r0)     // Catch:{ SmackException -> 0x0044 }
            goto L_0x004f
        L_0x0044:
            r2 = move-exception
            java.util.logging.Logger r3 = LOGGER     // Catch:{ all -> 0x007a }
            java.util.logging.Level r4 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x007a }
            java.lang.String r7 = "SmackError while pinging server"
            r3.log(r4, r7, r2)     // Catch:{ all -> 0x007a }
            r2 = 0
        L_0x004f:
            if (r2 == 0) goto L_0x0052
            goto L_0x0055
        L_0x0052:
            int r1 = r1 + 1
            goto L_0x0034
        L_0x0055:
            if (r2 != 0) goto L_0x006d
            java.util.Set<org.jivesoftware.smackx.ping.PingFailedListener> r0 = r8.pingFailedListeners     // Catch:{ all -> 0x007a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x007a }
        L_0x005d:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x0078
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x007a }
            org.jivesoftware.smackx.ping.PingFailedListener r1 = (org.jivesoftware.smackx.ping.PingFailedListener) r1     // Catch:{ all -> 0x007a }
            r1.pingFailed()     // Catch:{ all -> 0x007a }
            goto L_0x005d
        L_0x006d:
            r8.maybeSchedulePingServerTask()     // Catch:{ all -> 0x007a }
            goto L_0x0078
        L_0x0071:
            java.util.logging.Logger r0 = LOGGER     // Catch:{ all -> 0x007a }
            java.lang.String r1 = "XMPPConnection was not authenticated"
            r0.warning(r1)     // Catch:{ all -> 0x007a }
        L_0x0078:
            monitor-exit(r8)
            return
        L_0x007a:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x007e
        L_0x007d:
            throw r0
        L_0x007e:
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.ping.PingManager.pingServerIfNecessary():void");
    }

    public void registerPingFailedListener(PingFailedListener pingFailedListener) {
        this.pingFailedListeners.add(pingFailedListener);
    }

    public void setPingInterval(int i) {
        this.pingInterval = i;
        maybeSchedulePingServerTask();
    }

    public void unregisterPingFailedListener(PingFailedListener pingFailedListener) {
        this.pingFailedListeners.remove(pingFailedListener);
    }

    private synchronized void maybeSchedulePingServerTask(int i) {
        maybeStopPingServerTask();
        if (this.pingInterval > 0) {
            int i2 = this.pingInterval - i;
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Scheduling ServerPingTask in ");
            sb.append(i2);
            sb.append(" seconds (pingInterval=");
            sb.append(this.pingInterval);
            sb.append(", delta=");
            sb.append(i);
            sb.append(")");
            logger.fine(sb.toString());
            this.nextAutomaticPing = this.executorService.schedule(this.pingServerRunnable, (long) i2, TimeUnit.SECONDS);
        }
    }

    public boolean pingMyServer(boolean z) throws NotConnectedException {
        return pingMyServer(z, connection().getPacketReplyTimeout());
    }

    public boolean pingMyServer(boolean z, long j) throws NotConnectedException {
        boolean z2;
        try {
            z2 = ping(connection().getServiceName(), j);
        } catch (NoResponseException unused) {
            z2 = false;
        }
        if (!z2 && z) {
            for (PingFailedListener pingFailed : this.pingFailedListeners) {
                pingFailed.pingFailed();
            }
        }
        return z2;
    }

    public boolean ping(String str) throws NotConnectedException, NoResponseException {
        return ping(str, connection().getPacketReplyTimeout());
    }
}
