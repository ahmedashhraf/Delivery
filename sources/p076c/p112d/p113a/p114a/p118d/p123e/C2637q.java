package p076c.p112d.p113a.p114a.p118d.p123e;

/* renamed from: c.d.a.a.d.e.q */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C2637q extends C2636p {

    /* renamed from: b */
    private final C2635o f9752b = new C2635o();

    C2637q() {
    }

    /* renamed from: a */
    public final void mo10149a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f9752b.mo10150a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
