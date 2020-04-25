package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.q */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4920q extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ String f14369P;

    /* renamed from: Q */
    private final /* synthetic */ String f14370Q;

    /* renamed from: R */
    private final /* synthetic */ boolean f14371R;

    /* renamed from: S */
    private final /* synthetic */ C4779g9 f14372S;

    /* renamed from: T */
    private final /* synthetic */ C4746ec f14373T;

    C4920q(C4746ec ecVar, String str, String str2, boolean z, C4779g9 g9Var) {
        this.f14373T = ecVar;
        this.f14369P = str;
        this.f14370Q = str2;
        this.f14371R = z;
        this.f14372S = g9Var;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14373T.f14080i.getUserProperties(this.f14369P, this.f14370Q, this.f14371R, this.f14372S);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18903b() {
        this.f14372S.mo19016c(null);
    }
}
