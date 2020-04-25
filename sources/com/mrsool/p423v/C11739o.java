package com.mrsool.p423v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C2022m;
import p076c.p112d.p148d.p150g.C6637f;

/* renamed from: com.mrsool.v.o */
/* compiled from: WrapContentViewPager */
public class C11739o extends ViewPager {

    /* renamed from: com.mrsool.v.o$a */
    /* compiled from: WrapContentViewPager */
    class C11740a extends C2022m {
        C11740a() {
        }

        /* renamed from: c */
        public void mo8880c(int i) {
            C11739o.this.requestLayout();
        }
    }

    public C11739o(Context context) {
        super(context);
        m52822a();
    }

    /* renamed from: a */
    private void m52822a() {
        addOnPageChangeListener(new C11740a());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View childAt = getChildAt(getCurrentItem());
        if (childAt != null) {
            childAt.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
            i2 = MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), C6637f.f18605b);
        }
        super.onMeasure(i, i2);
    }

    public C11739o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m52822a();
    }
}
