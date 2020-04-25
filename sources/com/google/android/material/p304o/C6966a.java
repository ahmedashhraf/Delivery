package com.google.android.material.p304o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0193h0;
import androidx.appcompat.p008b.p009a.C0331c;
import androidx.core.content.C0841b;
import com.google.android.material.C5582R;

@Deprecated
/* renamed from: com.google.android.material.o.a */
/* compiled from: ShadowDrawableWrapper */
public class C6966a extends C0331c {

    /* renamed from: c0 */
    static final double f19493c0 = Math.cos(Math.toRadians(45.0d));

    /* renamed from: d0 */
    static final float f19494d0 = 1.5f;

    /* renamed from: e0 */
    static final float f19495e0 = 0.25f;

    /* renamed from: f0 */
    static final float f19496f0 = 0.5f;

    /* renamed from: g0 */
    static final float f19497g0 = 1.0f;
    @C0193h0

    /* renamed from: N */
    final Paint f19498N;
    @C0193h0

    /* renamed from: O */
    final RectF f19499O;

    /* renamed from: P */
    float f19500P;

    /* renamed from: Q */
    Path f19501Q;

    /* renamed from: R */
    float f19502R;

    /* renamed from: S */
    float f19503S;

    /* renamed from: T */
    float f19504T;

    /* renamed from: U */
    float f19505U;

    /* renamed from: V */
    private boolean f19506V = true;

    /* renamed from: W */
    private final int f19507W;

    /* renamed from: X */
    private final int f19508X;

    /* renamed from: Y */
    private final int f19509Y;

    /* renamed from: Z */
    private boolean f19510Z = true;

    /* renamed from: a0 */
    private float f19511a0;
    @C0193h0

    /* renamed from: b */
    final Paint f19512b;

    /* renamed from: b0 */
    private boolean f19513b0 = false;

    public C6966a(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f19507W = C0841b.m4915a(context, C5582R.C5584color.design_fab_shadow_start_color);
        this.f19508X = C0841b.m4915a(context, C5582R.C5584color.design_fab_shadow_mid_color);
        this.f19509Y = C0841b.m4915a(context, C5582R.C5584color.design_fab_shadow_end_color);
        this.f19512b = new Paint(5);
        this.f19512b.setStyle(Style.FILL);
        this.f19500P = (float) Math.round(f);
        this.f19499O = new RectF();
        this.f19498N = new Paint(this.f19512b);
        this.f19498N.setAntiAlias(false);
        mo27748a(f2, f3);
    }

    /* renamed from: b */
    public static float m33378b(float f, float f2, boolean z) {
        if (!z) {
            return f * f19494d0;
        }
        double d = (double) (f * f19494d0);
        double d2 = 1.0d - f19493c0;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    /* renamed from: e */
    private static int m33379e(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    /* renamed from: g */
    private void m33380g() {
        float f = this.f19500P;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f19504T;
        rectF2.inset(-f2, -f2);
        Path path = this.f19501Q;
        if (path == null) {
            this.f19501Q = new Path();
        } else {
            path.reset();
        }
        this.f19501Q.setFillType(FillType.EVEN_ODD);
        this.f19501Q.moveTo(-this.f19500P, 0.0f);
        this.f19501Q.rLineTo(-this.f19504T, 0.0f);
        this.f19501Q.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f19501Q.arcTo(rectF, 270.0f, -90.0f, false);
        this.f19501Q.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.f19500P / f3;
            float f5 = ((1.0f - f4) / 2.0f) + f4;
            Paint paint = this.f19512b;
            RadialGradient radialGradient = r8;
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.f19507W, this.f19508X, this.f19509Y}, new float[]{0.0f, f4, f5, 1.0f}, TileMode.CLAMP);
            paint.setShader(radialGradient);
        }
        Paint paint2 = this.f19498N;
        LinearGradient linearGradient = new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f19507W, this.f19508X, this.f19509Y}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
        paint2.setShader(linearGradient);
        this.f19498N.setAntiAlias(false);
    }

    /* renamed from: a */
    public void mo27749a(boolean z) {
        this.f19510Z = z;
        invalidateSelf();
    }

    /* renamed from: c */
    public final void mo27753c(float f) {
        if (this.f19511a0 != f) {
            this.f19511a0 = f;
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public void mo27755d(float f) {
        mo27748a(f, this.f19503S);
    }

    public void draw(@C0193h0 Canvas canvas) {
        if (this.f19506V) {
            m33377a(getBounds());
            this.f19506V = false;
        }
        m33376a(canvas);
        super.draw(canvas);
    }

    /* renamed from: f */
    public float mo27757f() {
        return this.f19505U;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(@C0193h0 Rect rect) {
        int ceil = (int) Math.ceil((double) m33378b(this.f19503S, this.f19500P, this.f19510Z));
        int ceil2 = (int) Math.ceil((double) m33375a(this.f19503S, this.f19500P, this.f19510Z));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f19506V = true;
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f19512b.setAlpha(i);
        this.f19498N.setAlpha(i);
    }

    /* renamed from: b */
    public float mo27750b() {
        return this.f19500P;
    }

    /* renamed from: d */
    public float mo27754d() {
        float f = this.f19503S;
        return (Math.max(f, this.f19500P + ((f * f19494d0) / 2.0f)) * 2.0f) + (this.f19503S * f19494d0 * 2.0f);
    }

    /* renamed from: a */
    public void mo27748a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float e = (float) m33379e(f);
        float e2 = (float) m33379e(f2);
        if (e > e2) {
            if (!this.f19513b0) {
                this.f19513b0 = true;
            }
            e = e2;
        }
        if (this.f19505U != e || this.f19503S != e2) {
            this.f19505U = e;
            this.f19503S = e2;
            this.f19504T = (float) Math.round(e * f19494d0);
            this.f19502R = e2;
            this.f19506V = true;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo27751b(float f) {
        mo27748a(this.f19505U, f);
    }

    /* renamed from: e */
    public float mo27756e() {
        float f = this.f19503S;
        return (Math.max(f, this.f19500P + (f / 2.0f)) * 2.0f) + (this.f19503S * 2.0f);
    }

    /* renamed from: c */
    public float mo27752c() {
        return this.f19503S;
    }

    /* renamed from: a */
    public static float m33375a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - f19493c0;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    /* renamed from: a */
    public void mo27747a(float f) {
        float round = (float) Math.round(f);
        if (this.f19500P != round) {
            this.f19500P = round;
            this.f19506V = true;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private void m33376a(@C0193h0 Canvas canvas) {
        float f;
        int i;
        int i2;
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.rotate(this.f19511a0, this.f19499O.centerX(), this.f19499O.centerY());
        float f5 = this.f19500P;
        float f6 = (-f5) - this.f19504T;
        float f7 = f5 * 2.0f;
        boolean z = this.f19499O.width() - f7 > 0.0f;
        boolean z2 = this.f19499O.height() - f7 > 0.0f;
        float f8 = this.f19505U;
        float f9 = f5 / ((f8 - (0.5f * f8)) + f5);
        float f10 = f5 / ((f8 - (f19495e0 * f8)) + f5);
        float f11 = f5 / ((f8 - (f8 * 1.0f)) + f5);
        int save2 = canvas.save();
        RectF rectF = this.f19499O;
        canvas2.translate(rectF.left + f5, rectF.top + f5);
        canvas2.scale(f9, f10);
        canvas2.drawPath(this.f19501Q, this.f19512b);
        if (z) {
            canvas2.scale(1.0f / f9, 1.0f);
            i2 = save2;
            f = f11;
            i = save;
            f2 = f10;
            canvas.drawRect(0.0f, f6, this.f19499O.width() - f7, -this.f19500P, this.f19498N);
        } else {
            i2 = save2;
            f = f11;
            i = save;
            f2 = f10;
        }
        canvas2.restoreToCount(i2);
        int save3 = canvas.save();
        RectF rectF2 = this.f19499O;
        canvas2.translate(rectF2.right - f5, rectF2.bottom - f5);
        float f12 = f;
        canvas2.scale(f9, f12);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f19501Q, this.f19512b);
        if (z) {
            canvas2.scale(1.0f / f9, 1.0f);
            f3 = f2;
            f4 = f12;
            canvas.drawRect(0.0f, f6, this.f19499O.width() - f7, (-this.f19500P) + this.f19504T, this.f19498N);
        } else {
            f3 = f2;
            f4 = f12;
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.f19499O;
        canvas2.translate(rectF3.left + f5, rectF3.bottom - f5);
        canvas2.scale(f9, f4);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f19501Q, this.f19512b);
        if (z2) {
            canvas2.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f6, this.f19499O.height() - f7, -this.f19500P, this.f19498N);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.f19499O;
        canvas2.translate(rectF4.right - f5, rectF4.top + f5);
        float f13 = f3;
        canvas2.scale(f9, f13);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f19501Q, this.f19512b);
        if (z2) {
            canvas2.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f6, this.f19499O.height() - f7, -this.f19500P, this.f19498N);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(i);
    }

    /* renamed from: a */
    private void m33377a(@C0193h0 Rect rect) {
        float f = this.f19503S;
        float f2 = f19494d0 * f;
        this.f19499O.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        Drawable a = mo1241a();
        RectF rectF = this.f19499O;
        a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        m33380g();
    }
}
