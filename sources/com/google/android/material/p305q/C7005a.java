package com.google.android.material.p305q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6928p;
import com.google.android.material.internal.C6936w;
import com.google.android.material.p185e.C5713a;
import com.google.android.material.p298h.C6883a;
import com.google.android.material.theme.p307a.C7109a;

/* renamed from: com.google.android.material.q.a */
/* compiled from: SwitchMaterial */
public class C7005a extends SwitchCompat {

    /* renamed from: P0 */
    private static final int f19672P0 = C5582R.style.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: Q0 */
    private static final int[][] f19673Q0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @C0193h0

    /* renamed from: L0 */
    private final C6883a f19674L0;
    @C0195i0

    /* renamed from: M0 */
    private ColorStateList f19675M0;
    @C0195i0

    /* renamed from: N0 */
    private ColorStateList f19676N0;

    /* renamed from: O0 */
    private boolean f19677O0;

    public C7005a(@C0193h0 Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f19675M0 == null) {
            int a = C5713a.m25190a((View) this, C5582R.attr.colorSurface);
            int a2 = C5713a.m25190a((View) this, C5582R.attr.colorControlActivated);
            float dimension = getResources().getDimension(C5582R.dimen.mtrl_switch_thumb_elevation);
            if (this.f19674L0.mo27486c()) {
                dimension += C6936w.m33300d(this);
            }
            int b = this.f19674L0.mo27483b(a, dimension);
            int[] iArr = new int[f19673Q0.length];
            iArr[0] = C5713a.m25187a(a, a2, 1.0f);
            iArr[1] = b;
            iArr[2] = C5713a.m25187a(a, a2, 0.38f);
            iArr[3] = b;
            this.f19675M0 = new ColorStateList(f19673Q0, iArr);
        }
        return this.f19675M0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f19676N0 == null) {
            int[] iArr = new int[f19673Q0.length];
            int a = C5713a.m25190a((View) this, C5582R.attr.colorSurface);
            int a2 = C5713a.m25190a((View) this, C5582R.attr.colorControlActivated);
            int a3 = C5713a.m25190a((View) this, C5582R.attr.colorOnSurface);
            iArr[0] = C5713a.m25187a(a, a2, 0.54f);
            iArr[1] = C5713a.m25187a(a, a3, 0.32f);
            iArr[2] = C5713a.m25187a(a, a2, 0.12f);
            iArr[3] = C5713a.m25187a(a, a3, 0.12f);
            this.f19676N0 = new ColorStateList(f19673Q0, iArr);
        }
        return this.f19676N0;
    }

    /* renamed from: a */
    public boolean mo27932a() {
        return this.f19677O0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19677O0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f19677O0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f19677O0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList(null);
        setTrackTintList(null);
    }

    public C7005a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.switchStyle);
    }

    public C7005a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(C7109a.m34252b(context, attributeSet, i, f19672P0), attributeSet, i);
        Context context2 = getContext();
        this.f19674L0 = new C6883a(context2);
        TypedArray c = C6928p.m33264c(context2, attributeSet, C5582R.styleable.SwitchMaterial, i, f19672P0, new int[0]);
        this.f19677O0 = c.getBoolean(C5582R.styleable.SwitchMaterial_useMaterialThemeColors, false);
        c.recycle();
    }
}
