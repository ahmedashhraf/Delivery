package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.c */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4705c extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ String f14013P;

    /* renamed from: Q */
    private final /* synthetic */ C4746ec f14014Q;

    C4705c(C4746ec ecVar, String str) {
        this.f14014Q = ecVar;
        this.f14013P = str;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14014Q.f14080i.setUserId(this.f14013P, this.f14083a);
    }
}
