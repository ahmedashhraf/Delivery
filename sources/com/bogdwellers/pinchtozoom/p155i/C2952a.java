package com.bogdwellers.pinchtozoom.p155i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;

/* renamed from: com.bogdwellers.pinchtozoom.i.a */
/* compiled from: ImageViewPager */
public class C2952a extends ViewPager {

    /* renamed from: N */
    private static final String f10455N = C2952a.class.getSimpleName();

    /* renamed from: O */
    private static final float f10456O = 1.2f;

    /* renamed from: P */
    private static final float[] f10457P = new float[9];

    /* renamed from: a */
    private float f10458a = f10456O;

    /* renamed from: b */
    private int f10459b;

    public C2952a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static final float m14129a(float f, float f2, float f3, float f4) {
        return f / f2 <= f3 / f4 ? f / f3 : f2 / f4;
    }

    /* renamed from: a */
    public static final boolean m14130a(float f, float f2, float f3) {
        return f3 >= f2 && (f > 0.0f || f < f2 - f3);
    }

    /* access modifiers changed from: protected */
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                float width = (float) imageView.getWidth();
                float height = (float) imageView.getHeight();
                float intrinsicWidth = (float) drawable.getIntrinsicWidth();
                float intrinsicHeight = (float) drawable.getIntrinsicHeight();
                imageView.getImageMatrix().getValues(f10457P);
                float[] fArr = f10457P;
                float f = fArr[2] + ((float) i);
                boolean z2 = false;
                float f2 = fArr[0] * intrinsicWidth;
                if (fArr[0] / m14129a(width, height, intrinsicWidth, intrinsicHeight) > this.f10458a && !m14130a(f, width, f2) && f2 > width && this.f10459b == 1) {
                    z2 = true;
                }
                return z2;
            }
        }
        return super.canScroll(view, z, i, i2, i3);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f10459b = motionEvent.getPointerCount();
        boolean z = true;
        if (this.f10459b <= 1) {
            z = false;
        }
        requestDisallowInterceptTouchEvent(z);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setScaleThreshold(float f) {
        this.f10458a = f;
    }
}
