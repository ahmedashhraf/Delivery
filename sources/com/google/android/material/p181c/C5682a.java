package com.google.android.material.p181c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.C0195i0;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.C1108c;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6928p;
import com.google.android.material.p185e.C5713a;
import com.google.android.material.p302m.C6952c;
import com.google.android.material.theme.p307a.C7109a;

/* renamed from: com.google.android.material.c.a */
/* compiled from: MaterialCheckBox */
public class C5682a extends AppCompatCheckBox {

    /* renamed from: Q */
    private static final int f16393Q = C5582R.style.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: R */
    private static final int[][] f16394R = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @C0195i0

    /* renamed from: O */
    private ColorStateList f16395O;

    /* renamed from: P */
    private boolean f16396P;

    public C5682a(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f16395O == null) {
            int[] iArr = new int[f16394R.length];
            int a = C5713a.m25190a((View) this, C5582R.attr.colorControlActivated);
            int a2 = C5713a.m25190a((View) this, C5582R.attr.colorSurface);
            int a3 = C5713a.m25190a((View) this, C5582R.attr.colorOnSurface);
            iArr[0] = C5713a.m25187a(a2, a, 1.0f);
            iArr[1] = C5713a.m25187a(a2, a3, 0.54f);
            iArr[2] = C5713a.m25187a(a2, a3, 0.38f);
            iArr[3] = C5713a.m25187a(a2, a3, 0.38f);
            this.f16395O = new ColorStateList(f16394R, iArr);
        }
        return this.f16395O;
    }

    /* renamed from: b */
    public boolean mo22601b() {
        return this.f16396P;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f16396P && C1108c.m6319b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f16396P = z;
        if (z) {
            C1108c.m6317a((CompoundButton) this, getMaterialThemeColorsTintList());
        } else {
            C1108c.m6317a((CompoundButton) this, (ColorStateList) null);
        }
    }

    public C5682a(Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.checkboxStyle);
    }

    public C5682a(Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(C7109a.m34252b(context, attributeSet, i, f16393Q), attributeSet, i);
        Context context2 = getContext();
        TypedArray c = C6928p.m33264c(context2, attributeSet, C5582R.styleable.MaterialCheckBox, i, f16393Q, new int[0]);
        if (c.hasValue(C5582R.styleable.MaterialCheckBox_buttonTint)) {
            C1108c.m6317a((CompoundButton) this, C6952c.m33332a(context2, c, C5582R.styleable.MaterialCheckBox_buttonTint));
        }
        this.f16396P = c.getBoolean(C5582R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
        c.recycle();
    }
}
