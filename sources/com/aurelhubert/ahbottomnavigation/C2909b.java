package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0198k;
import androidx.annotation.C0202m;
import androidx.annotation.C0213q;
import androidx.annotation.C0214q0;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.core.content.C0841b;

/* renamed from: com.aurelhubert.ahbottomnavigation.b */
/* compiled from: AHBottomNavigationItem */
public class C2909b {

    /* renamed from: a */
    private String f10339a = "";

    /* renamed from: b */
    private Drawable f10340b;

    /* renamed from: c */
    private int f10341c = -7829368;
    @C0214q0

    /* renamed from: d */
    private int f10342d = 0;
    @C0213q

    /* renamed from: e */
    private int f10343e = 0;
    @C0202m

    /* renamed from: f */
    private int f10344f = 0;

    public C2909b(String str, @C0213q int i) {
        this.f10339a = str;
        this.f10343e = i;
    }

    /* renamed from: a */
    public void mo11583a(String str) {
        this.f10339a = str;
        this.f10342d = 0;
    }

    /* renamed from: b */
    public void mo11585b(@C0202m int i) {
        this.f10344f = i;
        this.f10341c = 0;
    }

    /* renamed from: c */
    public String mo11586c(Context context) {
        int i = this.f10342d;
        if (i != 0) {
            return context.getString(i);
        }
        return this.f10339a;
    }

    /* renamed from: d */
    public void mo11588d(@C0214q0 int i) {
        this.f10342d = i;
        this.f10339a = "";
    }

    /* renamed from: a */
    public int mo11580a(Context context) {
        int i = this.f10344f;
        if (i != 0) {
            return C0841b.m4915a(context, i);
        }
        return this.f10341c;
    }

    /* renamed from: b */
    public Drawable mo11584b(Context context) {
        int i = this.f10343e;
        if (i == 0) {
            return this.f10340b;
        }
        try {
            return C0242a.m1109c(context, i);
        } catch (NotFoundException unused) {
            return C0841b.m4928c(context, this.f10343e);
        }
    }

    /* renamed from: c */
    public void mo11587c(@C0213q int i) {
        this.f10343e = i;
        this.f10340b = null;
    }

    /* renamed from: a */
    public void mo11581a(@C0198k int i) {
        this.f10341c = i;
        this.f10344f = 0;
    }

    /* renamed from: a */
    public void mo11582a(Drawable drawable) {
        this.f10340b = drawable;
        this.f10343e = 0;
    }

    @Deprecated
    public C2909b(String str, @C0213q int i, @C0202m int i2) {
        this.f10339a = str;
        this.f10343e = i;
        this.f10341c = i2;
    }

    public C2909b(@C0214q0 int i, @C0213q int i2, @C0202m int i3) {
        this.f10342d = i;
        this.f10343e = i2;
        this.f10344f = i3;
    }

    public C2909b(String str, Drawable drawable) {
        this.f10339a = str;
        this.f10340b = drawable;
    }

    public C2909b(String str, Drawable drawable, @C0198k int i) {
        this.f10339a = str;
        this.f10340b = drawable;
        this.f10341c = i;
    }
}
