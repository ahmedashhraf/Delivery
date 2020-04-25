package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4523f;

/* renamed from: com.google.android.gms.internal.measurement.k0 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4828k0 extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ Activity f14232P;

    /* renamed from: Q */
    private final /* synthetic */ C4779g9 f14233Q;

    /* renamed from: R */
    private final /* synthetic */ C4750d f14234R;

    C4828k0(C4750d dVar, Activity activity, C4779g9 g9Var) {
        this.f14234R = dVar;
        this.f14232P = activity;
        this.f14233Q = g9Var;
        super(C4746ec.this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        C4746ec.this.f14080i.onActivitySaveInstanceState(C4523f.m19511a(this.f14232P), this.f14233Q, this.f14084b);
    }
}
