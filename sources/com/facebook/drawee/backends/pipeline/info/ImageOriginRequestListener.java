package com.facebook.drawee.backends.pipeline.info;

import com.facebook.imagepipeline.listener.BaseRequestListener;
import p201f.p202a.C5952h;

public class ImageOriginRequestListener extends BaseRequestListener {
    private String mControllerId;
    @C5952h
    private final ImageOriginListener mImageOriginLister;

    public ImageOriginRequestListener(String str, @C5952h ImageOriginListener imageOriginListener) {
        this.mImageOriginLister = imageOriginListener;
        init(str);
    }

    public void init(String str) {
        this.mControllerId = str;
    }

    public void onUltimateProducerReached(String str, String str2, boolean z) {
        ImageOriginListener imageOriginListener = this.mImageOriginLister;
        if (imageOriginListener != null) {
            imageOriginListener.onImageLoaded(this.mControllerId, ImageOriginUtils.mapProducerNameToImageOrigin(str2), z);
        }
    }
}
