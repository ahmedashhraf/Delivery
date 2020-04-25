package org.apache.commons.logging.p527j;

import java.io.Serializable;
import org.apache.commons.logging.C15089a;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

/* renamed from: org.apache.commons.logging.j.d */
/* compiled from: Log4JLogger */
public class C15101d implements C15089a, Serializable {

    /* renamed from: N */
    private static final String f43904N;

    /* renamed from: O */
    private static Priority f43905O;

    /* renamed from: P */
    static /* synthetic */ Class f43906P;

    /* renamed from: Q */
    static /* synthetic */ Class f43907Q;

    /* renamed from: R */
    static /* synthetic */ Class f43908R;

    /* renamed from: a */
    private transient Logger f43909a = null;

    /* renamed from: b */
    private String f43910b = null;

    static {
        Class cls;
        Class cls2 = f43906P;
        if (cls2 == null) {
            cls2 = m67031b("org.apache.commons.logging.impl.Log4JLogger");
            f43906P = cls2;
        }
        f43904N = cls2.getName();
        Class cls3 = f43908R;
        if (cls3 == null) {
            cls3 = m67031b("org.apache.log4j.Priority");
            f43908R = cls3;
        }
        Class cls4 = f43907Q;
        String str = "org.apache.log4j.Level";
        if (cls4 == null) {
            cls4 = m67031b(str);
            f43907Q = cls4;
        }
        if (cls3.isAssignableFrom(cls4)) {
            try {
                if (f43907Q == null) {
                    cls = m67031b(str);
                    f43907Q = cls;
                } else {
                    cls = f43907Q;
                }
                f43905O = (Priority) cls.getDeclaredField("TRACE").get(null);
            } catch (Exception unused) {
                f43905O = Priority.DEBUG;
            }
        } else {
            throw new InstantiationError("Log4J 1.2 not available");
        }
    }

    public C15101d() {
    }

    /* renamed from: b */
    static /* synthetic */ Class m67031b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo46776a(Object obj) {
        mo46810i().log(f43904N, Priority.DEBUG, obj, null);
    }

    /* renamed from: c */
    public void mo46782c(Object obj, Throwable th) {
        mo46810i().log(f43904N, Priority.WARN, obj, th);
    }

    /* renamed from: d */
    public void mo46783d(Object obj) {
        mo46810i().log(f43904N, Priority.WARN, obj, null);
    }

    /* renamed from: e */
    public void mo46786e(Object obj) {
        mo46810i().log(f43904N, Priority.ERROR, obj, null);
    }

    /* renamed from: f */
    public void mo46789f(Object obj) {
        mo46810i().log(f43904N, f43905O, obj, null);
    }

    /* renamed from: g */
    public boolean mo46792g() {
        return mo46810i().isEnabledFor(f43905O);
    }

    /* renamed from: h */
    public boolean mo46793h() {
        return mo46810i().isEnabledFor(Priority.FATAL);
    }

    /* renamed from: i */
    public Logger mo46810i() {
        if (this.f43909a == null) {
            this.f43909a = Logger.getLogger(this.f43910b);
        }
        return this.f43909a;
    }

    /* renamed from: a */
    public void mo46777a(Object obj, Throwable th) {
        mo46810i().log(f43904N, Priority.DEBUG, obj, th);
    }

    /* renamed from: b */
    public void mo46780b(Object obj, Throwable th) {
        mo46810i().log(f43904N, f43905O, obj, th);
    }

    /* renamed from: c */
    public void mo46781c(Object obj) {
        mo46810i().log(f43904N, Priority.FATAL, obj, null);
    }

    /* renamed from: d */
    public void mo46784d(Object obj, Throwable th) {
        mo46810i().log(f43904N, Priority.ERROR, obj, th);
    }

    /* renamed from: e */
    public void mo46787e(Object obj, Throwable th) {
        mo46810i().log(f43904N, Priority.FATAL, obj, th);
    }

    /* renamed from: f */
    public void mo46790f(Object obj, Throwable th) {
        mo46810i().log(f43904N, Priority.INFO, obj, th);
    }

    /* renamed from: a */
    public boolean mo46778a() {
        return mo46810i().isEnabledFor(Priority.WARN);
    }

    /* renamed from: b */
    public void mo46779b(Object obj) {
        mo46810i().log(f43904N, Priority.INFO, obj, null);
    }

    /* renamed from: d */
    public boolean mo46785d() {
        return mo46810i().isDebugEnabled();
    }

    /* renamed from: e */
    public boolean mo46788e() {
        return mo46810i().isEnabledFor(Priority.ERROR);
    }

    /* renamed from: f */
    public boolean mo46791f() {
        return mo46810i().isInfoEnabled();
    }

    public C15101d(String str) {
        this.f43910b = str;
        this.f43909a = mo46810i();
    }

    public C15101d(Logger logger) {
        if (logger != null) {
            this.f43910b = logger.getName();
            this.f43909a = logger;
            return;
        }
        throw new IllegalArgumentException("Warning - null logger in constructor; possible log4j misconfiguration.");
    }
}
