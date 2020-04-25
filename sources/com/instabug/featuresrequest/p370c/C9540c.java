package com.instabug.featuresrequest.p370c;

import androidx.annotation.C0216r0;
import com.instabug.featuresrequest.C9525R;
import com.instabug.library.InstabugColorTheme;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.c.c */
/* compiled from: FeatureRequestThemeResolver */
public class C9540c {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25235a;

    @C0216r0
    /* renamed from: a */
    public static int m44634a(InstabugColorTheme instabugColorTheme) {
        boolean[] a = m44635a();
        if (instabugColorTheme == InstabugColorTheme.InstabugColorThemeLight) {
            int i = C9525R.style.IbFrLight;
            a[1] = true;
            return i;
        }
        int i2 = C9525R.style.IbFrDark;
        a[2] = true;
        return i2;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44635a() {
        boolean[] zArr = f25235a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7919275254990957508L, "com/instabug/featuresrequest/utils/FeatureRequestThemeResolver", 3);
        f25235a = a;
        return a;
    }
}
