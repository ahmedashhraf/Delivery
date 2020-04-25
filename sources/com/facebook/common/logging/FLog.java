package com.facebook.common.logging;

public class FLog {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static LoggingDelegate sHandler = FLogDefaultLoggingDelegate.getInstance();

    /* renamed from: d */
    public static void m15741d(String str, String str2) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo13780d(str, str2);
        }
    }

    /* renamed from: e */
    public static void m15753e(String str, String str2) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo13782e(str, str2);
        }
    }

    private static String formatString(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    public static int getMinimumLoggingLevel() {
        return sHandler.getMinimumLoggingLevel();
    }

    private static String getTag(Class<?> cls) {
        return cls.getSimpleName();
    }

    /* renamed from: i */
    public static void m15765i(String str, String str2) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo13785i(str, str2);
        }
    }

    public static boolean isLoggable(int i) {
        return sHandler.isLoggable(i);
    }

    public static void setLoggingDelegate(LoggingDelegate loggingDelegate) {
        if (loggingDelegate != null) {
            sHandler = loggingDelegate;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void setMinimumLoggingLevel(int i) {
        sHandler.setMinimumLoggingLevel(i);
    }

    /* renamed from: v */
    public static void m15781v(String str, String str2) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo13791v(str, str2);
        }
    }

    /* renamed from: w */
    public static void m15793w(String str, String str2) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo13793w(str, str2);
        }
    }

    public static void wtf(String str, String str2) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(str, str2);
        }
    }

    /* renamed from: d */
    public static void m15742d(String str, String str2, Object obj) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo13780d(str, formatString(str2, obj));
        }
    }

    /* renamed from: e */
    public static void m15749e(Class<?> cls, String str) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo13782e(getTag(cls), str);
        }
    }

    /* renamed from: i */
    public static void m15766i(String str, String str2, Object obj) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo13785i(str, formatString(str2, obj));
        }
    }

    /* renamed from: v */
    public static void m15782v(String str, String str2, Object obj) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo13791v(str, formatString(str2, obj));
        }
    }

    /* renamed from: w */
    public static void m15789w(Class<?> cls, String str) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo13793w(getTag(cls), str);
        }
    }

    public static void wtf(Class<?> cls, String str) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(getTag(cls), str);
        }
    }

    /* renamed from: d */
    public static void m15743d(String str, String str2, Object obj, Object obj2) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo13780d(str, formatString(str2, obj, obj2));
        }
    }

    /* renamed from: e */
    public static void m15755e(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo13782e(str, formatString(str2, objArr));
        }
    }

    /* renamed from: i */
    public static void m15767i(String str, String str2, Object obj, Object obj2) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo13785i(str, formatString(str2, obj, obj2));
        }
    }

    /* renamed from: v */
    public static void m15783v(String str, String str2, Object obj, Object obj2) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo13791v(str, formatString(str2, obj, obj2));
        }
    }

    /* renamed from: w */
    public static void m15795w(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo13793w(str, formatString(str2, objArr));
        }
    }

    public static void wtf(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(str, formatString(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m15744d(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo13780d(str, formatString(str2, obj, obj2, obj3));
        }
    }

    /* renamed from: e */
    public static void m15756e(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo13783e(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: i */
    public static void m15768i(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo13785i(str, formatString(str2, obj, obj2, obj3));
        }
    }

    /* renamed from: v */
    public static void m15784v(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo13791v(str, formatString(str2, obj, obj2, obj3));
        }
    }

    /* renamed from: w */
    public static void m15796w(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo13794w(str, formatString(str2, objArr), th);
        }
    }

    public static void wtf(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m15745d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo13780d(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: e */
    public static void m15751e(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo13782e(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: i */
    public static void m15769i(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo13785i(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: v */
    public static void m15785v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo13791v(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: w */
    public static void m15791w(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo13793w(getTag(cls), formatString(str, objArr));
        }
    }

    public static void wtf(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m15733d(Class<?> cls, String str) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo13780d(getTag(cls), str);
        }
    }

    /* renamed from: e */
    public static void m15752e(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo13783e(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: i */
    public static void m15757i(Class<?> cls, String str) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo13785i(getTag(cls), str);
        }
    }

    /* renamed from: v */
    public static void m15773v(Class<?> cls, String str) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo13791v(getTag(cls), str);
        }
    }

    /* renamed from: w */
    public static void m15792w(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (isLoggable(5)) {
            m15790w(cls, formatString(str, objArr), th);
        }
    }

    public static void wtf(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m15734d(Class<?> cls, String str, Object obj) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo13780d(getTag(cls), formatString(str, obj));
        }
    }

    /* renamed from: e */
    public static void m15754e(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo13783e(str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m15758i(Class<?> cls, String str, Object obj) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo13785i(getTag(cls), formatString(str, obj));
        }
    }

    /* renamed from: v */
    public static void m15774v(Class<?> cls, String str, Object obj) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo13791v(getTag(cls), formatString(str, obj));
        }
    }

    /* renamed from: w */
    public static void m15794w(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo13794w(str, str2, th);
        }
    }

    public static void wtf(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(str, str2, th);
        }
    }

    /* renamed from: d */
    public static void m15735d(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo13780d(getTag(cls), formatString(str, obj, obj2));
        }
    }

    /* renamed from: e */
    public static void m15750e(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo13783e(getTag(cls), str, th);
        }
    }

    /* renamed from: i */
    public static void m15759i(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo13785i(getTag(cls), formatString(str, obj, obj2));
        }
    }

    /* renamed from: v */
    public static void m15775v(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo13791v(getTag(cls), formatString(str, obj, obj2));
        }
    }

    /* renamed from: w */
    public static void m15790w(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo13794w(getTag(cls), str, th);
        }
    }

    public static void wtf(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(getTag(cls), str, th);
        }
    }

    /* renamed from: d */
    public static void m15736d(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo13780d(getTag(cls), formatString(str, obj, obj2, obj3));
        }
    }

    /* renamed from: i */
    public static void m15760i(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo13785i(getTag(cls), formatString(str, obj, obj2, obj3));
        }
    }

    /* renamed from: v */
    public static void m15776v(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (isLoggable(2)) {
            m15773v(cls, formatString(str, obj, obj2, obj3));
        }
    }

    /* renamed from: d */
    public static void m15737d(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo13780d(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: i */
    public static void m15761i(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo13785i(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: v */
    public static void m15777v(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo13791v(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: d */
    public static void m15747d(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            m15741d(str, formatString(str2, objArr));
        }
    }

    /* renamed from: i */
    public static void m15771i(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo13785i(str, formatString(str2, objArr));
        }
    }

    /* renamed from: v */
    public static void m15787v(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo13791v(str, formatString(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m15748d(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            m15746d(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: i */
    public static void m15772i(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo13786i(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: v */
    public static void m15788v(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo13792v(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m15739d(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo13780d(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: i */
    public static void m15763i(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo13785i(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: v */
    public static void m15779v(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo13791v(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m15740d(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo13781d(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: i */
    public static void m15764i(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (isLoggable(4)) {
            sHandler.mo13786i(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: v */
    public static void m15780v(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo13792v(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m15746d(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo13781d(str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m15770i(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo13786i(str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m15786v(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo13792v(str, str2, th);
        }
    }

    /* renamed from: d */
    public static void m15738d(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo13781d(getTag(cls), str, th);
        }
    }

    /* renamed from: i */
    public static void m15762i(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo13786i(getTag(cls), str, th);
        }
    }

    /* renamed from: v */
    public static void m15778v(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo13792v(getTag(cls), str, th);
        }
    }
}
