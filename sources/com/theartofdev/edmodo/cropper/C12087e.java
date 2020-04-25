package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;
import android.widget.ImageView;

/* renamed from: com.theartofdev.edmodo.cropper.e */
/* compiled from: CropImageAnimation */
final class C12087e extends Animation implements AnimationListener {

    /* renamed from: N */
    private final float[] f34962N = new float[8];

    /* renamed from: O */
    private final float[] f34963O = new float[8];

    /* renamed from: P */
    private final RectF f34964P = new RectF();

    /* renamed from: Q */
    private final RectF f34965Q = new RectF();

    /* renamed from: R */
    private final float[] f34966R = new float[9];

    /* renamed from: S */
    private final float[] f34967S = new float[9];

    /* renamed from: T */
    private final RectF f34968T = new RectF();

    /* renamed from: U */
    private final float[] f34969U = new float[8];

    /* renamed from: V */
    private final float[] f34970V = new float[9];

    /* renamed from: a */
    private final ImageView f34971a;

    /* renamed from: b */
    private final CropOverlayView f34972b;

    public C12087e(ImageView imageView, CropOverlayView cropOverlayView) {
        this.f34971a = imageView;
        this.f34972b = cropOverlayView;
        setDuration(300);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    /* renamed from: a */
    public void mo41413a(float[] fArr, Matrix matrix) {
        System.arraycopy(fArr, 0, this.f34963O, 0, 8);
        this.f34965Q.set(this.f34972b.getCropWindowRect());
        matrix.getValues(this.f34967S);
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        float[] fArr;
        RectF rectF = this.f34968T;
        RectF rectF2 = this.f34964P;
        float f2 = rectF2.left;
        RectF rectF3 = this.f34965Q;
        rectF.left = f2 + ((rectF3.left - f2) * f);
        float f3 = rectF2.top;
        rectF.top = f3 + ((rectF3.top - f3) * f);
        float f4 = rectF2.right;
        rectF.right = f4 + ((rectF3.right - f4) * f);
        float f5 = rectF2.bottom;
        rectF.bottom = f5 + ((rectF3.bottom - f5) * f);
        this.f34972b.setCropWindowRect(rectF);
        int i = 0;
        int i2 = 0;
        while (true) {
            fArr = this.f34969U;
            if (i2 >= fArr.length) {
                break;
            }
            float[] fArr2 = this.f34962N;
            fArr[i2] = fArr2[i2] + ((this.f34963O[i2] - fArr2[i2]) * f);
            i2++;
        }
        this.f34972b.mo41378a(fArr, this.f34971a.getWidth(), this.f34971a.getHeight());
        while (true) {
            float[] fArr3 = this.f34970V;
            if (i < fArr3.length) {
                float[] fArr4 = this.f34966R;
                fArr3[i] = fArr4[i] + ((this.f34967S[i] - fArr4[i]) * f);
                i++;
            } else {
                Matrix imageMatrix = this.f34971a.getImageMatrix();
                imageMatrix.setValues(this.f34970V);
                this.f34971a.setImageMatrix(imageMatrix);
                this.f34971a.invalidate();
                this.f34972b.invalidate();
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo41415b(float[] fArr, Matrix matrix) {
        reset();
        System.arraycopy(fArr, 0, this.f34962N, 0, 8);
        this.f34964P.set(this.f34972b.getCropWindowRect());
        matrix.getValues(this.f34966R);
    }

    public void onAnimationEnd(Animation animation) {
        this.f34971a.clearAnimation();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
