package com.facebook.imagepipeline.cache;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import com.facebook.common.internal.Supplier;

public class DefaultBitmapMemoryCacheParamsSupplier implements Supplier<MemoryCacheParams> {
    private static final int MAX_CACHE_ENTRIES = 256;
    private static final int MAX_CACHE_ENTRY_SIZE = Integer.MAX_VALUE;
    private static final int MAX_EVICTION_QUEUE_ENTRIES = Integer.MAX_VALUE;
    private static final int MAX_EVICTION_QUEUE_SIZE = Integer.MAX_VALUE;
    private final ActivityManager mActivityManager;

    public DefaultBitmapMemoryCacheParamsSupplier(ActivityManager activityManager) {
        this.mActivityManager = activityManager;
    }

    private int getMaxCacheSize() {
        int min = Math.min(this.mActivityManager.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        if (VERSION.SDK_INT < 11) {
            return 8388608;
        }
        return min / 4;
    }

    public MemoryCacheParams get() {
        MemoryCacheParams memoryCacheParams = new MemoryCacheParams(getMaxCacheSize(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        return memoryCacheParams;
    }
}
