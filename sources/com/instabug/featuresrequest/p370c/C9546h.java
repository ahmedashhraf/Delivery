package com.instabug.featuresrequest.p370c;

import com.instabug.library.util.StringUtility;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.c.h */
/* compiled from: StringsUtils */
public class C9546h {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25242a;

    /* renamed from: a */
    public static String m44647a(String str) {
        boolean[] a = m44648a();
        String trimString = StringUtility.trimString(str, 20);
        a[1] = true;
        return trimString;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44648a() {
        boolean[] zArr = f25242a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3789827505891343627L, "com/instabug/featuresrequest/utils/StringsUtils", 2);
        f25242a = a;
        return a;
    }
}
