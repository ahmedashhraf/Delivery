package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.u7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5417u7 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ String f15508N;

    /* renamed from: O */
    private final /* synthetic */ String f15509O;

    /* renamed from: P */
    private final /* synthetic */ zzm f15510P;

    /* renamed from: Q */
    private final /* synthetic */ C5252f7 f15511Q;

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15512a;

    /* renamed from: b */
    private final /* synthetic */ String f15513b;

    C5417u7(C5252f7 f7Var, AtomicReference atomicReference, String str, String str2, String str3, zzm zzm) {
        this.f15511Q = f7Var;
        this.f15512a = atomicReference;
        this.f15513b = str;
        this.f15508N = str2;
        this.f15509O = str3;
        this.f15510P = zzm;
    }

    public final void run() {
        synchronized (this.f15512a) {
            try {
                C5204b3 d = this.f15511Q.f15029d;
                if (d == null) {
                    this.f15511Q.mo21205d().mo21533t().mo21552a("Failed to get conditional properties", C5303k3.m23051a(this.f15513b), this.f15508N, this.f15509O);
                    this.f15512a.set(Collections.emptyList());
                    this.f15512a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f15513b)) {
                    this.f15512a.set(d.mo21156a(this.f15508N, this.f15509O, this.f15510P));
                } else {
                    this.f15512a.set(d.mo21157a(this.f15513b, this.f15508N, this.f15509O));
                }
                this.f15511Q.m22767J();
                this.f15512a.notify();
            } catch (RemoteException e) {
                try {
                    this.f15511Q.mo21205d().mo21533t().mo21552a("Failed to get conditional properties", C5303k3.m23051a(this.f15513b), this.f15508N, e);
                    this.f15512a.set(Collections.emptyList());
                    this.f15512a.notify();
                } catch (Throwable th) {
                    this.f15512a.notify();
                    throw th;
                }
            }
        }
    }
}
