package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4365l1;
import com.google.android.gms.common.internal.C4368m1;
import com.google.android.gms.dynamic.C4523f;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import java.util.concurrent.Callable;
import p201f.p202a.C5944c;

@C5944c
/* renamed from: com.google.android.gms.common.v */
final class C4508v {

    /* renamed from: a */
    private static volatile C4365l1 f13767a;

    /* renamed from: b */
    private static final Object f13768b = new Object();

    /* renamed from: c */
    private static Context f13769c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m19432a(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.v> r0 = com.google.android.gms.common.C4508v.class
            monitor-enter(r0)
            android.content.Context r1 = f13769c     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0011
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0013 }
            f13769c = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)
            return
        L_0x0011:
            monitor-exit(r0)
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C4508v.m19432a(android.content.Context):void");
    }

    /* renamed from: b */
    private static C4281e0 m19433b(String str, C4510x xVar, boolean z, boolean z2) {
        try {
            if (f13767a == null) {
                C4300a0.m18620a(f13769c);
                synchronized (f13768b) {
                    if (f13767a == null) {
                        f13767a = C4368m1.m18867a(DynamiteModule.m19544a(f13769c, DynamiteModule.f13812l, "com.google.android.gms.googlecertificates").mo18636a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            C4300a0.m18620a(f13769c);
            try {
                if (f13767a.mo18347a(new zzk(str, xVar, z, z2), C4523f.m19511a(f13769c.getPackageManager()))) {
                    return C4281e0.m18508c();
                }
                return C4281e0.m18506a((Callable<String>) new C4509w<String>(z, str, xVar));
            } catch (RemoteException e) {
                return C4281e0.m18505a("module call", e);
            }
        } catch (LoadingException e2) {
            String str2 = "module init: ";
            String valueOf = String.valueOf(e2.getMessage());
            return C4281e0.m18505a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e2);
        }
    }

    /* renamed from: a */
    static C4281e0 m19430a(String str, C4510x xVar, boolean z, boolean z2) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m19433b(str, xVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ String m19431a(boolean z, String str, C4510x xVar) throws Exception {
        boolean z2 = true;
        if (z || !m19433b(str, xVar, true, false).f13281a) {
            z2 = false;
        }
        return C4281e0.m18507a(str, xVar, z, z2);
    }
}
