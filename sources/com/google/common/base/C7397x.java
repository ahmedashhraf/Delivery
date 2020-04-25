package com.google.common.base;

import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.base.x */
/* compiled from: Preconditions */
public final class C7397x {
    private C7397x() {
    }

    /* renamed from: a */
    public static void m35670a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m35676b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: c */
    public static int m35679c(int i, int i2, @C5952h String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m35668a(i, i2, str));
    }

    /* renamed from: d */
    public static int m35680d(int i, int i2, @C5952h String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m35674b(i, i2, str));
    }

    /* renamed from: a */
    public static void m35671a(boolean z, @C5952h Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m35677b(boolean z, @C5952h Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m35672a(boolean z, @C5952h String str, @C5952h Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(m35669a(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m35678b(boolean z, @C5952h String str, @C5952h Object... objArr) {
        if (!z) {
            throw new IllegalStateException(m35669a(str, objArr));
        }
    }

    /* renamed from: a */
    public static <T> T m35664a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public static int m35673b(int i, int i2) {
        return m35680d(i, i2, C5854b.f16918Y);
    }

    /* renamed from: a */
    public static <T> T m35665a(T t, @C5952h Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: b */
    private static String m35674b(int i, int i2, String str) {
        if (i < 0) {
            return m35669a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m35669a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static <T> T m35666a(T t, @C5952h String str, @C5952h Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(m35669a(str, objArr));
    }

    /* renamed from: a */
    public static int m35663a(int i, int i2) {
        return m35679c(i, i2, C5854b.f16918Y);
    }

    /* renamed from: a */
    private static String m35668a(int i, int i2, String str) {
        if (i < 0) {
            return m35669a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m35669a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public static void m35675b(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m35667a(i, i2, i3));
        }
    }

    /* renamed from: a */
    private static String m35667a(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m35674b(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return m35674b(i2, i3, "end index");
        }
        return m35669a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: a */
    static String m35669a(String str, @C5952h Object... objArr) {
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            sb.append(valueOf.substring(i2, indexOf));
            int i3 = i + 1;
            sb.append(objArr[i]);
            int i4 = i3;
            i2 = indexOf + 2;
            i = i4;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            int i5 = i + 1;
            sb.append(objArr[i]);
            while (i5 < objArr.length) {
                sb.append(", ");
                int i6 = i5 + 1;
                sb.append(objArr[i5]);
                i5 = i6;
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
