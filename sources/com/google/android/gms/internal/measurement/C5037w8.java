package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5037w8 implements C5050x8 {

    /* renamed from: a */
    private static final C4896o1<Boolean> f14492a;

    /* renamed from: b */
    private static final C4896o1<Long> f14493b;

    static {
        C5003u1 u1Var = new C5003u1(C4909p1.m20916a("com.google.android.gms.measurement"));
        f14492a = u1Var.mo19702a("measurement.upload_dsid_enabled", false);
        f14493b = u1Var.mo19700a("measurement.id.upload_dsid_enabled", 0);
    }

    /* renamed from: a */
    public final boolean mo19731a() {
        return ((Boolean) f14492a.mo19353b()).booleanValue();
    }
}
