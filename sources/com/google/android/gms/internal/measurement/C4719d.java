package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.d */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4719d extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ String f14034P;

    /* renamed from: Q */
    private final /* synthetic */ String f14035Q;

    /* renamed from: R */
    private final /* synthetic */ C4779g9 f14036R;

    /* renamed from: S */
    private final /* synthetic */ C4746ec f14037S;

    C4719d(C4746ec ecVar, String str, String str2, C4779g9 g9Var) {
        this.f14037S = ecVar;
        this.f14034P = str;
        this.f14035Q = str2;
        this.f14036R = g9Var;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14037S.f14080i.getConditionalUserProperties(this.f14034P, this.f14035Q, this.f14036R);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18903b() {
        this.f14036R.mo19016c(null);
    }
}
