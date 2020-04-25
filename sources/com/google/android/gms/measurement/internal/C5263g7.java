package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5027vb;

/* renamed from: com.google.android.gms.measurement.internal.g7 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.1.0 */
final class C5263g7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5027vb f15065a;

    /* renamed from: b */
    private final /* synthetic */ AppMeasurementDynamiteService f15066b;

    C5263g7(AppMeasurementDynamiteService appMeasurementDynamiteService, C5027vb vbVar) {
        this.f15066b = appMeasurementDynamiteService;
        this.f15065a = vbVar;
    }

    public final void run() {
        this.f15066b.f14851b.mo21583E().mo21342a(this.f15065a);
    }
}
