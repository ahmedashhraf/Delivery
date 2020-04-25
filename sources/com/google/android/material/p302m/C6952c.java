package com.google.android.material.p302m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0218s0;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.appcompat.widget.C0549t0;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.m.c */
/* compiled from: MaterialResources */
public class C6952c {
    private C6952c() {
    }

    @C0195i0
    /* renamed from: a */
    public static ColorStateList m33332a(@C0193h0 Context context, @C0193h0 TypedArray typedArray, @C0218s0 int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList b = C0242a.m1108b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        if (VERSION.SDK_INT <= 15) {
            int color = typedArray.getColor(i, -1);
            if (color != -1) {
                return ColorStateList.valueOf(color);
            }
        }
        return typedArray.getColorStateList(i);
    }

    @C0195i0
    /* renamed from: b */
    public static Drawable m33334b(@C0193h0 Context context, @C0193h0 TypedArray typedArray, @C0218s0 int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                Drawable c = C0242a.m1109c(context, resourceId);
                if (c != null) {
                    return c;
                }
            }
        }
        return typedArray.getDrawable(i);
    }

    @C0195i0
    /* renamed from: c */
    public static C6953d m33335c(@C0193h0 Context context, @C0193h0 TypedArray typedArray, @C0218s0 int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return new C6953d(context, resourceId);
            }
        }
        return null;
    }

    @C0195i0
    /* renamed from: a */
    public static ColorStateList m33333a(@C0193h0 Context context, @C0193h0 C0549t0 t0Var, @C0218s0 int i) {
        if (t0Var.mo2892j(i)) {
            int g = t0Var.mo2888g(i, 0);
            if (g != 0) {
                ColorStateList b = C0242a.m1108b(context, g);
                if (b != null) {
                    return b;
                }
            }
        }
        if (VERSION.SDK_INT <= 15) {
            int a = t0Var.mo2866a(i, -1);
            if (a != -1) {
                return ColorStateList.valueOf(a);
            }
        }
        return t0Var.mo2868a(i);
    }

    /* renamed from: a */
    public static int m33330a(@C0193h0 Context context, @C0193h0 TypedArray typedArray, @C0218s0 int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @C0218s0
    /* renamed from: a */
    static int m33331a(@C0193h0 TypedArray typedArray, @C0218s0 int i, @C0218s0 int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }
}
