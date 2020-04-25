package com.mrsool.customeview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;

/* renamed from: com.mrsool.customeview.i */
/* compiled from: RTLViewPager */
public class C10782i extends ViewPager {

    /* renamed from: a */
    private boolean f29630a;

    public C10782i(Context context) {
        this(context, null);
    }

    public void setRtlOriented(boolean z) {
        this.f29630a = z;
        if (!this.f29630a || getAdapter() == null) {
            setCurrentItem(0);
        } else {
            setCurrentItem(getAdapter().mo8886a() - 1);
        }
    }

    public C10782i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
