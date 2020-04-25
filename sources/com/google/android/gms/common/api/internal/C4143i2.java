package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.i2 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4143i2 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4148j2 f13008a;

    C4143i2(C4148j2 j2Var) {
        this.f13008a = j2Var;
    }

    public final void run() {
        this.f13008a.f13023S.mo17879b(new ConnectionResult(4));
    }
}
