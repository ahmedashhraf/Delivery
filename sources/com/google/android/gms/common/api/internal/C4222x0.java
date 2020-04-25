package com.google.android.gms.common.api.internal;

import androidx.annotation.C0226w0;

/* renamed from: com.google.android.gms.common.api.internal.x0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
abstract class C4222x0 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4171n0 f13178a;

    private C4222x0(C4171n0 n0Var) {
        this.f13178a = n0Var;
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public abstract void mo17942a();

    @C0226w0
    public void run() {
        this.f13178a.f13059b.lock();
        try {
            if (!Thread.interrupted()) {
                mo17942a();
                this.f13178a.f13059b.unlock();
            }
        } catch (RuntimeException e) {
            this.f13178a.f13058a.mo17890a(e);
        } finally {
            this.f13178a.f13059b.unlock();
        }
    }

    /* synthetic */ C4222x0(C4171n0 n0Var, C4163m0 m0Var) {
        this(n0Var);
    }
}
