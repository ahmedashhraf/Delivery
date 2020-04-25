package p076c.p112d.p148d.p150g;

import com.google.common.base.C7397x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: c.d.d.g.i */
/* compiled from: Primitives */
public final class C6646i {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f18619a;

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f18620b;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m31723a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m31723a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m31723a(hashMap, hashMap2, Character.TYPE, Character.class);
        m31723a(hashMap, hashMap2, Double.TYPE, Double.class);
        m31723a(hashMap, hashMap2, Float.TYPE, Float.class);
        m31723a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m31723a(hashMap, hashMap2, Long.TYPE, Long.class);
        m31723a(hashMap, hashMap2, Short.TYPE, Short.class);
        m31723a(hashMap, hashMap2, Void.TYPE, Void.class);
        f18619a = Collections.unmodifiableMap(hashMap);
        f18620b = Collections.unmodifiableMap(hashMap2);
    }

    private C6646i() {
    }

    /* renamed from: a */
    private static void m31723a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: b */
    public static Set<Class<?>> m31726b() {
        return f18620b.keySet();
    }

    /* renamed from: c */
    public static <T> Class<T> m31727c(Class<T> cls) {
        C7397x.m35664a(cls);
        Class cls2 = (Class) f18619a.get(cls);
        return cls2 == null ? cls : cls2;
    }

    /* renamed from: b */
    public static <T> Class<T> m31725b(Class<T> cls) {
        C7397x.m35664a(cls);
        Class cls2 = (Class) f18620b.get(cls);
        return cls2 == null ? cls : cls2;
    }

    /* renamed from: a */
    public static Set<Class<?>> m31722a() {
        return f18619a.keySet();
    }

    /* renamed from: a */
    public static boolean m31724a(Class<?> cls) {
        return f18620b.containsKey(C7397x.m35664a(cls));
    }
}
