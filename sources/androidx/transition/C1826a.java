package androidx.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import java.util.ArrayList;

/* renamed from: androidx.transition.a */
/* compiled from: AnimatorUtils */
class C1826a {

    /* renamed from: androidx.transition.a$a */
    /* compiled from: AnimatorUtils */
    interface C1827a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    private C1826a() {
    }

    /* renamed from: a */
    static void m9801a(@C0193h0 Animator animator, @C0193h0 AnimatorListenerAdapter animatorListenerAdapter) {
        if (VERSION.SDK_INT >= 19) {
            animator.addPauseListener(animatorListenerAdapter);
        }
    }

    /* renamed from: b */
    static void m9802b(@C0193h0 Animator animator) {
        if (VERSION.SDK_INT >= 19) {
            animator.resume();
            return;
        }
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C1827a) {
                    ((C1827a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }

    /* renamed from: a */
    static void m9800a(@C0193h0 Animator animator) {
        if (VERSION.SDK_INT >= 19) {
            animator.pause();
            return;
        }
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C1827a) {
                    ((C1827a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }
}
