package p205i.p489f;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.impl.StaticLoggerBinder;
import p205i.p489f.p490h.C14078h;
import p205i.p489f.p490h.C14081k;
import p205i.p489f.p490h.C14082l;

/* renamed from: i.f.d */
/* compiled from: LoggerFactory */
public final class C14067d {

    /* renamed from: a */
    static final String f41322a = "http://www.slf4j.org/codes.html";

    /* renamed from: b */
    static final String f41323b = "http://www.slf4j.org/codes.html#StaticLoggerBinder";

    /* renamed from: c */
    static final String f41324c = "http://www.slf4j.org/codes.html#multiple_bindings";

    /* renamed from: d */
    static final String f41325d = "http://www.slf4j.org/codes.html#null_LF";

    /* renamed from: e */
    static final String f41326e = "http://www.slf4j.org/codes.html#version_mismatch";

    /* renamed from: f */
    static final String f41327f = "http://www.slf4j.org/codes.html#substituteLogger";

    /* renamed from: g */
    static final String f41328g = "http://www.slf4j.org/codes.html#unsuccessfulInit";

    /* renamed from: h */
    static final String f41329h = "org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit";

    /* renamed from: i */
    static final int f41330i = 0;

    /* renamed from: j */
    static final int f41331j = 1;

    /* renamed from: k */
    static final int f41332k = 2;

    /* renamed from: l */
    static final int f41333l = 3;

    /* renamed from: m */
    static final int f41334m = 4;

    /* renamed from: n */
    static int f41335n;

    /* renamed from: o */
    static C14081k f41336o = new C14081k();

    /* renamed from: p */
    static C14078h f41337p = new C14078h();

    /* renamed from: q */
    private static final String[] f41338q = {"1.6", "1.7"};

    /* renamed from: r */
    private static String f41339r = "org/slf4j/impl/StaticLoggerBinder.class";

    private C14067d() {
    }

    /* renamed from: a */
    private static final void m60729a() {
        try {
            Set c = m60735c();
            m60736c(c);
            StaticLoggerBinder.getSingleton();
            f41335n = 3;
            m60733b(c);
            m60732b();
        } catch (NoClassDefFoundError e) {
            if (m60734b(e.getMessage())) {
                f41335n = 4;
                C14082l.m60859a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                C14082l.m60859a("Defaulting to no-operation (NOP) logger implementation");
                C14082l.m60859a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                return;
            }
            m60730a((Throwable) e);
            throw e;
        } catch (NoSuchMethodError e2) {
            String message = e2.getMessage();
            if (!(message == null || message.indexOf("org.slf4j.impl.StaticLoggerBinder.getSingleton()") == -1)) {
                f41335n = 2;
                C14082l.m60859a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                C14082l.m60859a("Your binding is version 1.5.5 or earlier.");
                C14082l.m60859a("Upgrade your binding to version 1.6.x.");
            }
            throw e2;
        } catch (Exception e3) {
            m60730a((Throwable) e3);
            throw new IllegalStateException("Unexpected initialization failure", e3);
        }
    }

    /* renamed from: b */
    private static boolean m60734b(String str) {
        if (str == null) {
            return false;
        }
        return (str.indexOf("org/slf4j/impl/StaticLoggerBinder") == -1 && str.indexOf("org.slf4j.impl.StaticLoggerBinder") == -1) ? false : true;
    }

    /* renamed from: c */
    private static Set m60735c() {
        Enumeration enumeration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C14067d.class.getClassLoader();
            if (classLoader == null) {
                enumeration = ClassLoader.getSystemResources(f41339r);
            } else {
                enumeration = classLoader.getResources(f41339r);
            }
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add((URL) enumeration.nextElement());
            }
        } catch (IOException e) {
            C14082l.m60860a("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* renamed from: d */
    public static C14064a m60737d() {
        if (f41335n == 0) {
            f41335n = 1;
            m60738e();
        }
        int i = f41335n;
        if (i == 1) {
            return f41336o;
        }
        if (i == 2) {
            throw new IllegalStateException(f41329h);
        } else if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        } else {
            if (i == 4) {
                return f41337p;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }

    /* renamed from: e */
    private static final void m60738e() {
        m60729a();
        if (f41335n == 3) {
            m60740g();
        }
    }

    /* renamed from: f */
    static void m60739f() {
        f41335n = 0;
        f41336o = new C14081k();
    }

    /* renamed from: g */
    private static final void m60740g() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String startsWith : f41338q) {
                if (str.startsWith(startsWith)) {
                    z = true;
                }
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append("The requested version ");
                sb.append(str);
                sb.append(" by your slf4j binding is not compatible with ");
                sb.append(Arrays.asList(f41338q).toString());
                C14082l.m60859a(sb.toString());
                C14082l.m60859a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C14082l.m60860a("Unexpected problem occured during version sanity check", th);
        }
    }

    /* renamed from: b */
    private static final void m60732b() {
        List a = f41336o.mo44508a();
        if (a.size() != 0) {
            C14082l.m60859a("The following loggers will not work because they were created");
            C14082l.m60859a("during the default configuration phase of the underlying logging system.");
            C14082l.m60859a("See also http://www.slf4j.org/codes.html#substituteLogger");
            for (int i = 0; i < a.size(); i++) {
                C14082l.m60859a((String) a.get(i));
            }
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Set, code=java.util.Set<java.net.URL>, for r3v0, types: [java.util.Set, java.util.Set<java.net.URL>] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m60736c(java.util.Set<java.net.URL> r3) {
        /*
            boolean r0 = m60731a(r3)
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "Class path contains multiple SLF4J bindings."
            p205i.p489f.p490h.C14082l.m60859a(r0)
            java.util.Iterator r3 = r3.iterator()
        L_0x000f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r3.next()
            java.net.URL r0 = (java.net.URL) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Found binding in ["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p205i.p489f.p490h.C14082l.m60859a(r0)
            goto L_0x000f
        L_0x0035:
            java.lang.String r3 = "See http://www.slf4j.org/codes.html#multiple_bindings for an explanation."
            p205i.p489f.p490h.C14082l.m60859a(r3)
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p489f.C14067d.m60736c(java.util.Set):void");
    }

    /* renamed from: b */
    private static void m60733b(Set set) {
        if (m60731a(set)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Actual binding is of type [");
            sb.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
            sb.append("]");
            C14082l.m60859a(sb.toString());
        }
    }

    /* renamed from: a */
    static void m60730a(Throwable th) {
        f41335n = 2;
        C14082l.m60860a("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: a */
    private static boolean m60731a(Set set) {
        return set.size() > 1;
    }

    /* renamed from: a */
    public static C14066c m60728a(String str) {
        return m60737d().mo44419a(str);
    }

    /* renamed from: a */
    public static C14066c m60727a(Class cls) {
        return m60728a(cls.getName());
    }
}
