package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBuffer.ClosedException;
import com.facebook.common.references.CloseableReference;
import p201f.p202a.p203u.C5966a;
import p201f.p202a.p203u.C5969d;

@C5969d
public class NativePooledByteBuffer implements PooledByteBuffer {
    @VisibleForTesting
    @C5966a("this")
    CloseableReference<NativeMemoryChunk> mBufRef;
    private final int mSize;

    public NativePooledByteBuffer(CloseableReference<NativeMemoryChunk> closeableReference, int i) {
        Preconditions.checkNotNull(closeableReference);
        Preconditions.checkArgument(i >= 0 && i <= ((NativeMemoryChunk) closeableReference.get()).getSize());
        this.mBufRef = closeableReference.clone();
        this.mSize = i;
    }

    public synchronized void close() {
        CloseableReference.closeSafely(this.mBufRef);
        this.mBufRef = null;
    }

    /* access modifiers changed from: 0000 */
    public synchronized void ensureValid() {
        if (isClosed()) {
            throw new ClosedException();
        }
    }

    public synchronized long getNativePtr() {
        ensureValid();
        return ((NativeMemoryChunk) this.mBufRef.get()).getNativePtr();
    }

    public synchronized boolean isClosed() {
        return !CloseableReference.isValid(this.mBufRef);
    }

    public synchronized byte read(int i) {
        ensureValid();
        boolean z = true;
        Preconditions.checkArgument(i >= 0);
        if (i >= this.mSize) {
            z = false;
        }
        Preconditions.checkArgument(z);
        return ((NativeMemoryChunk) this.mBufRef.get()).read(i);
    }

    public synchronized int size() {
        ensureValid();
        return this.mSize;
    }

    public synchronized int read(int i, byte[] bArr, int i2, int i3) {
        ensureValid();
        Preconditions.checkArgument(i + i3 <= this.mSize);
        return ((NativeMemoryChunk) this.mBufRef.get()).read(i, bArr, i2, i3);
    }
}
