package com.google.android.material.p179a;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.C0193h0;

/* renamed from: com.google.android.material.a.f */
/* compiled from: ImageMatrixProperty */
public class C5592f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f15938a = new Matrix();

    public C5592f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public void set(@C0193h0 ImageView imageView, @C0193h0 Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }

    @C0193h0
    /* renamed from: a */
    public Matrix get(@C0193h0 ImageView imageView) {
        this.f15938a.set(imageView.getImageMatrix());
        return this.f15938a;
    }
}
