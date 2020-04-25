package com.instabug.featuresrequest.p369b;

import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.b.b */
/* compiled from: PerSessionSettings */
public class C9536b {

    /* renamed from: c */
    private static C9536b f25225c;

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f25226d;

    /* renamed from: a */
    private boolean f25227a = true;

    /* renamed from: b */
    private boolean f25228b = true;

    private C9536b() {
        boolean[] d = m44620d();
        d[0] = true;
    }

    /* renamed from: c */
    public static C9536b m44619c() {
        boolean[] d = m44620d();
        C9536b bVar = f25225c;
        if (bVar != null) {
            d[1] = true;
        } else {
            bVar = new C9536b();
            f25225c = bVar;
            d[2] = true;
        }
        d[3] = true;
        return bVar;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m44620d() {
        boolean[] zArr = f25226d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1804120644965171354L, "com/instabug/featuresrequest/settings/PerSessionSettings", 8);
        f25226d = a;
        return a;
    }

    /* renamed from: a */
    public void mo34223a(boolean z) {
        boolean[] d = m44620d();
        this.f25227a = z;
        d[4] = true;
    }

    /* renamed from: b */
    public void mo34225b(boolean z) {
        boolean[] d = m44620d();
        this.f25228b = z;
        d[6] = true;
    }

    /* renamed from: a */
    public boolean mo34224a() {
        boolean[] d = m44620d();
        boolean z = this.f25227a;
        d[5] = true;
        return z;
    }

    /* renamed from: b */
    public boolean mo34226b() {
        boolean[] d = m44620d();
        boolean z = this.f25228b;
        d[7] = true;
        return z;
    }
}
