package com.google.android.material.p296f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6928p;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.f.c */
/* compiled from: MaterialDialogs */
public class C6846c {
    private C6846c() {
    }

    @C0193h0
    /* renamed from: a */
    public static InsetDrawable m32795a(@C0195i0 Drawable drawable, @C0193h0 Rect rect) {
        InsetDrawable insetDrawable = new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
        return insetDrawable;
    }

    @C0193h0
    /* renamed from: a */
    public static Rect m32794a(@C0193h0 Context context, @C0188f int i, int i2) {
        TypedArray c = C6928p.m33264c(context, null, C5582R.styleable.MaterialAlertDialog, i, i2, new int[0]);
        int dimensionPixelSize = c.getDimensionPixelSize(C5582R.styleable.MaterialAlertDialog_backgroundInsetStart, context.getResources().getDimensionPixelSize(C5582R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = c.getDimensionPixelSize(C5582R.styleable.MaterialAlertDialog_backgroundInsetTop, context.getResources().getDimensionPixelSize(C5582R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = c.getDimensionPixelSize(C5582R.styleable.MaterialAlertDialog_backgroundInsetEnd, context.getResources().getDimensionPixelSize(C5582R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = c.getDimensionPixelSize(C5582R.styleable.MaterialAlertDialog_backgroundInsetBottom, context.getResources().getDimensionPixelSize(C5582R.dimen.mtrl_alert_dialog_background_inset_bottom));
        c.recycle();
        if (VERSION.SDK_INT >= 17 && context.getResources().getConfiguration().getLayoutDirection() == 1) {
            int i3 = dimensionPixelSize3;
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = i3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }
}
