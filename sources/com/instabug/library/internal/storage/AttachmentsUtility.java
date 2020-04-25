package com.instabug.library.internal.storage;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.C0195i0;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.AttachmentEntry;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

public class AttachmentsUtility {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final double MAX_FILE_SIZE_IN_MB = 50.0d;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5869626756886237238L, "com/instabug/library/internal/storage/AttachmentsUtility", 60);
        $jacocoData = a;
        return a;
    }

    public AttachmentsUtility() {
        $jacocoInit()[0] = true;
    }

    public static File getAttachmentFile(Context context, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        File filesAttachmentDirectory = getFilesAttachmentDirectory(context);
        $jacocoInit[43] = true;
        File file = new File(filesAttachmentDirectory, str);
        $jacocoInit[44] = true;
        if (!file.exists()) {
            $jacocoInit[45] = true;
        } else {
            $jacocoInit[46] = true;
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(System.currentTimeMillis()));
            sb.append(C14282d.ROLL_OVER_FILE_NAME_SEPARATOR);
            sb.append(str);
            file = new File(filesAttachmentDirectory, sb.toString());
            $jacocoInit[47] = true;
        }
        $jacocoInit[48] = true;
        return file;
    }

    public static File getFilesAttachmentDirectory(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        File newDirectory = getNewDirectory(context, AttachmentEntry.TABLE_NAME);
        $jacocoInit[5] = true;
        return newDirectory;
    }

    @C0195i0
    public static String getGalleryImagePath(Activity activity, Uri uri) {
        boolean[] $jacocoInit = $jacocoInit();
        String str = "_data";
        String[] strArr = {str};
        $jacocoInit[17] = true;
        Cursor managedQuery = activity.managedQuery(uri, strArr, null, null, null);
        if (managedQuery != null) {
            $jacocoInit[18] = true;
            int columnIndexOrThrow = managedQuery.getColumnIndexOrThrow(str);
            $jacocoInit[19] = true;
            managedQuery.moveToFirst();
            $jacocoInit[20] = true;
            String string = managedQuery.getString(columnIndexOrThrow);
            $jacocoInit[21] = true;
            return string;
        }
        $jacocoInit[22] = true;
        return null;
    }

    public static File getNewDirectory(Context context, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append(DiskUtils.getInstabugDirectory(context));
        String str2 = "/";
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        File file = new File(sb.toString());
        $jacocoInit[6] = true;
        if (file.exists()) {
            $jacocoInit[7] = true;
        } else {
            $jacocoInit[8] = true;
            if (!file.mkdirs()) {
                $jacocoInit[9] = true;
            } else {
                $jacocoInit[10] = true;
                File file2 = new File(file, ".nomedia");
                try {
                    $jacocoInit[11] = true;
                    file2.createNewFile();
                    $jacocoInit[12] = true;
                } catch (IOException e) {
                    $jacocoInit[13] = true;
                    e.printStackTrace();
                    $jacocoInit[14] = true;
                }
            }
        }
        $jacocoInit[15] = true;
        return file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009a A[Catch:{ IOException -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a8  */
    @androidx.annotation.C0195i0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri getNewFileAttachmentUri(android.content.Context r10, android.net.Uri r11, java.lang.String r12) {
        /*
            java.lang.Class<com.instabug.library.internal.storage.AttachmentsUtility> r0 = com.instabug.library.internal.storage.AttachmentsUtility.class
            boolean[] r1 = $jacocoInit()
            r2 = 0
            r3 = 1
            if (r11 != 0) goto L_0x000f
            r10 = 23
            r1[r10] = r3
            return r2
        L_0x000f:
            java.lang.String r4 = r11.getLastPathSegment()
            java.lang.String r4 = r4.toLowerCase()
            r5 = 24
            r1[r5] = r3
            java.io.File r5 = getFilesAttachmentDirectory(r10)
            r6 = 25
            r1[r6] = r3
            if (r12 != 0) goto L_0x002a
            r12 = 26
            r1[r12] = r3
            goto L_0x0040
        L_0x002a:
            com.instabug.library.settings.SettingsManager r6 = com.instabug.library.settings.SettingsManager.getInstance()
            java.util.LinkedHashMap r6 = r6.getExtraAttachmentFiles()
            r7 = 27
            r1[r7] = r3
            boolean r6 = r6.containsKey(r11)
            if (r6 != 0) goto L_0x0042
            r12 = 28
            r1[r12] = r3
        L_0x0040:
            r12 = r4
            goto L_0x0046
        L_0x0042:
            r4 = 29
            r1[r4] = r3
        L_0x0046:
            java.io.File r4 = new java.io.File
            r4.<init>(r5, r12)
            r6 = 30
            r1[r6] = r3
            boolean r6 = r4.exists()
            if (r6 != 0) goto L_0x005a
            r12 = 31
            r1[r12] = r3
            goto L_0x008b
        L_0x005a:
            r4 = 32
            r1[r4] = r3
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 33
            r1[r7] = r3
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 34
            r1[r9] = r3
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r6.append(r7)
            java.lang.String r7 = "_"
            r6.append(r7)
            r6.append(r12)
            java.lang.String r12 = r6.toString()
            r4.<init>(r5, r12)
            r12 = 35
            r1[r12] = r3     // Catch:{ IOException -> 0x00b1 }
        L_0x008b:
            com.instabug.library.internal.storage.DiskUtils.copyFromUriIntoFile(r10, r11, r4)     // Catch:{ IOException -> 0x00b1 }
            r10 = 36
            r1[r10] = r3     // Catch:{ IOException -> 0x00b1 }
            r10 = 4632233691727265792(0x4049000000000000, double:50.0)
            boolean r10 = validateFileSize(r4, r10)     // Catch:{ IOException -> 0x00b1 }
            if (r10 != 0) goto L_0x00a8
            r10 = 37
            r1[r10] = r3     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r10 = "Attachment file size exceeds than the limit 50.0"
            com.instabug.library.util.InstabugSDKLogger.m46625i(r0, r10)     // Catch:{ IOException -> 0x00b1 }
            r10 = 38
            r1[r10] = r3
            return r2
        L_0x00a8:
            android.net.Uri r10 = android.net.Uri.fromFile(r4)
            r11 = 41
            r1[r11] = r3
            return r10
        L_0x00b1:
            r10 = move-exception
            r11 = 39
            r1[r11] = r3
            java.lang.String r11 = r10.getMessage()
            com.instabug.library.util.InstabugSDKLogger.m46624e(r0, r11, r10)
            r10 = 40
            r1[r10] = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.AttachmentsUtility.getNewFileAttachmentUri(android.content.Context, android.net.Uri, java.lang.String):android.net.Uri");
    }

    public static Uri getUriFromBytes(Context context, byte[] bArr, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        File attachmentFile = getAttachmentFile(context, str);
        try {
            $jacocoInit[49] = true;
            saveBytesToFile(bArr, attachmentFile);
            Uri fromFile = Uri.fromFile(attachmentFile);
            $jacocoInit[52] = true;
            return fromFile;
        } catch (IOException e) {
            $jacocoInit[50] = true;
            InstabugSDKLogger.m46624e(AttachmentsUtility.class, e.getMessage(), e);
            $jacocoInit[51] = true;
            return null;
        }
    }

    public static File getVideoFile(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        File newDirectory = getNewDirectory(context, "videos");
        $jacocoInit[1] = true;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss.SSS", Locale.ENGLISH);
        $jacocoInit[2] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("video-");
        sb.append(simpleDateFormat.format(new Date()));
        sb.append(".mp4");
        String sb2 = sb.toString();
        $jacocoInit[3] = true;
        File file = new File(newDirectory, sb2);
        $jacocoInit[4] = true;
        return file;
    }

    public static File getVideoRecordingFramesDirectory(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        File newDirectory = getNewDirectory(context, "frames");
        $jacocoInit[16] = true;
        return newDirectory;
    }

    private static void saveBytesToFile(byte[] bArr, File file) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        $jacocoInit[53] = true;
        bufferedOutputStream.write(bArr);
        $jacocoInit[54] = true;
        bufferedOutputStream.flush();
        $jacocoInit[55] = true;
        bufferedOutputStream.close();
        $jacocoInit[56] = true;
    }

    private static boolean validateFileSize(File file, double d) {
        boolean[] $jacocoInit = $jacocoInit();
        long length = file.length();
        double d2 = (double) length;
        Double.isNaN(d2);
        double d3 = d2 / 1048576.0d;
        $jacocoInit[57] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("External attachment file size is ");
        sb.append(length);
        sb.append(" bytes or ");
        sb.append(d3);
        sb.append(" MBs");
        InstabugSDKLogger.m46622d(AttachmentsUtility.class, sb.toString());
        if (d3 > d) {
            $jacocoInit[58] = true;
            return false;
        }
        $jacocoInit[59] = true;
        return true;
    }

    public static Uri getNewFileAttachmentUri(Context context, Uri uri) {
        boolean[] $jacocoInit = $jacocoInit();
        Uri newFileAttachmentUri = getNewFileAttachmentUri(context, uri, null);
        $jacocoInit[42] = true;
        return newFileAttachmentUri;
    }
}
