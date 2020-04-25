package com.google.android.material.p304o;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Shader.TileMode;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p018c.C0821b;
import androidx.core.p034l.C0962e0;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.o.b */
/* compiled from: ShadowRenderer */
public class C6967b {

    /* renamed from: i */
    private static final int f19514i = 68;

    /* renamed from: j */
    private static final int f19515j = 20;

    /* renamed from: k */
    private static final int f19516k = 0;

    /* renamed from: l */
    private static final int[] f19517l = new int[3];

    /* renamed from: m */
    private static final float[] f19518m = {0.0f, 0.5f, 1.0f};

    /* renamed from: n */
    private static final int[] f19519n = new int[4];

    /* renamed from: o */
    private static final float[] f19520o = {0.0f, 0.0f, 0.5f, 1.0f};
    @C0193h0

    /* renamed from: a */
    private final Paint f19521a;
    @C0193h0

    /* renamed from: b */
    private final Paint f19522b;
    @C0193h0

    /* renamed from: c */
    private final Paint f19523c;

    /* renamed from: d */
    private int f19524d;

    /* renamed from: e */
    private int f19525e;

    /* renamed from: f */
    private int f19526f;

    /* renamed from: g */
    private final Path f19527g;

    /* renamed from: h */
    private Paint f19528h;

    public C6967b() {
        this(C0962e0.f4343t);
    }

    /* renamed from: a */
    public void mo27759a(int i) {
        this.f19524d = C0821b.m4811d(i, 68);
        this.f19525e = C0821b.m4811d(i, 20);
        this.f19526f = C0821b.m4811d(i, 0);
    }

    public C6967b(int i) {
        this.f19527g = new Path();
        this.f19528h = new Paint();
        mo27759a(i);
        this.f19528h.setColor(0);
        this.f19522b = new Paint(4);
        this.f19522b.setStyle(Style.FILL);
        this.f19521a = new Paint();
        this.f19521a.setColor(this.f19524d);
        this.f19523c = new Paint(this.f19522b);
    }

    /* renamed from: a */
    public void mo27760a(@C0193h0 Canvas canvas, @C0195i0 Matrix matrix, @C0193h0 RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = f19517l;
        iArr[0] = this.f19526f;
        iArr[1] = this.f19525e;
        iArr[2] = this.f19524d;
        Paint paint = this.f19523c;
        float f = rectF.left;
        LinearGradient linearGradient = new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f19518m, TileMode.CLAMP);
        paint.setShader(linearGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f19523c);
        canvas.restore();
    }

    /* renamed from: a */
    public void mo27761a(@C0193h0 Canvas canvas, @C0195i0 Matrix matrix, @C0193h0 RectF rectF, int i, float f, float f2) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i2 = i;
        float f3 = f2;
        boolean z = f3 < 0.0f;
        Path path = this.f19527g;
        if (z) {
            int[] iArr = f19519n;
            iArr[0] = 0;
            iArr[1] = this.f19526f;
            iArr[2] = this.f19525e;
            iArr[3] = this.f19524d;
            float f4 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f, f3);
            path.close();
            float f5 = (float) (-i2);
            rectF2.inset(f5, f5);
            int[] iArr2 = f19519n;
            iArr2[0] = 0;
            iArr2[1] = this.f19524d;
            iArr2[2] = this.f19525e;
            iArr2[3] = this.f19526f;
        }
        float width = 1.0f - (((float) i2) / (rectF.width() / 2.0f));
        float f6 = ((1.0f - width) / 2.0f) + width;
        float[] fArr = f19520o;
        fArr[1] = width;
        fArr[2] = f6;
        Paint paint = this.f19522b;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f19519n, f19520o, TileMode.CLAMP);
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas2.clipPath(path, Op.DIFFERENCE);
            canvas2.drawPath(path, this.f19528h);
        }
        canvas.drawArc(rectF, f, f2, true, this.f19522b);
        canvas.restore();
    }

    @C0193h0
    /* renamed from: a */
    public Paint mo27758a() {
        return this.f19521a;
    }
}
