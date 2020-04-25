package p076c.p082c.p083a.p084a0;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Looper;
import com.google.common.base.C5785c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: c.c.a.a0.i */
/* compiled from: Util */
public final class C2216i {

    /* renamed from: a */
    private static final char[] f8773a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f8774b = new char[64];

    /* renamed from: c */
    private static final char[] f8775c = new char[40];

    /* renamed from: c.c.a.a0.i$a */
    /* compiled from: Util */
    static /* synthetic */ class C2217a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8776a = new int[Config.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8776a = r0
                int[] r0 = f8776a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f8776a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f8776a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f8776a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p084a0.C2216i.C2217a.<clinit>():void");
        }
    }

    private C2216i() {
    }

    /* renamed from: a */
    public static String m11339a(byte[] bArr) {
        String a;
        synchronized (f8775c) {
            a = m11340a(bArr, f8775c);
        }
        return a;
    }

    /* renamed from: b */
    public static String m11346b(byte[] bArr) {
        String a;
        synchronized (f8774b) {
            a = m11340a(bArr, f8774b);
        }
        return a;
    }

    /* renamed from: b */
    private static boolean m11348b(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: c */
    public static boolean m11349c() {
        return !m11350d();
    }

    /* renamed from: d */
    public static boolean m11350d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    private static String m11340a(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f8773a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & C5785c.f16698q];
        }
        return new String(cArr);
    }

    @Deprecated
    /* renamed from: b */
    public static int m11345b(Bitmap bitmap) {
        return m11338a(bitmap);
    }

    /* renamed from: b */
    public static void m11347b() {
        if (!m11350d()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public static int m11338a(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
            }
        }
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    /* renamed from: a */
    public static int m11336a(int i, int i2, Config config) {
        return i * i2 * m11337a(config);
    }

    /* renamed from: a */
    private static int m11337a(Config config) {
        if (config == null) {
            config = Config.ARGB_8888;
        }
        int i = C2217a.f8776a[config.ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3) ? 2 : 4;
        }
        return 1;
    }

    /* renamed from: a */
    public static boolean m11344a(int i, int i2) {
        return m11348b(i) && m11348b(i2);
    }

    /* renamed from: a */
    public static void m11343a() {
        if (!m11349c()) {
            throw new IllegalArgumentException("YOu must call this method on a background thread");
        }
    }

    /* renamed from: a */
    public static <T> Queue<T> m11342a(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: a */
    public static <T> List<T> m11341a(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T add : collection) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
