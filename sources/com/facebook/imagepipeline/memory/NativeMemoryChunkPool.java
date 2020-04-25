package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.memory.BasePool.InvalidSizeException;
import p201f.p202a.p203u.C5969d;

@C5969d
public class NativeMemoryChunkPool extends BasePool<NativeMemoryChunk> {
    private final int[] mBucketSizes;

    public NativeMemoryChunkPool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        SparseIntArray sparseIntArray = poolParams.bucketSizes;
        this.mBucketSizes = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.mBucketSizes;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                initialize();
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public int getBucketedSize(int i) {
        int[] iArr;
        if (i > 0) {
            for (int i2 : this.mBucketSizes) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new InvalidSizeException(Integer.valueOf(i));
    }

    public int getMinBufferSize() {
        return this.mBucketSizes[0];
    }

    /* access modifiers changed from: protected */
    public int getSizeInBytes(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    public NativeMemoryChunk alloc(int i) {
        return new NativeMemoryChunk(i);
    }

    /* access modifiers changed from: protected */
    public void free(NativeMemoryChunk nativeMemoryChunk) {
        Preconditions.checkNotNull(nativeMemoryChunk);
        nativeMemoryChunk.close();
    }

    /* access modifiers changed from: protected */
    public int getBucketedSizeForValue(NativeMemoryChunk nativeMemoryChunk) {
        Preconditions.checkNotNull(nativeMemoryChunk);
        return nativeMemoryChunk.getSize();
    }

    /* access modifiers changed from: protected */
    public boolean isReusable(NativeMemoryChunk nativeMemoryChunk) {
        Preconditions.checkNotNull(nativeMemoryChunk);
        return !nativeMemoryChunk.isClosed();
    }
}