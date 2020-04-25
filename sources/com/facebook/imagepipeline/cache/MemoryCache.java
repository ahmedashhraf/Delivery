package com.facebook.imagepipeline.cache;

import com.facebook.common.internal.Predicate;
import com.facebook.common.references.CloseableReference;
import p201f.p202a.C5952h;

public interface MemoryCache<K, V> {
    @C5952h
    CloseableReference<V> cache(K k, CloseableReference<V> closeableReference);

    boolean contains(Predicate<K> predicate);

    @C5952h
    CloseableReference<V> get(K k);

    int removeAll(Predicate<K> predicate);
}
