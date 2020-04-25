package com.instabug.survey.p398b;

import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.b.a */
/* compiled from: DateUtils */
public class C10065a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26794a;

    /* renamed from: a */
    public static int m46825a(long j) {
        int currentTimeMillis = (int) ((System.currentTimeMillis() - j) / 86400000);
        m46826a()[1] = true;
        return currentTimeMillis;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46826a() {
        boolean[] zArr = f26794a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3076497056494799538L, "com/instabug/survey/utils/DateUtils", 2);
        f26794a = a;
        return a;
    }
}
