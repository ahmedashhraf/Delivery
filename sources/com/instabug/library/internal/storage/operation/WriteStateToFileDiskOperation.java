package com.instabug.library.internal.storage.operation;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0195i0;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p212io.fabric.sdk.android.services.network.C14393i;

public class WriteStateToFileDiskOperation implements DiskOperation<Uri, Context> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private final File file;
    private final String stringState;

    /* renamed from: com.instabug.library.internal.storage.operation.WriteStateToFileDiskOperation$a */
    class C9845a implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26082N;

        /* renamed from: a */
        final /* synthetic */ DiskOperationCallback f26083a;

        /* renamed from: b */
        final /* synthetic */ WriteStateToFileDiskOperation f26084b;

        C9845a(WriteStateToFileDiskOperation writeStateToFileDiskOperation, DiskOperationCallback diskOperationCallback) {
            boolean[] b = m45862b();
            this.f26084b = writeStateToFileDiskOperation;
            this.f26083a = diskOperationCallback;
            b[0] = true;
        }

        /* renamed from: a */
        private void m45861a() throws Throwable {
            boolean[] b = m45862b();
            if (WriteStateToFileDiskOperation.access$000(this.f26084b).createNewFile()) {
                b[10] = true;
                FileOutputStream fileOutputStream = new FileOutputStream(WriteStateToFileDiskOperation.access$000(this.f26084b));
                b[11] = true;
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, Charset.forName(C14393i.f42526a));
                b[12] = true;
                outputStreamWriter.write(WriteStateToFileDiskOperation.access$100(this.f26084b));
                b[13] = true;
                outputStreamWriter.close();
                b[15] = true;
                return;
            }
            AssertionError assertionError = new AssertionError("Unable to create new file, file already exists");
            b[14] = true;
            throw assertionError;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m45862b() {
            boolean[] zArr = f26082N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8714293605805718155L, "com/instabug/library/internal/storage/operation/WriteStateToFileDiskOperation$1", 16);
            f26082N = a;
            return a;
        }

        public void run() {
            boolean[] b = m45862b();
            try {
                m45861a();
                b[1] = true;
            } catch (Throwable th) {
                b[2] = true;
                InstabugSDKLogger.m46624e(this, th.getClass().getSimpleName(), th);
                DiskOperationCallback diskOperationCallback = this.f26083a;
                if (diskOperationCallback == null) {
                    b[3] = true;
                } else {
                    b[4] = true;
                    diskOperationCallback.onFailure(th);
                    b[5] = true;
                }
            }
            DiskOperationCallback diskOperationCallback2 = this.f26083a;
            if (diskOperationCallback2 == null) {
                b[6] = true;
            } else {
                b[7] = true;
                diskOperationCallback2.onSuccess(Uri.fromFile(WriteStateToFileDiskOperation.access$000(this.f26084b)));
                b[8] = true;
            }
            b[9] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7532239442086882792L, "com/instabug/library/internal/storage/operation/WriteStateToFileDiskOperation", 12);
        $jacocoData = a;
        return a;
    }

    public WriteStateToFileDiskOperation(File file2, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.stringState = str;
        this.file = file2;
        $jacocoInit[0] = true;
    }

    static /* synthetic */ File access$000(WriteStateToFileDiskOperation writeStateToFileDiskOperation) {
        boolean[] $jacocoInit = $jacocoInit();
        File file2 = writeStateToFileDiskOperation.file;
        $jacocoInit[10] = true;
        return file2;
    }

    static /* synthetic */ String access$100(WriteStateToFileDiskOperation writeStateToFileDiskOperation) {
        boolean[] $jacocoInit = $jacocoInit();
        String str = writeStateToFileDiskOperation.stringState;
        $jacocoInit[11] = true;
        return str;
    }

    public /* synthetic */ Object execute(Object obj) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        Uri execute = execute((Context) obj);
        $jacocoInit[9] = true;
        return execute;
    }

    public /* synthetic */ void executeAsync(Object obj, @C0195i0 DiskOperationCallback diskOperationCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        executeAsync((Context) obj, diskOperationCallback);
        $jacocoInit[8] = true;
    }

    public synchronized Uri execute(Context context) throws IOException {
        Uri fromFile;
        boolean[] $jacocoInit = $jacocoInit();
        if (this.file.createNewFile()) {
            $jacocoInit[1] = true;
            FileOutputStream fileOutputStream = new FileOutputStream(this.file);
            $jacocoInit[2] = true;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, Charset.forName(C14393i.f42526a));
            $jacocoInit[3] = true;
            outputStreamWriter.write(this.stringState);
            $jacocoInit[4] = true;
            outputStreamWriter.close();
            fromFile = Uri.fromFile(this.file);
            $jacocoInit[6] = true;
        } else {
            AssertionError assertionError = new AssertionError("Unable to create new file, file already exists");
            $jacocoInit[5] = true;
            throw assertionError;
        }
        return fromFile;
    }

    public void executeAsync(Context context, @C0195i0 DiskOperationCallback<Uri> diskOperationCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        PoolProvider.postIOTask(new C9845a(this, diskOperationCallback));
        $jacocoInit[7] = true;
    }
}
