package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.s0 */
/* compiled from: ViewGroupUtils */
class C1940s0 {

    /* renamed from: a */
    private static boolean f7451a = true;

    /* renamed from: b */
    private static Method f7452b;

    /* renamed from: c */
    private static boolean f7453c;

    private C1940s0() {
    }

    /* renamed from: a */
    static C1938r0 m10233a(@C0193h0 ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 18) {
            return new C1935q0(viewGroup);
        }
        return C1933p0.m10207a(viewGroup);
    }

    /* renamed from: b */
    static void m10235b(@C0193h0 ViewGroup viewGroup, boolean z) {
        int i = VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            m10234a(viewGroup, z);
        } else {
            C1942t0.m10240a(viewGroup, z);
        }
    }

    @RequiresApi(18)
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private static void m10234a(@C0193h0 ViewGroup viewGroup, boolean z) {
        if (f7451a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f7451a = false;
            }
        }
    }

    /* renamed from: a */
    static int m10232a(@C0193h0 ViewGroup viewGroup, int i) {
        if (VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!f7453c) {
            try {
                f7452b = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", new Class[]{Integer.TYPE, Integer.TYPE});
                f7452b.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f7453c = true;
        }
        Method method = f7452b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, new Object[]{Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i)})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }
}
