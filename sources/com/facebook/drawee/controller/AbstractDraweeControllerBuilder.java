package com.facebook.drawee.controller;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSources;
import com.facebook.datasource.FirstAvailableDataSourceSupplier;
import com.facebook.datasource.IncreasingQualityDataSourceSupplier;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.gestures.GestureDetector;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder;
import com.facebook.infer.annotation.ReturnsOwnership;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p201f.p202a.C5952h;

public abstract class AbstractDraweeControllerBuilder<BUILDER extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements SimpleDraweeControllerBuilder {
    private static final NullPointerException NO_REQUEST_EXCEPTION = new NullPointerException("No image request was specified!");
    private static final ControllerListener<Object> sAutoPlayAnimationsListener = new BaseControllerListener<Object>() {
        public void onFinalImageSet(String str, @C5952h Object obj, @C5952h Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    };
    private static final AtomicLong sIdCounter = new AtomicLong();
    private boolean mAutoPlayAnimations;
    private final Set<ControllerListener> mBoundControllerListeners;
    @C5952h
    private Object mCallerContext;
    private String mContentDescription;
    private final Context mContext;
    @C5952h
    private ControllerListener<? super INFO> mControllerListener;
    @C5952h
    private ControllerViewportVisibilityListener mControllerViewportVisibilityListener;
    @C5952h
    private Supplier<DataSource<IMAGE>> mDataSourceSupplier;
    @C5952h
    private REQUEST mImageRequest;
    @C5952h
    private REQUEST mLowResImageRequest;
    @C5952h
    private REQUEST[] mMultiImageRequests;
    @C5952h
    private DraweeController mOldController;
    private boolean mRetainImageOnFailure;
    private boolean mTapToRetryEnabled;
    private boolean mTryCacheOnlyFirst;

    public enum CacheLevel {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    protected AbstractDraweeControllerBuilder(Context context, Set<ControllerListener> set) {
        this.mContext = context;
        this.mBoundControllerListeners = set;
        init();
    }

    protected static String generateUniqueControllerId() {
        return String.valueOf(sIdCounter.getAndIncrement());
    }

    private void init() {
        this.mCallerContext = null;
        this.mImageRequest = null;
        this.mLowResImageRequest = null;
        this.mMultiImageRequests = null;
        this.mTryCacheOnlyFirst = true;
        this.mControllerListener = null;
        this.mControllerViewportVisibilityListener = null;
        this.mTapToRetryEnabled = false;
        this.mAutoPlayAnimations = false;
        this.mOldController = null;
        this.mContentDescription = null;
    }

    /* access modifiers changed from: protected */
    public AbstractDraweeController buildController() {
        AbstractDraweeController obtainController = obtainController();
        obtainController.setRetainImageOnFailure(getRetainImageOnFailure());
        obtainController.setContentDescription(getContentDescription());
        obtainController.setControllerViewportVisibilityListener(getControllerViewportVisibilityListener());
        maybeBuildAndSetRetryManager(obtainController);
        maybeAttachListeners(obtainController);
        return obtainController;
    }

    public boolean getAutoPlayAnimations() {
        return this.mAutoPlayAnimations;
    }

    @C5952h
    public Object getCallerContext() {
        return this.mCallerContext;
    }

    @C5952h
    public String getContentDescription() {
        return this.mContentDescription;
    }

    /* access modifiers changed from: protected */
    public Context getContext() {
        return this.mContext;
    }

    @C5952h
    public ControllerListener<? super INFO> getControllerListener() {
        return this.mControllerListener;
    }

    @C5952h
    public ControllerViewportVisibilityListener getControllerViewportVisibilityListener() {
        return this.mControllerViewportVisibilityListener;
    }

    /* access modifiers changed from: protected */
    public abstract DataSource<IMAGE> getDataSourceForRequest(DraweeController draweeController, String str, REQUEST request, Object obj, CacheLevel cacheLevel);

    @C5952h
    public Supplier<DataSource<IMAGE>> getDataSourceSupplier() {
        return this.mDataSourceSupplier;
    }

    /* access modifiers changed from: protected */
    public Supplier<DataSource<IMAGE>> getDataSourceSupplierForRequest(DraweeController draweeController, String str, REQUEST request) {
        return getDataSourceSupplierForRequest(draweeController, str, request, CacheLevel.FULL_FETCH);
    }

    /* access modifiers changed from: protected */
    public Supplier<DataSource<IMAGE>> getFirstAvailableDataSourceSupplier(DraweeController draweeController, String str, REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST dataSourceSupplierForRequest : requestArr) {
                arrayList.add(getDataSourceSupplierForRequest(draweeController, str, dataSourceSupplierForRequest, CacheLevel.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST dataSourceSupplierForRequest2 : requestArr) {
            arrayList.add(getDataSourceSupplierForRequest(draweeController, str, dataSourceSupplierForRequest2));
        }
        return FirstAvailableDataSourceSupplier.create(arrayList);
    }

    @C5952h
    public REQUEST[] getFirstAvailableImageRequests() {
        return this.mMultiImageRequests;
    }

    @C5952h
    public REQUEST getImageRequest() {
        return this.mImageRequest;
    }

    @C5952h
    public REQUEST getLowResImageRequest() {
        return this.mLowResImageRequest;
    }

    @C5952h
    public DraweeController getOldController() {
        return this.mOldController;
    }

    public boolean getRetainImageOnFailure() {
        return this.mRetainImageOnFailure;
    }

    public boolean getTapToRetryEnabled() {
        return this.mTapToRetryEnabled;
    }

    /* access modifiers changed from: protected */
    public final BUILDER getThis() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void maybeAttachListeners(AbstractDraweeController abstractDraweeController) {
        Set<ControllerListener> set = this.mBoundControllerListeners;
        if (set != null) {
            for (ControllerListener addControllerListener : set) {
                abstractDraweeController.addControllerListener(addControllerListener);
            }
        }
        ControllerListener<? super INFO> controllerListener = this.mControllerListener;
        if (controllerListener != null) {
            abstractDraweeController.addControllerListener(controllerListener);
        }
        if (this.mAutoPlayAnimations) {
            abstractDraweeController.addControllerListener(sAutoPlayAnimationsListener);
        }
    }

    /* access modifiers changed from: protected */
    public void maybeBuildAndSetGestureDetector(AbstractDraweeController abstractDraweeController) {
        if (abstractDraweeController.getGestureDetector() == null) {
            abstractDraweeController.setGestureDetector(GestureDetector.newInstance(this.mContext));
        }
    }

    /* access modifiers changed from: protected */
    public void maybeBuildAndSetRetryManager(AbstractDraweeController abstractDraweeController) {
        if (this.mTapToRetryEnabled) {
            abstractDraweeController.getRetryManager().setTapToRetryEnabled(this.mTapToRetryEnabled);
            maybeBuildAndSetGestureDetector(abstractDraweeController);
        }
    }

    /* access modifiers changed from: protected */
    @ReturnsOwnership
    public abstract AbstractDraweeController obtainController();

    /* access modifiers changed from: protected */
    public Supplier<DataSource<IMAGE>> obtainDataSourceSupplier(DraweeController draweeController, String str) {
        Supplier<DataSource<IMAGE>> supplier = this.mDataSourceSupplier;
        if (supplier != null) {
            return supplier;
        }
        Supplier<DataSource<IMAGE>> supplier2 = null;
        REQUEST request = this.mImageRequest;
        if (request != null) {
            supplier2 = getDataSourceSupplierForRequest(draweeController, str, request);
        } else {
            REQUEST[] requestArr = this.mMultiImageRequests;
            if (requestArr != null) {
                supplier2 = getFirstAvailableDataSourceSupplier(draweeController, str, requestArr, this.mTryCacheOnlyFirst);
            }
        }
        if (!(supplier2 == null || this.mLowResImageRequest == null)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(supplier2);
            arrayList.add(getDataSourceSupplierForRequest(draweeController, str, this.mLowResImageRequest));
            supplier2 = IncreasingQualityDataSourceSupplier.create(arrayList, false);
        }
        if (supplier2 == null) {
            supplier2 = DataSources.getFailedDataSourceSupplier(NO_REQUEST_EXCEPTION);
        }
        return supplier2;
    }

    public BUILDER reset() {
        init();
        return getThis();
    }

    public BUILDER setAutoPlayAnimations(boolean z) {
        this.mAutoPlayAnimations = z;
        return getThis();
    }

    public BUILDER setContentDescription(String str) {
        this.mContentDescription = str;
        return getThis();
    }

    public BUILDER setControllerListener(ControllerListener<? super INFO> controllerListener) {
        this.mControllerListener = controllerListener;
        return getThis();
    }

    public BUILDER setControllerViewportVisibilityListener(@C5952h ControllerViewportVisibilityListener controllerViewportVisibilityListener) {
        this.mControllerViewportVisibilityListener = controllerViewportVisibilityListener;
        return getThis();
    }

    public BUILDER setDataSourceSupplier(@C5952h Supplier<DataSource<IMAGE>> supplier) {
        this.mDataSourceSupplier = supplier;
        return getThis();
    }

    public BUILDER setFirstAvailableImageRequests(REQUEST[] requestArr) {
        return setFirstAvailableImageRequests(requestArr, true);
    }

    public BUILDER setImageRequest(REQUEST request) {
        this.mImageRequest = request;
        return getThis();
    }

    public BUILDER setLowResImageRequest(REQUEST request) {
        this.mLowResImageRequest = request;
        return getThis();
    }

    public BUILDER setRetainImageOnFailure(boolean z) {
        this.mRetainImageOnFailure = z;
        return getThis();
    }

    public BUILDER setTapToRetryEnabled(boolean z) {
        this.mTapToRetryEnabled = z;
        return getThis();
    }

    /* access modifiers changed from: protected */
    public void validate() {
        boolean z = false;
        Preconditions.checkState(this.mMultiImageRequests == null || this.mImageRequest == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.mDataSourceSupplier == null || (this.mMultiImageRequests == null && this.mImageRequest == null && this.mLowResImageRequest == null)) {
            z = true;
        }
        Preconditions.checkState(z, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    public AbstractDraweeController build() {
        validate();
        if (this.mImageRequest == null && this.mMultiImageRequests == null) {
            REQUEST request = this.mLowResImageRequest;
            if (request != null) {
                this.mImageRequest = request;
                this.mLowResImageRequest = null;
            }
        }
        return buildController();
    }

    /* access modifiers changed from: protected */
    public Supplier<DataSource<IMAGE>> getDataSourceSupplierForRequest(DraweeController draweeController, String str, REQUEST request, CacheLevel cacheLevel) {
        final Object callerContext = getCallerContext();
        final DraweeController draweeController2 = draweeController;
        final String str2 = str;
        final REQUEST request2 = request;
        final CacheLevel cacheLevel2 = cacheLevel;
        C34612 r0 = new Supplier<DataSource<IMAGE>>() {
            public String toString() {
                return Objects.toStringHelper((Object) this).add("request", (Object) request2.toString()).toString();
            }

            public DataSource<IMAGE> get() {
                return AbstractDraweeControllerBuilder.this.getDataSourceForRequest(draweeController2, str2, request2, callerContext, cacheLevel2);
            }
        };
        return r0;
    }

    public BUILDER setCallerContext(Object obj) {
        this.mCallerContext = obj;
        return getThis();
    }

    public BUILDER setFirstAvailableImageRequests(REQUEST[] requestArr, boolean z) {
        Preconditions.checkArgument(requestArr == null || requestArr.length > 0, "No requests specified!");
        this.mMultiImageRequests = requestArr;
        this.mTryCacheOnlyFirst = z;
        return getThis();
    }

    public BUILDER setOldController(@C5952h DraweeController draweeController) {
        this.mOldController = draweeController;
        return getThis();
    }
}
