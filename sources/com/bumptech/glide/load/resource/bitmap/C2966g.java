package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;
import p076c.p082c.p083a.p084a0.C2214g;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.C2270a;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g */
/* compiled from: Downsampler */
public abstract class C2966g implements C2960a<InputStream> {

    /* renamed from: a */
    private static final String f10501a = "Downsampler";

    /* renamed from: b */
    private static final Set<ImageType> f10502b = EnumSet.of(ImageType.JPEG, ImageType.PNG_A, ImageType.PNG);

    /* renamed from: c */
    private static final Queue<Options> f10503c = C2216i.m11342a(0);

    /* renamed from: d */
    public static final C2966g f10504d = new C2967a();

    /* renamed from: e */
    public static final C2966g f10505e = new C2968b();

    /* renamed from: f */
    public static final C2966g f10506f = new C2969c();

    /* renamed from: g */
    private static final int f10507g = 5242880;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.g$a */
    /* compiled from: Downsampler */
    static class C2967a extends C2966g {
        C2967a() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Bitmap mo11759a(Object obj, C2330c cVar, int i, int i2, C2270a aVar) throws Exception {
            return C2966g.super.mo11759a((InputStream) obj, cVar, i, i2, aVar);
        }

        public String getId() {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo11763a(int i, int i2, int i3, int i4) {
            return Math.min(i2 / i4, i / i3);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.g$b */
    /* compiled from: Downsampler */
    static class C2968b extends C2966g {
        C2968b() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Bitmap mo11759a(Object obj, C2330c cVar, int i, int i2, C2270a aVar) throws Exception {
            return C2966g.super.mo11759a((InputStream) obj, cVar, i, i2, aVar);
        }

        public String getId() {
            return "AT_MOST.com.bumptech.glide.load.data.bitmap";
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo11763a(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return max << i5;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.g$c */
    /* compiled from: Downsampler */
    static class C2969c extends C2966g {
        C2969c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo11763a(int i, int i2, int i3, int i4) {
            return 0;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Bitmap mo11759a(Object obj, C2330c cVar, int i, int i2, C2270a aVar) throws Exception {
            return C2966g.super.mo11759a((InputStream) obj, cVar, i, i2, aVar);
        }

        public String getId() {
            return "NONE.com.bumptech.glide.load.data.bitmap";
        }
    }

    /* renamed from: b */
    private static Bitmap m14202b(C2214g gVar, RecyclableBufferedInputStream recyclableBufferedInputStream, Options options) {
        if (options.inJustDecodeBounds) {
            gVar.mark(f10507g);
        } else {
            recyclableBufferedInputStream.mo11750a();
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(gVar, null, options);
        try {
            if (options.inJustDecodeBounds) {
                gVar.reset();
            }
        } catch (IOException unused) {
            if (Log.isLoggable(f10501a, 6)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception loading inDecodeBounds=");
                sb.append(options.inJustDecodeBounds);
                sb.append(" sample=");
                sb.append(options.inSampleSize);
                sb.toString();
            }
        }
        return decodeStream;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo11763a(int i, int i2, int i3, int i4);

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|19|(4:21|(2:23|(1:27))|28|29)(3:30|31|32)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:11|33|34|35|36|37) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r6 = android.util.Log.isLoggable(r1, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r14.reset();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1 = android.util.Log.isLoggable(r1, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0048 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0038 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:8:0x0038=Splitter:B:8:0x0038, B:16:0x0048=Splitter:B:16:0x0048, B:35:0x00aa=Splitter:B:35:0x00aa} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo11759a(java.io.InputStream r23, p076c.p082c.p083a.p088u.p090i.p091n.C2330c r24, int r25, int r26, p076c.p082c.p083a.p088u.C2270a r27) {
        /*
            r22 = this;
            r0 = r24
            java.lang.String r1 = "Downsampler"
            c.c.a.a0.a r10 = p076c.p082c.p083a.p084a0.C2208a.m11306c()
            byte[] r11 = r10.mo9363b()
            byte[] r12 = r10.mo9363b()
            android.graphics.BitmapFactory$Options r13 = m14198a()
            com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r3 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream
            r2 = r23
            r3.<init>(r2, r12)
            c.c.a.a0.c r14 = p076c.p082c.p083a.p084a0.C2210c.m11314b(r3)
            c.c.a.a0.g r2 = new c.c.a.a0.g
            r2.<init>(r14)
            r4 = 5242880(0x500000, float:7.34684E-39)
            r14.mark(r4)     // Catch:{ all -> 0x00af }
            r4 = 0
            r5 = 5
            com.bumptech.glide.load.resource.bitmap.ImageHeaderParser r6 = new com.bumptech.glide.load.resource.bitmap.ImageHeaderParser     // Catch:{ IOException -> 0x0040 }
            r6.<init>(r14)     // Catch:{ IOException -> 0x0040 }
            int r6 = r6.mo11737a()     // Catch:{ IOException -> 0x0040 }
            r14.reset()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            boolean r1 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x00af }
        L_0x003c:
            r15 = r6
            goto L_0x004d
        L_0x003e:
            r0 = move-exception
            goto L_0x00a6
        L_0x0040:
            boolean r6 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x003e }
            r14.reset()     // Catch:{ IOException -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            boolean r1 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x00af }
        L_0x004c:
            r15 = 0
        L_0x004d:
            r13.inTempStorage = r11     // Catch:{ all -> 0x00af }
            r9 = r22
            int[] r1 = r9.mo11765a(r2, r3, r13)     // Catch:{ all -> 0x00af }
            r6 = r1[r4]     // Catch:{ all -> 0x00af }
            r4 = 1
            r7 = r1[r4]     // Catch:{ all -> 0x00af }
            int r17 = com.bumptech.glide.load.resource.bitmap.C2980q.m14240a(r15)     // Catch:{ all -> 0x00af }
            r16 = r22
            r18 = r6
            r19 = r7
            r20 = r25
            r21 = r26
            int r8 = r16.m14195a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00af }
            r1 = r22
            r4 = r13
            r5 = r24
            r9 = r27
            android.graphics.Bitmap r1 = r1.m14197a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00af }
            java.io.IOException r2 = r14.mo9368a()     // Catch:{ all -> 0x00af }
            if (r2 != 0) goto L_0x00a0
            r2 = 0
            if (r1 == 0) goto L_0x0093
            android.graphics.Bitmap r2 = com.bumptech.glide.load.resource.bitmap.C2980q.m14245a(r1, r0, r15)     // Catch:{ all -> 0x00af }
            boolean r3 = r1.equals(r2)     // Catch:{ all -> 0x00af }
            if (r3 != 0) goto L_0x0093
            boolean r0 = r0.mo9734a(r1)     // Catch:{ all -> 0x00af }
            if (r0 != 0) goto L_0x0093
            r1.recycle()     // Catch:{ all -> 0x00af }
        L_0x0093:
            r10.mo9362a(r11)
            r10.mo9362a(r12)
            r14.release()
            m14199a(r13)
            return r2
        L_0x00a0:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00af }
            r0.<init>(r2)     // Catch:{ all -> 0x00af }
            throw r0     // Catch:{ all -> 0x00af }
        L_0x00a6:
            r14.reset()     // Catch:{ IOException -> 0x00aa }
            goto L_0x00ae
        L_0x00aa:
            boolean r1 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x00af }
        L_0x00ae:
            throw r0     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            r10.mo9362a(r11)
            r10.mo9362a(r12)
            r14.release()
            m14199a(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C2966g.mo11759a(java.io.InputStream, c.c.a.u.i.n.c, int, int, c.c.a.u.a):android.graphics.Bitmap");
    }

    @TargetApi(11)
    /* renamed from: b */
    private static void m14203b(Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        if (11 <= VERSION.SDK_INT) {
            options.inBitmap = null;
            options.inMutable = true;
        }
    }

    /* renamed from: a */
    private int m14195a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (i5 == Integer.MIN_VALUE) {
            i5 = i3;
        }
        if (i4 == Integer.MIN_VALUE) {
            i4 = i2;
        }
        if (i == 90 || i == 270) {
            i6 = mo11763a(i3, i2, i4, i5);
        } else {
            i6 = mo11763a(i2, i3, i4, i5);
        }
        if (i6 == 0) {
            i7 = 0;
        } else {
            i7 = Integer.highestOneBit(i6);
        }
        return Math.max(1, i7);
    }

    /* renamed from: a */
    private Bitmap m14197a(C2214g gVar, RecyclableBufferedInputStream recyclableBufferedInputStream, Options options, C2330c cVar, int i, int i2, int i3, C2270a aVar) {
        Config a = m14196a((InputStream) gVar, aVar);
        options.inSampleSize = i3;
        options.inPreferredConfig = a;
        if ((options.inSampleSize == 1 || 19 <= VERSION.SDK_INT) && m14201a((InputStream) gVar)) {
            double d = (double) i;
            double d2 = (double) i3;
            Double.isNaN(d);
            Double.isNaN(d2);
            int ceil = (int) Math.ceil(d / d2);
            double d3 = (double) i2;
            Double.isNaN(d3);
            Double.isNaN(d2);
            m14200a(options, cVar.mo9735b(ceil, (int) Math.ceil(d3 / d2), a));
        }
        return m14202b(gVar, recyclableBufferedInputStream, options);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2 = android.util.Log.isLoggable(r0, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r4 = android.util.Log.isLoggable(r0, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.reset();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r4 = android.util.Log.isLoggable(r0, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m14201a(java.io.InputStream r4) {
        /*
            java.lang.String r0 = "Downsampler"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r2 > r1) goto L_0x000a
            r4 = 1
            return r4
        L_0x000a:
            r1 = 1024(0x400, float:1.435E-42)
            r4.mark(r1)
            r1 = 5
            com.bumptech.glide.load.resource.bitmap.ImageHeaderParser r2 = new com.bumptech.glide.load.resource.bitmap.ImageHeaderParser     // Catch:{ IOException -> 0x002a }
            r2.<init>(r4)     // Catch:{ IOException -> 0x002a }
            com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$ImageType r2 = r2.mo11738b()     // Catch:{ IOException -> 0x002a }
            java.util.Set<com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$ImageType> r3 = f10502b     // Catch:{ IOException -> 0x002a }
            boolean r2 = r3.contains(r2)     // Catch:{ IOException -> 0x002a }
            r4.reset()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            boolean r4 = android.util.Log.isLoggable(r0, r1)
        L_0x0027:
            return r2
        L_0x0028:
            r2 = move-exception
            goto L_0x0038
        L_0x002a:
            boolean r2 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0028 }
            r4.reset()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            boolean r4 = android.util.Log.isLoggable(r0, r1)
        L_0x0036:
            r4 = 0
            return r4
        L_0x0038:
            r4.reset()     // Catch:{ IOException -> 0x003c }
            goto L_0x0040
        L_0x003c:
            boolean r4 = android.util.Log.isLoggable(r0, r1)
        L_0x0040:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C2966g.m14201a(java.io.InputStream):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (android.util.Log.isLoggable(r0, 5) != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("Cannot determine whether the image has alpha or not from header for format ");
        r3.append(r6);
        r3.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r5.reset();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        r5 = android.util.Log.isLoggable(r0, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        throw r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap.Config m14196a(java.io.InputStream r5, p076c.p082c.p083a.p088u.C2270a r6) {
        /*
            java.lang.String r0 = "Downsampler"
            c.c.a.u.a r1 = p076c.p082c.p083a.p088u.C2270a.ALWAYS_ARGB_8888
            if (r6 == r1) goto L_0x0054
            c.c.a.u.a r1 = p076c.p082c.p083a.p088u.C2270a.PREFER_ARGB_8888
            if (r6 == r1) goto L_0x0054
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 != r2) goto L_0x0011
            goto L_0x0054
        L_0x0011:
            r1 = 0
            r2 = 1024(0x400, float:1.435E-42)
            r5.mark(r2)
            r2 = 5
            com.bumptech.glide.load.resource.bitmap.ImageHeaderParser r3 = new com.bumptech.glide.load.resource.bitmap.ImageHeaderParser     // Catch:{ IOException -> 0x002c }
            r3.<init>(r5)     // Catch:{ IOException -> 0x002c }
            boolean r1 = r3.mo11739c()     // Catch:{ IOException -> 0x002c }
        L_0x0021:
            r5.reset()     // Catch:{ IOException -> 0x0025 }
            goto L_0x0043
        L_0x0025:
            boolean r5 = android.util.Log.isLoggable(r0, r2)
            goto L_0x0043
        L_0x002a:
            r6 = move-exception
            goto L_0x004b
        L_0x002c:
            boolean r3 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x002a }
            if (r3 == 0) goto L_0x0021
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x002a }
            r3.<init>()     // Catch:{ all -> 0x002a }
            java.lang.String r4 = "Cannot determine whether the image has alpha or not from header for format "
            r3.append(r4)     // Catch:{ all -> 0x002a }
            r3.append(r6)     // Catch:{ all -> 0x002a }
            r3.toString()     // Catch:{ all -> 0x002a }
            goto L_0x0021
        L_0x0043:
            if (r1 == 0) goto L_0x0048
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x004a
        L_0x0048:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.RGB_565
        L_0x004a:
            return r5
        L_0x004b:
            r5.reset()     // Catch:{ IOException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            boolean r5 = android.util.Log.isLoggable(r0, r2)
        L_0x0053:
            throw r6
        L_0x0054:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C2966g.m14196a(java.io.InputStream, c.c.a.u.a):android.graphics.Bitmap$Config");
    }

    /* renamed from: a */
    public int[] mo11765a(C2214g gVar, RecyclableBufferedInputStream recyclableBufferedInputStream, Options options) {
        options.inJustDecodeBounds = true;
        m14202b(gVar, recyclableBufferedInputStream, options);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    @TargetApi(11)
    /* renamed from: a */
    private static void m14200a(Options options, Bitmap bitmap) {
        if (11 <= VERSION.SDK_INT) {
            options.inBitmap = bitmap;
        }
    }

    @TargetApi(11)
    /* renamed from: a */
    private static synchronized Options m14198a() {
        Options options;
        synchronized (C2966g.class) {
            synchronized (f10503c) {
                options = (Options) f10503c.poll();
            }
            if (options == null) {
                options = new Options();
                m14203b(options);
            }
        }
        return options;
    }

    /* renamed from: a */
    private static void m14199a(Options options) {
        m14203b(options);
        synchronized (f10503c) {
            f10503c.offer(options);
        }
    }
}
