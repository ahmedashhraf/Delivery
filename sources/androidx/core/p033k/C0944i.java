package androidx.core.p033k;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0237z;
import java.util.Locale;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.k.i */
/* compiled from: Preconditions */
public final class C0944i {
    private C0944i() {
    }

    /* renamed from: a */
    public static void m5339a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m5342b(boolean z) {
        m5341a(z, (String) null);
    }

    /* renamed from: a */
    public static void m5340a(boolean z, @C0193h0 Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @C0193h0
    /* renamed from: a */
    public static <T> T m5337a(@C0195i0 T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    @C0193h0
    /* renamed from: a */
    public static <T> T m5338a(@C0195i0 T t, @C0193h0 Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static void m5341a(boolean z, @C0195i0 String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    @C0237z(from = 0)
    /* renamed from: a */
    public static int m5336a(int i, @C0195i0 String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    @C0237z(from = 0)
    /* renamed from: a */
    public static int m5334a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static int m5335a(int i, int i2, int i3, @C0193h0 String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        } else if (i <= i3) {
            return i;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }
}
