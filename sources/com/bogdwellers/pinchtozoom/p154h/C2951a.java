package com.bogdwellers.pinchtozoom.p154h;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.bogdwellers.pinchtozoom.h.a */
/* compiled from: ImageViewUtils */
public class C2951a {
    /* renamed from: a */
    public static final void m14127a(ImageView imageView, Bitmap bitmap) {
        m14126a(imageView, (float) bitmap.getWidth(), (float) bitmap.getHeight());
    }

    /* renamed from: a */
    public static final void m14128a(ImageView imageView, BitmapDrawable bitmapDrawable) {
        m14126a(imageView, (float) bitmapDrawable.getIntrinsicWidth(), (float) bitmapDrawable.getIntrinsicHeight());
    }

    /* renamed from: a */
    public static final void m14126a(ImageView imageView, float f, float f2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = imageView.getImageMatrix();
            if (!imageMatrix.isIdentity()) {
                float[] fArr = new float[9];
                imageMatrix.getValues(fArr);
                RectF rectF = new RectF();
                rectF.left = 0.0f;
                rectF.top = 0.0f;
                rectF.right = f;
                rectF.bottom = f2;
                RectF rectF2 = new RectF();
                rectF2.left = fArr[2];
                rectF2.top = fArr[5];
                rectF2.right = rectF2.left + (((float) drawable.getIntrinsicWidth()) * fArr[0]);
                rectF2.bottom = rectF2.top + (((float) drawable.getIntrinsicHeight()) * fArr[4]);
                imageMatrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
                return;
            }
            return;
        }
        throw new NullPointerException("ImageView drawable is null");
    }
}
