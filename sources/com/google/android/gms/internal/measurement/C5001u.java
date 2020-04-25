package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.u */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C5001u extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ C4779g9 f14421P;

    /* renamed from: Q */
    private final /* synthetic */ C4746ec f14422Q;

    C5001u(C4746ec ecVar, C4779g9 g9Var) {
        this.f14422Q = ecVar;
        this.f14421P = g9Var;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14422Q.f14080i.getAppInstanceId(this.f14421P);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18903b() {
        this.f14421P.mo19016c(null);
    }
}
