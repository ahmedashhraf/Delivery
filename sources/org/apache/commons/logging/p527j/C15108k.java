package org.apache.commons.logging.p527j;

import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.commons.logging.C15096h;

/* renamed from: org.apache.commons.logging.j.k */
/* compiled from: ServletContextCleaner */
public class C15108k implements ServletContextListener {

    /* renamed from: b */
    static /* synthetic */ Class f43945b;

    /* renamed from: a */
    private Class[] f43946a;

    public C15108k() {
        Class[] clsArr = new Class[1];
        Class cls = f43945b;
        if (cls == null) {
            cls = m67123a("java.lang.ClassLoader");
            f43945b = cls;
        }
        clsArr[0] = cls;
        this.f43946a = clsArr;
    }

    /* renamed from: a */
    static /* synthetic */ Class m67123a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* renamed from: b */
    public void mo46823b(ServletContextEvent servletContextEvent) {
    }

    /* renamed from: a */
    public void mo46822a(ServletContextEvent servletContextEvent) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        Object[] objArr = {contextClassLoader};
        ClassLoader classLoader = contextClassLoader;
        while (classLoader != null) {
            try {
                Class loadClass = classLoader.loadClass(C15096h.f43875c);
                loadClass.getMethod("release", this.f43946a).invoke(null, objArr);
                classLoader = loadClass.getClassLoader().getParent();
            } catch (ClassNotFoundException unused) {
                classLoader = null;
            } catch (NoSuchMethodException unused2) {
                System.err.println("LogFactory instance found which does not support release method!");
                classLoader = null;
            } catch (IllegalAccessException unused3) {
                System.err.println("LogFactory instance found which is not accessable!");
                classLoader = null;
            } catch (InvocationTargetException unused4) {
                System.err.println("LogFactory instance release method failed!");
                classLoader = null;
            }
        }
        C15096h.m66936b(contextClassLoader);
    }
}
