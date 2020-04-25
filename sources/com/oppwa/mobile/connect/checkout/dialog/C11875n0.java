package com.oppwa.mobile.connect.checkout.dialog;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.oppwa.mobile.connect.C11771R;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.n0 */
class C11875n0 {

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.n0$a */
    static class C11876a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f34294a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f34295b;

        C11876a(ValueAnimator valueAnimator, ViewGroup viewGroup) {
            this.f34294a = valueAnimator;
            this.f34295b = viewGroup;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) this.f34294a.getAnimatedValue()).intValue();
            LayoutParams layoutParams = this.f34295b.getLayoutParams();
            layoutParams.height = intValue;
            this.f34295b.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private static Animation m53374a(Context context, int i) {
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
        loadAnimation.setDuration(200);
        return loadAnimation;
    }

    /* renamed from: a */
    static void m53375a(Context context, View view) {
        view.startAnimation(m53374a(context, C11771R.anim.opp_show_view));
    }

    /* renamed from: a */
    static void m53376a(ViewGroup viewGroup, int i, int i2) {
        if (i != i2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
            ofInt.addUpdateListener(new C11876a(ofInt, viewGroup));
            ofInt.setDuration(200);
            ofInt.start();
        }
    }

    /* renamed from: b */
    static void m53377b(Context context, View view) {
        view.startAnimation(m53374a(context, C11771R.anim.opp_hide_view));
    }
}
