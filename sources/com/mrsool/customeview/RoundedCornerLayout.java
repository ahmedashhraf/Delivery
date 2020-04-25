package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.mrsool.C10232R;

public class RoundedCornerLayout extends FrameLayout {

    /* renamed from: P */
    private static final float f29349P = 10.0f;

    /* renamed from: N */
    private Paint f29350N;

    /* renamed from: O */
    private float f29351O;

    /* renamed from: a */
    private Bitmap f29352a;

    /* renamed from: b */
    private Paint f29353b;

    public RoundedCornerLayout(Context context) {
        super(context);
        m49322a(context, null, 0);
    }

    /* renamed from: a */
    private void m49322a(Context context, AttributeSet attributeSet, int i) {
        float dimension = context.obtainStyledAttributes(attributeSet, C10232R.styleable.RoundedCornerLayout).getDimension(0, -1.0f);
        if (dimension != -1.0f) {
            this.f29351O = dimension;
        } else {
            this.f29351O = TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        }
        this.f29353b = new Paint(1);
        this.f29350N = new Paint(3);
        this.f29350N.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        setWillNotDraw(false);
    }

    public void draw(Canvas canvas) {
        Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        super.draw(canvas2);
        if (this.f29352a == null) {
            this.f29352a = m49321a(canvas.getWidth(), canvas.getHeight());
        }
        canvas2.drawBitmap(this.f29352a, 0.0f, 0.0f, this.f29350N);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, this.f29353b);
    }

    public RoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49322a(context, attributeSet, 0);
    }

    public RoundedCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49322a(context, attributeSet, i);
    }

    /* renamed from: a */
    private Bitmap m49321a(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float f = (float) i;
        float f2 = (float) i2;
        canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        float f3 = this.f29351O;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        return createBitmap;
    }
}
