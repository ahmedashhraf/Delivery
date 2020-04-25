package com.google.android.material.p302m;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0199k0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0209o;
import com.google.android.material.C5582R;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.m.b */
/* compiled from: MaterialAttributes */
public class C6951b {
    @C0195i0
    /* renamed from: a */
    public static TypedValue m33326a(@C0193h0 Context context, @C0188f int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static int m33329b(@C0193h0 Context context, @C0188f int i, @C0193h0 String str) {
        TypedValue a = m33326a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: a */
    public static int m33325a(@C0193h0 View view, @C0188f int i) {
        return m33329b(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* renamed from: a */
    public static boolean m33327a(@C0193h0 Context context, @C0188f int i, @C0193h0 String str) {
        return m33329b(context, i, str) != 0;
    }

    /* renamed from: a */
    public static boolean m33328a(@C0193h0 Context context, @C0188f int i, boolean z) {
        TypedValue a = m33326a(context, i);
        if (a == null || a.type != 18) {
            return z;
        }
        return a.data != 0;
    }

    @C0199k0
    /* renamed from: a */
    public static int m33323a(@C0193h0 Context context) {
        return m33324a(context, C5582R.attr.minTouchTargetSize, C5582R.dimen.mtrl_min_touch_target_size);
    }

    @C0199k0
    /* renamed from: a */
    public static int m33324a(@C0193h0 Context context, @C0188f int i, @C0209o int i2) {
        float dimension;
        TypedValue a = m33326a(context, i);
        if (a == null || a.type != 5) {
            dimension = context.getResources().getDimension(i2);
        } else {
            dimension = a.getDimension(context.getResources().getDisplayMetrics());
        }
        return (int) dimension;
    }
}
