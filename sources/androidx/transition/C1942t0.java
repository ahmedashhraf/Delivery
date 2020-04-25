package androidx.transition;

import android.animation.LayoutTransition;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import com.mrsool.utils.C11644i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.t0 */
/* compiled from: ViewGroupUtilsApi14 */
class C1942t0 {

    /* renamed from: a */
    private static final String f7457a = "ViewGroupUtilsApi14";

    /* renamed from: b */
    private static final int f7458b = 4;

    /* renamed from: c */
    private static LayoutTransition f7459c;

    /* renamed from: d */
    private static Field f7460d;

    /* renamed from: e */
    private static boolean f7461e;

    /* renamed from: f */
    private static Method f7462f;

    /* renamed from: g */
    private static boolean f7463g;

    /* renamed from: androidx.transition.t0$a */
    /* compiled from: ViewGroupUtilsApi14 */
    static class C1943a extends LayoutTransition {
        C1943a() {
        }

        public boolean isChangingLayout() {
            return true;
        }
    }

    private C1942t0() {
    }

    /* renamed from: a */
    static void m10240a(@C0193h0 ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (f7459c == null) {
            f7459c = new C1943a();
            f7459c.setAnimator(2, null);
            f7459c.setAnimator(0, null);
            f7459c.setAnimator(1, null);
            f7459c.setAnimator(3, null);
            f7459c.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    m10239a(layoutTransition);
                }
                if (layoutTransition != f7459c) {
                    viewGroup.setTag(C1822R.C1825id.transition_layout_save, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f7459c);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!f7461e) {
            try {
                f7460d = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f7460d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f7461e = true;
        }
        Field field = f7460d;
        if (field != null) {
            try {
                boolean z3 = field.getBoolean(viewGroup);
                if (z3) {
                    try {
                        f7460d.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(C1822R.C1825id.transition_layout_save);
        if (layoutTransition2 != null) {
            viewGroup.setTag(C1822R.C1825id.transition_layout_save, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }

    /* renamed from: a */
    private static void m10239a(LayoutTransition layoutTransition) {
        if (!f7463g) {
            try {
                f7462f = LayoutTransition.class.getDeclaredMethod(C11644i.f33298f3, new Class[0]);
                f7462f.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f7463g = true;
        }
        Method method = f7462f;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
