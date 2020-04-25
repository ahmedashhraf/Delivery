package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5203b2 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ C5463z f14889N;

    /* renamed from: a */
    private final /* synthetic */ String f14890a;

    /* renamed from: b */
    private final /* synthetic */ long f14891b;

    C5203b2(C5463z zVar, String str, long j) {
        this.f14889N = zVar;
        this.f14890a = str;
        this.f14891b = j;
    }

    public final void run() {
        this.f14889N.m23842d(this.f14890a, this.f14891b);
    }
}
