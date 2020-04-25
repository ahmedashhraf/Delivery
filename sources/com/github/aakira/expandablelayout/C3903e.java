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
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.aakira.expandablelayout.e */
/* compiled from: ExpandableRelativeLayout */
public class C3903e extends RelativeLayout implements C3900b {

    /* renamed from: N */
    private int f12346N;

    /* renamed from: O */
    private boolean f12347O;

    /* renamed from: P */
    private int f12348P;

    /* renamed from: Q */
    private int f12349Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public int f12350R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C3901c f12351S;

    /* renamed from: T */
    private ExpandableSavedState f12352T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public boolean f12353U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public int f12354V;

    /* renamed from: W */
    private boolean f12355W;

    /* renamed from: a */
    private int f12356a;

    /* renamed from: a0 */
    private boolean f12357a0;

    /* renamed from: b */
    private TimeInterpolator f12358b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public boolean f12359b0;

    /* renamed from: c0 */
    private List<Integer> f12360c0;

    /* renamed from: d0 */
    private List<Integer> f12361d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public OnGlobalLayoutListener f12362e0;

    /* renamed from: com.github.aakira.expandablelayout.e$a */
    /* compiled from: ExpandableRelativeLayout */
    class C3904a implements AnimatorUpdateListener {
        C3904a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C3903e.this.m17049d()) {
                C3903e.this.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            } else {
                C3903e.this.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            }
            C3903e.this.requestLayout();
        }
    }

    /* renamed from: com.github.aakira.expandablelayout.e$b */
    /* compiled from: ExpandableRelativeLayout */
    class C3905b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f12364a;

        C3905b(int i) {
            this.f12364a = i;
        }

        public void onAnimationEnd(Animator animator) {
            boolean z = false;
            C3903e.this.f12359b0 = false;
            C3903e eVar = C3903e.this;
            if (this.f12364a > eVar.f12350R) {
                z = true;
            }
            eVar.f12353U = z;
            if (C3903e.this.f12351S != null) {
                C3903e.this.f12351S.mo17225a();
                if (this.f12364a == C3903e.this.f12354V) {
                    C3903e.this.f12351S.mo17230f();
                    return;
                }
                if (this.f12364a == C3903e.this.f12350R) {
                    C3903e.this.f12351S.mo17228d();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C3903e.this.f12359b0 = true;
            if (C3903e.this.f12351S != null) {
                C3903e.this.f12351S.mo17226b();
                if (C3903e.this.f12354V == this.f12364a) {
                    C3903e.this.f12351S.mo17229e();
                    return;
                }
                if (C3903e.this.f12350R == this.f12364a) {
                    C3903e.this.f12351S.mo17227c();
                }
            }
        }
    }

    /* renamed from: com.github.aakira.expandablelayout.e$c */
    /* compiled from: ExpandableRelativeLayout */
    class C3906c implements OnGlobalLayoutListener {
        C3906c() {
        }

        public void onGlobalLayout() {
            if (VERSION.SDK_INT < 16) {
                C3903e.this.getViewTreeObserver().removeGlobalOnLayoutListener(C3903e.this.f12362e0);
            } else {
                C3903e.this.getViewTreeObserver().removeOnGlobalLayoutListener(C3903e.this.f12362e0);
            }
            C3903e.this.f12351S.mo17225a();
            if (C3903e.this.f12353U) {
                C3903e.this.f12351S.mo17230f();
            } else {
                C3903e.this.f12351S.mo17228d();
            }
        }
    }

    public C3903e(Context context) {
        this(context, null);
    }

    private void setLayoutSize(int i) {
        if (m17049d()) {
            getLayoutParams().height = i;
        } else {
            getLayoutParams().width = i;
        }
    }

    public int getClosePosition() {
        return this.f12350R;
    }

    public int getCurrentPosition() {
        return m17049d() ? getMeasuredHeight() : getMeasuredWidth();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f12355W) {
            this.f12361d0.clear();
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                this.f12361d0.add(Integer.valueOf((int) (m17049d() ? getChildAt(i5).getY() : getChildAt(i5).getX())));
            }
            if (!this.f12347O) {
                setLayoutSize(this.f12350R);
            }
            int size = this.f12360c0.size();
            int i6 = this.f12348P;
            if (size > i6 && size > 0) {
                mo17234b(i6, 0, null);
            }
            int i7 = this.f12349Q;
            if (i7 > 0) {
                int i8 = this.f12354V;
                if (i8 >= i7 && i8 > 0) {
                    mo17232a(i7, 0, (TimeInterpolator) null);
                }
            }
            this.f12355W = true;
            ExpandableSavedState expandableSavedState = this.f12352T;
            if (expandableSavedState != null) {
                setLayoutSize(expandableSavedState.getSize());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        if (!this.f12357a0) {
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            if (m17049d()) {
                int measuredHeight = getMeasuredHeight();
                super.onMeasure(i, makeMeasureSpec);
                this.f12354V = getMeasuredHeight();
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            } else {
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(makeMeasureSpec, i2);
                this.f12354V = getMeasuredWidth();
                setMeasuredDimension(measuredWidth, getMeasuredHeight());
            }
            this.f12360c0.clear();
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                List<Integer> list = this.f12360c0;
                if (m17049d()) {
                    i4 = childAt.getMeasuredHeight() + layoutParams.topMargin;
                    i3 = layoutParams.bottomMargin;
                } else {
                    i4 = childAt.getMeasuredWidth() + layoutParams.leftMargin;
                    i3 = layoutParams.rightMargin;
                }
                list.add(Integer.valueOf(i4 + i3));
            }
            this.f12357a0 = true;
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
        this.f12352T = expandableSavedState;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        ExpandableSavedState expandableSavedState = new ExpandableSavedState(super.onSaveInstanceState());
        expandableSavedState.setSize(getCurrentPosition());
        return expandableSavedState;
    }

    public void setClosePosition(int i) {
        this.f12350R = i;
    }

    public void setClosePositionIndex(int i) {
        this.f12350R = mo17231a(i);
    }

    public void setDuration(int i) {
        if (i >= 0) {
            this.f12356a = i;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animators cannot have negative duration: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public void setExpanded(boolean z) {
        int currentPosition = getCurrentPosition();
        if ((!z || currentPosition != this.f12354V) && (z || currentPosition != this.f12350R)) {
            this.f12353U = z;
            setLayoutSize(z ? this.f12354V : this.f12350R);
            requestLayout();
        }
    }

    public void setInterpolator(@C0193h0 TimeInterpolator timeInterpolator) {
        this.f12358b = timeInterpolator;
    }

    public void setListener(@C0193h0 C3901c cVar) {
        this.f12351S = cVar;
    }

    public void setOrientation(int i) {
        this.f12346N = i;
    }

    public void toggle() {
        mo17191a((long) this.f12356a, this.f12358b);
    }

    public C3903e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m17049d() {
        return this.f12346N == 1;
    }

    /* renamed from: e */
    private void m17050e() {
        C3901c cVar = this.f12351S;
        if (cVar != null) {
            cVar.mo17226b();
            if (this.f12353U) {
                this.f12351S.mo17229e();
            } else {
                this.f12351S.mo17227c();
            }
            this.f12362e0 = new C3906c();
            getViewTreeObserver().addOnGlobalLayoutListener(this.f12362e0);
        }
    }

    /* renamed from: c */
    public void mo17197c() {
        if (!this.f12359b0) {
            m17041a(getCurrentPosition(), this.f12354V, (long) this.f12356a, this.f12358b).start();
        }
    }

    public C3903e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12358b = new LinearInterpolator();
        this.f12350R = 0;
        this.f12354V = 0;
        this.f12355W = false;
        this.f12357a0 = false;
        this.f12359b0 = false;
        this.f12360c0 = new ArrayList();
        this.f12361d0 = new ArrayList();
        m17042a(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m17042a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3895R.styleable.expandableLayout, i, 0);
        this.f12356a = obtainStyledAttributes.getInteger(C3895R.styleable.expandableLayout_ael_duration, 300);
        this.f12347O = obtainStyledAttributes.getBoolean(C3895R.styleable.expandableLayout_ael_expanded, false);
        this.f12346N = obtainStyledAttributes.getInteger(C3895R.styleable.expandableLayout_ael_orientation, 1);
        this.f12348P = obtainStyledAttributes.getInteger(C3895R.styleable.expandableLayout_ael_defaultChildIndex, Integer.MAX_VALUE);
        this.f12349Q = obtainStyledAttributes.getDimensionPixelSize(C3895R.styleable.expandableLayout_ael_defaultPosition, Integer.MIN_VALUE);
        int integer = obtainStyledAttributes.getInteger(C3895R.styleable.expandableLayout_ael_interpolator, 8);
        obtainStyledAttributes.recycle();
        this.f12358b = C3911g.m17082a(integer);
        this.f12353U = this.f12347O;
    }

    /* renamed from: b */
    public void mo17196b(long j, @C0195i0 TimeInterpolator timeInterpolator) {
        if (!this.f12359b0) {
            if (j <= 0) {
                mo17232a(this.f12354V, j, timeInterpolator);
                return;
            }
            m17041a(getCurrentPosition(), this.f12354V, j, timeInterpolator).start();
        }
    }

    /* renamed from: c */
    public void mo17199c(long j, @C0195i0 TimeInterpolator timeInterpolator) {
        if (!this.f12359b0) {
            if (j <= 0) {
                mo17232a(this.f12350R, j, timeInterpolator);
                return;
            }
            m17041a(getCurrentPosition(), this.f12350R, j, timeInterpolator).start();
        }
    }

    /* renamed from: b */
    public void mo17193b() {
        if (!this.f12359b0) {
            m17041a(getCurrentPosition(), this.f12350R, (long) this.f12356a, this.f12358b).start();
        }
    }

    /* renamed from: c */
    public void mo17235c(int i) {
        mo17234b(i, (long) this.f12356a, this.f12358b);
    }

    /* renamed from: b */
    public void mo17233b(int i) {
        mo17232a(i, (long) this.f12356a, this.f12358b);
    }

    /* renamed from: b */
    public void mo17234b(int i, long j, @C0195i0 TimeInterpolator timeInterpolator) {
        if (!this.f12359b0) {
            int a = mo17231a(i) + (m17049d() ? getPaddingBottom() : getPaddingRight());
            if (j <= 0) {
                this.f12353U = a > this.f12350R;
                setLayoutSize(a);
                requestLayout();
                m17050e();
                return;
            }
            int currentPosition = getCurrentPosition();
            if (timeInterpolator == null) {
                timeInterpolator = this.f12358b;
            }
            m17041a(currentPosition, a, j, timeInterpolator).start();
        }
    }

    @TargetApi(21)
    public C3903e(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f12358b = new LinearInterpolator();
        this.f12350R = 0;
        this.f12354V = 0;
        this.f12355W = false;
        this.f12357a0 = false;
        this.f12359b0 = false;
        this.f12360c0 = new ArrayList();
        this.f12361d0 = new ArrayList();
        m17042a(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo17191a(long j, @C0195i0 TimeInterpolator timeInterpolator) {
        if (this.f12350R < getCurrentPosition()) {
            mo17199c(j, timeInterpolator);
        } else {
            mo17196b(j, timeInterpolator);
        }
    }

    /* renamed from: a */
    public boolean mo17192a() {
        return this.f12353U;
    }

    /* renamed from: a */
    public void mo17232a(int i, long j, @C0195i0 TimeInterpolator timeInterpolator) {
        if (!this.f12359b0 && i >= 0 && this.f12354V >= i) {
            if (j <= 0) {
                this.f12353U = i > this.f12350R;
                setLayoutSize(i);
                requestLayout();
                m17050e();
                return;
            }
            int currentPosition = getCurrentPosition();
            if (timeInterpolator == null) {
                timeInterpolator = this.f12358b;
            }
            m17041a(currentPosition, i, j, timeInterpolator).start();
        }
    }

    /* renamed from: a */
    public int mo17231a(int i) {
        if (i >= 0 && this.f12360c0.size() > i) {
            return ((Integer) this.f12361d0.get(i)).intValue() + ((Integer) this.f12360c0.get(i)).intValue();
        }
        throw new IllegalArgumentException("There aren't the view having this index.");
    }

    /* renamed from: a */
    private ValueAnimator m17041a(int i, int i2, long j, TimeInterpolator timeInterpolator) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setDuration(j);
        ofInt.setInterpolator(timeInterpolator);
        ofInt.addUpdateListener(new C3904a());
        ofInt.addListener(new C3905b(i2));
        return ofInt;
    }
}
