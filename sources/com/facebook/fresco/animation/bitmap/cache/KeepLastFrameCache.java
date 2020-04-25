package com.facebook.fresco.animation.bitmap.cache;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache.FrameCacheListener;
import com.facebook.imageutils.BitmapUtil;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5966a;

public class KeepLastFrameCache implements BitmapFrameCache {
    private static final int FRAME_NUMBER_UNSET = -1;
    @C5952h
    private FrameCacheListener mFrameCacheListener;
    @C5952h
    @C5966a("this")
    private CloseableReference<Bitmap> mLastBitmapReference;
    private int mLastFrameNumber = -1;

    private synchronized void closeAndResetLastBitmapReference() {
        if (!(this.mFrameCacheListener == null || this.mLastFrameNumber == -1)) {
            this.mFrameCacheListener.onFrameEvicted(this, this.mLastFrameNumber);
        }
        CloseableReference.closeSafely(this.mLastBitmapReference);
        this.mLastBitmapReference = null;
        this.mLastFrameNumber = -1;
    }

    public synchronized void clear() {
        closeAndResetLastBitmapReference();
    }

    public synchronized boolean contains(int i) {
        return i == this.mLastFrameNumber && CloseableReference.isValid(this.mLastBitmapReference);
    }

    public synchronized CloseableReference<Bitmap> getBitmapToReuseForFrame(int i, int i2, int i3) {
        CloseableReference<Bitmap> cloneOrNull;
        try {
            cloneOrNull = CloseableReference.cloneOrNull(this.mLastBitmapReference);
            closeAndResetLastBitmapReference();
        } catch (Throwable th) {
            closeAndResetLastBitmapReference();
            throw th;
        }
        return cloneOrNull;
    }

    @C5952h
    public synchronized CloseableReference<Bitmap> getCachedFrame(int i) {
        if (this.mLastFrameNumber != i) {
            return null;
        }
        return CloseableReference.cloneOrNull(this.mLastBitmapReference);
    }

    @C5952h
    public synchronized CloseableReference<Bitmap> getFallbackFrame(int i) {
        return CloseableReference.cloneOrNull(this.mLastBitmapReference);
    }

    public synchronized int getSizeInBytes() {
        int i;
        if (this.mLastBitmapReference == null) {
            i = 0;
        } else {
            i = BitmapUtil.getSizeInBytes((Bitmap) this.mLastBitmapReference.get());
        }
        return i;
    }

    public void onFramePrepared(int i, CloseableReference<Bitmap> closeableReference, int i2) {
    }

    public synchronized void onFrameRendered(int i, CloseableReference<Bitmap> closeableReference, int i2) {
        if (closeableReference != null) {
            if (this.mLastBitmapReference != null && ((Bitmap) closeableReference.get()).equals(this.mLastBitmapReference.get())) {
                return;
            }
        }
        CloseableReference.closeSafely(this.mLastBitmapReference);
        if (!(this.mFrameCacheListener == null || this.mLastFrameNumber == -1)) {
            this.mFrameCacheListener.onFrameEvicted(this, this.mLastFrameNumber);
        }
        this.mLastBitmapReference = CloseableReference.cloneOrNull(closeableReference);
        if (this.mFrameCacheListener != null) {
            this.mFrameCacheListener.onFrameCached(this, i);
        }
        this.mLastFrameNumber = i;
    }

    public void setFrameCacheListener(FrameCacheListener frameCacheListener) {
        this.mFrameCacheListener = frameCacheListener;
    }
}
