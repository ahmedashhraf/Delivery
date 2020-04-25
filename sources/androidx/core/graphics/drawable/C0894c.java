package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: androidx.core.graphics.drawable.c */
/* compiled from: RoundedBitmapDrawable */
public abstract class C0894c extends Drawable {

    /* renamed from: n */
    private static final int f4098n = 3;

    /* renamed from: a */
    final Bitmap f4099a;

    /* renamed from: b */
    private int f4100b = C13959t.f40969w2;

    /* renamed from: c */
    private int f4101c = 119;

    /* renamed from: d */
    private final Paint f4102d = new Paint(3);

    /* renamed from: e */
    private final BitmapShader f4103e;

    /* renamed from: f */
    private final Matrix f4104f = new Matrix();

    /* renamed from: g */
    private float f4105g;

    /* renamed from: h */
    final Rect f4106h = new Rect();

    /* renamed from: i */
    private final RectF f4107i = new RectF();

    /* renamed from: j */
    private boolean f4108j = true;

    /* renamed from: k */
    private boolean f4109k;

    /* renamed from: l */
    private int f4110l;

    /* renamed from: m */
    private int f4111m;

    C0894c(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.f4100b = resources.getDisplayMetrics().densityDpi;
        }
        this.f4099a = bitmap;
        if (this.f4099a != null) {
            m5166i();
            Bitmap bitmap2 = this.f4099a;
            TileMode tileMode = TileMode.CLAMP;
            this.f4103e = new BitmapShader(bitmap2, tileMode, tileMode);
            return;
        }
        this.f4111m = -1;
        this.f4110l = -1;
        this.f4103e = null;
    }

    /* renamed from: b */
    private static boolean m5165b(float f) {
        return f > 0.05f;
    }

    /* renamed from: i */
    private void m5166i() {
        this.f4110l = this.f4099a.getScaledWidth(this.f4100b);
        this.f4111m = this.f4099a.getScaledHeight(this.f4100b);
    }

    /* renamed from: j */
    private void m5167j() {
        this.f4105g = (float) (Math.min(this.f4111m, this.f4110l) / 2);
    }

    @C0195i0
    /* renamed from: a */
    public final Bitmap mo4593a() {
        return this.f4099a;
    }

    /* renamed from: b */
    public void mo4600b(int i) {
        if (this.f4100b != i) {
            if (i == 0) {
                i = C13959t.f40969w2;
            }
            this.f4100b = i;
            if (this.f4099a != null) {
                m5166i();
            }
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public int mo4602c() {
        return this.f4101c;
    }

    @C0193h0
    /* renamed from: d */
    public final Paint mo4603d() {
        return this.f4102d;
    }

    public void draw(@C0193h0 Canvas canvas) {
        Bitmap bitmap = this.f4099a;
        if (bitmap != null) {
            mo4612h();
            if (this.f4102d.getShader() == null) {
                canvas.drawBitmap(bitmap, null, this.f4106h, this.f4102d);
            } else {
                RectF rectF = this.f4107i;
                float f = this.f4105g;
                canvas.drawRoundRect(rectF, f, f, this.f4102d);
            }
        }
    }

    /* renamed from: e */
    public boolean mo4605e() {
        return this.f4102d.isAntiAlias();
    }

    /* renamed from: f */
    public boolean mo4591f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public boolean mo4606g() {
        return this.f4109k;
    }

    public int getAlpha() {
        return this.f4102d.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f4102d.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f4111m;
    }

    public int getIntrinsicWidth() {
        return this.f4110l;
    }

    public int getOpacity() {
        if (this.f4101c != 119 || this.f4109k) {
            return -3;
        }
        Bitmap bitmap = this.f4099a;
        if (bitmap == null || bitmap.hasAlpha() || this.f4102d.getAlpha() < 255 || m5165b(this.f4105g)) {
            return -3;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4612h() {
        if (this.f4108j) {
            if (this.f4109k) {
                int min = Math.min(this.f4110l, this.f4111m);
                mo4589a(this.f4101c, min, min, getBounds(), this.f4106h);
                int min2 = Math.min(this.f4106h.width(), this.f4106h.height());
                this.f4106h.inset(Math.max(0, (this.f4106h.width() - min2) / 2), Math.max(0, (this.f4106h.height() - min2) / 2));
                this.f4105g = ((float) min2) * 0.5f;
            } else {
                mo4589a(this.f4101c, this.f4110l, this.f4111m, getBounds(), this.f4106h);
            }
            this.f4107i.set(this.f4106h);
            if (this.f4103e != null) {
                Matrix matrix = this.f4104f;
                RectF rectF = this.f4107i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f4104f.preScale(this.f4107i.width() / ((float) this.f4099a.getWidth()), this.f4107i.height() / ((float) this.f4099a.getHeight()));
                this.f4103e.setLocalMatrix(this.f4104f);
                this.f4102d.setShader(this.f4103e);
            }
            this.f4108j = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f4109k) {
            m5167j();
        }
        this.f4108j = true;
    }

    public void setAlpha(int i) {
        if (i != this.f4102d.getAlpha()) {
            this.f4102d.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4102d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f4102d.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f4102d.setFilterBitmap(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo4596a(@C0193h0 Canvas canvas) {
        mo4600b(canvas.getDensity());
    }

    /* renamed from: c */
    public void mo4590c(boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo4597a(@C0193h0 DisplayMetrics displayMetrics) {
        mo4600b(displayMetrics.densityDpi);
    }

    /* renamed from: a */
    public void mo4595a(int i) {
        if (this.f4101c != i) {
            this.f4101c = i;
            this.f4108j = true;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo4601b(boolean z) {
        this.f4109k = z;
        this.f4108j = true;
        if (z) {
            m5167j();
            this.f4102d.setShader(this.f4103e);
            invalidateSelf();
            return;
        }
        mo4594a(0.0f);
    }

    /* renamed from: a */
    public void mo4598a(boolean z) {
        this.f4102d.setAntiAlias(z);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4589a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo4594a(float f) {
        if (this.f4105g != f) {
            this.f4109k = false;
            if (m5165b(f)) {
                this.f4102d.setShader(this.f4103e);
            } else {
                this.f4102d.setShader(null);
            }
            this.f4105g = f;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public float mo4599b() {
        return this.f4105g;
    }
}
