package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
abstract class C5360p5 extends C5327m5 {

    /* renamed from: b */
    private boolean f15403b;

    C5360p5(C5359p4 p4Var) {
        super(p4Var);
        this.f15309a.mo21589a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo21388n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo21613o() {
        if (!mo21616s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: p */
    public final void mo21614p() {
        if (this.f15403b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo21326r()) {
            this.f15309a.mo21597k();
            this.f15403b = true;
        }
    }

    /* renamed from: q */
    public final void mo21615q() {
        if (!this.f15403b) {
            mo21388n();
            this.f15309a.mo21597k();
            this.f15403b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract boolean mo21326r();

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final boolean mo21616s() {
        return this.f15403b;
    }
}
