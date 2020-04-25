package com.instabug.library.p397ui.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.ui.custom.InstabugScrollView */
public class InstabugScrollView extends ScrollView {
    private static transient /* synthetic */ boolean[] $jacocoData;
    OnScrollListener onScrollListener;

    /* renamed from: com.instabug.library.ui.custom.InstabugScrollView$OnScrollListener */
    public interface OnScrollListener {
        void onBottomReached();

        void onScrolling();

        void onTopReached();
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3557181497250827953L, "com/instabug/library/ui/custom/InstabugScrollView", 18);
        $jacocoData = a;
        return a;
    }

    public InstabugScrollView(Context context, AttributeSet attributeSet, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context, attributeSet, i);
        $jacocoInit[0] = true;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        boolean[] $jacocoInit = $jacocoInit();
        View childAt = getChildAt(getChildCount() - 1);
        $jacocoInit[3] = true;
        int bottom = childAt.getBottom() - (getHeight() + getScrollY());
        if (bottom != 0) {
            $jacocoInit[4] = true;
        } else {
            OnScrollListener onScrollListener2 = this.onScrollListener;
            if (onScrollListener2 == null) {
                $jacocoInit[5] = true;
            } else {
                $jacocoInit[6] = true;
                onScrollListener2.onBottomReached();
                $jacocoInit[7] = true;
                super.onScrollChanged(i, i2, i3, i4);
                $jacocoInit[16] = true;
            }
        }
        if (getScrollY() != 0) {
            $jacocoInit[8] = true;
        } else {
            OnScrollListener onScrollListener3 = this.onScrollListener;
            if (onScrollListener3 == null) {
                $jacocoInit[9] = true;
            } else {
                $jacocoInit[10] = true;
                onScrollListener3.onTopReached();
                $jacocoInit[11] = true;
                super.onScrollChanged(i, i2, i3, i4);
                $jacocoInit[16] = true;
            }
        }
        if (bottom <= 0) {
            $jacocoInit[12] = true;
        } else {
            OnScrollListener onScrollListener4 = this.onScrollListener;
            if (onScrollListener4 == null) {
                $jacocoInit[13] = true;
            } else {
                $jacocoInit[14] = true;
                onScrollListener4.onScrolling();
                $jacocoInit[15] = true;
            }
        }
        super.onScrollChanged(i, i2, i3, i4);
        $jacocoInit[16] = true;
    }

    public void setOnScrollListener(OnScrollListener onScrollListener2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.onScrollListener = onScrollListener2;
        $jacocoInit[17] = true;
    }

    public InstabugScrollView(Context context, AttributeSet attributeSet) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context, attributeSet);
        $jacocoInit[1] = true;
    }

    public InstabugScrollView(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context);
        $jacocoInit[2] = true;
    }
}
