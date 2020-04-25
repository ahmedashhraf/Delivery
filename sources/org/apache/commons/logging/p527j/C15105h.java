package org.apache.commons.logging.p527j;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.commons.logging.LogConfigurationException;

/* renamed from: org.apache.commons.logging.j.h */
/* compiled from: LogFactoryImpl */
public class C15105h extends C15096h {

    /* renamed from: C */
    private static final String f43915C = "org.apache.commons.logging.impl.Log4JLogger";

    /* renamed from: D */
    private static final String f43916D = "org.apache.commons.logging.impl.Jdk14Logger";

    /* renamed from: E */
    private static final String f43917E = "org.apache.commons.logging.impl.Jdk13LumberjackLogger";

    /* renamed from: F */
    private static final String f43918F = "org.apache.commons.logging.impl.SimpleLog";

    /* renamed from: G */
    private static final String f43919G = "org.apache.commons.logging.impl.";

    /* renamed from: H */
    private static final int f43920H = 32;

    /* renamed from: I */
    public static final String f43921I = "org.apache.commons.logging.Log";

    /* renamed from: J */
    protected static final String f43922J = "org.apache.commons.logging.log";

    /* renamed from: K */
    public static final String f43923K = "org.apache.commons.logging.Log.allowFlawedContext";

    /* renamed from: L */
    public static final String f43924L = "org.apache.commons.logging.Log.allowFlawedDiscovery";

    /* renamed from: M */
    public static final String f43925M = "org.apache.commons.logging.Log.allowFlawedHierarchy";

    /* renamed from: N */
    private static final String[] f43926N = {f43915C, f43916D, f43917E, f43918F};

    /* renamed from: O */
    static /* synthetic */ Class f43927O;

    /* renamed from: P */
    static /* synthetic */ Class f43928P;

    /* renamed from: Q */
    static /* synthetic */ Class f43929Q;

    /* renamed from: R */
    static /* synthetic */ Class f43930R;

    /* renamed from: A */
    private boolean f43931A;

    /* renamed from: B */
    private boolean f43932B;

    /* renamed from: q */
    private boolean f43933q = true;

    /* renamed from: r */
    private String f43934r;

    /* renamed from: s */
    protected Hashtable f43935s = new Hashtable();

    /* renamed from: t */
    protected Hashtable f43936t = new Hashtable();

    /* renamed from: u */
    private String f43937u;

    /* renamed from: v */
    protected Constructor f43938v = null;

    /* renamed from: w */
    protected Class[] f43939w;

    /* renamed from: x */
    protected Method f43940x;

    /* renamed from: y */
    protected Class[] f43941y;

    /* renamed from: z */
    private boolean f43942z;

    public C15105h() {
        Class[] clsArr = new Class[1];
        Class cls = f43927O;
        if (cls == null) {
            cls = m67061e("java.lang.String");
            f43927O = cls;
        }
        clsArr[0] = cls;
        this.f43939w = clsArr;
        this.f43940x = null;
        Class[] clsArr2 = new Class[1];
        Class cls2 = f43928P;
        if (cls2 == null) {
            cls2 = m67061e(C15096h.f43875c);
            f43928P = cls2;
        }
        clsArr2[0] = cls2;
        this.f43941y = clsArr2;
        m67071r();
        if (m67063i()) {
            mo46816g("Instance created.");
        }
    }

    /* renamed from: e */
    static /* synthetic */ Class m67061e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* renamed from: i */
    protected static boolean m67063i() {
        return C15096h.m66955i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.apache.commons.logging.C15089a m67064j(java.lang.String r6) throws org.apache.commons.logging.LogConfigurationException {
        /*
            r5 = this;
            boolean r0 = m67063i()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "Discovering a Log implementation..."
            r5.mo46816g(r0)
        L_0x000b:
            r5.m67070q()
            r0 = 0
            java.lang.String r1 = r5.m67067n()
            r2 = 1
            if (r1 == 0) goto L_0x006b
            boolean r0 = m67063i()
            if (r0 == 0) goto L_0x0035
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r3 = "Attempting to load user-specified log class '"
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = "'..."
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r5.mo46816g(r0)
        L_0x0035:
            org.apache.commons.logging.a r6 = r5.m67054a(r1, r6, r2)
            if (r6 != 0) goto L_0x006a
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            java.lang.String r0 = "User-specified log class '"
            r6.<init>(r0)
            r6.append(r1)
            java.lang.String r0 = "' cannot be found or is not useable."
            r6.append(r0)
            if (r1 == 0) goto L_0x0060
            java.lang.String r0 = "org.apache.commons.logging.impl.Log4JLogger"
            r5.m67057a(r6, r1, r0)
            java.lang.String r0 = "org.apache.commons.logging.impl.Jdk14Logger"
            r5.m67057a(r6, r1, r0)
            java.lang.String r0 = "org.apache.commons.logging.impl.Jdk13LumberjackLogger"
            r5.m67057a(r6, r1, r0)
            java.lang.String r0 = "org.apache.commons.logging.impl.SimpleLog"
            r5.m67057a(r6, r1, r0)
        L_0x0060:
            org.apache.commons.logging.LogConfigurationException r0 = new org.apache.commons.logging.LogConfigurationException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L_0x006a:
            return r6
        L_0x006b:
            boolean r1 = m67063i()
            if (r1 == 0) goto L_0x0076
            java.lang.String r1 = "No user-specified Log implementation; performing discovery using the standard supported logging implementations..."
            r5.mo46816g(r1)
        L_0x0076:
            r1 = 0
        L_0x0077:
            java.lang.String[] r3 = f43926N
            int r4 = r3.length
            if (r1 >= r4) goto L_0x0087
            if (r0 != 0) goto L_0x0087
            r0 = r3[r1]
            org.apache.commons.logging.a r0 = r5.m67054a(r0, r6, r2)
            int r1 = r1 + 1
            goto L_0x0077
        L_0x0087:
            if (r0 == 0) goto L_0x008a
            return r0
        L_0x008a:
            org.apache.commons.logging.LogConfigurationException r6 = new org.apache.commons.logging.LogConfigurationException
            java.lang.String r0 = "No suitable Log implementation"
            r6.<init>(r0)
            goto L_0x0093
        L_0x0092:
            throw r6
        L_0x0093:
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.p527j.C15105h.m67064j(java.lang.String):org.apache.commons.logging.a");
    }

    /* renamed from: n */
    private String m67067n() {
        if (m67063i()) {
            mo46816g("Trying to get log class from attribute 'org.apache.commons.logging.Log'");
        }
        String str = f43921I;
        String str2 = (String) mo46800a(str);
        String str3 = f43922J;
        if (str2 == null) {
            if (m67063i()) {
                mo46816g("Trying to get log class from attribute 'org.apache.commons.logging.log'");
            }
            str2 = (String) mo46800a(str3);
        }
        if (str2 == null) {
            if (m67063i()) {
                mo46816g("Trying to get log class from system property 'org.apache.commons.logging.Log'");
            }
            try {
                str2 = m67053a(str, (String) null);
            } catch (SecurityException e) {
                if (m67063i()) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("No access allowed to system property 'org.apache.commons.logging.Log' - ");
                    stringBuffer.append(e.getMessage());
                    mo46816g(stringBuffer.toString());
                }
            }
        }
        if (str2 == null) {
            if (m67063i()) {
                mo46816g("Trying to get log class from system property 'org.apache.commons.logging.log'");
            }
            try {
                str2 = m67053a(str3, (String) null);
            } catch (SecurityException e2) {
                if (m67063i()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("No access allowed to system property 'org.apache.commons.logging.log' - ");
                    stringBuffer2.append(e2.getMessage());
                    mo46816g(stringBuffer2.toString());
                }
            }
        }
        return str2 != null ? str2.trim() : str2;
    }

    /* renamed from: o */
    private ClassLoader m67068o() throws LogConfigurationException {
        Class cls = f43929Q;
        if (cls == null) {
            cls = m67061e(C15096h.f43876d);
            f43929Q = cls;
        }
        ClassLoader b = m67059b(cls);
        if (!this.f43933q) {
            return b;
        }
        ClassLoader p = m67069p();
        ClassLoader a = m67052a(p, b);
        String str = "Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.";
        if (a != null) {
            if (a != p) {
                if (!this.f43942z) {
                    throw new LogConfigurationException(str);
                } else if (m67063i()) {
                    mo46816g("Warning: the context classloader is an ancestor of the classloader that loaded LogFactoryImpl; it should be the same or a descendant. The application using commons-logging should ensure the context classloader is used correctly.");
                }
            }
            return a;
        } else if (this.f43942z) {
            if (m67063i()) {
                mo46816g("[WARNING] the context classloader is not part of a parent-child relationship with the classloader that loaded LogFactoryImpl.");
            }
            return p;
        } else {
            throw new LogConfigurationException(str);
        }
    }

    /* renamed from: p */
    private static ClassLoader m67069p() throws LogConfigurationException {
        return (ClassLoader) AccessController.doPrivileged(new C15102e());
    }

    /* renamed from: q */
    private void m67070q() {
        this.f43942z = m67058a(f43923K, true);
        this.f43931A = m67058a(f43924L, true);
        this.f43932B = m67058a(f43925M, true);
    }

    /* renamed from: r */
    private void m67071r() {
        String str;
        ClassLoader b = m67059b(C15105h.class);
        if (b == null) {
            str = "BOOTLOADER";
        } else {
            try {
                str = C15096h.m66927a((Object) b);
            } catch (SecurityException unused) {
                str = "UNKNOWN";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactoryImpl@");
        stringBuffer.append(System.identityHashCode(this));
        stringBuffer.append(" from ");
        stringBuffer.append(str);
        stringBuffer.append("] ");
        this.f43934r = stringBuffer.toString();
    }

    /* renamed from: a */
    public Object mo46800a(String str) {
        return this.f43935s.get(str);
    }

    /* renamed from: b */
    public C15089a mo46804b(String str) throws LogConfigurationException {
        C15089a aVar = (C15089a) this.f43936t.get(str);
        if (aVar != null) {
            return aVar;
        }
        C15089a i = mo46818i(str);
        this.f43936t.put(str, i);
        return i;
    }

    /* renamed from: c */
    public void mo46806c(String str) {
        this.f43935s.remove(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Constructor mo46815f() throws LogConfigurationException {
        if (this.f43938v == null) {
            m67064j(C15105h.class.getName());
        }
        return this.f43938v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo46816g(String str) {
        if (m67063i()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f43934r);
            stringBuffer.append(str);
            C15096h.m66953h(stringBuffer.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo46817h() {
        return m67060b("Jdk13Lumberjack", f43917E);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo46819k() {
        return m67060b("Jdk14", f43916D);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo46820l() {
        return m67060b("Log4J", f43915C);
    }

    /* renamed from: e */
    protected static ClassLoader m67062e() throws LogConfigurationException {
        return C15096h.m66946e();
    }

    /* renamed from: k */
    private String m67065k(String str) {
        if (m67063i()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[ENV] Trying to get configuration for item ");
            stringBuffer.append(str);
            mo46816g(stringBuffer.toString());
        }
        Object a = mo46800a(str);
        String str2 = "] for ";
        if (a != null) {
            if (m67063i()) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Found LogFactory attribute [");
                stringBuffer2.append(a);
                stringBuffer2.append(str2);
                stringBuffer2.append(str);
                mo46816g(stringBuffer2.toString());
            }
            return a.toString();
        }
        if (m67063i()) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("[ENV] No LogFactory attribute found for ");
            stringBuffer3.append(str);
            mo46816g(stringBuffer3.toString());
        }
        try {
            String a2 = m67053a(str, (String) null);
            if (a2 != null) {
                if (m67063i()) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("[ENV] Found system property [");
                    stringBuffer4.append(a2);
                    stringBuffer4.append(str2);
                    stringBuffer4.append(str);
                    mo46816g(stringBuffer4.toString());
                }
                return a2;
            }
            if (m67063i()) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] No system property found for property ");
                stringBuffer5.append(str);
                mo46816g(stringBuffer5.toString());
            }
            if (m67063i()) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("[ENV] No configuration defined for item ");
                stringBuffer6.append(str);
                mo46816g(stringBuffer6.toString());
            }
            return null;
        } catch (SecurityException unused) {
            if (m67063i()) {
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append("[ENV] Security prevented reading system property ");
                stringBuffer7.append(str);
                mo46816g(stringBuffer7.toString());
            }
        }
    }

    /* renamed from: a */
    public String[] mo46803a() {
        Vector vector = new Vector();
        Enumeration keys = this.f43935s.keys();
        while (keys.hasMoreElements()) {
            vector.addElement((String) keys.nextElement());
        }
        String[] strArr = new String[vector.size()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo46814c() {
        if (this.f43937u == null) {
            m67064j(C15105h.class.getName());
        }
        return this.f43937u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C15089a mo46818i(String str) throws LogConfigurationException {
        C15089a aVar;
        try {
            if (this.f43938v == null) {
                aVar = m67064j(str);
            } else {
                aVar = (C15089a) this.f43938v.newInstance(new Object[]{str});
            }
            if (this.f43940x != null) {
                this.f43940x.invoke(aVar, new Object[]{this});
            }
            return aVar;
        } catch (LogConfigurationException e) {
            throw e;
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException != null) {
                throw new LogConfigurationException(targetException);
            }
            throw new LogConfigurationException((Throwable) e2);
        } catch (Throwable th) {
            throw new LogConfigurationException(th);
        }
    }

    /* renamed from: b */
    public void mo46805b() {
        mo46816g("Releasing all known loggers");
        this.f43936t.clear();
    }

    /* renamed from: b */
    protected static ClassLoader m67059b(Class cls) {
        return C15096h.m66935b(cls);
    }

    /* renamed from: b */
    private boolean m67060b(String str, String str2) {
        String str3 = "'.";
        if (m67063i()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Checking for '");
            stringBuffer.append(str);
            stringBuffer.append(str3);
            mo46816g(stringBuffer.toString());
        }
        try {
            if (m67054a(str2, getClass().getName(), false) == null) {
                if (m67063i()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Did not find '");
                    stringBuffer2.append(str);
                    stringBuffer2.append(str3);
                    mo46816g(stringBuffer2.toString());
                }
                return false;
            }
            if (m67063i()) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Found '");
                stringBuffer3.append(str);
                stringBuffer3.append(str3);
                mo46816g(stringBuffer3.toString());
            }
            return true;
        } catch (LogConfigurationException unused) {
            if (m67063i()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Logging system '");
                stringBuffer4.append(str);
                stringBuffer4.append("' is available but not useable.");
                mo46816g(stringBuffer4.toString());
            }
            return false;
        }
    }

    /* renamed from: a */
    public C15089a mo46801a(Class cls) throws LogConfigurationException {
        return mo46804b(cls.getName());
    }

    /* renamed from: a */
    public void mo46802a(String str, Object obj) {
        if (this.f43938v != null) {
            mo46816g("setAttribute: call too late; configuration already performed.");
        }
        if (obj == null) {
            this.f43935s.remove(str);
        } else {
            this.f43935s.put(str, obj);
        }
        if (str.equals(C15096h.f43874b)) {
            this.f43933q = Boolean.valueOf(obj.toString()).booleanValue();
        }
    }

    /* renamed from: a */
    private static String m67053a(String str, String str2) throws SecurityException {
        return (String) AccessController.doPrivileged(new C15103f(str, str2));
    }

    /* renamed from: a */
    private ClassLoader m67051a(ClassLoader classLoader) {
        try {
            return (ClassLoader) AccessController.doPrivileged(new C15104g(this, classLoader));
        } catch (SecurityException unused) {
            mo46816g("[SECURITY] Unable to obtain parent classloader");
            return null;
        }
    }

    /* renamed from: a */
    private boolean m67058a(String str, boolean z) {
        String k = m67065k(str);
        if (k == null) {
            return z;
        }
        return Boolean.valueOf(k).booleanValue();
    }

    /* renamed from: a */
    private void m67057a(StringBuffer stringBuffer, String str, String str2) {
        if (!str.equals(str2)) {
            if (str.regionMatches(true, 0, str2, 0, f43920H + 5)) {
                stringBuffer.append(" Did you mean '");
                stringBuffer.append(str2);
                stringBuffer.append("'?");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x016e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x017c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x017d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01bb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0176 A[LOOP:0: B:4:0x0038->B:45:0x0176, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x017c A[ExcHandler: LogConfigurationException (r0v19 'e' org.apache.commons.logging.LogConfigurationException A[CUSTOM_DECLARE]), Splitter:B:5:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01f7 A[EDGE_INSN: B:63:0x01f7->B:52:0x01f7 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.apache.commons.logging.C15089a m67054a(java.lang.String r17, java.lang.String r18, boolean r19) throws org.apache.commons.logging.LogConfigurationException {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r3 = ".class"
            java.lang.String r4 = ": "
            java.lang.String r5 = "The log adapter '"
            java.lang.String r6 = ""
            boolean r0 = m67063i()
            java.lang.String r7 = "'"
            if (r0 == 0) goto L_0x002b
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r8 = "Attempting to instantiate '"
            r0.append(r8)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r1.mo46816g(r0)
        L_0x002b:
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r0 = 0
            r9[r0] = r18
            java.lang.ClassLoader r0 = r16.m67068o()
            r11 = r0
            r12 = 0
            r13 = 0
        L_0x0038:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r14 = "Trying to load '"
            r0.append(r14)
            r0.append(r2)
            java.lang.String r14 = "' from classloader "
            r0.append(r14)
            java.lang.String r15 = org.apache.commons.logging.C15096h.m66927a(r11)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r1.mo46816g(r0)
            boolean r0 = m67063i()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            if (r0 == 0) goto L_0x00d0
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r15 = 46
            r10 = 47
            java.lang.String r10 = r2.replace(r15, r10)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r10)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r3)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r0.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            if (r11 == 0) goto L_0x007c
            java.net.URL r10 = r11.getResource(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            goto L_0x008f
        L_0x007c:
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r3)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r10 = r10.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.net.URL r10 = java.lang.ClassLoader.getSystemResource(r10)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
        L_0x008f:
            java.lang.String r15 = "Class '"
            if (r10 != 0) goto L_0x00b3
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r15)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r2)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r15 = "' ["
            r10.append(r15)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = "] cannot be found."
            r10.append(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r10.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r1.mo46816g(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            goto L_0x00d0
        L_0x00b3:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r15)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r2)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r15 = "' was found at '"
            r0.append(r15)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r10)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r7)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r0.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r1.mo46816g(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
        L_0x00d0:
            java.lang.Class r0 = java.lang.Class.forName(r2, r8, r11)     // Catch:{ ClassNotFoundException -> 0x00d6 }
        L_0x00d4:
            r10 = r0
            goto L_0x0118
        L_0x00d6:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r6)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r10 = r10.getMessage()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r10)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r0.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r5)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r2)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r15 = "' is not available via classloader "
            r10.append(r15)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r15 = org.apache.commons.logging.C15096h.m66927a(r11)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r15)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r4)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r0.trim()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r10.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r1.mo46816g(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.Class r0 = java.lang.Class.forName(r17)     // Catch:{ ClassNotFoundException -> 0x0139 }
            goto L_0x00d4
        L_0x0118:
            java.lang.Class[] r0 = r1.f43939w     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.reflect.Constructor r12 = r10.getConstructor(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.Object r0 = r12.newInstance(r9)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            boolean r15 = r0 instanceof org.apache.commons.logging.C15089a     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            if (r15 == 0) goto L_0x0135
            org.apache.commons.logging.a r0 = (org.apache.commons.logging.C15089a) r0     // Catch:{ NoClassDefFoundError -> 0x0131, ExceptionInInitializerError -> 0x012e, LogConfigurationException -> 0x017c, all -> 0x012b }
            r13 = r10
            goto L_0x01f8
        L_0x012b:
            r0 = move-exception
            r13 = r10
            goto L_0x016f
        L_0x012e:
            r0 = move-exception
            r13 = r10
            goto L_0x017f
        L_0x0131:
            r0 = move-exception
            r13 = r10
            goto L_0x01bc
        L_0x0135:
            r1.m67055a(r11, r10)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            goto L_0x0172
        L_0x0139:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r6)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r10 = r10.getMessage()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r10)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r0.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r5)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r2)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r15 = "' is not available via the LogFactoryImpl class classloader: "
            r10.append(r15)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r0.trim()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r10.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r1.mo46816g(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            goto L_0x01f7
        L_0x016e:
            r0 = move-exception
        L_0x016f:
            r1.m67056a(r2, r11, r0)
        L_0x0172:
            if (r11 != 0) goto L_0x0176
            goto L_0x01f7
        L_0x0176:
            java.lang.ClassLoader r11 = r1.m67051a(r11)
            goto L_0x0038
        L_0x017c:
            r0 = move-exception
            throw r0
        L_0x017e:
            r0 = move-exception
        L_0x017f:
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r6)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r5)
            r3.append(r2)
            java.lang.String r5 = "' is unable to initialize itself when loaded via classloader "
            r3.append(r5)
            java.lang.String r5 = org.apache.commons.logging.C15096h.m66927a(r11)
            r3.append(r5)
            r3.append(r4)
            java.lang.String r0 = r0.trim()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.mo46816g(r0)
            goto L_0x01f7
        L_0x01bb:
            r0 = move-exception
        L_0x01bc:
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r6)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r5)
            r3.append(r2)
            java.lang.String r5 = "' is missing dependencies when loaded via classloader "
            r3.append(r5)
            java.lang.String r5 = org.apache.commons.logging.C15096h.m66927a(r11)
            r3.append(r5)
            r3.append(r4)
            java.lang.String r0 = r0.trim()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.mo46816g(r0)
        L_0x01f7:
            r0 = 0
        L_0x01f8:
            if (r0 == 0) goto L_0x0274
            if (r19 == 0) goto L_0x0274
            r1.f43937u = r2
            r1.f43938v = r12
            java.lang.String r3 = "setLogFactory"
            java.lang.Class[] r4 = r1.f43941y     // Catch:{ all -> 0x0222 }
            java.lang.reflect.Method r3 = r13.getMethod(r3, r4)     // Catch:{ all -> 0x0222 }
            r1.f43940x = r3     // Catch:{ all -> 0x0222 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ all -> 0x0222 }
            r3.<init>()     // Catch:{ all -> 0x0222 }
            java.lang.String r4 = "Found method setLogFactory(LogFactory) in '"
            r3.append(r4)     // Catch:{ all -> 0x0222 }
            r3.append(r2)     // Catch:{ all -> 0x0222 }
            r3.append(r7)     // Catch:{ all -> 0x0222 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0222 }
            r1.mo46816g(r3)     // Catch:{ all -> 0x0222 }
            goto L_0x024d
        L_0x0222:
            r3 = 0
            r1.f43940x = r3
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r4 = "[INFO] '"
            r3.append(r4)
            r3.append(r2)
            r3.append(r14)
            java.lang.String r4 = org.apache.commons.logging.C15096h.m66927a(r11)
            r3.append(r4)
            java.lang.String r4 = " does not declare optional method "
            r3.append(r4)
            java.lang.String r4 = "setLogFactory(LogFactory)"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.mo46816g(r3)
        L_0x024d:
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r4 = "Log adapter '"
            r3.append(r4)
            r3.append(r2)
            r3.append(r14)
            java.lang.ClassLoader r2 = r13.getClassLoader()
            java.lang.String r2 = org.apache.commons.logging.C15096h.m66927a(r2)
            r3.append(r2)
            java.lang.String r2 = " has been selected for use."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.mo46816g(r2)
        L_0x0274:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.p527j.C15105h.m67054a(java.lang.String, java.lang.String, boolean):org.apache.commons.logging.a");
    }

    /* renamed from: a */
    private ClassLoader m67052a(ClassLoader classLoader, ClassLoader classLoader2) {
        if (classLoader == null) {
            return classLoader2;
        }
        if (classLoader2 == null) {
            return classLoader;
        }
        for (ClassLoader classLoader3 = classLoader; classLoader3 != null; classLoader3 = classLoader3.getParent()) {
            if (classLoader3 == classLoader2) {
                return classLoader;
            }
        }
        for (ClassLoader classLoader4 = classLoader2; classLoader4 != null; classLoader4 = classLoader4.getParent()) {
            if (classLoader4 == classLoader) {
                return classLoader2;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m67056a(String str, ClassLoader classLoader, Throwable th) {
        if (m67063i()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Could not instantiate Log '");
            stringBuffer.append(str);
            stringBuffer.append("' -- ");
            stringBuffer.append(th.getClass().getName());
            String str2 = ": ";
            stringBuffer.append(str2);
            stringBuffer.append(th.getLocalizedMessage());
            mo46816g(stringBuffer.toString());
            if (th instanceof InvocationTargetException) {
                Throwable targetException = ((InvocationTargetException) th).getTargetException();
                if (targetException != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("... InvocationTargetException: ");
                    stringBuffer2.append(targetException.getClass().getName());
                    stringBuffer2.append(str2);
                    stringBuffer2.append(targetException.getLocalizedMessage());
                    mo46816g(stringBuffer2.toString());
                    if (targetException instanceof ExceptionInInitializerError) {
                        Throwable exception = ((ExceptionInInitializerError) targetException).getException();
                        if (exception != null) {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("... ExceptionInInitializerError: ");
                            stringBuffer3.append(exception.getClass().getName());
                            stringBuffer3.append(str2);
                            stringBuffer3.append(exception.getLocalizedMessage());
                            mo46816g(stringBuffer3.toString());
                        }
                    }
                }
            }
        }
        if (!this.f43931A) {
            throw new LogConfigurationException(th);
        }
    }

    /* renamed from: a */
    private void m67055a(ClassLoader classLoader, Class cls) throws LogConfigurationException {
        Class cls2;
        Class cls3 = f43930R;
        String str = f43921I;
        if (cls3 == null) {
            cls3 = m67061e(str);
            f43930R = cls3;
        }
        String name = cls3.getName();
        Class[] interfaces = cls.getInterfaces();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= interfaces.length) {
                break;
            } else if (name.equals(interfaces[i].getName())) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            if (m67063i()) {
                try {
                    if (f43930R == null) {
                        cls2 = m67061e(str);
                        f43930R = cls2;
                    } else {
                        cls2 = f43930R;
                    }
                    ClassLoader b = m67059b(cls2);
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Class '");
                    stringBuffer.append(cls.getName());
                    stringBuffer.append("' was found in classloader ");
                    stringBuffer.append(C15096h.m66927a((Object) classLoader));
                    stringBuffer.append(". It is bound to a Log interface which is not");
                    stringBuffer.append(" the one loaded from classloader ");
                    stringBuffer.append(C15096h.m66927a((Object) b));
                    mo46816g(stringBuffer.toString());
                } catch (Throwable unused) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Error while trying to output diagnostics about bad class '");
                    stringBuffer2.append(cls);
                    stringBuffer2.append("'");
                    mo46816g(stringBuffer2.toString());
                }
            }
            String str2 = "' visible.";
            String str3 = "You have more than one version of '";
            if (!this.f43932B) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Terminating logging for this context ");
                stringBuffer3.append("due to bad log hierarchy. ");
                stringBuffer3.append(str3);
                Class cls4 = f43930R;
                if (cls4 == null) {
                    cls4 = m67061e(str);
                    f43930R = cls4;
                }
                stringBuffer3.append(cls4.getName());
                stringBuffer3.append(str2);
                if (m67063i()) {
                    mo46816g(stringBuffer3.toString());
                }
                throw new LogConfigurationException(stringBuffer3.toString());
            } else if (m67063i()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Warning: bad log hierarchy. ");
                stringBuffer4.append(str3);
                Class cls5 = f43930R;
                if (cls5 == null) {
                    cls5 = m67061e(str);
                    f43930R = cls5;
                }
                stringBuffer4.append(cls5.getName());
                stringBuffer4.append(str2);
                mo46816g(stringBuffer4.toString());
            }
        } else {
            String str4 = "' does not implement the Log interface.";
            if (!this.f43931A) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("Terminating logging for this context. ");
                stringBuffer5.append("Log class '");
                stringBuffer5.append(cls.getName());
                stringBuffer5.append(str4);
                if (m67063i()) {
                    mo46816g(stringBuffer5.toString());
                }
                throw new LogConfigurationException(stringBuffer5.toString());
            } else if (m67063i()) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("[WARNING] Log class '");
                stringBuffer6.append(cls.getName());
                stringBuffer6.append(str4);
                mo46816g(stringBuffer6.toString());
            }
        }
    }
}
