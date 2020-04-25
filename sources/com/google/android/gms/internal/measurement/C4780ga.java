package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ga */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C4780ga implements C4730da {

    /* renamed from: a */
    private static final C4896o1<Boolean> f14150a;

    /* renamed from: b */
    private static final C4896o1<Boolean> f14151b;

    static {
        C5003u1 u1Var = new C5003u1(C4909p1.m20916a("com.google.android.gms.measurement"));
        f14150a = u1Var.mo19702a("measurement.personalized_ads_signals_collection_enabled", true);
        f14151b = u1Var.mo19702a("measurement.personalized_ads_property_translation_enabled", true);
    }

    /* renamed from: a */
    public final boolean mo18929a() {
        return ((Boolean) f14150a.mo19353b()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo18930i() {
        return ((Boolean) f14151b.mo19353b()).booleanValue();
    }
}
