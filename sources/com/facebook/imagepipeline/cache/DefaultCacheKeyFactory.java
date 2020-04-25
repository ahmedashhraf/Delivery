package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import p201f.p202a.C5952h;

public class DefaultCacheKeyFactory implements CacheKeyFactory {
    private static DefaultCacheKeyFactory sInstance;

    protected DefaultCacheKeyFactory() {
    }

    public static synchronized DefaultCacheKeyFactory getInstance() {
        DefaultCacheKeyFactory defaultCacheKeyFactory;
        synchronized (DefaultCacheKeyFactory.class) {
            if (sInstance == null) {
                sInstance = new DefaultCacheKeyFactory();
            }
            defaultCacheKeyFactory = sInstance;
        }
        return defaultCacheKeyFactory;
    }

    public CacheKey getBitmapCacheKey(ImageRequest imageRequest, Object obj) {
        BitmapMemoryCacheKey bitmapMemoryCacheKey = new BitmapMemoryCacheKey(getCacheKeySourceUri(imageRequest.getSourceUri()).toString(), imageRequest.getResizeOptions(), imageRequest.getRotationOptions(), imageRequest.getImageDecodeOptions(), null, null, obj);
        return bitmapMemoryCacheKey;
    }

    /* access modifiers changed from: protected */
    public Uri getCacheKeySourceUri(Uri uri) {
        return uri;
    }

    public CacheKey getEncodedCacheKey(ImageRequest imageRequest, @C5952h Object obj) {
        return getEncodedCacheKey(imageRequest, imageRequest.getSourceUri(), obj);
    }

    public CacheKey getPostprocessedBitmapCacheKey(ImageRequest imageRequest, Object obj) {
        String str;
        CacheKey cacheKey;
        Postprocessor postprocessor = imageRequest.getPostprocessor();
        if (postprocessor != null) {
            CacheKey postprocessorCacheKey = postprocessor.getPostprocessorCacheKey();
            str = postprocessor.getClass().getName();
            cacheKey = postprocessorCacheKey;
        } else {
            cacheKey = null;
            str = null;
        }
        BitmapMemoryCacheKey bitmapMemoryCacheKey = new BitmapMemoryCacheKey(getCacheKeySourceUri(imageRequest.getSourceUri()).toString(), imageRequest.getResizeOptions(), imageRequest.getRotationOptions(), imageRequest.getImageDecodeOptions(), cacheKey, str, obj);
        return bitmapMemoryCacheKey;
    }

    public CacheKey getEncodedCacheKey(ImageRequest imageRequest, Uri uri, @C5952h Object obj) {
        return new SimpleCacheKey(getCacheKeySourceUri(uri).toString());
    }
}
