package com.futuremind.recyclerviewfastscroll;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: com.futuremind.recyclerviewfastscroll.d */
/* compiled from: Utils */
public class C3882d {
    /* renamed from: a */
    public static float m16957a(View view) {
        int[] iArr = {(int) view.getX(), 0};
        ((View) view.getParent()).getLocationInWindow(iArr);
        return (float) iArr[0];
    }

    /* renamed from: b */
    public static float m16959b(View view) {
        int[] iArr = {0, (int) view.getY()};
        ((View) view.getParent()).getLocationInWindow(iArr);
        return (float) iArr[1];
    }

    /* renamed from: a */
    public static float m16956a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f3), f2);
    }

    /* renamed from: a */
    public static void m16958a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }
}
