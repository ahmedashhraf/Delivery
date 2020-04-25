package com.github.aakira.expandablelayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: com.github.aakira.expandablelayout.f */
/* compiled from: ExpandableWeightLayout */
public class C3907f extends RelativeLayout implements C3900b {

    /* renamed from: N */
    private boolean f12367N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C3901c f12368O;

    /* renamed from: P */
    private ExpandableSavedState f12369P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public boolean f12370Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public float f12371R;

    /* renamed from: S */
    private boolean f12372S;

    /* renamed from: T */
    private boolean f12373T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public boolean f12374U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public OnGlobalLayoutListener f12375V;

    /* renamed from: a */
    private int f12376a;

    /* renamed from: b */
    private TimeInterpolator f12377b;

    /* renamed from: com.github.aakira.expandablelayout.f$a */
    /* compiled from: ExpandableWeightLayout */
    class C3908a implements AnimatorUpdateListener {
        C3908a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3907f.this.setWeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
            C3907f.this.requestLayout();
        }
    }

    /* renamed from: com.github.aakira.expandablelayout.f$b */
    /* compiled from: ExpandableWeightLayout */
    class C3909b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ float f12379a;

        C3909b(float f) {
            this.f12379a = f;
        }

        public void onAnimationEnd(Animator animator) {
            boolean z = false;
            C3907f.this.f12374U = false;
            C3907f fVar = C3907f.this;
            if (this.f12379a > 0.0f) {
                z = true;
            }
            fVar.f12370Q = z;
            if (C3907f.this.f12368O != null) {
                C3907f.this.f12368O.mo17225a();
                if (this.f12379a == C3907f.this.f12371R) {
                    C3907f.this.f12368O.mo17230f();
                    return;
                }
                if (this.f12379a == 0.0f) {
                    C3907f.this.f12368O.mo17228d();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C3907f.this.f12374U = true;
            if (C3907f.this.f12368O != null) {
                C3907f.this.f12368O.mo17226b();
                float b = C3907f.this.f12371R;
                float f = this.f12379a;
                if (b == f) {
                    C3907f.this.f12368O.mo17229e();
                    return;
                }
                if (0.0f == f) {
                    C3907f.this.f12368O.mo17227c();
                }
            }
        }
    }

    /* renamed from: com.github.aakira.expandablelayout.f$c */
    /* compiled from: ExpandableWeightLayout */
    class C3910c implements OnGlobalLayoutListener {
        C3910c() {
        }

        public void onGlobalLayout() {
            if (VERSION.SDK_INT < 16) {
                C3907f.this.getViewTreeObserver().removeGlobalOnLayoutListener(C3907f.this.f12375V);
            } else {
                C3907f.this.getViewTreeObserver().removeOnGlobalLayoutListener(C3907f.this.f12375V);
            }
            C3907f.this.f12368O.mo17225a();
            if (C3907f.this.f12370Q) {
                C3907f.this.f12368O.mo17230f();
            } else {
                C3907f.this.f12368O.mo17228d();
            }
        }
    }

    public C3907f(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    public void setWeight(float f) {
        ((LayoutParams) getLayoutParams()).weight = f;
    }

    public float getCurrentWeight() {
        return ((LayoutParams) getLayoutParams()).weight;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(getLayoutParams() instanceof LayoutParams)) {
            throw new AssertionError("You must arrange in LinearLayout.");
        } else if (0.0f >= getCurrentWeight()) {
            throw new AssertionError("You must set a weight than 0.");
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f12373T) {
            this.f12371R = getCurrentWeight();
            this.f12373T = true;
        }
        if (!this.f12372S) {
            setWeight(this.f12367N ? this.f12371R : 0.0f);
            this.f12372S = true;
            ExpandableSavedState expandableSavedState = this.f12369P;
            if (expandableSavedState != null) {
                setWeight(expandableSavedState.getWeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExpandableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExpandableSavedState expandableSavedState = (ExpandableSavedState) parcelable;
        super.onRestoreInstanceState(expandableSavedState.getSuperState());
        this.f12369P = expandableSavedState;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        ExpandableSavedState expandableSavedState = new ExpandableSavedState(super.onSaveInstanceState());
        expandableSavedState.setWeight(getCurrentWeight());
        return expandableSavedState;
    }

    public void setDuration(@C0193h0 int i) {
        if (i >= 0) {
            this.f12376a = i;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animators cannot have negative duration: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public void setExpandWeight(float f) {
        this.f12371R = f;
    }

    public void setExpanded(boolean z) {
        float currentWeight = getCurrentWeight();
        if (!z || currentWeight != this.f12371R) {
            float f = 0.0f;
            if (z || currentWeight != 0.0f) {
                this.f12370Q = z;
                if (z) {
                    f = this.f12371R;
                }
                setWeight(f);
                requestLayout();
            }
        }
    }

    public void setInterpolator(@C0193h0 TimeInterpolator timeInterpolator) {
        this.f12377b = timeInterpolator;
    }

    public void setListener(@C0193h0 C3901c cVar) {
        this.f12368O = cVar;
    }

    public void toggle() {
        mo17191a((long) this.f12376a, this.f12377b);
    }

    public C3907f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    private void m17073d() {
        C3901c cVar = this.f12368O;
        if (cVar != null) {
            cVar.mo17226b();
            if (this.f12370Q) {
                this.f12368O.mo17229e();
            } else {
                this.f12368O.mo17227c();
            }
            this.f12375V = new C3910c();
            getViewTreeObserver().addOnGlobalLayoutListener(this.f12375V);
        }
    }

    /* renamed from: c */
    public void mo17197c() {
        if (!this.f12374U) {
            m17064a(0.0f, this.f12371R, (long) this.f12376a, this.f12377b).start();
        }
    }

    public C3907f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12377b = new LinearInterpolator();
        this.f12371R = 0.0f;
        this.f12372S = false;
        this.f12373T = false;
        this.f12374U = false;
        m17066a(context, attributeSet, i);
    }

    /* renamed from: b */
    public void mo17196b(long j, @C0195i0 TimeInterpolator timeInterpolator) {
        if (!this.f12374U) {
            if (j <= 0) {
                this.f12370Q = true;
                setWeight(this.f12371R);
                requestLayout();
                m17073d();
                return;
            }
            m17064a(getCurrentWeight(), this.f12371R, j, timeInterpolator).start();
        }
    }

    /* renamed from: a */
    private void m17066a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3895R.styleable.expandableLayout, i, 0);
        this.f12376a = obtainStyledAttributes.getInteger(C3895R.styleable.expandableLayout_ael_duration, 300);
        this.f12367N = obtainStyledAttributes.getBoolean(C3895R.styleable.expandableLayout_ael_expanded, false);
        int integer = obtainStyledAttributes.getInteger(C3895R.styleable.expandableLayout_ael_interpolator, 8);
        obtainStyledAttributes.recycle();
        this.f12377b = C3911g.m17082a(integer);
        this.f12370Q = this.f12367N;
    }

    /* renamed from: c */
    public void mo17199c(long j, @C0195i0 TimeInterpolator timeInterpolator) {
        if (!this.f12374U) {
            if (j <= 0) {
                this.f12370Q = false;
                setWeight(0.0f);
                requestLayout();
                m17073d();
                return;
            }
            m17064a(getCurrentWeight(), 0.0f, j, timeInterpolator).start();
        }
    }

    /* renamed from: b */
    public void mo17193b() {
        if (!this.f12374U) {
            m17064a(getCurrentWeight(), 0.0f, (long) this.f12376a, this.f12377b).start();
        }
    }

    @TargetApi(21)
    public C3907f(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f12377b = new LinearInterpolator();
        this.f12371R = 0.0f;
        this.f12372S = false;
        this.f12373T = false;
        this.f12374U = false;
        m17066a(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo17191a(long j, @C0195i0 TimeInterpolator timeInterpolator) {
        if (0.0f < getCurrentWeight()) {
            mo17199c(j, timeInterpolator);
        } else {
            mo17196b(j, timeInterpolator);
        }
    }

    /* renamed from: a */
    public boolean mo17192a() {
        return this.f12370Q;
    }

    /* renamed from: a */
    public void mo17249a(float f) {
        mo17250a(f, (long) this.f12376a, this.f12377b);
    }

    /* renamed from: a */
    public void mo17250a(float f, long j, @C0195i0 TimeInterpolator timeInterpolator) {
        if (!this.f12374U) {
            if (j <= 0) {
                this.f12370Q = f > 0.0f;
                setWeight(f);
                requestLayout();
                m17073d();
                return;
            }
            m17064a(getCurrentWeight(), f, j, timeInterpolator).start();
        }
    }

    /* renamed from: a */
    private ValueAnimator m17064a(float f, float f2, long j, @C0195i0 TimeInterpolator timeInterpolator) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(j);
        if (timeInterpolator == null) {
            timeInterpolator = this.f12377b;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new C3908a());
        ofFloat.addListener(new C3909b(f2));
        return ofFloat;
    }
}
