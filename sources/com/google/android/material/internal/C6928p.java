package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0216r0;
import androidx.annotation.C0218s0;
import androidx.appcompat.widget.C0549t0;
import com.google.android.material.C5582R;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.p */
/* compiled from: ThemeEnforcement */
public final class C6928p {

    /* renamed from: a */
    private static final int[] f19393a = {C5582R.attr.colorPrimary};

    /* renamed from: b */
    private static final String f19394b = "Theme.AppCompat";

    /* renamed from: c */
    private static final int[] f19395c = {C5582R.attr.colorPrimaryVariant};

    /* renamed from: d */
    private static final String f19396d = "Theme.MaterialComponents";

    private C6928p() {
    }

    /* renamed from: a */
    private static void m33258a(@C0193h0 Context context, AttributeSet attributeSet, @C0188f int i, @C0216r0 int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5582R.styleable.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C5582R.styleable.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C5582R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m33262b(context);
            }
        }
        m33257a(context);
    }

    /* renamed from: b */
    private static boolean m33263b(@C0193h0 Context context, AttributeSet attributeSet, @C0193h0 @C0218s0 int[] iArr, @C0188f int i, @C0216r0 int i2, @C0193h0 @C0218s0 int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    @C0193h0
    /* renamed from: c */
    public static TypedArray m33264c(@C0193h0 Context context, AttributeSet attributeSet, @C0193h0 @C0218s0 int[] iArr, @C0188f int i, @C0216r0 int i2, @C0218s0 int... iArr2) {
        m33258a(context, attributeSet, i, i2);
        m33259a(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: d */
    public static C0549t0 m33266d(@C0193h0 Context context, AttributeSet attributeSet, @C0193h0 @C0218s0 int[] iArr, @C0188f int i, @C0216r0 int i2, @C0218s0 int... iArr2) {
        m33258a(context, attributeSet, i, i2);
        m33259a(context, attributeSet, iArr, i, i2, iArr2);
        return C0549t0.m2910a(context, attributeSet, iArr, i, i2);
    }

    /* renamed from: c */
    public static boolean m33265c(@C0193h0 Context context) {
        return m33261a(context, f19393a);
    }

    /* renamed from: d */
    public static boolean m33267d(@C0193h0 Context context) {
        return m33261a(context, f19395c);
    }

    /* renamed from: b */
    public static void m33262b(@C0193h0 Context context) {
        m33260a(context, f19395c, f19396d);
    }

    /* renamed from: a */
    private static void m33259a(@C0193h0 Context context, AttributeSet attributeSet, @C0193h0 @C0218s0 int[] iArr, @C0188f int i, @C0216r0 int i2, @C0218s0 @C0195i0 int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5582R.styleable.ThemeEnforcement, i, i2);
        if (!obtainStyledAttributes.getBoolean(C5582R.styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        boolean z = (iArr2 == null || iArr2.length == 0) ? obtainStyledAttributes.getResourceId(C5582R.styleable.ThemeEnforcement_android_textAppearance, -1) != -1 : m33263b(context, attributeSet, iArr, i, i2, iArr2);
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: a */
    public static void m33257a(@C0193h0 Context context) {
        m33260a(context, f19393a, f19394b);
    }

    /* renamed from: a */
    private static boolean m33261a(@C0193h0 Context context, @C0193h0 int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: a */
    private static void m33260a(@C0193h0 Context context, @C0193h0 int[] iArr, String str) {
        if (!m33261a(context, iArr)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The style on this component requires your app theme to be ");
            sb.append(str);
            sb.append(" (or a descendant).");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
