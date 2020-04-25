package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5027vb;

/* renamed from: com.google.android.gms.measurement.internal.h8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.1.0 */
final class C5275h8 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ String f15103N;

    /* renamed from: O */
    private final /* synthetic */ AppMeasurementDynamiteService f15104O;

    /* renamed from: a */
    private final /* synthetic */ C5027vb f15105a;

    /* renamed from: b */
    private final /* synthetic */ String f15106b;

    C5275h8(AppMeasurementDynamiteService appMeasurementDynamiteService, C5027vb vbVar, String str, String str2) {
        this.f15104O = appMeasurementDynamiteService;
        this.f15105a = vbVar;
        this.f15106b = str;
        this.f15103N = str2;
    }

    public final void run() {
        this.f15104O.f14851b.mo21583E().mo21344a(this.f15105a, this.f15106b, this.f15103N);
    }
}
