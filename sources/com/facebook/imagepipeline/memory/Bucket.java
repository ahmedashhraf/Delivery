package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import java.util.LinkedList;
import java.util.Queue;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5968c;

@VisibleForTesting
@C5968c
class Bucket<V> {
    private static final String TAG = "BUCKET";
    private final boolean mFixBucketsReinitialization;
    final Queue mFreeList;
    private int mInUseLength;
    public final int mItemSize;
    public final int mMaxLength;

    public Bucket(int i, int i2, int i3, boolean z) {
        boolean z2 = true;
        Preconditions.checkState(i > 0);
        Preconditions.checkState(i2 >= 0);
        if (i3 < 0) {
            z2 = false;
        }
        Preconditions.checkState(z2);
        this.mItemSize = i;
        this.mMaxLength = i2;
        this.mFreeList = new LinkedList();
        this.mInUseLength = i3;
        this.mFixBucketsReinitialization = z;
    }

    /* access modifiers changed from: 0000 */
    public void addToFreeList(V v) {
        this.mFreeList.add(v);
    }

    public void decrementInUseCount() {
        Preconditions.checkState(this.mInUseLength > 0);
        this.mInUseLength--;
    }

    @C5952h
    public V get() {
        V pop = pop();
        if (pop != null) {
            this.mInUseLength++;
        }
        return pop;
    }

    /* access modifiers changed from: 0000 */
    public int getFreeListSize() {
        return this.mFreeList.size();
    }

    public int getInUseCount() {
        return this.mInUseLength;
    }

    public void incrementInUseCount() {
        this.mInUseLength++;
    }

    public boolean isMaxLengthExceeded() {
        return this.mInUseLength + getFreeListSize() > this.mMaxLength;
    }

    @C5952h
    public V pop() {
        return this.mFreeList.poll();
    }

    public void release(V v) {
        Preconditions.checkNotNull(v);
        boolean z = false;
        if (this.mFixBucketsReinitialization) {
            if (this.mInUseLength > 0) {
                z = true;
            }
            Preconditions.checkState(z);
            this.mInUseLength--;
            addToFreeList(v);
            return;
        }
        int i = this.mInUseLength;
        if (i > 0) {
            this.mInUseLength = i - 1;
            addToFreeList(v);
            return;
        }
        FLog.m15755e(TAG, "Tried to release value %s from an empty bucket!", v);
    }
}