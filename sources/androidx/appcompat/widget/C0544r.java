package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.appcompat.C0238R;

/* renamed from: androidx.appcompat.widget.r */
/* compiled from: AppCompatRatingBar */
public class C0544r extends RatingBar {

    /* renamed from: a */
    private final C0539p f2178a;

    public C0544r(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.f2178a.mo2832a();
        if (a != null) {
            setMeasuredDimension(View.resolveSizeAndState(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C0544r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0238R.attr.ratingBarStyle);
    }

    public C0544r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2178a = new C0539p(this);
        this.f2178a.mo2833a(attributeSet, i);
    }
}
