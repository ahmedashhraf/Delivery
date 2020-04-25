package com.facebook.cache.common;

import com.facebook.cache.common.CacheErrorLogger.CacheErrorCategory;
import p201f.p202a.C5952h;

public class NoOpCacheErrorLogger implements CacheErrorLogger {
    private static NoOpCacheErrorLogger sInstance;

    private NoOpCacheErrorLogger() {
    }

    public static synchronized NoOpCacheErrorLogger getInstance() {
        NoOpCacheErrorLogger noOpCacheErrorLogger;
        synchronized (NoOpCacheErrorLogger.class) {
            if (sInstance == null) {
                sInstance = new NoOpCacheErrorLogger();
            }
            noOpCacheErrorLogger = sInstance;
        }
        return noOpCacheErrorLogger;
    }

    public void logError(CacheErrorCategory cacheErrorCategory, Class<?> cls, String str, @C5952h Throwable th) {
    }
}
