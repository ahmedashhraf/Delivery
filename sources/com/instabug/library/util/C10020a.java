package com.instabug.library.util;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import java.util.Locale;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.util.a */
/* compiled from: LocaleHelper */
public class C10020a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26667a;

    public C10020a() {
        m46630a()[0] = true;
    }

    /* renamed from: a */
    public static boolean m46628a(@C0193h0 Context context) {
        boolean[] a = m46630a();
        if (VERSION.SDK_INT < 17) {
            a[1] = true;
        } else if (context == null) {
            a[2] = true;
        } else {
            a[3] = true;
            Configuration configuration = context.getResources().getConfiguration();
            a[4] = true;
            if (configuration.getLayoutDirection() == 1) {
                a[5] = true;
                return true;
            }
            a[6] = true;
            return false;
        }
        boolean a2 = m46629a(Locale.getDefault());
        a[7] = true;
        return a2;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46630a() {
        boolean[] zArr = f26667a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(571133495035209167L, "com/instabug/library/util/LocaleHelper", 13);
        f26667a = a;
        return a;
    }

    /* renamed from: a */
    public static boolean m46629a(Locale locale) {
        boolean[] a = m46630a();
        boolean z = false;
        byte directionality = Character.getDirectionality(locale.getDisplayName().charAt(0));
        if (directionality == 1) {
            a[8] = true;
        } else if (directionality == 2) {
            a[9] = true;
        } else {
            a[11] = true;
            a[12] = true;
            return z;
        }
        a[10] = true;
        z = true;
        a[12] = true;
        return z;
    }
}
