package p076c.p112d.p148d.p150g;

import com.facebook.appevents.AppEventsConstants;
import com.google.common.base.C7397x;
import java.math.BigInteger;
import java.util.Comparator;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
@C2775a
/* renamed from: c.d.d.g.p */
/* compiled from: UnsignedLongs */
public final class C6660p {

    /* renamed from: a */
    public static final long f18634a = -1;

    /* renamed from: b */
    private static final long[] f18635b = new long[37];

    /* renamed from: c */
    private static final int[] f18636c = new int[37];

    /* renamed from: d */
    private static final int[] f18637d = new int[37];

    /* renamed from: c.d.d.g.p$a */
    /* compiled from: UnsignedLongs */
    enum C6661a implements Comparator<long[]> {
        INSTANCE;

        /* renamed from: a */
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < min; i++) {
                if (jArr[i] != jArr2[i]) {
                    return C6660p.m31800a(jArr[i], jArr2[i]);
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    static {
        BigInteger bigInteger = new BigInteger("10000000000000000", 16);
        for (int i = 2; i <= 36; i++) {
            long j = (long) i;
            f18635b[i] = m31809b(-1, j);
            f18636c[i] = (int) m31813c(-1, j);
            f18637d[i] = bigInteger.toString(i).length() - 1;
        }
    }

    private C6660p() {
    }

    /* renamed from: a */
    public static int m31800a(long j, long j2) {
        return C6641g.m31691a(m31801a(j), m31801a(j2));
    }

    /* renamed from: a */
    private static long m31801a(long j) {
        return j ^ Long.MIN_VALUE;
    }

    /* renamed from: b */
    public static long m31811b(long... jArr) {
        C7397x.m35670a(jArr.length > 0);
        long a = m31801a(jArr[0]);
        for (int i = 1; i < jArr.length; i++) {
            long a2 = m31801a(jArr[i]);
            if (a2 < a) {
                a = a2;
            }
        }
        return m31801a(a);
    }

    /* renamed from: c */
    public static long m31813c(long j, long j2) {
        if (j2 < 0) {
            return m31800a(j, j2) < 0 ? j : j - j2;
        }
        if (j >= 0) {
            return j % j2;
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (m31800a(j3, j2) < 0) {
            j2 = 0;
        }
        return j3 - j2;
    }

    /* renamed from: a */
    public static long m31804a(long... jArr) {
        C7397x.m35670a(jArr.length > 0);
        long a = m31801a(jArr[0]);
        for (int i = 1; i < jArr.length; i++) {
            long a2 = m31801a(jArr[i]);
            if (a2 > a) {
                a = a2;
            }
        }
        return m31801a(a);
    }

    /* renamed from: b */
    public static long m31809b(long j, long j2) {
        if (j2 < 0) {
            return m31800a(j, j2) < 0 ? 0 : 1;
        }
        if (j >= 0) {
            return j / j2;
        }
        int i = 1;
        long j3 = ((j >>> 1) / j2) << 1;
        if (m31800a(j - (j3 * j2), j2) < 0) {
            i = 0;
        }
        return j3 + ((long) i);
    }

    /* renamed from: a */
    public static String m31806a(String str, long... jArr) {
        C7397x.m35664a(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(jArr.length * 5);
        sb.append(m31812b(jArr[0]));
        for (int i = 1; i < jArr.length; i++) {
            sb.append(str);
            sb.append(m31812b(jArr[i]));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static long m31810b(String str) {
        return m31803a(str, 10);
    }

    /* renamed from: b */
    public static String m31812b(long j) {
        return m31805a(j, 10);
    }

    /* renamed from: a */
    public static Comparator<long[]> m31807a() {
        return C6661a.INSTANCE;
    }

    /* renamed from: a */
    public static long m31802a(String str) {
        C6645h a = C6645h.m31721a(str);
        try {
            return m31803a(a.f18617a, a.f18618b);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error parsing value: ");
            sb.append(str);
            NumberFormatException numberFormatException = new NumberFormatException(sb.toString());
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    /* renamed from: a */
    public static long m31803a(String str, int i) {
        C7397x.m35664a(str);
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        } else if (i < 2 || i > 36) {
            StringBuilder sb = new StringBuilder();
            sb.append("illegal radix: ");
            sb.append(i);
            throw new NumberFormatException(sb.toString());
        } else {
            int i2 = f18637d[i] - 1;
            long j = 0;
            int i3 = 0;
            while (i3 < str.length()) {
                int digit = Character.digit(str.charAt(i3), i);
                if (digit == -1) {
                    throw new NumberFormatException(str);
                } else if (i3 <= i2 || !m31808a(j, digit, i)) {
                    j = (j * ((long) i)) + ((long) digit);
                    i3++;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Too large for unsigned long: ");
                    sb2.append(str);
                    throw new NumberFormatException(sb2.toString());
                }
            }
            return j;
        }
    }

    /* renamed from: a */
    private static boolean m31808a(long j, int i, int i2) {
        boolean z = true;
        if (j >= 0) {
            long[] jArr = f18635b;
            if (j < jArr[i2]) {
                return false;
            }
            if (j > jArr[i2]) {
                return true;
            }
            if (i <= f18636c[i2]) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static String m31805a(long j, int i) {
        C7397x.m35672a(i >= 2 && i <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", Integer.valueOf(i));
        if (j == 0) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        char[] cArr = new char[64];
        int length = cArr.length;
        if (j < 0) {
            long j2 = (long) i;
            long b = m31809b(j, j2);
            length--;
            cArr[length] = Character.forDigit((int) (j - (j2 * b)), i);
            j = b;
        }
        while (j > 0) {
            length--;
            long j3 = (long) i;
            cArr[length] = Character.forDigit((int) (j % j3), i);
            j /= j3;
        }
        return new String(cArr, length, cArr.length - length);
    }
}
