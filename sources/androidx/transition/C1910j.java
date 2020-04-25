package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: androidx.transition.j */
/* compiled from: CircularPropagation */
public class C1910j extends C1889f1 {

    /* renamed from: d */
    private float f7368d = 3.0f;

    /* renamed from: a */
    public void mo8423a(float f) {
        if (f != 0.0f) {
            this.f7368d = f;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }

    /* renamed from: a */
    public long mo8252a(ViewGroup viewGroup, C1880f0 f0Var, C1922m0 m0Var, C1922m0 m0Var2) {
        int i;
        int i2;
        int i3;
        if (m0Var == null && m0Var2 == null) {
            return 0;
        }
        if (m0Var2 == null || mo8381b(m0Var) == 0) {
            i = -1;
        } else {
            m0Var = m0Var2;
            i = 1;
        }
        int c = mo8382c(m0Var);
        int d = mo8383d(m0Var);
        Rect d2 = f0Var.mo8358d();
        if (d2 != null) {
            i3 = d2.centerX();
            i2 = d2.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            i2 = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
            i3 = round;
        }
        float a = m10086a((float) c, (float) d, (float) i3, (float) i2) / m10086a(0.0f, 0.0f, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        long c2 = f0Var.mo8351c();
        if (c2 < 0) {
            c2 = 300;
        }
        return (long) Math.round((((float) (c2 * ((long) i))) / this.f7368d) * a);
    }

    /* renamed from: a */
    private static float m10086a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }
}
