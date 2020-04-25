package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p034l.C0962e0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.z0 */
/* compiled from: ViewUtils */
public class C0567z0 {

    /* renamed from: a */
    private static final String f2293a = "ViewUtils";

    /* renamed from: b */
    private static Method f2294b;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f2294b = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                if (!f2294b.isAccessible()) {
                    f2294b.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    private C0567z0() {
    }

    /* renamed from: a */
    public static boolean m3141a(View view) {
        return C0962e0.m5566x(view) == 1;
    }

    /* renamed from: b */
    public static void m3142b(View view) {
        if (VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m3140a(View view, Rect rect, Rect rect2) {
        Method method = f2294b;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception unused) {
            }
        }
    }
}
