package com.google.gson.p321x;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.gson.x.j */
/* compiled from: Primitives */
public final class C8849j {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f23205a;

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f23206b;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m41440a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m41440a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m41440a(hashMap, hashMap2, Character.TYPE, Character.class);
        m41440a(hashMap, hashMap2, Double.TYPE, Double.class);
        m41440a(hashMap, hashMap2, Float.TYPE, Float.class);
        m41440a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m41440a(hashMap, hashMap2, Long.TYPE, Long.class);
        m41440a(hashMap, hashMap2, Short.TYPE, Short.class);
        m41440a(hashMap, hashMap2, Void.TYPE, Void.class);
        f23205a = Collections.unmodifiableMap(hashMap);
        f23206b = Collections.unmodifiableMap(hashMap2);
    }

    private C8849j() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private static void m41440a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: b */
    public static boolean m41443b(Type type) {
        return f23206b.containsKey(C8806a.m41344a(type));
    }

    /* renamed from: a */
    public static boolean m41441a(Type type) {
        return f23205a.containsKey(type);
    }

    /* renamed from: a */
    public static <T> Class<T> m41439a(Class<T> cls) {
        Class cls2 = (Class) f23206b.get(C8806a.m41344a(cls));
        return cls2 == null ? cls : cls2;
    }

    /* renamed from: b */
    public static <T> Class<T> m41442b(Class<T> cls) {
        Class cls2 = (Class) f23205a.get(C8806a.m41344a(cls));
        return cls2 == null ? cls : cls2;
    }
}
