package com.jackandphantom.circularimageview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class RoundedImage extends ImageView {

    /* renamed from: N */
    private float f27077N;

    /* renamed from: O */
    private float f27078O;

    /* renamed from: P */
    private final ScaleType f27079P;

    /* renamed from: a */
    private RectF f27080a;

    /* renamed from: b */
    private Path f27081b;

    public RoundedImage(Context context) {
        super(context);
        this.f27081b = new Path();
        this.f27077N = 20.0f;
        this.f27078O = this.f27077N;
        this.f27079P = ScaleType.FIT_XY;
        setScaleType(this.f27079P);
        m47231b();
    }

    /* renamed from: b */
    private void m47231b() {
        this.f27080a = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        Path path = this.f27081b;
        RectF rectF = this.f27080a;
        float f = this.f27078O;
        path.addRoundRect(rectF, f, f, Direction.CCW);
        invalidate();
    }

    /* renamed from: a */
    public int mo36393a() {
        return (int) this.f27078O;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.clipPath(this.f27081b);
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m47231b();
    }

    public void setRoundedRadius(int i) {
        this.f27078O = (float) i;
        invalidate();
    }

    public RoundedImage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        setScaleType(this.f27079P);
        m47231b();
    }

    public RoundedImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27081b = new Path();
        this.f27077N = 20.0f;
        this.f27078O = this.f27077N;
        this.f27079P = ScaleType.FIT_XY;
        setScaleType(this.f27079P);
        this.f27078O = context.obtainStyledAttributes(attributeSet, C10161R.styleable.RoundedImage, i, 0).getFloat(C10161R.styleable.RoundedImage_rounded_radius, this.f27077N);
        m47231b();
    }
}
