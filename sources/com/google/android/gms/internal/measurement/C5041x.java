package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.measurement.internal.C5415u5;

/* renamed from: com.google.android.gms.internal.measurement.x */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C5041x extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ C5415u5 f14494P;

    /* renamed from: Q */
    private final /* synthetic */ C4746ec f14495Q;

    C5041x(C4746ec ecVar, C5415u5 u5Var) {
        this.f14495Q = ecVar;
        this.f14494P = u5Var;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        for (int i = 0; i < this.f14495Q.f14076e.size(); i++) {
            if (this.f14494P.equals(((Pair) this.f14495Q.f14076e.get(i)).first)) {
                this.f14495Q.f14072a;
                return;
            }
        }
        C4748b bVar = new C4748b(this.f14494P);
        this.f14495Q.f14076e.add(new Pair(this.f14494P, bVar));
        this.f14495Q.f14080i.registerOnMeasurementEventListener(bVar);
    }
}
