package p076c.p112d.p148d.p275b;

import p076c.p112d.p148d.p149a.C2776b;

@C2776b(emulated = true)
/* renamed from: c.d.d.b.h */
/* compiled from: Platform */
final class C6524h {

    /* renamed from: a */
    private static final ThreadLocal<char[]> f18239a = new C6525a();

    /* renamed from: c.d.d.b.h$a */
    /* compiled from: Platform */
    static class C6525a extends ThreadLocal<char[]> {
        C6525a() {
        }

        /* access modifiers changed from: protected */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    private C6524h() {
    }

    /* renamed from: a */
    static char[] m31015a() {
        return (char[]) f18239a.get();
    }
}
