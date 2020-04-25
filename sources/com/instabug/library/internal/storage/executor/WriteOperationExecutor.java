package com.instabug.library.internal.storage.executor;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0193h0;
import com.instabug.library.internal.storage.operation.DiskOperation;
import com.instabug.library.internal.storage.operation.DiskOperationCallback;
import java.io.IOException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class WriteOperationExecutor {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private final Context context;
    private final DiskOperation<Uri, Context> operation;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7924270191509688685L, "com/instabug/library/internal/storage/executor/WriteOperationExecutor", 3);
        $jacocoData = a;
        return a;
    }

    public WriteOperationExecutor(@C0193h0 Context context2, DiskOperation<Uri, Context> diskOperation) {
        boolean[] $jacocoInit = $jacocoInit();
        this.context = context2;
        this.operation = diskOperation;
        $jacocoInit[0] = true;
    }

    public Uri execute() throws IOException {
        Uri uri = (Uri) this.operation.execute(this.context);
        $jacocoInit()[1] = true;
        return uri;
    }

    public void executeAsync(DiskOperationCallback<Uri> diskOperationCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        this.operation.executeAsync(this.context, diskOperationCallback);
        $jacocoInit[2] = true;
    }
}
