package com.instabug.featuresrequest.p370c;

import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.core.InstabugCore;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.c.d */
/* compiled from: FeaturesRequestUtils */
public class C9541d {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25236a;

    /* renamed from: a */
    public static boolean m44636a() {
        boolean z;
        boolean[] c = m44638c();
        if (InstabugCore.getFeatureState(Feature.FEATURE_REQUESTS) == State.ENABLED) {
            c[1] = true;
            z = true;
        } else {
            z = false;
            c[2] = true;
        }
        c[3] = true;
        return z;
    }

    /* renamed from: b */
    public static boolean m44637b() {
        boolean[] c = m44638c();
        boolean isFeatureAvailable = InstabugCore.isFeatureAvailable(Feature.FEATURE_REQUESTS);
        c[4] = true;
        return isFeatureAvailable;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m44638c() {
        boolean[] zArr = f25236a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-551045374140947059L, "com/instabug/featuresrequest/utils/FeaturesRequestUtils", 5);
        f25236a = a;
        return a;
    }
}
