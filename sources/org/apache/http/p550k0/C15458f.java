package org.apache.http.p550k0;

/* renamed from: org.apache.http.k0.f */
/* compiled from: LangUtils */
public final class C15458f {

    /* renamed from: a */
    public static final int f44621a = 17;

    /* renamed from: b */
    public static final int f44622b = 37;

    private C15458f() {
    }

    /* renamed from: a */
    public static int m68504a(int i, int i2) {
        return (i * 37) + i2;
    }

    /* renamed from: a */
    public static int m68506a(int i, boolean z) {
        return m68504a(i, z ? 1 : 0);
    }

    /* renamed from: a */
    public static int m68505a(int i, Object obj) {
        return m68504a(i, obj != null ? obj.hashCode() : 0);
    }

    /* renamed from: a */
    public static boolean m68507a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static boolean m68508a(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            return objArr2 == null;
        }
        if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (!m68507a(objArr[i], objArr2[i])) {
                return false;
            }
        }
        return true;
    }
}
