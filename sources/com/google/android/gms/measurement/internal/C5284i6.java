package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.i6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5284i6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Bundle f15125a;

    /* renamed from: b */
    private final /* synthetic */ C5437w5 f15126b;

    C5284i6(C5437w5 w5Var, Bundle bundle) {
        this.f15126b = w5Var;
        this.f15125a = bundle;
    }

    public final void run() {
        this.f15126b.m23633c(this.f15125a);
    }
}
