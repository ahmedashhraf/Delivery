package com.facebook.cache.disk;

import com.facebook.cache.common.CacheEvent;
import com.facebook.cache.common.CacheEventListener.EvictionReason;
import com.facebook.cache.common.CacheKey;
import com.facebook.infer.annotation.ReturnsOwnership;
import java.io.IOException;
import p201f.p202a.C5952h;

public class SettableCacheEvent implements CacheEvent {
    private static final int MAX_RECYCLED = 5;
    private static final Object RECYCLER_LOCK = new Object();
    private static SettableCacheEvent sFirstRecycledEvent;
    private static int sRecycledCount;
    private CacheKey mCacheKey;
    private long mCacheLimit;
    private long mCacheSize;
    private EvictionReason mEvictionReason;
    private IOException mException;
    private long mItemSize;
    private SettableCacheEvent mNextRecycledEvent;
    private String mResourceId;

    private SettableCacheEvent() {
    }

    @ReturnsOwnership
    public static SettableCacheEvent obtain() {
        synchronized (RECYCLER_LOCK) {
            if (sFirstRecycledEvent == null) {
                return new SettableCacheEvent();
            }
            SettableCacheEvent settableCacheEvent = sFirstRecycledEvent;
            sFirstRecycledEvent = settableCacheEvent.mNextRecycledEvent;
            settableCacheEvent.mNextRecycledEvent = null;
            sRecycledCount--;
            return settableCacheEvent;
        }
    }

    private void reset() {
        this.mCacheKey = null;
        this.mResourceId = null;
        this.mItemSize = 0;
        this.mCacheLimit = 0;
        this.mCacheSize = 0;
        this.mException = null;
        this.mEvictionReason = null;
    }

    @C5952h
    public CacheKey getCacheKey() {
        return this.mCacheKey;
    }

    public long getCacheLimit() {
        return this.mCacheLimit;
    }

    public long getCacheSize() {
        return this.mCacheSize;
    }

    @C5952h
    public EvictionReason getEvictionReason() {
        return this.mEvictionReason;
    }

    @C5952h
    public IOException getException() {
        return this.mException;
    }

    public long getItemSize() {
        return this.mItemSize;
    }

    @C5952h
    public String getResourceId() {
        return this.mResourceId;
    }

    public void recycle() {
        synchronized (RECYCLER_LOCK) {
            if (sRecycledCount < 5) {
                reset();
                sRecycledCount++;
                if (sFirstRecycledEvent != null) {
                    this.mNextRecycledEvent = sFirstRecycledEvent;
                }
                sFirstRecycledEvent = this;
            }
        }
    }

    public SettableCacheEvent setCacheKey(CacheKey cacheKey) {
        this.mCacheKey = cacheKey;
        return this;
    }

    public SettableCacheEvent setCacheLimit(long j) {
        this.mCacheLimit = j;
        return this;
    }

    public SettableCacheEvent setCacheSize(long j) {
        this.mCacheSize = j;
        return this;
    }

    public SettableCacheEvent setEvictionReason(EvictionReason evictionReason) {
        this.mEvictionReason = evictionReason;
        return this;
    }

    public SettableCacheEvent setException(IOException iOException) {
        this.mException = iOException;
        return this;
    }

    public SettableCacheEvent setItemSize(long j) {
        this.mItemSize = j;
        return this;
    }

    public SettableCacheEvent setResourceId(String str) {
        this.mResourceId = str;
        return this;
    }
}
