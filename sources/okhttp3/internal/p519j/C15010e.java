package okhttp3.internal.p519j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: okhttp3.internal.j.e */
/* compiled from: OptionalMethod */
class C15010e<T> {

    /* renamed from: a */
    private final Class<?> f43634a;

    /* renamed from: b */
    private final String f43635b;

    /* renamed from: c */
    private final Class[] f43636c;

    C15010e(Class<?> cls, String str, Class... clsArr) {
        this.f43634a = cls;
        this.f43635b = str;
        this.f43636c = clsArr;
    }

    /* renamed from: a */
    public boolean mo46636a(T t) {
        return m66560a(t.getClass()) != null;
    }

    /* renamed from: b */
    public Object mo46637b(T t, Object... objArr) throws InvocationTargetException {
        Method a = m66560a(t.getClass());
        if (a == null) {
            return null;
        }
        try {
            return a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public Object mo46638c(T t, Object... objArr) {
        try {
            return mo46637b(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: d */
    public Object mo46639d(T t, Object... objArr) {
        try {
            return mo46635a(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: a */
    public Object mo46635a(T t, Object... objArr) throws InvocationTargetException {
        Method a = m66560a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpectedly could not call: ");
                sb.append(a);
                AssertionError assertionError = new AssertionError(sb.toString());
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Method ");
            sb2.append(this.f43635b);
            sb2.append(" not supported for object ");
            sb2.append(t);
            throw new AssertionError(sb2.toString());
        }
    }

    /* renamed from: a */
    private Method m66560a(Class<?> cls) {
        String str = this.f43635b;
        if (str == null) {
            return null;
        }
        Method a = m66561a(cls, str, this.f43636c);
        if (a != null) {
            Class<?> cls2 = this.f43634a;
            if (cls2 != null && !cls2.isAssignableFrom(a.getReturnType())) {
                return null;
            }
        }
        return a;
    }

    /* renamed from: a */
    private static Method m66561a(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) != 0) {
                    return method;
                }
            } catch (NoSuchMethodException unused) {
                return method;
            }
        } catch (NoSuchMethodException unused2) {
        }
        return null;
    }
}
