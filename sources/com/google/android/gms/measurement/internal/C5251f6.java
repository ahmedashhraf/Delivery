package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5027vb;

/* renamed from: com.google.android.gms.measurement.internal.f6 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.1.0 */
final class C5251f6 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ String f15024N;

    /* renamed from: O */
    private final /* synthetic */ AppMeasurementDynamiteService f15025O;

    /* renamed from: a */
    private final /* synthetic */ C5027vb f15026a;

    /* renamed from: b */
    private final /* synthetic */ zzak f15027b;

    C5251f6(AppMeasurementDynamiteService appMeasurementDynamiteService, C5027vb vbVar, zzak zzak, String str) {
        this.f15025O = appMeasurementDynamiteService;
        this.f15026a = vbVar;
        this.f15027b = zzak;
        this.f15024N = str;
    }

    public final void run() {
        this.f15025O.f14851b.mo21583E().mo21343a(this.f15026a, this.f15027b, this.f15024N);
    }
}
