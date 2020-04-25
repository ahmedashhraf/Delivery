package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.k6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5306k6 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ String f15173N;

    /* renamed from: O */
    private final /* synthetic */ String f15174O;

    /* renamed from: P */
    private final /* synthetic */ C5437w5 f15175P;

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15176a;

    /* renamed from: b */
    private final /* synthetic */ String f15177b;

    C5306k6(C5437w5 w5Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f15175P = w5Var;
        this.f15176a = atomicReference;
        this.f15177b = str;
        this.f15173N = str2;
        this.f15174O = str3;
    }

    public final void run() {
        this.f15175P.f15309a.mo21583E().mo21353a(this.f15176a, this.f15177b, this.f15173N, this.f15174O);
    }
}
