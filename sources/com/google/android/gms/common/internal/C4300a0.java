package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.util.C4489i0;

@C4056a
/* renamed from: com.google.android.gms.common.internal.a0 */
public final class C4300a0 {
    private C4300a0() {
        throw new AssertionError("Uninstantiable");
    }

    @C0193h0
    @C4056a
    /* renamed from: a */
    public static <T> T m18620a(@C0195i0 T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    @C4056a
    /* renamed from: b */
    public static String m18630b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @C4056a
    /* renamed from: c */
    public static void m18634c(String str) {
        if (C4489i0.m19366a()) {
            throw new IllegalStateException(str);
        }
    }

    @C4056a
    /* renamed from: a */
    public static String m18622a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @C4056a
    /* renamed from: b */
    public static void m18631b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @C0193h0
    @C4056a
    /* renamed from: a */
    public static <T> T m18621a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @C4056a
    /* renamed from: b */
    public static void m18632b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @C4056a
    /* renamed from: a */
    public static int m18617a(int i, Object obj) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @C4056a
    /* renamed from: b */
    public static void m18633b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    @C4056a
    /* renamed from: a */
    public static int m18616a(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @C4056a
    /* renamed from: a */
    public static long m18619a(long j, Object obj) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @C4056a
    /* renamed from: a */
    public static long m18618a(long j) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @C4056a
    /* renamed from: a */
    public static void m18628a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @C4056a
    /* renamed from: a */
    public static void m18629a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @C4056a
    /* renamed from: a */
    public static void m18627a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @C4056a
    /* renamed from: a */
    public static void m18626a(String str) {
        if (!C4489i0.m19366a()) {
            throw new IllegalStateException(str);
        }
    }

    @C4056a
    /* renamed from: a */
    public static void m18623a() {
        m18634c("Must not be called on the main application thread");
    }

    @C4056a
    /* renamed from: a */
    public static void m18624a(Handler handler) {
        m18625a(handler, "Must be called on the handler thread");
    }

    @C4056a
    /* renamed from: a */
    public static void m18625a(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }
}
