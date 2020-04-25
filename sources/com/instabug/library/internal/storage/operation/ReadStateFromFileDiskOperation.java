package com.instabug.library.internal.storage.operation;

import android.net.Uri;
import androidx.annotation.C0195i0;
import com.instabug.library.util.threading.PoolProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p212io.fabric.sdk.android.services.network.C14393i;

public class ReadStateFromFileDiskOperation implements DiskOperation<String, Void> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private final Uri uri;

    /* renamed from: com.instabug.library.internal.storage.operation.ReadStateFromFileDiskOperation$a */
    class C9844a implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26079N;

        /* renamed from: a */
        final /* synthetic */ DiskOperationCallback f26080a;

        /* renamed from: b */
        final /* synthetic */ ReadStateFromFileDiskOperation f26081b;

        C9844a(ReadStateFromFileDiskOperation readStateFromFileDiskOperation, DiskOperationCallback diskOperationCallback) {
            boolean[] a = m45860a();
            this.f26081b = readStateFromFileDiskOperation;
            this.f26080a = diskOperationCallback;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45860a() {
            boolean[] zArr = f26079N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7632279054138955172L, "com/instabug/library/internal/storage/operation/ReadStateFromFileDiskOperation$1", 7);
            f26079N = a;
            return a;
        }

        public void run() {
            boolean[] a = m45860a();
            DiskOperationCallback diskOperationCallback = this.f26080a;
            if (diskOperationCallback == null) {
                a[1] = true;
            } else {
                try {
                    a[2] = true;
                    diskOperationCallback.onSuccess(ReadStateFromFileDiskOperation.access$000(this.f26081b));
                    a[3] = true;
                } catch (IOException e) {
                    a[4] = true;
                    this.f26080a.onFailure(e);
                    a[5] = true;
                }
            }
            a[6] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6531627473238972113L, "com/instabug/library/internal/storage/operation/ReadStateFromFileDiskOperation", 16);
        $jacocoData = a;
        return a;
    }

    public ReadStateFromFileDiskOperation(Uri uri2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.uri = uri2;
        $jacocoInit[0] = true;
    }

    static /* synthetic */ String access$000(ReadStateFromFileDiskOperation readStateFromFileDiskOperation) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        String textFromFile = readStateFromFileDiskOperation.getTextFromFile();
        $jacocoInit[15] = true;
        return textFromFile;
    }

    private String getTextFromFile() throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        $jacocoInit[3] = true;
        File file = new File(this.uri.getPath());
        $jacocoInit[4] = true;
        FileInputStream fileInputStream = new FileInputStream(file);
        $jacocoInit[5] = true;
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, Charset.forName(C14393i.f42526a));
        $jacocoInit[6] = true;
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        $jacocoInit[7] = true;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                $jacocoInit[8] = true;
                sb.append(readLine);
                $jacocoInit[9] = true;
                sb.append("\n");
                $jacocoInit[10] = true;
            } else {
                bufferedReader.close();
                $jacocoInit[11] = true;
                String sb2 = sb.toString();
                $jacocoInit[12] = true;
                return sb2;
            }
        }
    }

    public /* synthetic */ Object execute(Object obj) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        String execute = execute((Void) obj);
        $jacocoInit[14] = true;
        return execute;
    }

    public /* synthetic */ void executeAsync(Object obj, @C0195i0 DiskOperationCallback diskOperationCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        executeAsync((Void) obj, diskOperationCallback);
        $jacocoInit[13] = true;
    }

    public String execute(Void voidR) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        String textFromFile = getTextFromFile();
        $jacocoInit[1] = true;
        return textFromFile;
    }

    public void executeAsync(Void voidR, @C0195i0 DiskOperationCallback<String> diskOperationCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        PoolProvider.postIOTask(new C9844a(this, diskOperationCallback));
        $jacocoInit[2] = true;
    }
}
