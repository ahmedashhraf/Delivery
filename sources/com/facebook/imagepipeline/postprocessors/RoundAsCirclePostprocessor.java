package com.facebook.imagepipeline.postprocessors;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import p201f.p202a.C5952h;

public class RoundAsCirclePostprocessor extends BasePostprocessor {
    @C5952h
    private CacheKey mCacheKey;

    @C5952h
    public CacheKey getPostprocessorCacheKey() {
        if (this.mCacheKey == null) {
            this.mCacheKey = new SimpleCacheKey("RoundAsCirclePostprocessor");
        }
        return this.mCacheKey;
    }

    public void process(Bitmap bitmap) {
        NativeRoundingFilter.toCircle(bitmap);
    }
}
