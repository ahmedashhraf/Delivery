package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.p018c.C0821b;

/* renamed from: androidx.appcompat.widget.o0 */
/* compiled from: ThemeUtils */
class C0538o0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2155a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f2156b = {-16842910};

    /* renamed from: c */
    static final int[] f2157c = {16842908};

    /* renamed from: d */
    static final int[] f2158d = {16843518};

    /* renamed from: e */
    static final int[] f2159e = {16842919};

    /* renamed from: f */
    static final int[] f2160f = {16842912};

    /* renamed from: g */
    static final int[] f2161g = {16842913};

    /* renamed from: h */
    static final int[] f2162h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f2163i = new int[0];

    /* renamed from: j */
    private static final int[] f2164j = new int[1];

    private C0538o0() {
    }

    /* renamed from: a */
    public static ColorStateList m2882a(int i, int i2) {
        return new ColorStateList(new int[][]{f2156b, f2163i}, new int[]{i2, i});
    }

    /* renamed from: b */
    public static int m2884b(Context context, int i) {
        int[] iArr = f2164j;
        iArr[0] = i;
        C0549t0 a = C0549t0.m2909a(context, (AttributeSet) null, iArr);
        try {
            return a.mo2866a(0, 0);
        } finally {
            a.mo2887f();
        }
    }

    /* renamed from: c */
    public static ColorStateList m2885c(Context context, int i) {
        int[] iArr = f2164j;
        iArr[0] = i;
        C0549t0 a = C0549t0.m2909a(context, (AttributeSet) null, iArr);
        try {
            return a.mo2868a(0);
        } finally {
            a.mo2887f();
        }
    }

    /* renamed from: a */
    public static int m2880a(Context context, int i) {
        ColorStateList c = m2885c(context, i);
        if (c != null && c.isStateful()) {
            return c.getColorForState(f2156b, c.getDefaultColor());
        }
        TypedValue a = m2883a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m2881a(context, i, a.getFloat());
    }

    /* renamed from: a */
    private static TypedValue m2883a() {
        TypedValue typedValue = (TypedValue) f2155a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f2155a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    static int m2881a(Context context, int i, float f) {
        int b = m2884b(context, i);
        return C0821b.m4811d(b, Math.round(((float) Color.alpha(b)) * f));
    }
}
