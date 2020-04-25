package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Objects.ToStringHelper;
import com.facebook.common.media.MediaUtils;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.share.internal.ShareConstants;
import java.io.File;
import org.apache.commons.logging.C15096h;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5967b;

@C5967b
public class ImageRequest {
    @C5952h
    private final BytesRange mBytesRange;
    private final CacheChoice mCacheChoice;
    private final ImageDecodeOptions mImageDecodeOptions;
    private final boolean mIsDiskCacheEnabled;
    private final boolean mIsMemoryCacheEnabled;
    private final boolean mLocalThumbnailPreviewsEnabled;
    private final RequestLevel mLowestPermittedRequestLevel;
    @C5952h
    private final Postprocessor mPostprocessor;
    private final boolean mProgressiveRenderingEnabled;
    @C5952h
    private final RequestListener mRequestListener;
    private final Priority mRequestPriority;
    @C5952h
    private final ResizeOptions mResizeOptions;
    private final RotationOptions mRotationOptions;
    private File mSourceFile;
    private final Uri mSourceUri;
    private final int mSourceUriType = getSourceUriType(this.mSourceUri);

    public enum CacheChoice {
        SMALL,
        DEFAULT
    }

    public enum RequestLevel {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        
        private int mValue;

        private RequestLevel(int i) {
            this.mValue = i;
        }

        public static RequestLevel getMax(RequestLevel requestLevel, RequestLevel requestLevel2) {
            return requestLevel.getValue() > requestLevel2.getValue() ? requestLevel : requestLevel2;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    protected ImageRequest(ImageRequestBuilder imageRequestBuilder) {
        this.mCacheChoice = imageRequestBuilder.getCacheChoice();
        this.mSourceUri = imageRequestBuilder.getSourceUri();
        this.mProgressiveRenderingEnabled = imageRequestBuilder.isProgressiveRenderingEnabled();
        this.mLocalThumbnailPreviewsEnabled = imageRequestBuilder.isLocalThumbnailPreviewsEnabled();
        this.mImageDecodeOptions = imageRequestBuilder.getImageDecodeOptions();
        this.mResizeOptions = imageRequestBuilder.getResizeOptions();
        this.mRotationOptions = imageRequestBuilder.getRotationOptions() == null ? RotationOptions.autoRotate() : imageRequestBuilder.getRotationOptions();
        this.mBytesRange = imageRequestBuilder.getBytesRange();
        this.mRequestPriority = imageRequestBuilder.getRequestPriority();
        this.mLowestPermittedRequestLevel = imageRequestBuilder.getLowestPermittedRequestLevel();
        this.mIsDiskCacheEnabled = imageRequestBuilder.isDiskCacheEnabled();
        this.mIsMemoryCacheEnabled = imageRequestBuilder.isMemoryCacheEnabled();
        this.mPostprocessor = imageRequestBuilder.getPostprocessor();
        this.mRequestListener = imageRequestBuilder.getRequestListener();
    }

    public static ImageRequest fromFile(@C5952h File file) {
        if (file == null) {
            return null;
        }
        return fromUri(UriUtil.getUriForFile(file));
    }

    public static ImageRequest fromUri(@C5952h Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.newBuilderWithSource(uri).build();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        if (!Objects.equal(this.mSourceUri, imageRequest.mSourceUri) || !Objects.equal(this.mCacheChoice, imageRequest.mCacheChoice) || !Objects.equal(this.mSourceFile, imageRequest.mSourceFile) || !Objects.equal(this.mBytesRange, imageRequest.mBytesRange) || !Objects.equal(this.mImageDecodeOptions, imageRequest.mImageDecodeOptions) || !Objects.equal(this.mResizeOptions, imageRequest.mResizeOptions) || !Objects.equal(this.mRotationOptions, imageRequest.mRotationOptions)) {
            return false;
        }
        Postprocessor postprocessor = this.mPostprocessor;
        CacheKey cacheKey = null;
        Object postprocessorCacheKey = postprocessor != null ? postprocessor.getPostprocessorCacheKey() : null;
        Postprocessor postprocessor2 = imageRequest.mPostprocessor;
        if (postprocessor2 != null) {
            cacheKey = postprocessor2.getPostprocessorCacheKey();
        }
        return Objects.equal(postprocessorCacheKey, cacheKey);
    }

    @Deprecated
    public boolean getAutoRotateEnabled() {
        return this.mRotationOptions.useImageMetadata();
    }

    @C5952h
    public BytesRange getBytesRange() {
        return this.mBytesRange;
    }

    public CacheChoice getCacheChoice() {
        return this.mCacheChoice;
    }

    public ImageDecodeOptions getImageDecodeOptions() {
        return this.mImageDecodeOptions;
    }

    public boolean getLocalThumbnailPreviewsEnabled() {
        return this.mLocalThumbnailPreviewsEnabled;
    }

    public RequestLevel getLowestPermittedRequestLevel() {
        return this.mLowestPermittedRequestLevel;
    }

    @C5952h
    public Postprocessor getPostprocessor() {
        return this.mPostprocessor;
    }

    public int getPreferredHeight() {
        ResizeOptions resizeOptions = this.mResizeOptions;
        if (resizeOptions != null) {
            return resizeOptions.height;
        }
        return 2048;
    }

    public int getPreferredWidth() {
        ResizeOptions resizeOptions = this.mResizeOptions;
        if (resizeOptions != null) {
            return resizeOptions.width;
        }
        return 2048;
    }

    public Priority getPriority() {
        return this.mRequestPriority;
    }

    public boolean getProgressiveRenderingEnabled() {
        return this.mProgressiveRenderingEnabled;
    }

    @C5952h
    public RequestListener getRequestListener() {
        return this.mRequestListener;
    }

    @C5952h
    public ResizeOptions getResizeOptions() {
        return this.mResizeOptions;
    }

    public RotationOptions getRotationOptions() {
        return this.mRotationOptions;
    }

    public synchronized File getSourceFile() {
        if (this.mSourceFile == null) {
            this.mSourceFile = new File(this.mSourceUri.getPath());
        }
        return this.mSourceFile;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }

    public int getSourceUriType() {
        return this.mSourceUriType;
    }

    public int hashCode() {
        Postprocessor postprocessor = this.mPostprocessor;
        return Objects.hashCode(this.mCacheChoice, this.mSourceUri, this.mSourceFile, this.mBytesRange, this.mImageDecodeOptions, this.mResizeOptions, this.mRotationOptions, postprocessor != null ? postprocessor.getPostprocessorCacheKey() : null);
    }

    public boolean isDiskCacheEnabled() {
        return this.mIsDiskCacheEnabled;
    }

    public boolean isMemoryCacheEnabled() {
        return this.mIsMemoryCacheEnabled;
    }

    public String toString() {
        String str = "cacheChoice";
        String str2 = "decodeOptions";
        String str3 = "postprocessor";
        ToStringHelper add = Objects.toStringHelper((Object) this).add(ShareConstants.MEDIA_URI, (Object) this.mSourceUri).add(str, (Object) this.mCacheChoice).add(str2, (Object) this.mImageDecodeOptions).add(str3, (Object) this.mPostprocessor);
        return add.add(C15096h.f43873a, (Object) this.mRequestPriority).add("resizeOptions", (Object) this.mResizeOptions).add("rotationOptions", (Object) this.mRotationOptions).add("bytesRange", (Object) this.mBytesRange).toString();
    }

    public static ImageRequest fromUri(@C5952h String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return fromUri(Uri.parse(str));
    }

    private static int getSourceUriType(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (UriUtil.isNetworkUri(uri)) {
            return 0;
        }
        if (UriUtil.isLocalFileUri(uri)) {
            return MediaUtils.isVideo(MediaUtils.extractMime(uri.getPath())) ? 2 : 3;
        }
        if (UriUtil.isLocalContentUri(uri)) {
            return 4;
        }
        if (UriUtil.isLocalAssetUri(uri)) {
            return 5;
        }
        if (UriUtil.isLocalResourceUri(uri)) {
            return 6;
        }
        if (UriUtil.isDataUri(uri)) {
            return 7;
        }
        if (UriUtil.isQualifiedResourceUri(uri)) {
            return 8;
        }
        return -1;
    }
}
