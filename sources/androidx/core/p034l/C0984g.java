package androidx.core.p034l;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Gravity;

/* renamed from: androidx.core.l.g */
/* compiled from: GravityCompat */
public final class C0984g {

    /* renamed from: a */
    public static final int f4393a = 8388608;

    /* renamed from: b */
    public static final int f4394b = 8388611;

    /* renamed from: c */
    public static final int f4395c = 8388613;

    /* renamed from: d */
    public static final int f4396d = 8388615;

    private C0984g() {
    }

    /* renamed from: a */
    public static void m5638a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    /* renamed from: a */
    public static void m5637a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
        if (VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        } else {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2);
        }
    }

    /* renamed from: a */
    public static void m5639a(int i, Rect rect, Rect rect2, int i2) {
        if (VERSION.SDK_INT >= 17) {
            Gravity.applyDisplay(i, rect, rect2, i2);
        } else {
            Gravity.applyDisplay(i, rect, rect2);
        }
    }

    /* renamed from: a */
    public static int m5636a(int i, int i2) {
        return VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }
}
