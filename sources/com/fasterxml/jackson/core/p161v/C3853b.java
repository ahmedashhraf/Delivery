package com.fasterxml.jackson.core.p161v;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.fasterxml.jackson.core.v.b */
/* compiled from: TypeReference */
public abstract class C3853b<T> implements Comparable<C3853b<T>> {

    /* renamed from: a */
    protected final Type f12217a;

    protected C3853b() {
        Type genericSuperclass = C3853b.class.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            this.f12217a = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            return;
        }
        throw new IllegalArgumentException("Internal error: TypeReference constructed without actual type information");
    }

    /* renamed from: a */
    public int compareTo(C3853b<T> bVar) {
        return 0;
    }

    /* renamed from: b */
    public Type mo17076b() {
        return this.f12217a;
    }
}
