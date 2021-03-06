package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import java.util.List;
import p201f.p202a.C5952h;

public class AnimatedImageResult {
    @C5952h
    private List<CloseableReference<Bitmap>> mDecodedFrames;
    private final int mFrameForPreview;
    private final AnimatedImage mImage;
    @C5952h
    private CloseableReference<Bitmap> mPreviewBitmap;

    AnimatedImageResult(AnimatedImageResultBuilder animatedImageResultBuilder) {
        this.mImage = (AnimatedImage) Preconditions.checkNotNull(animatedImageResultBuilder.getImage());
        this.mFrameForPreview = animatedImageResultBuilder.getFrameForPreview();
        this.mPreviewBitmap = animatedImageResultBuilder.getPreviewBitmap();
        this.mDecodedFrames = animatedImageResultBuilder.getDecodedFrames();
    }

    public static AnimatedImageResult forAnimatedImage(AnimatedImage animatedImage) {
        return new AnimatedImageResult(animatedImage);
    }

    public static AnimatedImageResultBuilder newBuilder(AnimatedImage animatedImage) {
        return new AnimatedImageResultBuilder(animatedImage);
    }

    public synchronized void dispose() {
        CloseableReference.closeSafely(this.mPreviewBitmap);
        this.mPreviewBitmap = null;
        CloseableReference.closeSafely((Iterable<? extends CloseableReference<?>>) this.mDecodedFrames);
        this.mDecodedFrames = null;
    }

    @C5952h
    public synchronized CloseableReference<Bitmap> getDecodedFrame(int i) {
        if (this.mDecodedFrames == null) {
            return null;
        }
        return CloseableReference.cloneOrNull((CloseableReference) this.mDecodedFrames.get(i));
    }

    public int getFrameForPreview() {
        return this.mFrameForPreview;
    }

    public AnimatedImage getImage() {
        return this.mImage;
    }

    public synchronized CloseableReference<Bitmap> getPreviewBitmap() {
        return CloseableReference.cloneOrNull(this.mPreviewBitmap);
    }

    public synchronized boolean hasDecodedFrame(int i) {
        return (this.mDecodedFrames == null || this.mDecodedFrames.get(i) == null) ? false : true;
    }

    private AnimatedImageResult(AnimatedImage animatedImage) {
        this.mImage = (AnimatedImage) Preconditions.checkNotNull(animatedImage);
        this.mFrameForPreview = 0;
    }
}
