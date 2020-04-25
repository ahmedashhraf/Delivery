package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.b1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C4693b1 extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ C5068z0 f13993a;

    C4693b1(C5068z0 z0Var, Handler handler) {
        this.f13993a = z0Var;
        super(null);
    }

    public final void onChange(boolean z) {
        this.f13993a.mo19757b();
    }
}
