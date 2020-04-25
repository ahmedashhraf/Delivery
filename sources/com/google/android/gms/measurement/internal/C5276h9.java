package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5027vb;

/* renamed from: com.google.android.gms.measurement.internal.h9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.1.0 */
final class C5276h9 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ String f15107N;

    /* renamed from: O */
    private final /* synthetic */ boolean f15108O;

    /* renamed from: P */
    private final /* synthetic */ AppMeasurementDynamiteService f15109P;

    /* renamed from: a */
    private final /* synthetic */ C5027vb f15110a;

    /* renamed from: b */
    private final /* synthetic */ String f15111b;

    C5276h9(AppMeasurementDynamiteService appMeasurementDynamiteService, C5027vb vbVar, String str, String str2, boolean z) {
        this.f15109P = appMeasurementDynamiteService;
        this.f15110a = vbVar;
        this.f15111b = str;
        this.f15107N = str2;
        this.f15108O = z;
    }

    public final void run() {
        this.f15109P.f14851b.mo21583E().mo21345a(this.f15110a, this.f15111b, this.f15107N, this.f15108O);
    }
}
