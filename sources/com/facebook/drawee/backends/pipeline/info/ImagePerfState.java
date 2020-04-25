package com.facebook.drawee.backends.pipeline.info;

import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import p201f.p202a.C5952h;

public class ImagePerfState {
    @C5952h
    private Object mCallerContext;
    private long mControllerCancelTimeMs = -1;
    private long mControllerFailureTimeMs = -1;
    private long mControllerFinalImageSetTimeMs = -1;
    @C5952h
    private String mControllerId;
    private long mControllerIntermediateImageSetTimeMs = -1;
    private long mControllerSubmitTimeMs = -1;
    @C5952h
    private ImageInfo mImageInfo;
    private int mImageLoadStatus = -1;
    private int mImageOrigin = -1;
    @C5952h
    private ImageRequest mImageRequest;
    private long mImageRequestEndTimeMs = -1;
    private long mImageRequestStartTimeMs = -1;
    private boolean mIsCanceled;
    private boolean mIsPrefetch;
    private boolean mIsSuccessful;
    @C5952h
    private String mRequestId;

    public int getImageLoadStatus() {
        return this.mImageLoadStatus;
    }

    public void reset() {
        this.mRequestId = null;
        this.mImageRequest = null;
        this.mCallerContext = null;
        this.mImageInfo = null;
        this.mControllerSubmitTimeMs = -1;
        this.mControllerFinalImageSetTimeMs = -1;
        this.mControllerFailureTimeMs = -1;
        this.mControllerCancelTimeMs = -1;
        this.mImageRequestStartTimeMs = -1;
        this.mImageRequestEndTimeMs = -1;
        this.mImageOrigin = -1;
        this.mIsCanceled = false;
        this.mIsSuccessful = false;
        this.mIsPrefetch = false;
        this.mImageLoadStatus = -1;
    }

    public void setCallerContext(@C5952h Object obj) {
        this.mCallerContext = obj;
    }

    public void setCanceled(boolean z) {
        this.mIsCanceled = z;
    }

    public void setControllerCancelTimeMs(long j) {
        this.mControllerCancelTimeMs = j;
    }

    public void setControllerFailureTimeMs(long j) {
        this.mControllerFailureTimeMs = j;
    }

    public void setControllerFinalImageSetTimeMs(long j) {
        this.mControllerFinalImageSetTimeMs = j;
    }

    public void setControllerId(@C5952h String str) {
        this.mControllerId = str;
    }

    public void setControllerIntermediateImageSetTimeMs(long j) {
        this.mControllerIntermediateImageSetTimeMs = j;
    }

    public void setControllerSubmitTimeMs(long j) {
        this.mControllerSubmitTimeMs = j;
    }

    public void setImageInfo(@C5952h ImageInfo imageInfo) {
        this.mImageInfo = imageInfo;
    }

    public void setImageLoadStatus(int i) {
        this.mImageLoadStatus = i;
    }

    public void setImageOrigin(int i) {
        this.mImageOrigin = i;
    }

    public void setImageRequest(@C5952h ImageRequest imageRequest) {
        this.mImageRequest = imageRequest;
    }

    public void setImageRequestEndTimeMs(long j) {
        this.mImageRequestEndTimeMs = j;
    }

    public void setImageRequestStartTimeMs(long j) {
        this.mImageRequestStartTimeMs = j;
    }

    public void setPrefetch(boolean z) {
        this.mIsPrefetch = z;
    }

    public void setRequestId(@C5952h String str) {
        this.mRequestId = str;
    }

    public void setSuccessful(boolean z) {
        this.mIsSuccessful = z;
    }

    public ImagePerfData snapshot() {
        ImagePerfData imagePerfData = new ImagePerfData(this.mControllerId, this.mRequestId, this.mImageRequest, this.mCallerContext, this.mImageInfo, this.mControllerSubmitTimeMs, this.mControllerIntermediateImageSetTimeMs, this.mControllerFinalImageSetTimeMs, this.mControllerFailureTimeMs, this.mControllerCancelTimeMs, this.mImageRequestStartTimeMs, this.mImageRequestEndTimeMs, this.mImageOrigin, this.mIsCanceled, this.mIsSuccessful, this.mIsPrefetch);
        return imagePerfData;
    }
}
