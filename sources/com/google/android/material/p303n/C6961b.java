package com.google.android.material.p303n;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.StateSet;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0224v0;
import androidx.core.p018c.C0821b;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.n.b */
/* compiled from: RippleUtils */
public class C6961b {

    /* renamed from: a */
    public static final boolean f19468a = (VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f19469b = {16842919};

    /* renamed from: c */
    private static final int[] f19470c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f19471d = {16842908};

    /* renamed from: e */
    private static final int[] f19472e = {16843623};

    /* renamed from: f */
    private static final int[] f19473f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f19474g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f19475h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f19476i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f19477j = {16842913};

    /* renamed from: k */
    private static final int[] f19478k = {16842910, 16842919};
    @C0224v0

    /* renamed from: l */
    static final String f19479l = C6961b.class.getSimpleName();
    @C0224v0

    /* renamed from: m */
    static final String f19480m = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    private C6961b() {
    }

    @C0193h0
    /* renamed from: a */
    public static ColorStateList m33357a(@C0195i0 ColorStateList colorStateList) {
        if (f19468a) {
            return new ColorStateList(new int[][]{f19477j, StateSet.NOTHING}, new int[]{m33356a(colorStateList, f19473f), m33356a(colorStateList, f19469b)});
        }
        int[] iArr = f19473f;
        int[] iArr2 = f19474g;
        int[] iArr3 = f19475h;
        int[] iArr4 = f19476i;
        int[] iArr5 = f19469b;
        int[] iArr6 = f19470c;
        int[] iArr7 = f19471d;
        int[] iArr8 = f19472e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f19477j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m33356a(colorStateList, iArr), m33356a(colorStateList, iArr2), m33356a(colorStateList, iArr3), m33356a(colorStateList, iArr4), 0, m33356a(colorStateList, iArr5), m33356a(colorStateList, iArr6), m33356a(colorStateList, iArr7), m33356a(colorStateList, iArr8), 0});
    }

    @C0193h0
    /* renamed from: b */
    public static ColorStateList m33359b(@C0195i0 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            int alpha = Color.alpha(colorStateList.getColorForState(f19478k, 0));
        }
        return colorStateList;
    }

    /* renamed from: a */
    public static boolean m33358a(@C0193h0 int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    @C0198k
    /* renamed from: a */
    private static int m33356a(@C0195i0 ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f19468a ? m33355a(colorForState) : colorForState;
    }

    @C0198k
    @TargetApi(21)
    /* renamed from: a */
    private static int m33355a(@C0198k int i) {
        return C0821b.m4811d(i, Math.min(Color.alpha(i) * 2, 255));
    }
}
