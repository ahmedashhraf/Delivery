package com.facebook.fresco.animation.backend;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.time.MonotonicClock;
import com.facebook.fresco.animation.backend.AnimationBackend;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p201f.p202a.C5952h;

public class AnimationBackendDelegateWithInactivityCheck<T extends AnimationBackend> extends AnimationBackendDelegate<T> {
    @VisibleForTesting
    static final long INACTIVITY_CHECK_POLLING_TIME_MS = 1000;
    @VisibleForTesting
    static final long INACTIVITY_THRESHOLD_MS = 2000;
    private long mInactivityCheckPollingTimeMs = INACTIVITY_CHECK_POLLING_TIME_MS;
    /* access modifiers changed from: private */
    public boolean mInactivityCheckScheduled = false;
    /* access modifiers changed from: private */
    @C5952h
    public InactivityListener mInactivityListener;
    private long mInactivityThresholdMs = INACTIVITY_THRESHOLD_MS;
    private final Runnable mIsInactiveCheck = new Runnable() {
        public void run() {
            synchronized (AnimationBackendDelegateWithInactivityCheck.this) {
                AnimationBackendDelegateWithInactivityCheck.this.mInactivityCheckScheduled = false;
                if (!AnimationBackendDelegateWithInactivityCheck.this.isInactive()) {
                    AnimationBackendDelegateWithInactivityCheck.this.maybeScheduleInactivityCheck();
                } else if (AnimationBackendDelegateWithInactivityCheck.this.mInactivityListener != null) {
                    AnimationBackendDelegateWithInactivityCheck.this.mInactivityListener.onInactive();
                }
            }
        }
    };
    private long mLastDrawnTimeMs;
    private final MonotonicClock mMonotonicClock;
    private final ScheduledExecutorService mScheduledExecutorServiceForUiThread;

    public interface InactivityListener {
        void onInactive();
    }

    private AnimationBackendDelegateWithInactivityCheck(@C5952h T t, @C5952h InactivityListener inactivityListener, MonotonicClock monotonicClock, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.mInactivityListener = inactivityListener;
        this.mMonotonicClock = monotonicClock;
        this.mScheduledExecutorServiceForUiThread = scheduledExecutorService;
    }

    public static <T extends AnimationBackend & InactivityListener> AnimationBackendDelegate<T> createForBackend(T t, MonotonicClock monotonicClock, ScheduledExecutorService scheduledExecutorService) {
        return createForBackend(t, (InactivityListener) t, monotonicClock, scheduledExecutorService);
    }

    /* access modifiers changed from: private */
    public boolean isInactive() {
        return this.mMonotonicClock.now() - this.mLastDrawnTimeMs > this.mInactivityThresholdMs;
    }

    /* access modifiers changed from: private */
    public synchronized void maybeScheduleInactivityCheck() {
        if (!this.mInactivityCheckScheduled) {
            this.mInactivityCheckScheduled = true;
            this.mScheduledExecutorServiceForUiThread.schedule(this.mIsInactiveCheck, this.mInactivityCheckPollingTimeMs, TimeUnit.MILLISECONDS);
        }
    }

    public boolean drawFrame(Drawable drawable, Canvas canvas, int i) {
        this.mLastDrawnTimeMs = this.mMonotonicClock.now();
        boolean drawFrame = super.drawFrame(drawable, canvas, i);
        maybeScheduleInactivityCheck();
        return drawFrame;
    }

    public long getInactivityCheckPollingTimeMs() {
        return this.mInactivityCheckPollingTimeMs;
    }

    public long getInactivityThresholdMs() {
        return this.mInactivityThresholdMs;
    }

    public void setInactivityCheckPollingTimeMs(long j) {
        this.mInactivityCheckPollingTimeMs = j;
    }

    public void setInactivityListener(@C5952h InactivityListener inactivityListener) {
        this.mInactivityListener = inactivityListener;
    }

    public void setInactivityThresholdMs(long j) {
        this.mInactivityThresholdMs = j;
    }

    public static <T extends AnimationBackend> AnimationBackendDelegate<T> createForBackend(T t, InactivityListener inactivityListener, MonotonicClock monotonicClock, ScheduledExecutorService scheduledExecutorService) {
        return new AnimationBackendDelegateWithInactivityCheck(t, inactivityListener, monotonicClock, scheduledExecutorService);
    }
}
