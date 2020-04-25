package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.SettableProducerContext;
import p201f.p202a.p203u.C5969d;

@C5969d
public class ProducerToDataSourceAdapter<T> extends AbstractProducerToDataSourceAdapter<T> {
    private ProducerToDataSourceAdapter(Producer<T> producer, SettableProducerContext settableProducerContext, RequestListener requestListener) {
        super(producer, settableProducerContext, requestListener);
    }

    public static <T> DataSource<T> create(Producer<T> producer, SettableProducerContext settableProducerContext, RequestListener requestListener) {
        return new ProducerToDataSourceAdapter(producer, settableProducerContext, requestListener);
    }
}
