package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.C0193h0;

/* renamed from: androidx.transition.k */
/* compiled from: Explode */
public class C1912k extends C1873e1 {

    /* renamed from: P0 */
    private static final TimeInterpolator f7369P0 = new DecelerateInterpolator();

    /* renamed from: Q0 */
    private static final TimeInterpolator f7370Q0 = new AccelerateInterpolator();

    /* renamed from: R0 */
    private static final String f7371R0 = "android:explode:screenBounds";

    /* renamed from: O0 */
    private int[] f7372O0 = new int[2];

    public C1912k() {
        mo8334a((C1911j0) new C1910j());
    }

    /* renamed from: e */
    private void m10095e(C1922m0 m0Var) {
        View view = m0Var.f7404b;
        view.getLocationOnScreen(this.f7372O0);
        int[] iArr = this.f7372O0;
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view.getWidth() + i;
        int height = view.getHeight() + i2;
        m0Var.f7403a.put(f7371R0, new Rect(i, i2, width, height));
    }

    /* renamed from: a */
    public void mo8261a(@C0193h0 C1922m0 m0Var) {
        super.mo8261a(m0Var);
        m10095e(m0Var);
    }

    /* renamed from: b */
    public Animator mo8262b(ViewGroup viewGroup, View view, C1922m0 m0Var, C1922m0 m0Var2) {
        float f;
        float f2;
        if (m0Var == null) {
            return null;
        }
        Rect rect = (Rect) m0Var.f7403a.get(f7371R0);
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) m0Var.f7404b.getTag(C1822R.C1825id.transition_position);
        if (iArr != null) {
            f2 = ((float) (iArr[0] - rect.left)) + translationX;
            f = ((float) (iArr[1] - rect.top)) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f2 = translationX;
            f = translationY;
        }
        m10094a((View) viewGroup, rect, this.f7372O0);
        int[] iArr2 = this.f7372O0;
        return C1930o0.m10194a(view, m0Var, i, i2, translationX, translationY, f2 + ((float) iArr2[0]), f + ((float) iArr2[1]), f7370Q0, this);
    }

    /* renamed from: c */
    public void mo8263c(@C0193h0 C1922m0 m0Var) {
        super.mo8263c(m0Var);
        m10095e(m0Var);
    }

    /* renamed from: a */
    public Animator mo8260a(ViewGroup viewGroup, View view, C1922m0 m0Var, C1922m0 m0Var2) {
        if (m0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) m0Var2.f7403a.get(f7371R0);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        m10094a((View) viewGroup, rect, this.f7372O0);
        int[] iArr = this.f7372O0;
        return C1930o0.m10194a(view, m0Var2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, f7369P0, this);
    }

    public C1912k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo8334a((C1911j0) new C1910j());
    }

    /* renamed from: a */
    private void m10094a(View view, Rect rect, int[] iArr) {
        int i;
        int i2;
        View view2 = view;
        view2.getLocationOnScreen(this.f7372O0);
        int[] iArr2 = this.f7372O0;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        Rect d = mo8358d();
        if (d == null) {
            i2 = (view.getWidth() / 2) + i3 + Math.round(view.getTranslationX());
            i = (view.getHeight() / 2) + i4 + Math.round(view.getTranslationY());
        } else {
            int centerX = d.centerX();
            i = d.centerY();
            i2 = centerX;
        }
        float centerX2 = (float) (rect.centerX() - i2);
        float centerY = (float) (rect.centerY() - i);
        if (centerX2 == 0.0f && centerY == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float a = m10092a(centerX2, centerY);
        float f = centerX2 / a;
        float f2 = centerY / a;
        float a2 = m10093a(view2, i2 - i3, i - i4);
        iArr[0] = Math.round(f * a2);
        iArr[1] = Math.round(a2 * f2);
    }

    /* renamed from: a */
    private static float m10093a(View view, int i, int i2) {
        return m10092a((float) Math.max(i, view.getWidth() - i), (float) Math.max(i2, view.getHeight() - i2));
    }

    /* renamed from: a */
    private static float m10092a(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }
}
