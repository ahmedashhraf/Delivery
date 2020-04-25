package p076c.p112d.p134b.p135a.p143g.p269s0;

/* renamed from: c.d.b.a.g.s0.d */
/* compiled from: Platform */
final class C6420d {

    /* renamed from: a */
    private static final ThreadLocal<char[]> f17896a = new C6421a();

    /* renamed from: c.d.b.a.g.s0.d$a */
    /* compiled from: Platform */
    static class C6421a extends ThreadLocal<char[]> {
        C6421a() {
        }

        /* access modifiers changed from: protected */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    private C6420d() {
    }

    /* renamed from: a */
    static char[] m29807a() {
        return (char[]) f17896a.get();
    }
}
