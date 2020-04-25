package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0211p;
import androidx.annotation.C0237z;
import androidx.core.p018c.C0821b;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p187p.C6990p;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.floatingactionbutton.c */
/* compiled from: BorderDrawable */
class C6863c extends Drawable {

    /* renamed from: q */
    private static final float f19136q = 1.3333f;

    /* renamed from: a */
    private final C6990p f19137a = new C6990p();
    @C0193h0

    /* renamed from: b */
    private final Paint f19138b;

    /* renamed from: c */
    private final Path f19139c = new Path();

    /* renamed from: d */
    private final Rect f19140d = new Rect();

    /* renamed from: e */
    private final RectF f19141e = new RectF();

    /* renamed from: f */
    private final RectF f19142f = new RectF();

    /* renamed from: g */
    private final C6865b f19143g = new C6865b();
    @C0211p

    /* renamed from: h */
    float f19144h;
    @C0198k

    /* renamed from: i */
    private int f19145i;
    @C0198k

    /* renamed from: j */
    private int f19146j;
    @C0198k

    /* renamed from: k */
    private int f19147k;
    @C0198k

    /* renamed from: l */
    private int f19148l;
    @C0198k

    /* renamed from: m */
    private int f19149m;

    /* renamed from: n */
    private boolean f19150n = true;

    /* renamed from: o */
    private C6986o f19151o;
    @C0195i0

    /* renamed from: p */
    private ColorStateList f19152p;

    /* renamed from: com.google.android.material.floatingactionbutton.c$b */
    /* compiled from: BorderDrawable */
    private class C6865b extends ConstantState {
        private C6865b() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @C0193h0
        public Drawable newDrawable() {
            return C6863c.this;
        }
    }

    C6863c(C6986o oVar) {
        this.f19151o = oVar;
        this.f19138b = new Paint(1);
        this.f19138b.setStyle(Style.STROKE);
    }

    @C0193h0
    /* renamed from: c */
    private Shader m32943c() {
        Rect rect = this.f19140d;
        copyBounds(rect);
        float height = this.f19144h / ((float) rect.height());
        LinearGradient linearGradient = new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C0821b.m4810c(this.f19145i, this.f19149m), C0821b.m4810c(this.f19146j, this.f19149m), C0821b.m4810c(C0821b.m4811d(this.f19146j, 0), this.f19149m), C0821b.m4810c(C0821b.m4811d(this.f19148l, 0), this.f19149m), C0821b.m4810c(this.f19148l, this.f19149m), C0821b.m4810c(this.f19147k, this.f19149m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP);
        return linearGradient;
    }

    /* renamed from: a */
    public void mo27394a(@C0211p float f) {
        if (this.f19144h != f) {
            this.f19144h = f;
            this.f19138b.setStrokeWidth(f * f19136q);
            this.f19150n = true;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public C6986o mo27398b() {
        return this.f19151o;
    }

    public void draw(@C0193h0 Canvas canvas) {
        if (this.f19150n) {
            this.f19138b.setShader(m32943c());
            this.f19150n = false;
        }
        float strokeWidth = this.f19138b.getStrokeWidth() / 2.0f;
        copyBounds(this.f19140d);
        this.f19141e.set(this.f19140d);
        float min = Math.min(this.f19151o.mo27868j().mo27763a(mo27393a()), this.f19141e.width() / 2.0f);
        if (this.f19151o.mo27859a(mo27393a())) {
            this.f19141e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f19141e, min, min, this.f19138b);
        }
    }

    @C0195i0
    public ConstantState getConstantState() {
        return this.f19143g;
    }

    public int getOpacity() {
        return this.f19144h > 0.0f ? -3 : -2;
    }

    @TargetApi(21)
    public void getOutline(@C0193h0 Outline outline) {
        if (this.f19151o.mo27859a(mo27393a())) {
            outline.setRoundRect(getBounds(), this.f19151o.mo27868j().mo27763a(mo27393a()));
            return;
        }
        copyBounds(this.f19140d);
        this.f19141e.set(this.f19140d);
        this.f19137a.mo27902a(this.f19151o, 1.0f, this.f19141e, this.f19139c);
        if (this.f19139c.isConvex()) {
            outline.setConvexPath(this.f19139c);
        }
    }

    public boolean getPadding(@C0193h0 Rect rect) {
        if (this.f19151o.mo27859a(mo27393a())) {
            int round = Math.round(this.f19144h);
            rect.set(round, round, round, round);
        }
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f19152p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f19150n = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f19152p;
        if (colorStateList != null) {
            int colorForState = colorStateList.getColorForState(iArr, this.f19149m);
            if (colorForState != this.f19149m) {
                this.f19150n = true;
                this.f19149m = colorForState;
            }
        }
        if (this.f19150n) {
            invalidateSelf();
        }
        return this.f19150n;
    }

    public void setAlpha(@C0237z(from = 0, mo691to = 255) int i) {
        this.f19138b.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(@C0195i0 ColorFilter colorFilter) {
        this.f19138b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27396a(@C0195i0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f19149m = colorStateList.getColorForState(getState(), this.f19149m);
        }
        this.f19152p = colorStateList;
        this.f19150n = true;
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27395a(@C0198k int i, @C0198k int i2, @C0198k int i3, @C0198k int i4) {
        this.f19145i = i;
        this.f19146j = i2;
        this.f19147k = i3;
        this.f19148l = i4;
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: a */
    public RectF mo27393a() {
        this.f19142f.set(getBounds());
        return this.f19142f;
    }

    /* renamed from: a */
    public void mo27397a(C6986o oVar) {
        this.f19151o = oVar;
        invalidateSelf();
    }
}
