package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.j4 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public final class C4819j4 {

    /* renamed from: a */
    static final Charset f14218a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final Charset f14219b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f14220c;

    /* renamed from: d */
    private static final ByteBuffer f14221d;

    /* renamed from: e */
    private static final C4872m3 f14222e;

    static {
        byte[] bArr = new byte[0];
        f14220c = bArr;
        f14221d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f14220c;
        f14222e = C4872m3.m20650a(bArr2, 0, bArr2.length, false);
    }

    /* renamed from: a */
    public static int m20392a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m20393a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static <T> T m20394a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static boolean m20397a(C4945r5 r5Var) {
        return false;
    }

    /* renamed from: b */
    public static String m20399b(byte[] bArr) {
        return new String(bArr, f14218a);
    }

    /* renamed from: c */
    public static int m20400c(byte[] bArr) {
        int length = bArr.length;
        int a = m20391a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a */
    static <T> T m20396a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m20398a(byte[] bArr) {
        return C4809i7.m20370a(bArr);
    }

    /* renamed from: a */
    static int m20391a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: a */
    static Object m20395a(Object obj, Object obj2) {
        return ((C4945r5) obj).mo19047d().mo19393a((C4945r5) obj2).mo19057F();
    }
}
