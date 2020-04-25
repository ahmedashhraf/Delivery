package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.core.p034l.C0962e0;
import java.util.Map;

/* renamed from: androidx.transition.f */
/* compiled from: ChangeClipBounds */
public class C1878f extends C1880f0 {

    /* renamed from: H0 */
    private static final String f7244H0 = "android:clipBounds:clip";

    /* renamed from: I0 */
    private static final String f7245I0 = "android:clipBounds:bounds";

    /* renamed from: J0 */
    private static final String[] f7246J0 = {f7244H0};

    /* renamed from: androidx.transition.f$a */
    /* compiled from: ChangeClipBounds */
    class C1879a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f7247a;

        C1879a(View view) {
            this.f7247a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C0962e0.m5439a(this.f7247a, (Rect) null);
        }
    }

    public C1878f() {
    }

    /* renamed from: d */
    private void m9915d(C1922m0 m0Var) {
        View view = m0Var.f7404b;
        if (view.getVisibility() != 8) {
            Rect p = C0962e0.m5545p(view);
            m0Var.f7403a.put(f7244H0, p);
            if (p == null) {
                m0Var.f7403a.put(f7245I0, new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    /* renamed from: a */
    public void mo8261a(@C0193h0 C1922m0 m0Var) {
        m9915d(m0Var);
    }

    /* renamed from: c */
    public void mo8263c(@C0193h0 C1922m0 m0Var) {
        m9915d(m0Var);
    }

    /* renamed from: o */
    public String[] mo8272o() {
        return f7246J0;
    }

    public C1878f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public Animator mo8270a(@C0193h0 ViewGroup viewGroup, C1922m0 m0Var, C1922m0 m0Var2) {
        ObjectAnimator objectAnimator = null;
        if (!(m0Var == null || m0Var2 == null)) {
            Map<String, Object> map = m0Var.f7403a;
            String str = f7244H0;
            if (map.containsKey(str) && m0Var2.f7403a.containsKey(str)) {
                Rect rect = (Rect) m0Var.f7403a.get(str);
                Rect rect2 = (Rect) m0Var2.f7403a.get(str);
                boolean z = rect2 == null;
                if (rect == null && rect2 == null) {
                    return null;
                }
                String str2 = f7245I0;
                if (rect == null) {
                    rect = (Rect) m0Var.f7403a.get(str2);
                } else if (rect2 == null) {
                    rect2 = (Rect) m0Var2.f7403a.get(str2);
                }
                if (rect.equals(rect2)) {
                    return null;
                }
                C0962e0.m5439a(m0Var2.f7404b, rect);
                objectAnimator = ObjectAnimator.ofObject(m0Var2.f7404b, C1953x0.f7482d, new C1828a0(new Rect()), new Rect[]{rect, rect2});
                if (z) {
                    objectAnimator.addListener(new C1879a(m0Var2.f7404b));
                }
            }
        }
        return objectAnimator;
    }
}
