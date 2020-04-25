package org.apache.commons.logging.p527j;

import org.apache.avalon.framework.logger.Logger;
import org.apache.commons.logging.C15089a;

/* renamed from: org.apache.commons.logging.j.a */
/* compiled from: AvalonLogger */
public class C15098a implements C15089a {

    /* renamed from: b */
    private static Logger f43893b;

    /* renamed from: a */
    private transient Logger f43894a = null;

    public C15098a(Logger logger) {
        this.f43894a = logger;
    }

    /* renamed from: a */
    public static void m66970a(Logger logger) {
        f43893b = logger;
    }

    /* renamed from: b */
    public Logger mo46807b() {
        return this.f43894a;
    }

    /* renamed from: c */
    public void mo46781c(Object obj) {
        if (mo46807b().isFatalErrorEnabled()) {
            mo46807b().fatalError(String.valueOf(obj));
        }
    }

    /* renamed from: d */
    public void mo46784d(Object obj, Throwable th) {
        if (mo46807b().isErrorEnabled()) {
            mo46807b().error(String.valueOf(obj), th);
        }
    }

    /* renamed from: e */
    public void mo46786e(Object obj) {
        if (mo46807b().isErrorEnabled()) {
            mo46807b().error(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public void mo46790f(Object obj, Throwable th) {
        if (mo46807b().isInfoEnabled()) {
            mo46807b().info(String.valueOf(obj), th);
        }
    }

    /* renamed from: g */
    public boolean mo46792g() {
        return mo46807b().isDebugEnabled();
    }

    /* renamed from: h */
    public boolean mo46793h() {
        return mo46807b().isFatalErrorEnabled();
    }

    /* renamed from: a */
    public void mo46777a(Object obj, Throwable th) {
        if (mo46807b().isDebugEnabled()) {
            mo46807b().debug(String.valueOf(obj), th);
        }
    }

    /* renamed from: b */
    public void mo46779b(Object obj) {
        if (mo46807b().isInfoEnabled()) {
            mo46807b().info(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public void mo46782c(Object obj, Throwable th) {
        if (mo46807b().isWarnEnabled()) {
            mo46807b().warn(String.valueOf(obj), th);
        }
    }

    /* renamed from: d */
    public boolean mo46785d() {
        return mo46807b().isDebugEnabled();
    }

    /* renamed from: e */
    public void mo46787e(Object obj, Throwable th) {
        if (mo46807b().isFatalErrorEnabled()) {
            mo46807b().fatalError(String.valueOf(obj), th);
        }
    }

    /* renamed from: f */
    public boolean mo46791f() {
        return mo46807b().isInfoEnabled();
    }

    /* renamed from: a */
    public void mo46776a(Object obj) {
        if (mo46807b().isDebugEnabled()) {
            mo46807b().debug(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public void mo46780b(Object obj, Throwable th) {
        if (mo46807b().isDebugEnabled()) {
            mo46807b().debug(String.valueOf(obj), th);
        }
    }

    /* renamed from: d */
    public void mo46783d(Object obj) {
        if (mo46807b().isWarnEnabled()) {
            mo46807b().warn(String.valueOf(obj));
        }
    }

    /* renamed from: e */
    public boolean mo46788e() {
        return mo46807b().isErrorEnabled();
    }

    /* renamed from: f */
    public void mo46789f(Object obj) {
        if (mo46807b().isDebugEnabled()) {
            mo46807b().debug(String.valueOf(obj));
        }
    }

    public C15098a(String str) {
        Logger logger = f43893b;
        if (logger != null) {
            this.f43894a = logger.getChildLogger(str);
            return;
        }
        throw new NullPointerException("default logger has to be specified if this constructor is used!");
    }

    /* renamed from: a */
    public boolean mo46778a() {
        return mo46807b().isWarnEnabled();
    }
}
