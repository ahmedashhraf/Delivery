package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Closeables;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

public abstract class LocalFetchProducer implements Producer<EncodedImage> {
    private final Executor mExecutor;
    private final PooledByteBufferFactory mPooledByteBufferFactory;

    protected LocalFetchProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory) {
        this.mExecutor = executor;
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
    }

    /* access modifiers changed from: protected */
    public EncodedImage getByteBufferBackedEncodedImage(InputStream inputStream, int i) throws IOException {
        CloseableReference closeableReference;
        if (i <= 0) {
            try {
                closeableReference = CloseableReference.m15817of(this.mPooledByteBufferFactory.newByteBuffer(inputStream));
            } catch (Throwable th) {
                Closeables.closeQuietly(inputStream);
                CloseableReference.closeSafely(null);
                throw th;
            }
        } else {
            closeableReference = CloseableReference.m15817of(this.mPooledByteBufferFactory.newByteBuffer(inputStream, i));
        }
        CloseableReference closeableReference2 = closeableReference;
        EncodedImage encodedImage = new EncodedImage(closeableReference2);
        Closeables.closeQuietly(inputStream);
        CloseableReference.closeSafely(closeableReference2);
        return encodedImage;
    }

    /* access modifiers changed from: protected */
    public abstract EncodedImage getEncodedImage(ImageRequest imageRequest) throws IOException;

    /* access modifiers changed from: protected */
    public EncodedImage getEncodedImage(InputStream inputStream, int i) throws IOException {
        return getByteBufferBackedEncodedImage(inputStream, i);
    }

    /* access modifiers changed from: protected */
    public abstract String getProducerName();

    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        final ProducerListener listener = producerContext.getListener();
        final String id = producerContext.getId();
        final ImageRequest imageRequest = producerContext.getImageRequest();
        final C35351 r0 = new StatefulProducerRunnable<EncodedImage>(consumer, listener, getProducerName(), id) {
            /* access modifiers changed from: protected */
            public void disposeResult(EncodedImage encodedImage) {
                EncodedImage.closeSafely(encodedImage);
            }

            /* access modifiers changed from: protected */
            public EncodedImage getResult() throws Exception {
                EncodedImage encodedImage = LocalFetchProducer.this.getEncodedImage(imageRequest);
                if (encodedImage == null) {
                    listener.onUltimateProducerReached(id, LocalFetchProducer.this.getProducerName(), false);
                    return null;
                }
                encodedImage.parseMetaData();
                listener.onUltimateProducerReached(id, LocalFetchProducer.this.getProducerName(), true);
                return encodedImage;
            }
        };
        producerContext.addCallbacks(new BaseProducerContextCallbacks() {
            public void onCancellationRequested() {
                r0.cancel();
            }
        });
        this.mExecutor.execute(r0);
    }
}
