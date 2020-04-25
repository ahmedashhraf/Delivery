package com.facebook.fresco.animation.bitmap.cache;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache.FrameCacheListener;
import com.facebook.imagepipeline.animated.impl.AnimatedFrameCache;
import com.facebook.imagepipeline.image.CloseableBitmap;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.ImmutableQualityInfo;
import com.facebook.imageutils.BitmapUtil;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5966a;

public class FrescoFrameCache implements BitmapFrameCache {
    private static final Class<?> TAG = FrescoFrameCache.class;
    private final AnimatedFrameCache mAnimatedFrameCache;
    private final boolean mEnableBitmapReusing;
    @C5952h
    @C5966a("this")
    private CloseableReference<CloseableImage> mLastRenderedItem;
    @C5966a("this")
    private final SparseArray<CloseableReference<CloseableImage>> mPreparedPendingFrames = new SparseArray<>();

    public FrescoFrameCache(AnimatedFrameCache animatedFrameCache, boolean z) {
        this.mAnimatedFrameCache = animatedFrameCache;
        this.mEnableBitmapReusing = z;
    }

    @C5952h
    @VisibleForTesting
    static CloseableReference<Bitmap> convertToBitmapReferenceAndClose(@C5952h CloseableReference<CloseableImage> closeableReference) {
        try {
            if (CloseableReference.isValid(closeableReference) && (closeableReference.get() instanceof CloseableStaticBitmap)) {
                CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) closeableReference.get();
                if (closeableStaticBitmap != null) {
                    return closeableStaticBitmap.cloneUnderlyingBitmapReference();
                }
            }
            CloseableReference.closeSafely(closeableReference);
            return null;
        } finally {
            CloseableReference.closeSafely(closeableReference);
        }
    }

    @C5952h
    private static CloseableReference<CloseableImage> createImageReference(CloseableReference<Bitmap> closeableReference) {
        return CloseableReference.m15817of(new CloseableStaticBitmap(closeableReference, ImmutableQualityInfo.FULL_QUALITY, 0));
    }

    private static int getBitmapSizeBytes(@C5952h CloseableReference<CloseableImage> closeableReference) {
        if (!CloseableReference.isValid(closeableReference)) {
            return 0;
        }
        return getBitmapSizeBytes((CloseableImage) closeableReference.get());
    }

    private synchronized int getPreparedPendingFramesSizeBytes() {
        int i;
        i = 0;
        for (int i2 = 0; i2 < this.mPreparedPendingFrames.size(); i2++) {
            i += getBitmapSizeBytes((CloseableReference) this.mPreparedPendingFrames.valueAt(i2));
        }
        return i;
    }

    private synchronized void removePreparedReference(int i) {
        CloseableReference closeableReference = (CloseableReference) this.mPreparedPendingFrames.get(i);
        if (closeableReference != null) {
            this.mPreparedPendingFrames.delete(i);
            CloseableReference.closeSafely(closeableReference);
            FLog.m15775v(TAG, "removePreparedReference(%d) removed. Pending frames: %s", (Object) Integer.valueOf(i), (Object) this.mPreparedPendingFrames);
        }
    }

    public synchronized void clear() {
        CloseableReference.closeSafely(this.mLastRenderedItem);
        this.mLastRenderedItem = null;
        for (int i = 0; i < this.mPreparedPendingFrames.size(); i++) {
            CloseableReference.closeSafely((CloseableReference) this.mPreparedPendingFrames.valueAt(i));
        }
        this.mPreparedPendingFrames.clear();
    }

    public synchronized boolean contains(int i) {
        return this.mAnimatedFrameCache.contains(i);
    }

    @C5952h
    public synchronized CloseableReference<Bitmap> getBitmapToReuseForFrame(int i, int i2, int i3) {
        if (!this.mEnableBitmapReusing) {
            return null;
        }
        return convertToBitmapReferenceAndClose(this.mAnimatedFrameCache.getForReuse());
    }

    @C5952h
    public synchronized CloseableReference<Bitmap> getCachedFrame(int i) {
        return convertToBitmapReferenceAndClose(this.mAnimatedFrameCache.get(i));
    }

    @C5952h
    public synchronized CloseableReference<Bitmap> getFallbackFrame(int i) {
        return convertToBitmapReferenceAndClose(CloseableReference.cloneOrNull(this.mLastRenderedItem));
    }

    public synchronized int getSizeInBytes() {
        return getBitmapSizeBytes(this.mLastRenderedItem) + getPreparedPendingFramesSizeBytes();
    }

    public synchronized void onFramePrepared(int i, CloseableReference<Bitmap> closeableReference, int i2) {
        Preconditions.checkNotNull(closeableReference);
        CloseableReference closeableReference2 = null;
        try {
            closeableReference2 = createImageReference(closeableReference);
            if (closeableReference2 != null) {
                CloseableReference cache = this.mAnimatedFrameCache.cache(i, closeableReference2);
                if (CloseableReference.isValid(cache)) {
                    CloseableReference.closeSafely((CloseableReference) this.mPreparedPendingFrames.get(i));
                    this.mPreparedPendingFrames.put(i, cache);
                    FLog.m15775v(TAG, "cachePreparedFrame(%d) cached. Pending frames: %s", (Object) Integer.valueOf(i), (Object) this.mPreparedPendingFrames);
                }
                CloseableReference.closeSafely(closeableReference2);
            }
        } finally {
            CloseableReference.closeSafely(closeableReference2);
        }
    }

    /* JADX INFO: finally extract failed */
    public synchronized void onFrameRendered(int i, CloseableReference<Bitmap> closeableReference, int i2) {
        Preconditions.checkNotNull(closeableReference);
        removePreparedReference(i);
        try {
            CloseableReference createImageReference = createImageReference(closeableReference);
            if (createImageReference != null) {
                CloseableReference.closeSafely(this.mLastRenderedItem);
                this.mLastRenderedItem = this.mAnimatedFrameCache.cache(i, createImageReference);
            }
            CloseableReference.closeSafely(createImageReference);
        } catch (Throwable th) {
            CloseableReference.closeSafely(null);
            throw th;
        }
    }

    public void setFrameCacheListener(FrameCacheListener frameCacheListener) {
    }

    private static int getBitmapSizeBytes(@C5952h CloseableImage closeableImage) {
        if (!(closeableImage instanceof CloseableBitmap)) {
            return 0;
        }
        return BitmapUtil.getSizeInBytes(((CloseableBitmap) closeableImage).getUnderlyingBitmap());
    }
}
