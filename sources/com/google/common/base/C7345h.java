package com.google.common.base;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.common.base.h */
/* compiled from: Defaults */
public final class C7345h {

    /* renamed from: a */
    private static final Map<Class<?>, Object> f20803a;

    static {
        HashMap hashMap = new HashMap();
        m35564a(hashMap, Boolean.TYPE, Boolean.valueOf(false));
        m35564a(hashMap, Character.TYPE, Character.valueOf(0));
        m35564a(hashMap, Byte.TYPE, Byte.valueOf(0));
        m35564a(hashMap, Short.TYPE, Short.valueOf(0));
        m35564a(hashMap, Integer.TYPE, Integer.valueOf(0));
        m35564a(hashMap, Long.TYPE, Long.valueOf(0));
        m35564a(hashMap, Float.TYPE, Float.valueOf(0.0f));
        m35564a(hashMap, Double.TYPE, Double.valueOf(0.0d));
        f20803a = Collections.unmodifiableMap(hashMap);
    }

    private C7345h() {
    }

    /* renamed from: a */
    private static <T> void m35564a(Map<Class<?>, Object> map, Class<T> cls, T t) {
        map.put(cls, t);
    }

    /* renamed from: a */
    public static <T> T m35563a(Class<T> cls) {
        return f20803a.get(C7397x.m35664a(cls));
    }
}
