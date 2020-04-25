package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v8 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
abstract class C5429v8 extends C5440w8 {

    /* renamed from: c */
    private boolean f15535c;

    C5429v8(C5461y8 y8Var) {
        super(y8Var);
        this.f15561b.mo21836a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final boolean mo21738r() {
        return this.f15535c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo21739s() {
        if (!mo21738r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: t */
    public final void mo21740t() {
        if (!this.f15535c) {
            mo21219u();
            this.f15561b.mo21864r();
            this.f15535c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract boolean mo21219u();
}
