package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5196a6 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ Object f14872N;

    /* renamed from: O */
    private final /* synthetic */ long f14873O;

    /* renamed from: P */
    private final /* synthetic */ C5437w5 f14874P;

    /* renamed from: a */
    private final /* synthetic */ String f14875a;

    /* renamed from: b */
    private final /* synthetic */ String f14876b;

    C5196a6(C5437w5 w5Var, String str, String str2, Object obj, long j) {
        this.f14874P = w5Var;
        this.f14875a = str;
        this.f14876b = str2;
        this.f14872N = obj;
        this.f14873O = j;
    }

    public final void run() {
        this.f14874P.mo21767a(this.f14875a, this.f14876b, this.f14872N, this.f14873O);
    }
}
