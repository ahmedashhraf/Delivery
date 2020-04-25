package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.m0 */
final class C5752m0 extends C5750l0 {

    /* renamed from: a */
    private final C5748k0 f16620a = new C5748k0();

    C5752m0() {
    }

    /* renamed from: a */
    public final void mo23049a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f16620a.mo23051a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
