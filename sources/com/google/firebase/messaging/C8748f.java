package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.f */
/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
final class C8748f {

    /* renamed from: a */
    private final Executor f22962a;

    /* renamed from: b */
    private final Context f22963b;

    /* renamed from: c */
    private final C8755m f22964c;

    public C8748f(Context context, C8755m mVar, Executor executor) {
        this.f22962a = executor;
        this.f22963b = context;
        this.f22964c = mVar;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo32254a() {
        /*
            r9 = this;
            com.google.firebase.messaging.m r0 = r9.f22964c
            java.lang.String r1 = "gcm.n.noui"
            boolean r0 = r0.mo32266b(r1)
            r1 = 1
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            android.content.Context r0 = r9.f22963b
            java.lang.String r2 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            r2 = 0
            if (r0 != 0) goto L_0x0058
            boolean r0 = com.google.android.gms.common.util.C4503v.m19416j()
            if (r0 != 0) goto L_0x0028
            r3 = 10
            android.os.SystemClock.sleep(r3)
        L_0x0028:
            int r0 = android.os.Process.myPid()
            android.content.Context r3 = r9.f22963b
            java.lang.String r4 = "activity"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            java.util.List r3 = r3.getRunningAppProcesses()
            if (r3 == 0) goto L_0x0058
            java.util.Iterator r3 = r3.iterator()
        L_0x0040:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0058
            java.lang.Object r4 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4
            int r5 = r4.pid
            if (r5 != r0) goto L_0x0040
            int r0 = r4.importance
            r3 = 100
            if (r0 != r3) goto L_0x0058
            r0 = 1
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            if (r0 == 0) goto L_0x005c
            return r2
        L_0x005c:
            com.google.firebase.messaging.m r0 = r9.f22964c
            java.lang.String r3 = "gcm.n.image"
            java.lang.String r0 = r0.mo32264a(r3)
            com.google.firebase.messaging.l r0 = com.google.firebase.messaging.C8754l.m41032b(r0)
            if (r0 == 0) goto L_0x006f
            java.util.concurrent.Executor r3 = r9.f22962a
            r0.mo32259a(r3)
        L_0x006f:
            android.content.Context r3 = r9.f22963b
            com.google.firebase.messaging.m r4 = r9.f22964c
            com.google.firebase.messaging.c r3 = com.google.firebase.messaging.C8746d.m41017a(r3, r4)
            androidx.core.app.p$e r4 = r3.f22953a
            if (r0 == 0) goto L_0x00d0
            com.google.android.gms.tasks.k r5 = r0.mo32258a()     // Catch:{ ExecutionException -> 0x00ad, InterruptedException -> 0x00a2, TimeoutException -> 0x009e }
            r6 = 5
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x00ad, InterruptedException -> 0x00a2, TimeoutException -> 0x009e }
            java.lang.Object r5 = com.google.android.gms.tasks.C5566n.m24217a(r5, r6, r8)     // Catch:{ ExecutionException -> 0x00ad, InterruptedException -> 0x00a2, TimeoutException -> 0x009e }
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5     // Catch:{ ExecutionException -> 0x00ad, InterruptedException -> 0x00a2, TimeoutException -> 0x009e }
            r4.mo4206a(r5)     // Catch:{ ExecutionException -> 0x00ad, InterruptedException -> 0x00a2, TimeoutException -> 0x009e }
            androidx.core.app.p$c r6 = new androidx.core.app.p$c     // Catch:{ ExecutionException -> 0x00ad, InterruptedException -> 0x00a2, TimeoutException -> 0x009e }
            r6.<init>()     // Catch:{ ExecutionException -> 0x00ad, InterruptedException -> 0x00a2, TimeoutException -> 0x009e }
            androidx.core.app.p$c r5 = r6.mo4191b(r5)     // Catch:{ ExecutionException -> 0x00ad, InterruptedException -> 0x00a2, TimeoutException -> 0x009e }
            r6 = 0
            androidx.core.app.p$c r5 = r5.mo4188a(r6)     // Catch:{ ExecutionException -> 0x00ad, InterruptedException -> 0x00a2, TimeoutException -> 0x009e }
            r4.mo4213a(r5)     // Catch:{ ExecutionException -> 0x00ad, InterruptedException -> 0x00a2, TimeoutException -> 0x009e }
            goto L_0x00d0
        L_0x009e:
            r0.close()
            goto L_0x00d0
        L_0x00a2:
            r0.close()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x00d0
        L_0x00ad:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            int r4 = r4 + 26
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Failed to download image: "
            r5.append(r4)
            r5.append(r0)
            r5.toString()
        L_0x00d0:
            r0 = 3
            java.lang.String r4 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r4, r0)
            android.content.Context r0 = r9.f22963b
            java.lang.String r4 = "notification"
            java.lang.Object r0 = r0.getSystemService(r4)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            java.lang.String r4 = r3.f22954b
            androidx.core.app.p$e r3 = r3.f22953a
            android.app.Notification r3 = r3.mo4196a()
            r0.notify(r4, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C8748f.mo32254a():boolean");
    }
}
