package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import p201f.p202a.C5952h;

public abstract class BasePostprocessor implements Postprocessor {
    public static final Config FALLBACK_BITMAP_CONFIGURATION = Config.ARGB_8888;

    private static void internalCopyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            Bitmaps.copyBitmap(bitmap, bitmap2);
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, null);
        }
    }

    public String getName() {
        return "Unknown postprocessor";
    }

    @C5952h
    public CacheKey getPostprocessorCacheKey() {
        return null;
    }

    public CloseableReference<Bitmap> process(Bitmap bitmap, PlatformBitmapFactory platformBitmapFactory) {
        Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = FALLBACK_BITMAP_CONFIGURATION;
        }
        CloseableReference createBitmapInternal = platformBitmapFactory.createBitmapInternal(width, height, config);
        try {
            process((Bitmap) createBitmapInternal.get(), bitmap);
            return CloseableReference.cloneOrNull(createBitmapInternal);
        } finally {
            CloseableReference.closeSafely(createBitmapInternal);
        }
    }

    public void process(Bitmap bitmap) {
    }

    public void process(Bitmap bitmap, Bitmap bitmap2) {
        internalCopyBitmap(bitmap, bitmap2);
        process(bitmap);
    }
}
