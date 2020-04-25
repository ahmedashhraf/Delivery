package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4523f;

/* renamed from: com.google.android.gms.internal.measurement.h0 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4784h0 extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ Activity f14163P;

    /* renamed from: Q */
    private final /* synthetic */ C4750d f14164Q;

    C4784h0(C4750d dVar, Activity activity) {
        this.f14164Q = dVar;
        this.f14163P = activity;
        super(C4746ec.this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        C4746ec.this.f14080i.onActivityStopped(C4523f.m19511a(this.f14163P), this.f14084b);
    }
}
