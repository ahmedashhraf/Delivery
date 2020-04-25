package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.n */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4881n extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ C4779g9 f14280P;

    /* renamed from: Q */
    private final /* synthetic */ C4746ec f14281Q;

    C4881n(C4746ec ecVar, C4779g9 g9Var) {
        this.f14281Q = ecVar;
        this.f14280P = g9Var;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14281Q.f14080i.getGmpAppId(this.f14280P);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18903b() {
        this.f14280P.mo19016c(null);
    }
}
