package com.instabug.crash.p366d;

import android.content.Context;
import android.content.SharedPreferences;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.crash.d.c */
/* compiled from: PersistableSettings */
public class C9511c {

    /* renamed from: b */
    private static C9511c f25171b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f25172c;

    /* renamed from: a */
    private SharedPreferences f25173a;

    private C9511c(Context context) {
        boolean[] c = m44527c();
        c[0] = true;
        this.f25173a = context.getSharedPreferences("instabug_crash", 0);
        c[1] = true;
    }

    /* renamed from: a */
    public static void m44525a(Context context) {
        boolean[] c = m44527c();
        f25171b = new C9511c(context);
        c[2] = true;
    }

    /* renamed from: b */
    public static C9511c m44526b() {
        boolean[] c = m44527c();
        C9511c cVar = f25171b;
        c[3] = true;
        return cVar;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m44527c() {
        boolean[] zArr = f25172c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3219740969705726772L, "com/instabug/crash/settings/PersistableSettings", 6);
        f25172c = a;
        return a;
    }

    /* renamed from: a */
    public void mo34173a(long j) {
        boolean[] c = m44527c();
        this.f25173a.edit().putLong("last_crash_time", j).apply();
        c[4] = true;
    }

    /* renamed from: a */
    public long mo34172a() {
        boolean[] c = m44527c();
        long j = this.f25173a.getLong("last_crash_time", 0);
        c[5] = true;
        return j;
    }
}
