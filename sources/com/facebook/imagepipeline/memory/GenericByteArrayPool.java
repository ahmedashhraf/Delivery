package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.memory.BasePool.InvalidSizeException;
import p201f.p202a.p203u.C5969d;

@C5969d
public class GenericByteArrayPool extends BasePool<byte[]> implements ByteArrayPool {
    private final int[] mBucketSizes;

    public GenericByteArrayPool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        SparseIntArray sparseIntArray = poolParams.bucketSizes;
        this.mBucketSizes = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.mBucketSizes[i] = sparseIntArray.keyAt(i);
        }
        initialize();
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
    public byte[] alloc(int i) {
        return new byte[i];
    }

    /* access modifiers changed from: protected */
    public void free(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
    }

    /* access modifiers changed from: protected */
    public int getBucketedSizeForValue(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        return bArr.length;
    }
}
