package com.instabug.featuresrequest.p370c;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.c.b */
/* compiled from: DrawableUtils */
public class C9539b {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25234a;

    /* renamed from: a */
    public static void m44632a(View view, int i) {
        boolean[] a = m44633a();
        if (view == null) {
            a[1] = true;
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof ShapeDrawable) {
            a[2] = true;
            ((ShapeDrawable) background).getPaint().setColor(i);
            a[3] = true;
        } else if (background instanceof GradientDrawable) {
            a[4] = true;
            ((GradientDrawable) background).setColor(i);
            a[5] = true;
        } else if (!(background instanceof ColorDrawable)) {
            a[6] = true;
        } else {
            a[7] = true;
            ((ColorDrawable) background).setColor(i);
            a[8] = true;
        }
        a[9] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44633a() {
        boolean[] zArr = f25234a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7739701742476166266L, "com/instabug/featuresrequest/utils/DrawableUtils", 10);
        f25234a = a;
        return a;
    }
}
