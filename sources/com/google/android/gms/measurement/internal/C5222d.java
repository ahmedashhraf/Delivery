package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.internal.measurement.C4764f8;

/* renamed from: com.google.android.gms.measurement.internal.d */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
abstract class C5222d {

    /* renamed from: d */
    private static volatile Handler f14933d;

    /* renamed from: a */
    private final C5349o5 f14934a;

    /* renamed from: b */
    private final Runnable f14935b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile long f14936c;

    C5222d(C5349o5 o5Var) {
        C4300a0.m18620a(o5Var);
        this.f14934a = o5Var;
        this.f14935b = new C5211c(this, o5Var);
    }

    /* renamed from: d */
    private final Handler m22585d() {
        Handler handler;
        if (f14933d != null) {
            return f14933d;
        }
        synchronized (C5222d.class) {
            if (f14933d == null) {
                f14933d = new C4764f8(this.f14934a.mo21206e().getMainLooper());
            }
            handler = f14933d;
        }
        return handler;
    }

    /* renamed from: a */
    public abstract void mo21221a();

    /* renamed from: a */
    public final void mo21222a(long j) {
        mo21224c();
        if (j >= 0) {
            this.f14936c = this.f14934a.mo21208g().mo18569a();
            if (!m22585d().postDelayed(this.f14935b, j)) {
                this.f14934a.mo21205d().mo21533t().mo21550a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo21223b() {
        return this.f14936c != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo21224c() {
        this.f14936c = 0;
        m22585d().removeCallbacks(this.f14935b);
    }
}
