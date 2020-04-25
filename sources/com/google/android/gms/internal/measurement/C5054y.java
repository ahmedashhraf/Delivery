package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.measurement.internal.C5415u5;

/* renamed from: com.google.android.gms.internal.measurement.y */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C5054y extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ C5415u5 f14516P;

    /* renamed from: Q */
    private final /* synthetic */ C4746ec f14517Q;

    C5054y(C4746ec ecVar, C5415u5 u5Var) {
        this.f14517Q = ecVar;
        this.f14516P = u5Var;
        super(ecVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18823a() throws RemoteException {
        Pair pair;
        int i = 0;
        while (true) {
            if (i >= this.f14517Q.f14076e.size()) {
                pair = null;
                break;
            } else if (this.f14516P.equals(((Pair) this.f14517Q.f14076e.get(i)).first)) {
                pair = (Pair) this.f14517Q.f14076e.get(i);
                break;
            } else {
                i++;
            }
        }
        if (pair == null) {
            this.f14517Q.f14072a;
            return;
        }
        this.f14517Q.f14080i.unregisterOnMeasurementEventListener((C4690ac) pair.second);
        this.f14517Q.f14076e.remove(pair);
    }
}
