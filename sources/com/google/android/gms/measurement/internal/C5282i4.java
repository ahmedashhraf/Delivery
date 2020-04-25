package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5282i4 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5359p4 f15120a;

    /* renamed from: b */
    private final /* synthetic */ C5303k3 f15121b;

    C5282i4(C5249f4 f4Var, C5359p4 p4Var, C5303k3 k3Var) {
        this.f15120a = p4Var;
        this.f15121b = k3Var;
    }

    public final void run() {
        if (this.f15120a.mo21604r() == null) {
            this.f15121b.mo21533t().mo21549a("Install Referrer Reporter is null");
            return;
        }
        C5238e4 r = this.f15120a.mo21604r();
        r.f14970a.mo21595i();
        r.mo21241a(r.f14970a.mo21206e().getPackageName());
    }
}
