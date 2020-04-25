package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.p */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4907p extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ C4779g9 f14328P;

    /* renamed from: Q */
    private final /* synthetic */ C4746ec f14329Q;

    C4907p(C4746ec ecVar, C4779g9 g9Var) {
        this.f14329Q = ecVar;
        this.f14328P = g9Var;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14329Q.f14080i.generateEventId(this.f14328P);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18903b() {
        this.f14328P.mo19016c(null);
    }
}
