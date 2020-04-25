package com.google.android.material.theme.p307a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0216r0;
import androidx.appcompat.p011d.C0341d;
import com.google.android.material.C5582R;

/* renamed from: com.google.android.material.theme.a.a */
/* compiled from: MaterialThemeOverlay */
public class C7109a {

    /* renamed from: a */
    private static final int[] f20172a = {16842752, C5582R.attr.theme};

    /* renamed from: b */
    private static final int[] f20173b = {C5582R.attr.materialThemeOverlay};

    private C7109a() {
    }

    @C0216r0
    /* renamed from: a */
    private static int m34250a(@C0193h0 Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f20172a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @C0193h0
    /* renamed from: b */
    public static Context m34252b(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, @C0188f int i, @C0216r0 int i2) {
        int a = m34251a(context, attributeSet, i, i2);
        boolean z = (context instanceof C0341d) && ((C0341d) context).mo1324a() == a;
        if (a == 0 || z) {
            return context;
        }
        C0341d dVar = new C0341d(context, a);
        int a2 = m34250a(context, attributeSet);
        if (a2 != 0) {
            dVar.getTheme().applyStyle(a2, true);
        }
        return dVar;
    }

    @C0216r0
    /* renamed from: a */
    private static int m34251a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, @C0188f int i, @C0216r0 int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f20173b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
