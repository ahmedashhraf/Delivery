package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.l */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4841l extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ String f14245P;

    /* renamed from: Q */
    private final /* synthetic */ C4746ec f14246Q;

    C4841l(C4746ec ecVar, String str) {
        this.f14246Q = ecVar;
        this.f14245P = str;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14246Q.f14080i.endAdUnitExposure(this.f14245P, this.f14084b);
    }
}
