package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ba */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C4702ba implements C4716ca {

    /* renamed from: a */
    private static final C4896o1<Boolean> f14010a;

    /* renamed from: b */
    private static final C4896o1<Boolean> f14011b;

    /* renamed from: c */
    private static final C4896o1<Boolean> f14012c;

    static {
        C5003u1 u1Var = new C5003u1(C4909p1.m20916a("com.google.android.gms.measurement"));
        f14010a = u1Var.mo19702a("measurement.lifecycle.app_backgrounded_engagement", false);
        f14011b = u1Var.mo19702a("measurement.lifecycle.app_backgrounded_tracking", false);
        f14012c = u1Var.mo19702a("measurement.lifecycle.app_in_background_parameter", false);
    }

    /* renamed from: a */
    public final boolean mo18876a() {
        return ((Boolean) f14010a.mo19353b()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo18877i() {
        return ((Boolean) f14011b.mo19353b()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo18878l() {
        return ((Boolean) f14012c.mo19353b()).booleanValue();
    }
}
