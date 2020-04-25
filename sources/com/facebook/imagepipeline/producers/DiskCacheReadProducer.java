package com.facebook.imagepipeline.producers;

import bolts.C2175l;
import bolts.C2177n;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

public class DiskCacheReadProducer implements Producer<EncodedImage> {
    public static final String ENCODED_IMAGE_SIZE = "encodedImageSize";
    public static final String EXTRA_CACHED_VALUE_FOUND = "cached_value_found";
    public static final String PRODUCER_NAME = "DiskCacheProducer";
    private final CacheKeyFactory mCacheKeyFactory;
    private final BufferedDiskCache mDefaultBufferedDiskCache;
    /* access modifiers changed from: private */
    public final Producer<EncodedImage> mInputProducer;
    private final BufferedDiskCache mSmallImageBufferedDiskCache;

    public DiskCacheReadProducer(BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, CacheKeyFactory cacheKeyFactory, Producer<EncodedImage> producer) {
        this.mDefaultBufferedDiskCache = bufferedDiskCache;
        this.mSmallImageBufferedDiskCache = bufferedDiskCache2;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mInputProducer = producer;
    }

    @VisibleForTesting
    static Map<String, String> getExtraMap(ProducerListener producerListener, String str, boolean z, int i) {
        if (!producerListener.requiresExtraMap(str)) {
            return null;
        }
        String str2 = "cached_value_found";
        if (!z) {
            return ImmutableMap.m15725of(str2, String.valueOf(z));
        }
        return ImmutableMap.m15726of(str2, String.valueOf(z), "encodedImageSize", String.valueOf(i));
    }

    /* access modifiers changed from: private */
    public static boolean isTaskCancelled(C2177n<?> nVar) {
        return nVar.mo9326d() || (nVar.mo9328f() && (nVar.mo9316b() instanceof CancellationException));
    }

    private void maybeStartInputProducer(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        if (producerContext.getLowestPermittedRequestLevel().getValue() >= RequestLevel.DISK_CACHE.getValue()) {
            consumer.onNewResult(null, 1);
        } else {
            this.mInputProducer.produceResults(consumer, producerContext);
        }
    }

    private C2175l<EncodedImage, Void> onFinishDiskReads(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        final String id = producerContext.getId();
        final ProducerListener listener = producerContext.getListener();
        final Consumer<EncodedImage> consumer2 = consumer;
        final ProducerContext producerContext2 = producerContext;
        C35251 r0 = new C2175l<EncodedImage, Void>() {
            public Void then(C2177n<EncodedImage> nVar) throws Exception {
                boolean access$000 = DiskCacheReadProducer.isTaskCancelled(nVar);
                String str = DiskCacheReadProducer.PRODUCER_NAME;
                if (access$000) {
                    listener.onProducerFinishWithCancellation(id, str, null);
                    consumer2.onCancellation();
                } else if (nVar.mo9328f()) {
                    listener.onProducerFinishWithFailure(id, str, nVar.mo9316b(), null);
                    DiskCacheReadProducer.this.mInputProducer.produceResults(consumer2, producerContext2);
                } else {
                    EncodedImage encodedImage = (EncodedImage) nVar.mo9321c();
                    if (encodedImage != null) {
                        ProducerListener producerListener = listener;
                        String str2 = id;
                        producerListener.onProducerFinishWithSuccess(str2, str, DiskCacheReadProducer.getExtraMap(producerListener, str2, true, encodedImage.getSize()));
                        listener.onUltimateProducerReached(id, str, true);
                        consumer2.onProgressUpdate(1.0f);
                        consumer2.onNewResult(encodedImage, 1);
                        encodedImage.close();
                    } else {
                        ProducerListener producerListener2 = listener;
                        String str3 = id;
                        producerListener2.onProducerFinishWithSuccess(str3, str, DiskCacheReadProducer.getExtraMap(producerListener2, str3, false, 0));
                        DiskCacheReadProducer.this.mInputProducer.produceResults(consumer2, producerContext2);
                    }
                }
                return null;
            }
        };
        return r0;
    }

    private void subscribeTaskForRequestCancellation(final AtomicBoolean atomicBoolean, ProducerContext producerContext) {
        producerContext.addCallbacks(new BaseProducerContextCallbacks() {
            public void onCancellationRequested() {
                atomicBoolean.set(true);
            }
        });
    }

    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        ImageRequest imageRequest = producerContext.getImageRequest();
        if (!imageRequest.isDiskCacheEnabled()) {
            maybeStartInputProducer(consumer, producerContext);
            return;
        }
        producerContext.getListener().onProducerStart(producerContext.getId(), PRODUCER_NAME);
        CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(imageRequest, producerContext.getCallerContext());
        BufferedDiskCache bufferedDiskCache = imageRequest.getCacheChoice() == CacheChoice.SMALL ? this.mSmallImageBufferedDiskCache : this.mDefaultBufferedDiskCache;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        bufferedDiskCache.get(encodedCacheKey, atomicBoolean).mo9301a(onFinishDiskReads(consumer, producerContext));
        subscribeTaskForRequestCancellation(atomicBoolean, producerContext);
    }
}
