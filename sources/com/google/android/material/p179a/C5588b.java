package com.google.android.material.p179a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.util.List;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.a.b */
/* compiled from: AnimatorSetCompat */
public class C5588b {
    /* renamed from: a */
    public static void m24253a(@C0193h0 AnimatorSet animatorSet, @C0193h0 List<Animator> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
