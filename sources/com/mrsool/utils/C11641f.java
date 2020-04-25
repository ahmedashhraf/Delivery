package com.mrsool.utils;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.net.Uri;
import com.mrsool.C10232R.C10235drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;

/* renamed from: com.mrsool.utils.f */
/* compiled from: BmpUtils */
public class C11641f {
    /* renamed from: a */
    public static Bitmap m52488a(byte[] bArr, int i) {
        return m52489a(bArr, i, i);
    }

    /* renamed from: b */
    public static Bitmap m52492b(byte[] bArr, int i) {
        return m52480a(m52488a(bArr, i), i);
    }

    /* renamed from: c */
    public static void m52493c(String str, int i) throws IOException {
        System.gc();
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, false);
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        createBitmap.compress(CompressFormat.JPEG, 60, fileOutputStream);
        fileOutputStream.close();
    }

    /* renamed from: a */
    public static Bitmap m52485a(String str, int i) {
        return m52486a(str, i, i);
    }

    /* renamed from: a */
    public static Bitmap m52477a(ContentResolver contentResolver, Uri uri, int i) {
        return m52478a(contentResolver, uri, i, i);
    }

    /* renamed from: b */
    public static Bitmap m52491b(String str, int i) {
        return m52481a(m52486a(str, i, i), i, i);
    }

    /* renamed from: a */
    public static Bitmap m52489a(byte[] bArr, int i, int i2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        options.inSampleSize = m52475a(options, i, i2);
        StringBuilder sb = new StringBuilder();
        sb.append("inSampleSize:");
        sb.append(options.inSampleSize);
        C5880q.m25750a(sb.toString());
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    /* renamed from: b */
    public static Bitmap m52490b(ContentResolver contentResolver, Uri uri, int i) {
        return m52480a(m52477a(contentResolver, uri, i), i);
    }

    /* renamed from: a */
    public static Bitmap m52486a(String str, int i, int i2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = m52475a(options, i, i2);
        StringBuilder sb = new StringBuilder();
        sb.append("inSampleSize:");
        sb.append(options.inSampleSize);
        C5880q.m25750a(sb.toString());
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048 A[SYNTHETIC, Splitter:B:23:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004f A[SYNTHETIC, Splitter:B:31:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0059 A[SYNTHETIC, Splitter:B:39:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0060 A[SYNTHETIC, Splitter:B:47:0x0060] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m52478a(android.content.ContentResolver r3, android.net.Uri r4, int r5, int r6) {
        /*
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            r1 = 0
            java.io.InputStream r2 = r3.openInputStream(r4)     // Catch:{ FileNotFoundException -> 0x005d, all -> 0x0056 }
            android.graphics.BitmapFactory.decodeStream(r2, r1, r0)     // Catch:{ FileNotFoundException -> 0x005e, all -> 0x0053 }
            if (r2 == 0) goto L_0x0015
            r2.close()     // Catch:{ IOException -> 0x0015 }
        L_0x0015:
            int r5 = m52475a(r0, r5, r6)
            r0.inSampleSize = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "inSampleSize:"
            r5.append(r6)
            int r6 = r0.inSampleSize
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.mrsool.utils.C5880q.m25750a(r5)
            r5 = 0
            r0.inJustDecodeBounds = r5
            java.io.InputStream r3 = r3.openInputStream(r4)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0044 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r3, r1, r0)     // Catch:{ FileNotFoundException -> 0x004d, all -> 0x0042 }
            if (r3 == 0) goto L_0x0041
            r3.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            return r4
        L_0x0042:
            r4 = move-exception
            goto L_0x0046
        L_0x0044:
            r4 = move-exception
            r3 = r1
        L_0x0046:
            if (r3 == 0) goto L_0x004b
            r3.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            throw r4
        L_0x004c:
            r3 = r1
        L_0x004d:
            if (r3 == 0) goto L_0x0052
            r3.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        L_0x0053:
            r3 = move-exception
            r1 = r2
            goto L_0x0057
        L_0x0056:
            r3 = move-exception
        L_0x0057:
            if (r1 == 0) goto L_0x005c
            r1.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            throw r3
        L_0x005d:
            r2 = r1
        L_0x005e:
            if (r2 == 0) goto L_0x0063
            r2.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.utils.C11641f.m52478a(android.content.ContentResolver, android.net.Uri, int, int):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static Bitmap m52484a(InputStream inputStream, int i, int i2) {
        throw new RuntimeException("sorry");
    }

    /* renamed from: a */
    public static int m52475a(Options options, int i, int i2) {
        int i3;
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i4 > i2 || i5 > i) {
            int round = Math.round(((float) i4) / ((float) i2));
            i3 = Math.round(((float) i5) / ((float) i));
            if (round < i3) {
                i3 = round;
            }
        } else {
            i3 = 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("inSampleSize:");
        sb.append(i3);
        C5880q.m25750a(sb.toString());
        return i3;
    }

    /* renamed from: a */
    public static Bitmap m52481a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = ((float) i2) / ((float) width);
        float f2 = ((float) i) / ((float) height);
        Matrix matrix = new Matrix();
        matrix.postScale(f, f2);
        System.gc();
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }

    /* renamed from: a */
    public static Bitmap m52480a(Bitmap bitmap, int i) {
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width >= height) {
            i2 = i;
            i = (int) (((float) width) * (((float) i) / ((float) height)));
        } else {
            i2 = (int) (((float) height) * (((float) i) / ((float) width)));
        }
        float f = ((float) i) / ((float) width);
        float f2 = ((float) i2) / ((float) height);
        Matrix matrix = new Matrix();
        matrix.postScale(f, f2);
        System.gc();
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }

    /* renamed from: a */
    public static int m52476a(String str) {
        if (str == null) {
            return -1;
        }
        try {
            Field declaredField = C10235drawable.class.getDeclaredField(str);
            return declaredField.getInt(declaredField);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return -1;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return -1;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return -1;
        }
    }

    /* renamed from: a */
    public static Bitmap m52479a(Bitmap bitmap) {
        System.gc();
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        if (height <= width) {
            return Bitmap.createBitmap(bitmap, (width - height) / 2, 0, height, height);
        }
        return Bitmap.createBitmap(bitmap, 0, (height - width) / 2, width, width);
    }

    /* renamed from: a */
    public static Bitmap m52487a(byte[] bArr) {
        return m52479a(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    /* renamed from: a */
    public static Bitmap m52483a(InputStream inputStream) {
        return m52479a(BitmapFactory.decodeStream(inputStream));
    }

    /* renamed from: a */
    public static Bitmap m52482a(Bitmap bitmap, int i, int i2, int i3) {
        Matrix matrix = new Matrix();
        matrix.preRotate((float) i);
        return Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
    }
}
