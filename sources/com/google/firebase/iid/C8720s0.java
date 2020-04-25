package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.C5562l;

/* renamed from: com.google.firebase.iid.s0 */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final /* synthetic */ class C8720s0 implements Runnable {

    /* renamed from: N */
    private final C5562l f22868N;

    /* renamed from: a */
    private final C8716q0 f22869a;

    /* renamed from: b */
    private final Bundle f22870b;

    C8720s0(C8716q0 q0Var, Bundle bundle, C5562l lVar) {
        this.f22869a = q0Var;
        this.f22870b = bundle;
        this.f22868N = lVar;
    }

    public final void run() {
        this.f22869a.mo32147a(this.f22870b, this.f22868N);
    }
}
