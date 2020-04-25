package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.w */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C5028w extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ C4779g9 f14487P;

    /* renamed from: Q */
    private final /* synthetic */ int f14488Q;

    /* renamed from: R */
    private final /* synthetic */ C4746ec f14489R;

    C5028w(C4746ec ecVar, C4779g9 g9Var, int i) {
        this.f14489R = ecVar;
        this.f14487P = g9Var;
        this.f14488Q = i;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14489R.f14080i.getTestFlag(this.f14487P, this.f14488Q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18903b() {
        this.f14487P.mo19016c(null);
    }
}
