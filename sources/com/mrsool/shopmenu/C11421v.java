package com.mrsool.shopmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ExpandableListView;

/* renamed from: com.mrsool.shopmenu.v */
/* compiled from: NonScrollExpandableListView */
public class C11421v extends ExpandableListView {
    public C11421v(Context context) {
        super(context);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    public C11421v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C11421v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
