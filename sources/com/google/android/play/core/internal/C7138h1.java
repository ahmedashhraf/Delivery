package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.h1 */
final class C7138h1 extends C7130d1 {

    /* renamed from: b */
    private final /* synthetic */ C7128c1 f20240b;

    C7138h1(C7128c1 c1Var) {
        this.f20240b = c1Var;
    }

    /* renamed from: a */
    public final void mo25050a() {
        if (this.f20240b.f20235k != null) {
            this.f20240b.f20226b.mo23043a("Unbind from service.", new Object[0]);
            this.f20240b.f20225a.unbindService(this.f20240b.f20234j);
            this.f20240b.f20229e = false;
            this.f20240b.f20235k = null;
            this.f20240b.f20234j = null;
        }
    }
}
