package com.instabug.library.internal.storage;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import androidx.annotation.C0195i0;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

@SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED_BAD_PRACTICE"})
public class AttachmentManager {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final double MAX_FILE_SIZE_IN_MB = 50.0d;

    /* renamed from: com.instabug.library.internal.storage.AttachmentManager$a */
    public interface C9833a {
        /* renamed from: a */
        void mo34971a(Uri uri);

        /* renamed from: a */
        void mo34972a(Throwable th);
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8374081541354711419L, "com/instabug/library/internal/storage/AttachmentManager", C13959t.f40945q2);
        $jacocoData = a;
        return a;
    }

    public AttachmentManager() {
        $jacocoInit()[0] = true;
    }

    public static void copyFromUriIntoFile(Context context, Uri uri, File file) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getContentResolver().openInputStream(uri));
        $jacocoInit[83] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Target file path: ");
        sb.append(file.getPath());
        InstabugSDKLogger.m46622d(AttachmentManager.class, sb.toString());
        $jacocoInit[84] = true;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(context.getContentResolver().openOutputStream(Uri.fromFile(file)));
        byte[] bArr = new byte[32768];
        $jacocoInit[85] = true;
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read > 0) {
                $jacocoInit[86] = true;
                bufferedOutputStream.write(bArr, 0, read);
                $jacocoInit[87] = true;
            } else {
                bufferedOutputStream.close();
                $jacocoInit[88] = true;
                bufferedInputStream.close();
                $jacocoInit[89] = true;
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File getAttachmentDirectory(android.content.Context r5) {
        /*
            boolean[] r0 = $jacocoInit()
            r1 = 1
            if (r5 == 0) goto L_0x000a
            r0[r1] = r1
            goto L_0x0021
        L_0x000a:
            r2 = 2
            r0[r2] = r1
            boolean r2 = com.instabug.library.Instabug.isBuilt()
            if (r2 != 0) goto L_0x0017
            r2 = 3
            r0[r2] = r1
            goto L_0x0021
        L_0x0017:
            r5 = 4
            r0[r5] = r1
            android.content.Context r5 = com.instabug.library.Instabug.getApplicationContext()
            r2 = 5
            r0[r2] = r1
        L_0x0021:
            r2 = 0
            if (r5 != 0) goto L_0x0028
            r5 = 6
            r0[r5] = r1
            return r2
        L_0x0028:
            java.io.File r3 = r5.getExternalFilesDir(r2)
            if (r3 != 0) goto L_0x0032
            r2 = 7
            r0[r2] = r1
            goto L_0x0042
        L_0x0032:
            java.lang.String r3 = android.os.Environment.getExternalStorageState()
            java.lang.String r4 = "mounted"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x004b
            r2 = 8
            r0[r2] = r1
        L_0x0042:
            java.lang.String r5 = getInternalStoragePath(r5)
            r2 = 13
            r0[r2] = r1
            goto L_0x0068
        L_0x004b:
            r3 = 9
            r0[r3] = r1     // Catch:{ NullPointerException -> 0x005c }
            java.io.File r2 = r5.getExternalFilesDir(r2)     // Catch:{ NullPointerException -> 0x005c }
            java.lang.String r5 = r2.getAbsolutePath()     // Catch:{ NullPointerException -> 0x005c }
            r2 = 10
            r0[r2] = r1
            goto L_0x0068
        L_0x005c:
            r2 = 11
            r0[r2] = r1
            java.lang.String r5 = getInternalStoragePath(r5)
            r2 = 12
            r0[r2] = r1
        L_0x0068:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            java.lang.String r5 = "/instabug/"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r2.<init>(r5)
            r5 = 14
            r0[r5] = r1
            boolean r5 = r2.exists()
            if (r5 == 0) goto L_0x008d
            r5 = 15
            r0[r5] = r1
            goto L_0x00b7
        L_0x008d:
            r5 = 16
            r0[r5] = r1
            r2.mkdirs()
            r5 = 17
            r0[r5] = r1
            java.io.File r5 = new java.io.File
            java.lang.String r3 = ".nomedia"
            r5.<init>(r2, r3)
            r3 = 18
            r0[r3] = r1     // Catch:{ IOException -> 0x00ab }
            r5.createNewFile()     // Catch:{ IOException -> 0x00ab }
            r5 = 19
            r0[r5] = r1
            goto L_0x00b7
        L_0x00ab:
            r5 = move-exception
            r3 = 20
            r0[r3] = r1
            r5.printStackTrace()
            r5 = 21
            r0[r5] = r1
        L_0x00b7:
            r5 = 22
            r0[r5] = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.AttachmentManager.getAttachmentDirectory(android.content.Context):java.io.File");
    }

    private static File getAttachmentFile(Context context, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        File attachmentDirectory = getAttachmentDirectory(context);
        $jacocoInit[73] = true;
        File file = new File(attachmentDirectory, str);
        $jacocoInit[74] = true;
        if (!file.exists()) {
            $jacocoInit[75] = true;
        } else {
            $jacocoInit[76] = true;
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(System.currentTimeMillis()));
            sb.append(C14282d.ROLL_OVER_FILE_NAME_SEPARATOR);
            sb.append(str);
            file = new File(attachmentDirectory, sb.toString());
            $jacocoInit[77] = true;
        }
        $jacocoInit[78] = true;
        return file;
    }

    public static File getAutoScreenRecordingFile(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        File autoScreenRecordingVideosDirectory = getAutoScreenRecordingVideosDirectory(context);
        $jacocoInit[63] = true;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss.SSS", Locale.ENGLISH);
        $jacocoInit[64] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("auto-recording-");
        sb.append(simpleDateFormat.format(new Date()));
        sb.append(".mp4");
        String sb2 = sb.toString();
        $jacocoInit[65] = true;
        File file = new File(autoScreenRecordingVideosDirectory, sb2);
        $jacocoInit[66] = true;
        return file;
    }

    public static File getAutoScreenRecordingVideosDirectory(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append(getAttachmentDirectory(context));
        sb.append("/auto_recording/");
        File file = new File(sb.toString());
        $jacocoInit[54] = true;
        if (file.exists()) {
            $jacocoInit[55] = true;
        } else {
            $jacocoInit[56] = true;
            file.mkdirs();
            $jacocoInit[57] = true;
            File file2 = new File(file, ".nomedia");
            try {
                $jacocoInit[58] = true;
                file2.createNewFile();
                $jacocoInit[59] = true;
            } catch (IOException e) {
                $jacocoInit[60] = true;
                e.printStackTrace();
                $jacocoInit[61] = true;
            }
        }
        $jacocoInit[62] = true;
        return file;
    }

    @C0195i0
    public static String getGalleryImagePath(Activity activity, Uri uri) {
        boolean[] $jacocoInit = $jacocoInit();
        if (activity == null) {
            $jacocoInit[90] = true;
        } else if (uri == null) {
            $jacocoInit[91] = true;
        } else {
            String str = "_data";
            String[] strArr = {str};
            $jacocoInit[93] = true;
            Cursor managedQuery = activity.managedQuery(uri, strArr, null, null, null);
            if (managedQuery != null) {
                $jacocoInit[94] = true;
                int columnIndexOrThrow = managedQuery.getColumnIndexOrThrow(str);
                $jacocoInit[95] = true;
                managedQuery.moveToFirst();
                $jacocoInit[96] = true;
                String string = managedQuery.getString(columnIndexOrThrow);
                $jacocoInit[97] = true;
                return string;
            }
            $jacocoInit[98] = true;
            return null;
        }
        $jacocoInit[92] = true;
        return null;
    }

    private static String getInternalStoragePath(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46625i(AttachmentManager.class, "External storage not available, saving file to internal storage.");
        $jacocoInit[67] = true;
        String absolutePath = context.getFilesDir().getAbsolutePath();
        $jacocoInit[68] = true;
        return absolutePath;
    }

    public static File getNewDirectory(Context context, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append(getAttachmentDirectory(context));
        String str2 = "/";
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        File file = new File(sb.toString());
        $jacocoInit[23] = true;
        if (file.exists()) {
            $jacocoInit[24] = true;
        } else {
            $jacocoInit[25] = true;
            file.mkdirs();
            $jacocoInit[26] = true;
            File file2 = new File(file, ".nomedia");
            try {
                $jacocoInit[27] = true;
                file2.createNewFile();
                $jacocoInit[28] = true;
            } catch (IOException e) {
                $jacocoInit[29] = true;
                e.printStackTrace();
                $jacocoInit[30] = true;
            }
        }
        $jacocoInit[31] = true;
        return file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    @androidx.annotation.C0195i0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri getNewFileUri(android.content.Context r6, android.net.Uri r7, java.lang.String r8) {
        /*
            boolean[] r0 = $jacocoInit()
            r1 = 0
            r2 = 1
            if (r7 != 0) goto L_0x000d
            r6 = 99
            r0[r6] = r2
            return r1
        L_0x000d:
            java.lang.String r3 = r7.getLastPathSegment()
            java.lang.String r3 = r3.toLowerCase()
            r4 = 100
            r0[r4] = r2
            if (r8 != 0) goto L_0x0020
            r8 = 101(0x65, float:1.42E-43)
            r0[r8] = r2
            goto L_0x0036
        L_0x0020:
            com.instabug.library.settings.SettingsManager r4 = com.instabug.library.settings.SettingsManager.getInstance()
            java.util.LinkedHashMap r4 = r4.getExtraAttachmentFiles()
            r5 = 102(0x66, float:1.43E-43)
            r0[r5] = r2
            boolean r4 = r4.containsKey(r7)
            if (r4 != 0) goto L_0x0038
            r8 = 103(0x67, float:1.44E-43)
            r0[r8] = r2
        L_0x0036:
            r8 = r3
            goto L_0x003c
        L_0x0038:
            r3 = 104(0x68, float:1.46E-43)
            r0[r3] = r2
        L_0x003c:
            java.io.File r8 = getAttachmentFile(r6, r8)
            r3 = 105(0x69, float:1.47E-43)
            r0[r3] = r2     // Catch:{ IOException -> 0x005f }
            copyFromUriIntoFile(r6, r7, r8)     // Catch:{ IOException -> 0x005f }
            r6 = 106(0x6a, float:1.49E-43)
            r0[r6] = r2     // Catch:{ IOException -> 0x005f }
            boolean r6 = validateFileSize(r7, r8)     // Catch:{ IOException -> 0x005f }
            if (r6 != 0) goto L_0x0056
            r6 = 107(0x6b, float:1.5E-43)
            r0[r6] = r2
            return r1
        L_0x0056:
            android.net.Uri r6 = android.net.Uri.fromFile(r8)
            r7 = 110(0x6e, float:1.54E-43)
            r0[r7] = r2
            return r6
        L_0x005f:
            r6 = move-exception
            r7 = 108(0x6c, float:1.51E-43)
            r0[r7] = r2
            java.lang.Class<com.instabug.library.internal.storage.AttachmentManager> r7 = com.instabug.library.internal.storage.AttachmentManager.class
            java.lang.String r8 = r6.getMessage()
            com.instabug.library.util.InstabugSDKLogger.m46624e(r7, r8, r6)
            r6 = 109(0x6d, float:1.53E-43)
            r0[r6] = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.AttachmentManager.getNewFileUri(android.content.Context, android.net.Uri, java.lang.String):android.net.Uri");
    }

    public static Uri getUriFromBytes(Context context, byte[] bArr, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        File attachmentFile = getAttachmentFile(context, str);
        try {
            $jacocoInit[79] = true;
            saveBytesToFile(bArr, attachmentFile);
            Uri fromFile = Uri.fromFile(attachmentFile);
            $jacocoInit[82] = true;
            return fromFile;
        } catch (IOException e) {
            $jacocoInit[80] = true;
            InstabugSDKLogger.m46624e(AttachmentManager.class, e.getMessage(), e);
            $jacocoInit[81] = true;
            return null;
        }
    }

    public static File getVideoFile(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        File videoRecordingVideosDirectory = getVideoRecordingVideosDirectory(context);
        $jacocoInit[32] = true;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss.SSS", Locale.getDefault());
        $jacocoInit[33] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("video-");
        sb.append(simpleDateFormat.format(new Date()));
        sb.append(".mp4");
        String sb2 = sb.toString();
        $jacocoInit[34] = true;
        File file = new File(videoRecordingVideosDirectory, sb2);
        $jacocoInit[35] = true;
        return file;
    }

    public static File getVideoRecordingFramesDirectory(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append(getAttachmentDirectory(context));
        sb.append("/frames/");
        File file = new File(sb.toString());
        $jacocoInit[36] = true;
        if (file.exists()) {
            $jacocoInit[37] = true;
        } else {
            $jacocoInit[38] = true;
            file.mkdirs();
            $jacocoInit[39] = true;
            File file2 = new File(file, ".nomedia");
            try {
                $jacocoInit[40] = true;
                file2.createNewFile();
                $jacocoInit[41] = true;
            } catch (IOException e) {
                $jacocoInit[42] = true;
                e.printStackTrace();
                $jacocoInit[43] = true;
            }
        }
        $jacocoInit[44] = true;
        return file;
    }

    public static File getVideoRecordingVideosDirectory(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append(getAttachmentDirectory(context));
        sb.append("/videos/");
        File file = new File(sb.toString());
        $jacocoInit[45] = true;
        if (file.exists()) {
            $jacocoInit[46] = true;
        } else {
            $jacocoInit[47] = true;
            file.mkdirs();
            $jacocoInit[48] = true;
            File file2 = new File(file, ".nomedia");
            try {
                $jacocoInit[49] = true;
                file2.createNewFile();
                $jacocoInit[50] = true;
            } catch (IOException e) {
                $jacocoInit[51] = true;
                e.printStackTrace();
                $jacocoInit[52] = true;
            }
        }
        $jacocoInit[53] = true;
        return file;
    }

    private static Bitmap resizeBitmap(Bitmap bitmap, int i) {
        int i2;
        boolean[] $jacocoInit = $jacocoInit();
        int width = bitmap.getWidth();
        $jacocoInit[150] = true;
        float height = ((float) width) / ((float) bitmap.getHeight());
        if (height > 1.0f) {
            i2 = (int) (((float) i) / height);
            $jacocoInit[151] = true;
        } else {
            int i3 = (int) (((float) i) * height);
            $jacocoInit[152] = true;
            int i4 = i3;
            i2 = i;
            i = i4;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, false);
        $jacocoInit[153] = true;
        return createScaledBitmap;
    }

    public static void saveBitmap(Bitmap bitmap, Context context, C9833a aVar) {
        boolean[] $jacocoInit = $jacocoInit();
        File attachmentDirectory = getAttachmentDirectory(context);
        $jacocoInit[119] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("bug_");
        sb.append(System.currentTimeMillis());
        sb.append("_.jpg");
        File file = new File(attachmentDirectory, sb.toString());
        $jacocoInit[120] = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("image path: ");
        sb2.append(file.toString());
        InstabugSDKLogger.m46626v(AttachmentManager.class, sb2.toString());
        try {
            $jacocoInit[121] = true;
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            $jacocoInit[122] = true;
            bitmap.compress(CompressFormat.JPEG, 100, bufferedOutputStream);
            $jacocoInit[123] = true;
            bufferedOutputStream.close();
            $jacocoInit[124] = true;
            Uri fromFile = Uri.fromFile(file);
            if (fromFile != null) {
                $jacocoInit[125] = true;
                aVar.mo34971a(fromFile);
                $jacocoInit[126] = true;
            } else {
                aVar.mo34972a(new Throwable("Uri equal null"));
                $jacocoInit[127] = true;
            }
            $jacocoInit[128] = true;
        } catch (IOException e) {
            $jacocoInit[129] = true;
            aVar.mo34972a((Throwable) e);
            $jacocoInit[130] = true;
        }
        $jacocoInit[131] = true;
    }

    private static void saveBytesToFile(byte[] bArr, File file) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        $jacocoInit[69] = true;
        bufferedOutputStream.write(bArr);
        $jacocoInit[70] = true;
        bufferedOutputStream.flush();
        $jacocoInit[71] = true;
        bufferedOutputStream.close();
        $jacocoInit[72] = true;
    }

    private static boolean validateFileSize(Uri uri, File file) {
        Class<AttachmentManager> cls = AttachmentManager.class;
        boolean[] $jacocoInit = $jacocoInit();
        if (!SettingsManager.getInstance().getExtraAttachmentFiles().containsKey(uri)) {
            $jacocoInit[112] = true;
        } else {
            $jacocoInit[113] = true;
            long length = file.length();
            double d = (double) length;
            Double.isNaN(d);
            double d2 = d / 1048576.0d;
            $jacocoInit[114] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("External attachment file size is ");
            sb.append(length);
            sb.append(" bytes or ");
            sb.append(d2);
            sb.append(" MBs");
            InstabugSDKLogger.m46622d(cls, sb.toString());
            if (d2 <= MAX_FILE_SIZE_IN_MB) {
                $jacocoInit[115] = true;
            } else {
                $jacocoInit[116] = true;
                InstabugSDKLogger.m46625i(cls, "Attachment exceeds 50.0 MBs file size limit, ignoring attachment");
                $jacocoInit[117] = true;
                return false;
            }
        }
        $jacocoInit[118] = true;
        return true;
    }

    public static Uri getNewFileUri(Context context, Uri uri) {
        boolean[] $jacocoInit = $jacocoInit();
        Uri newFileUri = getNewFileUri(context, uri, null);
        $jacocoInit[111] = true;
        return newFileUri;
    }

    public static void saveBitmap(Bitmap bitmap, File file, C9833a aVar) {
        int i;
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append("frame_");
        sb.append(System.currentTimeMillis());
        sb.append("_.jpg");
        File file2 = new File(file, sb.toString());
        $jacocoInit[132] = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("video frame path: ");
        sb2.append(file2.toString());
        InstabugSDKLogger.m46626v(AttachmentManager.class, sb2.toString());
        try {
            $jacocoInit[133] = true;
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            $jacocoInit[134] = true;
            if (bitmap.getWidth() > bitmap.getHeight()) {
                i = bitmap.getWidth();
                $jacocoInit[135] = true;
            } else {
                i = bitmap.getHeight();
                $jacocoInit[136] = true;
            }
            if (i > 640) {
                $jacocoInit[137] = true;
                Bitmap resizeBitmap = resizeBitmap(bitmap, 640);
                $jacocoInit[138] = true;
                resizeBitmap.compress(CompressFormat.JPEG, 90, bufferedOutputStream);
                $jacocoInit[139] = true;
            } else {
                Bitmap resizeBitmap2 = resizeBitmap(bitmap, 320);
                $jacocoInit[140] = true;
                resizeBitmap2.compress(CompressFormat.JPEG, 90, bufferedOutputStream);
                $jacocoInit[141] = true;
            }
            bufferedOutputStream.close();
            $jacocoInit[142] = true;
            Uri fromFile = Uri.fromFile(file2);
            if (fromFile != null) {
                $jacocoInit[143] = true;
                aVar.mo34971a(fromFile);
                $jacocoInit[144] = true;
            } else {
                aVar.mo34972a(new Throwable("Uri equal null"));
                $jacocoInit[145] = true;
            }
            $jacocoInit[146] = true;
        } catch (IOException e) {
            $jacocoInit[147] = true;
            aVar.mo34972a((Throwable) e);
            $jacocoInit[148] = true;
        }
        $jacocoInit[149] = true;
    }
}
