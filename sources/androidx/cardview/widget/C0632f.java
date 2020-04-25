package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: androidx.cardview.widget.f */
/* compiled from: RoundRectDrawable */
class C0632f extends Drawable {

    /* renamed from: a */
    private float f2470a;

    /* renamed from: b */
    private final Paint f2471b;

    /* renamed from: c */
    private final RectF f2472c;

    /* renamed from: d */
    private final Rect f2473d;

    /* renamed from: e */
    private float f2474e;

    /* renamed from: f */
    private boolean f2475f = false;

    /* renamed from: g */
    private boolean f2476g = true;

    /* renamed from: h */
    private ColorStateList f2477h;

    /* renamed from: i */
    private PorterDuffColorFilter f2478i;

    /* renamed from: j */
    private ColorStateList f2479j;

    /* renamed from: k */
    private Mode f2480k = Mode.SRC_IN;

    C0632f(ColorStateList colorStateList, float f) {
        this.f2470a = f;
        this.f2471b = new Paint(5);
        m3337b(colorStateList);
        this.f2472c = new RectF();
        this.f2473d = new Rect();
    }

    /* renamed from: b */
    private void m3337b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2477h = colorStateList;
        this.f2471b.setColor(this.f2477h.getColorForState(getState(), this.f2477h.getDefaultColor()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3156a(float f, boolean z, boolean z2) {
        if (f != this.f2474e || this.f2475f != z || this.f2476g != z2) {
            this.f2474e = f;
            this.f2475f = z;
            this.f2476g = z2;
            m3336a((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public float mo3159c() {
        return this.f2470a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f2471b;
        if (this.f2478i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f2478i);
            z = true;
        }
        RectF rectF = this.f2472c;
        float f = this.f2470a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f2473d, this.f2470a);
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f2479j;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f2477h;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && !super.isStateful()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m3336a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f2477h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f2471b.getColor();
        if (z) {
            this.f2471b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f2479j;
        if (colorStateList2 != null) {
            Mode mode = this.f2480k;
            if (mode != null) {
                this.f2478i = m3335a(colorStateList2, mode);
                return true;
            }
        }
        return z;
    }

    public void setAlpha(int i) {
        this.f2471b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2471b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2479j = colorStateList;
        this.f2478i = m3335a(this.f2479j, this.f2480k);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.f2480k = mode;
        this.f2478i = m3335a(this.f2479j, this.f2480k);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo3158b() {
        return this.f2474e;
    }

    /* renamed from: a */
    private void m3336a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f2472c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f2473d.set(rect);
        if (this.f2475f) {
            float b = C0633g.m3347b(this.f2474e, this.f2470a, this.f2476g);
            this.f2473d.inset((int) Math.ceil((double) C0633g.m3344a(this.f2474e, this.f2470a, this.f2476g)), (int) Math.ceil((double) b));
            this.f2472c.set(this.f2473d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3155a(float f) {
        if (f != this.f2470a) {
            this.f2470a = f;
            m3336a((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo3157a(@C0195i0 ColorStateList colorStateList) {
        m3337b(colorStateList);
        invalidateSelf();
    }

    /* renamed from: a */
    public ColorStateList mo3154a() {
        return this.f2477h;
    }

    /* renamed from: a */
    private PorterDuffColorFilter m3335a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
