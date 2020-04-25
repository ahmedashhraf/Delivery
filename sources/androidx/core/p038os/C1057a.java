package androidx.core.p038os;

import android.os.Build.VERSION;

/* renamed from: androidx.core.os.a */
/* compiled from: BuildCompat */
public class C1057a {
    private C1057a() {
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m6142a() {
        return VERSION.SDK_INT >= 24;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m6143b() {
        return VERSION.SDK_INT >= 25;
    }

    @Deprecated
    /* renamed from: c */
    public static boolean m6144c() {
        return VERSION.SDK_INT >= 26;
    }

    @Deprecated
    /* renamed from: d */
    public static boolean m6145d() {
        return VERSION.SDK_INT >= 27;
    }

    @Deprecated
    /* renamed from: e */
    public static boolean m6146e() {
        return VERSION.SDK_INT >= 28;
    }

    /* renamed from: f */
    public static boolean m6147f() {
        if (VERSION.CODENAME.length() != 1 || VERSION.CODENAME.charAt(0) < 'Q' || VERSION.CODENAME.charAt(0) > 'Z') {
            return false;
        }
        return true;
    }
}
