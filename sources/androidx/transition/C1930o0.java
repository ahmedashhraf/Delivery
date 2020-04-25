package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.transition.C1880f0.C1888h;

/* renamed from: androidx.transition.o0 */
/* compiled from: TranslationAnimationCreator */
class C1930o0 {

    /* renamed from: androidx.transition.o0$a */
    /* compiled from: TranslationAnimationCreator */
    private static class C1931a extends AnimatorListenerAdapter implements C1888h {

        /* renamed from: a */
        private final View f7424a;

        /* renamed from: b */
        private final View f7425b;

        /* renamed from: c */
        private final int f7426c;

        /* renamed from: d */
        private final int f7427d;

        /* renamed from: e */
        private int[] f7428e = ((int[]) this.f7424a.getTag(C1822R.C1825id.transition_position));

        /* renamed from: f */
        private float f7429f;

        /* renamed from: g */
        private float f7430g;

        /* renamed from: h */
        private final float f7431h;

        /* renamed from: i */
        private final float f7432i;

        C1931a(View view, View view2, int i, int i2, float f, float f2) {
            this.f7425b = view;
            this.f7424a = view2;
            this.f7426c = i - Math.round(this.f7425b.getTranslationX());
            this.f7427d = i2 - Math.round(this.f7425b.getTranslationY());
            this.f7431h = f;
            this.f7432i = f2;
            if (this.f7428e != null) {
                this.f7424a.setTag(C1822R.C1825id.transition_position, null);
            }
        }

        /* renamed from: a */
        public void mo8312a(@C0193h0 C1880f0 f0Var) {
        }

        /* renamed from: b */
        public void mo8301b(@C0193h0 C1880f0 f0Var) {
        }

        /* renamed from: c */
        public void mo8302c(@C0193h0 C1880f0 f0Var) {
            this.f7425b.setTranslationX(this.f7431h);
            this.f7425b.setTranslationY(this.f7432i);
            f0Var.mo8342b((C1888h) this);
        }

        /* renamed from: d */
        public void mo8303d(@C0193h0 C1880f0 f0Var) {
        }

        /* renamed from: e */
        public void mo8304e(@C0193h0 C1880f0 f0Var) {
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f7428e == null) {
                this.f7428e = new int[2];
            }
            this.f7428e[0] = Math.round(((float) this.f7426c) + this.f7425b.getTranslationX());
            this.f7428e[1] = Math.round(((float) this.f7427d) + this.f7425b.getTranslationY());
            this.f7424a.setTag(C1822R.C1825id.transition_position, this.f7428e);
        }

        public void onAnimationPause(Animator animator) {
            this.f7429f = this.f7425b.getTranslationX();
            this.f7430g = this.f7425b.getTranslationY();
            this.f7425b.setTranslationX(this.f7431h);
            this.f7425b.setTranslationY(this.f7432i);
        }

        public void onAnimationResume(Animator animator) {
            this.f7425b.setTranslationX(this.f7429f);
            this.f7425b.setTranslationY(this.f7430g);
        }
    }

    private C1930o0() {
    }

    @C0195i0
    /* renamed from: a */
    static Animator m10194a(@C0193h0 View view, @C0193h0 C1922m0 m0Var, int i, int i2, float f, float f2, float f3, float f4, @C0195i0 TimeInterpolator timeInterpolator, @C0193h0 C1880f0 f0Var) {
        float f5;
        float f6;
        View view2 = view;
        C1922m0 m0Var2 = m0Var;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) m0Var2.f7404b.getTag(C1822R.C1825id.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        C1931a aVar = new C1931a(view, m0Var2.f7404b, round, round2, translationX, translationY);
        f0Var.mo8324a((C1888h) aVar);
        ofPropertyValuesHolder.addListener(aVar);
        C1826a.m9801a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
