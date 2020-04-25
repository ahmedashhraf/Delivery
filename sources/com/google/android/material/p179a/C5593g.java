package com.google.android.material.p179a;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.C0193h0;

/* renamed from: com.google.android.material.a.g */
/* compiled from: MatrixEvaluator */
public class C5593g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f15939a = new float[9];

    /* renamed from: b */
    private final float[] f15940b = new float[9];

    /* renamed from: c */
    private final Matrix f15941c = new Matrix();

    @C0193h0
    /* renamed from: a */
    public Matrix evaluate(float f, @C0193h0 Matrix matrix, @C0193h0 Matrix matrix2) {
        matrix.getValues(this.f15939a);
        matrix2.getValues(this.f15940b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f15940b;
            float f2 = fArr[i];
            float[] fArr2 = this.f15939a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f15941c.setValues(this.f15940b);
        return this.f15941c;
    }
}
