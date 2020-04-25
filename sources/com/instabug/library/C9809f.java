package com.instabug.library;

import java.lang.reflect.Method;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.f */
/* compiled from: ReflectionUtils */
public class C9809f {

    /* renamed from: a */
    private static final String f26005a = C9809f.class.getSimpleName();

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26006b;

    static {
        boolean[] a = m45761a();
        a[38] = true;
    }

    public C9809f() {
        m45761a()[0] = true;
    }

    /* renamed from: a */
    public static Method m45759a(Class cls, String str) {
        boolean[] a = m45761a();
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        a[9] = true;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            a[10] = true;
            if (method.getName().equals(str)) {
                a[11] = true;
                method.setAccessible(true);
                a[12] = true;
                return method;
            }
            i++;
            a[13] = true;
        }
        a[14] = true;
        return null;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45761a() {
        boolean[] zArr = f26006b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7477969239385130611L, "com/instabug/library/ReflectionUtils", 39);
        f26006b = a;
        return a;
    }

    /* renamed from: a */
    public static Method m45760a(Class cls, String str, Class... clsArr) {
        boolean[] a = m45761a();
        Method[] methods = cls.getMethods();
        int length = methods.length;
        a[15] = true;
        int i = 0;
        while (i < length) {
            Method method = methods[i];
            a[16] = true;
            if (!method.getName().equals(str)) {
                a[17] = true;
            } else if (method.getParameterTypes().length != clsArr.length) {
                a[18] = true;
            } else {
                a[19] = true;
                a[20] = true;
                int i2 = 0;
                while (true) {
                    if (i2 >= method.getParameterTypes().length) {
                        a[21] = true;
                        break;
                    }
                    a[22] = true;
                    if (method.getParameterTypes()[i2] != clsArr[i2]) {
                        a[23] = true;
                        break;
                    }
                    a[24] = true;
                    if (i2 == method.getParameterTypes().length - 1) {
                        a[25] = true;
                        method.setAccessible(true);
                        a[26] = true;
                        return method;
                    }
                    i2++;
                    a[27] = true;
                }
            }
            i++;
            a[28] = true;
        }
        a[29] = true;
        return null;
    }
}
