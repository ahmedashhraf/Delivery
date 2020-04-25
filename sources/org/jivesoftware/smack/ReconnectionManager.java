package org.jivesoftware.smack;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.XMPPException.StreamErrorException;
import org.jivesoftware.smack.packet.StreamError.Condition;
import org.jivesoftware.smack.util.Async;

public class ReconnectionManager {
    private static final Map<AbstractXMPPConnection, ReconnectionManager> INSTANCES = new WeakHashMap();
    /* access modifiers changed from: private */
    public static final Logger LOGGER = Logger.getLogger(ReconnectionManager.class.getName());
    private static int defaultFixedDelay = 15;
    private static ReconnectionPolicy defaultReconnectionPolicy = ReconnectionPolicy.RANDOM_INCREASING_DELAY;
    private static boolean enabledPerDefault = false;
    private boolean automaticReconnectEnabled = false;
    private final ConnectionListener connectionListener = new AbstractConnectionListener() {
        public void authenticated(XMPPConnection xMPPConnection, boolean z) {
            ReconnectionManager.this.done = false;
        }

        public void connectionClosed() {
            ReconnectionManager.this.done = true;
        }

        public void connectionClosedOnError(Exception exc) {
            ReconnectionManager reconnectionManager = ReconnectionManager.this;
            reconnectionManager.done = false;
            if (reconnectionManager.isAutomaticReconnectEnabled()) {
                if (exc instanceof StreamErrorException) {
                    if (Condition.conflict == ((StreamErrorException) exc).getStreamError().getCondition()) {
                        return;
                    }
                }
                ReconnectionManager.this.reconnect();
            }
        }
    };
    boolean done = false;
    /* access modifiers changed from: private */
    public volatile int fixedDelay = defaultFixedDelay;
    /* access modifiers changed from: private */
    public final int randomBase = (new Random().nextInt(13) + 2);
    /* access modifiers changed from: private */
    public volatile ReconnectionPolicy reconnectionPolicy = defaultReconnectionPolicy;
    private final Runnable reconnectionRunnable;
    private Thread reconnectionThread;
    /* access modifiers changed from: private */
    public final WeakReference<AbstractXMPPConnection> weakRefConnection;

    /* renamed from: org.jivesoftware.smack.ReconnectionManager$4 */
    static /* synthetic */ class C156064 {

        /* renamed from: $SwitchMap$org$jivesoftware$smack$ReconnectionManager$ReconnectionPolicy */
        static final /* synthetic */ int[] f44973x55bc48cf = new int[ReconnectionPolicy.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.jivesoftware.smack.ReconnectionManager$ReconnectionPolicy[] r0 = org.jivesoftware.smack.ReconnectionManager.ReconnectionPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44973x55bc48cf = r0
                int[] r0 = f44973x55bc48cf     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.ReconnectionManager$ReconnectionPolicy r1 = org.jivesoftware.smack.ReconnectionManager.ReconnectionPolicy.FIXED_DELAY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44973x55bc48cf     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.ReconnectionManager$ReconnectionPolicy r1 = org.jivesoftware.smack.ReconnectionManager.ReconnectionPolicy.RANDOM_INCREASING_DELAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.ReconnectionManager.C156064.<clinit>():void");
        }
    }

    public enum ReconnectionPolicy {
        RANDOM_INCREASING_DELAY,
        FIXED_DELAY
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                if (xMPPConnection instanceof AbstractXMPPConnection) {
                    ReconnectionManager.getInstanceFor((AbstractXMPPConnection) xMPPConnection);
                }
            }
        });
    }

    private ReconnectionManager(AbstractXMPPConnection abstractXMPPConnection) {
        this.weakRefConnection = new WeakReference<>(abstractXMPPConnection);
        this.reconnectionRunnable = new Thread() {
            private int attempts = 0;

            private int timeDelay() {
                this.attempts++;
                int i = C156064.f44973x55bc48cf[ReconnectionManager.this.reconnectionPolicy.ordinal()];
                if (i == 1) {
                    return ReconnectionManager.this.fixedDelay;
                }
                if (i == 2) {
                    int i2 = this.attempts;
                    if (i2 > 13) {
                        return ReconnectionManager.this.randomBase * 6 * 5;
                    }
                    if (i2 > 7) {
                        return ReconnectionManager.this.randomBase * 6;
                    }
                    return ReconnectionManager.this.randomBase;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown reconnection policy ");
                sb.append(ReconnectionManager.this.reconnectionPolicy);
                throw new AssertionError(sb.toString());
            }

            public void run() {
                AbstractXMPPConnection abstractXMPPConnection = (AbstractXMPPConnection) ReconnectionManager.this.weakRefConnection.get();
                if (abstractXMPPConnection != null) {
                    while (ReconnectionManager.this.isReconnectionPossible(abstractXMPPConnection)) {
                        int timeDelay = timeDelay();
                        while (ReconnectionManager.this.isReconnectionPossible(abstractXMPPConnection) && timeDelay > 0) {
                            try {
                                Thread.sleep(1000);
                                timeDelay--;
                                for (ConnectionListener reconnectingIn : abstractXMPPConnection.connectionListeners) {
                                    reconnectingIn.reconnectingIn(timeDelay);
                                }
                            } catch (InterruptedException e) {
                                ReconnectionManager.LOGGER.log(Level.FINE, "waiting for reconnection interrupted", e);
                            }
                        }
                        for (ConnectionListener reconnectingIn2 : abstractXMPPConnection.connectionListeners) {
                            reconnectingIn2.reconnectingIn(0);
                        }
                        try {
                            if (ReconnectionManager.this.isReconnectionPossible(abstractXMPPConnection)) {
                                abstractXMPPConnection.connect();
                            }
                            if (!abstractXMPPConnection.isAuthenticated()) {
                                abstractXMPPConnection.login();
                            }
                            this.attempts = 0;
                        } catch (IOException | SmackException | XMPPException e2) {
                            for (ConnectionListener reconnectionFailed : abstractXMPPConnection.connectionListeners) {
                                reconnectionFailed.reconnectionFailed(e2);
                            }
                        }
                    }
                }
            }
        };
        if (getEnabledPerDefault()) {
            enableAutomaticReconnection();
        }
    }

    public static boolean getEnabledPerDefault() {
        return enabledPerDefault;
    }

    public static synchronized ReconnectionManager getInstanceFor(AbstractXMPPConnection abstractXMPPConnection) {
        ReconnectionManager reconnectionManager;
        synchronized (ReconnectionManager.class) {
            reconnectionManager = (ReconnectionManager) INSTANCES.get(abstractXMPPConnection);
            if (reconnectionManager == null) {
                reconnectionManager = new ReconnectionManager(abstractXMPPConnection);
                INSTANCES.put(abstractXMPPConnection, reconnectionManager);
            }
        }
        return reconnectionManager;
    }

    /* access modifiers changed from: private */
    public boolean isReconnectionPossible(XMPPConnection xMPPConnection) {
        return !this.done && !xMPPConnection.isConnected() && isAutomaticReconnectEnabled();
    }

    /* access modifiers changed from: private */
    public synchronized void reconnect() {
        XMPPConnection xMPPConnection = (XMPPConnection) this.weakRefConnection.get();
        if (xMPPConnection == null) {
            LOGGER.fine("Connection is null, will not reconnect");
        } else if (this.reconnectionThread == null || !this.reconnectionThread.isAlive()) {
            Runnable runnable = this.reconnectionRunnable;
            StringBuilder sb = new StringBuilder();
            sb.append("Smack Reconnection Manager (");
            sb.append(xMPPConnection.getConnectionCounter());
            sb.append(')');
            this.reconnectionThread = Async.m68711go(runnable, sb.toString());
        }
    }

    public static void setDefaultFixedDelay(int i) {
        defaultFixedDelay = i;
        setDefaultReconnectionPolicy(ReconnectionPolicy.FIXED_DELAY);
    }

    public static void setDefaultReconnectionPolicy(ReconnectionPolicy reconnectionPolicy2) {
        defaultReconnectionPolicy = reconnectionPolicy2;
    }

    public static void setEnabledPerDefault(boolean z) {
        enabledPerDefault = z;
    }

    public synchronized void disableAutomaticReconnection() {
        if (this.automaticReconnectEnabled) {
            XMPPConnection xMPPConnection = (XMPPConnection) this.weakRefConnection.get();
            if (xMPPConnection != null) {
                xMPPConnection.removeConnectionListener(this.connectionListener);
                this.automaticReconnectEnabled = false;
                return;
            }
            throw new IllegalStateException("Connection instance no longer available");
        }
    }

    public synchronized void enableAutomaticReconnection() {
        if (!this.automaticReconnectEnabled) {
            XMPPConnection xMPPConnection = (XMPPConnection) this.weakRefConnection.get();
            if (xMPPConnection != null) {
                xMPPConnection.addConnectionListener(this.connectionListener);
                this.automaticReconnectEnabled = true;
                return;
            }
            throw new IllegalStateException("Connection instance no longer available");
        }
    }

    public boolean isAutomaticReconnectEnabled() {
        return this.automaticReconnectEnabled;
    }

    public void setFixedDelay(int i) {
        this.fixedDelay = i;
        setReconnectionPolicy(ReconnectionPolicy.FIXED_DELAY);
    }

    public void setReconnectionPolicy(ReconnectionPolicy reconnectionPolicy2) {
        this.reconnectionPolicy = reconnectionPolicy2;
    }
}
