package com.mrsool.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/* renamed from: com.mrsool.utils.v */
/* compiled from: SessionManager */
public class C5881v {

    /* renamed from: g */
    private static final String f16965g = "mrsool_preferences";

    /* renamed from: h */
    private static final String f16966h = "mrsool_uni_preferences";

    /* renamed from: a */
    private SharedPreferences f16967a;

    /* renamed from: b */
    private SharedPreferences f16968b;

    /* renamed from: c */
    private Editor f16969c;

    /* renamed from: d */
    private Editor f16970d;

    /* renamed from: e */
    private Context f16971e;

    /* renamed from: f */
    private int f16972f = 0;

    public C5881v(Context context) {
        this.f16971e = context;
        this.f16967a = this.f16971e.getSharedPreferences(f16965g, this.f16972f);
        this.f16968b = this.f16971e.getSharedPreferences(f16966h, this.f16972f);
        this.f16969c = this.f16967a.edit();
        this.f16970d = this.f16968b.edit();
    }

    /* renamed from: a */
    public void mo23448a(String str, Boolean bool) {
        this.f16969c.putBoolean(str, bool.booleanValue());
        this.f16969c.commit();
    }

    /* renamed from: b */
    public void mo23453b(String str, Boolean bool) {
        this.f16970d.putBoolean(str, bool.booleanValue());
        this.f16970d.commit();
    }

    /* renamed from: c */
    public float mo23456c(String str) {
        return this.f16967a.getFloat(str, 0.0f);
    }

    /* renamed from: d */
    public int mo23457d(String str) {
        return this.f16967a.getInt(str, 0);
    }

    /* renamed from: e */
    public int mo23458e(String str) {
        return this.f16968b.getInt(str, 0);
    }

    /* renamed from: f */
    public String mo23459f(String str) {
        return this.f16967a.getString(str, null);
    }

    /* renamed from: g */
    public String mo23460g(String str) {
        return this.f16968b.getString(str, C11644i.f33191S5);
    }

    /* renamed from: h */
    public String mo23461h(String str) {
        return this.f16968b.getString(str, "");
    }

    /* renamed from: i */
    public void mo23462i(String str) {
        this.f16970d.remove(str);
        this.f16970d.commit();
    }

    /* renamed from: a */
    public boolean mo23450a(String str) {
        return this.f16967a.getBoolean(str, false);
    }

    /* renamed from: b */
    public boolean mo23455b(String str) {
        return this.f16968b.getBoolean(str, false);
    }

    /* renamed from: a */
    public void mo23449a(String str, String str2) {
        Editor editor = this.f16969c;
        if (str2 == null) {
            str2 = null;
        }
        editor.putString(str, str2);
        this.f16969c.commit();
    }

    /* renamed from: b */
    public void mo23454b(String str, String str2) {
        Editor editor = this.f16970d;
        if (str2 == null) {
            str2 = null;
        }
        editor.putString(str, str2);
        this.f16970d.commit();
    }

    /* renamed from: a */
    public void mo23447a(String str, int i) {
        this.f16969c.putInt(str, i);
        this.f16969c.commit();
    }

    /* renamed from: b */
    public void mo23452b(String str, int i) {
        this.f16970d.putInt(str, i);
        this.f16970d.commit();
    }

    /* renamed from: a */
    public void mo23445a() {
        this.f16969c.clear();
        this.f16969c.commit();
    }

    /* renamed from: b */
    public SharedPreferences mo23451b() {
        return this.f16967a;
    }

    /* renamed from: a */
    public void mo23446a(String str, float f) {
        this.f16969c.putFloat(str, f);
        this.f16969c.commit();
    }
}
