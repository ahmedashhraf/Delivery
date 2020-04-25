package androidx.core.p034l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import androidx.annotation.C0193h0;
import java.lang.reflect.Method;

/* renamed from: androidx.core.l.f0 */
/* compiled from: ViewConfigurationCompat */
public final class C0983f0 {

    /* renamed from: a */
    private static final String f4391a = "ViewConfigCompat";

    /* renamed from: b */
    private static Method f4392b;

    static {
        if (VERSION.SDK_INT == 25) {
            try {
                f4392b = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    private C0983f0() {
    }

    /* renamed from: a */
    private static float m5629a(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 25) {
            Method method = f4392b;
            if (method != null) {
                try {
                    return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
                } catch (Exception unused) {
                }
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    @Deprecated
    /* renamed from: b */
    public static int m5632b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    @Deprecated
    /* renamed from: c */
    public static boolean m5634c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    /* renamed from: d */
    public static boolean m5635d(ViewConfiguration viewConfiguration, @C0193h0 Context context) {
        if (VERSION.SDK_INT >= 28) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }

    /* renamed from: b */
    public static float m5631b(@C0193h0 ViewConfiguration viewConfiguration, @C0193h0 Context context) {
        if (VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }
        return m5629a(viewConfiguration, context);
    }

    /* renamed from: c */
    public static float m5633c(@C0193h0 ViewConfiguration viewConfiguration, @C0193h0 Context context) {
        if (VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
        return m5629a(viewConfiguration, context);
    }

    /* renamed from: a */
    public static int m5630a(ViewConfiguration viewConfiguration) {
        if (VERSION.SDK_INT >= 28) {
            return viewConfiguration.getScaledHoverSlop();
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }
}
