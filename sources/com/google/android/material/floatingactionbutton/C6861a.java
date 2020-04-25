package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import androidx.annotation.C0195i0;

/* renamed from: com.google.android.material.floatingactionbutton.a */
/* compiled from: AnimatorTracker */
class C6861a {
    @C0195i0

    /* renamed from: a */
    private Animator f19129a;

    C6861a() {
    }

    /* renamed from: a */
    public void mo27384a(Animator animator) {
        mo27383a();
        this.f19129a = animator;
    }

    /* renamed from: b */
    public void mo27385b() {
        this.f19129a = null;
    }

    /* renamed from: a */
    public void mo27383a() {
        Animator animator = this.f19129a;
        if (animator != null) {
            animator.cancel();
        }
    }
}
