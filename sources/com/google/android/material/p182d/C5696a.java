package com.google.android.material.p182d;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.C0193h0;
import com.google.android.material.p182d.C5705g.C5707b;
import com.google.android.material.p182d.C5705g.C5708c;
import com.google.android.material.p182d.C5705g.C5710e;

/* renamed from: com.google.android.material.d.a */
/* compiled from: CircularRevealCompat */
public final class C5696a {

    /* renamed from: com.google.android.material.d.a$a */
    /* compiled from: CircularRevealCompat */
    static class C5697a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5705g f16540a;

        C5697a(C5705g gVar) {
            this.f16540a = gVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f16540a.mo22995b();
        }

        public void onAnimationStart(Animator animator) {
            this.f16540a.mo22993a();
        }
    }

    private C5696a() {
    }

    @C0193h0
    /* renamed from: a */
    public static Animator m25130a(@C0193h0 C5705g gVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(gVar, C5708c.f16562a, C5707b.f16560b, new C5710e[]{new C5710e(f, f2, f3)});
        if (VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C5710e revealInfo = gVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) gVar, (int) f, (int) f2, revealInfo.f16567c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    @C0193h0
    /* renamed from: a */
    public static Animator m25131a(C5705g gVar, float f, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(gVar, C5708c.f16562a, C5707b.f16560b, new C5710e[]{new C5710e(f, f2, f3), new C5710e(f, f2, f4)});
        if (VERSION.SDK_INT < 21) {
            return ofObject;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) gVar, (int) f, (int) f2, f3, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
        return animatorSet;
    }

    @C0193h0
    /* renamed from: a */
    public static AnimatorListener m25129a(@C0193h0 C5705g gVar) {
        return new C5697a(gVar);
    }
}
