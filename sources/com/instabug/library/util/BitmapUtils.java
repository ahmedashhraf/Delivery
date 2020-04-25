package com.instabug.library.util;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore.Images.Media;
import android.widget.ImageView;
import androidx.annotation.C0193h0;
import com.instabug.library.Instabug;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.util.BitmapWorkerTask.OnImageLoadedListener;
import com.instabug.library.util.threading.PoolProvider;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

public class BitmapUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    public interface OnSaveBitmapCallback {
        void onError(Throwable th);

        void onSuccess(Uri uri);
    }

    /* renamed from: com.instabug.library.util.BitmapUtils$a */
    static class C10011a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26634b;

        /* renamed from: a */
        final /* synthetic */ File f26635a;

        C10011a(File file) {
            boolean[] a = m46612a();
            this.f26635a = file;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46612a() {
            boolean[] zArr = f26634b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4198202421619062554L, "com/instabug/library/util/BitmapUtils$1", 17);
            f26634b = a;
            return a;
        }

        public void run() {
            boolean[] a = m46612a();
            try {
                Options options = new Options();
                options.inJustDecodeBounds = true;
                a[1] = true;
                BitmapFactory.decodeStream(new FileInputStream(this.f26635a), null, options);
                a[2] = true;
                int i = 1;
                while (true) {
                    if ((options.outWidth / i) / 2 < 900) {
                        a[3] = true;
                        break;
                    } else if ((options.outHeight / i) / 2 < 900) {
                        a[4] = true;
                        break;
                    } else {
                        i *= 2;
                        a[5] = true;
                    }
                }
                Options options2 = new Options();
                options2.inSampleSize = i;
                a[6] = true;
                Bitmap decodeStream = BitmapFactory.decodeStream(new FileInputStream(this.f26635a), null, options2);
                a[7] = true;
                FileOutputStream fileOutputStream = new FileOutputStream(this.f26635a);
                a[8] = true;
                decodeStream.compress(BitmapUtils.access$000(this.f26635a), 100, fileOutputStream);
                a[9] = true;
                decodeStream.recycle();
                a[10] = true;
            } catch (FileNotFoundException e) {
                a[11] = true;
                e.printStackTrace();
                a[12] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("compressBitmapAndSave bitmap doesn't compressed correctly ");
                a[13] = true;
                sb.append(e.getMessage());
                String sb2 = sb.toString();
                a[14] = true;
                InstabugSDKLogger.m46623e(BitmapUtils.class, sb2);
                a[15] = true;
            }
            a[16] = true;
        }
    }

    /* renamed from: com.instabug.library.util.BitmapUtils$b */
    static class C10012b implements Runnable {

        /* renamed from: Q */
        private static transient /* synthetic */ boolean[] f26636Q;

        /* renamed from: N */
        final /* synthetic */ Bitmap f26637N;

        /* renamed from: O */
        final /* synthetic */ int f26638O;

        /* renamed from: P */
        final /* synthetic */ OnSaveBitmapCallback f26639P;

        /* renamed from: a */
        final /* synthetic */ File f26640a;

        /* renamed from: b */
        final /* synthetic */ String f26641b;

        C10012b(File file, String str, Bitmap bitmap, int i, OnSaveBitmapCallback onSaveBitmapCallback) {
            boolean[] a = m46613a();
            this.f26640a = file;
            this.f26641b = str;
            this.f26637N = bitmap;
            this.f26638O = i;
            this.f26639P = onSaveBitmapCallback;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46613a() {
            boolean[] zArr = f26636Q;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6595334509421572323L, "com/instabug/library/util/BitmapUtils$2", 14);
            f26636Q = a;
            return a;
        }

        public void run() {
            boolean[] a = m46613a();
            File file = this.f26640a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f26641b);
            sb.append(C14282d.ROLL_OVER_FILE_NAME_SEPARATOR);
            a[1] = true;
            sb.append(System.currentTimeMillis());
            sb.append(".png");
            File file2 = new File(file, sb.toString());
            a[2] = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("image path: ");
            sb2.append(file2.toString());
            InstabugSDKLogger.m46626v(AttachmentsUtility.class, sb2.toString());
            try {
                a[3] = true;
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                a[4] = true;
                this.f26637N.compress(CompressFormat.PNG, this.f26638O, bufferedOutputStream);
                a[5] = true;
                bufferedOutputStream.close();
                a[6] = true;
                Uri fromFile = Uri.fromFile(file2);
                if (fromFile != null) {
                    a[7] = true;
                    this.f26639P.onSuccess(fromFile);
                    a[8] = true;
                } else {
                    this.f26639P.onError(new Throwable("Uri equal null"));
                    a[9] = true;
                }
                a[10] = true;
            } catch (IOException e) {
                a[11] = true;
                this.f26639P.onError(e);
                a[12] = true;
            }
            a[13] = true;
        }
    }

    /* renamed from: com.instabug.library.util.BitmapUtils$c */
    static class C10013c implements Runnable {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f26642O;

        /* renamed from: N */
        final /* synthetic */ OnSaveBitmapCallback f26643N;

        /* renamed from: a */
        final /* synthetic */ Context f26644a;

        /* renamed from: b */
        final /* synthetic */ Bitmap f26645b;

        /* renamed from: com.instabug.library.util.BitmapUtils$c$a */
        class C10014a implements Runnable {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f26646N;

            /* renamed from: a */
            final /* synthetic */ Uri f26647a;

            /* renamed from: b */
            final /* synthetic */ C10013c f26648b;

            C10014a(C10013c cVar, Uri uri) {
                boolean[] a = m46615a();
                this.f26648b = cVar;
                this.f26647a = uri;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m46615a() {
                boolean[] zArr = f26646N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(6025301682287988073L, "com/instabug/library/util/BitmapUtils$3$1", 5);
                f26646N = a;
                return a;
            }

            public void run() {
                boolean[] a = m46615a();
                Uri uri = this.f26647a;
                if (uri != null) {
                    a[1] = true;
                    this.f26648b.f26643N.onSuccess(uri);
                    a[2] = true;
                } else {
                    this.f26648b.f26643N.onError(new Throwable("Uri equal null"));
                    a[3] = true;
                }
                a[4] = true;
            }
        }

        C10013c(Context context, Bitmap bitmap, OnSaveBitmapCallback onSaveBitmapCallback) {
            boolean[] a = m46614a();
            this.f26644a = context;
            this.f26645b = bitmap;
            this.f26643N = onSaveBitmapCallback;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46614a() {
            boolean[] zArr = f26642O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3036309383542844475L, "com/instabug/library/util/BitmapUtils$3", 13);
            f26642O = a;
            return a;
        }

        public void run() {
            boolean[] a = m46614a();
            File instabugDirectory = DiskUtils.getInstabugDirectory(this.f26644a);
            a[1] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("bug_");
            sb.append(System.currentTimeMillis());
            sb.append("_.jpg");
            File file = new File(instabugDirectory, sb.toString());
            a[2] = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("image path: ");
            sb2.append(file.toString());
            InstabugSDKLogger.m46626v(AttachmentsUtility.class, sb2.toString());
            try {
                a[3] = true;
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                a[4] = true;
                this.f26645b.compress(CompressFormat.JPEG, 100, bufferedOutputStream);
                a[5] = true;
                bufferedOutputStream.close();
                a[6] = true;
                Uri fromFile = Uri.fromFile(file);
                a[7] = true;
                Handler handler = new Handler(Looper.getMainLooper());
                a[8] = true;
                handler.post(new C10014a(this, fromFile));
                a[9] = true;
            } catch (IOException e) {
                a[10] = true;
                this.f26643N.onError(e);
                a[11] = true;
            }
            a[12] = true;
        }
    }

    /* renamed from: com.instabug.library.util.BitmapUtils$d */
    static class C10015d implements Runnable {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f26649P;

        /* renamed from: N */
        final /* synthetic */ Uri f26650N;

        /* renamed from: O */
        final /* synthetic */ OnSaveBitmapCallback f26651O;

        /* renamed from: a */
        final /* synthetic */ Bitmap f26652a;

        /* renamed from: b */
        final /* synthetic */ Context f26653b;

        /* renamed from: com.instabug.library.util.BitmapUtils$d$a */
        class C10016a implements Runnable {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f26654N;

            /* renamed from: a */
            final /* synthetic */ boolean f26655a;

            /* renamed from: b */
            final /* synthetic */ C10015d f26656b;

            C10016a(C10015d dVar, boolean z) {
                boolean[] a = m46617a();
                this.f26656b = dVar;
                this.f26655a = z;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m46617a() {
                boolean[] zArr = f26654N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-6729810254224116853L, "com/instabug/library/util/BitmapUtils$4$1", 6);
                f26654N = a;
                return a;
            }

            public void run() {
                boolean[] a = m46617a();
                if (!this.f26655a) {
                    a[1] = true;
                } else {
                    OnSaveBitmapCallback onSaveBitmapCallback = this.f26656b.f26651O;
                    if (onSaveBitmapCallback == null) {
                        a[2] = true;
                    } else {
                        a[3] = true;
                        onSaveBitmapCallback.onSuccess(null);
                        a[4] = true;
                    }
                }
                a[5] = true;
            }
        }

        C10015d(Bitmap bitmap, Context context, Uri uri, OnSaveBitmapCallback onSaveBitmapCallback) {
            boolean[] a = m46616a();
            this.f26652a = bitmap;
            this.f26653b = context;
            this.f26650N = uri;
            this.f26651O = onSaveBitmapCallback;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46616a() {
            boolean[] zArr = f26649P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3904916537628595753L, "com/instabug/library/util/BitmapUtils$4", 10);
            f26649P = a;
            return a;
        }

        public void run() {
            boolean[] a = m46616a();
            try {
                Bitmap bitmap = this.f26652a;
                CompressFormat compressFormat = CompressFormat.PNG;
                Context context = this.f26653b;
                a[1] = true;
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = this.f26650N;
                a[2] = true;
                OutputStream openOutputStream = contentResolver.openOutputStream(Uri.fromFile(new File(uri.getPath())));
                a[3] = true;
                boolean compress = bitmap.compress(compressFormat, 100, openOutputStream);
                a[4] = true;
                Handler handler = new Handler(Looper.getMainLooper());
                a[5] = true;
                handler.post(new C10016a(this, compress));
                a[6] = true;
            } catch (FileNotFoundException e) {
                a[7] = true;
                InstabugSDKLogger.m46624e(BitmapUtils.class, e.getMessage(), e);
                a[8] = true;
            }
            a[9] = true;
        }
    }

    /* renamed from: com.instabug.library.util.BitmapUtils$e */
    static class C10017e implements Runnable {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f26657O;

        /* renamed from: N */
        final /* synthetic */ OnSaveBitmapCallback f26658N;

        /* renamed from: a */
        final /* synthetic */ File f26659a;

        /* renamed from: b */
        final /* synthetic */ Bitmap f26660b;

        C10017e(File file, Bitmap bitmap, OnSaveBitmapCallback onSaveBitmapCallback) {
            boolean[] a = m46618a();
            this.f26659a = file;
            this.f26660b = bitmap;
            this.f26658N = onSaveBitmapCallback;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46618a() {
            boolean[] zArr = f26657O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7937910990891742948L, "com/instabug/library/util/BitmapUtils$5", 22);
            f26657O = a;
            return a;
        }

        public void run() {
            int i;
            boolean[] a = m46618a();
            File file = this.f26659a;
            StringBuilder sb = new StringBuilder();
            sb.append("frame_");
            sb.append(System.currentTimeMillis());
            sb.append("_.jpg");
            File file2 = new File(file, sb.toString());
            a[1] = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("video frame path: ");
            a[2] = true;
            sb2.append(file2.toString());
            String sb3 = sb2.toString();
            a[3] = true;
            InstabugSDKLogger.m46626v(AttachmentsUtility.class, sb3);
            try {
                a[4] = true;
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                a[5] = true;
                if (this.f26660b.getWidth() > this.f26660b.getHeight()) {
                    i = this.f26660b.getWidth();
                    a[6] = true;
                } else {
                    Bitmap bitmap = this.f26660b;
                    a[7] = true;
                    i = bitmap.getHeight();
                    a[8] = true;
                }
                if (i > 640) {
                    a[9] = true;
                    Bitmap access$100 = BitmapUtils.access$100(this.f26660b, 640);
                    a[10] = true;
                    access$100.compress(CompressFormat.JPEG, 90, bufferedOutputStream);
                    a[11] = true;
                } else {
                    Bitmap access$1002 = BitmapUtils.access$100(this.f26660b, 320);
                    a[12] = true;
                    access$1002.compress(CompressFormat.JPEG, 90, bufferedOutputStream);
                    a[13] = true;
                }
                bufferedOutputStream.close();
                a[14] = true;
                Uri fromFile = Uri.fromFile(file2);
                if (fromFile != null) {
                    a[15] = true;
                    this.f26658N.onSuccess(fromFile);
                    a[16] = true;
                } else {
                    this.f26658N.onError(new Throwable("Uri equal null"));
                    a[17] = true;
                }
                a[18] = true;
            } catch (IOException e) {
                a[19] = true;
                this.f26658N.onError(e);
                a[20] = true;
            }
            a[21] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1568811488706630482L, "com/instabug/library/util/BitmapUtils", 71);
        $jacocoData = a;
        return a;
    }

    public BitmapUtils() {
        $jacocoInit()[0] = true;
    }

    static /* synthetic */ CompressFormat access$000(File file) {
        boolean[] $jacocoInit = $jacocoInit();
        CompressFormat imageMimeType = getImageMimeType(file);
        $jacocoInit[69] = true;
        return imageMimeType;
    }

    static /* synthetic */ Bitmap access$100(Bitmap bitmap, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        Bitmap resizeBitmap = resizeBitmap(bitmap, i);
        $jacocoInit[70] = true;
        return resizeBitmap;
    }

    public static int calculateInSampleSize(Options options) {
        int i;
        boolean[] $jacocoInit = $jacocoInit();
        int i2 = options.outHeight;
        int i3 = options.outWidth;
        if (i2 > 500) {
            $jacocoInit[32] = true;
        } else if (i3 <= 500) {
            $jacocoInit[33] = true;
            i = 1;
            $jacocoInit[39] = true;
            return i;
        } else {
            $jacocoInit[34] = true;
        }
        int i4 = i2 / 2;
        int i5 = i3 / 2;
        $jacocoInit[35] = true;
        i = 1;
        while (true) {
            if (i4 / i < 500) {
                $jacocoInit[36] = true;
                break;
            } else if (i5 / i < 500) {
                $jacocoInit[37] = true;
                break;
            } else {
                i *= 2;
                $jacocoInit[38] = true;
            }
        }
        $jacocoInit[39] = true;
        return i;
    }

    public static void compressBitmapAndSave(@C0193h0 File file) {
        boolean[] $jacocoInit = $jacocoInit();
        PoolProvider.postBitmapTask(new C10011a(file));
        $jacocoInit[23] = true;
    }

    public static Bitmap decodeSampledBitmapFromLocalPath(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        Options options = new Options();
        options.inJustDecodeBounds = true;
        $jacocoInit[40] = true;
        BitmapFactory.decodeFile(str, options);
        $jacocoInit[41] = true;
        options.inSampleSize = calculateInSampleSize(options);
        options.inJustDecodeBounds = false;
        $jacocoInit[42] = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        $jacocoInit[43] = true;
        return decodeFile;
    }

    public static Bitmap getBitmapFromFilePath(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        Uri fromFile = Uri.fromFile(new File(str));
        $jacocoInit[11] = true;
        Bitmap bitmapFromUri = getBitmapFromUri(fromFile);
        $jacocoInit[12] = true;
        return bitmapFromUri;
    }

    public static Bitmap getBitmapFromUri(@C0193h0 Uri uri) {
        Bitmap bitmap;
        boolean[] $jacocoInit = $jacocoInit();
        try {
            $jacocoInit[13] = true;
            Context applicationContext = Instabug.getApplicationContext();
            $jacocoInit[14] = true;
            ContentResolver contentResolver = applicationContext.getContentResolver();
            $jacocoInit[15] = true;
            bitmap = Media.getBitmap(contentResolver, uri);
            $jacocoInit[16] = true;
        } catch (IOException e) {
            $jacocoInit[17] = true;
            e.printStackTrace();
            $jacocoInit[18] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("getBitmapFromFilePath returns null because of ");
            $jacocoInit[19] = true;
            sb.append(e.getMessage());
            String sb2 = sb.toString();
            $jacocoInit[20] = true;
            InstabugSDKLogger.m46623e(BitmapUtils.class, sb2);
            $jacocoInit[21] = true;
            bitmap = null;
        }
        $jacocoInit[22] = true;
        return bitmap;
    }

    private static CompressFormat getImageMimeType(File file) {
        boolean[] $jacocoInit = $jacocoInit();
        if (file.getName().contains("png")) {
            CompressFormat compressFormat = CompressFormat.PNG;
            $jacocoInit[24] = true;
            return compressFormat;
        }
        CompressFormat compressFormat2 = CompressFormat.JPEG;
        $jacocoInit[25] = true;
        return compressFormat2;
    }

    public static int getInMemoryByteSizeOfBitmap(Bitmap bitmap) {
        boolean[] $jacocoInit = $jacocoInit();
        if (bitmap == null) {
            $jacocoInit[1] = true;
            return 0;
        }
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            $jacocoInit[2] = true;
            int allocationByteCount = bitmap.getAllocationByteCount();
            $jacocoInit[3] = true;
            return allocationByteCount;
        } else if (i >= 12) {
            $jacocoInit[4] = true;
            int byteCount = bitmap.getByteCount();
            $jacocoInit[5] = true;
            return byteCount;
        } else {
            int rowBytes = bitmap.getRowBytes() * bitmap.getHeight();
            $jacocoInit[6] = true;
            return rowBytes;
        }
    }

    public static int getOnDiskByteSizeOfBitmap(Bitmap bitmap) {
        boolean[] $jacocoInit = $jacocoInit();
        if (bitmap == null) {
            $jacocoInit[7] = true;
            return 0;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        $jacocoInit[8] = true;
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        $jacocoInit[9] = true;
        int length = byteArrayOutputStream.toByteArray().length;
        $jacocoInit[10] = true;
        return length;
    }

    public static void loadBitmap(String str, ImageView imageView) {
        boolean[] $jacocoInit = $jacocoInit();
        BitmapWorkerTask bitmapWorkerTask = new BitmapWorkerTask(imageView);
        $jacocoInit[26] = true;
        bitmapWorkerTask.execute(new String[]{str});
        $jacocoInit[27] = true;
    }

    public static Bitmap resizeBitmap(Bitmap bitmap, float f, float f2) {
        boolean[] $jacocoInit = $jacocoInit();
        if (bitmap == null) {
            $jacocoInit[44] = true;
            return null;
        }
        if (f != 0.0f) {
            $jacocoInit[45] = true;
        } else if (f2 != 0.0f) {
            $jacocoInit[46] = true;
        } else {
            $jacocoInit[47] = true;
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap((int) f, (int) f2, Config.ARGB_8888);
        $jacocoInit[48] = true;
        if (bitmap.getWidth() >= bitmap.getHeight()) {
            $jacocoInit[49] = true;
        } else if (f <= f2) {
            $jacocoInit[50] = true;
        } else {
            $jacocoInit[51] = true;
            return bitmap;
        }
        if (bitmap.getWidth() <= bitmap.getHeight()) {
            $jacocoInit[52] = true;
        } else if (f >= f2) {
            $jacocoInit[53] = true;
        } else {
            $jacocoInit[54] = true;
            return bitmap;
        }
        Canvas canvas = new Canvas(createBitmap);
        $jacocoInit[55] = true;
        Matrix matrix = new Matrix();
        $jacocoInit[56] = true;
        if (bitmap.getWidth() < bitmap.getHeight()) {
            $jacocoInit[57] = true;
            matrix.setScale(f / ((float) bitmap.getWidth()), f2 / ((float) bitmap.getHeight()));
            $jacocoInit[58] = true;
        } else {
            matrix.setScale(f2 / ((float) bitmap.getHeight()), f / ((float) bitmap.getWidth()));
            $jacocoInit[59] = true;
        }
        canvas.drawBitmap(bitmap, matrix, new Paint());
        $jacocoInit[60] = true;
        return createBitmap;
    }

    public static void saveBitmap(Bitmap bitmap, Context context, OnSaveBitmapCallback onSaveBitmapCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        PoolProvider.postBitmapTask(new C10013c(context, bitmap, onSaveBitmapCallback));
        $jacocoInit[66] = true;
    }

    public static void saveBitmapAsPNG(Bitmap bitmap, int i, File file, String str, OnSaveBitmapCallback onSaveBitmapCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        C10012b bVar = new C10012b(file, str, bitmap, i, onSaveBitmapCallback);
        PoolProvider.postBitmapTask(bVar);
        $jacocoInit[65] = true;
    }

    public static void saveBitmap(Bitmap bitmap, Uri uri, Context context, OnSaveBitmapCallback onSaveBitmapCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        PoolProvider.postBitmapTask(new C10015d(bitmap, context, uri, onSaveBitmapCallback));
        $jacocoInit[67] = true;
    }

    public static void loadBitmap(String str, ImageView imageView, float f, float f2) {
        boolean[] $jacocoInit = $jacocoInit();
        BitmapWorkerTask bitmapWorkerTask = new BitmapWorkerTask(imageView, f, f2);
        $jacocoInit[28] = true;
        bitmapWorkerTask.execute(new String[]{str});
        $jacocoInit[29] = true;
    }

    public static void saveBitmap(Bitmap bitmap, File file, OnSaveBitmapCallback onSaveBitmapCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        PoolProvider.postBitmapTask(new C10017e(file, bitmap, onSaveBitmapCallback));
        $jacocoInit[68] = true;
    }

    public static void loadBitmap(String str, ImageView imageView, OnImageLoadedListener onImageLoadedListener) {
        boolean[] $jacocoInit = $jacocoInit();
        BitmapWorkerTask bitmapWorkerTask = new BitmapWorkerTask(imageView, onImageLoadedListener);
        $jacocoInit[30] = true;
        bitmapWorkerTask.execute(new String[]{str});
        $jacocoInit[31] = true;
    }

    private static Bitmap resizeBitmap(Bitmap bitmap, int i) {
        int i2;
        boolean[] $jacocoInit = $jacocoInit();
        int width = bitmap.getWidth();
        $jacocoInit[61] = true;
        if (bitmap.getHeight() > width) {
            int i3 = i / 2;
            $jacocoInit[62] = true;
            int i4 = i3;
            i2 = i;
            i = i4;
        } else {
            i2 = i / 2;
            $jacocoInit[63] = true;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, false);
        $jacocoInit[64] = true;
        return createScaledBitmap;
    }
}
