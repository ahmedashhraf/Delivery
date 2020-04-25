package com.instabug.library.internal.storage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import androidx.annotation.C0193h0;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.CrashEntry;
import com.instabug.library.internal.storage.executor.DeleteOperationExecutor;
import com.instabug.library.internal.storage.executor.ReadOperationExecutor;
import com.instabug.library.internal.storage.executor.WriteOperationExecutor;
import com.instabug.library.internal.storage.operation.DiskOperation;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import com.krishna.fileloader.p408i.C10186b;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED_BAD_PRACTICE"})
public final class DiskUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private final Context context;

    /* renamed from: com.instabug.library.internal.storage.DiskUtils$a */
    static class C9834a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26062b;

        /* renamed from: a */
        final /* synthetic */ String f26063a;

        C9834a(String str) {
            boolean[] a = m45838a();
            this.f26063a = str;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45838a() {
            boolean[] zArr = f26062b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7585285449435524036L, "com/instabug/library/internal/storage/DiskUtils$1", 3);
            f26062b = a;
            return a;
        }

        public void run() {
            boolean[] a = m45838a();
            File file = new File(this.f26063a);
            a[1] = true;
            file.delete();
            a[2] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-839962631641112048L, "com/instabug/library/internal/storage/DiskUtils", 66);
        $jacocoData = a;
        return a;
    }

    private DiskUtils(Context context2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.context = context2;
        $jacocoInit[0] = true;
    }

    public static void cleanDirectory(File file) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!file.exists()) {
            $jacocoInit[35] = true;
        } else if (!file.isDirectory()) {
            $jacocoInit[36] = true;
        } else {
            $jacocoInit[37] = true;
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                $jacocoInit[38] = true;
            } else {
                int length = listFiles.length;
                int i = 0;
                $jacocoInit[39] = true;
                while (i < length) {
                    File file2 = listFiles[i];
                    $jacocoInit[41] = true;
                    if (!file2.delete()) {
                        $jacocoInit[42] = true;
                    } else {
                        $jacocoInit[43] = true;
                        StringBuilder sb = new StringBuilder();
                        sb.append("file deleted successfully, path: ");
                        $jacocoInit[44] = true;
                        sb.append(file2.getPath());
                        sb.append(", time in MS: ");
                        $jacocoInit[45] = true;
                        sb.append(System.currentTimeMillis());
                        String sb2 = sb.toString();
                        $jacocoInit[46] = true;
                        InstabugSDKLogger.m46626v(DiskUtils.class, sb2);
                        $jacocoInit[47] = true;
                    }
                    i++;
                    $jacocoInit[48] = true;
                }
                $jacocoInit[40] = true;
            }
        }
        $jacocoInit[49] = true;
    }

    public static void copyFromUriIntoFile(Context context2, Uri uri, File file) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[50] = true;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context2.getContentResolver().openInputStream(uri));
        $jacocoInit[51] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Target file path: ");
        sb.append(file.getPath());
        InstabugSDKLogger.m46622d(AttachmentsUtility.class, sb.toString());
        $jacocoInit[52] = true;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(context2.getContentResolver().openOutputStream(Uri.fromFile(file)));
        byte[] bArr = new byte[32768];
        $jacocoInit[53] = true;
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read > 0) {
                $jacocoInit[54] = true;
                bufferedOutputStream.write(bArr, 0, read);
                $jacocoInit[55] = true;
            } else {
                bufferedOutputStream.close();
                $jacocoInit[56] = true;
                bufferedInputStream.close();
                $jacocoInit[57] = true;
                return;
            }
        }
    }

    public static File createStateTextFile(Context context2) {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        File filesDir = context2.getFilesDir();
        $jacocoInit[63] = true;
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.pathSeparator);
        sb.append(CrashEntry.COLUMN_CRASH_STATE);
        sb.append(File.pathSeparator);
        $jacocoInit[64] = true;
        sb.append(System.currentTimeMillis());
        sb.append(C10186b.f27192e);
        File file = new File(sb.toString());
        $jacocoInit[65] = true;
        return file;
    }

    public static void deleteFile(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        PoolProvider.postIOTask(new C9834a(str));
        $jacocoInit[58] = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File getInstabugDirectory(android.content.Context r7) {
        /*
            java.lang.Class<com.instabug.library.internal.storage.AttachmentsUtility> r0 = com.instabug.library.internal.storage.AttachmentsUtility.class
            boolean[] r1 = $jacocoInit()
            r2 = 0
            java.io.File r3 = r7.getExternalFilesDir(r2)
            java.lang.String r4 = "External storage not available, saving file to internal storage."
            r5 = 1
            if (r3 != 0) goto L_0x0013
            r1[r5] = r5
            goto L_0x0025
        L_0x0013:
            r3 = 2
            r1[r3] = r5
            java.lang.String r3 = android.os.Environment.getExternalStorageState()
            java.lang.String r6 = "mounted"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x0035
            r2 = 3
            r1[r2] = r5
        L_0x0025:
            java.lang.String r7 = getInternalStoragePath(r7)
            r2 = 9
            r1[r2] = r5
            com.instabug.library.util.InstabugSDKLogger.m46625i(r0, r4)
            r0 = 10
            r1[r0] = r5
            goto L_0x0055
        L_0x0035:
            r3 = 4
            r1[r3] = r5     // Catch:{ NullPointerException -> 0x0044 }
            java.io.File r2 = r7.getExternalFilesDir(r2)     // Catch:{ NullPointerException -> 0x0044 }
            java.lang.String r7 = r2.getAbsolutePath()     // Catch:{ NullPointerException -> 0x0044 }
            r0 = 5
            r1[r0] = r5
            goto L_0x0055
        L_0x0044:
            r2 = 6
            r1[r2] = r5
            java.lang.String r7 = getInternalStoragePath(r7)
            r2 = 7
            r1[r2] = r5
            com.instabug.library.util.InstabugSDKLogger.m46625i(r0, r4)
            r0 = 8
            r1[r0] = r5
        L_0x0055:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r7 = "/instabug/"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.<init>(r7)
            r7 = 11
            r1[r7] = r5
            boolean r7 = r0.exists()
            if (r7 == 0) goto L_0x007a
            r7 = 12
            r1[r7] = r5
            goto L_0x00ac
        L_0x007a:
            r7 = 13
            r1[r7] = r5
            boolean r7 = r0.mkdirs()
            if (r7 != 0) goto L_0x0089
            r7 = 14
            r1[r7] = r5
            goto L_0x00ac
        L_0x0089:
            r7 = 15
            r1[r7] = r5
            java.io.File r7 = new java.io.File
            java.lang.String r2 = ".nomedia"
            r7.<init>(r0, r2)
            r2 = 16
            r1[r2] = r5     // Catch:{ IOException -> 0x00a0 }
            r7.createNewFile()     // Catch:{ IOException -> 0x00a0 }
            r7 = 17
            r1[r7] = r5
            goto L_0x00ac
        L_0x00a0:
            r7 = move-exception
            r2 = 18
            r1[r2] = r5
            r7.printStackTrace()
            r7 = 19
            r1[r7] = r5
        L_0x00ac:
            r7 = 20
            r1[r7] = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.DiskUtils.getInstabugDirectory(android.content.Context):java.io.File");
    }

    private static String getInternalStoragePath(Context context2) {
        boolean[] $jacocoInit = $jacocoInit();
        String absolutePath = context2.getFilesDir().getAbsolutePath();
        $jacocoInit[21] = true;
        return absolutePath;
    }

    public static void saveBitmapOnDisk(Bitmap bitmap, File file) throws IOException {
        Class<DiskUtils> cls = DiskUtils.class;
        boolean[] $jacocoInit = $jacocoInit();
        if (bitmap == null) {
            $jacocoInit[22] = true;
        } else if (file == null) {
            $jacocoInit[23] = true;
        } else {
            $jacocoInit[24] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("starting save viewHierarchy image, path: ");
            $jacocoInit[25] = true;
            sb.append(file.getAbsolutePath());
            String str = ", time in MS: ";
            sb.append(str);
            sb.append(System.currentTimeMillis());
            String sb2 = sb.toString();
            $jacocoInit[26] = true;
            InstabugSDKLogger.m46626v(cls, sb2);
            $jacocoInit[27] = true;
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            $jacocoInit[28] = true;
            bitmap.compress(CompressFormat.PNG, 100, fileOutputStream);
            $jacocoInit[29] = true;
            fileOutputStream.close();
            $jacocoInit[30] = true;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("viewHierarchy image saved, path: ");
            $jacocoInit[31] = true;
            sb3.append(file.getAbsolutePath());
            sb3.append(str);
            sb3.append(System.currentTimeMillis());
            String sb4 = sb3.toString();
            $jacocoInit[32] = true;
            InstabugSDKLogger.m46626v(cls, sb4);
            $jacocoInit[33] = true;
        }
        $jacocoInit[34] = true;
    }

    public static DiskUtils with(Context context2) {
        boolean[] $jacocoInit = $jacocoInit();
        DiskUtils diskUtils = new DiskUtils(context2);
        $jacocoInit[59] = true;
        return diskUtils;
    }

    public DeleteOperationExecutor deleteOperation(@C0193h0 DiskOperation<Boolean, Void> diskOperation) {
        boolean[] $jacocoInit = $jacocoInit();
        DeleteOperationExecutor deleteOperationExecutor = new DeleteOperationExecutor(diskOperation);
        $jacocoInit[62] = true;
        return deleteOperationExecutor;
    }

    public ReadOperationExecutor readOperation(@C0193h0 DiskOperation<String, Void> diskOperation) {
        boolean[] $jacocoInit = $jacocoInit();
        ReadOperationExecutor readOperationExecutor = new ReadOperationExecutor(diskOperation);
        $jacocoInit[60] = true;
        return readOperationExecutor;
    }

    public WriteOperationExecutor writeOperation(@C0193h0 DiskOperation<Uri, Context> diskOperation) {
        boolean[] $jacocoInit = $jacocoInit();
        WriteOperationExecutor writeOperationExecutor = new WriteOperationExecutor(this.context, diskOperation);
        $jacocoInit[61] = true;
        return writeOperationExecutor;
    }
}
