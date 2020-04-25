package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.C0195i0;
import androidx.annotation.C0221u;
import androidx.annotation.C0224v0;
import com.google.android.gms.common.util.p173f0.C4481b;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.google.firebase.iid.e0 */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
public final class C8690e0 implements ServiceConnection {

    /* renamed from: a */
    private final Context f22805a;

    /* renamed from: b */
    private final Intent f22806b;

    /* renamed from: c */
    private final ScheduledExecutorService f22807c;

    /* renamed from: d */
    private final Queue<C8697h0> f22808d;
    @C0195i0

    /* renamed from: e */
    private C8684c0 f22809e;
    @C0221u("this")

    /* renamed from: f */
    private boolean f22810f;

    public C8690e0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C4481b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @C0221u("this")
    /* renamed from: b */
    private final void m40835b() {
        while (!this.f22808d.isEmpty()) {
            ((C8697h0) this.f22808d.poll()).mo32126a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo32117a(Intent intent, PendingResult pendingResult) {
        boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
        this.f22808d.add(new C8697h0(intent, pendingResult, this.f22807c));
        m40834a();
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            sb.toString();
        }
        this.f22810f = false;
        if (!(iBinder instanceof C8684c0)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            sb2.toString();
            m40835b();
            return;
        }
        this.f22809e = (C8684c0) iBinder;
        m40834a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            sb.toString();
        }
        m40834a();
    }

    @C0224v0
    private C8690e0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f22808d = new ArrayDeque();
        this.f22810f = false;
        this.f22805a = context.getApplicationContext();
        this.f22806b = new Intent(str).setPackage(this.f22805a.getPackageName());
        this.f22807c = scheduledExecutorService;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:20|21|22|(2:24|25)|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0071 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m40834a() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x007a }
        L_0x0008:
            java.util.Queue<com.google.firebase.iid.h0> r0 = r5.f22808d     // Catch:{ all -> 0x007a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0078
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x007a }
            com.google.firebase.iid.c0 r0 = r5.f22809e     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0036
            com.google.firebase.iid.c0 r0 = r5.f22809e     // Catch:{ all -> 0x007a }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x007a }
            java.util.Queue<com.google.firebase.iid.h0> r0 = r5.f22808d     // Catch:{ all -> 0x007a }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x007a }
            com.google.firebase.iid.h0 r0 = (com.google.firebase.iid.C8697h0) r0     // Catch:{ all -> 0x007a }
            com.google.firebase.iid.c0 r2 = r5.f22809e     // Catch:{ all -> 0x007a }
            r2.mo32114a(r0)     // Catch:{ all -> 0x007a }
            goto L_0x0008
        L_0x0036:
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x007a }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0059
            boolean r0 = r5.f22810f     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            r3 = 39
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            r4.<init>(r3)     // Catch:{ all -> 0x007a }
            java.lang.String r3 = "binder is dead. start connection? "
            r4.append(r3)     // Catch:{ all -> 0x007a }
            r4.append(r0)     // Catch:{ all -> 0x007a }
            r4.toString()     // Catch:{ all -> 0x007a }
        L_0x0059:
            boolean r0 = r5.f22810f     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0076
            r5.f22810f = r2     // Catch:{ all -> 0x007a }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C4462a.m19276a()     // Catch:{ SecurityException -> 0x0071 }
            android.content.Context r2 = r5.f22805a     // Catch:{ SecurityException -> 0x0071 }
            android.content.Intent r3 = r5.f22806b     // Catch:{ SecurityException -> 0x0071 }
            r4 = 65
            boolean r0 = r0.mo18551a(r2, r3, r5, r4)     // Catch:{ SecurityException -> 0x0071 }
            if (r0 == 0) goto L_0x0071
            monitor-exit(r5)
            return
        L_0x0071:
            r5.f22810f = r1     // Catch:{ all -> 0x007a }
            r5.m40835b()     // Catch:{ all -> 0x007a }
        L_0x0076:
            monitor-exit(r5)
            return
        L_0x0078:
            monitor-exit(r5)
            return
        L_0x007a:
            r0 = move-exception
            monitor-exit(r5)
            goto L_0x007e
        L_0x007d:
            throw r0
        L_0x007e:
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C8690e0.m40834a():void");
    }
}
