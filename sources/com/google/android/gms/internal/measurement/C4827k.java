package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.C5426v5;

/* renamed from: com.google.android.gms.internal.measurement.k */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4827k extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ C5426v5 f14230P;

    /* renamed from: Q */
    private final /* synthetic */ C4746ec f14231Q;

    C4827k(C4746ec ecVar, C5426v5 v5Var) {
        this.f14231Q = ecVar;
        this.f14230P = v5Var;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14231Q.f14080i.setEventInterceptor(new C4749c(this.f14230P));
    }
}
