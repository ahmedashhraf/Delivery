package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import com.facebook.internal.ServerProtocol;
import java.util.Map;

public class EncodedMemoryCacheProducer implements Producer<EncodedImage> {
    public static final String EXTRA_CACHED_VALUE_FOUND = "cached_value_found";
    public static final String PRODUCER_NAME = "EncodedMemoryCacheProducer";
    private final CacheKeyFactory mCacheKeyFactory;
    private final Producer<EncodedImage> mInputProducer;
    private final MemoryCache<CacheKey, PooledByteBuffer> mMemoryCache;

    private static class EncodedMemoryCacheConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        private final boolean mIsMemoryCacheEnabled;
        private final MemoryCache<CacheKey, PooledByteBuffer> mMemoryCache;
        private final CacheKey mRequestedCacheKey;

        public EncodedMemoryCacheConsumer(Consumer<EncodedImage> consumer, MemoryCache<CacheKey, PooledByteBuffer> memoryCache, CacheKey cacheKey, boolean z) {
            super(consumer);
            this.mMemoryCache = memoryCache;
            this.mRequestedCacheKey = cacheKey;
            this.mIsMemoryCacheEnabled = z;
        }

        public void onNewResultImpl(EncodedImage encodedImage, int i) {
            if (BaseConsumer.isNotLast(i) || encodedImage == null || BaseConsumer.statusHasAnyFlag(i, 10)) {
                getConsumer().onNewResult(encodedImage, i);
                return;
            }
            CloseableReference byteBufferRef = encodedImage.getByteBufferRef();
            if (byteBufferRef != null) {
                CloseableReference closeableReference = null;
                try {
                    if (this.mIsMemoryCacheEnabled) {
                        closeableReference = this.mMemoryCache.cache(this.mRequestedCacheKey, byteBufferRef);
                    }
                    if (closeableReference != null) {
                        try {
                            EncodedImage encodedImage2 = new EncodedImage(closeableReference);
                            encodedImage2.copyMetaDataFrom(encodedImage);
                            try {
                                getConsumer().onProgressUpdate(1.0f);
                                getConsumer().onNewResult(encodedImage2, i);
                                return;
                            } finally {
                                EncodedImage.closeSafely(encodedImage2);
                            }
                        } finally {
                            CloseableReference.closeSafely(closeableReference);
                        }
                    }
                } finally {
                    CloseableReference.closeSafely(byteBufferRef);
                }
            }
            getConsumer().onNewResult(encodedImage, i);
        }
    }

    public EncodedMemoryCacheProducer(MemoryCache<CacheKey, PooledByteBuffer> memoryCache, CacheKeyFactory cacheKeyFactory, Producer<EncodedImage> producer) {
        this.mMemoryCache = memoryCache;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mInputProducer = producer;
    }

    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        EncodedImage encodedImage;
        String id = producerContext.getId();
        ProducerListener listener = producerContext.getListener();
        String str = PRODUCER_NAME;
        listener.onProducerStart(id, str);
        CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(producerContext.getImageRequest(), producerContext.getCallerContext());
        CloseableReference closeableReference = this.mMemoryCache.get(encodedCacheKey);
        String str2 = "cached_value_found";
        Map map = null;
        if (closeableReference != null) {
            try {
                encodedImage = new EncodedImage(closeableReference);
                if (listener.requiresExtraMap(id)) {
                    map = ImmutableMap.m15725of(str2, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                }
                listener.onProducerFinishWithSuccess(id, str, map);
                listener.onUltimateProducerReached(id, str, true);
                consumer.onProgressUpdate(1.0f);
                consumer.onNewResult(encodedImage, 1);
                EncodedImage.closeSafely(encodedImage);
                CloseableReference.closeSafely(closeableReference);
            } catch (Throwable th) {
                CloseableReference.closeSafely(closeableReference);
                throw th;
            }
        } else {
            String str3 = "false";
            if (producerContext.getLowestPermittedRequestLevel().getValue() >= RequestLevel.ENCODED_MEMORY_CACHE.getValue()) {
                listener.onProducerFinishWithSuccess(id, str, listener.requiresExtraMap(id) ? ImmutableMap.m15725of(str2, str3) : null);
                listener.onUltimateProducerReached(id, str, false);
                consumer.onNewResult(null, 1);
                CloseableReference.closeSafely(closeableReference);
                return;
            }
            EncodedMemoryCacheConsumer encodedMemoryCacheConsumer = new EncodedMemoryCacheConsumer(consumer, this.mMemoryCache, encodedCacheKey, producerContext.getImageRequest().isMemoryCacheEnabled());
            if (listener.requiresExtraMap(id)) {
                map = ImmutableMap.m15725of(str2, str3);
            }
            listener.onProducerFinishWithSuccess(id, str, map);
            this.mInputProducer.produceResults(encodedMemoryCacheConsumer, producerContext);
            CloseableReference.closeSafely(closeableReference);
        }
    }
}
