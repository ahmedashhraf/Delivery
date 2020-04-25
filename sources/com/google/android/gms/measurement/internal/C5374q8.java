package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.q8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5374q8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5341n8 f15423a;

    C5374q8(C5341n8 n8Var) {
        this.f15423a = n8Var;
    }

    public final void run() {
        C5330m8 m8Var = this.f15423a.f15349a;
        m8Var.mo21209h();
        m8Var.mo21205d().mo21527A().mo21549a("Application backgrounded");
        m8Var.mo21228o().mo21775b("auto", "_ab", new Bundle());
    }
}
