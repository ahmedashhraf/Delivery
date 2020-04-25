package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0999l;
import com.google.android.material.C5582R;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.e */
/* compiled from: FlowLayout */
public class C6898e extends ViewGroup {

    /* renamed from: N */
    private boolean f19305N;

    /* renamed from: a */
    private int f19306a;

    /* renamed from: b */
    private int f19307b;

    public C6898e(@C0193h0 Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m33157a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C5582R.styleable.FlowLayout, 0, 0);
        this.f19306a = obtainStyledAttributes.getDimensionPixelSize(C5582R.styleable.FlowLayout_lineSpacing, 0);
        this.f19307b = obtainStyledAttributes.getDimensionPixelSize(C5582R.styleable.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.f19307b;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.f19306a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() != 0) {
            boolean z2 = true;
            if (C0962e0.m5566x(this) != 1) {
                z2 = false;
            }
            int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
            int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
            int paddingTop = getPaddingTop();
            int i7 = (i3 - i) - paddingLeft;
            int i8 = paddingRight;
            int i9 = paddingTop;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof MarginLayoutParams) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        i5 = C0999l.m5724c(marginLayoutParams);
                        i6 = C0999l.m5722b(marginLayoutParams);
                    } else {
                        i6 = 0;
                        i5 = 0;
                    }
                    int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                    if (!this.f19305N && measuredWidth > i7) {
                        i9 = paddingTop + this.f19306a;
                        i8 = paddingRight;
                    }
                    int i11 = i8 + i5;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                    int measuredHeight = childAt.getMeasuredHeight() + i9;
                    if (z2) {
                        childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i5, measuredHeight);
                    } else {
                        childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                    }
                    i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f19307b;
                    paddingTop = measuredHeight;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingRight = i5 - getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i6 = paddingTop;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i;
                int i10 = i2;
            } else {
                measureChild(childAt, i, i2);
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                int i11 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() > paddingRight && !mo22822a()) {
                    i6 = this.f19306a + paddingTop;
                    i11 = getPaddingLeft();
                }
                int measuredWidth = i11 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                if (measuredWidth > i7) {
                    i7 = measuredWidth;
                }
                int measuredWidth2 = i11 + i4 + i3 + childAt.getMeasuredWidth() + this.f19307b;
                if (i8 == getChildCount() - 1) {
                    i7 += i3;
                }
                paddingTop = measuredHeight;
                paddingLeft = measuredWidth2;
            }
        }
        setMeasuredDimension(m33156a(size, mode, i7 + getPaddingRight()), m33156a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f19307b = i;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f19306a = i;
    }

    public void setSingleLine(boolean z) {
        this.f19305N = z;
    }

    public C6898e(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6898e(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19305N = false;
        m33157a(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo22822a() {
        return this.f19305N;
    }

    @TargetApi(21)
    public C6898e(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f19305N = false;
        m33157a(context, attributeSet);
    }

    /* renamed from: a */
    private static int m33156a(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }
}
