package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
abstract class C5215c3 extends C5227d4 {

    /* renamed from: b */
    private boolean f14923b;

    C5215c3(C5359p4 p4Var) {
        super(p4Var);
        this.f15309a.mo21588a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo21178u() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final boolean mo21179v() {
        return this.f14923b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo21180w() {
        if (!mo21179v()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: x */
    public final void mo21181x() {
        if (this.f14923b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo21183z()) {
            this.f15309a.mo21597k();
            this.f14923b = true;
        }
    }

    /* renamed from: y */
    public final void mo21182y() {
        if (!this.f14923b) {
            mo21178u();
            this.f15309a.mo21597k();
            this.f14923b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract boolean mo21183z();
}
