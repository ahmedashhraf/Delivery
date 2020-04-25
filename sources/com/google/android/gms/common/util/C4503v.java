package com.google.android.gms.common.util;

import android.os.Build.VERSION;
import androidx.core.p038os.C1057a;
import com.google.android.gms.common.annotation.C4056a;

@C4056a
@C4476d0
/* renamed from: com.google.android.gms.common.util.v */
public final class C4503v {
    private C4503v() {
    }

    @C4056a
    /* renamed from: a */
    public static boolean m19407a() {
        return true;
    }

    @C4056a
    /* renamed from: b */
    public static boolean m19408b() {
        return true;
    }

    @C4056a
    /* renamed from: c */
    public static boolean m19409c() {
        return true;
    }

    @C4056a
    /* renamed from: d */
    public static boolean m19410d() {
        return true;
    }

    @C4056a
    /* renamed from: e */
    public static boolean m19411e() {
        return true;
    }

    @C4056a
    /* renamed from: f */
    public static boolean m19412f() {
        return VERSION.SDK_INT >= 17;
    }

    @C4056a
    /* renamed from: g */
    public static boolean m19413g() {
        return VERSION.SDK_INT >= 18;
    }

    @C4056a
    /* renamed from: h */
    public static boolean m19414h() {
        return VERSION.SDK_INT >= 19;
    }

    @C4056a
    /* renamed from: i */
    public static boolean m19415i() {
        return VERSION.SDK_INT >= 20;
    }

    @C4056a
    /* renamed from: j */
    public static boolean m19416j() {
        return VERSION.SDK_INT >= 21;
    }

    @C4056a
    /* renamed from: k */
    public static boolean m19417k() {
        return VERSION.SDK_INT >= 22;
    }

    @C4056a
    /* renamed from: l */
    public static boolean m19418l() {
        return VERSION.SDK_INT >= 23;
    }

    @C4056a
    /* renamed from: m */
    public static boolean m19419m() {
        return VERSION.SDK_INT >= 24;
    }

    @C4056a
    /* renamed from: n */
    public static boolean m19420n() {
        return VERSION.SDK_INT >= 26;
    }

    @C4056a
    /* renamed from: o */
    public static boolean m19421o() {
        return VERSION.SDK_INT >= 28;
    }

    @C4056a
    /* renamed from: p */
    public static boolean m19422p() {
        if (C1057a.m6147f() || ((VERSION.CODENAME.equals("REL") && VERSION.SDK_INT >= 29) || (VERSION.CODENAME.length() == 1 && VERSION.CODENAME.charAt(0) >= 'Q' && VERSION.CODENAME.charAt(0) <= 'Z'))) {
            return true;
        }
        return false;
    }
}
