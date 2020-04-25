package com.instabug.library.internal.storage.executor;

import androidx.annotation.C0193h0;
import com.instabug.library.internal.storage.operation.DiskOperation;
import com.instabug.library.internal.storage.operation.DiskOperationCallback;
import java.io.IOException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ReadOperationExecutor {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private final DiskOperation<String, Void> operation;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3287492849962263999L, "com/instabug/library/internal/storage/executor/ReadOperationExecutor", 3);
        $jacocoData = a;
        return a;
    }

    public ReadOperationExecutor(@C0193h0 DiskOperation<String, Void> diskOperation) {
        boolean[] $jacocoInit = $jacocoInit();
        this.operation = diskOperation;
        $jacocoInit[0] = true;
    }

    public String execute() throws IOException {
        String str = (String) this.operation.execute(null);
        $jacocoInit()[1] = true;
        return str;
    }

    public void executeAsync(DiskOperationCallback<String> diskOperationCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        this.operation.executeAsync(null, diskOperationCallback);
        $jacocoInit[2] = true;
    }
}
