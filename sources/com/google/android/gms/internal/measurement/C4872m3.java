package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.m3 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public abstract class C4872m3 {

    /* renamed from: a */
    int f14261a;

    /* renamed from: b */
    int f14262b;

    /* renamed from: c */
    private int f14263c;

    /* renamed from: d */
    C4885n3 f14264d;

    /* renamed from: e */
    private boolean f14265e;

    private C4872m3() {
        this.f14262b = 100;
        this.f14263c = Integer.MAX_VALUE;
        this.f14265e = false;
    }

    /* renamed from: a */
    public static long m20649a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    static C4872m3 m20650a(byte[] bArr, int i, int i2, boolean z) {
        C4898o3 o3Var = new C4898o3(bArr, 0, i2, false);
        try {
            o3Var.mo19277c(i2);
            return o3Var;
        } catch (zzfn e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static int m20651e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract int mo19272a() throws IOException;

    /* renamed from: a */
    public abstract void mo19273a(int i) throws zzfn;

    /* renamed from: b */
    public abstract double mo19274b() throws IOException;

    /* renamed from: b */
    public abstract boolean mo19275b(int i) throws IOException;

    /* renamed from: c */
    public abstract float mo19276c() throws IOException;

    /* renamed from: c */
    public abstract int mo19277c(int i) throws zzfn;

    /* renamed from: d */
    public abstract long mo19278d() throws IOException;

    /* renamed from: d */
    public abstract void mo19279d(int i);

    /* renamed from: e */
    public abstract long mo19280e() throws IOException;

    /* renamed from: f */
    public abstract int mo19281f() throws IOException;

    /* renamed from: g */
    public abstract long mo19282g() throws IOException;

    /* renamed from: h */
    public abstract int mo19283h() throws IOException;

    /* renamed from: i */
    public abstract boolean mo19284i() throws IOException;

    /* renamed from: j */
    public abstract String mo19285j() throws IOException;

    /* renamed from: k */
    public abstract String mo19286k() throws IOException;

    /* renamed from: l */
    public abstract C5070z2 mo19287l() throws IOException;

    /* renamed from: m */
    public abstract int mo19288m() throws IOException;

    /* renamed from: n */
    public abstract int mo19289n() throws IOException;

    /* renamed from: o */
    public abstract int mo19290o() throws IOException;

    /* renamed from: p */
    public abstract long mo19291p() throws IOException;

    /* renamed from: q */
    public abstract int mo19292q() throws IOException;

    /* renamed from: r */
    public abstract long mo19293r() throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public abstract long mo19294s() throws IOException;

    /* renamed from: t */
    public abstract boolean mo19295t() throws IOException;

    /* renamed from: u */
    public abstract int mo19296u();
}
