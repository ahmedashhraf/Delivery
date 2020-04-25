package androidx.core.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.C0193h0;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0984g;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: androidx.core.widget.k */
/* compiled from: PopupWindowCompat */
public final class C1118k {

    /* renamed from: a */
    private static final String f4922a = "PopupWindowCompatApi21";

    /* renamed from: b */
    private static Method f4923b;

    /* renamed from: c */
    private static boolean f4924c;

    /* renamed from: d */
    private static Method f4925d;

    /* renamed from: e */
    private static boolean f4926e;

    /* renamed from: f */
    private static Field f4927f;

    /* renamed from: g */
    private static boolean f4928g;

    private C1118k() {
    }

    /* renamed from: a */
    public static void m6346a(@C0193h0 PopupWindow popupWindow, @C0193h0 View view, int i, int i2, int i3) {
        if (VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C0984g.m5636a(i3, C0962e0.m5566x(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    /* renamed from: b */
    public static int m6349b(@C0193h0 PopupWindow popupWindow) {
        if (VERSION.SDK_INT >= 23) {
            return popupWindow.getWindowLayoutType();
        }
        if (!f4926e) {
            try {
                f4925d = PopupWindow.class.getDeclaredMethod("getWindowLayoutType", new Class[0]);
                f4925d.setAccessible(true);
            } catch (Exception unused) {
            }
            f4926e = true;
        }
        Method method = f4925d;
        if (method != null) {
            try {
                return ((Integer) method.invoke(popupWindow, new Object[0])).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static void m6347a(@C0193h0 PopupWindow popupWindow, boolean z) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (i >= 21) {
            if (!f4928g) {
                try {
                    f4927f = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f4927f.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f4928g = true;
            }
            Field field = f4927f;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m6348a(@C0193h0 PopupWindow popupWindow) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            return popupWindow.getOverlapAnchor();
        }
        if (i >= 21) {
            if (!f4928g) {
                try {
                    f4927f = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f4927f.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f4928g = true;
            }
            Field field = f4927f;
            if (field != null) {
                try {
                    return ((Boolean) field.get(popupWindow)).booleanValue();
                } catch (IllegalAccessException unused2) {
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m6345a(@C0193h0 PopupWindow popupWindow, int i) {
        if (VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f4924c) {
            try {
                f4923b = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f4923b.setAccessible(true);
            } catch (Exception unused) {
            }
            f4924c = true;
        }
        Method method = f4923b;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }
}
