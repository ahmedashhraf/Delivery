package com.instabug.library.p397ui.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.viewpager.widget.ViewPager;
import p076c.p112d.p148d.p150g.C6637f;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.ui.custom.InstabugViewPager */
public class InstabugViewPager extends ViewPager {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private boolean autoHeight = false;
    private boolean swipeable = true;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6818541209036095275L, "com/instabug/library/ui/custom/InstabugViewPager", 32);
        $jacocoData = a;
        return a;
    }

    public InstabugViewPager(Context context, AttributeSet attributeSet) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context, attributeSet);
        $jacocoInit[0] = true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.swipeable) {
            $jacocoInit[4] = true;
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            $jacocoInit[5] = true;
            return onInterceptTouchEvent;
        }
        $jacocoInit[6] = true;
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!this.autoHeight) {
            $jacocoInit[18] = true;
        } else {
            $jacocoInit[19] = true;
            $jacocoInit[20] = true;
            int i3 = 0;
            int i4 = 0;
            while (i3 < getChildCount()) {
                $jacocoInit[21] = true;
                View childAt = getChildAt(i3);
                $jacocoInit[22] = true;
                childAt.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
                $jacocoInit[23] = true;
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight <= i4) {
                    $jacocoInit[24] = true;
                } else {
                    $jacocoInit[25] = true;
                    i4 = measuredHeight;
                }
                i3++;
                $jacocoInit[26] = true;
            }
            if (i4 == 0) {
                $jacocoInit[27] = true;
            } else {
                $jacocoInit[28] = true;
                i2 = MeasureSpec.makeMeasureSpec(i4, C6637f.f18605b);
                $jacocoInit[29] = true;
            }
        }
        super.onMeasure(i, i2);
        $jacocoInit[30] = true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.swipeable) {
            $jacocoInit[1] = true;
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            $jacocoInit[2] = true;
            return onTouchEvent;
        }
        $jacocoInit[3] = true;
        return false;
    }

    public void scrollBackward(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        if (getAdapter() == null) {
            $jacocoInit[13] = true;
        } else if (getCurrentItem() <= 0) {
            $jacocoInit[14] = true;
        } else {
            $jacocoInit[15] = true;
            setCurrentItem(getCurrentItem() - 1, z);
            $jacocoInit[16] = true;
        }
        $jacocoInit[17] = true;
    }

    public void scrollForward(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        if (getAdapter() == null) {
            $jacocoInit[8] = true;
        } else if (getAdapter().mo8886a() - 1 <= getCurrentItem()) {
            $jacocoInit[9] = true;
        } else {
            $jacocoInit[10] = true;
            setCurrentItem(getCurrentItem() + 1, z);
            $jacocoInit[11] = true;
        }
        $jacocoInit[12] = true;
    }

    public void setAutoHeight(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.autoHeight = z;
        $jacocoInit[31] = true;
    }

    public void setSwipeable(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.swipeable = z;
        $jacocoInit[7] = true;
    }
}
