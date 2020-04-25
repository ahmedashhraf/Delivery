package com.google.android.material.p301l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.appcompat.widget.C0542q;
import androidx.core.widget.C1108c;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6928p;
import com.google.android.material.p185e.C5713a;
import com.google.android.material.theme.p307a.C7109a;

/* renamed from: com.google.android.material.l.a */
/* compiled from: MaterialRadioButton */
public class C6948a extends C0542q {

    /* renamed from: Q */
    private static final int f19433Q = C5582R.style.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: R */
    private static final int[][] f19434R = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @C0195i0

    /* renamed from: O */
    private ColorStateList f19435O;

    /* renamed from: P */
    private boolean f19436P;

    public C6948a(@C0193h0 Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f19435O == null) {
            int a = C5713a.m25190a((View) this, C5582R.attr.colorControlActivated);
            int a2 = C5713a.m25190a((View) this, C5582R.attr.colorOnSurface);
            int a3 = C5713a.m25190a((View) this, C5582R.attr.colorSurface);
            int[] iArr = new int[f19434R.length];
            iArr[0] = C5713a.m25187a(a3, a, 1.0f);
            iArr[1] = C5713a.m25187a(a3, a2, 0.54f);
            iArr[2] = C5713a.m25187a(a3, a2, 0.38f);
            iArr[3] = C5713a.m25187a(a3, a2, 0.38f);
            this.f19435O = new ColorStateList(f19434R, iArr);
        }
        return this.f19435O;
    }

    /* renamed from: a */
    public boolean mo27687a() {
        return this.f19436P;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19436P && C1108c.m6319b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f19436P = z;
        if (z) {
            C1108c.m6317a((CompoundButton) this, getMaterialThemeColorsTintList());
        } else {
            C1108c.m6317a((CompoundButton) this, (ColorStateList) null);
        }
    }

    public C6948a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.radioButtonStyle);
    }

    public C6948a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(C7109a.m34252b(context, attributeSet, i, f19433Q), attributeSet, i);
        TypedArray c = C6928p.m33264c(getContext(), attributeSet, C5582R.styleable.MaterialRadioButton, i, f19433Q, new int[0]);
        this.f19436P = c.getBoolean(C5582R.styleable.MaterialRadioButton_useMaterialThemeColors, false);
        c.recycle();
    }
}
