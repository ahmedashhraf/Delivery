package androidx.core.p034l;

import android.os.Build.VERSION;
import android.view.ScaleGestureDetector;

/* renamed from: androidx.core.l.a0 */
/* compiled from: ScaleGestureDetectorCompat */
public final class C0949a0 {
    private C0949a0() {
    }

    @Deprecated
    /* renamed from: a */
    public static void m5364a(Object obj, boolean z) {
        m5363a((ScaleGestureDetector) obj, z);
    }

    /* renamed from: a */
    public static void m5363a(ScaleGestureDetector scaleGestureDetector, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            scaleGestureDetector.setQuickScaleEnabled(z);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m5366a(Object obj) {
        return m5365a((ScaleGestureDetector) obj);
    }

    /* renamed from: a */
    public static boolean m5365a(ScaleGestureDetector scaleGestureDetector) {
        if (VERSION.SDK_INT >= 19) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }
        return false;
    }
}
