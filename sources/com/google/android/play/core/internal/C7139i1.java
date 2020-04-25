package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.android.play.core.internal.i1 */
final class C7139i1 implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C7128c1 f20241a;

    private C7139i1(C7128c1 c1Var) {
        this.f20241a = c1Var;
    }

    /* synthetic */ C7139i1(C7128c1 c1Var, byte b) {
        this(c1Var);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f20241a.f20226b.mo23043a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f20241a.m34313c((C7130d1) new C7143l1(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f20241a.f20226b.mo23043a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f20241a.m34313c((C7130d1) new C7142k1(this));
    }
}
