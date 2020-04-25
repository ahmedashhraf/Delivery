package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.core.p034l.C0962e0;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: O */
    private static final int f1652O = 16;

    /* renamed from: N */
    private int f1653N = 0;

    /* renamed from: a */
    private boolean f1654a;

    /* renamed from: b */
    private int f1655b = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0238R.styleable.ButtonBarLayout);
        if (VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C0238R.styleable.ButtonBarLayout, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.f1654a = obtainStyledAttributes.getBoolean(C0238R.styleable.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m2440a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0238R.C0241id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public int getMinimumHeight() {
        return Math.max(this.f1653N, super.getMinimumHeight());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f1654a) {
            if (size > this.f1655b && m2441a()) {
                setStacked(false);
            }
            this.f1655b = size;
        }
        if (m2441a() || MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1654a && !m2441a()) {
            if ((getMeasuredWidthAndState() & C0962e0.f4343t) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = m2440a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m2441a()) {
                int a2 = m2440a(a + 1);
                if (a2 >= 0) {
                    paddingTop += getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (C0962e0.m5399C(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1654a != z) {
            this.f1654a = z;
            if (!this.f1654a && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    /* renamed from: a */
    private boolean m2441a() {
        return getOrientation() == 1;
    }
}
