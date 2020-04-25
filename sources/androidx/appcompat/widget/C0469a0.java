package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.p008b.p009a.C0331c;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.graphics.drawable.C0898f;
import java.lang.reflect.Field;

@SuppressLint({"RestrictedAPI"})
@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.a0 */
/* compiled from: DrawableUtils */
public class C0469a0 {

    /* renamed from: a */
    private static final int[] f1864a = {16842912};

    /* renamed from: b */
    private static final int[] f1865b = new int[0];

    /* renamed from: c */
    private static final String f1866c = "DrawableUtils";

    /* renamed from: d */
    public static final Rect f1867d = new Rect();

    /* renamed from: e */
    private static Class<?> f1868e = null;

    /* renamed from: f */
    private static final String f1869f = "android.graphics.drawable.VectorDrawable";

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f1868e = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    private C0469a0() {
    }

    /* renamed from: a */
    public static boolean m2595a(@C0193h0 Drawable drawable) {
        if (VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainerState) {
                for (Drawable a : ((DrawableContainerState) constantState).getChildren()) {
                    if (!m2595a(a)) {
                        return false;
                    }
                }
            }
        } else if (drawable instanceof C0898f) {
            return m2595a(((C0898f) drawable).mo4619a());
        } else {
            if (drawable instanceof C0331c) {
                return m2595a(((C0331c) drawable).mo1241a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m2595a(((ScaleDrawable) drawable).getDrawable());
            }
        }
        return true;
    }

    /* renamed from: b */
    static void m2596b(@C0193h0 Drawable drawable) {
        if (VERSION.SDK_INT == 21) {
            if (f1869f.equals(drawable.getClass().getName())) {
                m2597c(drawable);
            }
        }
    }

    /* renamed from: c */
    private static void m2597c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1864a);
        } else {
            drawable.setState(f1865b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m2598d(Drawable drawable) {
        Field[] fields;
        if (VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f1868e != null) {
            try {
                Drawable h = C0892a.m5160h(drawable);
                Object invoke = h.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(h, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f1868e.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
            }
        }
        return f1867d;
    }

    /* renamed from: a */
    public static Mode m2594a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }
}
