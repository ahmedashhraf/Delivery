package com.mrsool.customeview.TwitterVideoView;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: com.mrsool.customeview.TwitterVideoView.a */
/* compiled from: AnimationUtils */
class C10721a {

    /* renamed from: com.mrsool.customeview.TwitterVideoView.a$a */
    /* compiled from: AnimationUtils */
    static class C10722a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f29408a;

        C10722a(View view) {
            this.f29408a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f29408a.setVisibility(4);
            this.f29408a.setAlpha(1.0f);
        }
    }

    C10721a() {
    }

    /* renamed from: a */
    public static ViewPropertyAnimator m49374a(View view, int i) {
        if (view.getVisibility() != 0) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
        }
        view.clearAnimation();
        ViewPropertyAnimator animate = view.animate();
        animate.alpha(1.0f).setDuration((long) i).setListener(null);
        return animate;
    }

    /* renamed from: b */
    public static ViewPropertyAnimator m49375b(View view, int i) {
        if (view.getVisibility() != 0) {
            return null;
        }
        view.clearAnimation();
        ViewPropertyAnimator animate = view.animate();
        animate.alpha(0.0f).setDuration((long) i).setListener(new C10722a(view));
        return animate;
    }
}
