package com.mrsool.customeview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import com.mrsool.utils.C5880q;

/* renamed from: com.mrsool.customeview.g */
/* compiled from: LimitedRelativeLayout */
public class C10780g extends RelativeLayout {

    /* renamed from: b */
    public static int f29628b = -1;

    /* renamed from: a */
    int f29629a = 1050;

    public C10780g(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        try {
            int size = MeasureSpec.getSize(i2);
            if (this.f29629a != f29628b && size > this.f29629a) {
                size = this.f29629a;
            }
            i2 = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            getLayoutParams().height = size;
        } catch (Exception unused) {
            C5880q.m25751b("onMesure Error forcing height");
        } catch (Throwable th) {
            super.onMeasure(i, i2);
            throw th;
        }
        super.onMeasure(i, i2);
    }

    public C10780g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C10780g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
