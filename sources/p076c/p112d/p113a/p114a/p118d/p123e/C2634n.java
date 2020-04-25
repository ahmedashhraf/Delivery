package p076c.p112d.p113a.p114a.p118d.p123e;

import com.airbnb.lottie.utils.Utils;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;

/* renamed from: c.d.a.a.d.e.n */
/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
public final class C2634n {

    /* renamed from: a */
    private static final byte[] f9744a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b */
    private static final int[] f9745b = {1, 10, 100, 1000, C14236a.DEFAULT_TIMEOUT, 100000, 1000000, 10000000, 100000000, Utils.SECOND_IN_NANOS};

    /* renamed from: c */
    private static final int[] f9746c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* renamed from: d */
    private static final int[] f9747d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: e */
    private static int[] f9748e = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* renamed from: a */
    public static int m12744a(int i, int i2) {
        long j = ((long) i) << 1;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
