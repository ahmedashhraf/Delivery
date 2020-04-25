package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.core.content.p020h.C0878h;
import androidx.core.p034l.C0962e0;
import androidx.transition.C1880f0.C1888h;

/* renamed from: androidx.transition.l */
/* compiled from: Fade */
public class C1916l extends C1873e1 {

    /* renamed from: O0 */
    private static final String f7387O0 = "android:fade:transitionAlpha";

    /* renamed from: P0 */
    private static final String f7388P0 = "Fade";

    /* renamed from: Q0 */
    public static final int f7389Q0 = 1;

    /* renamed from: R0 */
    public static final int f7390R0 = 2;

    /* renamed from: androidx.transition.l$a */
    /* compiled from: Fade */
    class C1917a extends C1897h0 {

        /* renamed from: a */
        final /* synthetic */ View f7391a;

        C1917a(View view) {
            this.f7391a = view;
        }

        /* renamed from: c */
        public void mo8302c(@C0193h0 C1880f0 f0Var) {
            C1953x0.m10262a(this.f7391a, 1.0f);
            C1953x0.m10261a(this.f7391a);
            f0Var.mo8342b((C1888h) this);
        }
    }

    /* renamed from: androidx.transition.l$b */
    /* compiled from: Fade */
    private static class C1918b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f7393a;

        /* renamed from: b */
        private boolean f7394b = false;

        C1918b(View view) {
            this.f7393a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C1953x0.m10262a(this.f7393a, 1.0f);
            if (this.f7394b) {
                this.f7393a.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C0962e0.m5499e0(this.f7393a) && this.f7393a.getLayerType() == 0) {
                this.f7394b = true;
                this.f7393a.setLayerType(2, null);
            }
        }
    }

    public C1916l(int i) {
        mo8310c(i);
    }

    /* renamed from: a */
    private Animator m10157a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C1953x0.m10262a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C1953x0.f7481c, new float[]{f2});
        ofFloat.addListener(new C1918b(view));
        mo8324a((C1888h) new C1917a(view));
        return ofFloat;
    }

    /* renamed from: b */
    public Animator mo8262b(ViewGroup viewGroup, View view, C1922m0 m0Var, C1922m0 m0Var2) {
        C1953x0.m10271e(view);
        return m10157a(view, m10156a(m0Var, 1.0f), 0.0f);
    }

    /* renamed from: c */
    public void mo8263c(@C0193h0 C1922m0 m0Var) {
        super.mo8263c(m0Var);
        m0Var.f7403a.put(f7387O0, Float.valueOf(C1953x0.m10268c(m0Var.f7404b)));
    }

    public C1916l() {
    }

    @SuppressLint({"RestrictedApi"})
    public C1916l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1861e0.f7191f);
        mo8310c(C0878h.m5077b(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, mo8273r()));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public Animator mo8260a(ViewGroup viewGroup, View view, C1922m0 m0Var, C1922m0 m0Var2) {
        float f = 0.0f;
        float a = m10156a(m0Var, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m10157a(view, f, 1.0f);
    }

    /* renamed from: a */
    private static float m10156a(C1922m0 m0Var, float f) {
        if (m0Var == null) {
            return f;
        }
        Float f2 = (Float) m0Var.f7403a.get(f7387O0);
        return f2 != null ? f2.floatValue() : f;
    }
}
