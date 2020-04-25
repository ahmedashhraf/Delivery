package com.facebook.cache.common;

import com.facebook.cache.common.CacheEventListener.EvictionReason;
import java.io.IOException;
import p201f.p202a.C5952h;

public interface CacheEvent {
    @C5952h
    CacheKey getCacheKey();

    long getCacheLimit();

    long getCacheSize();

    @C5952h
    EvictionReason getEvictionReason();

    @C5952h
    IOException getException();

    long getItemSize();

    @C5952h
    String getResourceId();
}
