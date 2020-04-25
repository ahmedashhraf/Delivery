package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0211p;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;
import com.google.android.material.p179a.C5587a;

public class HideBottomViewOnScrollBehavior<V extends View> extends C0712c<V> {

    /* renamed from: e */
    protected static final int f16091e = 225;

    /* renamed from: f */
    protected static final int f16092f = 175;

    /* renamed from: g */
    private static final int f16093g = 1;

    /* renamed from: h */
    private static final int f16094h = 2;

    /* renamed from: a */
    private int f16095a = 0;

    /* renamed from: b */
    private int f16096b = 2;

    /* renamed from: c */
    private int f16097c = 0;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: d */
    public ViewPropertyAnimator f16098d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class C5623a extends AnimatorListenerAdapter {
        C5623a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f16098d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: b */
    public void mo22286b(@C0193h0 V v) {
        if (this.f16096b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f16098d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f16096b = 1;
            m24513a(v, this.f16095a + this.f16097c, 175, C5587a.f15931c);
        }
    }

    /* renamed from: b */
    public boolean mo4006b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, @C0193h0 View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: c */
    public void mo22287c(@C0193h0 V v) {
        if (this.f16096b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f16098d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f16096b = 2;
            m24513a(v, 0, 225, C5587a.f15932d);
        }
    }

    /* renamed from: a */
    public boolean mo3994a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, int i) {
        this.f16095a = v.getMeasuredHeight() + ((MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo3994a(coordinatorLayout, v, i);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo22285a(@C0193h0 V v, @C0211p int i) {
        this.f16097c = i;
        if (this.f16096b == 1) {
            v.setTranslationY((float) (this.f16095a + this.f16097c));
        }
    }

    /* renamed from: a */
    public void mo3988a(CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, int i, int i2, int i3, int i4, int i5, @C0193h0 int[] iArr) {
        if (i2 > 0) {
            mo22286b(v);
        } else if (i2 < 0) {
            mo22287c(v);
        }
    }

    /* renamed from: a */
    private void m24513a(@C0193h0 V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f16098d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C5623a());
    }
}
