package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.ArrayList;
import java.util.List;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5966a;

public class BaseProducerContext implements ProducerContext {
    @C5966a("this")
    private final List<ProducerContextCallbacks> mCallbacks = new ArrayList();
    private final Object mCallerContext;
    private final String mId;
    private final ImageRequest mImageRequest;
    @C5966a("this")
    private boolean mIsCancelled = false;
    @C5966a("this")
    private boolean mIsIntermediateResultExpected;
    @C5966a("this")
    private boolean mIsPrefetch;
    private final RequestLevel mLowestPermittedRequestLevel;
    @C5966a("this")
    private Priority mPriority;
    private final ProducerListener mProducerListener;

    public BaseProducerContext(ImageRequest imageRequest, String str, ProducerListener producerListener, Object obj, RequestLevel requestLevel, boolean z, boolean z2, Priority priority) {
        this.mImageRequest = imageRequest;
        this.mId = str;
        this.mProducerListener = producerListener;
        this.mCallerContext = obj;
        this.mLowestPermittedRequestLevel = requestLevel;
        this.mIsPrefetch = z;
        this.mPriority = priority;
        this.mIsIntermediateResultExpected = z2;
    }

    public static void callOnCancellationRequested(@C5952h List<ProducerContextCallbacks> list) {
        if (list != null) {
            for (ProducerContextCallbacks onCancellationRequested : list) {
                onCancellationRequested.onCancellationRequested();
            }
        }
    }

    public static void callOnIsIntermediateResultExpectedChanged(@C5952h List<ProducerContextCallbacks> list) {
        if (list != null) {
            for (ProducerContextCallbacks onIsIntermediateResultExpectedChanged : list) {
                onIsIntermediateResultExpectedChanged.onIsIntermediateResultExpectedChanged();
            }
        }
    }

    public static void callOnIsPrefetchChanged(@C5952h List<ProducerContextCallbacks> list) {
        if (list != null) {
            for (ProducerContextCallbacks onIsPrefetchChanged : list) {
                onIsPrefetchChanged.onIsPrefetchChanged();
            }
        }
    }

    public static void callOnPriorityChanged(@C5952h List<ProducerContextCallbacks> list) {
        if (list != null) {
            for (ProducerContextCallbacks onPriorityChanged : list) {
                onPriorityChanged.onPriorityChanged();
            }
        }
    }

    public void addCallbacks(ProducerContextCallbacks producerContextCallbacks) {
        boolean z;
        synchronized (this) {
            this.mCallbacks.add(producerContextCallbacks);
            z = this.mIsCancelled;
        }
        if (z) {
            producerContextCallbacks.onCancellationRequested();
        }
    }

    public void cancel() {
        callOnCancellationRequested(cancelNoCallbacks());
    }

    @C5952h
    public synchronized List<ProducerContextCallbacks> cancelNoCallbacks() {
        if (this.mIsCancelled) {
            return null;
        }
        this.mIsCancelled = true;
        return new ArrayList(this.mCallbacks);
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public String getId() {
        return this.mId;
    }

    public ImageRequest getImageRequest() {
        return this.mImageRequest;
    }

    public ProducerListener getListener() {
        return this.mProducerListener;
    }

    public RequestLevel getLowestPermittedRequestLevel() {
        return this.mLowestPermittedRequestLevel;
    }

    public synchronized Priority getPriority() {
        return this.mPriority;
    }

    public synchronized boolean isCancelled() {
        return this.mIsCancelled;
    }

    public synchronized boolean isIntermediateResultExpected() {
        return this.mIsIntermediateResultExpected;
    }

    public synchronized boolean isPrefetch() {
        return this.mIsPrefetch;
    }

    @C5952h
    public synchronized List<ProducerContextCallbacks> setIsIntermediateResultExpectedNoCallbacks(boolean z) {
        if (z == this.mIsIntermediateResultExpected) {
            return null;
        }
        this.mIsIntermediateResultExpected = z;
        return new ArrayList(this.mCallbacks);
    }

    @C5952h
    public synchronized List<ProducerContextCallbacks> setIsPrefetchNoCallbacks(boolean z) {
        if (z == this.mIsPrefetch) {
            return null;
        }
        this.mIsPrefetch = z;
        return new ArrayList(this.mCallbacks);
    }

    @C5952h
    public synchronized List<ProducerContextCallbacks> setPriorityNoCallbacks(Priority priority) {
        if (priority == this.mPriority) {
            return null;
        }
        this.mPriority = priority;
        return new ArrayList(this.mCallbacks);
    }
}
