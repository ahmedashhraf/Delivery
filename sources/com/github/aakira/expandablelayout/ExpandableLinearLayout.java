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
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.util.ArrayList;
import java.util.List;
import p076c.p112d.p148d.p150g.C6637f;

public class ExpandableLinearLayout extends LinearLayout implements C3900b {

    /* renamed from: N */
    private boolean f12314N;

    /* renamed from: O */
    private int f12315O;

    /* renamed from: P */
    private int f12316P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public int f12317Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C3901c f12318R;

    /* renamed from: S */
    private ExpandableSavedState f12319S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public boolean f12320T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f12321U;

    /* renamed from: V */
    private boolean f12322V;

    /* renamed from: W */
    private boolean f12323W;

    /* renamed from: a */
    private int f12324a;

    /* renamed from: a0 */
    private boolean f12325a0;

    /* renamed from: b */
    private TimeInterpolator f12326b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public boolean f12327b0;

    /* renamed from: c0 */
    private boolean f12328c0;

    /* renamed from: d0 */
    private List<Integer> f12329d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public OnGlobalLayoutListener f12330e0;

    /* renamed from: com.github.aakira.expandablelayout.ExpandableLinearLayout$a */
    class C3891a implements AnimatorUpdateListener {
        C3891a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (ExpandableLinearLayout.this.m17007e()) {
                ExpandableLinearLayout.this.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            } else {
                ExpandableLinearLayout.this.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            }
            ExpandableLinearLayout.this.requestLayout();
        }
    }

    /* renamed from: com.github.aakira.expandablelayout.ExpandableLinearLayout$b */
    class C3892b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f12332a;

        C3892b(int i) {
            this.f12332a = i;
        }

        public void onAnimationEnd(Animator animator) {
            boolean z = false;
            ExpandableLinearLayout.this.f12327b0 = false;
            ExpandableLinearLayout expandableLinearLayout = ExpandableLinearLayout.this;
            if (this.f12332a > expandableLinearLayout.f12317Q) {
                z = true;
            }
            expandableLinearLayout.f12320T = z;
            if (ExpandableLinearLayout.this.f12318R != null) {
                ExpandableLinearLayout.this.f12318R.mo17225a();
                if (this.f12332a == ExpandableLinearLayout.this.f12321U) {
                    ExpandableLinearLayout.this.f12318R.mo17230f();
                    return;
                }
                if (this.f12332a == ExpandableLinearLayout.this.f12317Q) {
                    ExpandableLinearLayout.this.f12318R.mo17228d();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            ExpandableLinearLayout.this.f12327b0 = true;
            if (ExpandableLinearLayout.this.f12318R != null) {
                ExpandableLinearLayout.this.f12318R.mo17226b();
                if (ExpandableLinearLayout.this.f12321U == this.f12332a) {
                    ExpandableLinearLayout.this.f12318R.mo17229e();
                    return;
                }
                if (ExpandableLinearLayout.this.f12317Q == this.f12332a) {
                    ExpandableLinearLayout.this.f12318R.mo17227c();
                }
            }
        }
    }

    /* renamed from: com.github.aakira.expandablelayout.ExpandableLinearLayout$c */
    class C3893c implements OnGlobalLayoutListener {
        C3893c() {
        }

        public void onGlobalLayout() {
            if (VERSION.SDK_INT < 16) {
                ExpandableLinearLayout.this.getViewTreeObserver().removeGlobalOnLayoutListener(ExpandableLinearLayout.this.f12330e0);
            } else {
                ExpandableLinearLayout.this.getViewTreeObserver().removeOnGlobalLayoutListener(ExpandableLinearLayout.this.f12330e0);
            }
            ExpandableLinearLayout.this.f12318R.mo17225a();
            if (ExpandableLinearLayout.this.f12320T) {
                ExpandableLinearLayout.this.f12318R.mo17230f();
            } else {
                ExpandableLinearLayout.this.f12318R.mo17228d();
            }
        }
    }

    public ExpandableLinearLayout(Context context) {
        this(context, null);
    }

    private void setLayoutSize(int i) {
        if (m17007e()) {
            getLayoutParams().height = i;
        } else {
            getLayoutParams().width = i;
        }
    }

    public int getClosePosition() {
        return this.f12317Q;
    }

    public int getCurrentPosition() {
        return m17007e() ? getMeasuredHeight() : getMeasuredWidth();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        super.onMeasure(i, i2);
        if (!this.f12325a0) {
            this.f12329d0.clear();
            int childCount = getChildCount();
            if (childCount > 0) {
                int i7 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = getChildAt(i8);
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    if (i8 > 0) {
                        i7 = ((Integer) this.f12329d0.get(i8 - 1)).intValue();
                    }
                    List<Integer> list = this.f12329d0;
                    if (m17007e()) {
                        i6 = childAt.getMeasuredHeight() + layoutParams.topMargin;
                        i5 = layoutParams.bottomMargin;
                    } else {
                        i6 = childAt.getMeasuredWidth() + layoutParams.leftMargin;
                        i5 = layoutParams.rightMargin;
                    }
                    list.add(Integer.valueOf(i6 + i5 + i7));
                }
                int intValue = ((Integer) this.f12329d0.get(childCount - 1)).intValue();
                if (m17007e()) {
                    i4 = getPaddingTop();
                    i3 = getPaddingBottom();
                } else {
                    i4 = getPaddingLeft();
                    i3 = getPaddingRight();
                }
                this.f12321U = intValue + i4 + i3;
                this.f12325a0 = true;
            } else {
                throw new IllegalStateException("The expandableLinearLayout must have at least one child");
            }
        }
        if (!this.f12323W) {
            if (!this.f12314N) {
                setLayoutSize(this.f12317Q);
            }
            if (this.f12322V) {
                setLayoutSize(this.f12328c0 ? this.f12321U : this.f12317Q);
            }
            int size = this.f12329d0.size();
            int i9 = this.f12315O;
            if (size > i9 && size > 0) {
                mo17195b(i9, 0, null);
            }
            int i10 = this.f12316P;
            if (i10 > 0) {
                int i11 = this.f12321U;
                if (i11 >= i10 && i11 > 0) {
                    mo17190a(i10, 0, (TimeInterpolator) null);
                }
            }
            this.f12323W = true;
            ExpandableSavedState expandableSavedState = this.f12319S;
            if (expandableSavedState != null) {
                setLayoutSize(expandableSavedState.getSize());
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
        this.f12319S = expandableSavedState;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        ExpandableSavedState expandableSavedState = new ExpandableSavedState(super.onSaveInstanceState());
        expandableSavedState.setSize(getCurrentPosition());
        return expandableSavedState;
    }

    public void setClosePosition(int i) {
        this.f12317Q = i;
    }

    public void setClosePositionIndex(int i) {
        this.f12317Q = mo17189a(i);
    }

    public void setDuration(int i) {
        if (i >= 0) {
            this.f12324a = i;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animators cannot have negative duration: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public void setExpanded(boolean z) {
        if (this.f12322V) {
            this.f12328c0 = z;
        }
        int currentPosition = getCurrentPosition();
        if ((!z || currentPosition != this.f12321U) && (z || currentPosition != this.f12317Q)) {
            this.f12320T = z;
            setLayoutSize(z ? this.f12321U : this.f12317Q);
            requestLayout();
        }
    }

    public void setInRecyclerView(boolean z) {
        this.f12322V = z;
    }

    public void setInterpolator(@C0193h0 TimeInterpolator timeInterpolator) {
        this.f12326b = timeInterpolator;
    }

    public void setListener(@C0193h0 C3901c cVar) {
        this.f12318R = cVar;
    }

    public void toggle() {
        mo17191a((long) this.f12324a, this.f12326b);
    }

    public ExpandableLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m17007e() {
        return getOrientation() == 1;
    }

    /* renamed from: f */
    private void m17010f() {
        C3901c cVar = this.f12318R;
        if (cVar != null) {
            cVar.mo17226b();
            if (this.f12320T) {
                this.f12318R.mo17229e();
            } else {
                this.f12318R.mo17227c();
            }
            this.f12330e0 = new C3893c();
            getViewTreeObserver().addOnGlobalLayoutListener(this.f12330e0);
        }
    }

    /* renamed from: c */
    public void mo17197c() {
        if (!this.f12327b0) {
            m16999a(getCurrentPosition(), this.f12321U, (long) this.f12324a, this.f12326b).start();
        }
    }

    /* renamed from: d */
    public void mo17200d() {
        this.f12317Q = 0;
        this.f12321U = 0;
        this.f12323W = false;
        this.f12325a0 = false;
        this.f12319S = null;
        if (m17007e()) {
            measure(MeasureSpec.makeMeasureSpec(getWidth(), C6637f.f18605b), MeasureSpec.makeMeasureSpec(getHeight(), 0));
        } else {
            measure(MeasureSpec.makeMeasureSpec(getWidth(), 0), MeasureSpec.makeMeasureSpec(getHeight(), C6637f.f18605b));
        }
    }

    public ExpandableLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12326b = new LinearInterpolator();
        this.f12317Q = 0;
        this.f12321U = 0;
        this.f12322V = false;
        this.f12323W = false;
        this.f12325a0 = false;
        this.f12327b0 = false;
        this.f12328c0 = false;
        this.f12329d0 = new ArrayList();
        m17000a(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m17000a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3895R.styleable.expandableLayout, i, 0);
        this.f12324a = obtainStyledAttributes.getInteger(C3895R.styleable.expandableLayout_ael_duration, 300);
        this.f12314N = obtainStyledAttributes.getBoolean(C3895R.styleable.expandableLayout_ael_expanded, false);
        this.f12315O = obtainStyledAttributes.getInteger(C3895R.styleable.expandableLayout_ael_defaultChildIndex, Integer.MAX_VALUE);
        this.f12316P = obtainStyledAttributes.getDimensionPixelSize(C3895R.styleable.expandableLayout_ael_defaultPosition, Integer.MIN_VALUE);
        int integer = obtainStyledAttributes.getInteger(C3895R.styleable.expandableLayout_ael_interpolator, 8);
        obtainStyledAttributes.recycle();
        this.f12326b = C3911g.m17082a(integer);
        this.f12320T = this.f12314N;
    }

    /* renamed from: b */
    public void mo17196b(long j, @C0195i0 TimeInterpolator timeInterpolator) {
        if (!this.f12327b0) {
            if (j <= 0) {
                mo17190a(this.f12321U, j, timeInterpolator);
                return;
            }
            m16999a(getCurrentPosition(), this.f12321U, j, timeInterpolator).start();
        }
    }

    /* renamed from: c */
    public void mo17199c(long j, @C0195i0 TimeInterpolator timeInterpolator) {
        if (!this.f12327b0) {
            if (j <= 0) {
                mo17190a(this.f12317Q, j, timeInterpolator);
                return;
            }
            m16999a(getCurrentPosition(), this.f12317Q, j, timeInterpolator).start();
        }
    }

    /* renamed from: b */
    public void mo17193b() {
        if (!this.f12327b0) {
            m16999a(getCurrentPosition(), this.f12317Q, (long) this.f12324a, this.f12326b).start();
        }
    }

    /* renamed from: c */
    public void mo17198c(int i) {
        mo17195b(i, (long) this.f12324a, this.f12326b);
    }

    /* renamed from: b */
    public void mo17194b(int i) {
        mo17190a(i, (long) this.f12324a, this.f12326b);
    }

    /* renamed from: b */
    public void mo17195b(int i, long j, @C0195i0 TimeInterpolator timeInterpolator) {
        if (!this.f12327b0) {
            int a = mo17189a(i) + (m17007e() ? getPaddingBottom() : getPaddingRight());
            if (j <= 0) {
                this.f12320T = a > this.f12317Q;
                setLayoutSize(a);
                requestLayout();
                m17010f();
                return;
            }
            int currentPosition = getCurrentPosition();
            if (timeInterpolator == null) {
                timeInterpolator = this.f12326b;
            }
            m16999a(currentPosition, a, j, timeInterpolator).start();
        }
    }

    /* renamed from: a */
    public void mo17191a(long j, @C0195i0 TimeInterpolator timeInterpolator) {
        if (this.f12317Q < getCurrentPosition()) {
            mo17199c(j, timeInterpolator);
        } else {
            mo17196b(j, timeInterpolator);
        }
    }

    @TargetApi(21)
    public ExpandableLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f12326b = new LinearInterpolator();
        this.f12317Q = 0;
        this.f12321U = 0;
        this.f12322V = false;
        this.f12323W = false;
        this.f12325a0 = false;
        this.f12327b0 = false;
        this.f12328c0 = false;
        this.f12329d0 = new ArrayList();
        m17000a(context, attributeSet, i);
    }

    /* renamed from: a */
    public boolean mo17192a() {
        return this.f12320T;
    }

    /* renamed from: a */
    public void mo17190a(int i, long j, @C0195i0 TimeInterpolator timeInterpolator) {
        if (!this.f12327b0 && i >= 0 && this.f12321U >= i) {
            if (j <= 0) {
                this.f12320T = i > this.f12317Q;
                setLayoutSize(i);
                requestLayout();
                m17010f();
                return;
            }
            int currentPosition = getCurrentPosition();
            if (timeInterpolator == null) {
                timeInterpolator = this.f12326b;
            }
            m16999a(currentPosition, i, j, timeInterpolator).start();
        }
    }

    /* renamed from: a */
    public int mo17189a(int i) {
        if (i >= 0 && this.f12329d0.size() > i) {
            return ((Integer) this.f12329d0.get(i)).intValue();
        }
        throw new IllegalArgumentException("There aren't the view having this index.");
    }

    /* renamed from: a */
    private ValueAnimator m16999a(int i, int i2, long j, TimeInterpolator timeInterpolator) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setDuration(j);
        ofInt.setInterpolator(timeInterpolator);
        ofInt.addUpdateListener(new C3891a());
        ofInt.addListener(new C3892b(i2));
        return ofInt;
    }
}
