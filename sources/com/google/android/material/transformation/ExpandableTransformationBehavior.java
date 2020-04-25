package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: e */
    public AnimatorSet f20182e;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    class C7111a extends AnimatorListenerAdapter {
        C7111a() {
        }

        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f20182e = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: b */
    public abstract AnimatorSet mo28471b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0194i
    /* renamed from: a */
    public boolean mo28468a(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f20182e != null;
        if (z3) {
            this.f20182e.cancel();
        }
        this.f20182e = mo28471b(view, view2, z, z3);
        this.f20182e.addListener(new C7111a());
        this.f20182e.start();
        if (!z2) {
            this.f20182e.end();
        }
        return true;
    }
}
