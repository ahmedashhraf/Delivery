package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.z */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C5067z extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ boolean f14544P;

    /* renamed from: Q */
    private final /* synthetic */ C4746ec f14545Q;

    C5067z(C4746ec ecVar, boolean z) {
        this.f14545Q = ecVar;
        this.f14544P = z;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14545Q.f14080i.setDataCollectionEnabled(this.f14544P);
    }
}
