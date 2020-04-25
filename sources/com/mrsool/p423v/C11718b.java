package com.mrsool.p423v;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Environment;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.C0193h0;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.common.RotationOptions;
import com.krishna.fileloader.p408i.C10186b;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.AckRequest;
import p053b.p063d.p064b.C2108a;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

/* renamed from: com.mrsool.v.b */
/* compiled from: FileUtils */
public class C11718b {

    /* renamed from: a */
    public static final String f33909a = "Mrsool";

    /* renamed from: b */
    public static final String f33910b = ".media";

    /* renamed from: c */
    public static final String f33911c = ".download";

    /* renamed from: d */
    public static final String f33912d = ".zipfiles";

    /* renamed from: e */
    public static final String f33913e = ".background";

    /* renamed from: f */
    public static final String f33914f = ".profile";

    /* renamed from: g */
    public static final String f33915g = ".maps";

    /* renamed from: h */
    public static final String f33916h = ".backup";

    /* renamed from: i */
    public static final String f33917i = "MRSOOL";

    /* renamed from: j */
    public static final String f33918j = "Audio";

    /* renamed from: k */
    public static final String f33919k = "Download";

    /* renamed from: l */
    public static final String f33920l = "Sent";

    /* renamed from: m */
    public static final String f33921m = ".wav";

    /* renamed from: n */
    public static final int f33922n = 0;

    /* renamed from: o */
    public static final int f33923o = 1;

    /* renamed from: p */
    public static final int f33924p = 612;

    /* renamed from: a */
    public static String m52722a(boolean z) {
        return z ? "Mrsool/.media/MRSOOL_Audio/download/" : "Mrsool/.media/MRSOOL_Audio/sent/";
    }

    /* renamed from: a */
    public static void m52724a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append("/");
        sb.append(f33909a);
        File[] listFiles = new File(sb.toString(), str).listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
    }

    /* renamed from: b */
    public static String m52729b() {
        return String.valueOf(Calendar.getInstance().getTimeInMillis());
    }

    /* renamed from: c */
    public static boolean m52737c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append("/");
        sb.append(f33909a);
        File file = new File(sb.toString(), str);
        return file.exists() || file.mkdirs();
    }

    /* renamed from: d */
    public static String m52739d(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        String str2 = "/";
        sb.append(str2);
        sb.append(f33909a);
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: e */
    public static File m52743e(Context context) {
        return m52712a(context, m52727b(context), m52729b(), "jpg");
    }

    /* renamed from: f */
    public static File m52745f(Context context) {
        return m52712a(context, m52711a(context), m52729b(), "jpg");
    }

    /* renamed from: g */
    public static File m52747g(Context context) {
        return m52712a(context, m52750h(context), m52729b(), "jpg");
    }

    /* renamed from: h */
    public static File m52750h(Context context) {
        return m52735c(context, f33914f);
    }

    /* renamed from: i */
    public static File m52751i(Context context) {
        File file;
        File file2 = null;
        try {
            if (m52740d()) {
                file = new File(Environment.getExternalStorageDirectory(), f33909a);
            } else {
                file = context.getCacheDir();
            }
            file2 = file;
            if (!file2.exists()) {
                file2.mkdirs();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file2;
    }

    /* renamed from: j */
    public static String m52754j(String str) {
        String[] split;
        String str2 = null;
        for (String str3 : str.split("/")) {
            if (str3.toLowerCase().contains(C10186b.f27189b) || str3.toLowerCase().contains(".png")) {
                str2 = str3;
            }
        }
        return str2;
    }

    /* renamed from: k */
    public static String m52756k(String str) {
        String str2 = ".";
        return str.indexOf(str2) > 0 ? str.substring(0, str.lastIndexOf(str2)) : str;
    }

    /* renamed from: l */
    public static String m52757l(String str) {
        return str.substring(str.lastIndexOf(47) + 1);
    }

    /* renamed from: m */
    public static String m52758m(String str) {
        String[] split;
        String str2 = null;
        for (String str3 : str.split("/")) {
            if (str3.toLowerCase().contains(".mp3")) {
                str2 = str3;
            }
        }
        return str2;
    }

    /* renamed from: b */
    public static File m52727b(Context context) {
        return m52735c(context, f33910b);
    }

    /* renamed from: d */
    public static File m52738d(Context context) {
        return m52712a(context, m52727b(context), m52729b(), "m4a");
    }

    /* renamed from: e */
    public static String m52744e(String str) {
        String str2 = "";
        try {
            String[] split = str.split("\\.");
            if (split.length > 0) {
                return split[split.length - 1].toLowerCase();
            }
            return str2;
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    /* renamed from: f */
    public static String m52746f(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.substring(str.lastIndexOf(47) + 1);
    }

    /* renamed from: g */
    public static String m52748g(String str) {
        return str.substring(str.lastIndexOf(47) + 1).split("\\?")[0].split("#")[0];
    }

    /* renamed from: h */
    public static int m52749h(String str) {
        try {
            int attributeInt = new ExifInterface(new File(str).getAbsolutePath()).getAttributeInt(C2108a.f8392y, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return RotationOptions.ROTATE_270;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m52731b(java.io.File r8, java.io.File r9) throws java.io.IOException {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r8.getName()
            r0.<init>(r9, r1)
            r9 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x003a }
            r1.<init>(r0)     // Catch:{ all -> 0x003a }
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch:{ all -> 0x003a }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0038 }
            r1.<init>(r8)     // Catch:{ all -> 0x0038 }
            java.nio.channels.FileChannel r9 = r1.getChannel()     // Catch:{ all -> 0x0038 }
            r3 = 0
            long r5 = r9.size()     // Catch:{ all -> 0x0038 }
            r2 = r9
            r7 = r0
            r2.transferTo(r3, r5, r7)     // Catch:{ all -> 0x0038 }
            r9.close()     // Catch:{ all -> 0x0038 }
            r8.delete()     // Catch:{ all -> 0x0038 }
            if (r9 == 0) goto L_0x0032
            r9.close()
        L_0x0032:
            if (r0 == 0) goto L_0x0037
            r0.close()
        L_0x0037:
            return
        L_0x0038:
            r8 = move-exception
            goto L_0x003c
        L_0x003a:
            r8 = move-exception
            r0 = r9
        L_0x003c:
            if (r9 == 0) goto L_0x0041
            r9.close()
        L_0x0041:
            if (r0 == 0) goto L_0x0046
            r0.close()
        L_0x0046:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.p423v.C11718b.m52731b(java.io.File, java.io.File):void");
    }

    /* renamed from: d */
    public static boolean m52740d() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: k */
    public static String m52755k(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m52727b(context));
        sb.append(File.separator);
        sb.append("file1");
        sb.append(f33921m);
        return sb.toString();
    }

    /* renamed from: c */
    public static File m52734c(Context context) {
        return m52713a(context, false);
    }

    /* renamed from: j */
    public static String m52753j(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m52727b(context));
        sb.append(File.separator);
        sb.append(UriUtil.LOCAL_FILE_SCHEME);
        sb.append(f33921m);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m52719a(Context context, String str, boolean z) {
        return m52715a(context, m52727b(context), str, z);
    }

    /* renamed from: c */
    protected static File m52735c(Context context, String str) {
        File file;
        try {
            file = new File(m52751i(context), str);
            try {
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                return file;
            }
        } catch (Exception e2) {
            e = e2;
            file = null;
            e.printStackTrace();
            return file;
        }
        return file;
    }

    /* renamed from: d */
    public static boolean m52741d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return m52732b(new File(str));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static String m52715a(Context context, File file, String str, boolean z) {
        try {
            File file2 = new File(str);
            String name = file2.getName();
            if (z) {
                String e = m52744e(name);
                if (!TextUtils.isEmpty(e)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("audio_vd_");
                    sb.append(m52729b());
                    sb.append(".");
                    sb.append(e);
                    name = sb.toString();
                }
            }
            File file3 = new File(file, name);
            if (m52725a(file2, file3)) {
                return file3.getAbsolutePath();
            }
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    /* renamed from: i */
    public static String m52752i(String str) {
        String format = new SimpleDateFormat("ddMMyy_HHmmssSSS").format(new Date());
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: d */
    public static byte[] m52742d(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, AckRequest.ELEMENT);
        try {
            long length = randomAccessFile.length();
            int i = (int) length;
            if (((long) i) == length) {
                byte[] bArr = new byte[i];
                randomAccessFile.readFully(bArr);
                return bArr;
            }
            throw new IOException("File size >= 2 GB");
        } finally {
            randomAccessFile.close();
        }
    }

    /* renamed from: c */
    public static String m52736c() {
        String format = new SimpleDateFormat("ddMMyy_HHmmssSSS").format(new Date());
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        sb.append(C10186b.f27189b);
        return sb.toString();
    }

    /* renamed from: c */
    public static float m52733c(File file) {
        try {
            if (!file.exists()) {
                return 0.0f;
            }
            return ((float) (file.length() / PlaybackStateCompat.f473h0)) / 1024.0f;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: b */
    public static boolean m52732b(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.exists()) {
                return file.delete();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    protected static File m52712a(Context context, File file, String str, String str2) {
        if (file == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getAbsolutePath());
            sb.append(File.separator);
            sb.append("audio_vd_");
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            return new File(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static File m52711a(Context context) {
        return m52735c(context, f33915g);
    }

    /* renamed from: b */
    public static String m52730b(String str) {
        Bitmap bitmap;
        String str2 = "Exif: ";
        Options options = new Options();
        options.inJustDecodeBounds = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        int i = options.outHeight;
        int i2 = options.outWidth;
        int[] a = m52726a();
        float f = (float) a[0];
        float f2 = (float) a[1];
        float f3 = (float) (i2 / i);
        float f4 = f / f2;
        float f5 = (float) i;
        if (f5 > f2 || ((float) i2) > f) {
            if (f3 < f4) {
                i2 = (int) ((f2 / f5) * ((float) i2));
                i = (int) f2;
            } else {
                i = f3 > f4 ? (int) ((f / ((float) i2)) * f5) : (int) f2;
                i2 = (int) f;
            }
        }
        options.inSampleSize = m52705a(options, i2, i);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[16384];
        try {
            decodeFile = BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        try {
            bitmap = Bitmap.createBitmap(i2, i, Config.ARGB_8888);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            bitmap = null;
        }
        float f6 = (float) i2;
        float f7 = f6 / ((float) options.outWidth);
        float f8 = (float) i;
        float f9 = f8 / ((float) options.outHeight);
        float f10 = f6 / 2.0f;
        float f11 = f8 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(f7, f9, f10, f11);
        Canvas canvas = new Canvas(bitmap);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(decodeFile, f10 - ((float) (decodeFile.getWidth() / 2)), f11 - ((float) (decodeFile.getHeight() / 2)), new Paint(2));
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(C2108a.f8392y, 0);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(attributeInt);
            sb.toString();
            Matrix matrix2 = new Matrix();
            if (attributeInt == 6) {
                matrix2.postRotate(90.0f);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(attributeInt);
                sb2.toString();
            } else if (attributeInt == 3) {
                matrix2.postRotate(180.0f);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(attributeInt);
                sb3.toString();
            } else if (attributeInt == 8) {
                matrix2.postRotate(270.0f);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append(attributeInt);
                sb4.toString();
            }
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        try {
            bitmap.compress(CompressFormat.JPEG, 80, new FileOutputStream(str));
        } catch (FileNotFoundException e4) {
            e4.printStackTrace();
        }
        return str;
    }

    /* renamed from: a */
    public static File m52713a(Context context, boolean z) {
        File b = m52727b(context);
        if (b.exists() || b.mkdirs()) {
            String str = f33917i;
            StringBuilder sb = new StringBuilder();
            sb.append(b.getAbsolutePath());
            sb.append(File.separator);
            sb.append(str);
            String str2 = C14282d.ROLL_OVER_FILE_NAME_SEPARATOR;
            sb.append(str2);
            sb.append(f33918j);
            String sb2 = sb.toString();
            if (!z) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(File.separator);
                sb3.append(f33920l);
                sb3.append(File.separator);
                sb3.append(C11644i.f33194T0);
                sb2 = sb3.toString();
            }
            File file = new File(sb2);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(str2);
            sb4.append("AUD");
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("");
            sb5.append(System.currentTimeMillis() / 1000);
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(file.getPath());
            sb7.append(File.separator);
            sb7.append(sb6);
            sb7.append(f33921m);
            return new File(sb7.toString());
        }
        C5880q.m25750a("Fail Oops! Failed create directory");
        return null;
    }

    /* renamed from: a */
    public static String m52717a(Context context, String str, int i, boolean z) {
        File a = m52713a(context, z);
        m52725a(new File(str), a);
        return a.getAbsolutePath();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0039 A[SYNTHETIC, Splitter:B:31:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x003e A[Catch:{ IOException -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0047 A[SYNTHETIC, Splitter:B:40:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x004c A[Catch:{ IOException -> 0x0050 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m52725a(java.io.File r3, java.io.File r4) {
        /*
            r0 = 0
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0032, all -> 0x002e }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0032, all -> 0x002e }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0025, all -> 0x0023 }
        L_0x0010:
            int r0 = r2.read(r4)     // Catch:{ IOException -> 0x0025, all -> 0x0023 }
            if (r0 <= 0) goto L_0x001a
            r3.write(r4, r1, r0)     // Catch:{ IOException -> 0x0025, all -> 0x0023 }
            goto L_0x0010
        L_0x001a:
            r2.close()     // Catch:{ IOException -> 0x0022 }
            r3.close()     // Catch:{ IOException -> 0x0022 }
            r3 = 1
            return r3
        L_0x0022:
            return r1
        L_0x0023:
            r4 = move-exception
            goto L_0x0045
        L_0x0025:
            r4 = move-exception
            goto L_0x002c
        L_0x0027:
            r4 = move-exception
            r3 = r0
            goto L_0x0045
        L_0x002a:
            r4 = move-exception
            r3 = r0
        L_0x002c:
            r0 = r2
            goto L_0x0034
        L_0x002e:
            r4 = move-exception
            r3 = r0
            r2 = r3
            goto L_0x0045
        L_0x0032:
            r4 = move-exception
            r3 = r0
        L_0x0034:
            r4.printStackTrace()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x003c
            r0.close()     // Catch:{ IOException -> 0x0042 }
        L_0x003c:
            if (r3 == 0) goto L_0x0042
            r3.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            return r1
        L_0x0043:
            r4 = move-exception
            r2 = r0
        L_0x0045:
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ IOException -> 0x0050 }
        L_0x004a:
            if (r3 == 0) goto L_0x0051
            r3.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0051
        L_0x0050:
            return r1
        L_0x0051:
            goto L_0x0053
        L_0x0052:
            throw r4
        L_0x0053:
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.p423v.C11718b.m52725a(java.io.File, java.io.File):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a A[SYNTHETIC, Splitter:B:18:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0035 A[SYNTHETIC, Splitter:B:23:0x0035] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m52716a(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 1
            android.graphics.Bitmap r4 = android.media.ThumbnailUtils.createVideoThumbnail(r4, r0)
            java.io.File r3 = m52743e(r3)
            if (r4 == 0) goto L_0x003e
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0024 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0024 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x001f, all -> 0x001c }
            r2 = 100
            r4.compress(r0, r2, r1)     // Catch:{ Exception -> 0x001f, all -> 0x001c }
            r1.close()     // Catch:{ IOException -> 0x002e }
            goto L_0x003e
        L_0x001c:
            r3 = move-exception
            r0 = r1
            goto L_0x0033
        L_0x001f:
            r4 = move-exception
            r0 = r1
            goto L_0x0025
        L_0x0022:
            r3 = move-exception
            goto L_0x0033
        L_0x0024:
            r4 = move-exception
        L_0x0025:
            r4.printStackTrace()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x003e
            r0.close()     // Catch:{ IOException -> 0x002e }
            goto L_0x003e
        L_0x002e:
            r4 = move-exception
            r4.printStackTrace()
            goto L_0x003e
        L_0x0033:
            if (r0 == 0) goto L_0x003d
            r0.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x003d
        L_0x0039:
            r4 = move-exception
            r4.printStackTrace()
        L_0x003d:
            throw r3
        L_0x003e:
            java.lang.String r3 = r3.getAbsolutePath()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.p423v.C11718b.m52716a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static Bitmap m52707a(Resources resources, int i, int i2, int i3, boolean z) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i, options);
        options.inSampleSize = m52706a(options, i2, i3, z);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i, options);
    }

    /* renamed from: b */
    public static Float m52728b(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(context, parse);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            StringBuilder sb = new StringBuilder();
            sb.append("Duration is :");
            sb.append(extractMetadata);
            C5880q.m25751b(sb.toString());
            return Float.valueOf(Float.parseFloat(extractMetadata));
        } catch (Exception e) {
            e.printStackTrace();
            return Float.valueOf(0.0f);
        }
    }

    /* renamed from: a */
    public static Bitmap m52710a(String str, int i, int i2, boolean z) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = m52706a(options, i, i2, z);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    /* renamed from: a */
    public static int m52706a(Options options, int i, int i2, boolean z) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        float f = (float) i4;
        float f2 = (float) i3;
        return f / f2 > 0.0f ? z ? Math.round(f / ((float) i)) : Math.round(f2 / ((float) i2)) : z ? Math.round(f2 / ((float) i2)) : Math.round(f / ((float) i));
    }

    /* renamed from: a */
    public static void m52723a(File file) {
        String[] list = file.list();
        for (String file2 : list) {
            new File(file, file2).delete();
        }
    }

    /* renamed from: a */
    public static Bitmap m52708a(Bitmap bitmap, int i) {
        int i2;
        float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
        if (width > 1.0f) {
            i2 = (int) (((float) i) / width);
        } else {
            int i3 = (int) (((float) i) * width);
            i2 = i;
            i = i3;
        }
        return Bitmap.createScaledBitmap(bitmap, i, i2, true);
    }

    /* renamed from: a */
    public static Bitmap m52709a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (height > width) {
            i = (int) (((float) i2) * (((float) width) / ((float) height)));
        } else if (width > height) {
            i2 = (int) (((float) i) * (((float) height) / ((float) width)));
        } else if (height != width) {
            i = -1;
            i2 = -1;
        }
        return Bitmap.createScaledBitmap(bitmap, i, i2, false);
    }

    /* renamed from: a */
    public static String m52718a(Context context, String str, String str2) {
        String d = m52739d(context, str);
        String f = m52746f(str2);
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        sb.append(f);
        return sb.toString();
    }

    /* renamed from: a */
    public static int m52705a(Options options, int i, int i2) {
        int i3;
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i4 > i2 || i5 > i) {
            i3 = Math.round(((float) i4) / ((float) i2));
            int round = Math.round(((float) i5) / ((float) i));
            if (i3 >= round) {
                i3 = round;
            }
        } else {
            i3 = 1;
        }
        while (((float) (i5 * i4)) / ((float) (i3 * i3)) > ((float) (i * i2 * 2))) {
            i3++;
        }
        return i3;
    }

    /* renamed from: a */
    public static int[] m52726a() {
        return new int[]{Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels};
    }

    /* renamed from: a */
    public int[] mo40245a(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    /* renamed from: a */
    public static String m52721a(@C0193h0 Bitmap bitmap, String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            if (bitmap != null) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                bitmap.compress(CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            return file.getPath();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static File m52714a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return new File(sb.toString());
    }

    /* renamed from: a */
    public static String m52720a(Context context, boolean z, String str) {
        String str2 = z ? f33919k : f33920l;
        StringBuilder sb = new StringBuilder();
        sb.append(m52727b(context));
        sb.append(File.separator);
        sb.append(f33917i);
        sb.append(C14282d.ROLL_OVER_FILE_NAME_SEPARATOR);
        sb.append(f33918j);
        sb.append(File.separator);
        sb.append(str2);
        sb.append(File.separator);
        sb.append(str);
        sb.append(File.separator);
        return sb.toString();
    }
}
