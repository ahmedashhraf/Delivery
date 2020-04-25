package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.measurement.internal.s7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5395s7 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ zzak f15457N;

    /* renamed from: O */
    private final /* synthetic */ zzm f15458O;

    /* renamed from: P */
    private final /* synthetic */ String f15459P;

    /* renamed from: Q */
    private final /* synthetic */ C5252f7 f15460Q;

    /* renamed from: a */
    private final /* synthetic */ boolean f15461a;

    /* renamed from: b */
    private final /* synthetic */ boolean f15462b;

    C5395s7(C5252f7 f7Var, boolean z, boolean z2, zzak zzak, zzm zzm, String str) {
        this.f15460Q = f7Var;
        this.f15461a = z;
        this.f15462b = z2;
        this.f15457N = zzak;
        this.f15458O = zzm;
        this.f15459P = str;
    }

    public final void run() {
        C5204b3 d = this.f15460Q.f15029d;
        if (d == null) {
            this.f15460Q.mo21205d().mo21533t().mo21549a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f15461a) {
            this.f15460Q.mo21347a(d, (AbstractSafeParcelable) this.f15462b ? null : this.f15457N, this.f15458O);
        } else {
            try {
                if (TextUtils.isEmpty(this.f15459P)) {
                    d.mo21161a(this.f15457N, this.f15458O);
                } else {
                    d.mo21162a(this.f15457N, this.f15459P, this.f15460Q.mo21205d().mo21529D());
                }
            } catch (RemoteException e) {
                this.f15460Q.mo21205d().mo21533t().mo21550a("Failed to send event to the service", e);
            }
        }
        this.f15460Q.m22767J();
    }
}
