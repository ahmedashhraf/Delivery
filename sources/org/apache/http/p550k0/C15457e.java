package org.apache.http.p550k0;

import java.lang.reflect.Method;

/* renamed from: org.apache.http.k0.e */
/* compiled from: ExceptionUtils */
public final class C15457e {

    /* renamed from: a */
    private static final Method f44619a = m68502a();

    /* renamed from: b */
    static /* synthetic */ Class f44620b;

    private C15457e() {
    }

    /* renamed from: a */
    static /* synthetic */ Class m68501a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* renamed from: a */
    private static Method m68502a() {
        Class cls;
        Class cls2;
        try {
            Class[] clsArr = new Class[1];
            String str = "java.lang.Throwable";
            if (f44620b == null) {
                cls = m68501a(str);
                f44620b = cls;
            } else {
                cls = f44620b;
            }
            clsArr[0] = cls;
            if (f44620b == null) {
                cls2 = m68501a(str);
                f44620b = cls2;
            } else {
                cls2 = f44620b;
            }
            return cls2.getMethod("initCause", clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m68503a(Throwable th, Throwable th2) {
        Method method = f44619a;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (Exception unused) {
            }
        }
    }
}
