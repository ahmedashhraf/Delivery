package org.apache.commons.logging.p527j;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.logging.C15089a;

/* renamed from: org.apache.commons.logging.j.c */
/* compiled from: Jdk14Logger */
public class C15100c implements C15089a, Serializable {

    /* renamed from: N */
    protected static final Level f43901N = Level.FINE;

    /* renamed from: a */
    protected transient Logger f43902a = null;

    /* renamed from: b */
    protected String f43903b = null;

    public C15100c(String str) {
        this.f43903b = str;
        this.f43902a = mo46809i();
    }

    /* renamed from: a */
    private void m67011a(Level level, String str, Throwable th) {
        String str2;
        Logger i = mo46809i();
        if (i.isLoggable(level)) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String str3 = "unknown";
            if (stackTrace == null || stackTrace.length <= 2) {
                str2 = str3;
            } else {
                StackTraceElement stackTraceElement = stackTrace[2];
                str3 = stackTraceElement.getClassName();
                str2 = stackTraceElement.getMethodName();
            }
            if (th == null) {
                i.logp(level, str3, str2, str);
            } else {
                i.logp(level, str3, str2, str, th);
            }
        }
    }

    /* renamed from: b */
    public void mo46779b(Object obj) {
        m67011a(Level.INFO, String.valueOf(obj), null);
    }

    /* renamed from: c */
    public void mo46781c(Object obj) {
        m67011a(Level.SEVERE, String.valueOf(obj), null);
    }

    /* renamed from: d */
    public void mo46784d(Object obj, Throwable th) {
        m67011a(Level.SEVERE, String.valueOf(obj), th);
    }

    /* renamed from: e */
    public void mo46786e(Object obj) {
        m67011a(Level.SEVERE, String.valueOf(obj), null);
    }

    /* renamed from: f */
    public void mo46790f(Object obj, Throwable th) {
        m67011a(Level.INFO, String.valueOf(obj), th);
    }

    /* renamed from: g */
    public boolean mo46792g() {
        return mo46809i().isLoggable(Level.FINEST);
    }

    /* renamed from: h */
    public boolean mo46793h() {
        return mo46809i().isLoggable(Level.SEVERE);
    }

    /* renamed from: i */
    public Logger mo46809i() {
        if (this.f43902a == null) {
            this.f43902a = Logger.getLogger(this.f43903b);
        }
        return this.f43902a;
    }

    /* renamed from: b */
    public void mo46780b(Object obj, Throwable th) {
        m67011a(Level.FINEST, String.valueOf(obj), th);
    }

    /* renamed from: c */
    public void mo46782c(Object obj, Throwable th) {
        m67011a(Level.WARNING, String.valueOf(obj), th);
    }

    /* renamed from: d */
    public boolean mo46785d() {
        return mo46809i().isLoggable(Level.FINE);
    }

    /* renamed from: e */
    public void mo46787e(Object obj, Throwable th) {
        m67011a(Level.SEVERE, String.valueOf(obj), th);
    }

    /* renamed from: f */
    public boolean mo46791f() {
        return mo46809i().isLoggable(Level.INFO);
    }

    /* renamed from: d */
    public void mo46783d(Object obj) {
        m67011a(Level.WARNING, String.valueOf(obj), null);
    }

    /* renamed from: e */
    public boolean mo46788e() {
        return mo46809i().isLoggable(Level.SEVERE);
    }

    /* renamed from: f */
    public void mo46789f(Object obj) {
        m67011a(Level.FINEST, String.valueOf(obj), null);
    }

    /* renamed from: a */
    public void mo46776a(Object obj) {
        m67011a(Level.FINE, String.valueOf(obj), null);
    }

    /* renamed from: a */
    public void mo46777a(Object obj, Throwable th) {
        m67011a(Level.FINE, String.valueOf(obj), th);
    }

    /* renamed from: a */
    public boolean mo46778a() {
        return mo46809i().isLoggable(Level.WARNING);
    }
}
