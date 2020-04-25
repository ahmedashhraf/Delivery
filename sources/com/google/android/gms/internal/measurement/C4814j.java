package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.j */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4814j extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ long f14210P;

    /* renamed from: Q */
    private final /* synthetic */ C4746ec f14211Q;

    C4814j(C4746ec ecVar, long j) {
        this.f14211Q = ecVar;
        this.f14210P = j;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14211Q.f14080i.setSessionTimeoutDuration(this.f14210P);
    }
}
