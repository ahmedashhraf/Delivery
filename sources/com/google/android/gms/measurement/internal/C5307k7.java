package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.k7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5307k7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzm f15178a;

    /* renamed from: b */
    private final /* synthetic */ C5252f7 f15179b;

    C5307k7(C5252f7 f7Var, zzm zzm) {
        this.f15179b = f7Var;
        this.f15178a = zzm;
    }

    public final void run() {
        C5204b3 d = this.f15179b.f15029d;
        if (d == null) {
            this.f15179b.mo21205d().mo21533t().mo21549a("Failed to reset data on the service; null service");
            return;
        }
        try {
            d.mo21164a(this.f15178a);
        } catch (RemoteException e) {
            this.f15179b.mo21205d().mo21533t().mo21550a("Failed to reset data on the service", e);
        }
        this.f15179b.m22767J();
    }
}
