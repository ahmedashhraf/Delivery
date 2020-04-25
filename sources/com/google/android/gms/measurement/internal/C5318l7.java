package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.l7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5318l7 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ boolean f15286N;

    /* renamed from: O */
    private final /* synthetic */ C5252f7 f15287O;

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15288a;

    /* renamed from: b */
    private final /* synthetic */ zzm f15289b;

    C5318l7(C5252f7 f7Var, AtomicReference atomicReference, zzm zzm, boolean z) {
        this.f15287O = f7Var;
        this.f15288a = atomicReference;
        this.f15289b = zzm;
        this.f15286N = z;
    }

    public final void run() {
        synchronized (this.f15288a) {
            try {
                C5204b3 d = this.f15287O.f15029d;
                if (d == null) {
                    this.f15287O.mo21205d().mo21533t().mo21549a("Failed to get user properties");
                    this.f15288a.notify();
                    return;
                }
                this.f15288a.set(d.mo21155a(this.f15289b, this.f15286N));
                this.f15287O.m22767J();
                this.f15288a.notify();
            } catch (RemoteException e) {
                try {
                    this.f15287O.mo21205d().mo21533t().mo21550a("Failed to get user properties", e);
                    this.f15288a.notify();
                } catch (Throwable th) {
                    this.f15288a.notify();
                    throw th;
                }
            }
        }
    }
}
