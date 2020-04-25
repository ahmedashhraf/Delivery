package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.d */
/* compiled from: CanvasUtils */
class C1836d {

    /* renamed from: a */
    private static Method f7123a;

    /* renamed from: b */
    private static Method f7124b;

    /* renamed from: c */
    private static boolean f7125c;

    private C1836d() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: a */
    static void m9836a(@C0193h0 Canvas canvas, boolean z) {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            if (i >= 29) {
                if (z) {
                    canvas.enableZ();
                } else {
                    canvas.disableZ();
                }
            } else if (i != 28) {
                if (!f7125c) {
                    try {
                        f7123a = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                        f7123a.setAccessible(true);
                        f7124b = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                        f7124b.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                    }
                    f7125c = true;
                }
                if (z) {
                    try {
                        if (f7123a != null) {
                            f7123a.invoke(canvas, new Object[0]);
                        }
                    } catch (IllegalAccessException unused2) {
                        return;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e.getCause());
                    }
                }
                if (!z && f7124b != null) {
                    f7124b.invoke(canvas, new Object[0]);
                }
            } else {
                throw new IllegalStateException("This method doesn't work on Pie!");
            }
        }
    }
}
