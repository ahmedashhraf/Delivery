package com.facebook.cache.common;

import android.net.Uri;
import p201f.p202a.C5952h;

public class DebuggingCacheKey extends SimpleCacheKey {
    private final Object mCallerContext;
    private final Uri mSourceUri;

    public DebuggingCacheKey(String str, @C5952h Object obj, Uri uri) {
        super(str);
        this.mCallerContext = obj;
        this.mSourceUri = uri;
    }

    @C5952h
    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }
}
