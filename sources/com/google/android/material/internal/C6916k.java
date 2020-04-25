package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C1006n0;
import androidx.core.p034l.C1054x;
import com.google.android.material.C5582R;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.k */
/* compiled from: ScrimInsetsFrameLayout */
public class C6916k extends FrameLayout {

    /* renamed from: N */
    private Rect f19355N;

    /* renamed from: O */
    private boolean f19356O;

    /* renamed from: P */
    private boolean f19357P;
    @C0195i0

    /* renamed from: a */
    Drawable f19358a;

    /* renamed from: b */
    Rect f19359b;

    /* renamed from: com.google.android.material.internal.k$a */
    /* compiled from: ScrimInsetsFrameLayout */
    class C6917a implements C1054x {
        C6917a() {
        }

        /* renamed from: a */
        public C1006n0 mo860a(View view, @C0193h0 C1006n0 n0Var) {
            C6916k kVar = C6916k.this;
            if (kVar.f19359b == null) {
                kVar.f19359b = new Rect();
            }
            C6916k.this.f19359b.set(n0Var.mo4886j(), n0Var.mo4888l(), n0Var.mo4887k(), n0Var.mo4885i());
            C6916k.this.mo27629a(n0Var);
            C6916k.this.setWillNotDraw(!n0Var.mo4891o() || C6916k.this.f19358a == null);
            C0962e0.m5561u0(C6916k.this);
            return n0Var.mo4877c();
        }
    }

    public C6916k(@C0193h0 Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27629a(C1006n0 n0Var) {
    }

    public void draw(@C0193h0 Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f19359b != null && this.f19358a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f19356O) {
                this.f19355N.set(0, 0, width, this.f19359b.top);
                this.f19358a.setBounds(this.f19355N);
                this.f19358a.draw(canvas);
            }
            if (this.f19357P) {
                this.f19355N.set(0, height - this.f19359b.bottom, width, height);
                this.f19358a.setBounds(this.f19355N);
                this.f19358a.draw(canvas);
            }
            Rect rect = this.f19355N;
            Rect rect2 = this.f19359b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f19358a.setBounds(this.f19355N);
            this.f19358a.draw(canvas);
            Rect rect3 = this.f19355N;
            Rect rect4 = this.f19359b;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f19358a.setBounds(this.f19355N);
            this.f19358a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f19358a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f19358a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f19357P = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f19356O = z;
    }

    public void setScrimInsetForeground(@C0195i0 Drawable drawable) {
        this.f19358a = drawable;
    }

    public C6916k(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6916k(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19355N = new Rect();
        this.f19356O = true;
        this.f19357P = true;
        TypedArray c = C6928p.m33264c(context, attributeSet, C5582R.styleable.ScrimInsetsFrameLayout, i, C5582R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f19358a = c.getDrawable(C5582R.styleable.ScrimInsetsFrameLayout_insetForeground);
        c.recycle();
        setWillNotDraw(true);
        C0962e0.m5448a((View) this, (C1054x) new C6917a());
    }
}
