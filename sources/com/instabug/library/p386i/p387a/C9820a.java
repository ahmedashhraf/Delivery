package com.instabug.library.p386i.p387a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.instabug.library.annotation.p381d.C9761c;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.i.a.a */
/* compiled from: BubbleTextView */
public class C9820a extends TextView {

    /* renamed from: T */
    private static transient /* synthetic */ boolean[] f26030T;

    /* renamed from: N */
    private float f26031N;

    /* renamed from: O */
    private PointF f26032O;

    /* renamed from: P */
    private PointF f26033P;

    /* renamed from: Q */
    private PointF f26034Q;

    /* renamed from: R */
    private Path f26035R;

    /* renamed from: S */
    private float f26036S;

    /* renamed from: a */
    private RectF f26037a;

    /* renamed from: b */
    private Paint f26038b;

    public C9820a(Context context) {
        boolean[] b = m45814b();
        super(context);
        b[0] = true;
        m45813a();
        b[1] = true;
    }

    /* renamed from: a */
    private void m45813a() {
        boolean[] b = m45814b();
        setTextColor(-1);
        b[6] = true;
        this.f26037a = new RectF();
        b[7] = true;
        this.f26038b = new Paint(1);
        b[8] = true;
        this.f26038b.setColor(-12303292);
        b[9] = true;
        this.f26038b.setStyle(Style.FILL);
        b[10] = true;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        b[11] = true;
        this.f26031N = TypedValue.applyDimension(1, 7.0f, displayMetrics);
        float f = this.f26031N;
        this.f26036S = f / 2.0f;
        int i = (int) f;
        double d = (double) f;
        Double.isNaN(d);
        int i2 = (int) (d * 1.5d);
        double d2 = (double) f;
        Double.isNaN(d2);
        double d3 = d2 * 1.5d;
        double d4 = (double) f;
        Double.isNaN(d4);
        int i3 = (int) (d3 + d4);
        b[12] = true;
        setPadding(i2, i, i3, i);
        b[13] = true;
        this.f26032O = new PointF();
        b[14] = true;
        this.f26033P = new PointF();
        b[15] = true;
        this.f26034Q = new PointF();
        b[16] = true;
        this.f26035R = new Path();
        b[17] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m45814b() {
        boolean[] zArr = f26030T;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(274892615013877673L, "com/instabug/library/internal/view/BubbleTextView", 33);
        f26030T = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean[] b = m45814b();
        RectF rectF = this.f26037a;
        float f = this.f26036S;
        canvas.drawRoundRect(rectF, f, f, this.f26038b);
        b[30] = true;
        canvas.drawPath(this.f26035R, this.f26038b);
        b[31] = true;
        super.onDraw(canvas);
        b[32] = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean[] b = m45814b();
        super.onMeasure(i, i2);
        b[18] = true;
        int measuredHeight = getMeasuredHeight();
        b[19] = true;
        int measuredWidth = getMeasuredWidth();
        b[20] = true;
        setMeasuredDimension(measuredWidth, measuredHeight);
        RectF rectF = this.f26037a;
        float f = (float) measuredWidth;
        rectF.right = f - this.f26031N;
        rectF.bottom = (float) measuredHeight;
        PointF pointF = this.f26032O;
        pointF.x = f;
        b[21] = true;
        pointF.y = rectF.centerY();
        b[22] = true;
        double d = (double) this.f26031N;
        double cos = Math.cos(45.0d);
        Double.isNaN(d);
        float f2 = (float) (d / cos);
        b[23] = true;
        C9761c.m45522a(f2, 225.0f, this.f26032O, this.f26033P);
        b[24] = true;
        C9761c.m45522a(f2, 135.0f, this.f26032O, this.f26034Q);
        b[25] = true;
        Path path = this.f26035R;
        PointF pointF2 = this.f26033P;
        path.moveTo(pointF2.x, pointF2.y);
        b[26] = true;
        Path path2 = this.f26035R;
        PointF pointF3 = this.f26032O;
        path2.lineTo(pointF3.x, pointF3.y);
        b[27] = true;
        Path path3 = this.f26035R;
        PointF pointF4 = this.f26034Q;
        path3.lineTo(pointF4.x, pointF4.y);
        b[28] = true;
        this.f26035R.close();
        b[29] = true;
    }
}
