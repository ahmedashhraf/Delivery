package com.google.common.base;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
@C2775a
/* renamed from: com.google.common.base.i */
/* compiled from: Enums */
public final class C7354i {
    @C2777c("java.lang.ref.WeakReference")

    /* renamed from: a */
    private static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> f20815a = new WeakHashMap();

    /* renamed from: com.google.common.base.i$b */
    /* compiled from: Enums */
    private static final class C7356b<T extends Enum<T>> extends C7337g<String, T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        private final Class<T> f20816N;

        C7356b(Class<T> cls) {
            this.f20816N = (Class) C7397x.m35664a(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo26637f(T t) {
            return t.name();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public T mo26638g(String str) {
            return Enum.valueOf(this.f20816N, str);
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7356b)) {
                return false;
            }
            return this.f20816N.equals(((C7356b) obj).f20816N);
        }

        public int hashCode() {
            return this.f20816N.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Enums.stringConverter(");
            sb.append(this.f20816N.getName());
            sb.append(".class)");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.i$c */
    /* compiled from: Enums */
    private static final class C7357c<T extends Enum<T>> implements C7380p<String, T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Class<T> f20817a;

        /* renamed from: b */
        public T apply(String str) {
            try {
                return Enum.valueOf(this.f20817a, str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public boolean equals(@C5952h Object obj) {
            return (obj instanceof C7357c) && this.f20817a.equals(((C7357c) obj).f20817a);
        }

        public int hashCode() {
            return this.f20817a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Enums.valueOf(");
            sb.append(this.f20817a);
            sb.append(")");
            return sb.toString();
        }

        private C7357c(Class<T> cls) {
            this.f20817a = (Class) C7397x.m35664a(cls);
        }
    }

    private C7354i() {
    }

    @C2777c("reflection")
    /* renamed from: a */
    public static Field m35573a(Enum<?> enumR) {
        try {
            return enumR.getDeclaringClass().getDeclaredField(enumR.name());
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    @C2777c("java.lang.ref.WeakReference")
    /* renamed from: b */
    private static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> m35575b(Class<T> cls) {
        HashMap hashMap = new HashMap();
        Iterator it = EnumSet.allOf(cls).iterator();
        while (it.hasNext()) {
            Enum enumR = (Enum) it.next();
            hashMap.put(enumR.name(), new WeakReference(enumR));
        }
        f20815a.put(cls, hashMap);
        return hashMap;
    }

    /* renamed from: c */
    public static <T extends Enum<T>> C7337g<String, T> m35576c(Class<T> cls) {
        return new C7356b(cls);
    }

    @Deprecated
    /* renamed from: d */
    public static <T extends Enum<T>> C7380p<String, T> m35577d(Class<T> cls) {
        return new C7357c(cls);
    }

    /* renamed from: a */
    public static <T extends Enum<T>> C7392u<T> m35572a(Class<T> cls, String str) {
        C7397x.m35664a(cls);
        C7397x.m35664a(str);
        return C7396w.m35662a(cls, str);
    }

    @C2777c("java.lang.ref.WeakReference")
    /* renamed from: a */
    static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> m35574a(Class<T> cls) {
        Map<String, WeakReference<? extends Enum<?>>> map;
        synchronized (f20815a) {
            map = (Map) f20815a.get(cls);
            if (map == null) {
                map = m35575b(cls);
            }
        }
        return map;
    }
}
