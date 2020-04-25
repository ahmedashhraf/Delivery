package com.google.firebase.iid;

import android.content.Intent;
import androidx.annotation.C0193h0;
import java.util.concurrent.TimeUnit;
import p076c.p112d.p113a.p114a.p129i.C2688d;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.firebase.iid.z */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
public final class C8733z {

    /* renamed from: a */
    private static final long f22894a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f22895b = new Object();
    @C5966a("WakeLockHolder.syncObject")

    /* renamed from: c */
    private static C2688d f22896c;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m40935a(@androidx.annotation.C0193h0 android.content.Context r4, @androidx.annotation.C0193h0 android.content.Intent r5) {
        /*
            java.lang.Object r0 = f22895b
            monitor-enter(r0)
            c.d.a.a.i.d r1 = f22896c     // Catch:{ all -> 0x0032 }
            r2 = 1
            if (r1 != 0) goto L_0x0014
            c.d.a.a.i.d r1 = new c.d.a.a.i.d     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "wake:com.google.firebase.iid.WakeLockHolder"
            r1.<init>(r4, r2, r3)     // Catch:{ all -> 0x0032 }
            f22896c = r1     // Catch:{ all -> 0x0032 }
            r1.mo10349a(r2)     // Catch:{ all -> 0x0032 }
        L_0x0014:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r3 = 0
            boolean r1 = r5.getBooleanExtra(r1, r3)     // Catch:{ all -> 0x0032 }
            m40937a(r5, r2)     // Catch:{ all -> 0x0032 }
            android.content.ComponentName r4 = r4.startService(r5)     // Catch:{ all -> 0x0032 }
            if (r4 != 0) goto L_0x0027
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r4
        L_0x0027:
            if (r1 != 0) goto L_0x0030
            c.d.a.a.i.d r5 = f22896c     // Catch:{ all -> 0x0032 }
            long r1 = f22894a     // Catch:{ all -> 0x0032 }
            r5.mo10348a(r1)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r4
        L_0x0032:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C8733z.m40935a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* renamed from: a */
    private static void m40937a(@C0193h0 Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* renamed from: a */
    public static void m40936a(@C0193h0 Intent intent) {
        synchronized (f22895b) {
            if (f22896c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                m40937a(intent, false);
                f22896c.mo10351b();
            }
        }
    }
}
