package org.apache.commons.logging.p527j;

import java.io.Serializable;
import org.apache.commons.logging.C15089a;
import org.apache.log.Hierarchy;
import org.apache.log.Logger;

/* renamed from: org.apache.commons.logging.j.i */
/* compiled from: LogKitLogger */
public class C15106i implements C15089a, Serializable {

    /* renamed from: a */
    protected transient Logger f43943a = null;

    /* renamed from: b */
    protected String f43944b = null;

    public C15106i(String str) {
        this.f43944b = str;
        this.f43943a = mo46821i();
    }

    /* renamed from: a */
    public void mo46776a(Object obj) {
        if (obj != null) {
            mo46821i().debug(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public void mo46780b(Object obj, Throwable th) {
        mo46777a(obj, th);
    }

    /* renamed from: c */
    public void mo46782c(Object obj, Throwable th) {
        if (obj != null) {
            mo46821i().warn(String.valueOf(obj), th);
        }
    }

    /* renamed from: d */
    public void mo46783d(Object obj) {
        if (obj != null) {
            mo46821i().warn(String.valueOf(obj));
        }
    }

    /* renamed from: e */
    public void mo46786e(Object obj) {
        if (obj != null) {
            mo46821i().error(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public void mo46789f(Object obj) {
        mo46776a(obj);
    }

    /* renamed from: g */
    public boolean mo46792g() {
        return mo46821i().isDebugEnabled();
    }

    /* renamed from: h */
    public boolean mo46793h() {
        return mo46821i().isFatalErrorEnabled();
    }

    /* renamed from: i */
    public Logger mo46821i() {
        if (this.f43943a == null) {
            this.f43943a = Hierarchy.getDefaultHierarchy().getLoggerFor(this.f43944b);
        }
        return this.f43943a;
    }

    /* renamed from: a */
    public void mo46777a(Object obj, Throwable th) {
        if (obj != null) {
            mo46821i().debug(String.valueOf(obj), th);
        }
    }

    /* renamed from: b */
    public void mo46779b(Object obj) {
        if (obj != null) {
            mo46821i().info(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public void mo46781c(Object obj) {
        if (obj != null) {
            mo46821i().fatalError(String.valueOf(obj));
        }
    }

    /* renamed from: d */
    public void mo46784d(Object obj, Throwable th) {
        if (obj != null) {
            mo46821i().error(String.valueOf(obj), th);
        }
    }

    /* renamed from: e */
    public void mo46787e(Object obj, Throwable th) {
        if (obj != null) {
            mo46821i().fatalError(String.valueOf(obj), th);
        }
    }

    /* renamed from: f */
    public void mo46790f(Object obj, Throwable th) {
        if (obj != null) {
            mo46821i().info(String.valueOf(obj), th);
        }
    }

    /* renamed from: a */
    public boolean mo46778a() {
        return mo46821i().isWarnEnabled();
    }

    /* renamed from: d */
    public boolean mo46785d() {
        return mo46821i().isDebugEnabled();
    }

    /* renamed from: e */
    public boolean mo46788e() {
        return mo46821i().isErrorEnabled();
    }

    /* renamed from: f */
    public boolean mo46791f() {
        return mo46821i().isInfoEnabled();
    }
}
