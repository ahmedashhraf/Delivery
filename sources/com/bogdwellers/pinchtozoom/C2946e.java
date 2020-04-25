package com.bogdwellers.pinchtozoom;

import android.graphics.Matrix;

/* renamed from: com.bogdwellers.pinchtozoom.e */
/* compiled from: MatrixCorrector */
public abstract class C2946e {

    /* renamed from: a */
    private Matrix f10442a;

    /* renamed from: b */
    private float[] f10443b;

    public C2946e() {
        this(null);
    }

    /* renamed from: a */
    public float mo11714a(int i, float f) {
        return f;
    }

    /* renamed from: a */
    public Matrix mo11720a() {
        return this.f10442a;
    }

    /* renamed from: b */
    public float mo11721b(int i, float f) {
        float f2 = mo11722b()[i];
        if (i != 0) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalArgumentException("Vector not supported");
                    }
                }
            }
            return mo11714a(i, f + f2) - f2;
        }
        return mo11714a(i, f * f2) / f2;
    }

    /* renamed from: c */
    public void mo11717c() {
    }

    public C2946e(Matrix matrix) {
        this.f10442a = matrix;
        this.f10443b = new float[9];
    }

    /* renamed from: a */
    public void mo11678a(Matrix matrix) {
        this.f10442a = matrix;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float[] mo11722b() {
        this.f10442a.getValues(this.f10443b);
        return this.f10443b;
    }
}
