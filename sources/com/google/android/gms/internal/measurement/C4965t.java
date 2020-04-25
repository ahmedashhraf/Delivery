package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.C4523f;

/* renamed from: com.google.android.gms.internal.measurement.t */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4965t extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ int f14403P = 5;

    /* renamed from: Q */
    private final /* synthetic */ String f14404Q;

    /* renamed from: R */
    private final /* synthetic */ Object f14405R;

    /* renamed from: S */
    private final /* synthetic */ Object f14406S;

    /* renamed from: T */
    private final /* synthetic */ Object f14407T;

    /* renamed from: U */
    private final /* synthetic */ C4746ec f14408U;

    C4965t(C4746ec ecVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f14408U = ecVar;
        this.f14404Q = str;
        this.f14405R = obj;
        this.f14406S = null;
        this.f14407T = null;
        super(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        this.f14408U.f14080i.logHealthData(this.f14403P, this.f14404Q, C4523f.m19511a(this.f14405R), C4523f.m19511a(this.f14406S), C4523f.m19511a(this.f14407T));
    }
}
