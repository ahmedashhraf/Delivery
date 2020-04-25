package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.aa */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C4688aa implements C5051x9 {

    /* renamed from: a */
    private static final C4896o1<Boolean> f13976a;

    /* renamed from: b */
    private static final C4896o1<Boolean> f13977b;

    /* renamed from: c */
    private static final C4896o1<Boolean> f13978c;

    /* renamed from: d */
    private static final C4896o1<Boolean> f13979d;

    static {
        C5003u1 u1Var = new C5003u1(C4909p1.m20916a("com.google.android.gms.measurement"));
        f13976a = u1Var.mo19702a("measurement.sdk.collection.last_deep_link_referrer", false);
        f13977b = u1Var.mo19702a("measurement.sdk.collection.last_deep_link_referrer_campaign", false);
        f13978c = u1Var.mo19702a("measurement.sdk.collection.last_gclid_from_referrer", false);
        f13979d = u1Var.mo19702a("measurement.sdk.collection.worker_thread_referrer", true);
    }

    /* renamed from: a */
    public final boolean mo18848a() {
        return ((Boolean) f13976a.mo19353b()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo18849i() {
        return ((Boolean) f13977b.mo19353b()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo18850l() {
        return ((Boolean) f13978c.mo19353b()).booleanValue();
    }

    public final boolean zzd() {
        return ((Boolean) f13979d.mo19353b()).booleanValue();
    }
}
