package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.i8 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
final /* synthetic */ class C5286i8 implements Runnable {

    /* renamed from: N */
    private final C5303k3 f15131N;

    /* renamed from: O */
    private final Intent f15132O;

    /* renamed from: a */
    private final C5242e8 f15133a;

    /* renamed from: b */
    private final int f15134b;

    C5286i8(C5242e8 e8Var, int i, C5303k3 k3Var, Intent intent) {
        this.f15133a = e8Var;
        this.f15134b = i;
        this.f15131N = k3Var;
        this.f15132O = intent;
    }

    public final void run() {
        this.f15133a.mo21317a(this.f15134b, this.f15131N, this.f15132O);
    }
}
