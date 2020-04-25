package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C4904o9 implements C4865l9 {

    /* renamed from: a */
    private static final C4896o1<Boolean> f14325a;

    /* renamed from: b */
    private static final C4896o1<Boolean> f14326b;

    static {
        C5003u1 u1Var = new C5003u1(C4909p1.m20916a("com.google.android.gms.measurement"));
        f14325a = u1Var.mo19702a("measurement.collection.efficient_engagement_reporting_enabled", false);
        f14326b = u1Var.mo19702a("measurement.collection.redundant_engagement_removal_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo19269a() {
        return ((Boolean) f14325a.mo19353b()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo19270i() {
        return ((Boolean) f14326b.mo19353b()).booleanValue();
    }
}
