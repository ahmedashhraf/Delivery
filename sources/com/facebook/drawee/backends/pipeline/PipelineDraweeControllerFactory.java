package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import java.util.concurrent.Executor;
import p201f.p202a.C5952h;

public class PipelineDraweeControllerFactory {
    private DrawableFactory mAnimatedDrawableFactory;
    @C5952h
    private Supplier<Boolean> mDebugOverlayEnabledSupplier;
    private DeferredReleaser mDeferredReleaser;
    @C5952h
    private ImmutableList<DrawableFactory> mDrawableFactories;
    private MemoryCache<CacheKey, CloseableImage> mMemoryCache;
    private Resources mResources;
    private Executor mUiThreadExecutor;

    public void init(Resources resources, DeferredReleaser deferredReleaser, DrawableFactory drawableFactory, Executor executor, MemoryCache<CacheKey, CloseableImage> memoryCache, @C5952h ImmutableList<DrawableFactory> immutableList, @C5952h Supplier<Boolean> supplier) {
        this.mResources = resources;
        this.mDeferredReleaser = deferredReleaser;
        this.mAnimatedDrawableFactory = drawableFactory;
        this.mUiThreadExecutor = executor;
        this.mMemoryCache = memoryCache;
        this.mDrawableFactories = immutableList;
        this.mDebugOverlayEnabledSupplier = supplier;
    }

    /* access modifiers changed from: protected */
    public PipelineDraweeController internalCreateController(Resources resources, DeferredReleaser deferredReleaser, DrawableFactory drawableFactory, Executor executor, MemoryCache<CacheKey, CloseableImage> memoryCache, @C5952h ImmutableList<DrawableFactory> immutableList) {
        PipelineDraweeController pipelineDraweeController = new PipelineDraweeController(resources, deferredReleaser, drawableFactory, executor, memoryCache, immutableList);
        return pipelineDraweeController;
    }

    public PipelineDraweeController newController() {
        PipelineDraweeController internalCreateController = internalCreateController(this.mResources, this.mDeferredReleaser, this.mAnimatedDrawableFactory, this.mUiThreadExecutor, this.mMemoryCache, this.mDrawableFactories);
        Supplier<Boolean> supplier = this.mDebugOverlayEnabledSupplier;
        if (supplier != null) {
            internalCreateController.setDrawDebugOverlay(((Boolean) supplier.get()).booleanValue());
        }
        return internalCreateController;
    }
}
