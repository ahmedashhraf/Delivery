package p076c.p112d.p148d.p280h;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: c.d.d.h.a */
/* compiled from: AbstractInvocationHandler */
public abstract class C6663a implements InvocationHandler {

    /* renamed from: a */
    private static final Object[] f18638a = new Object[0];

    /* renamed from: a */
    private static boolean m31815a(Object obj, Class<?> cls) {
        return cls.isInstance(obj) || (Proxy.isProxyClass(obj.getClass()) && Arrays.equals(obj.getClass().getInterfaces(), cls.getInterfaces()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo26725a(Object obj, Method method, Object[] objArr) throws Throwable;

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final Object invoke(Object obj, Method method, @C5952h Object[] objArr) throws Throwable {
        if (objArr == null) {
            objArr = f18638a;
        }
        if (objArr.length == 0 && method.getName().equals("hashCode")) {
            return Integer.valueOf(hashCode());
        }
        boolean z = true;
        if (objArr.length == 1 && method.getName().equals("equals") && method.getParameterTypes()[0] == Object.class) {
            Object obj2 = objArr[0];
            if (obj2 == null) {
                return Boolean.valueOf(false);
            }
            if (obj == obj2) {
                return Boolean.valueOf(true);
            }
            if (!m31815a(obj2, obj.getClass()) || !equals(Proxy.getInvocationHandler(obj2))) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (objArr.length != 0 || !method.getName().equals("toString")) {
            return mo26725a(obj, method, objArr);
        } else {
            return toString();
        }
    }

    public String toString() {
        return super.toString();
    }
}
