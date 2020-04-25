package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.util.Map;

/* renamed from: androidx.transition.h */
/* compiled from: ChangeScroll */
public class C1896h extends C1880f0 {

    /* renamed from: H0 */
    private static final String f7318H0 = "android:changeScroll:x";

    /* renamed from: I0 */
    private static final String f7319I0 = "android:changeScroll:y";

    /* renamed from: J0 */
    private static final String[] f7320J0 = {f7318H0, f7319I0};

    public C1896h() {
    }

    /* renamed from: d */
    private void m10033d(C1922m0 m0Var) {
        m0Var.f7403a.put(f7318H0, Integer.valueOf(m0Var.f7404b.getScrollX()));
        m0Var.f7403a.put(f7319I0, Integer.valueOf(m0Var.f7404b.getScrollY()));
    }

    /* renamed from: a */
    public void mo8261a(@C0193h0 C1922m0 m0Var) {
        m10033d(m0Var);
    }

    /* renamed from: c */
    public void mo8263c(@C0193h0 C1922m0 m0Var) {
        m10033d(m0Var);
    }

    @C0195i0
    /* renamed from: o */
    public String[] mo8272o() {
        return f7320J0;
    }

    public C1896h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @C0195i0
    /* renamed from: a */
    public Animator mo8270a(@C0193h0 ViewGroup viewGroup, @C0195i0 C1922m0 m0Var, @C0195i0 C1922m0 m0Var2) {
        Animator animator;
        ObjectAnimator objectAnimator = null;
        if (m0Var == null || m0Var2 == null) {
            return null;
        }
        View view = m0Var2.f7404b;
        Map<String, Object> map = m0Var.f7403a;
        String str = f7318H0;
        int intValue = ((Integer) map.get(str)).intValue();
        int intValue2 = ((Integer) m0Var2.f7403a.get(str)).intValue();
        Map<String, Object> map2 = m0Var.f7403a;
        String str2 = f7319I0;
        int intValue3 = ((Integer) map2.get(str2)).intValue();
        int intValue4 = ((Integer) m0Var2.f7403a.get(str2)).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            animator = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            animator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        return C1919l0.m10162a(animator, objectAnimator);
    }
}
