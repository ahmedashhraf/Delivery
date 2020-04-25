package com.facebook.imagepipeline.animated.impl;

import android.net.Uri;
import androidx.core.p034l.C1056z;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.CountingMemoryCache.EntryStateObserver;
import com.facebook.imagepipeline.image.CloseableImage;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5966a;

public class AnimatedFrameCache {
    private final CountingMemoryCache<CacheKey, CloseableImage> mBackingCache;
    private final EntryStateObserver<CacheKey> mEntryStateObserver = new EntryStateObserver<CacheKey>() {
        public void onExclusivityChanged(CacheKey cacheKey, boolean z) {
            AnimatedFrameCache.this.onReusabilityChange(cacheKey, z);
        }
    };
    @C5966a("this")
    private final LinkedHashSet<CacheKey> mFreeItemsPool = new LinkedHashSet<>();
    private final CacheKey mImageCacheKey;

    @VisibleForTesting
    static class FrameKey implements CacheKey {
        private final int mFrameIndex;
        private final CacheKey mImageCacheKey;

        public FrameKey(CacheKey cacheKey, int i) {
            this.mImageCacheKey = cacheKey;
            this.mFrameIndex = i;
        }

        public boolean containsUri(Uri uri) {
            return this.mImageCacheKey.containsUri(uri);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FrameKey)) {
                return false;
            }
            FrameKey frameKey = (FrameKey) obj;
            if (!(this.mImageCacheKey == frameKey.mImageCacheKey && this.mFrameIndex == frameKey.mFrameIndex)) {
                z = false;
            }
            return z;
        }

        public String getUriString() {
            return null;
        }

        public int hashCode() {
            return (this.mImageCacheKey.hashCode() * C1056z.f4713o) + this.mFrameIndex;
        }

        public String toString() {
            return Objects.toStringHelper((Object) this).add("imageCacheKey", (Object) this.mImageCacheKey).add("frameIndex", this.mFrameIndex).toString();
        }
    }

    public AnimatedFrameCache(CacheKey cacheKey, CountingMemoryCache<CacheKey, CloseableImage> countingMemoryCache) {
        this.mImageCacheKey = cacheKey;
        this.mBackingCache = countingMemoryCache;
    }

    private FrameKey keyFor(int i) {
        return new FrameKey(this.mImageCacheKey, i);
    }

    @C5952h
    private synchronized CacheKey popFirstFreeItemKey() {
        CacheKey cacheKey;
        cacheKey = null;
        Iterator it = this.mFreeItemsPool.iterator();
        if (it.hasNext()) {
            cacheKey = (CacheKey) it.next();
            it.remove();
        }
        return cacheKey;
    }

    @C5952h
    public CloseableReference<CloseableImage> cache(int i, CloseableReference<CloseableImage> closeableReference) {
        return this.mBackingCache.cache(keyFor(i), closeableReference, this.mEntryStateObserver);
    }

    public boolean contains(int i) {
        return this.mBackingCache.contains(keyFor(i));
    }

    @C5952h
    public CloseableReference<CloseableImage> get(int i) {
        return this.mBackingCache.get(keyFor(i));
    }

    @C5952h
    public CloseableReference<CloseableImage> getForReuse() {
        CloseableReference<CloseableImage> reuse;
        do {
            CacheKey popFirstFreeItemKey = popFirstFreeItemKey();
            if (popFirstFreeItemKey == null) {
                return null;
            }
            reuse = this.mBackingCache.reuse(popFirstFreeItemKey);
        } while (reuse == null);
        return reuse;
    }

    public synchronized void onReusabilityChange(CacheKey cacheKey, boolean z) {
        if (z) {
            this.mFreeItemsPool.add(cacheKey);
        } else {
            this.mFreeItemsPool.remove(cacheKey);
        }
    }
}
