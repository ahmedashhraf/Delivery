package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.n7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5340n7 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ C5252f7 f15346N;

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15347a;

    /* renamed from: b */
    private final /* synthetic */ zzm f15348b;

    C5340n7(C5252f7 f7Var, AtomicReference atomicReference, zzm zzm) {
        this.f15346N = f7Var;
        this.f15347a = atomicReference;
        this.f15348b = zzm;
    }

    public final void run() {
        synchronized (this.f15347a) {
            try {
                C5204b3 d = this.f15346N.f15029d;
                if (d == null) {
                    this.f15346N.mo21205d().mo21533t().mo21549a("Failed to get app instance id");
                    this.f15347a.notify();
                    return;
                }
                this.f15347a.set(d.mo21169c(this.f15348b));
                String str = (String) this.f15347a.get();
                if (str != null) {
                    this.f15346N.mo21228o().mo21762a(str);
                    this.f15346N.mo21213l().f15577l.mo21143a(str);
                }
                this.f15346N.m22767J();
                this.f15347a.notify();
            } catch (RemoteException e) {
                try {
                    this.f15346N.mo21205d().mo21533t().mo21550a("Failed to get app instance id", e);
                    this.f15347a.notify();
                } catch (Throwable th) {
                    this.f15347a.notify();
                    throw th;
                }
            }
        }
    }
}
