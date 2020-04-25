package org.apache.http.client.p533n;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.client.n.c */
/* compiled from: JdkIdn */
public class C15172c implements C15171b {

    /* renamed from: a */
    private final Method f44054a;

    public C15172c() throws ClassNotFoundException {
        try {
            this.f44054a = Class.forName("java.net.IDN").getMethod("toUnicode", new Class[]{String.class});
        } catch (SecurityException e) {
            throw new IllegalStateException(e.getMessage(), e);
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException(e2.getMessage(), e2);
        }
    }

    /* renamed from: a */
    public String mo46977a(String str) {
        try {
            return (String) this.f44054a.invoke(null, new Object[]{str});
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e.getMessage(), e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            throw new RuntimeException(cause.getMessage(), cause);
        }
    }
}
