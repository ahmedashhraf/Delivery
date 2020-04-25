package com.bogdwellers.pinchtozoom;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.bogdwellers.pinchtozoom.b */
/* compiled from: ImageMatrixCorrector */
public abstract class C2941b extends C2946e {

    /* renamed from: c */
    private ImageView f10406c;

    /* renamed from: d */
    private float f10407d;

    /* renamed from: e */
    private float f10408e;

    /* renamed from: a */
    public void mo11678a(Matrix matrix) {
        super.mo11678a(matrix);
        mo11684h();
    }

    /* renamed from: d */
    public ImageView mo11680d() {
        return this.f10406c;
    }

    /* renamed from: e */
    public float mo11681e() {
        Drawable drawable = this.f10406c.getDrawable();
        float intrinsicWidth = ((float) drawable.getIntrinsicWidth()) / ((float) this.f10406c.getWidth());
        float intrinsicHeight = ((float) drawable.getIntrinsicHeight()) / ((float) this.f10406c.getHeight());
        return intrinsicWidth > intrinsicHeight ? 1.0f / intrinsicWidth : 1.0f / intrinsicHeight;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public float mo11682f() {
        return this.f10408e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public float mo11683g() {
        return this.f10407d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo11684h() {
        float[] b = mo11722b();
        Drawable drawable = this.f10406c.getDrawable();
        if (drawable != null) {
            this.f10407d = b[0] * ((float) drawable.getIntrinsicWidth());
            this.f10408e = b[4] * ((float) drawable.getIntrinsicHeight());
            return;
        }
        this.f10408e = 0.0f;
        this.f10407d = 0.0f;
    }

    /* renamed from: a */
    public void mo11679a(ImageView imageView) {
        this.f10406c = imageView;
        if (imageView != null) {
            mo11678a(imageView.getImageMatrix());
        }
    }
}
