package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.drawee.components.DeferredReleaser.Releasable;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.components.DraweeEventTracker.Event;
import com.facebook.drawee.components.RetryManager;
import com.facebook.drawee.gestures.GestureDetector;
import com.facebook.drawee.gestures.GestureDetector.ClickListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.interfaces.SettableDraweeHierarchy;
import com.facebook.infer.annotation.ReturnsOwnership;
import java.util.concurrent.Executor;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5968c;

@C5968c
public abstract class AbstractDraweeController<T, INFO> implements DraweeController, Releasable, ClickListener {
    private static final Class<?> TAG = AbstractDraweeController.class;
    private Object mCallerContext;
    @C5952h
    private String mContentDescription;
    @C5952h
    private ControllerListener<INFO> mControllerListener;
    @C5952h
    private Drawable mControllerOverlay;
    @C5952h
    private ControllerViewportVisibilityListener mControllerViewportVisibilityListener;
    @C5952h
    private DataSource<T> mDataSource;
    private final DeferredReleaser mDeferredReleaser;
    @C5952h
    private Drawable mDrawable;
    private final DraweeEventTracker mEventTracker = DraweeEventTracker.newInstance();
    @C5952h
    private T mFetchedImage;
    @C5952h
    private GestureDetector mGestureDetector;
    private boolean mHasFetchFailed;
    private String mId;
    private boolean mIsAttached;
    private boolean mIsRequestSubmitted;
    private boolean mIsVisibleInViewportHint;
    private boolean mJustConstructed = true;
    private boolean mRetainImageOnFailure;
    @C5952h
    private RetryManager mRetryManager;
    @C5952h
    private SettableDraweeHierarchy mSettableDraweeHierarchy;
    private final Executor mUiThreadImmediateExecutor;

    private static class InternalForwardingListener<INFO> extends ForwardingControllerListener<INFO> {
        private InternalForwardingListener() {
        }

        public static <INFO> InternalForwardingListener<INFO> createInternal(ControllerListener<? super INFO> controllerListener, ControllerListener<? super INFO> controllerListener2) {
            InternalForwardingListener<INFO> internalForwardingListener = new InternalForwardingListener<>();
            internalForwardingListener.addListener(controllerListener);
            internalForwardingListener.addListener(controllerListener2);
            return internalForwardingListener;
        }
    }

    public AbstractDraweeController(DeferredReleaser deferredReleaser, Executor executor, String str, Object obj) {
        this.mDeferredReleaser = deferredReleaser;
        this.mUiThreadImmediateExecutor = executor;
        init(str, obj);
    }

    private synchronized void init(String str, Object obj) {
        this.mEventTracker.recordEvent(Event.ON_INIT_CONTROLLER);
        if (!this.mJustConstructed && this.mDeferredReleaser != null) {
            this.mDeferredReleaser.cancelDeferredRelease(this);
        }
        this.mIsAttached = false;
        this.mIsVisibleInViewportHint = false;
        releaseFetch();
        this.mRetainImageOnFailure = false;
        if (this.mRetryManager != null) {
            this.mRetryManager.init();
        }
        if (this.mGestureDetector != null) {
            this.mGestureDetector.init();
            this.mGestureDetector.setClickListener(this);
        }
        if (this.mControllerListener instanceof InternalForwardingListener) {
            ((InternalForwardingListener) this.mControllerListener).clearListeners();
        } else {
            this.mControllerListener = null;
        }
        this.mControllerViewportVisibilityListener = null;
        if (this.mSettableDraweeHierarchy != null) {
            this.mSettableDraweeHierarchy.reset();
            this.mSettableDraweeHierarchy.setControllerOverlay(null);
            this.mSettableDraweeHierarchy = null;
        }
        this.mControllerOverlay = null;
        if (FLog.isLoggable(2)) {
            FLog.m15776v(TAG, "controller %x %s -> %s: initialize", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.mId, (Object) str);
        }
        this.mId = str;
        this.mCallerContext = obj;
    }

    private boolean isExpectedDataSource(String str, DataSource<T> dataSource) {
        boolean z = true;
        if (dataSource == null && this.mDataSource == null) {
            return true;
        }
        if (!str.equals(this.mId) || dataSource != this.mDataSource || !this.mIsRequestSubmitted) {
            z = false;
        }
        return z;
    }

    private void logMessageAndFailure(String str, Throwable th) {
        if (FLog.isLoggable(2)) {
            FLog.m15777v(TAG, "controller %x %s: %s: failure: %s", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.mId, (Object) str, (Object) th);
        }
    }

    private void logMessageAndImage(String str, T t) {
        if (FLog.isLoggable(2)) {
            FLog.m15779v(TAG, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.mId, str, getImageClass(t), Integer.valueOf(getImageHash(t)));
        }
    }

    /* access modifiers changed from: private */
    public void onFailureInternal(String str, DataSource<T> dataSource, Throwable th, boolean z) {
        if (!isExpectedDataSource(str, dataSource)) {
            logMessageAndFailure("ignore_old_datasource @ onFailure", th);
            dataSource.close();
            return;
        }
        this.mEventTracker.recordEvent(z ? Event.ON_DATASOURCE_FAILURE : Event.ON_DATASOURCE_FAILURE_INT);
        if (z) {
            logMessageAndFailure("final_failed @ onFailure", th);
            this.mDataSource = null;
            this.mHasFetchFailed = true;
            if (this.mRetainImageOnFailure) {
                Drawable drawable = this.mDrawable;
                if (drawable != null) {
                    this.mSettableDraweeHierarchy.setImage(drawable, 1.0f, true);
                    getControllerListener().onFailure(this.mId, th);
                }
            }
            if (shouldRetryOnTap()) {
                this.mSettableDraweeHierarchy.setRetry(th);
            } else {
                this.mSettableDraweeHierarchy.setFailure(th);
            }
            getControllerListener().onFailure(this.mId, th);
        } else {
            logMessageAndFailure("intermediate_failed @ onFailure", th);
            getControllerListener().onIntermediateImageFailed(this.mId, th);
        }
    }

    /* access modifiers changed from: private */
    public void onNewResultInternal(String str, DataSource<T> dataSource, @C5952h T t, float f, boolean z, boolean z2) {
        if (!isExpectedDataSource(str, dataSource)) {
            logMessageAndImage("ignore_old_datasource @ onNewResult", t);
            releaseImage(t);
            dataSource.close();
            return;
        }
        this.mEventTracker.recordEvent(z ? Event.ON_DATASOURCE_RESULT : Event.ON_DATASOURCE_RESULT_INT);
        try {
            Drawable createDrawable = createDrawable(t);
            T t2 = this.mFetchedImage;
            Drawable drawable = this.mDrawable;
            this.mFetchedImage = t;
            this.mDrawable = createDrawable;
            String str2 = "release_previous_result @ onNewResult";
            if (z) {
                try {
                    logMessageAndImage("set_final_result @ onNewResult", t);
                    this.mDataSource = null;
                    this.mSettableDraweeHierarchy.setImage(createDrawable, 1.0f, z2);
                    getControllerListener().onFinalImageSet(str, getImageInfo(t), getAnimatable());
                } catch (Throwable th) {
                    if (!(drawable == null || drawable == createDrawable)) {
                        releaseDrawable(drawable);
                    }
                    if (!(t2 == null || t2 == t)) {
                        logMessageAndImage(str2, t2);
                        releaseImage(t2);
                    }
                    throw th;
                }
            } else {
                logMessageAndImage("set_intermediate_result @ onNewResult", t);
                this.mSettableDraweeHierarchy.setImage(createDrawable, f, z2);
                getControllerListener().onIntermediateImageSet(str, getImageInfo(t));
            }
            if (!(drawable == null || drawable == createDrawable)) {
                releaseDrawable(drawable);
            }
            if (!(t2 == null || t2 == t)) {
                logMessageAndImage(str2, t2);
                releaseImage(t2);
            }
        } catch (Exception e) {
            logMessageAndImage("drawable_failed @ onNewResult", t);
            releaseImage(t);
            onFailureInternal(str, dataSource, e, z);
        }
    }

    /* access modifiers changed from: private */
    public void onProgressUpdateInternal(String str, DataSource<T> dataSource, float f, boolean z) {
        if (!isExpectedDataSource(str, dataSource)) {
            logMessageAndFailure("ignore_old_datasource @ onProgress", null);
            dataSource.close();
            return;
        }
        if (!z) {
            this.mSettableDraweeHierarchy.setProgress(f, false);
        }
    }

    private void releaseFetch() {
        boolean z = this.mIsRequestSubmitted;
        this.mIsRequestSubmitted = false;
        this.mHasFetchFailed = false;
        DataSource<T> dataSource = this.mDataSource;
        if (dataSource != null) {
            dataSource.close();
            this.mDataSource = null;
        }
        Drawable drawable = this.mDrawable;
        if (drawable != null) {
            releaseDrawable(drawable);
        }
        if (this.mContentDescription != null) {
            this.mContentDescription = null;
        }
        this.mDrawable = null;
        T t = this.mFetchedImage;
        if (t != null) {
            logMessageAndImage("release", t);
            releaseImage(this.mFetchedImage);
            this.mFetchedImage = null;
        }
        if (z) {
            getControllerListener().onRelease(this.mId);
        }
    }

    private boolean shouldRetryOnTap() {
        if (this.mHasFetchFailed) {
            RetryManager retryManager = this.mRetryManager;
            if (retryManager != null && retryManager.shouldRetryOnTap()) {
                return true;
            }
        }
        return false;
    }

    public void addControllerListener(ControllerListener<? super INFO> controllerListener) {
        Preconditions.checkNotNull(controllerListener);
        ControllerListener<INFO> controllerListener2 = this.mControllerListener;
        if (controllerListener2 instanceof InternalForwardingListener) {
            ((InternalForwardingListener) controllerListener2).addListener(controllerListener);
        } else if (controllerListener2 != null) {
            this.mControllerListener = InternalForwardingListener.createInternal(controllerListener2, controllerListener);
        } else {
            this.mControllerListener = controllerListener;
        }
    }

    /* access modifiers changed from: protected */
    public abstract Drawable createDrawable(T t);

    @C5952h
    public Animatable getAnimatable() {
        Drawable drawable = this.mDrawable;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public T getCachedImage() {
        return null;
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    @C5952h
    public String getContentDescription() {
        return this.mContentDescription;
    }

    /* access modifiers changed from: protected */
    public ControllerListener<INFO> getControllerListener() {
        ControllerListener<INFO> controllerListener = this.mControllerListener;
        return controllerListener == null ? BaseControllerListener.getNoOpListener() : controllerListener;
    }

    /* access modifiers changed from: protected */
    @C5952h
    public Drawable getControllerOverlay() {
        return this.mControllerOverlay;
    }

    /* access modifiers changed from: protected */
    public abstract DataSource<T> getDataSource();

    /* access modifiers changed from: protected */
    @C5952h
    public GestureDetector getGestureDetector() {
        return this.mGestureDetector;
    }

    @C5952h
    public DraweeHierarchy getHierarchy() {
        return this.mSettableDraweeHierarchy;
    }

    public String getId() {
        return this.mId;
    }

    /* access modifiers changed from: protected */
    public String getImageClass(@C5952h T t) {
        return t != null ? t.getClass().getSimpleName() : "<null>";
    }

    /* access modifiers changed from: protected */
    public int getImageHash(@C5952h T t) {
        return System.identityHashCode(t);
    }

    /* access modifiers changed from: protected */
    @C5952h
    public abstract INFO getImageInfo(T t);

    /* access modifiers changed from: protected */
    @ReturnsOwnership
    public RetryManager getRetryManager() {
        if (this.mRetryManager == null) {
            this.mRetryManager = new RetryManager();
        }
        return this.mRetryManager;
    }

    /* access modifiers changed from: protected */
    public void initialize(String str, Object obj) {
        init(str, obj);
        this.mJustConstructed = false;
    }

    public void onAttach() {
        if (FLog.isLoggable(2)) {
            FLog.m15776v(TAG, "controller %x %s: onAttach: %s", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.mId, (Object) this.mIsRequestSubmitted ? "request already submitted" : "request needs submit");
        }
        this.mEventTracker.recordEvent(Event.ON_ATTACH_CONTROLLER);
        Preconditions.checkNotNull(this.mSettableDraweeHierarchy);
        this.mDeferredReleaser.cancelDeferredRelease(this);
        this.mIsAttached = true;
        if (!this.mIsRequestSubmitted) {
            submitRequest();
        }
    }

    public boolean onClick() {
        if (FLog.isLoggable(2)) {
            FLog.m15775v(TAG, "controller %x %s: onClick", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.mId);
        }
        if (!shouldRetryOnTap()) {
            return false;
        }
        this.mRetryManager.notifyTapToRetry();
        this.mSettableDraweeHierarchy.reset();
        submitRequest();
        return true;
    }

    public void onDetach() {
        if (FLog.isLoggable(2)) {
            FLog.m15775v(TAG, "controller %x %s: onDetach", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.mId);
        }
        this.mEventTracker.recordEvent(Event.ON_DETACH_CONTROLLER);
        this.mIsAttached = false;
        this.mDeferredReleaser.scheduleDeferredRelease(this);
    }

    /* access modifiers changed from: protected */
    public void onImageLoadedFromCacheImmediately(String str, T t) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (FLog.isLoggable(2)) {
            FLog.m15776v(TAG, "controller %x %s: onTouchEvent %s", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.mId, (Object) motionEvent);
        }
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector == null) {
            return false;
        }
        if (!gestureDetector.isCapturingGesture() && !shouldHandleGesture()) {
            return false;
        }
        this.mGestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    public void onViewportVisibilityHint(boolean z) {
        ControllerViewportVisibilityListener controllerViewportVisibilityListener = this.mControllerViewportVisibilityListener;
        if (controllerViewportVisibilityListener != null) {
            if (z && !this.mIsVisibleInViewportHint) {
                controllerViewportVisibilityListener.onDraweeViewportEntry(this.mId);
            } else if (!z && this.mIsVisibleInViewportHint) {
                controllerViewportVisibilityListener.onDraweeViewportExit(this.mId);
            }
        }
        this.mIsVisibleInViewportHint = z;
    }

    public void release() {
        this.mEventTracker.recordEvent(Event.ON_RELEASE_CONTROLLER);
        RetryManager retryManager = this.mRetryManager;
        if (retryManager != null) {
            retryManager.reset();
        }
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector != null) {
            gestureDetector.reset();
        }
        SettableDraweeHierarchy settableDraweeHierarchy = this.mSettableDraweeHierarchy;
        if (settableDraweeHierarchy != null) {
            settableDraweeHierarchy.reset();
        }
        releaseFetch();
    }

    /* access modifiers changed from: protected */
    public abstract void releaseDrawable(@C5952h Drawable drawable);

    /* access modifiers changed from: protected */
    public abstract void releaseImage(@C5952h T t);

    public void removeControllerListener(ControllerListener<? super INFO> controllerListener) {
        Preconditions.checkNotNull(controllerListener);
        ControllerListener<INFO> controllerListener2 = this.mControllerListener;
        if (controllerListener2 instanceof InternalForwardingListener) {
            ((InternalForwardingListener) controllerListener2).removeListener(controllerListener);
            return;
        }
        if (controllerListener2 == controllerListener) {
            this.mControllerListener = null;
        }
    }

    public void setContentDescription(@C5952h String str) {
        this.mContentDescription = str;
    }

    /* access modifiers changed from: protected */
    public void setControllerOverlay(@C5952h Drawable drawable) {
        this.mControllerOverlay = drawable;
        SettableDraweeHierarchy settableDraweeHierarchy = this.mSettableDraweeHierarchy;
        if (settableDraweeHierarchy != null) {
            settableDraweeHierarchy.setControllerOverlay(this.mControllerOverlay);
        }
    }

    public void setControllerViewportVisibilityListener(@C5952h ControllerViewportVisibilityListener controllerViewportVisibilityListener) {
        this.mControllerViewportVisibilityListener = controllerViewportVisibilityListener;
    }

    /* access modifiers changed from: protected */
    public void setGestureDetector(@C5952h GestureDetector gestureDetector) {
        this.mGestureDetector = gestureDetector;
        GestureDetector gestureDetector2 = this.mGestureDetector;
        if (gestureDetector2 != null) {
            gestureDetector2.setClickListener(this);
        }
    }

    public void setHierarchy(@C5952h DraweeHierarchy draweeHierarchy) {
        if (FLog.isLoggable(2)) {
            FLog.m15776v(TAG, "controller %x %s: setHierarchy: %s", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.mId, (Object) draweeHierarchy);
        }
        this.mEventTracker.recordEvent(draweeHierarchy != null ? Event.ON_SET_HIERARCHY : Event.ON_CLEAR_HIERARCHY);
        if (this.mIsRequestSubmitted) {
            this.mDeferredReleaser.cancelDeferredRelease(this);
            release();
        }
        SettableDraweeHierarchy settableDraweeHierarchy = this.mSettableDraweeHierarchy;
        if (settableDraweeHierarchy != null) {
            settableDraweeHierarchy.setControllerOverlay(null);
            this.mSettableDraweeHierarchy = null;
        }
        if (draweeHierarchy != null) {
            Preconditions.checkArgument(draweeHierarchy instanceof SettableDraweeHierarchy);
            this.mSettableDraweeHierarchy = (SettableDraweeHierarchy) draweeHierarchy;
            this.mSettableDraweeHierarchy.setControllerOverlay(this.mControllerOverlay);
        }
    }

    /* access modifiers changed from: protected */
    public void setRetainImageOnFailure(boolean z) {
        this.mRetainImageOnFailure = z;
    }

    /* access modifiers changed from: protected */
    public boolean shouldHandleGesture() {
        return shouldRetryOnTap();
    }

    /* access modifiers changed from: protected */
    public void submitRequest() {
        Object cachedImage = getCachedImage();
        if (cachedImage != null) {
            this.mDataSource = null;
            this.mIsRequestSubmitted = true;
            this.mHasFetchFailed = false;
            this.mEventTracker.recordEvent(Event.ON_SUBMIT_CACHE_HIT);
            getControllerListener().onSubmit(this.mId, this.mCallerContext);
            onImageLoadedFromCacheImmediately(this.mId, cachedImage);
            onNewResultInternal(this.mId, this.mDataSource, cachedImage, 1.0f, true, true);
            return;
        }
        this.mEventTracker.recordEvent(Event.ON_DATASOURCE_SUBMIT);
        getControllerListener().onSubmit(this.mId, this.mCallerContext);
        this.mSettableDraweeHierarchy.setProgress(0.0f, true);
        this.mIsRequestSubmitted = true;
        this.mHasFetchFailed = false;
        this.mDataSource = getDataSource();
        if (FLog.isLoggable(2)) {
            FLog.m15776v(TAG, "controller %x %s: submitRequest: dataSource: %x", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.mId, (Object) Integer.valueOf(System.identityHashCode(this.mDataSource)));
        }
        final String str = this.mId;
        final boolean hasResult = this.mDataSource.hasResult();
        this.mDataSource.subscribe(new BaseDataSubscriber<T>() {
            public void onFailureImpl(DataSource<T> dataSource) {
                AbstractDraweeController.this.onFailureInternal(str, dataSource, dataSource.getFailureCause(), true);
            }

            public void onNewResultImpl(DataSource<T> dataSource) {
                boolean isFinished = dataSource.isFinished();
                float progress = dataSource.getProgress();
                Object result = dataSource.getResult();
                if (result != null) {
                    AbstractDraweeController.this.onNewResultInternal(str, dataSource, result, progress, isFinished, hasResult);
                } else if (isFinished) {
                    AbstractDraweeController.this.onFailureInternal(str, dataSource, new NullPointerException(), true);
                }
            }

            public void onProgressUpdate(DataSource<T> dataSource) {
                boolean isFinished = dataSource.isFinished();
                AbstractDraweeController.this.onProgressUpdateInternal(str, dataSource, dataSource.getProgress(), isFinished);
            }
        }, this.mUiThreadImmediateExecutor);
    }

    public String toString() {
        return Objects.toStringHelper((Object) this).add("isAttached", this.mIsAttached).add("isRequestSubmitted", this.mIsRequestSubmitted).add("hasFetchFailed", this.mHasFetchFailed).add("fetchedImage", getImageHash(this.mFetchedImage)).add("events", (Object) this.mEventTracker.toString()).toString();
    }
}
