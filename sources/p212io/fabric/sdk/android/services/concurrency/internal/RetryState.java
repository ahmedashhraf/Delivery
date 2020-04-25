package p212io.fabric.sdk.android.services.concurrency.internal;

/* renamed from: io.fabric.sdk.android.services.concurrency.internal.RetryState */
public class RetryState {
    private final C14357b backoff;
    private final int retryCount;
    private final C14361f retryPolicy;

    public RetryState(C14357b bVar, C14361f fVar) {
        this(0, bVar, fVar);
    }

    public C14357b getBackoff() {
        return this.backoff;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public long getRetryDelay() {
        return this.backoff.getDelayMillis(this.retryCount);
    }

    public C14361f getRetryPolicy() {
        return this.retryPolicy;
    }

    public RetryState initialRetryState() {
        return new RetryState(this.backoff, this.retryPolicy);
    }

    public RetryState nextRetryState() {
        return new RetryState(this.retryCount + 1, this.backoff, this.retryPolicy);
    }

    public RetryState(int i, C14357b bVar, C14361f fVar) {
        this.retryCount = i;
        this.backoff = bVar;
        this.retryPolicy = fVar;
    }
}
