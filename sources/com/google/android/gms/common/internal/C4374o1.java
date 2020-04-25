package com.google.android.gms.common.internal;

import android.content.Context;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.common.internal.o1 */
public final class C4374o1 {

    /* renamed from: a */
    private static Object f13520a = new Object();
    @C5966a("sLock")

    /* renamed from: b */
    private static boolean f13521b;

    /* renamed from: c */
    private static String f13522c;

    /* renamed from: d */
    private static int f13523d;

    /* renamed from: a */
    public static String m18873a(Context context) {
        m18875c(context);
        return f13522c;
    }

    /* renamed from: b */
    public static int m18874b(Context context) {
        m18875c(context);
        return f13523d;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0030 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m18875c(android.content.Context r3) {
        /*
            java.lang.Object r0 = f13520a
            monitor-enter(r0)
            boolean r1 = f13521b     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0009:
            r1 = 1
            f13521b = r1     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = r3.getPackageName()     // Catch:{ all -> 0x0032 }
            com.google.android.gms.common.q.b r3 = com.google.android.gms.common.p172q.C4439c.m19110a(r3)     // Catch:{ all -> 0x0032 }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r3.mo18446a(r1, r2)     // Catch:{ NameNotFoundException -> 0x0030 }
            android.os.Bundle r3 = r3.metaData     // Catch:{ NameNotFoundException -> 0x0030 }
            if (r3 != 0) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0020:
            java.lang.String r1 = "com.google.app.id"
            java.lang.String r1 = r3.getString(r1)     // Catch:{ NameNotFoundException -> 0x0030 }
            f13522c = r1     // Catch:{ NameNotFoundException -> 0x0030 }
            java.lang.String r1 = "com.google.android.gms.version"
            int r3 = r3.getInt(r1)     // Catch:{ NameNotFoundException -> 0x0030 }
            f13523d = r3     // Catch:{ NameNotFoundException -> 0x0030 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C4374o1.m18875c(android.content.Context):void");
    }
}
