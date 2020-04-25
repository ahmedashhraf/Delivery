package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.a8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5198a8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ComponentName f14882a;

    /* renamed from: b */
    private final /* synthetic */ C5460y7 f14883b;

    C5198a8(C5460y7 y7Var, ComponentName componentName) {
        this.f14883b = y7Var;
        this.f14882a = componentName;
    }

    public final void run() {
        this.f14883b.f15630c.m22773a(this.f14882a);
    }
}
