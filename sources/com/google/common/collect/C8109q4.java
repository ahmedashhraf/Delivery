package com.google.common.collect;

import com.google.common.base.C7397x;
import java.lang.reflect.Array;
import java.util.Collection;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.q4 */
/* compiled from: ObjectArrays */
public final class C8109q4 {

    /* renamed from: a */
    static final Object[] f21911a = new Object[0];

    private C8109q4() {
    }

    @C2777c("Array.newInstance(Class, int)")
    /* renamed from: a */
    public static <T> T[] m38827a(Class<T> cls, int i) {
        return (Object[]) Array.newInstance(cls, i);
    }

    /* renamed from: b */
    static void m38838b(Object[] objArr, int i, int i2) {
        Object obj = objArr[i];
        objArr[i] = objArr[i2];
        objArr[i2] = obj;
    }

    /* renamed from: c */
    public static <T> T[] m38840c(T[] tArr, int i) {
        return C8196t4.m39151a(tArr, i);
    }

    @C2777c("Array.newInstance(Class, int)")
    /* renamed from: a */
    public static <T> T[] m38837a(T[] tArr, T[] tArr2, Class<T> cls) {
        T[] a = m38827a(cls, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, a, 0, tArr.length);
        System.arraycopy(tArr2, 0, a, tArr.length, tArr2.length);
        return a;
    }

    /* renamed from: b */
    static Object[] m38839b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m38826a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: a */
    public static <T> T[] m38829a(@C5952h T t, T[] tArr) {
        T[] c = m38840c(tArr, tArr.length + 1);
        c[0] = t;
        System.arraycopy(tArr, 0, c, 1, tArr.length);
        return c;
    }

    /* renamed from: a */
    public static <T> T[] m38836a(T[] tArr, @C5952h T t) {
        T[] a = m38833a(tArr, tArr.length + 1);
        a[tArr.length] = t;
        return a;
    }

    /* renamed from: a */
    static <T> T[] m38833a(T[] tArr, int i) {
        T[] c = m38840c(tArr, i);
        System.arraycopy(tArr, 0, c, 0, Math.min(tArr.length, i));
        return c;
    }

    /* renamed from: a */
    static <T> T[] m38831a(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = m38840c(tArr, size);
        }
        m38828a((Iterable<?>) collection, (Object[]) tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    /* renamed from: a */
    static <T> T[] m38835a(Object[] objArr, int i, int i2, T[] tArr) {
        C7397x.m35675b(i, i + i2, objArr.length);
        if (tArr.length < i2) {
            tArr = m38840c(tArr, i2);
        } else if (tArr.length > i2) {
            tArr[i2] = null;
        }
        System.arraycopy(objArr, i, tArr, 0, i2);
        return tArr;
    }

    /* renamed from: a */
    static Object[] m38830a(Collection<?> collection) {
        return m38828a((Iterable<?>) collection, new Object[collection.size()]);
    }

    /* renamed from: a */
    static Object[] m38834a(Object[] objArr, int i, int i2) {
        C7397x.m35675b(i, i + i2, objArr.length);
        if (i2 == 0) {
            return f21911a;
        }
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, i, objArr2, 0, i2);
        return objArr2;
    }

    /* renamed from: a */
    private static Object[] m38828a(Iterable<?> iterable, Object[] objArr) {
        int i = 0;
        for (Object obj : iterable) {
            int i2 = i + 1;
            objArr[i] = obj;
            i = i2;
        }
        return objArr;
    }

    /* renamed from: a */
    static Object[] m38832a(Object... objArr) {
        return m38839b(objArr, objArr.length);
    }

    /* renamed from: a */
    static Object m38826a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
