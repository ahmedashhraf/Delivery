package com.facebook.datasource;

import java.util.concurrent.Executor;
import p201f.p202a.C5952h;

public interface DataSource<T> {
    boolean close();

    @C5952h
    Throwable getFailureCause();

    float getProgress();

    @C5952h
    T getResult();

    boolean hasFailed();

    boolean hasResult();

    boolean isClosed();

    boolean isFinished();

    void subscribe(DataSubscriber<T> dataSubscriber, Executor executor);
}
