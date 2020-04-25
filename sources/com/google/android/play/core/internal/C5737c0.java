package com.google.android.play.core.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.android.play.core.internal.c0 */
public class C5737c0<T> {

    /* renamed from: a */
    private final Object f16604a;

    /* renamed from: b */
    private final Field f16605b;

    /* renamed from: c */
    private final Class<T> f16606c;

    C5737c0(Object obj, Field field, Class<T> cls) {
        this.f16604a = obj;
        this.f16605b = field;
        this.f16606c = cls;
    }

    C5737c0(Object obj, Field field, Class<T> cls, byte b) {
        this(obj, field, m25210a(cls));
    }

    /* renamed from: a */
    private static <T> Class<T[]> m25210a(Class<T> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: b */
    private Class<T> m25211b() {
        return this.f16605b.getType().getComponentType();
    }

    /* renamed from: a */
    public final T mo23032a() {
        try {
            return this.f16606c.cast(this.f16605b.get(this.f16604a));
        } catch (Exception e) {
            throw new C5736bb(String.format("Failed to get value of field %s of type %s on object of type %s", new Object[]{this.f16605b.getName(), this.f16604a.getClass().getName(), this.f16606c.getName()}), e);
        }
    }

    /* renamed from: a */
    public final void mo23033a(T t) {
        try {
            this.f16605b.set(this.f16604a, t);
        } catch (Exception e) {
            throw new C5736bb(String.format("Failed to set value of field %s of type %s on object of type %s", new Object[]{this.f16605b.getName(), this.f16604a.getClass().getName(), this.f16606c.getName()}), e);
        }
    }

    /* renamed from: a */
    public void mo23034a(Collection<T> collection) {
        Object[] objArr = (Object[]) mo23032a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(m25211b(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (T t : collection) {
            objArr2[length] = t;
            length++;
        }
        mo23033a((T) objArr2);
    }

    /* renamed from: a */
    public void mo23035a(T[] tArr) {
        mo23034a((Collection<T>) Arrays.asList(tArr));
    }

    /* renamed from: b */
    public void mo23036b(Collection<T> collection) {
        Object[] objArr = (Object[]) mo23032a();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(m25211b(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        for (T t : collection) {
            objArr2[i] = t;
            i++;
        }
        mo23033a((T) objArr2);
    }

    /* renamed from: b */
    public void mo23037b(T[] tArr) {
        mo23036b((Collection<T>) Arrays.asList(tArr));
    }
}
