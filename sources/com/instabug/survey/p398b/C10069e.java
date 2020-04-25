package com.instabug.survey.p398b;

import androidx.annotation.C0216r0;
import com.instabug.library.InstabugColorTheme;
import com.instabug.survey.C10049R;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.b.e */
/* compiled from: SurveyThemeResolver */
public class C10069e {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26798a;

    @C0216r0
    /* renamed from: a */
    public static int m46835a(InstabugColorTheme instabugColorTheme) {
        boolean[] a = m46836a();
        if (instabugColorTheme == InstabugColorTheme.InstabugColorThemeLight) {
            int i = C10049R.style.InstabugSurveyLight;
            a[1] = true;
            return i;
        }
        int i2 = C10049R.style.InstabugSurveyDark;
        a[2] = true;
        return i2;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46836a() {
        boolean[] zArr = f26798a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4967943806204785493L, "com/instabug/survey/utils/SurveyThemeResolver", 3);
        f26798a = a;
        return a;
    }
}
