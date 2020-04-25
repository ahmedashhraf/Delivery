package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.m6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5328m6 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ String f15310N;

    /* renamed from: O */
    private final /* synthetic */ String f15311O;

    /* renamed from: P */
    private final /* synthetic */ boolean f15312P;

    /* renamed from: Q */
    private final /* synthetic */ C5437w5 f15313Q;

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15314a;

    /* renamed from: b */
    private final /* synthetic */ String f15315b;

    C5328m6(C5437w5 w5Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f15313Q = w5Var;
        this.f15314a = atomicReference;
        this.f15315b = str;
        this.f15310N = str2;
        this.f15311O = str3;
        this.f15312P = z;
    }

    public final void run() {
        this.f15313Q.f15309a.mo21583E().mo21354a(this.f15314a, this.f15315b, this.f15310N, this.f15311O, this.f15312P);
    }
}
