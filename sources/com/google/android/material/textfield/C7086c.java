package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6986o;

/* renamed from: com.google.android.material.textfield.c */
/* compiled from: CutoutDrawable */
class C7086c extends C6978j {
    @C0193h0

    /* renamed from: n0 */
    private final Paint f20094n0;
    @C0193h0

    /* renamed from: o0 */
    private final RectF f20095o0;

    /* renamed from: p0 */
    private int f20096p0;

    C7086c() {
        this(null);
    }

    /* renamed from: G */
    private void m34138G() {
        this.f20094n0.setStyle(Style.FILL_AND_STROKE);
        this.f20094n0.setColor(-1);
        this.f20094n0.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
    }

    /* renamed from: b */
    private void m34141b(@C0193h0 Canvas canvas) {
        Callback callback = getCallback();
        if (m34140a(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        m34142c(canvas);
    }

    /* renamed from: c */
    private void m34142c(@C0193h0 Canvas canvas) {
        if (VERSION.SDK_INT >= 21) {
            this.f20096p0 = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
            return;
        }
        this.f20096p0 = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public boolean mo22862E() {
        return !this.f20095o0.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public void mo22864F() {
        mo28413a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28413a(float f, float f2, float f3, float f4) {
        RectF rectF = this.f20095o0;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            this.f20095o0.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    public void draw(@C0193h0 Canvas canvas) {
        m34141b(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f20095o0, this.f20094n0);
        m34139a(canvas);
    }

    C7086c(@C0195i0 C6986o oVar) {
        if (oVar == null) {
            oVar = new C6986o();
        }
        super(oVar);
        this.f20094n0 = new Paint(1);
        m34138G();
        this.f20095o0 = new RectF();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28414a(@C0193h0 RectF rectF) {
        mo28413a(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: a */
    private void m34139a(@C0193h0 Canvas canvas) {
        if (!m34140a(getCallback())) {
            canvas.restoreToCount(this.f20096p0);
        }
    }

    /* renamed from: a */
    private boolean m34140a(Callback callback) {
        return callback instanceof View;
    }
}
