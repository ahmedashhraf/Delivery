package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ab */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C4689ab implements C4703bb {

    /* renamed from: a */
    private static final C4896o1<Boolean> f13980a;

    /* renamed from: b */
    private static final C4896o1<Boolean> f13981b;

    /* renamed from: c */
    private static final C4896o1<Boolean> f13982c;

    /* renamed from: d */
    private static final C4896o1<Boolean> f13983d;

    /* renamed from: e */
    private static final C4896o1<Long> f13984e;

    /* renamed from: f */
    private static final C4896o1<Boolean> f13985f;

    /* renamed from: g */
    private static final C4896o1<Boolean> f13986g;

    static {
        C5003u1 u1Var = new C5003u1(C4909p1.m20916a("com.google.android.gms.measurement"));
        f13980a = u1Var.mo19702a("measurement.service.audience.scoped_filters_v27", false);
        f13981b = u1Var.mo19702a("measurement.service.audience.session_scoped_user_engagement", false);
        f13982c = u1Var.mo19702a("measurement.service.audience.session_scoped_event_aggregates", false);
        f13983d = u1Var.mo19702a("measurement.service.audience.use_bundle_timestamp_for_property_filters", false);
        f13984e = u1Var.mo19700a("measurement.id.scoped_audience_filters", 0);
        f13985f = u1Var.mo19702a("measurement.service.audience.not_prepend_timestamps_for_sequence_session_scoped_filters", false);
        f13986g = u1Var.mo19702a("measurement.service.audience.remove_disabled_session_scoped_user_engagement", false);
    }

    /* renamed from: a */
    public final boolean mo18852a() {
        return ((Boolean) f13980a.mo19353b()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo18853i() {
        return ((Boolean) f13981b.mo19353b()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo18854k() {
        return ((Boolean) f13986g.mo19353b()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo18855l() {
        return ((Boolean) f13982c.mo19353b()).booleanValue();
    }

    public final boolean zzd() {
        return ((Boolean) f13983d.mo19353b()).booleanValue();
    }

    public final boolean zze() {
        return ((Boolean) f13985f.mo19353b()).booleanValue();
    }
}
