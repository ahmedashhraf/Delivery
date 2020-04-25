package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.v */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C5015v extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ String f14456P;

    /* renamed from: Q */
    private final /* synthetic */ C4779g9 f14457Q;

    /* renamed from: R */
    private final /* synthetic */ C4746ec f14458R;

    C5015v(C4746ec ecVar, String str, C4779g9 g9Var) {
        this.f14458R = ecVar;
        this.f14456P = str;
        this.f14457Q = g9Var;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14458R.f14080i.getMaxUserProperties(this.f14456P, this.f14457Q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18903b() {
        this.f14457Q.mo19016c(null);
    }
}
