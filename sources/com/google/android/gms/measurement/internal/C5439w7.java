package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.w7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5439w7 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ String f15554N;

    /* renamed from: O */
    private final /* synthetic */ String f15555O;

    /* renamed from: P */
    private final /* synthetic */ boolean f15556P;

    /* renamed from: Q */
    private final /* synthetic */ zzm f15557Q;

    /* renamed from: R */
    private final /* synthetic */ C5252f7 f15558R;

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15559a;

    /* renamed from: b */
    private final /* synthetic */ String f15560b;

    C5439w7(C5252f7 f7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzm zzm) {
        this.f15558R = f7Var;
        this.f15559a = atomicReference;
        this.f15560b = str;
        this.f15554N = str2;
        this.f15555O = str3;
        this.f15556P = z;
        this.f15557Q = zzm;
    }

    public final void run() {
        synchronized (this.f15559a) {
            try {
                C5204b3 d = this.f15558R.f15029d;
                if (d == null) {
                    this.f15558R.mo21205d().mo21533t().mo21552a("Failed to get user properties", C5303k3.m23051a(this.f15560b), this.f15554N, this.f15555O);
                    this.f15559a.set(Collections.emptyList());
                    this.f15559a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f15560b)) {
                    this.f15559a.set(d.mo21159a(this.f15554N, this.f15555O, this.f15556P, this.f15557Q));
                } else {
                    this.f15559a.set(d.mo21158a(this.f15560b, this.f15554N, this.f15555O, this.f15556P));
                }
                this.f15558R.m22767J();
                this.f15559a.notify();
            } catch (RemoteException e) {
                try {
                    this.f15558R.mo21205d().mo21533t().mo21552a("Failed to get user properties", C5303k3.m23051a(this.f15560b), this.f15554N, e);
                    this.f15559a.set(Collections.emptyList());
                    this.f15559a.notify();
                } catch (Throwable th) {
                    this.f15559a.notify();
                    throw th;
                }
            }
        }
    }
}
