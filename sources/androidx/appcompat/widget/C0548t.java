package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.C0195i0;
import androidx.appcompat.C0238R;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p034l.C0962e0;

/* renamed from: androidx.appcompat.widget.t */
/* compiled from: AppCompatSeekBarHelper */
class C0548t extends C0539p {

    /* renamed from: d */
    private final SeekBar f2185d;

    /* renamed from: e */
    private Drawable f2186e;

    /* renamed from: f */
    private ColorStateList f2187f = null;

    /* renamed from: g */
    private Mode f2188g = null;

    /* renamed from: h */
    private boolean f2189h = false;

    /* renamed from: i */
    private boolean f2190i = false;

    C0548t(SeekBar seekBar) {
        super(seekBar);
        this.f2185d = seekBar;
    }

    /* renamed from: g */
    private void m2897g() {
        if (this.f2186e == null) {
            return;
        }
        if (this.f2189h || this.f2190i) {
            this.f2186e = C0892a.m5161i(this.f2186e.mutate());
            if (this.f2189h) {
                C0892a.m5146a(this.f2186e, this.f2187f);
            }
            if (this.f2190i) {
                C0892a.m5149a(this.f2186e, this.f2188g);
            }
            if (this.f2186e.isStateful()) {
                this.f2186e.setState(this.f2185d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2833a(AttributeSet attributeSet, int i) {
        super.mo2833a(attributeSet, i);
        C0549t0 a = C0549t0.m2910a(this.f2185d.getContext(), attributeSet, C0238R.styleable.AppCompatSeekBar, i, 0);
        Drawable c = a.mo2877c(C0238R.styleable.AppCompatSeekBar_android_thumb);
        if (c != null) {
            this.f2185d.setThumb(c);
        }
        mo2857a(a.mo2875b(C0238R.styleable.AppCompatSeekBar_tickMark));
        if (a.mo2892j(C0238R.styleable.AppCompatSeekBar_tickMarkTintMode)) {
            this.f2188g = C0469a0.m2594a(a.mo2880d(C0238R.styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.f2188g);
            this.f2190i = true;
        }
        if (a.mo2892j(C0238R.styleable.AppCompatSeekBar_tickMarkTint)) {
            this.f2187f = a.mo2868a(C0238R.styleable.AppCompatSeekBar_tickMarkTint);
            this.f2189h = true;
        }
        a.mo2887f();
        m2897g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2858b() {
        Drawable drawable = this.f2186e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f2185d.getDrawableState())) {
            this.f2185d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: c */
    public Drawable mo2859c() {
        return this.f2186e;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: d */
    public ColorStateList mo2860d() {
        return this.f2187f;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: e */
    public Mode mo2861e() {
        return this.f2188g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2862f() {
        Drawable drawable = this.f2186e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2857a(@C0195i0 Drawable drawable) {
        Drawable drawable2 = this.f2186e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2186e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f2185d);
            C0892a.m5152a(drawable, C0962e0.m5566x(this.f2185d));
            if (drawable.isStateful()) {
                drawable.setState(this.f2185d.getDrawableState());
            }
            m2897g();
        }
        this.f2185d.invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2854a(@C0195i0 ColorStateList colorStateList) {
        this.f2187f = colorStateList;
        this.f2189h = true;
        m2897g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2856a(@C0195i0 Mode mode) {
        this.f2188g = mode;
        this.f2190i = true;
        m2897g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2855a(Canvas canvas) {
        if (this.f2186e != null) {
            int max = this.f2185d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f2186e.getIntrinsicWidth();
                int intrinsicHeight = this.f2186e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f2186e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f2185d.getWidth() - this.f2185d.getPaddingLeft()) - this.f2185d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f2185d.getPaddingLeft(), (float) (this.f2185d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2186e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
