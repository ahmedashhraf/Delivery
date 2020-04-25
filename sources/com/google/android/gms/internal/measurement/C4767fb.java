package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fb */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C4767fb implements C4717cb {

    /* renamed from: a */
    private static final C4896o1<Boolean> f14134a;

    /* renamed from: b */
    private static final C4896o1<Boolean> f14135b;

    /* renamed from: c */
    private static final C4896o1<Boolean> f14136c;

    static {
        C5003u1 u1Var = new C5003u1(C4909p1.m20916a("com.google.android.gms.measurement"));
        f14134a = u1Var.mo19702a("measurement.service.sessions.remove_disabled_session_number", true);
        f14135b = u1Var.mo19702a("measurement.service.sessions.session_number_enabled", true);
        f14136c = u1Var.mo19702a("measurement.service.sessions.session_number_backfill_enabled", true);
    }

    /* renamed from: a */
    public final boolean mo18900a() {
        return ((Boolean) f14134a.mo19353b()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo18901i() {
        return ((Boolean) f14135b.mo19353b()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo18902l() {
        return ((Boolean) f14136c.mo19353b()).booleanValue();
    }
}
