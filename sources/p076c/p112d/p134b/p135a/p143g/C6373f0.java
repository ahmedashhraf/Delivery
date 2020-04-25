package p076c.p112d.p134b.p135a.p143g;

import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b.C2747h;

/* renamed from: c.d.b.a.g.f0 */
/* compiled from: Objects */
public final class C6373f0 {

    /* renamed from: c.d.b.a.g.f0$b */
    /* compiled from: Objects */
    public static final class C6375b {

        /* renamed from: a */
        private final String f17785a;

        /* renamed from: b */
        private C6376a f17786b = new C6376a();

        /* renamed from: c */
        private C6376a f17787c = this.f17786b;

        /* renamed from: d */
        private boolean f17788d;

        /* renamed from: c.d.b.a.g.f0$b$a */
        /* compiled from: Objects */
        private static final class C6376a {

            /* renamed from: a */
            String f17789a;

            /* renamed from: b */
            Object f17790b;

            /* renamed from: c */
            C6376a f17791c;

            private C6376a() {
            }
        }

        C6375b(String str) {
            this.f17785a = str;
        }

        /* renamed from: b */
        private C6376a m29652b() {
            C6376a aVar = new C6376a();
            this.f17787c.f17791c = aVar;
            this.f17787c = aVar;
            return aVar;
        }

        /* renamed from: a */
        public C6375b mo25751a() {
            this.f17788d = true;
            return this;
        }

        public String toString() {
            boolean z = this.f17788d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f17785a);
            sb.append('{');
            String str = "";
            for (C6376a aVar = this.f17786b.f17791c; aVar != null; aVar = aVar.f17791c) {
                if (!z || aVar.f17790b != null) {
                    sb.append(str);
                    String str2 = aVar.f17789a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    sb.append(aVar.f17790b);
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: a */
        public C6375b mo25752a(String str, Object obj) {
            return m29653b(str, obj);
        }

        /* renamed from: b */
        private C6375b m29653b(String str, Object obj) {
            C6376a b = m29652b();
            b.f17790b = obj;
            b.f17789a = (String) C6381h0.m29663a(str);
            return this;
        }
    }

    private C6373f0() {
    }

    /* renamed from: a */
    public static boolean m29651a(Object obj, Object obj2) {
        return C2747h.m13281a(obj, obj2);
    }

    /* renamed from: a */
    public static C6375b m29650a(Object obj) {
        return new C6375b(obj.getClass().getSimpleName());
    }
}
