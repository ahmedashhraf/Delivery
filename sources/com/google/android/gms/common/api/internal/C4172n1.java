package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C4137i.C4138a;

/* renamed from: com.google.android.gms.common.api.internal.n1 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4172n1 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f13079a;

    /* renamed from: b */
    private final /* synthetic */ C4138a f13080b;

    C4172n1(C4138a aVar, ConnectionResult connectionResult) {
        this.f13080b = aVar;
        this.f13079a = connectionResult;
    }

    public final void run() {
        this.f13080b.mo17767a(this.f13079a);
    }
}
