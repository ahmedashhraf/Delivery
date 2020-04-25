package p076c.p112d.p134b.p135a.p143g;

import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b.C6334r;

/* renamed from: c.d.b.a.g.p0 */
/* compiled from: Throwables */
public final class C6406p0 {
    private C6406p0() {
    }

    /* renamed from: a */
    public static RuntimeException m29736a(Throwable th) {
        return C6334r.m29480d(th);
    }

    /* renamed from: b */
    public static void m29738b(Throwable th) {
        if (th == null) {
            return;
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    /* renamed from: a */
    public static <X extends Throwable> void m29737a(Throwable th, Class<X> cls) throws Throwable {
        C6334r.m29478b(th, cls);
    }
}
