package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.C4523f;

/* renamed from: com.google.android.gms.internal.measurement.a0 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4678a0 extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ String f13960P;

    /* renamed from: Q */
    private final /* synthetic */ String f13961Q;

    /* renamed from: R */
    private final /* synthetic */ Object f13962R;

    /* renamed from: S */
    private final /* synthetic */ boolean f13963S;

    /* renamed from: T */
    private final /* synthetic */ C4746ec f13964T;

    C4678a0(C4746ec ecVar, String str, String str2, Object obj, boolean z) {
        this.f13964T = ecVar;
        this.f13960P = str;
        this.f13961Q = str2;
        this.f13962R = obj;
        this.f13963S = z;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f13964T.f14080i.setUserProperty(this.f13960P, this.f13961Q, C4523f.m19511a(this.f13962R), this.f13963S, this.f14083a);
    }
}
