package com.facebook.imagepipeline.producers;

import com.facebook.common.logging.FLog;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5969d;

@C5969d
public abstract class BaseConsumer<T> implements Consumer<T> {
    private boolean mIsFinished = false;

    public static boolean isLast(int i) {
        return (i & 1) == 1;
    }

    public static boolean isNotLast(int i) {
        return !isLast(i);
    }

    public static int simpleStatusForIsLast(boolean z) {
        return z ? 1 : 0;
    }

    public static boolean statusHasAnyFlag(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean statusHasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    public static int turnOffStatusFlag(int i, int i2) {
        return i & (i2 ^ -1);
    }

    public static int turnOnStatusFlag(int i, int i2) {
        return i | i2;
    }

    public synchronized void onCancellation() {
        if (!this.mIsFinished) {
            this.mIsFinished = true;
            try {
                onCancellationImpl();
            } catch (Exception e) {
                onUnhandledException(e);
            }
        } else {
            return;
        }
        return;
    }

    /* access modifiers changed from: protected */
    public abstract void onCancellationImpl();

    public synchronized void onFailure(Throwable th) {
        if (!this.mIsFinished) {
            this.mIsFinished = true;
            try {
                onFailureImpl(th);
            } catch (Exception e) {
                onUnhandledException(e);
            }
        } else {
            return;
        }
        return;
    }

    /* access modifiers changed from: protected */
    public abstract void onFailureImpl(Throwable th);

    public synchronized void onNewResult(@C5952h T t, int i) {
        if (!this.mIsFinished) {
            this.mIsFinished = isLast(i);
            try {
                onNewResultImpl(t, i);
            } catch (Exception e) {
                onUnhandledException(e);
            }
        } else {
            return;
        }
        return;
    }

    /* access modifiers changed from: protected */
    public abstract void onNewResultImpl(T t, int i);

    public synchronized void onProgressUpdate(float f) {
        if (!this.mIsFinished) {
            try {
                onProgressUpdateImpl(f);
            } catch (Exception e) {
                onUnhandledException(e);
            }
        } else {
            return;
        }
    }

    /* access modifiers changed from: protected */
    public void onProgressUpdateImpl(float f) {
    }

    /* access modifiers changed from: protected */
    public void onUnhandledException(Exception exc) {
        FLog.wtf(getClass(), "unhandled exception", (Throwable) exc);
    }
}
