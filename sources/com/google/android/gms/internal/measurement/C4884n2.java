package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n2 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4884n2 extends C4817j2 {

    /* renamed from: b */
    private final C4871m2 f14283b = new C4871m2();

    C4884n2() {
    }

    /* renamed from: a */
    public final void mo19153a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f14283b.mo19271a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
