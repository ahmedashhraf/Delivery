package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6928p;

@RequiresApi(21)
/* renamed from: com.google.android.material.appbar.f */
/* compiled from: ViewUtilsLollipop */
class C5618f {

    /* renamed from: a */
    private static final int[] f16063a = {16843848};

    C5618f() {
    }

    /* renamed from: a */
    static void m24464a(@C0193h0 View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: a */
    static void m24466a(@C0193h0 View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray c = C6928p.m33264c(context, attributeSet, f16063a, i, i2, new int[0]);
        try {
            if (c.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, c.getResourceId(0, 0)));
            }
        } finally {
            c.recycle();
        }
    }

    /* renamed from: a */
    static void m24465a(@C0193h0 View view, float f) {
        int integer = view.getResources().getInteger(C5582R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        String str = "elevation";
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C5582R.attr.state_liftable, -C5582R.attr.state_lifted}, ObjectAnimator.ofFloat(view, str, new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, str, new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, str, new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
