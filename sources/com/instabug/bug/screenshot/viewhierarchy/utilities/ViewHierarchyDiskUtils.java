package com.instabug.bug.screenshot.viewhierarchy.utilities;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.C0195i0;
import com.instabug.bug.p356h.p357b.C9269b;
import com.instabug.bug.p356h.p357b.C9270c;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ViewHierarchyDiskUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2722183487326431997L, "com/instabug/bug/screenshot/viewhierarchy/utilities/ViewHierarchyDiskUtils", 69);
        $jacocoData = a;
        return a;
    }

    public ViewHierarchyDiskUtils() {
        $jacocoInit()[0] = true;
    }

    private static void copy(File file, OutputStream outputStream) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        FileInputStream fileInputStream = new FileInputStream(file);
        $jacocoInit[52] = true;
        copy((InputStream) fileInputStream, outputStream);
        $jacocoInit[53] = true;
    }

    public static File getViewHierarchyImagesDirectory(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        $jacocoInit[57] = true;
        sb.append(DiskUtils.getInstabugDirectory(context));
        sb.append("/view-hierarchy-images/");
        String sb2 = sb.toString();
        $jacocoInit[58] = true;
        File file = new File(sb2);
        $jacocoInit[59] = true;
        if (file.exists()) {
            $jacocoInit[60] = true;
        } else {
            $jacocoInit[61] = true;
            if (!file.mkdir()) {
                $jacocoInit[62] = true;
            } else {
                $jacocoInit[63] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("temp directory created successfully: ");
                $jacocoInit[64] = true;
                sb3.append(file.getPath());
                sb3.append(", time in MS: ");
                $jacocoInit[65] = true;
                sb3.append(System.currentTimeMillis());
                String sb4 = sb3.toString();
                $jacocoInit[66] = true;
                InstabugSDKLogger.m46625i(ViewHierarchyDiskUtils.class, sb4);
                $jacocoInit[67] = true;
            }
        }
        $jacocoInit[68] = true;
        return file;
    }

    public static void saveViewHierarchyImage(C9269b bVar) {
        Class<ViewHierarchyDiskUtils> cls = ViewHierarchyDiskUtils.class;
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        View o = bVar.mo33494o();
        $jacocoInit[1] = true;
        Context context = o.getContext();
        $jacocoInit[2] = true;
        File viewHierarchyImagesDirectory = getViewHierarchyImagesDirectory(context);
        $jacocoInit[3] = true;
        sb.append(viewHierarchyImagesDirectory.getAbsolutePath());
        sb.append(File.separator);
        sb.append(bVar.mo33465a());
        sb.append(".png");
        File file = new File(sb.toString());
        try {
            $jacocoInit[4] = true;
            if (bVar.mo33489j() != null) {
                $jacocoInit[5] = true;
                DiskUtils.saveBitmapOnDisk(bVar.mo33489j(), file);
                $jacocoInit[6] = true;
                bVar.mo33469a(Uri.fromFile(file));
                $jacocoInit[7] = true;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("trying to save a null value bitmap, time in MS: ");
                $jacocoInit[8] = true;
                sb2.append(System.currentTimeMillis());
                String sb3 = sb2.toString();
                $jacocoInit[9] = true;
                InstabugSDKLogger.m46622d(cls, sb3);
                $jacocoInit[10] = true;
            }
            $jacocoInit[11] = true;
        } catch (IOException e) {
            $jacocoInit[12] = true;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("save viewHierarchy image got error: ");
            $jacocoInit[13] = true;
            sb4.append(e.getMessage());
            sb4.append(", time in MS: ");
            sb4.append(System.currentTimeMillis());
            String sb5 = sb4.toString();
            $jacocoInit[14] = true;
            InstabugSDKLogger.m46624e(cls, sb5, e);
            $jacocoInit[15] = true;
        }
        $jacocoInit[16] = true;
    }

    @C0195i0
    public static synchronized Uri zipViewHierarchyImages(C9269b bVar) {
        Uri fromFile;
        Class<ViewHierarchyDiskUtils> cls = ViewHierarchyDiskUtils.class;
        synchronized (cls) {
            boolean[] $jacocoInit = $jacocoInit();
            StringBuilder sb = new StringBuilder();
            sb.append("zip viewHierarchy images just started, time in MS: ");
            $jacocoInit[17] = true;
            sb.append(System.currentTimeMillis());
            String sb2 = sb.toString();
            $jacocoInit[18] = true;
            InstabugSDKLogger.m46626v(cls, sb2);
            try {
                $jacocoInit[19] = true;
                StringBuilder sb3 = new StringBuilder();
                $jacocoInit[20] = true;
                Context context = bVar.mo33494o().getContext();
                $jacocoInit[21] = true;
                sb3.append(DiskUtils.getInstabugDirectory(context));
                sb3.append(File.separator);
                sb3.append("view_hierarchy_attachment_");
                $jacocoInit[22] = true;
                sb3.append(System.currentTimeMillis());
                sb3.append(".zip");
                File file = new File(sb3.toString());
                $jacocoInit[23] = true;
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                $jacocoInit[24] = true;
                ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
                $jacocoInit[25] = true;
                List<C9269b> b = C9270c.m43356b(bVar);
                $jacocoInit[26] = true;
                $jacocoInit[27] = true;
                for (C9269b bVar2 : b) {
                    $jacocoInit[28] = true;
                    if (bVar2.mo33491l() == null) {
                        $jacocoInit[29] = true;
                    } else {
                        $jacocoInit[30] = true;
                        File file2 = new File(bVar2.mo33491l().getPath());
                        $jacocoInit[31] = true;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(bVar2.mo33465a());
                        sb4.append(".png");
                        zipOutputStream.putNextEntry(new ZipEntry(sb4.toString()));
                        $jacocoInit[32] = true;
                        copy(file2, (OutputStream) zipOutputStream);
                        $jacocoInit[33] = true;
                        zipOutputStream.closeEntry();
                        $jacocoInit[34] = true;
                        if (!file2.delete()) {
                            $jacocoInit[35] = true;
                        } else {
                            $jacocoInit[36] = true;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("file zipped successfully, path: ");
                            $jacocoInit[37] = true;
                            sb5.append(file2.getPath());
                            sb5.append(", time in MS: ");
                            sb5.append(System.currentTimeMillis());
                            String sb6 = sb5.toString();
                            $jacocoInit[38] = true;
                            InstabugSDKLogger.m46626v(cls, sb6);
                            $jacocoInit[39] = true;
                        }
                    }
                    $jacocoInit[40] = true;
                }
                if (file.length() == 0) {
                    $jacocoInit[41] = true;
                } else {
                    $jacocoInit[42] = true;
                    zipOutputStream.close();
                    $jacocoInit[43] = true;
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append("zip viewHierarchy images done successfully, path: ");
                $jacocoInit[44] = true;
                sb7.append(file.getPath());
                sb7.append(", time in MS: ");
                sb7.append(System.currentTimeMillis());
                String sb8 = sb7.toString();
                $jacocoInit[45] = true;
                InstabugSDKLogger.m46626v(cls, sb8);
                $jacocoInit[46] = true;
                fromFile = Uri.fromFile(file);
                $jacocoInit[47] = true;
            } catch (IOException e) {
                $jacocoInit[48] = true;
                StringBuilder sb9 = new StringBuilder();
                sb9.append("zip viewHierarchy images got error: ");
                $jacocoInit[49] = true;
                sb9.append(e.getMessage());
                sb9.append(", time in MS: ");
                sb9.append(System.currentTimeMillis());
                String sb10 = sb9.toString();
                $jacocoInit[50] = true;
                InstabugSDKLogger.m46624e(cls, sb10, e);
                $jacocoInit[51] = true;
                return null;
            }
        }
        return fromFile;
    }

    private static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        byte[] bArr = new byte[2048];
        $jacocoInit[54] = true;
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                $jacocoInit[56] = true;
                return;
            } else {
                outputStream.write(bArr, 0, read);
                $jacocoInit[55] = true;
            }
        }
    }
}
