package com.futuremind.recyclerviewfastscroll.p163e;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import androidx.annotation.C0180b;
import com.futuremind.recyclerviewfastscroll.C3873R;

/* renamed from: com.futuremind.recyclerviewfastscroll.e.e */
/* compiled from: VisibilityAnimationManager */
public class C3887e {

    /* renamed from: a */
    protected final View f12300a;

    /* renamed from: b */
    protected AnimatorSet f12301b;

    /* renamed from: c */
    protected AnimatorSet f12302c;

    /* renamed from: d */
    private float f12303d;

    /* renamed from: e */
    private float f12304e;

    /* renamed from: com.futuremind.recyclerviewfastscroll.e.e$a */
    /* compiled from: VisibilityAnimationManager */
    class C3888a extends AnimatorListenerAdapter {

        /* renamed from: a */
        boolean f12305a;

        /* renamed from: b */
        final /* synthetic */ View f12306b;

        C3888a(View view) {
            this.f12306b = view;
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f12305a = true;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f12305a) {
                this.f12306b.setVisibility(4);
            }
            this.f12305a = false;
        }
    }

    /* renamed from: com.futuremind.recyclerviewfastscroll.e.e$b */
    /* compiled from: VisibilityAnimationManager */
    public static abstract class C3889b<T extends C3887e> {

        /* renamed from: a */
        protected final View f12308a;

        /* renamed from: b */
        protected int f12309b = C3873R.C3874animator.fastscroll__default_show;

        /* renamed from: c */
        protected int f12310c = C3873R.C3874animator.fastscroll__default_hide;

        /* renamed from: d */
        protected int f12311d = 1000;

        /* renamed from: e */
        protected float f12312e = 0.5f;

        /* renamed from: f */
        protected float f12313f = 0.5f;

        public C3889b(View view) {
            this.f12308a = view;
        }

        /* renamed from: a */
        public C3889b<T> mo17184a(@C0180b int i) {
            this.f12310c = i;
            return this;
        }

        /* renamed from: a */
        public abstract T mo17185a();

        /* renamed from: b */
        public C3889b<T> mo17187b(int i) {
            this.f12311d = i;
            return this;
        }

        /* renamed from: c */
        public C3889b<T> mo17188c(@C0180b int i) {
            this.f12309b = i;
            return this;
        }

        /* renamed from: a */
        public C3889b<T> mo17183a(float f) {
            this.f12312e = f;
            return this;
        }

        /* renamed from: b */
        public C3889b<T> mo17186b(float f) {
            this.f12313f = f;
            return this;
        }
    }

    /* renamed from: com.futuremind.recyclerviewfastscroll.e.e$c */
    /* compiled from: VisibilityAnimationManager */
    public static class C3890c extends C3889b<C3887e> {
        public C3890c(View view) {
            super(view);
        }

        /* renamed from: a */
        public C3887e mo17185a() {
            C3887e eVar = new C3887e(this.f12308a, this.f12309b, this.f12310c, this.f12312e, this.f12313f, this.f12311d);
            return eVar;
        }
    }

    protected C3887e(View view, @C0180b int i, @C0180b int i2, float f, float f2, int i3) {
        this.f12300a = view;
        this.f12303d = f;
        this.f12304e = f2;
        this.f12301b = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i2);
        this.f12301b.setStartDelay((long) i3);
        this.f12301b.setTarget(view);
        this.f12302c = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i);
        this.f12302c.setTarget(view);
        this.f12301b.addListener(new C3888a(view));
        mo17180c();
    }

    /* renamed from: a */
    public void mo17178a() {
        mo17180c();
        this.f12301b.start();
    }

    /* renamed from: b */
    public void mo17179b() {
        this.f12301b.cancel();
        if (this.f12300a.getVisibility() == 4) {
            this.f12300a.setVisibility(0);
            mo17180c();
            this.f12302c.start();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17180c() {
        View view = this.f12300a;
        view.setPivotX(this.f12303d * ((float) view.getMeasuredWidth()));
        View view2 = this.f12300a;
        view2.setPivotY(this.f12304e * ((float) view2.getMeasuredHeight()));
    }
}
