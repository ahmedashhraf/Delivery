package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C4701b9 implements C5063y8 {

    /* renamed from: a */
    private static final C4896o1<Boolean> f14006a;

    /* renamed from: b */
    private static final C4896o1<Boolean> f14007b;

    /* renamed from: c */
    private static final C4896o1<Boolean> f14008c;

    /* renamed from: d */
    private static final C4896o1<Long> f14009d;

    static {
        C5003u1 u1Var = new C5003u1(C4909p1.m20916a("com.google.android.gms.measurement"));
        f14006a = u1Var.mo19702a("measurement.sdk.dynamite.allow_remote_dynamite", false);
        f14007b = u1Var.mo19702a("measurement.collection.init_params_control_enabled", true);
        f14008c = u1Var.mo19702a("measurement.sdk.dynamite.use_dynamite2", false);
        f14009d = u1Var.mo19700a("measurement.id.sdk.dynamite.use_dynamite", 0);
    }

    /* renamed from: a */
    public final boolean mo18873a() {
        return ((Boolean) f14006a.mo19353b()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo18874i() {
        return ((Boolean) f14007b.mo19353b()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo18875l() {
        return ((Boolean) f14008c.mo19353b()).booleanValue();
    }
}
