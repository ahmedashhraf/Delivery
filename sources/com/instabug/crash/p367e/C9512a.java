package com.instabug.crash.p367e;

import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.core.InstabugCore;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.crash.e.a */
/* compiled from: CrashReportingUtility */
public class C9512a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25174a;

    /* renamed from: a */
    public static boolean m44530a() {
        boolean z;
        boolean[] b = m44531b();
        if (InstabugCore.getFeatureState(Feature.CRASH_REPORTING) == State.ENABLED) {
            b[1] = true;
            z = true;
        } else {
            z = false;
            b[2] = true;
        }
        b[3] = true;
        return z;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m44531b() {
        boolean[] zArr = f25174a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7862470939953024369L, "com/instabug/crash/utils/CrashReportingUtility", 4);
        f25174a = a;
        return a;
    }
}
