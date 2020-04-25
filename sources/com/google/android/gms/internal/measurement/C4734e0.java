package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4523f;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4734e0 extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ Activity f14050P;

    /* renamed from: Q */
    private final /* synthetic */ Bundle f14051Q;

    /* renamed from: R */
    private final /* synthetic */ C4750d f14052R;

    C4734e0(C4750d dVar, Activity activity, Bundle bundle) {
        this.f14052R = dVar;
        this.f14050P = activity;
        this.f14051Q = bundle;
        super(C4746ec.this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        C4746ec.this.f14080i.onActivityCreated(C4523f.m19511a(this.f14050P), this.f14051Q, this.f14084b);
    }
}
