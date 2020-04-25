package p205i.p489f;

import java.util.Map;
import org.slf4j.impl.StaticMDCBinder;
import p205i.p489f.p490h.C14079i;
import p205i.p489f.p490h.C14082l;
import p205i.p489f.p491i.C14085c;

/* renamed from: i.f.e */
/* compiled from: MDC */
public class C14068e {

    /* renamed from: a */
    static final String f41340a = "http://www.slf4j.org/codes.html#null_MDCA";

    /* renamed from: b */
    static final String f41341b = "http://www.slf4j.org/codes.html#no_static_mdc_binder";

    /* renamed from: c */
    static C14085c f41342c;

    static {
        try {
            f41342c = StaticMDCBinder.SINGLETON.getMDCA();
        } catch (NoClassDefFoundError e) {
            f41342c = new C14079i();
            String message = e.getMessage();
            if (message == null || message.indexOf("StaticMDCBinder") == -1) {
                throw e;
            }
            C14082l.m60859a("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            C14082l.m60859a("Defaulting to no-operation MDCAdapter implementation.");
            C14082l.m60859a("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        } catch (Exception e2) {
            C14082l.m60860a("MDC binding unsuccessful.", e2);
        }
    }

    private C14068e() {
    }

    /* renamed from: a */
    public static void m60743a(String str, String str2) throws IllegalArgumentException {
        if (str != null) {
            C14085c cVar = f41342c;
            if (cVar != null) {
                cVar.mo44496a(str, str2);
                return;
            }
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        throw new IllegalArgumentException("key parameter cannot be null");
    }

    /* renamed from: b */
    public static void m60746b(String str) throws IllegalArgumentException {
        if (str != null) {
            C14085c cVar = f41342c;
            if (cVar != null) {
                cVar.remove(str);
                return;
            }
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        throw new IllegalArgumentException("key parameter cannot be null");
    }

    /* renamed from: c */
    public static C14085c m60747c() {
        return f41342c;
    }

    /* renamed from: a */
    public static String m60741a(String str) throws IllegalArgumentException {
        if (str != null) {
            C14085c cVar = f41342c;
            if (cVar != null) {
                return cVar.mo44498b(str);
            }
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        throw new IllegalArgumentException("key parameter cannot be null");
    }

    /* renamed from: b */
    public static Map m60745b() {
        C14085c cVar = f41342c;
        if (cVar != null) {
            return cVar.mo44495a();
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    /* renamed from: a */
    public static void m60742a() {
        C14085c cVar = f41342c;
        if (cVar != null) {
            cVar.clear();
            return;
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    /* renamed from: a */
    public static void m60744a(Map map) {
        C14085c cVar = f41342c;
        if (cVar != null) {
            cVar.mo44497a(map);
            return;
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }
}
