package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.o7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5351o7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5208b7 f15360a;

    /* renamed from: b */
    private final /* synthetic */ C5252f7 f15361b;

    C5351o7(C5252f7 f7Var, C5208b7 b7Var) {
        this.f15361b = f7Var;
        this.f15360a = b7Var;
    }

    public final void run() {
        C5204b3 d = this.f15361b.f15029d;
        if (d == null) {
            this.f15361b.mo21205d().mo21533t().mo21549a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f15360a == null) {
                d.mo21160a(0, (String) null, (String) null, this.f15361b.mo21206e().getPackageName());
            } else {
                d.mo21160a(this.f15360a.f14912c, this.f15360a.f14910a, this.f15360a.f14911b, this.f15361b.mo21206e().getPackageName());
            }
            this.f15361b.m22767J();
        } catch (RemoteException e) {
            this.f15361b.mo21205d().mo21533t().mo21550a("Failed to send current screen to the service", e);
        }
    }
}
