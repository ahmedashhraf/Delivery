package org.apache.commons.logging;

import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

/* renamed from: org.apache.commons.logging.h */
/* compiled from: LogFactory */
public abstract class C15096h {

    /* renamed from: a */
    public static final String f43873a = "priority";

    /* renamed from: b */
    public static final String f43874b = "use_tccl";

    /* renamed from: c */
    public static final String f43875c = "org.apache.commons.logging.LogFactory";

    /* renamed from: d */
    public static final String f43876d = "org.apache.commons.logging.impl.LogFactoryImpl";

    /* renamed from: e */
    public static final String f43877e = "commons-logging.properties";

    /* renamed from: f */
    protected static final String f43878f = "META-INF/services/org.apache.commons.logging.LogFactory";

    /* renamed from: g */
    public static final String f43879g = "org.apache.commons.logging.diagnostics.dest";

    /* renamed from: h */
    private static PrintStream f43880h = null;

    /* renamed from: i */
    private static String f43881i = null;

    /* renamed from: j */
    public static final String f43882j = "org.apache.commons.logging.LogFactory.HashtableImpl";

    /* renamed from: k */
    private static final String f43883k = "org.apache.commons.logging.impl.WeakHashtable";

    /* renamed from: l */
    private static ClassLoader f43884l;

    /* renamed from: m */
    protected static Hashtable f43885m = mo46814c();

    /* renamed from: n */
    protected static C15096h f43886n;

    /* renamed from: o */
    static /* synthetic */ Class f43887o;

    /* renamed from: p */
    static /* synthetic */ Class f43888p;

    static {
        Class cls = f43888p;
        String str = f43875c;
        if (cls == null) {
            cls = m66945e(str);
            f43888p = cls;
        }
        f43884l = m66935b(cls);
        mo46817h();
        Class cls2 = f43888p;
        if (cls2 == null) {
            cls2 = m66945e(str);
            f43888p = cls2;
        }
        m66947e(cls2);
        if (m66955i()) {
            mo46816g("BOOTSTRAP COMPLETED");
        }
    }

    protected C15096h() {
    }

    /* renamed from: a */
    private static C15096h m66931a(ClassLoader classLoader) {
        if (classLoader == null) {
            return f43886n;
        }
        return (C15096h) f43885m.get(classLoader);
    }

    /* renamed from: b */
    public static void m66936b(ClassLoader classLoader) {
        if (m66955i()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Releasing factory for classloader ");
            stringBuffer.append(m66927a((Object) classLoader));
            mo46816g(stringBuffer.toString());
        }
        synchronized (f43885m) {
            if (classLoader != null) {
                C15096h hVar = (C15096h) f43885m.get(classLoader);
                if (hVar != null) {
                    hVar.mo46805b();
                    f43885m.remove(classLoader);
                }
            } else if (f43886n != null) {
                f43886n.mo46805b();
                f43886n = null;
            }
        }
    }

    /* renamed from: c */
    private static final Hashtable mo46814c() {
        String str;
        Hashtable hashtable = null;
        try {
            str = m66928a(f43882j, (String) null);
        } catch (SecurityException unused) {
            str = null;
        }
        String str2 = f43883k;
        if (str == null) {
            str = str2;
        }
        try {
            hashtable = (Hashtable) Class.forName(str).newInstance();
        } catch (Throwable unused2) {
            if (!str2.equals(str)) {
                String str3 = "[ERROR] LogFactory: Load of custom hashtable failed";
                if (m66955i()) {
                    mo46816g(str3);
                } else {
                    System.err.println(str3);
                }
            }
        }
        return hashtable == null ? new Hashtable() : hashtable;
    }

    /* renamed from: e */
    protected static ClassLoader m66946e() throws LogConfigurationException {
        return m66942d();
    }

    /* renamed from: f */
    public static C15089a m66949f(String str) throws LogConfigurationException {
        return m66950g().mo46804b(str);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0115 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073 A[Catch:{ SecurityException -> 0x00a8, RuntimeException -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a A[Catch:{ SecurityException -> 0x00a8, RuntimeException -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01fa  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.apache.commons.logging.C15096h m66950g() throws org.apache.commons.logging.LogConfigurationException {
        /*
            java.lang.String r0 = "META-INF/services/org.apache.commons.logging.LogFactory"
            java.lang.String r1 = "]. Trying alternative implementations..."
            java.lang.String r2 = "[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: ["
            java.lang.String r3 = "org.apache.commons.logging.LogFactory"
            java.lang.ClassLoader r4 = mo46815f()
            if (r4 != 0) goto L_0x0019
            boolean r5 = m66955i()
            if (r5 == 0) goto L_0x0019
            java.lang.String r5 = "Context classloader is null."
            mo46816g(r5)
        L_0x0019:
            org.apache.commons.logging.h r5 = m66931a(r4)
            if (r5 == 0) goto L_0x0020
            return r5
        L_0x0020:
            boolean r6 = m66955i()
            if (r6 == 0) goto L_0x0043
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            java.lang.String r7 = "[LOOKUP] LogFactory implementation requested for the first time for context classloader "
            r6.append(r7)
            java.lang.String r7 = m66927a(r4)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            mo46816g(r6)
            java.lang.String r6 = "[LOOKUP] "
            m66937b(r6, r4)
        L_0x0043:
            java.lang.String r6 = "commons-logging.properties"
            java.util.Properties r6 = m66929a(r4, r6)
            if (r6 == 0) goto L_0x0060
            java.lang.String r7 = "use_tccl"
            java.lang.String r7 = r6.getProperty(r7)
            if (r7 == 0) goto L_0x0060
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x0060
            java.lang.ClassLoader r7 = f43884l
            goto L_0x0061
        L_0x0060:
            r7 = r4
        L_0x0061:
            boolean r8 = m66955i()
            if (r8 == 0) goto L_0x006c
            java.lang.String r8 = "[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use..."
            mo46816g(r8)
        L_0x006c:
            r8 = 0
            java.lang.String r8 = m66928a(r3, r8)     // Catch:{ SecurityException -> 0x00a8, RuntimeException -> 0x00a6 }
            if (r8 == 0) goto L_0x009a
            boolean r9 = m66955i()     // Catch:{ SecurityException -> 0x00a8, RuntimeException -> 0x00a6 }
            if (r9 == 0) goto L_0x0095
            java.lang.StringBuffer r9 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x00a8, RuntimeException -> 0x00a6 }
            r9.<init>()     // Catch:{ SecurityException -> 0x00a8, RuntimeException -> 0x00a6 }
            java.lang.String r10 = "[LOOKUP] Creating an instance of LogFactory class '"
            r9.append(r10)     // Catch:{ SecurityException -> 0x00a8, RuntimeException -> 0x00a6 }
            r9.append(r8)     // Catch:{ SecurityException -> 0x00a8, RuntimeException -> 0x00a6 }
            java.lang.String r10 = "' as specified by system property "
            r9.append(r10)     // Catch:{ SecurityException -> 0x00a8, RuntimeException -> 0x00a6 }
            r9.append(r3)     // Catch:{ SecurityException -> 0x00a8, RuntimeException -> 0x00a6 }
            java.lang.String r9 = r9.toString()     // Catch:{ SecurityException -> 0x00a8, RuntimeException -> 0x00a6 }
            mo46816g(r9)     // Catch:{ SecurityException -> 0x00a8, RuntimeException -> 0x00a6 }
        L_0x0095:
            org.apache.commons.logging.h r5 = m66932a(r8, r7, r4)     // Catch:{ SecurityException -> 0x00a8, RuntimeException -> 0x00a6 }
            goto L_0x00f5
        L_0x009a:
            boolean r8 = m66955i()     // Catch:{ SecurityException -> 0x00a8, RuntimeException -> 0x00a6 }
            if (r8 == 0) goto L_0x00f5
            java.lang.String r8 = "[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined."
            mo46816g(r8)     // Catch:{ SecurityException -> 0x00a8, RuntimeException -> 0x00a6 }
            goto L_0x00f5
        L_0x00a6:
            r0 = move-exception
            goto L_0x00aa
        L_0x00a8:
            r8 = move-exception
            goto L_0x00d2
        L_0x00aa:
            boolean r1 = m66955i()
            if (r1 == 0) goto L_0x00d1
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: ["
            r1.append(r2)
            java.lang.String r2 = r0.getMessage()
            java.lang.String r2 = mo46818i(r2)
            r1.append(r2)
            java.lang.String r2 = "] as specified by a system property."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            mo46816g(r1)
        L_0x00d1:
            throw r0
        L_0x00d2:
            boolean r9 = m66955i()
            if (r9 == 0) goto L_0x00f5
            java.lang.StringBuffer r9 = new java.lang.StringBuffer
            r9.<init>()
            r9.append(r2)
            java.lang.String r8 = r8.getMessage()
            java.lang.String r8 = mo46818i(r8)
            r9.append(r8)
            r9.append(r1)
            java.lang.String r8 = r9.toString()
            mo46816g(r8)
        L_0x00f5:
            if (r5 != 0) goto L_0x0192
            boolean r8 = m66955i()
            if (r8 == 0) goto L_0x0102
            java.lang.String r8 = "[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use..."
            mo46816g(r8)
        L_0x0102:
            java.io.InputStream r8 = m66934b(r4, r0)     // Catch:{ Exception -> 0x016e }
            if (r8 == 0) goto L_0x0162
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ UnsupportedEncodingException -> 0x0115 }
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ UnsupportedEncodingException -> 0x0115 }
            java.lang.String r11 = "UTF-8"
            r10.<init>(r8, r11)     // Catch:{ UnsupportedEncodingException -> 0x0115 }
            r9.<init>(r10)     // Catch:{ UnsupportedEncodingException -> 0x0115 }
            goto L_0x011f
        L_0x0115:
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ Exception -> 0x016e }
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x016e }
            r10.<init>(r8)     // Catch:{ Exception -> 0x016e }
            r9.<init>(r10)     // Catch:{ Exception -> 0x016e }
        L_0x011f:
            java.lang.String r8 = r9.readLine()     // Catch:{ Exception -> 0x016e }
            r9.close()     // Catch:{ Exception -> 0x016e }
            if (r8 == 0) goto L_0x0192
            java.lang.String r9 = ""
            boolean r9 = r9.equals(r8)     // Catch:{ Exception -> 0x016e }
            if (r9 != 0) goto L_0x0192
            boolean r9 = m66955i()     // Catch:{ Exception -> 0x016e }
            if (r9 == 0) goto L_0x015c
            java.lang.StringBuffer r9 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x016e }
            r9.<init>()     // Catch:{ Exception -> 0x016e }
            java.lang.String r10 = "[LOOKUP]  Creating an instance of LogFactory class "
            r9.append(r10)     // Catch:{ Exception -> 0x016e }
            r9.append(r8)     // Catch:{ Exception -> 0x016e }
            java.lang.String r10 = " as specified by file '"
            r9.append(r10)     // Catch:{ Exception -> 0x016e }
            r9.append(r0)     // Catch:{ Exception -> 0x016e }
            java.lang.String r0 = "' which was present in the path of the context"
            r9.append(r0)     // Catch:{ Exception -> 0x016e }
            java.lang.String r0 = " classloader."
            r9.append(r0)     // Catch:{ Exception -> 0x016e }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x016e }
            mo46816g(r0)     // Catch:{ Exception -> 0x016e }
        L_0x015c:
            org.apache.commons.logging.h r0 = m66932a(r8, r7, r4)     // Catch:{ Exception -> 0x016e }
            r5 = r0
            goto L_0x0192
        L_0x0162:
            boolean r0 = m66955i()     // Catch:{ Exception -> 0x016e }
            if (r0 == 0) goto L_0x0192
            java.lang.String r0 = "[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found."
            mo46816g(r0)     // Catch:{ Exception -> 0x016e }
            goto L_0x0192
        L_0x016e:
            r0 = move-exception
            boolean r8 = m66955i()
            if (r8 == 0) goto L_0x0192
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            r8.append(r2)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = mo46818i(r0)
            r8.append(r0)
            r8.append(r1)
            java.lang.String r0 = r8.toString()
            mo46816g(r0)
        L_0x0192:
            if (r5 != 0) goto L_0x01e3
            if (r6 == 0) goto L_0x01d8
            boolean r0 = m66955i()
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = "[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use..."
            mo46816g(r0)
        L_0x01a1:
            java.lang.String r0 = r6.getProperty(r3)
            if (r0 == 0) goto L_0x01cc
            boolean r1 = m66955i()
            if (r1 == 0) goto L_0x01c6
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "[LOOKUP] Properties file specifies LogFactory subclass '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            mo46816g(r1)
        L_0x01c6:
            org.apache.commons.logging.h r0 = m66932a(r0, r7, r4)
            r5 = r0
            goto L_0x01e3
        L_0x01cc:
            boolean r0 = m66955i()
            if (r0 == 0) goto L_0x01e3
            java.lang.String r0 = "[LOOKUP] Properties file has no entry specifying LogFactory subclass."
            mo46816g(r0)
            goto L_0x01e3
        L_0x01d8:
            boolean r0 = m66955i()
            if (r0 == 0) goto L_0x01e3
            java.lang.String r0 = "[LOOKUP] No properties file available to determine LogFactory subclass from.."
            mo46816g(r0)
        L_0x01e3:
            if (r5 != 0) goto L_0x01f8
            boolean r0 = m66955i()
            if (r0 == 0) goto L_0x01f0
            java.lang.String r0 = "[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader)."
            mo46816g(r0)
        L_0x01f0:
            java.lang.ClassLoader r0 = f43884l
            java.lang.String r1 = "org.apache.commons.logging.impl.LogFactoryImpl"
            org.apache.commons.logging.h r5 = m66932a(r1, r0, r4)
        L_0x01f8:
            if (r5 == 0) goto L_0x0217
            m66933a(r4, r5)
            if (r6 == 0) goto L_0x0217
            java.util.Enumeration r0 = r6.propertyNames()
        L_0x0203:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L_0x0217
            java.lang.Object r1 = r0.nextElement()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r6.getProperty(r1)
            r5.mo46802a(r1, r2)
            goto L_0x0203
        L_0x0217:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.C15096h.m66950g():org.apache.commons.logging.h");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void mo46817h() {
        /*
            java.lang.String r0 = "org.apache.commons.logging.diagnostics.dest"
            r1 = 0
            java.lang.String r0 = m66928a(r0, r1)     // Catch:{ SecurityException -> 0x0059 }
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.String r1 = "STDOUT"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0017
            java.io.PrintStream r0 = java.lang.System.out
            f43880h = r0
            goto L_0x0031
        L_0x0017:
            java.lang.String r1 = "STDERR"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0024
            java.io.PrintStream r0 = java.lang.System.err
            f43880h = r0
            goto L_0x0031
        L_0x0024:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
            r2 = 1
            r1.<init>(r0, r2)     // Catch:{  }
            java.io.PrintStream r0 = new java.io.PrintStream     // Catch:{  }
            r0.<init>(r1)     // Catch:{  }
            f43880h = r0     // Catch:{  }
        L_0x0031:
            java.lang.ClassLoader r0 = f43884l     // Catch:{ SecurityException -> 0x003f }
            java.lang.ClassLoader r1 = f43884l     // Catch:{ SecurityException -> 0x003f }
            if (r1 != 0) goto L_0x003a
            java.lang.String r0 = "BOOTLOADER"
            goto L_0x0041
        L_0x003a:
            java.lang.String r0 = m66927a(r0)     // Catch:{ SecurityException -> 0x003f }
            goto L_0x0041
        L_0x003f:
            java.lang.String r0 = "UNKNOWN"
        L_0x0041:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "[LogFactory from "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "] "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            f43881i = r0
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.C15096h.mo46817h():void");
    }

    /* renamed from: i */
    private static String mo46818i(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    /* renamed from: j */
    public static void m66956j() {
        if (m66955i()) {
            mo46816g("Releasing factory for all classloaders.");
        }
        synchronized (f43885m) {
            Enumeration elements = f43885m.elements();
            while (elements.hasMoreElements()) {
                ((C15096h) elements.nextElement()).mo46805b();
            }
            f43885m.clear();
            if (f43886n != null) {
                f43886n.mo46805b();
                f43886n = null;
            }
        }
    }

    /* renamed from: a */
    public abstract Object mo46800a(String str);

    /* renamed from: a */
    public abstract C15089a mo46801a(Class cls) throws LogConfigurationException;

    /* renamed from: a */
    public abstract void mo46802a(String str, Object obj);

    /* renamed from: a */
    public abstract String[] mo46803a();

    /* renamed from: b */
    public abstract C15089a mo46804b(String str) throws LogConfigurationException;

    /* renamed from: b */
    public abstract void mo46805b();

    /* renamed from: c */
    public abstract void mo46806c(String str);

    /* renamed from: d */
    protected static ClassLoader m66942d() throws LogConfigurationException {
        Class cls;
        try {
            if (f43887o == null) {
                cls = m66945e("java.lang.Thread");
                f43887o = cls;
            } else {
                cls = f43887o;
            }
            return (ClassLoader) cls.getMethod("getContextClassLoader", null).invoke(Thread.currentThread(), null);
        } catch (IllegalAccessException e) {
            throw new LogConfigurationException("Unexpected IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getTargetException() instanceof SecurityException) {
                return null;
            }
            throw new LogConfigurationException("Unexpected InvocationTargetException", e2.getTargetException());
        } catch (NoSuchMethodException unused) {
            Class cls2 = f43888p;
            if (cls2 == null) {
                cls2 = m66945e(f43875c);
                f43888p = cls2;
            }
            return m66935b(cls2);
        }
    }

    /* renamed from: e */
    static /* synthetic */ Class m66945e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* renamed from: f */
    private static ClassLoader mo46815f() throws LogConfigurationException {
        return (ClassLoader) AccessController.doPrivileged(new C15090b());
    }

    /* renamed from: i */
    protected static boolean m66955i() {
        return f43880h != null;
    }

    /* renamed from: a */
    private static void m66933a(ClassLoader classLoader, C15096h hVar) {
        if (hVar == null) {
            return;
        }
        if (classLoader == null) {
            f43886n = hVar;
        } else {
            f43885m.put(classLoader, hVar);
        }
    }

    /* renamed from: e */
    private static void m66947e(Class cls) {
        if (m66955i()) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("[ENV] Extension directories (java.ext.dir): ");
                stringBuffer.append(System.getProperty("java.ext.dir"));
                mo46816g(stringBuffer.toString());
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Application classpath (java.class.path): ");
                stringBuffer2.append(System.getProperty("java.class.path"));
                mo46816g(stringBuffer2.toString());
            } catch (SecurityException unused) {
                mo46816g("[ENV] Security setting prevent interrogation of system classpaths.");
            }
            String name = cls.getName();
            try {
                ClassLoader b = m66935b(cls);
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[ENV] Class ");
                stringBuffer3.append(name);
                stringBuffer3.append(" was loaded via classloader ");
                stringBuffer3.append(m66927a((Object) b));
                mo46816g(stringBuffer3.toString());
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[ENV] Ancestry of classloader which loaded ");
                stringBuffer4.append(name);
                stringBuffer4.append(" is ");
                m66937b(stringBuffer4.toString(), b);
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] Security forbids determining the classloader for ");
                stringBuffer5.append(name);
                mo46816g(stringBuffer5.toString());
            }
        }
    }

    /* renamed from: a */
    protected static C15096h m66932a(String str, ClassLoader classLoader, ClassLoader classLoader2) throws LogConfigurationException {
        Object doPrivileged = AccessController.doPrivileged(new C15091c(str, classLoader));
        if (doPrivileged instanceof LogConfigurationException) {
            LogConfigurationException logConfigurationException = (LogConfigurationException) doPrivileged;
            if (m66955i()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("An error occurred while loading the factory class:");
                stringBuffer.append(logConfigurationException.getMessage());
                mo46816g(stringBuffer.toString());
            }
            throw logConfigurationException;
        }
        if (m66955i()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Created object ");
            stringBuffer2.append(m66927a(doPrivileged));
            stringBuffer2.append(" to manage classloader ");
            stringBuffer2.append(m66927a((Object) classLoader2));
            mo46816g(stringBuffer2.toString());
        }
        return (C15096h) doPrivileged;
    }

    /* renamed from: d */
    private static boolean m66944d(Class cls) {
        String str = "[CUSTOM LOG FACTORY] ";
        boolean z = false;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    mo46816g("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                } else {
                    m66937b(str, classLoader);
                    z = Class.forName(f43875c, false, classLoader).isAssignableFrom(cls);
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append(str);
                        stringBuffer.append(cls.getName());
                        stringBuffer.append(" implements LogFactory but was loaded by an incompatible classloader.");
                        mo46816g(stringBuffer.toString());
                    } else {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append(str);
                        stringBuffer2.append(cls.getName());
                        stringBuffer2.append(" does not implement LogFactory.");
                        mo46816g(stringBuffer2.toString());
                    }
                }
            } catch (SecurityException e) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer3.append(e.getMessage());
                mo46816g(stringBuffer3.toString());
            } catch (LinkageError e2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer4.append(e2.getMessage());
                mo46816g(stringBuffer4.toString());
            } catch (ClassNotFoundException unused) {
                mo46816g("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            }
        }
        return z;
    }

    /* renamed from: c */
    public static C15089a m66940c(Class cls) throws LogConfigurationException {
        return m66950g().mo46801a(cls);
    }

    /* renamed from: c */
    protected static C15096h m66941c(String str, ClassLoader classLoader) {
        return m66932a(str, classLoader, null);
    }

    /* renamed from: b */
    protected static ClassLoader m66935b(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e) {
            if (m66955i()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to get classloader for class '");
                stringBuffer.append(cls);
                stringBuffer.append("' due to security restrictions - ");
                stringBuffer.append(e.getMessage());
                mo46816g(stringBuffer.toString());
            }
            throw e;
        }
    }

    /* renamed from: c */
    private static Enumeration m66938c(ClassLoader classLoader, String str) {
        return (Enumeration) AccessController.doPrivileged(new C15093e(classLoader, str));
    }

    /* renamed from: h */
    protected static final void m66953h(String str) {
        PrintStream printStream = f43880h;
        if (printStream != null) {
            printStream.println(str);
            f43880h.flush();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x009f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.Object m66926a(java.lang.String r5, java.lang.ClassLoader r6) {
        /*
            java.lang.String r0 = "org.apache.commons.logging.LogFactory"
            r1 = 0
            if (r6 == 0) goto L_0x019b
            java.lang.Class r1 = r6.loadClass(r5)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.Class r2 = f43888p     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            if (r2 != 0) goto L_0x0014
            java.lang.Class r2 = m66945e(r0)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            f43888p = r2     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            goto L_0x0016
        L_0x0014:
            java.lang.Class r2 = f43888p     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
        L_0x0016:
            boolean r2 = r2.isAssignableFrom(r1)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            if (r2 == 0) goto L_0x0047
            boolean r2 = m66955i()     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            if (r2 == 0) goto L_0x0098
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            r2.<init>()     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.String r3 = "Loaded class "
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.String r3 = r1.getName()     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.String r3 = " from classloader "
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.String r3 = m66927a(r6)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.String r2 = r2.toString()     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            mo46816g(r2)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            goto L_0x0098
        L_0x0047:
            boolean r2 = m66955i()     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            if (r2 == 0) goto L_0x0098
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            r2.<init>()     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.String r3 = "Factory class "
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.String r3 = r1.getName()     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.String r3 = " loaded from classloader "
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.ClassLoader r3 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.String r3 = m66927a(r3)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.String r3 = " does not extend '"
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.Class r3 = f43888p     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            if (r3 != 0) goto L_0x007e
            java.lang.Class r3 = m66945e(r0)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            f43888p = r3     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            goto L_0x0080
        L_0x007e:
            java.lang.Class r3 = f43888p     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
        L_0x0080:
            java.lang.String r3 = r3.getName()     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.String r3 = "' as loaded by this classloader."
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.String r2 = r2.toString()     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            mo46816g(r2)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            java.lang.String r2 = "[BAD CL TREE] "
            m66937b(r2, r6)     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
        L_0x0098:
            java.lang.Object r2 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            org.apache.commons.logging.h r2 = (org.apache.commons.logging.C15096h) r2     // Catch:{ ClassNotFoundException -> 0x016f, NoClassDefFoundError -> 0x0134, ClassCastException -> 0x009f }
            return r2
        L_0x009f:
            java.lang.ClassLoader r2 = f43884l     // Catch:{ Exception -> 0x01c9 }
            if (r6 != r2) goto L_0x019b
            boolean r6 = m66944d(r1)     // Catch:{ Exception -> 0x01c9 }
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x01c9 }
            r2.<init>()     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r3 = "The application has specified that a custom LogFactory implementation should be used but Class '"
            r2.append(r3)     // Catch:{ Exception -> 0x01c9 }
            r2.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = "' cannot be converted to '"
            r2.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.Class r5 = f43888p     // Catch:{ Exception -> 0x01c9 }
            if (r5 != 0) goto L_0x00c4
            java.lang.Class r5 = m66945e(r0)     // Catch:{ Exception -> 0x01c9 }
            f43888p = r5     // Catch:{ Exception -> 0x01c9 }
            goto L_0x00c6
        L_0x00c4:
            java.lang.Class r5 = f43888p     // Catch:{ Exception -> 0x01c9 }
        L_0x00c6:
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x01c9 }
            r2.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = "'. "
            r2.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x01c9 }
            if (r6 == 0) goto L_0x0103
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x01c9 }
            r6.<init>()     // Catch:{ Exception -> 0x01c9 }
            r6.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = "The conflict is caused by the presence of multiple LogFactory classes in incompatible classloaders. "
            r6.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = "Background can be found in http://commons.apache.org/logging/tech.html. "
            r6.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = "If you have not explicitly specified a custom LogFactory then it is likely that "
            r6.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = "the container has set one without your knowledge. "
            r6.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = "In this case, consider using the commons-logging-adapters.jar file or "
            r6.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = "specifying the standard LogFactory from the command line. "
            r6.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x01c9 }
            goto L_0x0114
        L_0x0103:
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x01c9 }
            r6.<init>()     // Catch:{ Exception -> 0x01c9 }
            r6.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = "Please check the custom implementation. "
            r6.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x01c9 }
        L_0x0114:
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x01c9 }
            r6.<init>()     // Catch:{ Exception -> 0x01c9 }
            r6.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = "Help can be found @http://commons.apache.org/logging/troubleshooting.html."
            r6.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x01c9 }
            boolean r6 = m66955i()     // Catch:{ Exception -> 0x01c9 }
            if (r6 == 0) goto L_0x012e
            mo46816g(r5)     // Catch:{ Exception -> 0x01c9 }
        L_0x012e:
            java.lang.ClassCastException r6 = new java.lang.ClassCastException     // Catch:{ Exception -> 0x01c9 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x01c9 }
            throw r6     // Catch:{ Exception -> 0x01c9 }
        L_0x0134:
            r2 = move-exception
            java.lang.ClassLoader r3 = f43884l     // Catch:{ Exception -> 0x01c9 }
            if (r6 != r3) goto L_0x019b
            boolean r3 = m66955i()     // Catch:{ Exception -> 0x01c9 }
            if (r3 == 0) goto L_0x016e
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x01c9 }
            r3.<init>()     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r4 = "Class '"
            r3.append(r4)     // Catch:{ Exception -> 0x01c9 }
            r3.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = "' cannot be loaded"
            r3.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = " via classloader "
            r3.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = m66927a(r6)     // Catch:{ Exception -> 0x01c9 }
            r3.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = " - it depends on some other class that cannot"
            r3.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = " be found."
            r3.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = r3.toString()     // Catch:{ Exception -> 0x01c9 }
            mo46816g(r5)     // Catch:{ Exception -> 0x01c9 }
        L_0x016e:
            throw r2     // Catch:{ Exception -> 0x01c9 }
        L_0x016f:
            r2 = move-exception
            java.lang.ClassLoader r3 = f43884l     // Catch:{ Exception -> 0x01c9 }
            if (r6 != r3) goto L_0x019b
            boolean r3 = m66955i()     // Catch:{ Exception -> 0x01c9 }
            if (r3 == 0) goto L_0x019a
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x01c9 }
            r3.<init>()     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r4 = "Unable to locate any class called '"
            r3.append(r4)     // Catch:{ Exception -> 0x01c9 }
            r3.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = "' via classloader "
            r3.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = m66927a(r6)     // Catch:{ Exception -> 0x01c9 }
            r3.append(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r5 = r3.toString()     // Catch:{ Exception -> 0x01c9 }
            mo46816g(r5)     // Catch:{ Exception -> 0x01c9 }
        L_0x019a:
            throw r2     // Catch:{ Exception -> 0x01c9 }
        L_0x019b:
            boolean r2 = m66955i()     // Catch:{ Exception -> 0x01c9 }
            if (r2 == 0) goto L_0x01be
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x01c9 }
            r2.<init>()     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r3 = "Unable to load factory class via classloader "
            r2.append(r3)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r6 = m66927a(r6)     // Catch:{ Exception -> 0x01c9 }
            r2.append(r6)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r6 = " - trying the classloader associated with this LogFactory."
            r2.append(r6)     // Catch:{ Exception -> 0x01c9 }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x01c9 }
            mo46816g(r6)     // Catch:{ Exception -> 0x01c9 }
        L_0x01be:
            java.lang.Class r1 = java.lang.Class.forName(r5)     // Catch:{ Exception -> 0x01c9 }
            java.lang.Object r5 = r1.newInstance()     // Catch:{ Exception -> 0x01c9 }
            org.apache.commons.logging.h r5 = (org.apache.commons.logging.C15096h) r5     // Catch:{ Exception -> 0x01c9 }
            return r5
        L_0x01c9:
            r5 = move-exception
            boolean r6 = m66955i()
            if (r6 == 0) goto L_0x01d5
            java.lang.String r6 = "Unable to create LogFactory instance."
            mo46816g(r6)
        L_0x01d5:
            if (r1 == 0) goto L_0x01ef
            java.lang.Class r6 = f43888p
            if (r6 != 0) goto L_0x01e1
            java.lang.Class r6 = m66945e(r0)
            f43888p = r6
        L_0x01e1:
            boolean r6 = r6.isAssignableFrom(r1)
            if (r6 != 0) goto L_0x01ef
            org.apache.commons.logging.LogConfigurationException r6 = new org.apache.commons.logging.LogConfigurationException
            java.lang.String r0 = "The chosen LogFactory implementation does not extend LogFactory. Please check your configuration."
            r6.<init>(r0, r5)
            return r6
        L_0x01ef:
            org.apache.commons.logging.LogConfigurationException r6 = new org.apache.commons.logging.LogConfigurationException
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.C15096h.m66926a(java.lang.String, java.lang.ClassLoader):java.lang.Object");
    }

    /* renamed from: b */
    private static InputStream m66934b(ClassLoader classLoader, String str) {
        return (InputStream) AccessController.doPrivileged(new C15092d(classLoader, str));
    }

    /* renamed from: b */
    private static void m66937b(String str, ClassLoader classLoader) {
        if (m66955i()) {
            if (classLoader != null) {
                String obj = classLoader.toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(m66927a((Object) classLoader));
                stringBuffer.append(" == '");
                stringBuffer.append(obj);
                stringBuffer.append("'");
                mo46816g(stringBuffer.toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append("ClassLoader tree:");
                    StringBuffer stringBuffer3 = new StringBuffer(stringBuffer2.toString());
                    do {
                        stringBuffer3.append(m66927a((Object) classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer3.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer3.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer3.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer3.append("BOOT");
                    mo46816g(stringBuffer3.toString());
                }
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(str);
                stringBuffer4.append("Security forbids determining the system classloader.");
                mo46816g(stringBuffer4.toString());
            }
        }
    }

    /* renamed from: a */
    private static Properties m66930a(URL url) {
        return (Properties) AccessController.doPrivileged(new C15094f(url));
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ee  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.util.Properties m66929a(java.lang.ClassLoader r14, java.lang.String r15) {
        /*
            r0 = 0
            java.util.Enumeration r14 = m66938c(r14, r15)     // Catch:{ SecurityException -> 0x00dc }
            if (r14 != 0) goto L_0x0008
            return r0
        L_0x0008:
            r1 = 0
            r3 = r0
            r4 = r1
        L_0x000c:
            boolean r6 = r14.hasMoreElements()     // Catch:{ SecurityException -> 0x00da }
            if (r6 == 0) goto L_0x00e8
            java.lang.Object r6 = r14.nextElement()     // Catch:{ SecurityException -> 0x00da }
            java.net.URL r6 = (java.net.URL) r6     // Catch:{ SecurityException -> 0x00da }
            java.util.Properties r7 = m66930a(r6)     // Catch:{ SecurityException -> 0x00da }
            if (r7 == 0) goto L_0x000c
            java.lang.String r8 = "priority"
            java.lang.String r9 = " with priority "
            java.lang.String r10 = "'"
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = r7.getProperty(r8)     // Catch:{ SecurityException -> 0x0059 }
            if (r0 == 0) goto L_0x0031
            double r3 = java.lang.Double.parseDouble(r0)     // Catch:{ SecurityException -> 0x0059 }
            goto L_0x0032
        L_0x0031:
            r3 = r1
        L_0x0032:
            boolean r0 = m66955i()     // Catch:{ SecurityException -> 0x0059 }
            if (r0 == 0) goto L_0x0055
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x0059 }
            r0.<init>()     // Catch:{ SecurityException -> 0x0059 }
            java.lang.String r5 = "[LOOKUP] Properties file found at '"
            r0.append(r5)     // Catch:{ SecurityException -> 0x0059 }
            r0.append(r6)     // Catch:{ SecurityException -> 0x0059 }
            r0.append(r10)     // Catch:{ SecurityException -> 0x0059 }
            r0.append(r9)     // Catch:{ SecurityException -> 0x0059 }
            r0.append(r3)     // Catch:{ SecurityException -> 0x0059 }
            java.lang.String r0 = r0.toString()     // Catch:{ SecurityException -> 0x0059 }
            mo46816g(r0)     // Catch:{ SecurityException -> 0x0059 }
        L_0x0055:
            r4 = r3
            r3 = r6
            r0 = r7
            goto L_0x000c
        L_0x0059:
            r3 = r6
            r0 = r7
            goto L_0x00dd
        L_0x005d:
            java.lang.String r8 = r7.getProperty(r8)     // Catch:{ SecurityException -> 0x00da }
            if (r8 == 0) goto L_0x0068
            double r11 = java.lang.Double.parseDouble(r8)     // Catch:{ SecurityException -> 0x00da }
            goto L_0x0069
        L_0x0068:
            r11 = r1
        L_0x0069:
            java.lang.String r8 = "[LOOKUP] Properties file at '"
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x00a6
            boolean r13 = m66955i()     // Catch:{ SecurityException -> 0x00da }
            if (r13 == 0) goto L_0x00a1
            java.lang.StringBuffer r13 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x00da }
            r13.<init>()     // Catch:{ SecurityException -> 0x00da }
            r13.append(r8)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r6)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r10)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r9)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r11)     // Catch:{ SecurityException -> 0x00da }
            java.lang.String r8 = " overrides file at '"
            r13.append(r8)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r3)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r10)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r9)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r4)     // Catch:{ SecurityException -> 0x00da }
            java.lang.String r4 = r13.toString()     // Catch:{ SecurityException -> 0x00da }
            mo46816g(r4)     // Catch:{ SecurityException -> 0x00da }
        L_0x00a1:
            r3 = r6
            r0 = r7
            r4 = r11
            goto L_0x000c
        L_0x00a6:
            boolean r7 = m66955i()     // Catch:{ SecurityException -> 0x00da }
            if (r7 == 0) goto L_0x000c
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x00da }
            r7.<init>()     // Catch:{ SecurityException -> 0x00da }
            r7.append(r8)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r6)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r10)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r9)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r11)     // Catch:{ SecurityException -> 0x00da }
            java.lang.String r6 = " does not override file at '"
            r7.append(r6)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r3)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r10)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r9)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r4)     // Catch:{ SecurityException -> 0x00da }
            java.lang.String r6 = r7.toString()     // Catch:{ SecurityException -> 0x00da }
            mo46816g(r6)     // Catch:{ SecurityException -> 0x00da }
            goto L_0x000c
        L_0x00da:
            goto L_0x00dd
        L_0x00dc:
            r3 = r0
        L_0x00dd:
            boolean r14 = m66955i()
            if (r14 == 0) goto L_0x00e8
            java.lang.String r14 = "SecurityException thrown while trying to find/read config files."
            mo46816g(r14)
        L_0x00e8:
            boolean r14 = m66955i()
            if (r14 == 0) goto L_0x012b
            if (r0 != 0) goto L_0x010a
            java.lang.StringBuffer r14 = new java.lang.StringBuffer
            r14.<init>()
            java.lang.String r1 = "[LOOKUP] No properties file of name '"
            r14.append(r1)
            r14.append(r15)
            java.lang.String r15 = "' found."
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            mo46816g(r14)
            goto L_0x012b
        L_0x010a:
            java.lang.StringBuffer r14 = new java.lang.StringBuffer
            r14.<init>()
            java.lang.String r1 = "[LOOKUP] Properties file of name '"
            r14.append(r1)
            r14.append(r15)
            java.lang.String r15 = "' found at '"
            r14.append(r15)
            r14.append(r3)
            r15 = 34
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            mo46816g(r14)
        L_0x012b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.C15096h.m66929a(java.lang.ClassLoader, java.lang.String):java.util.Properties");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void mo46816g(String str) {
        PrintStream printStream = f43880h;
        if (printStream != null) {
            printStream.print(f43881i);
            f43880h.println(str);
            f43880h.flush();
        }
    }

    /* renamed from: a */
    private static String m66928a(String str, String str2) throws SecurityException {
        return (String) AccessController.doPrivileged(new C15095g(str, str2));
    }

    /* renamed from: a */
    public static String m66927a(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(System.identityHashCode(obj));
        return stringBuffer.toString();
    }
}
