package com.fasterxml.jackson.core.p158s;

import com.facebook.appevents.AppEventsConstants;
import p053b.p063d.p064b.C2108a;

/* renamed from: com.fasterxml.jackson.core.s.i */
/* compiled from: NumberOutput */
public final class C3824i {

    /* renamed from: a */
    private static final char f12023a = '\u0000';

    /* renamed from: b */
    private static int f12024b = 1000000;

    /* renamed from: c */
    private static int f12025c = 1000000000;

    /* renamed from: d */
    private static long f12026d = 10000000000L;

    /* renamed from: e */
    private static long f12027e = 1000;

    /* renamed from: f */
    private static long f12028f = -2147483648L;

    /* renamed from: g */
    private static long f12029g = 2147483647L;

    /* renamed from: h */
    static final String f12030h = String.valueOf(Long.MIN_VALUE);

    /* renamed from: i */
    static final char[] f12031i = new char[4000];

    /* renamed from: j */
    static final char[] f12032j = new char[4000];

    /* renamed from: k */
    static final byte[] f12033k = new byte[4000];

    /* renamed from: l */
    static final String[] f12034l = {AppEventsConstants.EVENT_PARAM_VALUE_NO, "1", "2", C2108a.f8151T4, "4", "5", "6", "7", "8", "9", "10"};

    /* renamed from: m */
    static final String[] f12035m = {"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};

    static {
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            char c = (char) (i + 48);
            char c2 = i == 0 ? 0 : c;
            int i3 = i2;
            int i4 = 0;
            while (i4 < 10) {
                char c3 = (char) (i4 + 48);
                char c4 = (i == 0 && i4 == 0) ? 0 : c3;
                int i5 = i3;
                for (int i6 = 0; i6 < 10; i6++) {
                    char c5 = (char) (i6 + 48);
                    char[] cArr = f12031i;
                    cArr[i5] = c2;
                    int i7 = i5 + 1;
                    cArr[i7] = c4;
                    int i8 = i5 + 2;
                    cArr[i8] = c5;
                    char[] cArr2 = f12032j;
                    cArr2[i5] = c;
                    cArr2[i7] = c3;
                    cArr2[i8] = c5;
                    i5 += 4;
                }
                i4++;
                i3 = i5;
            }
            i++;
            i2 = i3;
        }
        for (int i9 = 0; i9 < 4000; i9++) {
            f12033k[i9] = (byte) f12032j[i9];
        }
    }

    /* renamed from: a */
    public static int m16315a(long j, char[] cArr, int i) {
        if (j < 0) {
            if (j > f12028f) {
                return m16319b((int) j, cArr, i);
            }
            if (j == Long.MIN_VALUE) {
                int length = f12030h.length();
                f12030h.getChars(0, length, cArr, i);
                return i + length;
            }
            int i2 = i + 1;
            cArr[i] = '-';
            j = -j;
            i = i2;
        } else if (j <= f12029g) {
            return m16319b((int) j, cArr, i);
        }
        int a = m16313a(j) + i;
        int i3 = a;
        while (j > f12029g) {
            i3 -= 3;
            long j2 = f12027e;
            long j3 = j / j2;
            m16312a((int) (j - (j2 * j3)), cArr, i3);
            j = j3;
        }
        int i4 = (int) j;
        while (i4 >= 1000) {
            i3 -= 3;
            int i5 = i4 / 1000;
            m16312a(i4 - (i5 * 1000), cArr, i3);
            i4 = i5;
        }
        m16322c(i4, cArr, i);
        return a;
    }

    /* renamed from: b */
    public static int m16319b(int i, char[] cArr, int i2) {
        int i3;
        int i4;
        int i5;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return m16315a((long) i, cArr, i2);
            }
            int i6 = i2 + 1;
            cArr[i2] = '-';
            i = -i;
            i2 = i6;
        }
        if (i < f12024b) {
            if (i >= 1000) {
                int i7 = i / 1000;
                i5 = m16312a(i - (i7 * 1000), cArr, m16322c(i7, cArr, i2));
            } else if (i < 10) {
                i5 = i2 + 1;
                cArr[i2] = (char) (i + 48);
            } else {
                i5 = m16322c(i, cArr, i2);
            }
            return i5;
        }
        boolean z = i >= f12025c;
        if (z) {
            int i8 = f12025c;
            i -= i8;
            if (i >= i8) {
                i -= i8;
                i3 = i2 + 1;
                cArr[i2] = '2';
            } else {
                i3 = i2 + 1;
                cArr[i2] = '1';
            }
        } else {
            i3 = i2;
        }
        int i9 = i / 1000;
        int i10 = i - (i9 * 1000);
        int i11 = i9 / 1000;
        int i12 = i9 - (i11 * 1000);
        if (z) {
            i4 = m16312a(i11, cArr, i3);
        } else {
            i4 = m16322c(i11, cArr, i3);
        }
        return m16312a(i10, cArr, m16312a(i12, cArr, i4));
    }

    /* renamed from: c */
    private static int m16322c(int i, char[] cArr, int i2) {
        int i3 = i << 2;
        int i4 = i3 + 1;
        char c = f12031i[i3];
        if (c != 0) {
            int i5 = i2 + 1;
            cArr[i2] = c;
            i2 = i5;
        }
        int i6 = i4 + 1;
        char c2 = f12031i[i4];
        if (c2 != 0) {
            int i7 = i2 + 1;
            cArr[i2] = c2;
            i2 = i7;
        }
        int i8 = i2 + 1;
        cArr[i2] = f12031i[i6];
        return i8;
    }

    /* renamed from: c */
    private static int m16321c(int i, byte[] bArr, int i2) {
        int i3 = i << 2;
        int i4 = i3 + 1;
        char c = f12031i[i3];
        if (c != 0) {
            int i5 = i2 + 1;
            bArr[i2] = (byte) c;
            i2 = i5;
        }
        int i6 = i4 + 1;
        char c2 = f12031i[i4];
        if (c2 != 0) {
            int i7 = i2 + 1;
            bArr[i2] = (byte) c2;
            i2 = i7;
        }
        int i8 = i2 + 1;
        bArr[i2] = (byte) f12031i[i6];
        return i8;
    }

    /* renamed from: a */
    public static int m16314a(long j, byte[] bArr, int i) {
        if (j < 0) {
            if (j > f12028f) {
                return m16318b((int) j, bArr, i);
            }
            if (j == Long.MIN_VALUE) {
                int length = f12030h.length();
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    bArr[i] = (byte) f12030h.charAt(i2);
                    i2++;
                    i = i3;
                }
                return i;
            }
            int i4 = i + 1;
            bArr[i] = 45;
            j = -j;
            i = i4;
        } else if (j <= f12029g) {
            return m16318b((int) j, bArr, i);
        }
        int a = m16313a(j) + i;
        int i5 = a;
        while (j > f12029g) {
            i5 -= 3;
            long j2 = f12027e;
            long j3 = j / j2;
            m16311a((int) (j - (j2 * j3)), bArr, i5);
            j = j3;
        }
        int i6 = (int) j;
        while (i6 >= 1000) {
            i5 -= 3;
            int i7 = i6 / 1000;
            m16311a(i6 - (i7 * 1000), bArr, i5);
            i6 = i7;
        }
        m16321c(i6, bArr, i);
        return a;
    }

    /* renamed from: b */
    public static int m16318b(int i, byte[] bArr, int i2) {
        int i3;
        int i4;
        int i5;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return m16314a((long) i, bArr, i2);
            }
            int i6 = i2 + 1;
            bArr[i2] = 45;
            i = -i;
            i2 = i6;
        }
        if (i < f12024b) {
            if (i >= 1000) {
                int i7 = i / 1000;
                i5 = m16311a(i - (i7 * 1000), bArr, m16321c(i7, bArr, i2));
            } else if (i < 10) {
                i5 = i2 + 1;
                bArr[i2] = (byte) (i + 48);
            } else {
                i5 = m16321c(i, bArr, i2);
            }
            return i5;
        }
        boolean z = i >= f12025c;
        if (z) {
            int i8 = f12025c;
            i -= i8;
            if (i >= i8) {
                i -= i8;
                i3 = i2 + 1;
                bArr[i2] = 50;
            } else {
                i3 = i2 + 1;
                bArr[i2] = 49;
            }
        } else {
            i3 = i2;
        }
        int i9 = i / 1000;
        int i10 = i - (i9 * 1000);
        int i11 = i9 / 1000;
        int i12 = i9 - (i11 * 1000);
        if (z) {
            i4 = m16311a(i11, bArr, i3);
        } else {
            i4 = m16321c(i11, bArr, i3);
        }
        return m16311a(i10, bArr, m16311a(i12, bArr, i4));
    }

    /* renamed from: a */
    public static String m16317a(int i) {
        String[] strArr = f12034l;
        if (i < strArr.length) {
            if (i >= 0) {
                return strArr[i];
            }
            int i2 = (-i) - 1;
            String[] strArr2 = f12035m;
            if (i2 < strArr2.length) {
                return strArr2[i2];
            }
        }
        return Integer.toString(i);
    }

    /* renamed from: a */
    public static String m16316a(double d) {
        return Double.toString(d);
    }

    /* renamed from: a */
    private static int m16312a(int i, char[] cArr, int i2) {
        int i3 = i << 2;
        int i4 = i2 + 1;
        char[] cArr2 = f12032j;
        int i5 = i3 + 1;
        cArr[i2] = cArr2[i3];
        int i6 = i4 + 1;
        int i7 = i5 + 1;
        cArr[i4] = cArr2[i5];
        int i8 = i6 + 1;
        cArr[i6] = cArr2[i7];
        return i8;
    }

    /* renamed from: b */
    public static String m16320b(long j) {
        if (j > 2147483647L || j < -2147483648L) {
            return Long.toString(j);
        }
        return m16317a((int) j);
    }

    /* renamed from: a */
    private static int m16311a(int i, byte[] bArr, int i2) {
        int i3 = i << 2;
        int i4 = i2 + 1;
        byte[] bArr2 = f12033k;
        int i5 = i3 + 1;
        bArr[i2] = bArr2[i3];
        int i6 = i4 + 1;
        int i7 = i5 + 1;
        bArr[i4] = bArr2[i5];
        int i8 = i6 + 1;
        bArr[i6] = bArr2[i7];
        return i8;
    }

    /* renamed from: a */
    private static int m16313a(long j) {
        int i = 10;
        for (long j2 = f12026d; j >= j2 && i != 19; j2 = (j2 << 1) + (j2 << 3)) {
            i++;
        }
        return i;
    }
}
