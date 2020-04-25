package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.d0 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4720d0 extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ Bundle f14038P;

    /* renamed from: Q */
    private final /* synthetic */ C4746ec f14039Q;

    C4720d0(C4746ec ecVar, Bundle bundle) {
        this.f14039Q = ecVar;
        this.f14038P = bundle;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14039Q.f14080i.setConditionalUserProperty(this.f14038P, this.f14083a);
    }
}
