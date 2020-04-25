package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imageutils.BitmapUtil;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5966a;
import p201f.p202a.p203u.C5969d;

@C5969d
public class CloseableStaticBitmap extends CloseableBitmap {
    private volatile Bitmap mBitmap;
    @C5966a("this")
    private CloseableReference<Bitmap> mBitmapReference;
    private final int mExifOrientation;
    private final QualityInfo mQualityInfo;
    private final int mRotationAngle;

    public CloseableStaticBitmap(Bitmap bitmap, ResourceReleaser<Bitmap> resourceReleaser, QualityInfo qualityInfo, int i) {
        this(bitmap, resourceReleaser, qualityInfo, i, 0);
    }

    private synchronized CloseableReference<Bitmap> detachBitmapReference() {
        CloseableReference<Bitmap> closeableReference;
        closeableReference = this.mBitmapReference;
        this.mBitmapReference = null;
        this.mBitmap = null;
        return closeableReference;
    }

    private static int getBitmapHeight(@C5952h Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int getBitmapWidth(@C5952h Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    @C5952h
    public synchronized CloseableReference<Bitmap> cloneUnderlyingBitmapReference() {
        return CloseableReference.cloneOrNull(this.mBitmapReference);
    }

    public void close() {
        CloseableReference detachBitmapReference = detachBitmapReference();
        if (detachBitmapReference != null) {
            detachBitmapReference.close();
        }
    }

    public synchronized CloseableReference<Bitmap> convertToBitmapReference() {
        Preconditions.checkNotNull(this.mBitmapReference, "Cannot convert a closed static bitmap");
        return detachBitmapReference();
    }

    public int getExifOrientation() {
        return this.mExifOrientation;
    }

    public int getHeight() {
        if (this.mRotationAngle % 180 == 0) {
            int i = this.mExifOrientation;
            if (!(i == 5 || i == 7)) {
                return getBitmapHeight(this.mBitmap);
            }
        }
        return getBitmapWidth(this.mBitmap);
    }

    public QualityInfo getQualityInfo() {
        return this.mQualityInfo;
    }

    public int getRotationAngle() {
        return this.mRotationAngle;
    }

    public int getSizeInBytes() {
        return BitmapUtil.getSizeInBytes(this.mBitmap);
    }

    public Bitmap getUnderlyingBitmap() {
        return this.mBitmap;
    }

    public int getWidth() {
        if (this.mRotationAngle % 180 == 0) {
            int i = this.mExifOrientation;
            if (!(i == 5 || i == 7)) {
                return getBitmapWidth(this.mBitmap);
            }
        }
        return getBitmapHeight(this.mBitmap);
    }

    public synchronized boolean isClosed() {
        return this.mBitmapReference == null;
    }

    public CloseableStaticBitmap(Bitmap bitmap, ResourceReleaser<Bitmap> resourceReleaser, QualityInfo qualityInfo, int i, int i2) {
        this.mBitmap = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.mBitmapReference = CloseableReference.m15818of(this.mBitmap, (ResourceReleaser) Preconditions.checkNotNull(resourceReleaser));
        this.mQualityInfo = qualityInfo;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
    }

    public CloseableStaticBitmap(CloseableReference<Bitmap> closeableReference, QualityInfo qualityInfo, int i) {
        this(closeableReference, qualityInfo, i, 0);
    }

    public CloseableStaticBitmap(CloseableReference<Bitmap> closeableReference, QualityInfo qualityInfo, int i, int i2) {
        this.mBitmapReference = (CloseableReference) Preconditions.checkNotNull(closeableReference.cloneOrNull());
        this.mBitmap = (Bitmap) this.mBitmapReference.get();
        this.mQualityInfo = qualityInfo;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
    }
}
