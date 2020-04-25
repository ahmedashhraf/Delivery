package com.instabug.library.internal.storage.operation;

public interface DiskOperationCallback<T> {
    void onFailure(Throwable th);

    void onSuccess(T t);
}
