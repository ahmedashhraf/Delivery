package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.c0 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4706c0 extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ Long f14015P;

    /* renamed from: Q */
    private final /* synthetic */ String f14016Q;

    /* renamed from: R */
    private final /* synthetic */ String f14017R;

    /* renamed from: S */
    private final /* synthetic */ Bundle f14018S;

    /* renamed from: T */
    private final /* synthetic */ boolean f14019T;

    /* renamed from: U */
    private final /* synthetic */ boolean f14020U;

    /* renamed from: V */
    private final /* synthetic */ C4746ec f14021V;

    C4706c0(C4746ec ecVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        this.f14021V = ecVar;
        this.f14015P = l;
        this.f14016Q = str;
        this.f14017R = str2;
        this.f14018S = bundle;
        this.f14019T = z;
        this.f14020U = z2;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        Long l = this.f14015P;
        this.f14021V.f14080i.logEvent(this.f14016Q, this.f14017R, this.f14018S, this.f14019T, this.f14020U, l == null ? this.f14083a : l.longValue());
    }
}
