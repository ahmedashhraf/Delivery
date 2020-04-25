package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.h1 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
abstract class C4134h1 {

    /* renamed from: a */
    private final C4124f1 f12949a;

    protected C4134h1(C4124f1 f1Var) {
        this.f12949a = f1Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17840a();

    /* renamed from: a */
    public final void mo17841a(C4142i1 i1Var) {
        i1Var.f13006a.lock();
        try {
            if (i1Var.f13001V == this.f12949a) {
                mo17840a();
                i1Var.f13006a.unlock();
            }
        } finally {
            i1Var.f13006a.unlock();
        }
    }
}
