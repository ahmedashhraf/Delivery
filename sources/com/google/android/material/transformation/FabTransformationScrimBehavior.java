package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.p179a.C5588b;
import com.google.android.material.p179a.C5595i;
import java.util.ArrayList;
import java.util.List;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: h */
    public static final long f20203h = 75;

    /* renamed from: i */
    public static final long f20204i = 150;

    /* renamed from: j */
    public static final long f20205j = 0;

    /* renamed from: k */
    public static final long f20206k = 150;

    /* renamed from: f */
    private final C5595i f20207f = new C5595i(75, 150);

    /* renamed from: g */
    private final C5595i f20208g = new C5595i(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    class C7117a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f20209a;

        /* renamed from: b */
        final /* synthetic */ View f20210b;

        C7117a(boolean z, View view) {
            this.f20209a = z;
            this.f20210b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f20209a) {
                this.f20210b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f20209a) {
                this.f20210b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: a */
    public boolean mo3999a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    /* renamed from: b */
    public boolean mo4003b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 View view, @C0193h0 MotionEvent motionEvent) {
        return super.mo4003b(coordinatorLayout, view, motionEvent);
    }

    /* renamed from: a */
    private void m34289a(@C0193h0 View view, boolean z, boolean z2, @C0193h0 List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        C5595i iVar = z ? this.f20207f : this.f20208g;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo22059a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: b */
    public AnimatorSet mo28471b(@C0193h0 View view, @C0193h0 View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m34289a(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C5588b.m24253a(animatorSet, arrayList);
        animatorSet.addListener(new C7117a(z, view2));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
