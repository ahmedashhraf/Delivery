package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.s */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4952s extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ Bundle f14392P;

    /* renamed from: Q */
    private final /* synthetic */ C4779g9 f14393Q;

    /* renamed from: R */
    private final /* synthetic */ C4746ec f14394R;

    C4952s(C4746ec ecVar, Bundle bundle, C4779g9 g9Var) {
        this.f14394R = ecVar;
        this.f14392P = bundle;
        this.f14393Q = g9Var;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14394R.f14080i.performAction(this.f14392P, this.f14393Q, this.f14083a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18903b() {
        this.f14393Q.mo19016c(null);
    }
}
