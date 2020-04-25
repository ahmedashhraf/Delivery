package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d5 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
final class C5228d5 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ C5414u4 f14948N;

    /* renamed from: a */
    private final /* synthetic */ zzak f14949a;

    /* renamed from: b */
    private final /* synthetic */ zzm f14950b;

    C5228d5(C5414u4 u4Var, zzak zzak, zzm zzm) {
        this.f14948N = u4Var;
        this.f14949a = zzak;
        this.f14950b = zzm;
    }

    public final void run() {
        zzak b = this.f14948N.mo21718b(this.f14949a, this.f14950b);
        this.f14948N.f15506b.mo21863q();
        this.f14948N.f15506b.mo21837a(b, this.f14950b);
    }
}
