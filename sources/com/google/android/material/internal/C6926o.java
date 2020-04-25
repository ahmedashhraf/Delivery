package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.transition.C1880f0;
import androidx.transition.C1922m0;
import java.util.Map;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.o */
/* compiled from: TextScale */
public class C6926o extends C1880f0 {

    /* renamed from: H0 */
    private static final String f19390H0 = "android:textscale:scale";

    /* renamed from: com.google.android.material.internal.o$a */
    /* compiled from: TextScale */
    class C6927a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TextView f19391a;

        C6927a(TextView textView) {
            this.f19391a = textView;
        }

        public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f19391a.setScaleX(floatValue);
            this.f19391a.setScaleY(floatValue);
        }
    }

    /* renamed from: d */
    private void m33253d(@C0193h0 C1922m0 m0Var) {
        View view = m0Var.f7404b;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            m0Var.f7403a.put(f19390H0, Float.valueOf(textView.getScaleX()));
        }
    }

    /* renamed from: a */
    public void mo8261a(@C0193h0 C1922m0 m0Var) {
        m33253d(m0Var);
    }

    /* renamed from: c */
    public void mo8263c(@C0193h0 C1922m0 m0Var) {
        m33253d(m0Var);
    }

    /* renamed from: a */
    public Animator mo8270a(@C0193h0 ViewGroup viewGroup, @C0195i0 C1922m0 m0Var, @C0195i0 C1922m0 m0Var2) {
        ValueAnimator valueAnimator = null;
        if (!(m0Var == null || m0Var2 == null || !(m0Var.f7404b instanceof TextView))) {
            View view = m0Var2.f7404b;
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                Map<String, Object> map = m0Var.f7403a;
                Map<String, Object> map2 = m0Var2.f7403a;
                String str = f19390H0;
                float f = 1.0f;
                float floatValue = map.get(str) != null ? ((Float) map.get(str)).floatValue() : 1.0f;
                if (map2.get(str) != null) {
                    f = ((Float) map2.get(str)).floatValue();
                }
                if (floatValue == f) {
                    return null;
                }
                valueAnimator = ValueAnimator.ofFloat(new float[]{floatValue, f});
                valueAnimator.addUpdateListener(new C6927a(textView));
            }
        }
        return valueAnimator;
    }
}
