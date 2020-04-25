package p195e.p196a.p199x0.p200j;

/* renamed from: e.a.x0.j.t */
/* compiled from: Pow2 */
public final class C13767t {
    private C13767t() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static boolean m58770a(int i) {
        return (i & (i + -1)) == 0;
    }

    /* renamed from: b */
    public static int m58771b(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
