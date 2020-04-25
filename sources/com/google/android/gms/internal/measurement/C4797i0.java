package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4523f;

/* renamed from: com.google.android.gms.internal.measurement.i0 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4797i0 extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ Activity f14174P;

    /* renamed from: Q */
    private final /* synthetic */ C4750d f14175Q;

    C4797i0(C4750d dVar, Activity activity) {
        this.f14175Q = dVar;
        this.f14174P = activity;
        super(C4746ec.this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        C4746ec.this.f14080i.onActivityPaused(C4523f.m19511a(this.f14174P), this.f14084b);
    }
}
