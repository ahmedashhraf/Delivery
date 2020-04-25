package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5027vb;

/* renamed from: com.google.android.gms.measurement.internal.k9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.1.0 */
final class C5309k9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5027vb f15182a;

    /* renamed from: b */
    private final /* synthetic */ AppMeasurementDynamiteService f15183b;

    C5309k9(AppMeasurementDynamiteService appMeasurementDynamiteService, C5027vb vbVar) {
        this.f15183b = appMeasurementDynamiteService;
        this.f15182a = vbVar;
    }

    public final void run() {
        this.f15183b.f14851b.mo21607u().mo21374a(this.f15182a, this.f15183b.f14851b.mo21592b());
    }
}
