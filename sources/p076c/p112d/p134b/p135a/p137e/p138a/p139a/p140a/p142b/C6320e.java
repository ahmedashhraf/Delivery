package p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2715a;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2716b;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2717c;
import p201f.p202a.C5952h;

@C2715a
@C2716b(emulated = true)
/* renamed from: c.d.b.a.e.a.a.a.b.e */
/* compiled from: Enums */
public final class C6320e {
    @C2717c("java.lang.ref.WeakReference")

    /* renamed from: a */
    private static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> f17694a = new WeakHashMap();

    /* renamed from: c.d.b.a.e.a.a.a.b.e$b */
    /* compiled from: Enums */
    private static final class C6322b<T extends Enum<T>> extends C6313d<String, T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        private final Class<T> f17695N;

        C6322b(Class<T> cls) {
            this.f17695N = (Class) C6329k.m29434a(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo25605d(T t) {
            return t.name();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public T mo25606e(String str) {
            return Enum.valueOf(this.f17695N, str);
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C6322b)) {
                return false;
            }
            return this.f17695N.equals(((C6322b) obj).f17695N);
        }

        public int hashCode() {
            return this.f17695N.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Enums.stringConverter(");
            sb.append(this.f17695N.getName());
            sb.append(".class)");
            return sb.toString();
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.e$c */
    /* compiled from: Enums */
    private static final class C6323c<T extends Enum<T>> implements C6324f<String, T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Class<T> f17696a;

        /* renamed from: b */
        public T apply(String str) {
            try {
                return Enum.valueOf(this.f17696a, str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public boolean equals(@C5952h Object obj) {
            return (obj instanceof C6323c) && this.f17696a.equals(((C6323c) obj).f17696a);
        }

        public int hashCode() {
            return this.f17696a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Enums.valueOf(");
            sb.append(this.f17696a);
            sb.append(")");
            return sb.toString();
        }

        private C6323c(Class<T> cls) {
            this.f17696a = (Class) C6329k.m29434a(cls);
        }
    }

    private C6320e() {
    }

    @C2717c("reflection")
    /* renamed from: a */
    public static Field m29407a(Enum<?> enumR) {
        try {
            return enumR.getDeclaringClass().getDeclaredField(enumR.name());
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    @C2717c("java.lang.ref.WeakReference")
    /* renamed from: b */
    private static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> m29409b(Class<T> cls) {
        HashMap hashMap = new HashMap();
        Iterator it = EnumSet.allOf(cls).iterator();
        while (it.hasNext()) {
            Enum enumR = (Enum) it.next();
            hashMap.put(enumR.name(), new WeakReference(enumR));
        }
        f17694a.put(cls, hashMap);
        return hashMap;
    }

    /* renamed from: c */
    public static <T extends Enum<T>> C6313d<String, T> m29410c(Class<T> cls) {
        return new C6322b(cls);
    }

    @Deprecated
    /* renamed from: d */
    public static <T extends Enum<T>> C6324f<String, T> m29411d(Class<T> cls) {
        return new C6323c(cls);
    }

    /* renamed from: a */
    public static <T extends Enum<T>> C6325i<T> m29406a(Class<T> cls, String str) {
        C6329k.m29434a(cls);
        C6329k.m29434a(str);
        return C6328j.m29432a(cls, str);
    }

    @C2717c("java.lang.ref.WeakReference")
    /* renamed from: a */
    static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> m29408a(Class<T> cls) {
        Map<String, WeakReference<? extends Enum<?>>> map;
        synchronized (f17694a) {
            map = (Map) f17694a.get(cls);
            if (map == null) {
                map = m29409b(cls);
            }
        }
        return map;
    }
}
