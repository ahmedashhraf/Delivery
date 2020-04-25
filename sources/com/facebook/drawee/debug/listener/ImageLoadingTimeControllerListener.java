package com.facebook.drawee.debug.listener;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.BaseControllerListener;
import p201f.p202a.C5952h;

public class ImageLoadingTimeControllerListener extends BaseControllerListener {
    private long mFinalImageSetTimeMs = -1;
    @C5952h
    private ImageLoadingTimeListener mImageLoadingTimeListener;
    private long mRequestSubmitTimeMs = -1;

    public ImageLoadingTimeControllerListener(@C5952h ImageLoadingTimeListener imageLoadingTimeListener) {
        this.mImageLoadingTimeListener = imageLoadingTimeListener;
    }

    public void onFinalImageSet(String str, @C5952h Object obj, @C5952h Animatable animatable) {
        this.mFinalImageSetTimeMs = System.currentTimeMillis();
        ImageLoadingTimeListener imageLoadingTimeListener = this.mImageLoadingTimeListener;
        if (imageLoadingTimeListener != null) {
            imageLoadingTimeListener.onFinalImageSet(this.mFinalImageSetTimeMs - this.mRequestSubmitTimeMs);
        }
    }

    public void onSubmit(String str, Object obj) {
        this.mRequestSubmitTimeMs = System.currentTimeMillis();
    }
}
