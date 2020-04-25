package com.google.common.base;

import java.util.Arrays;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5944c;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.base.t */
/* compiled from: Objects */
public final class C5827t {

    /* renamed from: com.google.common.base.t$b */
    /* compiled from: Objects */
    public static final class C5829b {

        /* renamed from: a */
        private final String f16777a;

        /* renamed from: b */
        private C5830a f16778b;

        /* renamed from: c */
        private C5830a f16779c;

        /* renamed from: d */
        private boolean f16780d;

        /* renamed from: com.google.common.base.t$b$a */
        /* compiled from: Objects */
        private static final class C5830a {

            /* renamed from: a */
            String f16781a;

            /* renamed from: b */
            Object f16782b;

            /* renamed from: c */
            C5830a f16783c;

            private C5830a() {
            }
        }

        /* renamed from: b */
        private C5830a m25565b() {
            C5830a aVar = new C5830a();
            this.f16779c.f16783c = aVar;
            this.f16779c = aVar;
            return aVar;
        }

        /* renamed from: a */
        public C5829b mo23140a() {
            this.f16780d = true;
            return this;
        }

        public String toString() {
            boolean z = this.f16780d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f16777a);
            sb.append('{');
            String str = "";
            for (C5830a aVar = this.f16778b.f16783c; aVar != null; aVar = aVar.f16783c) {
                if (!z || aVar.f16782b != null) {
                    sb.append(str);
                    String str2 = aVar.f16781a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    sb.append(aVar.f16782b);
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private C5829b(String str) {
            this.f16778b = new C5830a();
            this.f16779c = this.f16778b;
            this.f16780d = false;
            this.f16777a = (String) C7397x.m35664a(str);
        }

        /* renamed from: a */
        public C5829b mo23152a(String str, @C5952h Object obj) {
            return m25567b(str, obj);
        }

        /* renamed from: b */
        private C5829b m25566b(@C5952h Object obj) {
            m25565b().f16782b = obj;
            return this;
        }

        /* renamed from: a */
        public C5829b mo23153a(String str, boolean z) {
            return m25567b(str, String.valueOf(z));
        }

        /* renamed from: a */
        public C5829b mo23147a(String str, char c) {
            return m25567b(str, String.valueOf(c));
        }

        /* renamed from: b */
        private C5829b m25567b(String str, @C5952h Object obj) {
            C5830a b = m25565b();
            b.f16782b = obj;
            b.f16781a = (String) C7397x.m35664a(str);
            return this;
        }

        /* renamed from: a */
        public C5829b mo23148a(String str, double d) {
            return m25567b(str, String.valueOf(d));
        }

        /* renamed from: a */
        public C5829b mo23149a(String str, float f) {
            return m25567b(str, String.valueOf(f));
        }

        /* renamed from: a */
        public C5829b mo23150a(String str, int i) {
            return m25567b(str, String.valueOf(i));
        }

        /* renamed from: a */
        public C5829b mo23151a(String str, long j) {
            return m25567b(str, String.valueOf(j));
        }

        /* renamed from: a */
        public C5829b mo23146a(@C5952h Object obj) {
            return m25566b(obj);
        }

        /* renamed from: a */
        public C5829b mo23154a(boolean z) {
            return m25566b(String.valueOf(z));
        }

        /* renamed from: a */
        public C5829b mo23141a(char c) {
            return m25566b(String.valueOf(c));
        }

        /* renamed from: a */
        public C5829b mo23142a(double d) {
            return m25566b(String.valueOf(d));
        }

        /* renamed from: a */
        public C5829b mo23143a(float f) {
            return m25566b(String.valueOf(f));
        }

        /* renamed from: a */
        public C5829b mo23144a(int i) {
            return m25566b(String.valueOf(i));
        }

        /* renamed from: a */
        public C5829b mo23145a(long j) {
            return m25566b(String.valueOf(j));
        }
    }

    private C5827t() {
    }

    @C5944c
    /* renamed from: a */
    public static boolean m25562a(@C5952h Object obj, @C5952h Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static C5829b m25563b(Class<?> cls) {
        return new C5829b(m25561a(cls));
    }

    /* renamed from: a */
    public static int m25558a(@C5952h Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: b */
    public static <T> T m25564b(@C5952h T t, @C5952h T t2) {
        return t != null ? t : C7397x.m35664a(t2);
    }

    /* renamed from: a */
    public static C5829b m25559a(Object obj) {
        return new C5829b(m25561a(obj.getClass()));
    }

    /* renamed from: a */
    public static C5829b m25560a(String str) {
        return new C5829b(str);
    }

    /* renamed from: a */
    private static String m25561a(Class<?> cls) {
        String replaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return replaceAll.substring(lastIndexOf + 1);
    }
}
