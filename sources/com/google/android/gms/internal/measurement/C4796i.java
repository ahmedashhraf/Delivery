package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.i */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4796i extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ String f14172P;

    /* renamed from: Q */
    private final /* synthetic */ C4746ec f14173Q;

    C4796i(C4746ec ecVar, String str) {
        this.f14173Q = ecVar;
        this.f14172P = str;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14173Q.f14080i.beginAdUnitExposure(this.f14172P, this.f14084b);
    }
}
