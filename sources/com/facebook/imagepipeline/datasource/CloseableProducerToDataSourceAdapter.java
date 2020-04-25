package com.facebook.imagepipeline.datasource;

import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.SettableProducerContext;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5969d;

@C5969d
public class CloseableProducerToDataSourceAdapter<T> extends AbstractProducerToDataSourceAdapter<CloseableReference<T>> {
    private CloseableProducerToDataSourceAdapter(Producer<CloseableReference<T>> producer, SettableProducerContext settableProducerContext, RequestListener requestListener) {
        super(producer, settableProducerContext, requestListener);
    }

    public static <T> DataSource<CloseableReference<T>> create(Producer<CloseableReference<T>> producer, SettableProducerContext settableProducerContext, RequestListener requestListener) {
        return new CloseableProducerToDataSourceAdapter(producer, settableProducerContext, requestListener);
    }

    /* access modifiers changed from: protected */
    public void closeResult(CloseableReference<T> closeableReference) {
        CloseableReference.closeSafely(closeableReference);
    }

    @C5952h
    public CloseableReference<T> getResult() {
        return CloseableReference.cloneOrNull((CloseableReference) super.getResult());
    }

    /* access modifiers changed from: protected */
    public void onNewResultImpl(CloseableReference<T> closeableReference, int i) {
        super.onNewResultImpl(CloseableReference.cloneOrNull(closeableReference), i);
    }
}
