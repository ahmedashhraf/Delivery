package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.common.util.HashCodeUtil;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5967b;

@C5967b
public class BitmapMemoryCacheKey implements CacheKey {
    private final long mCacheTime;
    private final Object mCallerContext;
    private final int mHash;
    private final ImageDecodeOptions mImageDecodeOptions;
    @C5952h
    private final CacheKey mPostprocessorCacheKey;
    @C5952h
    private final String mPostprocessorName;
    @C5952h
    private final ResizeOptions mResizeOptions;
    private final RotationOptions mRotationOptions;
    private final String mSourceString;

    public BitmapMemoryCacheKey(String str, @C5952h ResizeOptions resizeOptions, RotationOptions rotationOptions, ImageDecodeOptions imageDecodeOptions, @C5952h CacheKey cacheKey, @C5952h String str2, Object obj) {
        this.mSourceString = (String) Preconditions.checkNotNull(str);
        this.mResizeOptions = resizeOptions;
        this.mRotationOptions = rotationOptions;
        this.mImageDecodeOptions = imageDecodeOptions;
        this.mPostprocessorCacheKey = cacheKey;
        this.mPostprocessorName = str2;
        this.mHash = HashCodeUtil.hashCode((Object) Integer.valueOf(str.hashCode()), (Object) Integer.valueOf(resizeOptions != null ? resizeOptions.hashCode() : 0), (Object) Integer.valueOf(rotationOptions.hashCode()), (Object) this.mImageDecodeOptions, (Object) this.mPostprocessorCacheKey, (Object) str2);
        this.mCallerContext = obj;
        this.mCacheTime = RealtimeSinceBootClock.get().now();
    }

    public boolean containsUri(Uri uri) {
        return getUriString().contains(uri.toString());
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof BitmapMemoryCacheKey)) {
            return false;
        }
        BitmapMemoryCacheKey bitmapMemoryCacheKey = (BitmapMemoryCacheKey) obj;
        if (this.mHash == bitmapMemoryCacheKey.mHash && this.mSourceString.equals(bitmapMemoryCacheKey.mSourceString) && Objects.equal(this.mResizeOptions, bitmapMemoryCacheKey.mResizeOptions) && Objects.equal(this.mRotationOptions, bitmapMemoryCacheKey.mRotationOptions) && Objects.equal(this.mImageDecodeOptions, bitmapMemoryCacheKey.mImageDecodeOptions) && Objects.equal(this.mPostprocessorCacheKey, bitmapMemoryCacheKey.mPostprocessorCacheKey) && Objects.equal(this.mPostprocessorName, bitmapMemoryCacheKey.mPostprocessorName)) {
            z = true;
        }
        return z;
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public long getInBitmapCacheSince() {
        return this.mCacheTime;
    }

    @C5952h
    public String getPostprocessorName() {
        return this.mPostprocessorName;
    }

    public String getUriString() {
        return this.mSourceString;
    }

    public int hashCode() {
        return this.mHash;
    }

    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", new Object[]{this.mSourceString, this.mResizeOptions, this.mRotationOptions, this.mImageDecodeOptions, this.mPostprocessorCacheKey, this.mPostprocessorName, Integer.valueOf(this.mHash)});
    }
}
