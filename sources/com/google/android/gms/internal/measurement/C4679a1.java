package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserManager;
import androidx.annotation.C0221u;
import androidx.annotation.RequiresApi;

/* renamed from: com.google.android.gms.internal.measurement.a1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public class C4679a1 {
    @C0221u("DirectBootUtils.class")

    /* renamed from: a */
    private static UserManager f13965a;

    /* renamed from: b */
    private static volatile boolean f13966b = (!m19900a());
    @C0221u("DirectBootUtils.class")

    /* renamed from: c */
    private static boolean f13967c = false;

    private C4679a1() {
    }

    /* renamed from: a */
    public static boolean m19900a() {
        return VERSION.SDK_INT >= 24;
    }

    @RequiresApi(24)
    @TargetApi(24)
    @C0221u("DirectBootUtils.class")
    /* renamed from: b */
    private static boolean m19902b(Context context) {
        boolean z;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (f13965a == null) {
                f13965a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f13965a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                    z = true;
                }
            } catch (NullPointerException unused) {
                f13965a = null;
                i++;
            }
        }
        if (z) {
            f13965a = null;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        return r3;
     */
    @androidx.annotation.RequiresApi(24)
    @android.annotation.TargetApi(24)
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m19903c(android.content.Context r3) {
        /*
            boolean r0 = f13966b
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Class<com.google.android.gms.internal.measurement.a1> r0 = com.google.android.gms.internal.measurement.C4679a1.class
            monitor-enter(r0)
            boolean r2 = f13966b     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r1
        L_0x000f:
            boolean r3 = m19902b(r3)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            f13966b = r3     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r3
        L_0x0019:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4679a1.m19903c(android.content.Context):boolean");
    }

    /* renamed from: a */
    public static boolean m19901a(Context context) {
        return !m19900a() || m19903c(context);
    }
}
