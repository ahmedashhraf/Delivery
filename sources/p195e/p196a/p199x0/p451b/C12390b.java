package p195e.p196a.p199x0.p451b;

import p195e.p196a.p449w0.C12328d;

/* renamed from: e.a.x0.b.b */
/* compiled from: ObjectHelper */
public final class C12390b {

    /* renamed from: a */
    static final C12328d<Object, Object> f35541a = new C12391a();

    /* renamed from: e.a.x0.b.b$a */
    /* compiled from: ObjectHelper */
    static final class C12391a implements C12328d<Object, Object> {
        C12391a() {
        }

        /* renamed from: a */
        public boolean mo42089a(Object obj, Object obj2) {
            return C12390b.m55564a(obj, obj2);
        }
    }

    private C12390b() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static int m55557a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m55559a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* renamed from: a */
    public static <T> T m55563a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m55564a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static int m55560a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    public static <T> C12328d<T, T> m55562a() {
        return f35541a;
    }

    /* renamed from: a */
    public static int m55558a(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static long m55561a(long j, String str) {
        if (j > 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }
}
