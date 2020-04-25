package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.c8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5220c8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5460y7 f14932a;

    C5220c8(C5460y7 y7Var) {
        this.f14932a = y7Var;
    }

    public final void run() {
        C5252f7 f7Var = this.f14932a.f15630c;
        Context e = f7Var.mo21206e();
        this.f14932a.f15630c.mo21189B();
        f7Var.m22773a(new ComponentName(e, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
