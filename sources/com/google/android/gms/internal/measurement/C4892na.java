package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.na */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C4892na implements C4839ka {

    /* renamed from: a */
    private static final C4896o1<Boolean> f14294a;

    /* renamed from: b */
    private static final C4896o1<Double> f14295b;

    /* renamed from: c */
    private static final C4896o1<Long> f14296c;

    /* renamed from: d */
    private static final C4896o1<Long> f14297d;

    /* renamed from: e */
    private static final C4896o1<String> f14298e;

    static {
        C5003u1 u1Var = new C5003u1(C4909p1.m20916a("com.google.android.gms.measurement"));
        f14294a = u1Var.mo19702a("measurement.test.boolean_flag", false);
        f14295b = u1Var.mo19699a("measurement.test.double_flag", -3.0d);
        f14296c = u1Var.mo19700a("measurement.test.int_flag", -2);
        f14297d = u1Var.mo19700a("measurement.test.long_flag", -1);
        f14298e = u1Var.mo19701a("measurement.test.string_flag", "---");
    }

    /* renamed from: a */
    public final boolean mo19182a() {
        return ((Boolean) f14294a.mo19353b()).booleanValue();
    }

    /* renamed from: i */
    public final double mo19183i() {
        return ((Double) f14295b.mo19353b()).doubleValue();
    }

    /* renamed from: l */
    public final long mo19184l() {
        return ((Long) f14296c.mo19353b()).longValue();
    }

    public final long zzd() {
        return ((Long) f14297d.mo19353b()).longValue();
    }

    public final String zze() {
        return (String) f14298e.mo19353b();
    }
}
