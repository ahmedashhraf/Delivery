package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.e */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4733e extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ boolean f14048P;

    /* renamed from: Q */
    private final /* synthetic */ C4746ec f14049Q;

    C4733e(C4746ec ecVar, boolean z) {
        this.f14049Q = ecVar;
        this.f14048P = z;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14049Q.f14080i.setMeasurementEnabled(this.f14048P, this.f14083a);
    }
}
