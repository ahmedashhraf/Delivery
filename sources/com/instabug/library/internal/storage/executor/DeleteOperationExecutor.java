package com.instabug.library.internal.storage.executor;

import androidx.annotation.C0193h0;
import com.instabug.library.internal.storage.operation.DiskOperation;
import com.instabug.library.internal.storage.operation.DiskOperationCallback;
import java.io.IOException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class DeleteOperationExecutor {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private final DiskOperation<Boolean, Void> operation;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5370266896377030944L, "com/instabug/library/internal/storage/executor/DeleteOperationExecutor", 3);
        $jacocoData = a;
        return a;
    }

    public DeleteOperationExecutor(@C0193h0 DiskOperation<Boolean, Void> diskOperation) {
        boolean[] $jacocoInit = $jacocoInit();
        this.operation = diskOperation;
        $jacocoInit[0] = true;
    }

    public boolean execute() throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        boolean booleanValue = ((Boolean) this.operation.execute(null)).booleanValue();
        $jacocoInit[1] = true;
        return booleanValue;
    }

    public void executeAsync(DiskOperationCallback<Boolean> diskOperationCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        this.operation.executeAsync(null, diskOperationCallback);
        $jacocoInit[2] = true;
    }
}
