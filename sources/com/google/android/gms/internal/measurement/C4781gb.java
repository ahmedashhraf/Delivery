package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.gb */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C4781gb implements C4795hb {

    /* renamed from: a */
    private static final C4896o1<Boolean> f14152a;

    /* renamed from: b */
    private static final C4896o1<Boolean> f14153b;

    /* renamed from: c */
    private static final C4896o1<Boolean> f14154c;

    /* renamed from: d */
    private static final C4896o1<Boolean> f14155d;

    /* renamed from: e */
    private static final C4896o1<Long> f14156e;

    /* renamed from: f */
    private static final C4896o1<Long> f14157f;

    static {
        C5003u1 u1Var = new C5003u1(C4909p1.m20916a("com.google.android.gms.measurement"));
        f14152a = u1Var.mo19702a("measurement.client.sessions.background_sessions_enabled", true);
        f14153b = u1Var.mo19702a("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f14154c = u1Var.mo19702a("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f14155d = u1Var.mo19702a("measurement.client.sessions.session_id_enabled", true);
        f14156e = u1Var.mo19700a("measurement.id.sessionization_client", 0);
        f14157f = u1Var.mo19700a("measurement.id.sessions.immediate_session_start", 0);
    }

    /* renamed from: a */
    public final boolean mo19019a() {
        return ((Boolean) f14152a.mo19353b()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo19020i() {
        return ((Boolean) f14153b.mo19353b()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo19021l() {
        return ((Boolean) f14154c.mo19353b()).booleanValue();
    }

    public final boolean zzd() {
        return ((Boolean) f14155d.mo19353b()).booleanValue();
    }
}
