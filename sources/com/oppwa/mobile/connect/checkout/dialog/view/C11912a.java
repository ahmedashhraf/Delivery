package com.oppwa.mobile.connect.checkout.dialog.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.view.a */
class C11912a {
    /* renamed from: a */
    static Typeface m53570a(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        Typeface a = C11913b.m53571a(context, obtainStyledAttributes.getString(i));
        obtainStyledAttributes.recycle();
        return a;
    }
}
