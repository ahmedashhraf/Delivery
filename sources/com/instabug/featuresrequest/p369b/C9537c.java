package com.instabug.featuresrequest.p369b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.b.c */
/* compiled from: PersistableSettings */
public class C9537c {

    /* renamed from: c */
    private static C9537c f25229c;

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f25230d;

    /* renamed from: a */
    private SharedPreferences f25231a;

    /* renamed from: b */
    private Editor f25232b = this.f25231a.edit();

    private C9537c(Context context) {
        boolean[] c = m44627c();
        c[0] = true;
        this.f25231a = context.getSharedPreferences("instabug_feature_requests", 0);
        c[1] = true;
        c[2] = true;
    }

    /* renamed from: a */
    public static void m44625a(Context context) {
        boolean[] c = m44627c();
        f25229c = new C9537c(context);
        c[3] = true;
    }

    /* renamed from: b */
    public static C9537c m44626b() {
        boolean[] c = m44627c();
        C9537c cVar = f25229c;
        c[5] = true;
        return cVar;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m44627c() {
        boolean[] zArr = f25230d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5179288499745398324L, "com/instabug/featuresrequest/settings/PersistableSettings", 9);
        f25230d = a;
        return a;
    }

    /* renamed from: a */
    public void mo34228a(int i) {
        boolean[] c = m44627c();
        this.f25232b.putInt("last_sort_by_action", i);
        c[6] = true;
        this.f25232b.apply();
        c[7] = true;
    }

    /* renamed from: a */
    public int mo34227a() {
        boolean[] c = m44627c();
        int i = this.f25231a.getInt("last_sort_by_action", 0);
        c[8] = true;
        return i;
    }
}
