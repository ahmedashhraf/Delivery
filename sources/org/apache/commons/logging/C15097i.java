package org.apache.commons.logging;

import java.lang.reflect.Constructor;
import java.util.Hashtable;
import org.apache.commons.logging.p527j.C15107j;

/* renamed from: org.apache.commons.logging.i */
/* compiled from: LogSource */
public class C15097i {

    /* renamed from: a */
    protected static Hashtable f43889a = new Hashtable();

    /* renamed from: b */
    protected static boolean f43890b;

    /* renamed from: c */
    protected static boolean f43891c;

    /* renamed from: d */
    protected static Constructor f43892d = null;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:40|41|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        m66969c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0050 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x006c */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040 A[Catch:{ all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A[SYNTHETIC, Splitter:B:28:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0054 A[SYNTHETIC, Splitter:B:32:0x0054] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0050=Splitter:B:30:0x0050, B:32:0x0054=Splitter:B:32:0x0054} */
    static {
        /*
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            f43889a = r0
            r0 = 0
            f43890b = r0
            f43891c = r0
            r1 = 0
            f43892d = r1
            java.lang.String r2 = "org.apache.log4j.Logger"
            r3 = 1
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x001b
            f43890b = r3     // Catch:{ all -> 0x001e }
            goto L_0x0020
        L_0x001b:
            f43890b = r0     // Catch:{ all -> 0x001e }
            goto L_0x0020
        L_0x001e:
            f43890b = r0
        L_0x0020:
            java.lang.String r2 = "java.util.logging.Logger"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0033
            java.lang.String r2 = "org.apache.commons.logging.j.c"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0033
            f43891c = r3     // Catch:{ all -> 0x0036 }
            goto L_0x0038
        L_0x0033:
            f43891c = r0     // Catch:{ all -> 0x0036 }
            goto L_0x0038
        L_0x0036:
            f43891c = r0
        L_0x0038:
            java.lang.String r0 = "org.apache.commons.logging.log"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0048
            java.lang.String r0 = "org.apache.commons.logging.Log"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x0048
        L_0x0047:
        L_0x0048:
            java.lang.String r0 = "org.apache.commons.logging.impl.NoOpLog"
            if (r1 == 0) goto L_0x0054
            m66969c(r1)     // Catch:{ all -> 0x0050 }
            goto L_0x006f
        L_0x0050:
            m66969c(r0)     // Catch:{ all -> 0x006f }
            goto L_0x006f
        L_0x0054:
            boolean r1 = f43890b     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "org.apache.commons.logging.impl.Log4JLogger"
            m66969c(r1)     // Catch:{ all -> 0x006c }
            goto L_0x006f
        L_0x005e:
            boolean r1 = f43891c     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = "org.apache.commons.logging.impl.Jdk14Logger"
            m66969c(r1)     // Catch:{ all -> 0x006c }
            goto L_0x006f
        L_0x0068:
            m66969c(r0)     // Catch:{ all -> 0x006c }
            goto L_0x006f
        L_0x006c:
            m66969c(r0)     // Catch:{ all -> 0x006f }
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.C15097i.<clinit>():void");
    }

    private C15097i() {
    }

    /* renamed from: a */
    public static C15089a m66965a(String str) {
        C15089a aVar = (C15089a) f43889a.get(str);
        if (aVar != null) {
            return aVar;
        }
        C15089a b = m66967b(str);
        f43889a.put(str, b);
        return b;
    }

    /* renamed from: b */
    public static void m66968b(Class cls) throws LinkageError, ExceptionInInitializerError, NoSuchMethodException, SecurityException {
        f43892d = cls.getConstructor(new Class[]{"".getClass()});
    }

    /* renamed from: c */
    public static void m66969c(String str) throws LinkageError, ExceptionInInitializerError, NoSuchMethodException, SecurityException, ClassNotFoundException {
        try {
            f43892d = Class.forName(str).getConstructor(new Class[]{"".getClass()});
        } catch (Throwable unused) {
            f43892d = null;
        }
    }

    /* renamed from: b */
    public static C15089a m66967b(String str) {
        C15089a aVar;
        try {
            aVar = (C15089a) f43892d.newInstance(new Object[]{str});
        } catch (Throwable unused) {
            aVar = null;
        }
        return aVar == null ? new C15107j(str) : aVar;
    }

    /* renamed from: a */
    public static C15089a m66964a(Class cls) {
        return m66965a(cls.getName());
    }

    /* renamed from: a */
    public static String[] m66966a() {
        return (String[]) f43889a.keySet().toArray(new String[f43889a.size()]);
    }
}
