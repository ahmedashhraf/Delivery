package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C4823j8 implements C4778g8 {

    /* renamed from: a */
    private static final C4896o1<Boolean> f14227a;

    /* renamed from: b */
    private static final C4896o1<Long> f14228b;

    static {
        C5003u1 u1Var = new C5003u1(C4909p1.m20916a("com.google.android.gms.measurement"));
        f14227a = u1Var.mo19702a("measurement.app_launch.event_ordering_fix", false);
        f14228b = u1Var.mo19700a("measurement.id.app_launch.event_ordering_fix", 0);
    }

    /* renamed from: a */
    public final boolean mo19015a() {
        return ((Boolean) f14227a.mo19353b()).booleanValue();
    }
}
