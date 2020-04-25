package p076c.p112d.p148d.p280h;

import com.google.common.base.C7397x;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: c.d.d.h.h */
/* compiled from: Reflection */
public final class C6682h {
    private C6682h() {
    }

    /* renamed from: a */
    public static String m31921a(Class<?> cls) {
        return m31922a(cls.getName());
    }

    /* renamed from: a */
    public static String m31922a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "";
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: a */
    public static void m31923a(Class<?>... clsArr) {
        int length = clsArr.length;
        int i = 0;
        while (i < length) {
            Class<?> cls = clsArr[i];
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                i++;
            } catch (ClassNotFoundException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: a */
    public static <T> T m31920a(Class<T> cls, InvocationHandler invocationHandler) {
        C7397x.m35664a(invocationHandler);
        C7397x.m35672a(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
