package com.viewpagerindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

/* renamed from: com.viewpagerindicator.d */
/* compiled from: IcsLinearLayout */
class C12112d extends LinearLayout {

    /* renamed from: Q */
    private static final int[] f35093Q = {16843049, 16843561, 16843562};

    /* renamed from: R */
    private static final int f35094R = 0;

    /* renamed from: S */
    private static final int f35095S = 1;

    /* renamed from: T */
    private static final int f35096T = 2;

    /* renamed from: N */
    private int f35097N;

    /* renamed from: O */
    private int f35098O;

    /* renamed from: P */
    private int f35099P;

    /* renamed from: a */
    private Drawable f35100a;

    /* renamed from: b */
    private int f35101b;

    public C12112d(Context context, int i) {
        super(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f35093Q, i, 0);
        setDividerDrawable(obtainStyledAttributes.getDrawable(0));
        this.f35099P = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f35098O = obtainStyledAttributes.getInteger(1, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m54714a(Canvas canvas) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt == null || childAt.getVisibility() == 8 || !m54716a(i2))) {
                m54718b(canvas, childAt.getLeft() - ((LayoutParams) childAt.getLayoutParams()).leftMargin);
            }
        }
        if (m54716a(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 == null) {
                i = (getWidth() - getPaddingRight()) - this.f35101b;
            } else {
                i = childAt2.getRight();
            }
            m54718b(canvas, i);
        }
    }

    /* renamed from: b */
    private void m54717b(Canvas canvas) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt == null || childAt.getVisibility() == 8 || !m54716a(i2))) {
                m54715a(canvas, childAt.getTop() - ((LayoutParams) childAt.getLayoutParams()).topMargin);
            }
        }
        if (m54716a(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 == null) {
                i = (getHeight() - getPaddingBottom()) - this.f35097N;
            } else {
                i = childAt2.getBottom();
            }
            m54715a(canvas, i);
        }
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int indexOfChild = indexOfChild(view);
        int orientation = getOrientation();
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (m54716a(indexOfChild)) {
            if (orientation == 1) {
                layoutParams.topMargin = this.f35097N;
            } else {
                layoutParams.leftMargin = this.f35101b;
            }
        }
        int childCount = getChildCount();
        if (indexOfChild == childCount - 1 && m54716a(childCount)) {
            if (orientation == 1) {
                layoutParams.bottomMargin = this.f35097N;
            } else {
                layoutParams.rightMargin = this.f35101b;
            }
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f35100a != null) {
            if (getOrientation() == 1) {
                m54717b(canvas);
            } else {
                m54714a(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f35100a) {
            this.f35100a = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f35101b = drawable.getIntrinsicWidth();
                this.f35097N = drawable.getIntrinsicHeight();
            } else {
                this.f35101b = 0;
                this.f35097N = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    /* renamed from: a */
    private void m54715a(Canvas canvas, int i) {
        this.f35100a.setBounds(getPaddingLeft() + this.f35099P, i, (getWidth() - getPaddingRight()) - this.f35099P, this.f35097N + i);
        this.f35100a.draw(canvas);
    }

    /* renamed from: b */
    private void m54718b(Canvas canvas, int i) {
        this.f35100a.setBounds(i, getPaddingTop() + this.f35099P, this.f35101b + i, (getHeight() - getPaddingBottom()) - this.f35099P);
        this.f35100a.draw(canvas);
    }

    /* renamed from: a */
    private boolean m54716a(int i) {
        if (i == 0 || i == getChildCount() || (this.f35098O & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }
}
