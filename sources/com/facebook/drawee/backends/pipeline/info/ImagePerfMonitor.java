package com.facebook.drawee.backends.pipeline.info;

import com.facebook.common.time.MonotonicClock;
import com.facebook.drawee.backends.pipeline.PipelineDraweeController;
import com.facebook.drawee.backends.pipeline.info.internal.ImagePerfControllerListener;
import com.facebook.drawee.backends.pipeline.info.internal.ImagePerfImageOriginListener;
import com.facebook.drawee.backends.pipeline.info.internal.ImagePerfRequestListener;
import com.facebook.imagepipeline.listener.BaseRequestListener;
import com.facebook.imagepipeline.listener.ForwardingRequestListener;
import java.util.LinkedList;
import java.util.List;
import p201f.p202a.C5952h;

public class ImagePerfMonitor extends BaseRequestListener {
    private boolean mEnabled;
    @C5952h
    private ForwardingRequestListener mForwardingRequestListener;
    @C5952h
    private ImageOriginListener mImageOriginListener;
    @C5952h
    private ImageOriginRequestListener mImageOriginRequestListener;
    @C5952h
    private ImagePerfControllerListener mImagePerfControllerListener;
    @C5952h
    private List<ImagePerfDataListener> mImagePerfDataListeners;
    @C5952h
    private ImagePerfRequestListener mImagePerfRequestListener;
    private final ImagePerfState mImagePerfState = new ImagePerfState();
    private final MonotonicClock mMonotonicClock;
    private final PipelineDraweeController mPipelineDraweeController;

    public ImagePerfMonitor(MonotonicClock monotonicClock, PipelineDraweeController pipelineDraweeController) {
        this.mMonotonicClock = monotonicClock;
        this.mPipelineDraweeController = pipelineDraweeController;
    }

    private void setupListeners() {
        if (this.mImagePerfControllerListener == null) {
            this.mImagePerfControllerListener = new ImagePerfControllerListener(this.mMonotonicClock, this.mImagePerfState, this);
        }
        if (this.mImagePerfRequestListener == null) {
            this.mImagePerfRequestListener = new ImagePerfRequestListener(this.mMonotonicClock, this.mImagePerfState);
        }
        if (this.mImageOriginListener == null) {
            this.mImageOriginListener = new ImagePerfImageOriginListener(this.mImagePerfState, this);
        }
        ImageOriginRequestListener imageOriginRequestListener = this.mImageOriginRequestListener;
        if (imageOriginRequestListener == null) {
            this.mImageOriginRequestListener = new ImageOriginRequestListener(this.mPipelineDraweeController.getId(), this.mImageOriginListener);
        } else {
            imageOriginRequestListener.init(this.mPipelineDraweeController.getId());
        }
        if (this.mForwardingRequestListener == null) {
            this.mForwardingRequestListener = new ForwardingRequestListener(this.mImagePerfRequestListener, this.mImageOriginRequestListener);
        }
    }

    public void addImagePerfDataListener(@C5952h ImagePerfDataListener imagePerfDataListener) {
        if (imagePerfDataListener != null) {
            if (this.mImagePerfDataListeners == null) {
                this.mImagePerfDataListeners = new LinkedList();
            }
            this.mImagePerfDataListeners.add(imagePerfDataListener);
        }
    }

    public void clearImagePerfDataListeners() {
        List<ImagePerfDataListener> list = this.mImagePerfDataListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void notifyListeners(ImagePerfState imagePerfState, int i) {
        imagePerfState.setImageLoadStatus(i);
        if (this.mEnabled) {
            List<ImagePerfDataListener> list = this.mImagePerfDataListeners;
            if (list != null && !list.isEmpty()) {
                ImagePerfData snapshot = imagePerfState.snapshot();
                for (ImagePerfDataListener onImagePerfDataUpdated : this.mImagePerfDataListeners) {
                    onImagePerfDataUpdated.onImagePerfDataUpdated(snapshot, i);
                }
            }
        }
    }

    public void removeImagePerfDataListener(ImagePerfDataListener imagePerfDataListener) {
        List<ImagePerfDataListener> list = this.mImagePerfDataListeners;
        if (list != null) {
            list.remove(imagePerfDataListener);
        }
    }

    public void reset() {
        clearImagePerfDataListeners();
        setEnabled(false);
        this.mImagePerfState.reset();
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
        if (z) {
            setupListeners();
            ImageOriginListener imageOriginListener = this.mImageOriginListener;
            if (imageOriginListener != null) {
                this.mPipelineDraweeController.addImageOriginListener(imageOriginListener);
            }
            ImagePerfControllerListener imagePerfControllerListener = this.mImagePerfControllerListener;
            if (imagePerfControllerListener != null) {
                this.mPipelineDraweeController.addControllerListener(imagePerfControllerListener);
            }
            ForwardingRequestListener forwardingRequestListener = this.mForwardingRequestListener;
            if (forwardingRequestListener != null) {
                this.mPipelineDraweeController.addRequestListener(forwardingRequestListener);
                return;
            }
            return;
        }
        ImageOriginListener imageOriginListener2 = this.mImageOriginListener;
        if (imageOriginListener2 != null) {
            this.mPipelineDraweeController.removeImageOriginListener(imageOriginListener2);
        }
        ImagePerfControllerListener imagePerfControllerListener2 = this.mImagePerfControllerListener;
        if (imagePerfControllerListener2 != null) {
            this.mPipelineDraweeController.removeControllerListener(imagePerfControllerListener2);
        }
        ForwardingRequestListener forwardingRequestListener2 = this.mForwardingRequestListener;
        if (forwardingRequestListener2 != null) {
            this.mPipelineDraweeController.removeRequestListener(forwardingRequestListener2);
        }
    }
}
