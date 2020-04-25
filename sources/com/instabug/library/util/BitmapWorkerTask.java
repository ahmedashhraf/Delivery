package com.instabug.library.util;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class BitmapWorkerTask extends AsyncTask<String, Void, Bitmap> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private final WeakReference<ImageView> imageViewReference;
    private OnImageLoadedListener onImageLoadedListener;
    private boolean resize;
    private float targetHeight;
    private float targetWidth;

    public interface OnImageLoadedListener {
        void onImageLoaded();
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7365175722823451232L, "com/instabug/library/util/BitmapWorkerTask", 19);
        $jacocoData = a;
        return a;
    }

    public BitmapWorkerTask(ImageView imageView) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        this.imageViewReference = new WeakReference<>(imageView);
        $jacocoInit[1] = true;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean[] $jacocoInit = $jacocoInit();
        Bitmap doInBackground = doInBackground((String[]) objArr);
        $jacocoInit[18] = true;
        return doInBackground;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void onPostExecute(Object obj) {
        boolean[] $jacocoInit = $jacocoInit();
        onPostExecute((Bitmap) obj);
        $jacocoInit[17] = true;
    }

    /* access modifiers changed from: protected */
    public Bitmap doInBackground(String... strArr) {
        boolean[] $jacocoInit = $jacocoInit();
        Bitmap decodeSampledBitmapFromLocalPath = BitmapUtils.decodeSampledBitmapFromLocalPath(strArr[0]);
        if (!this.resize) {
            $jacocoInit[5] = true;
        } else {
            $jacocoInit[6] = true;
            decodeSampledBitmapFromLocalPath = BitmapUtils.resizeBitmap(decodeSampledBitmapFromLocalPath, this.targetWidth, this.targetHeight);
            $jacocoInit[7] = true;
        }
        $jacocoInit[8] = true;
        return decodeSampledBitmapFromLocalPath;
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(Bitmap bitmap) {
        boolean[] $jacocoInit = $jacocoInit();
        if (bitmap == null) {
            $jacocoInit[9] = true;
        } else {
            $jacocoInit[10] = true;
            ImageView imageView = (ImageView) this.imageViewReference.get();
            if (imageView == null) {
                $jacocoInit[11] = true;
            } else {
                $jacocoInit[12] = true;
                imageView.setImageBitmap(bitmap);
                OnImageLoadedListener onImageLoadedListener2 = this.onImageLoadedListener;
                if (onImageLoadedListener2 == null) {
                    $jacocoInit[13] = true;
                } else {
                    $jacocoInit[14] = true;
                    onImageLoadedListener2.onImageLoaded();
                    $jacocoInit[15] = true;
                }
            }
        }
        $jacocoInit[16] = true;
    }

    public BitmapWorkerTask(ImageView imageView, float f, float f2) {
        boolean[] $jacocoInit = $jacocoInit();
        this(imageView);
        this.targetWidth = f;
        this.targetHeight = f2;
        this.resize = true;
        $jacocoInit[2] = true;
    }

    public BitmapWorkerTask(ImageView imageView, OnImageLoadedListener onImageLoadedListener2) {
        boolean[] $jacocoInit = $jacocoInit();
        this(imageView);
        this.onImageLoadedListener = onImageLoadedListener2;
        $jacocoInit[3] = true;
    }

    public BitmapWorkerTask(ImageView imageView, float f, float f2, OnImageLoadedListener onImageLoadedListener2) {
        boolean[] $jacocoInit = $jacocoInit();
        this(imageView, f, f2);
        this.onImageLoadedListener = onImageLoadedListener2;
        $jacocoInit[4] = true;
    }
}
