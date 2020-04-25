package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4523f;

/* renamed from: com.google.android.gms.internal.measurement.f */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4751f extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ Activity f14088P;

    /* renamed from: Q */
    private final /* synthetic */ String f14089Q;

    /* renamed from: R */
    private final /* synthetic */ String f14090R;

    /* renamed from: S */
    private final /* synthetic */ C4746ec f14091S;

    C4751f(C4746ec ecVar, Activity activity, String str, String str2) {
        this.f14091S = ecVar;
        this.f14088P = activity;
        this.f14089Q = str;
        this.f14090R = str2;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14091S.f14080i.setCurrentScreen(C4523f.m19511a(this.f14088P), this.f14089Q, this.f14090R, this.f14083a);
    }
}
