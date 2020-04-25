package org.apache.http.client.p533n;

import java.lang.reflect.InvocationTargetException;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.client.n.a */
/* compiled from: CloneUtils */
public class C15170a {
    private C15170a() {
    }

    /* renamed from: a */
    public static Object m67276a(Object obj) throws CloneNotSupportedException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Cloneable) {
            try {
                try {
                    return obj.getClass().getMethod("clone", null).invoke(obj, null);
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof CloneNotSupportedException) {
                        throw ((CloneNotSupportedException) cause);
                    }
                    throw new Error("Unexpected exception", cause);
                } catch (IllegalAccessException e2) {
                    throw new IllegalAccessError(e2.getMessage());
                }
            } catch (NoSuchMethodException e3) {
                throw new NoSuchMethodError(e3.getMessage());
            }
        } else {
            throw new CloneNotSupportedException();
        }
    }
}
