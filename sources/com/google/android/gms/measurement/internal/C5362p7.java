package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.measurement.internal.p7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5362p7 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ C5252f7 f15406N;

    /* renamed from: a */
    private final /* synthetic */ zzm f15407a;

    /* renamed from: b */
    private final /* synthetic */ boolean f15408b;

    C5362p7(C5252f7 f7Var, zzm zzm, boolean z) {
        this.f15406N = f7Var;
        this.f15407a = zzm;
        this.f15408b = z;
    }

    public final void run() {
        C5204b3 d = this.f15406N.f15029d;
        if (d == null) {
            this.f15406N.mo21205d().mo21533t().mo21549a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            d.mo21170d(this.f15407a);
            if (this.f15408b) {
                this.f15406N.mo21232s().mo21398D();
            }
            this.f15406N.mo21347a(d, (AbstractSafeParcelable) null, this.f15407a);
            this.f15406N.m22767J();
        } catch (RemoteException e) {
            this.f15406N.mo21205d().mo21533t().mo21550a("Failed to send app launch to the service", e);
        }
    }
}
