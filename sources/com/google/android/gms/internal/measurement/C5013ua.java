package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ua */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5013ua implements C5026va {

    /* renamed from: a */
    private static final C4896o1<Boolean> f14454a;

    /* renamed from: b */
    private static final C4896o1<Long> f14455b;

    static {
        C5003u1 u1Var = new C5003u1(C4909p1.m20916a("com.google.android.gms.measurement"));
        f14454a = u1Var.mo19702a("measurement.reset_analytics.persist_time", false);
        f14455b = u1Var.mo19700a("measurement.id.reset_analytics.persist_time", 0);
    }

    /* renamed from: a */
    public final boolean mo19709a() {
        return ((Boolean) f14454a.mo19353b()).booleanValue();
    }
}
