package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.annotation.C4056a;

@C4056a
/* renamed from: com.google.android.gms.common.util.l */
public final class C4493l {

    /* renamed from: a */
    private static Boolean f13740a;

    /* renamed from: b */
    private static Boolean f13741b;

    /* renamed from: c */
    private static Boolean f13742c;

    /* renamed from: d */
    private static Boolean f13743d;

    /* renamed from: e */
    private static Boolean f13744e;

    /* renamed from: f */
    private static Boolean f13745f;

    /* renamed from: g */
    private static Boolean f13746g;

    /* renamed from: h */
    private static Boolean f13747h;

    private C4493l() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (f13741b.booleanValue() != false) goto L_0x003e;
     */
    @com.google.android.gms.common.annotation.C4056a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m19377a(android.content.res.Resources r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Boolean r1 = f13740a
            if (r1 != 0) goto L_0x0045
            android.content.res.Configuration r1 = r4.getConfiguration()
            int r1 = r1.screenLayout
            r1 = r1 & 15
            r2 = 3
            r3 = 1
            if (r1 <= r2) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            if (r1 != 0) goto L_0x003e
            java.lang.Boolean r1 = f13741b
            if (r1 != 0) goto L_0x0036
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r1 = r4.screenLayout
            r1 = r1 & 15
            if (r1 > r2) goto L_0x002f
            int r4 = r4.smallestScreenWidthDp
            r1 = 600(0x258, float:8.41E-43)
            if (r4 < r1) goto L_0x002f
            r4 = 1
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            f13741b = r4
        L_0x0036:
            java.lang.Boolean r4 = f13741b
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r0 = 1
        L_0x003f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            f13740a = r4
        L_0x0045:
            java.lang.Boolean r4 = f13740a
            boolean r4 = r4.booleanValue()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.C4493l.m19377a(android.content.res.Resources):boolean");
    }

    @C4056a
    /* renamed from: b */
    public static boolean m19378b(Context context) {
        if (f13744e == null) {
            PackageManager packageManager = context.getPackageManager();
            f13744e = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return f13744e.booleanValue();
    }

    @C4056a
    @TargetApi(21)
    /* renamed from: c */
    public static boolean m19379c(Context context) {
        if (f13743d == null) {
            f13743d = Boolean.valueOf(C4503v.m19416j() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f13743d.booleanValue();
    }

    @C4056a
    /* renamed from: d */
    public static boolean m19380d(Context context) {
        if (f13747h == null) {
            PackageManager packageManager = context.getPackageManager();
            f13747h = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
        }
        return f13747h.booleanValue();
    }

    @C4056a
    @TargetApi(20)
    /* renamed from: e */
    public static boolean m19381e(Context context) {
        if (f13742c == null) {
            f13742c = Boolean.valueOf(C4503v.m19415i() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f13742c.booleanValue();
    }

    @C4056a
    @TargetApi(26)
    /* renamed from: f */
    public static boolean m19382f(Context context) {
        return m19381e(context) && (!C4503v.m19419m() || (m19379c(context) && !C4503v.m19420n()));
    }

    /* renamed from: g */
    public static boolean m19383g(Context context) {
        if (f13745f == null) {
            f13745f = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f13745f.booleanValue();
    }

    @C4056a
    /* renamed from: a */
    public static boolean m19376a(Context context) {
        if (f13746g == null) {
            f13746g = Boolean.valueOf(C4503v.m19420n() && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"));
        }
        return f13746g.booleanValue();
    }

    @C4056a
    /* renamed from: a */
    public static boolean m19375a() {
        return "user".equals(Build.TYPE);
    }
}
