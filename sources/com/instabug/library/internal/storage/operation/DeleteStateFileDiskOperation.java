package com.instabug.library.internal.storage.operation;

import android.net.Uri;
import androidx.annotation.C0195i0;
import com.instabug.library.util.threading.PoolProvider;
import java.io.File;
import java.io.IOException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class DeleteStateFileDiskOperation implements DiskOperation<Boolean, Void> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private final Uri uri;

    /* renamed from: com.instabug.library.internal.storage.operation.DeleteStateFileDiskOperation$a */
    class C9843a implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26076N;

        /* renamed from: a */
        final /* synthetic */ DiskOperationCallback f26077a;

        /* renamed from: b */
        final /* synthetic */ DeleteStateFileDiskOperation f26078b;

        C9843a(DeleteStateFileDiskOperation deleteStateFileDiskOperation, DiskOperationCallback diskOperationCallback) {
            boolean[] a = m45859a();
            this.f26078b = deleteStateFileDiskOperation;
            this.f26077a = diskOperationCallback;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45859a() {
            boolean[] zArr = f26076N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8865461589937555741L, "com/instabug/library/internal/storage/operation/DeleteStateFileDiskOperation$1", 6);
            f26076N = a;
            return a;
        }

        public void run() {
            boolean[] a = m45859a();
            if (this.f26077a == null) {
                a[1] = true;
            } else {
                a[2] = true;
                File file = new File(DeleteStateFileDiskOperation.access$000(this.f26078b).getPath());
                a[3] = true;
                this.f26077a.onSuccess(Boolean.valueOf(file.delete()));
                a[4] = true;
            }
            a[5] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-112387954584029782L, "com/instabug/library/internal/storage/operation/DeleteStateFileDiskOperation", 7);
        $jacocoData = a;
        return a;
    }

    public DeleteStateFileDiskOperation(Uri uri2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.uri = uri2;
        $jacocoInit[0] = true;
    }

    static /* synthetic */ Uri access$000(DeleteStateFileDiskOperation deleteStateFileDiskOperation) {
        boolean[] $jacocoInit = $jacocoInit();
        Uri uri2 = deleteStateFileDiskOperation.uri;
        $jacocoInit[6] = true;
        return uri2;
    }

    public /* synthetic */ Object execute(Object obj) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        Boolean execute = execute((Void) obj);
        $jacocoInit[5] = true;
        return execute;
    }

    public /* synthetic */ void executeAsync(Object obj, @C0195i0 DiskOperationCallback diskOperationCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        executeAsync((Void) obj, diskOperationCallback);
        $jacocoInit[4] = true;
    }

    public synchronized Boolean execute(Void voidR) {
        Boolean valueOf;
        boolean[] $jacocoInit = $jacocoInit();
        File file = new File(this.uri.getPath());
        $jacocoInit[1] = true;
        valueOf = Boolean.valueOf(file.delete());
        $jacocoInit[2] = true;
        return valueOf;
    }

    public void executeAsync(Void voidR, @C0195i0 DiskOperationCallback<Boolean> diskOperationCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        PoolProvider.postIOTask(new C9843a(this, diskOperationCallback));
        $jacocoInit[3] = true;
    }
}
