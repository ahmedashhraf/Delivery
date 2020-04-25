package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.measurement.internal.i7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5285i7 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ zzm f15127N;

    /* renamed from: O */
    private final /* synthetic */ C5252f7 f15128O;

    /* renamed from: a */
    private final /* synthetic */ boolean f15129a;

    /* renamed from: b */
    private final /* synthetic */ zzjx f15130b;

    C5285i7(C5252f7 f7Var, boolean z, zzjx zzjx, zzm zzm) {
        this.f15128O = f7Var;
        this.f15129a = z;
        this.f15130b = zzjx;
        this.f15127N = zzm;
    }

    public final void run() {
        C5204b3 d = this.f15128O.f15029d;
        if (d == null) {
            this.f15128O.mo21205d().mo21533t().mo21549a("Discarding data. Failed to set user attribute");
            return;
        }
        this.f15128O.mo21347a(d, (AbstractSafeParcelable) this.f15129a ? null : this.f15130b, this.f15127N);
        this.f15128O.m22767J();
    }
}
