package com.crashlytics.android.answers;

import java.io.File;
import java.util.List;
import p212io.fabric.sdk.android.p493p.p496c.C14295k;
import p212io.fabric.sdk.android.services.concurrency.internal.C14358c;
import p212io.fabric.sdk.android.services.concurrency.internal.C14359d;
import p212io.fabric.sdk.android.services.concurrency.internal.RetryState;

class AnswersRetryFilesSender implements C14295k {
    private static final int BACKOFF_MS = 1000;
    private static final int BACKOFF_POWER = 8;
    private static final double JITTER_PERCENT = 0.1d;
    private static final int MAX_RETRIES = 5;
    private final SessionAnalyticsFilesSender filesSender;
    private final RetryManager retryManager;

    AnswersRetryFilesSender(SessionAnalyticsFilesSender sessionAnalyticsFilesSender, RetryManager retryManager2) {
        this.filesSender = sessionAnalyticsFilesSender;
        this.retryManager = retryManager2;
    }

    public static AnswersRetryFilesSender build(SessionAnalyticsFilesSender sessionAnalyticsFilesSender) {
        return new AnswersRetryFilesSender(sessionAnalyticsFilesSender, new RetryManager(new RetryState(new RandomBackoff(new C14359d(1000, 8), JITTER_PERCENT), new C14358c(5))));
    }

    public boolean send(List<File> list) {
        long nanoTime = System.nanoTime();
        if (this.retryManager.canRetry(nanoTime)) {
            if (this.filesSender.send(list)) {
                this.retryManager.reset();
                return true;
            }
            this.retryManager.recordRetry(nanoTime);
        }
        return false;
    }
}
