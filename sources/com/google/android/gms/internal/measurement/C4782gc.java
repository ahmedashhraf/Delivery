package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.gc */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4782gc extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ String f14158P;

    /* renamed from: Q */
    private final /* synthetic */ String f14159Q;

    /* renamed from: R */
    private final /* synthetic */ Bundle f14160R;

    /* renamed from: S */
    private final /* synthetic */ C4746ec f14161S;

    C4782gc(C4746ec ecVar, String str, String str2, Bundle bundle) {
        this.f14161S = ecVar;
        this.f14158P = str;
        this.f14159Q = str2;
        this.f14160R = bundle;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14161S.f14080i.clearConditionalUserProperty(this.f14158P, this.f14159Q, this.f14160R);
    }
}
