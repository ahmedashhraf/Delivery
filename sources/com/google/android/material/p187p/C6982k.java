package com.google.android.material.p187p;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.C0193h0;
import com.google.android.material.internal.C6936w;

/* renamed from: com.google.android.material.p.k */
/* compiled from: MaterialShapeUtils */
public class C6982k {
    private C6982k() {
    }

    @C0193h0
    /* renamed from: a */
    static C6972e m33512a(int i) {
        if (i == 0) {
            return new C6985n();
        }
        if (i != 1) {
            return m33511a();
        }
        return new C6973f();
    }

    @C0193h0
    /* renamed from: b */
    static C6974g m33516b() {
        return new C6974g();
    }

    @C0193h0
    /* renamed from: a */
    static C6972e m33511a() {
        return new C6985n();
    }

    /* renamed from: a */
    public static void m33514a(@C0193h0 View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C6978j) {
            ((C6978j) background).mo27799b(f);
        }
    }

    /* renamed from: a */
    public static void m33513a(@C0193h0 View view) {
        Drawable background = view.getBackground();
        if (background instanceof C6978j) {
            m33515a(view, (C6978j) background);
        }
    }

    /* renamed from: a */
    public static void m33515a(@C0193h0 View view, @C0193h0 C6978j jVar) {
        if (jVar.mo27779A()) {
            jVar.mo27809d(C6936w.m33300d(view));
        }
    }
}
