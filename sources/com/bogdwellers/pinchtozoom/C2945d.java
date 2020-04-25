package com.bogdwellers.pinchtozoom;

import android.widget.ImageView;

/* renamed from: com.bogdwellers.pinchtozoom.d */
/* compiled from: ImageViewerCorrector */
public class C2945d extends C2941b {

    /* renamed from: h */
    public static final String f10439h = "d";

    /* renamed from: f */
    private float f10440f;

    /* renamed from: g */
    private boolean f10441g;

    public C2945d() {
        this(null, 4.0f);
    }

    /* renamed from: a */
    public void mo11715a(float f) {
        this.f10440f = f;
    }

    /* renamed from: c */
    public void mo11717c() {
        super.mo11717c();
        mo11684h();
        float[] b = mo11722b();
        b[2] = mo11714a(2, b[2]);
        b[5] = mo11714a(5, b[5]);
        mo11720a().setValues(b);
    }

    /* renamed from: i */
    public float mo11718i() {
        return this.f10440f;
    }

    /* renamed from: j */
    public boolean mo11719j() {
        return this.f10441g;
    }

    public C2945d(ImageView imageView, float f) {
        if (imageView != null) {
            mo11679a(imageView);
        }
        this.f10440f = f;
    }

    /* renamed from: a */
    public void mo11716a(boolean z) {
        this.f10441g = z;
    }

    /* renamed from: a */
    public float mo11714a(int i, float f) {
        if (i != 0) {
            if (i == 2) {
                return m14096a(f, (float) mo11680d().getWidth(), mo11683g());
            }
            if (i != 4) {
                if (i == 5) {
                    return m14096a(f, (float) mo11680d().getHeight(), mo11682f());
                }
                throw new IllegalArgumentException("Vector not supported");
            }
        }
        float e = mo11681e();
        return Math.max(Math.min(f, this.f10441g ? this.f10440f * e : this.f10440f), e);
    }

    /* renamed from: a */
    public static final float m14096a(float f, float f2, float f3) {
        if (f3 < f2) {
            return (f2 / 2.0f) - (f3 / 2.0f);
        }
        return Math.max(Math.min(0.0f, f), -(f3 - f2));
    }
}
