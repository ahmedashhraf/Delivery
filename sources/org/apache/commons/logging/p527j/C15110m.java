package org.apache.commons.logging.p527j;

import com.facebook.internal.ServerProtocol;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.mrsool.utils.webservice.C11687c;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.security.AccessController;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.logging.C15089a;

/* renamed from: org.apache.commons.logging.j.m */
/* compiled from: SimpleLog */
public class C15110m implements C15089a, Serializable {

    /* renamed from: O */
    protected static final String f43948O = "org.apache.commons.logging.simplelog.";

    /* renamed from: P */
    protected static final Properties f43949P = new Properties();

    /* renamed from: Q */
    protected static final String f43950Q = "yyyy/MM/dd HH:mm:ss:SSS zzz";

    /* renamed from: R */
    protected static boolean f43951R = false;

    /* renamed from: S */
    protected static boolean f43952S = false;

    /* renamed from: T */
    protected static boolean f43953T = false;

    /* renamed from: U */
    protected static String f43954U = null;

    /* renamed from: V */
    protected static DateFormat f43955V = null;

    /* renamed from: W */
    public static final int f43956W = 1;

    /* renamed from: X */
    public static final int f43957X = 2;

    /* renamed from: Y */
    public static final int f43958Y = 3;

    /* renamed from: Z */
    public static final int f43959Z = 4;

    /* renamed from: a0 */
    public static final int f43960a0 = 5;

    /* renamed from: b0 */
    public static final int f43961b0 = 6;

    /* renamed from: c0 */
    public static final int f43962c0 = 0;

    /* renamed from: d0 */
    public static final int f43963d0 = 7;

    /* renamed from: e0 */
    static /* synthetic */ Class f43964e0;

    /* renamed from: f0 */
    static /* synthetic */ Class f43965f0;

    /* renamed from: N */
    private String f43966N = null;

    /* renamed from: a */
    protected String f43967a = null;

    /* renamed from: b */
    protected int f43968b;

    static {
        f43951R = false;
        f43952S = true;
        f43953T = false;
        String str = f43950Q;
        f43954U = str;
        f43955V = null;
        InputStream c = m67129c("simplelog.properties");
        if (c != null) {
            try {
                f43949P.load(c);
                c.close();
            } catch (IOException unused) {
            }
        }
        f43951R = m67127a("org.apache.commons.logging.simplelog.showlogname", f43951R);
        f43952S = m67127a("org.apache.commons.logging.simplelog.showShortLogname", f43952S);
        f43953T = m67127a("org.apache.commons.logging.simplelog.showdatetime", f43953T);
        if (f43953T) {
            f43954U = m67126a("org.apache.commons.logging.simplelog.dateTimeFormat", f43954U);
            try {
                f43955V = new SimpleDateFormat(f43954U);
            } catch (IllegalArgumentException unused2) {
                f43954U = str;
                f43955V = new SimpleDateFormat(f43954U);
            }
        }
    }

    public C15110m(String str) {
        this.f43967a = str;
        mo46828b(3);
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = "org.apache.commons.logging.simplelog.log.";
        stringBuffer.append(str2);
        stringBuffer.append(this.f43967a);
        String d = m67130d(stringBuffer.toString());
        String str3 = ".";
        int lastIndexOf = String.valueOf(str).lastIndexOf(str3);
        while (d == null && lastIndexOf > -1) {
            str = str.substring(0, lastIndexOf);
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(str2);
            stringBuffer2.append(str);
            d = m67130d(stringBuffer2.toString());
            lastIndexOf = String.valueOf(str).lastIndexOf(str3);
        }
        if (d == null) {
            d = m67130d("org.apache.commons.logging.simplelog.defaultlog");
        }
        if (C11687c.f33836s2.equalsIgnoreCase(d)) {
            mo46828b(0);
        } else if ("trace".equalsIgnoreCase(d)) {
            mo46828b(1);
        } else if ("debug".equalsIgnoreCase(d)) {
            mo46828b(2);
        } else if ("info".equalsIgnoreCase(d)) {
            mo46828b(3);
        } else if ("warn".equalsIgnoreCase(d)) {
            mo46828b(4);
        } else if ("error".equalsIgnoreCase(d)) {
            mo46828b(5);
        } else if ("fatal".equalsIgnoreCase(d)) {
            mo46828b(6);
        } else if ("off".equalsIgnoreCase(d)) {
            mo46828b(7);
        }
    }

    /* renamed from: a */
    private static String m67126a(String str, String str2) {
        String d = m67130d(str);
        return d == null ? str2 : d;
    }

    /* renamed from: d */
    private static String m67130d(String str) {
        String str2;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        return str2 == null ? f43949P.getProperty(str) : str2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[ExcHandler: NoSuchMethodException (unused java.lang.NoSuchMethodException), SYNTHETIC, Splitter:B:1:0x0001] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.ClassLoader m67132k() {
        /*
            r0 = 0
            java.lang.Class r1 = f43964e0     // Catch:{ NoSuchMethodException -> 0x0038 }
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "java.lang.Thread"
            java.lang.Class r1 = m67128b(r1)     // Catch:{ NoSuchMethodException -> 0x0038 }
            f43964e0 = r1     // Catch:{ NoSuchMethodException -> 0x0038 }
            goto L_0x0010
        L_0x000e:
            java.lang.Class r1 = f43964e0     // Catch:{ NoSuchMethodException -> 0x0038 }
        L_0x0010:
            java.lang.String r2 = "getContextClassLoader"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch:{ NoSuchMethodException -> 0x0038 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ InvocationTargetException -> 0x0022, NoSuchMethodException -> 0x0038 }
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch:{ InvocationTargetException -> 0x0022, NoSuchMethodException -> 0x0038 }
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch:{ InvocationTargetException -> 0x0022, NoSuchMethodException -> 0x0038 }
            r0 = r1
            goto L_0x0039
        L_0x0022:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getTargetException()     // Catch:{ NoSuchMethodException -> 0x0038 }
            boolean r2 = r2 instanceof java.lang.SecurityException     // Catch:{ NoSuchMethodException -> 0x0038 }
            if (r2 == 0) goto L_0x002c
            goto L_0x0039
        L_0x002c:
            org.apache.commons.logging.LogConfigurationException r2 = new org.apache.commons.logging.LogConfigurationException     // Catch:{ NoSuchMethodException -> 0x0038 }
            java.lang.String r3 = "Unexpected InvocationTargetException"
            java.lang.Throwable r1 = r1.getTargetException()     // Catch:{ NoSuchMethodException -> 0x0038 }
            r2.<init>(r3, r1)     // Catch:{ NoSuchMethodException -> 0x0038 }
            throw r2     // Catch:{ NoSuchMethodException -> 0x0038 }
        L_0x0038:
        L_0x0039:
            if (r0 != 0) goto L_0x004b
            java.lang.Class r0 = f43965f0
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "org.apache.commons.logging.impl.SimpleLog"
            java.lang.Class r0 = m67128b(r0)
            f43965f0 = r0
        L_0x0047:
            java.lang.ClassLoader r0 = r0.getClassLoader()
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.p527j.C15110m.m67132k():java.lang.ClassLoader");
    }

    /* renamed from: b */
    public void mo46828b(int i) {
        this.f43968b = i;
    }

    /* renamed from: c */
    public final void mo46782c(Object obj, Throwable th) {
        if (mo46827a(4)) {
            mo46825a(4, obj, th);
        }
    }

    /* renamed from: e */
    public final void mo46786e(Object obj) {
        if (mo46827a(5)) {
            mo46825a(5, obj, null);
        }
    }

    /* renamed from: f */
    public final void mo46789f(Object obj) {
        if (mo46827a(1)) {
            mo46825a(1, obj, null);
        }
    }

    /* renamed from: g */
    public final boolean mo46792g() {
        return mo46827a(1);
    }

    /* renamed from: h */
    public final boolean mo46793h() {
        return mo46827a(6);
    }

    /* renamed from: i */
    public int mo46829i() {
        return this.f43968b;
    }

    /* renamed from: a */
    private static boolean m67127a(String str, boolean z) {
        String d = m67130d(str);
        return d == null ? z : ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equalsIgnoreCase(d);
    }

    /* renamed from: b */
    public final void mo46780b(Object obj, Throwable th) {
        if (mo46827a(1)) {
            mo46825a(1, obj, th);
        }
    }

    /* renamed from: c */
    public final void mo46781c(Object obj) {
        if (mo46827a(6)) {
            mo46825a(6, obj, null);
        }
    }

    /* renamed from: d */
    public final void mo46783d(Object obj) {
        if (mo46827a(4)) {
            mo46825a(4, obj, null);
        }
    }

    /* renamed from: e */
    public final void mo46787e(Object obj, Throwable th) {
        if (mo46827a(6)) {
            mo46825a(6, obj, th);
        }
    }

    /* renamed from: f */
    public final void mo46790f(Object obj, Throwable th) {
        if (mo46827a(3)) {
            mo46825a(3, obj, th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo46825a(int i, Object obj, Throwable th) {
        String format;
        StringBuffer stringBuffer = new StringBuffer();
        if (f43953T) {
            Date date = new Date();
            synchronized (f43955V) {
                format = f43955V.format(date);
            }
            stringBuffer.append(format);
            stringBuffer.append(C3868i.f12248b);
        }
        switch (i) {
            case 1:
                stringBuffer.append("[TRACE] ");
                break;
            case 2:
                stringBuffer.append("[DEBUG] ");
                break;
            case 3:
                stringBuffer.append("[INFO] ");
                break;
            case 4:
                stringBuffer.append("[WARN] ");
                break;
            case 5:
                stringBuffer.append("[ERROR] ");
                break;
            case 6:
                stringBuffer.append("[FATAL] ");
                break;
        }
        if (f43952S) {
            if (this.f43966N == null) {
                String str = this.f43967a;
                this.f43966N = str.substring(str.lastIndexOf(".") + 1);
                String str2 = this.f43966N;
                this.f43966N = str2.substring(str2.lastIndexOf("/") + 1);
            }
            stringBuffer.append(String.valueOf(this.f43966N));
            stringBuffer.append(" - ");
        } else if (f43951R) {
            stringBuffer.append(String.valueOf(this.f43967a));
            stringBuffer.append(" - ");
        }
        stringBuffer.append(String.valueOf(obj));
        if (th != null) {
            stringBuffer.append(" <");
            stringBuffer.append(th.toString());
            stringBuffer.append(">");
            StringWriter stringWriter = new StringWriter(1024);
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.close();
            stringBuffer.append(stringWriter.toString());
        }
        mo46826a(stringBuffer);
    }

    /* renamed from: b */
    public final void mo46779b(Object obj) {
        if (mo46827a(3)) {
            mo46825a(3, obj, null);
        }
    }

    /* renamed from: c */
    private static InputStream m67129c(String str) {
        return (InputStream) AccessController.doPrivileged(new C15109l(str));
    }

    /* renamed from: d */
    public final void mo46784d(Object obj, Throwable th) {
        if (mo46827a(5)) {
            mo46825a(5, obj, th);
        }
    }

    /* renamed from: e */
    public final boolean mo46788e() {
        return mo46827a(5);
    }

    /* renamed from: f */
    public final boolean mo46791f() {
        return mo46827a(3);
    }

    /* renamed from: b */
    static /* synthetic */ Class m67128b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* renamed from: d */
    public final boolean mo46785d() {
        return mo46827a(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo46826a(StringBuffer stringBuffer) {
        System.err.println(stringBuffer.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo46827a(int i) {
        return i >= this.f43968b;
    }

    /* renamed from: a */
    public final void mo46776a(Object obj) {
        if (mo46827a(2)) {
            mo46825a(2, obj, null);
        }
    }

    /* renamed from: a */
    public final void mo46777a(Object obj, Throwable th) {
        if (mo46827a(2)) {
            mo46825a(2, obj, th);
        }
    }

    /* renamed from: a */
    public final boolean mo46778a() {
        return mo46827a(4);
    }
}
