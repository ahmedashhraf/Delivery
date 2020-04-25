package p053b.p068f.p071c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

@Deprecated
/* renamed from: b.f.c.a */
/* compiled from: Space */
public class C2126a extends View {
    @Deprecated
    public C2126a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    /* renamed from: a */
    private static int m11088a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0 || mode != 1073741824) {
            return i;
        }
        return size;
    }

    @SuppressLint({"MissingSuperCall"})
    @Deprecated
    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m11088a(getSuggestedMinimumWidth(), i), m11088a(getSuggestedMinimumHeight(), i2));
    }

    @Deprecated
    public C2126a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public C2126a(@C0193h0 Context context) {
        this(context, null);
    }
}
