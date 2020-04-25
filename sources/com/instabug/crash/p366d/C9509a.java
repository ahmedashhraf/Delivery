package com.instabug.crash.p366d;

import android.content.Context;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.crash.d.a */
/* compiled from: CrashSettings */
public class C9509a {

    /* renamed from: a */
    private static C9509a f25167a;

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f25168b;

    private C9509a() {
        m44520c()[0] = true;
    }

    /* renamed from: a */
    public static void m44518a(Context context) {
        boolean[] c = m44520c();
        f25167a = new C9509a();
        c[1] = true;
        C9511c.m44525a(context);
        c[2] = true;
        C9510b.m44523a();
        c[3] = true;
    }

    /* renamed from: b */
    public static C9509a m44519b() {
        boolean[] c = m44520c();
        if (f25167a != null) {
            c[4] = true;
        } else {
            c[5] = true;
            f25167a = new C9509a();
            c[6] = true;
        }
        C9509a aVar = f25167a;
        c[7] = true;
        return aVar;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m44520c() {
        boolean[] zArr = f25168b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4639092409918937924L, "com/instabug/crash/settings/CrashSettings", 10);
        f25168b = a;
        return a;
    }

    /* renamed from: a */
    public void mo34171a(long j) {
        boolean[] c = m44520c();
        C9511c.m44526b().mo34173a(j);
        c[8] = true;
    }

    /* renamed from: a */
    public long mo34170a() {
        boolean[] c = m44520c();
        long a = C9511c.m44526b().mo34172a();
        c[9] = true;
        return a;
    }
}
