package com.instabug.library.util;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.instabug.library.internal.storage.AttachmentManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import p195e.p196a.C5923b0;
import p195e.p196a.p441d1.C12228b;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

public class DiskUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    /* renamed from: com.instabug.library.util.DiskUtils$a */
    static class C10018a implements Callable<List<File>> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26661b;

        /* renamed from: a */
        final /* synthetic */ File f26662a;

        C10018a(File file) {
            boolean[] b = m46619b();
            this.f26662a = file;
            b[0] = true;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m46619b() {
            boolean[] zArr = f26661b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1608685003455946576L, "com/instabug/library/util/DiskUtils$1", 15);
            f26661b = a;
            return a;
        }

        /* renamed from: a */
        public List<File> mo35998a() {
            boolean[] b = m46619b();
            ArrayList arrayList = new ArrayList();
            b[1] = true;
            if (!this.f26662a.exists()) {
                b[2] = true;
            } else if (!this.f26662a.isDirectory()) {
                b[3] = true;
            } else {
                b[4] = true;
                File[] listFiles = this.f26662a.listFiles();
                if (listFiles == null) {
                    b[5] = true;
                } else {
                    int length = listFiles.length;
                    int i = 0;
                    b[6] = true;
                    while (i < length) {
                        File file = listFiles[i];
                        b[8] = true;
                        if (file.delete()) {
                            b[9] = true;
                        } else {
                            b[10] = true;
                            arrayList.add(file);
                            b[11] = true;
                        }
                        i++;
                        b[12] = true;
                    }
                    b[7] = true;
                }
            }
            b[13] = true;
            return arrayList;
        }

        public /* synthetic */ Object call() throws Exception {
            boolean[] b = m46619b();
            List a = mo35998a();
            b[14] = true;
            return a;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3876439126853155024L, "com/instabug/library/util/DiskUtils", 46);
        $jacocoData = a;
        return a;
    }

    public DiskUtils() {
        $jacocoInit()[0] = true;
    }

    private static void copy(File file, OutputStream outputStream) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            $jacocoInit[26] = true;
            copy((InputStream) fileInputStream, outputStream);
            $jacocoInit[27] = true;
        } catch (FileNotFoundException unused) {
            $jacocoInit[28] = true;
            InstabugSDKLogger.m46623e(DiskUtils.class, "FileNotFoundException: can not copy file to another stream");
            $jacocoInit[29] = true;
        }
        $jacocoInit[30] = true;
    }

    @C0193h0
    public static C5923b0<List<File>> getCleanDirectoryObservable(File file) {
        boolean[] $jacocoInit = $jacocoInit();
        C5923b0 f = C5923b0.m26194f((Callable<? extends T>) new C10018a<Object>(file));
        $jacocoInit[44] = true;
        C5923b0<List<File>> c = f.mo23950c(C12228b.m55094b());
        $jacocoInit[45] = true;
        return c;
    }

    public static ArrayList<File> listFilesInDirectory(File file) {
        boolean[] $jacocoInit = $jacocoInit();
        File[] listFiles = file.listFiles();
        $jacocoInit[34] = true;
        Collection arrayList = new ArrayList();
        if (listFiles == null) {
            $jacocoInit[35] = true;
        } else {
            $jacocoInit[36] = true;
            arrayList = Arrays.asList(listFiles);
            $jacocoInit[37] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("listing ");
            sb.append(listFiles.length);
            sb.append(" files ... at Directory name: ");
            $jacocoInit[38] = true;
            sb.append(file.getName());
            sb.append("Directory path: ");
            $jacocoInit[39] = true;
            sb.append(file.getPath());
            sb.append(", time in MS:");
            $jacocoInit[40] = true;
            sb.append(System.currentTimeMillis());
            String sb2 = sb.toString();
            $jacocoInit[41] = true;
            InstabugSDKLogger.m46626v(DiskUtils.class, sb2);
            $jacocoInit[42] = true;
        }
        ArrayList<File> arrayList2 = new ArrayList<>(arrayList);
        $jacocoInit[43] = true;
        return arrayList2;
    }

    @C0195i0
    public static synchronized Uri zipFiles(Context context, String str, ArrayList<File> arrayList) {
        Uri fromFile;
        Class<DiskUtils> cls = DiskUtils.class;
        synchronized (cls) {
            boolean[] $jacocoInit = $jacocoInit();
            StringBuilder sb = new StringBuilder();
            sb.append("zipping ");
            sb.append(arrayList.size());
            sb.append(" files ... , time in MS:");
            $jacocoInit[1] = true;
            sb.append(System.currentTimeMillis());
            String sb2 = sb.toString();
            $jacocoInit[2] = true;
            InstabugSDKLogger.m46626v(cls, sb2);
            try {
                $jacocoInit[3] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(AttachmentManager.getAttachmentDirectory(context));
                sb3.append(File.separator);
                sb3.append(str);
                sb3.append(C14282d.ROLL_OVER_FILE_NAME_SEPARATOR);
                $jacocoInit[4] = true;
                sb3.append(System.currentTimeMillis());
                sb3.append(".zip");
                File file = new File(sb3.toString());
                $jacocoInit[5] = true;
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                $jacocoInit[6] = true;
                ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
                $jacocoInit[7] = true;
                Iterator it = arrayList.iterator();
                $jacocoInit[8] = true;
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    if (file2 == null) {
                        $jacocoInit[9] = true;
                    } else {
                        $jacocoInit[10] = true;
                        zipOutputStream.putNextEntry(new ZipEntry(file2.getName()));
                        $jacocoInit[11] = true;
                        copy(file2, (OutputStream) zipOutputStream);
                        $jacocoInit[12] = true;
                        zipOutputStream.closeEntry();
                        $jacocoInit[13] = true;
                    }
                    $jacocoInit[14] = true;
                }
                if (file.length() == 0) {
                    $jacocoInit[15] = true;
                } else {
                    $jacocoInit[16] = true;
                    zipOutputStream.close();
                    $jacocoInit[17] = true;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("zipping files have been finished successfully, path: ");
                $jacocoInit[18] = true;
                sb4.append(file.getPath());
                sb4.append(", time in MS: ");
                sb4.append(System.currentTimeMillis());
                String sb5 = sb4.toString();
                $jacocoInit[19] = true;
                InstabugSDKLogger.m46626v(cls, sb5);
                $jacocoInit[20] = true;
                fromFile = Uri.fromFile(file);
                $jacocoInit[21] = true;
            } catch (IOException e) {
                $jacocoInit[22] = true;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("zipping files went wrong: ");
                $jacocoInit[23] = true;
                sb6.append(e.getMessage());
                sb6.append(", time in MS: ");
                sb6.append(System.currentTimeMillis());
                String sb7 = sb6.toString();
                $jacocoInit[24] = true;
                InstabugSDKLogger.m46624e(cls, sb7, e);
                $jacocoInit[25] = true;
                return null;
            }
        }
        return fromFile;
    }

    private static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        byte[] bArr = new byte[2048];
        $jacocoInit[31] = true;
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                $jacocoInit[33] = true;
                return;
            } else {
                outputStream.write(bArr, 0, read);
                $jacocoInit[32] = true;
            }
        }
    }
}
