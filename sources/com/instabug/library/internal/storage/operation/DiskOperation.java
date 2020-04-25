package com.instabug.library.internal.storage.operation;

import androidx.annotation.C0195i0;
import java.io.IOException;

public interface DiskOperation<T, N> {
    T execute(N n) throws IOException;

    void executeAsync(N n, @C0195i0 DiskOperationCallback<T> diskOperationCallback);
}
