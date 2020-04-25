package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
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
import androidx.annotation.C0195i0;
import androidx.cardview.C0622R;

/* renamed from: androidx.cardview.widget.g */
/* compiled from: RoundRectDrawableWithShadow */
class C0633g extends Drawable {

    /* renamed from: q */
    private static final double f2481q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    private static final float f2482r = 1.5f;

    /* renamed from: s */
    static C0634a f2483s;

    /* renamed from: a */
    private final int f2484a;

    /* renamed from: b */
    private Paint f2485b;

    /* renamed from: c */
    private Paint f2486c;

    /* renamed from: d */
    private Paint f2487d;

    /* renamed from: e */
    private final RectF f2488e;

    /* renamed from: f */
    private float f2489f;

    /* renamed from: g */
    private Path f2490g;

    /* renamed from: h */
    private float f2491h;

    /* renamed from: i */
    private float f2492i;

    /* renamed from: j */
    private float f2493j;

    /* renamed from: k */
    private ColorStateList f2494k;

    /* renamed from: l */
    private boolean f2495l = true;

    /* renamed from: m */
    private final int f2496m;

    /* renamed from: n */
    private final int f2497n;

    /* renamed from: o */
    private boolean f2498o = true;

    /* renamed from: p */
    private boolean f2499p = false;

    /* renamed from: androidx.cardview.widget.g$a */
    /* compiled from: RoundRectDrawableWithShadow */
    interface C0634a {
        /* renamed from: a */
        void mo3139a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    C0633g(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f2496m = resources.getColor(C0622R.C0623color.cardview_shadow_start_color);
        this.f2497n = resources.getColor(C0622R.C0623color.cardview_shadow_end_color);
        this.f2484a = resources.getDimensionPixelSize(C0622R.dimen.cardview_compat_inset_shadow);
        this.f2485b = new Paint(5);
        m3348b(colorStateList);
        this.f2486c = new Paint(5);
        this.f2486c.setStyle(Style.FILL);
        this.f2489f = (float) ((int) (f + 0.5f));
        this.f2488e = new RectF();
        this.f2487d = new Paint(this.f2486c);
        this.f2487d.setAntiAlias(false);
        m3345a(f2, f3);
    }

    /* renamed from: b */
    private void m3348b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2494k = colorStateList;
        this.f2485b.setColor(this.f2494k.getColorForState(getState(), this.f2494k.getDefaultColor()));
    }

    /* renamed from: d */
    private int m3350d(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* renamed from: g */
    private void m3351g() {
        float f = this.f2489f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f2492i;
        rectF2.inset(-f2, -f2);
        Path path = this.f2490g;
        if (path == null) {
            this.f2490g = new Path();
        } else {
            path.reset();
        }
        this.f2490g.setFillType(FillType.EVEN_ODD);
        this.f2490g.moveTo(-this.f2489f, 0.0f);
        this.f2490g.rLineTo(-this.f2492i, 0.0f);
        this.f2490g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f2490g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f2490g.close();
        float f3 = this.f2489f;
        float f4 = this.f2492i;
        float f5 = f3 / (f3 + f4);
        Paint paint = this.f2486c;
        float f6 = f3 + f4;
        int i = this.f2496m;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, f6, new int[]{i, i, this.f2497n}, new float[]{0.0f, f5, 1.0f}, TileMode.CLAMP);
        paint.setShader(radialGradient);
        Paint paint2 = this.f2487d;
        float f7 = this.f2489f;
        float f8 = -f7;
        float f9 = this.f2492i;
        float f10 = f8 + f9;
        float f11 = (-f7) - f9;
        int i2 = this.f2496m;
        LinearGradient linearGradient = new LinearGradient(0.0f, f10, 0.0f, f11, new int[]{i2, i2, this.f2497n}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
        paint2.setShader(linearGradient);
        this.f2487d.setAntiAlias(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3174a(boolean z) {
        this.f2498o = z;
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo3178c(float f) {
        m3345a(f, this.f2491h);
    }

    public void draw(Canvas canvas) {
        if (this.f2495l) {
            m3349b(getBounds());
            this.f2495l = false;
        }
        canvas.translate(0.0f, this.f2493j / 2.0f);
        m3346a(canvas);
        canvas.translate(0.0f, (-this.f2493j) / 2.0f);
        f2483s.mo3139a(canvas, this.f2488e, this.f2489f, this.f2485b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public float mo3181e() {
        float f = this.f2491h;
        return (Math.max(f, this.f2489f + ((float) this.f2484a) + (f / 2.0f)) * 2.0f) + ((this.f2491h + ((float) this.f2484a)) * 2.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public float mo3182f() {
        return this.f2493j;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m3347b(this.f2491h, this.f2489f, this.f2498o));
        int ceil2 = (int) Math.ceil((double) m3344a(this.f2491h, this.f2489f, this.f2498o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f2494k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2495l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f2494k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f2485b.getColor() == colorForState) {
            return false;
        }
        this.f2485b.setColor(colorForState);
        this.f2495l = true;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        this.f2485b.setAlpha(i);
        this.f2486c.setAlpha(i);
        this.f2487d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2485b.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo3177c() {
        return this.f2491h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo3179d() {
        float f = this.f2491h;
        return (Math.max(f, this.f2489f + ((float) this.f2484a) + ((f * f2482r) / 2.0f)) * 2.0f) + (((this.f2491h * f2482r) + ((float) this.f2484a)) * 2.0f);
    }

    /* renamed from: a */
    private void m3345a(float f, float f2) {
        String str = ". Must be >= 0";
        if (f < 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid shadow size ");
            sb.append(f);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 >= 0.0f) {
            float d = (float) m3350d(f);
            float d2 = (float) m3350d(f2);
            if (d > d2) {
                if (!this.f2499p) {
                    this.f2499p = true;
                }
                d = d2;
            }
            if (this.f2493j != d || this.f2491h != d2) {
                this.f2493j = d;
                this.f2491h = d2;
                this.f2492i = (float) ((int) ((d * f2482r) + ((float) this.f2484a) + 0.5f));
                this.f2495l = true;
                invalidateSelf();
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid max shadow size ");
            sb2.append(f2);
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: b */
    static float m3347b(float f, float f2, boolean z) {
        if (!z) {
            return f * f2482r;
        }
        double d = (double) (f * f2482r);
        double d2 = 1.0d - f2481q;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    /* renamed from: b */
    private void m3349b(Rect rect) {
        float f = this.f2491h;
        float f2 = f2482r * f;
        this.f2488e.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        m3351g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo3175b() {
        return this.f2489f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3176b(float f) {
        m3345a(this.f2493j, f);
    }

    /* renamed from: a */
    static float m3344a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - f2481q;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3171a(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f2489f != f2) {
                this.f2489f = f2;
                this.f2495l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid radius ");
        sb.append(f);
        sb.append(". Must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private void m3346a(Canvas canvas) {
        float f = this.f2489f;
        float f2 = (-f) - this.f2492i;
        float f3 = f + ((float) this.f2484a) + (this.f2493j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f2488e.width() - f4 > 0.0f;
        boolean z2 = this.f2488e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f2488e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f2490g, this.f2486c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f2488e.width() - f4, -this.f2489f, this.f2487d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f2488e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f2490g, this.f2486c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f2488e.width() - f4, (-this.f2489f) + this.f2492i, this.f2487d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f2488e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f2490g, this.f2486c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f2488e.height() - f4, -this.f2489f, this.f2487d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f2488e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f2490g, this.f2486c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f2488e.height() - f4, -this.f2489f, this.f2487d);
        }
        canvas.restoreToCount(save4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3173a(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3172a(@C0195i0 ColorStateList colorStateList) {
        m3348b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ColorStateList mo3170a() {
        return this.f2494k;
    }
}
