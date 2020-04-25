package p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b;

import java.util.Arrays;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2716b;
import p201f.p202a.C5944c;
import p201f.p202a.C5952h;

@C2716b
/* renamed from: c.d.b.a.e.a.a.a.b.h */
/* compiled from: Objects */
public final class C2747h {

    /* renamed from: c.d.b.a.e.a.a.a.b.h$b */
    /* compiled from: Objects */
    public static final class C2749b {

        /* renamed from: a */
        private final String f9886a;

        /* renamed from: b */
        private C2750a f9887b;

        /* renamed from: c */
        private C2750a f9888c;

        /* renamed from: d */
        private boolean f9889d;

        /* renamed from: c.d.b.a.e.a.a.a.b.h$b$a */
        /* compiled from: Objects */
        private static final class C2750a {

            /* renamed from: a */
            String f9890a;

            /* renamed from: b */
            Object f9891b;

            /* renamed from: c */
            C2750a f9892c;

            private C2750a() {
            }
        }

        /* renamed from: b */
        private C2750a m13284b() {
            C2750a aVar = new C2750a();
            this.f9888c.f9892c = aVar;
            this.f9888c = aVar;
            return aVar;
        }

        /* renamed from: a */
        public C2749b mo10448a() {
            this.f9889d = true;
            return this;
        }

        public String toString() {
            boolean z = this.f9889d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f9886a);
            sb.append('{');
            String str = "";
            for (C2750a aVar = this.f9887b.f9892c; aVar != null; aVar = aVar.f9892c) {
                if (!z || aVar.f9891b != null) {
                    sb.append(str);
                    String str2 = aVar.f9890a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    sb.append(aVar.f9891b);
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private C2749b(String str) {
            this.f9887b = new C2750a();
            this.f9888c = this.f9887b;
            this.f9889d = false;
            this.f9886a = (String) C6329k.m29434a(str);
        }

        /* renamed from: a */
        public C2749b mo10460a(String str, @C5952h Object obj) {
            return m13286b(str, obj);
        }

        /* renamed from: b */
        private C2749b m13285b(@C5952h Object obj) {
            m13284b().f9891b = obj;
            return this;
        }

        /* renamed from: a */
        public C2749b mo10461a(String str, boolean z) {
            return m13286b(str, String.valueOf(z));
        }

        /* renamed from: a */
        public C2749b mo10455a(String str, char c) {
            return m13286b(str, String.valueOf(c));
        }

        /* renamed from: b */
        private C2749b m13286b(String str, @C5952h Object obj) {
            C2750a b = m13284b();
            b.f9891b = obj;
            b.f9890a = (String) C6329k.m29434a(str);
            return this;
        }

        /* renamed from: a */
        public C2749b mo10456a(String str, double d) {
            return m13286b(str, String.valueOf(d));
        }

        /* renamed from: a */
        public C2749b mo10457a(String str, float f) {
            return m13286b(str, String.valueOf(f));
        }

        /* renamed from: a */
        public C2749b mo10458a(String str, int i) {
            return m13286b(str, String.valueOf(i));
        }

        /* renamed from: a */
        public C2749b mo10459a(String str, long j) {
            return m13286b(str, String.valueOf(j));
        }

        /* renamed from: a */
        public C2749b mo10454a(@C5952h Object obj) {
            return m13285b(obj);
        }

        /* renamed from: a */
        public C2749b mo10462a(boolean z) {
            return m13285b(String.valueOf(z));
        }

        /* renamed from: a */
        public C2749b mo10449a(char c) {
            return m13285b(String.valueOf(c));
        }

        /* renamed from: a */
        public C2749b mo10450a(double d) {
            return m13285b(String.valueOf(d));
        }

        /* renamed from: a */
        public C2749b mo10451a(float f) {
            return m13285b(String.valueOf(f));
        }

        /* renamed from: a */
        public C2749b mo10452a(int i) {
            return m13285b(String.valueOf(i));
        }

        /* renamed from: a */
        public C2749b mo10453a(long j) {
            return m13285b(String.valueOf(j));
        }
    }

    private C2747h() {
    }

    @C5944c
    /* renamed from: a */
    public static boolean m13281a(@C5952h Object obj, @C5952h Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static C2749b m13282b(Class<?> cls) {
        return new C2749b(m13280a(cls));
    }

    /* renamed from: a */
    public static int m13277a(@C5952h Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: b */
    public static <T> T m13283b(@C5952h T t, @C5952h T t2) {
        return t != null ? t : C6329k.m29434a(t2);
    }

    /* renamed from: a */
    public static C2749b m13278a(Object obj) {
        return new C2749b(m13280a(obj.getClass()));
    }

    /* renamed from: a */
    public static C2749b m13279a(String str) {
        return new C2749b(str);
    }

    /* renamed from: a */
    private static String m13280a(Class<?> cls) {
        String replaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return replaceAll.substring(lastIndexOf + 1);
    }
}
