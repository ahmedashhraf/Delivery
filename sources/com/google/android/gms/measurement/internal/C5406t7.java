package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.t7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5406t7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzm f15494a;

    /* renamed from: b */
    private final /* synthetic */ C5252f7 f15495b;

    C5406t7(C5252f7 f7Var, zzm zzm) {
        this.f15495b = f7Var;
        this.f15494a = zzm;
    }

    public final void run() {
        C5204b3 d = this.f15495b.f15029d;
        if (d == null) {
            this.f15495b.mo21205d().mo21533t().mo21549a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            d.mo21168b(this.f15494a);
            this.f15495b.m22767J();
        } catch (RemoteException e) {
            this.f15495b.mo21205d().mo21533t().mo21550a("Failed to send measurementEnabled to the service", e);
        }
    }
}
