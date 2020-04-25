package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.g */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4769g extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ long f14137P;

    /* renamed from: Q */
    private final /* synthetic */ C4746ec f14138Q;

    C4769g(C4746ec ecVar, long j) {
        this.f14138Q = ecVar;
        this.f14137P = j;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14138Q.f14080i.setMinimumSessionDuration(this.f14137P);
    }
}
