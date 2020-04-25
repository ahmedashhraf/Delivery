package org.jivesoftware.smackx.ping.android;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import androidx.core.app.C0770p;
import com.amplitude.api.C2876e;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.util.Async;
import org.jivesoftware.smackx.ping.PingManager;

public class ServerPingWithAlarmManager extends Manager {
    private static final BroadcastReceiver ALARM_BROADCAST_RECEIVER = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            HashSet<Entry> hashSet;
            ServerPingWithAlarmManager.LOGGER.fine("Ping Alarm broadcast received");
            synchronized (ServerPingWithAlarmManager.class) {
                hashSet = new HashSet<>(ServerPingWithAlarmManager.INSTANCES.entrySet());
            }
            for (Entry entry : hashSet) {
                XMPPConnection xMPPConnection = (XMPPConnection) entry.getKey();
                if (((ServerPingWithAlarmManager) entry.getValue()).isEnabled()) {
                    Logger access$000 = ServerPingWithAlarmManager.LOGGER;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calling pingServerIfNecessary for connection ");
                    sb.append(xMPPConnection.getConnectionCounter());
                    access$000.fine(sb.toString());
                    final PingManager instanceFor = PingManager.getInstanceFor(xMPPConnection);
                    C157121 r1 = new Runnable() {
                        public void run() {
                            instanceFor.pingServerIfNecessary();
                        }
                    };
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("PingServerIfNecessary (");
                    sb2.append(xMPPConnection.getConnectionCounter());
                    sb2.append(')');
                    Async.m68711go(r1, sb2.toString());
                } else {
                    Logger access$0002 = ServerPingWithAlarmManager.LOGGER;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("NOT calling pingServerIfNecessary (disabled) on connection ");
                    sb3.append(xMPPConnection.getConnectionCounter());
                    access$0002.fine(sb3.toString());
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public static final Map<XMPPConnection, ServerPingWithAlarmManager> INSTANCES = new WeakHashMap();
    /* access modifiers changed from: private */
    public static final Logger LOGGER = Logger.getLogger(ServerPingWithAlarmManager.class.getName());
    private static final String PING_ALARM_ACTION = "org.igniterealtime.smackx.ping.ACTION";
    private static AlarmManager sAlarmManager;
    private static Context sContext;
    private static PendingIntent sPendingIntent;
    private boolean mEnabled = true;

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                ServerPingWithAlarmManager.getInstanceFor(xMPPConnection);
            }
        });
    }

    private ServerPingWithAlarmManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
    }

    public static synchronized ServerPingWithAlarmManager getInstanceFor(XMPPConnection xMPPConnection) {
        ServerPingWithAlarmManager serverPingWithAlarmManager;
        synchronized (ServerPingWithAlarmManager.class) {
            serverPingWithAlarmManager = (ServerPingWithAlarmManager) INSTANCES.get(xMPPConnection);
            if (serverPingWithAlarmManager == null) {
                serverPingWithAlarmManager = new ServerPingWithAlarmManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, serverPingWithAlarmManager);
            }
        }
        return serverPingWithAlarmManager;
    }

    public static void onCreate(Context context) {
        sContext = context;
        BroadcastReceiver broadcastReceiver = ALARM_BROADCAST_RECEIVER;
        String str = PING_ALARM_ACTION;
        context.registerReceiver(broadcastReceiver, new IntentFilter(str));
        sAlarmManager = (AlarmManager) context.getSystemService(C0770p.f3528i0);
        sPendingIntent = PendingIntent.getBroadcast(context, 0, new Intent(str), 0);
        sAlarmManager.setInexactRepeating(2, C2876e.f10139p + SystemClock.elapsedRealtime(), C2876e.f10139p, sPendingIntent);
    }

    public static void onDestroy() {
        sContext.unregisterReceiver(ALARM_BROADCAST_RECEIVER);
        sAlarmManager.cancel(sPendingIntent);
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }
}
