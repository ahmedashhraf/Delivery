package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.measurement.internal.v7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5428v7 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ zzs f15529N;

    /* renamed from: O */
    private final /* synthetic */ zzm f15530O;

    /* renamed from: P */
    private final /* synthetic */ zzs f15531P;

    /* renamed from: Q */
    private final /* synthetic */ C5252f7 f15532Q;

    /* renamed from: a */
    private final /* synthetic */ boolean f15533a;

    /* renamed from: b */
    private final /* synthetic */ boolean f15534b;

    C5428v7(C5252f7 f7Var, boolean z, boolean z2, zzs zzs, zzm zzm, zzs zzs2) {
        this.f15532Q = f7Var;
        this.f15533a = z;
        this.f15534b = z2;
        this.f15529N = zzs;
        this.f15530O = zzm;
        this.f15531P = zzs2;
    }

    public final void run() {
        C5204b3 d = this.f15532Q.f15029d;
        if (d == null) {
            this.f15532Q.mo21205d().mo21533t().mo21549a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f15533a) {
            this.f15532Q.mo21347a(d, (AbstractSafeParcelable) this.f15534b ? null : this.f15529N, this.f15530O);
        } else {
            try {
                if (TextUtils.isEmpty(this.f15531P.f15726a)) {
                    d.mo21166a(this.f15529N, this.f15530O);
                } else {
                    d.mo21165a(this.f15529N);
                }
            } catch (RemoteException e) {
                this.f15532Q.mo21205d().mo21533t().mo21550a("Failed to send conditional user property to the service", e);
            }
        }
        this.f15532Q.m22767J();
    }
}
