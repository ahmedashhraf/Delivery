package com.airbnb.lottie.model;

import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0224v0;
import androidx.collection.LruCache;
import com.airbnb.lottie.LottieComposition;

@C0207n0({C0208a.LIBRARY})
public class LottieCompositionCache {
    private static final LottieCompositionCache INSTANCE = new LottieCompositionCache();
    private final LruCache<String, LottieComposition> cache = new LruCache<>(20);

    @C0224v0
    LottieCompositionCache() {
    }

    public static LottieCompositionCache getInstance() {
        return INSTANCE;
    }

    public void clear() {
        this.cache.evictAll();
    }

    @C0195i0
    public LottieComposition get(@C0195i0 String str) {
        if (str == null) {
            return null;
        }
        return (LottieComposition) this.cache.get(str);
    }

    public void put(@C0195i0 String str, LottieComposition lottieComposition) {
        if (str != null) {
            this.cache.put(str, lottieComposition);
        }
    }

    public void resize(int i) {
        this.cache.resize(i);
    }
}
