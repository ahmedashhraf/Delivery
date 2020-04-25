package p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b;

import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2716b;
import p201f.p202a.C5952h;

@C2716b
/* renamed from: c.d.b.a.e.a.a.a.b.k */
/* compiled from: Preconditions */
public final class C6329k {
    private C6329k() {
    }

    /* renamed from: a */
    public static void m29440a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m29446b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: c */
    public static int m29449c(int i, int i2, @C5952h String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m29438a(i, i2, str));
    }

    /* renamed from: d */
    public static int m29450d(int i, int i2, @C5952h String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m29444b(i, i2, str));
    }

    /* renamed from: a */
    public static void m29441a(boolean z, @C5952h Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m29447b(boolean z, @C5952h Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m29442a(boolean z, @C5952h String str, @C5952h Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(m29439a(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m29448b(boolean z, @C5952h String str, @C5952h Object... objArr) {
        if (!z) {
            throw new IllegalStateException(m29439a(str, objArr));
        }
    }

    /* renamed from: a */
    public static <T> T m29434a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public static int m29443b(int i, int i2) {
        return m29450d(i, i2, C5854b.f16918Y);
    }

    /* renamed from: a */
    public static <T> T m29435a(T t, @C5952h Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: b */
    private static String m29444b(int i, int i2, String str) {
        if (i < 0) {
            return m29439a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m29439a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static <T> T m29436a(T t, @C5952h String str, @C5952h Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(m29439a(str, objArr));
    }

    /* renamed from: a */
    public static int m29433a(int i, int i2) {
        return m29449c(i, i2, C5854b.f16918Y);
    }

    /* renamed from: a */
    private static String m29438a(int i, int i2, String str) {
        if (i < 0) {
            return m29439a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m29439a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public static void m29445b(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m29437a(i, i2, i3));
        }
    }

    /* renamed from: a */
    private static String m29437a(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m29444b(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return m29444b(i2, i3, "end index");
        }
        return m29439a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: a */
    static String m29439a(String str, @C5952h Object... objArr) {
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
