package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import androidx.annotation.C0180b;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.C6854h;
import com.google.android.material.p179a.C5594h;
import java.util.List;

/* renamed from: com.google.android.material.floatingactionbutton.f */
/* compiled from: MotionStrategy */
interface C6881f {
    /* renamed from: a */
    void mo27280a();

    /* renamed from: a */
    void mo27386a(@C0193h0 AnimatorListener animatorListener);

    /* renamed from: a */
    void mo27387a(@C0195i0 C5594h hVar);

    /* renamed from: a */
    void mo27281a(@C0195i0 C6854h hVar);

    /* renamed from: b */
    void mo27287b();

    /* renamed from: b */
    void mo27389b(@C0193h0 AnimatorListener animatorListener);

    /* renamed from: c */
    C5594h mo27390c();

    @C0180b
    /* renamed from: d */
    int mo27282d();

    /* renamed from: e */
    void mo27283e();

    @C0195i0
    /* renamed from: f */
    C5594h mo27391f();

    /* renamed from: g */
    boolean mo27284g();

    /* renamed from: h */
    AnimatorSet mo27285h();

    /* renamed from: i */
    List<AnimatorListener> mo27392i();

    void onAnimationStart(Animator animator);
}
