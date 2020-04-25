package com.google.zxing.p350z.p354g;

import com.google.zxing.WriterException;
import com.google.zxing.p335u.C9046d;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;

/* renamed from: com.google.zxing.z.g.g */
/* compiled from: PDF417HighLevelEncoder */
final class C9188g {

    /* renamed from: a */
    private static final int f24153a = 0;

    /* renamed from: b */
    private static final int f24154b = 1;

    /* renamed from: c */
    private static final int f24155c = 2;

    /* renamed from: d */
    private static final int f24156d = 0;

    /* renamed from: e */
    private static final int f24157e = 1;

    /* renamed from: f */
    private static final int f24158f = 2;

    /* renamed from: g */
    private static final int f24159g = 3;

    /* renamed from: h */
    private static final int f24160h = 900;

    /* renamed from: i */
    private static final int f24161i = 901;

    /* renamed from: j */
    private static final int f24162j = 902;

    /* renamed from: k */
    private static final int f24163k = 913;

    /* renamed from: l */
    private static final int f24164l = 924;

    /* renamed from: m */
    private static final int f24165m = 925;

    /* renamed from: n */
    private static final int f24166n = 926;

    /* renamed from: o */
    private static final int f24167o = 927;

    /* renamed from: p */
    private static final byte[] f24168p = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: q */
    private static final byte[] f24169q = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: r */
    private static final byte[] f24170r = new byte[128];

    /* renamed from: s */
    private static final byte[] f24171s = new byte[128];

    /* renamed from: t */
    private static final Charset f24172t = Charset.forName("ISO-8859-1");

    static {
        Arrays.fill(f24170r, -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = f24168p;
            if (i2 >= bArr.length) {
                break;
            }
            byte b = bArr[i2];
            if (b > 0) {
                f24170r[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(f24171s, -1);
        while (true) {
            byte[] bArr2 = f24169q;
            if (i < bArr2.length) {
                byte b2 = bArr2[i];
                if (b2 > 0) {
                    f24171s[b2] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    private C9188g() {
    }

    /* renamed from: a */
    static String m42992a(String str, C9184c cVar, Charset charset) throws WriterException {
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f24172t;
        } else if (!f24172t.equals(charset)) {
            C9046d b = C9046d.m42323b(charset.name());
            if (b != null) {
                m42993a(b.mo33013d(), sb);
            }
        }
        int length = str.length();
        if (cVar == C9184c.TEXT) {
            m42990a((CharSequence) str, 0, length, sb, 0);
        } else if (cVar == C9184c.BYTE) {
            byte[] bytes = str.getBytes(charset);
            m42995a(bytes, 0, bytes.length, 1, sb);
        } else if (cVar == C9184c.NUMERIC) {
            sb.append(902);
            m42994a(str, 0, length, sb);
        } else {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int a = m42989a((CharSequence) str, i);
                if (a >= 13) {
                    sb.append(902);
                    i3 = 2;
                    m42994a(str, i, a, sb);
                    i += a;
                    i2 = 0;
                } else {
                    int b2 = m42997b(str, i);
                    if (b2 >= 5 || a == length) {
                        if (i3 != 0) {
                            sb.append(900);
                            i2 = 0;
                            i3 = 0;
                        }
                        i2 = m42990a((CharSequence) str, i, b2, sb, i2);
                        i += b2;
                    } else {
                        int a2 = m42991a(str, i, charset);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        int i4 = a2 + i;
                        byte[] bytes2 = str.substring(i, i4).getBytes(charset);
                        if (bytes2.length == 1 && i3 == 0) {
                            m42995a(bytes2, 0, 1, 0, sb);
                        } else {
                            m42995a(bytes2, 0, bytes2.length, i3, sb);
                            i2 = 0;
                            i3 = 1;
                        }
                        i = i4;
                    }
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m42996a(char c) {
        return c == ' ' || (c >= 'a' && c <= 'z');
    }

    /* renamed from: b */
    private static int m42997b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && m42999c(charAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
            if (i3 < 13) {
                if (i3 <= 0) {
                    if (!m43002f(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
            } else {
                return (i2 - i) - i3;
            }
        }
        return i2 - i;
    }

    /* renamed from: b */
    private static boolean m42998b(char c) {
        return c == ' ' || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: c */
    private static boolean m42999c(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: d */
    private static boolean m43000d(char c) {
        return f24170r[c] != -1;
    }

    /* renamed from: e */
    private static boolean m43001e(char c) {
        return f24171s[c] != -1;
    }

    /* renamed from: f */
    private static boolean m43002f(char c) {
        return c == 9 || c == 10 || c == 13 || (c >= ' ' && c <= '~');
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f6 A[EDGE_INSN: B:68:0x00f6->B:53:0x00f6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0011 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m42990a(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 2
            r5 = 0
            r6 = 1
            r8 = r20
            r7 = 0
        L_0x0011:
            int r9 = r17 + r7
            char r10 = r0.charAt(r9)
            r11 = 26
            r12 = 32
            r13 = 28
            r14 = 27
            r15 = 29
            if (r8 == 0) goto L_0x00bc
            if (r8 == r6) goto L_0x0083
            if (r8 == r4) goto L_0x003c
            boolean r9 = m43001e(r10)
            if (r9 == 0) goto L_0x0037
            byte[] r9 = f24171s
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x00f2
        L_0x0037:
            r3.append(r15)
        L_0x003a:
            r8 = 0
            goto L_0x0011
        L_0x003c:
            boolean r11 = m43000d(r10)
            if (r11 == 0) goto L_0x004c
            byte[] r9 = f24170r
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x00f2
        L_0x004c:
            boolean r11 = m42998b(r10)
            if (r11 == 0) goto L_0x0056
            r3.append(r13)
            goto L_0x003a
        L_0x0056:
            boolean r11 = m42996a(r10)
            if (r11 == 0) goto L_0x0061
            r3.append(r14)
            goto L_0x00d8
        L_0x0061:
            int r9 = r9 + 1
            if (r9 >= r1) goto L_0x0076
            char r9 = r0.charAt(r9)
            boolean r9 = m43001e(r9)
            if (r9 == 0) goto L_0x0076
            r8 = 3
            r9 = 25
            r3.append(r9)
            goto L_0x0011
        L_0x0076:
            r3.append(r15)
            byte[] r9 = f24171s
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x00f2
        L_0x0083:
            boolean r9 = m42996a(r10)
            if (r9 == 0) goto L_0x0096
            if (r10 != r12) goto L_0x008f
            r3.append(r11)
            goto L_0x00f2
        L_0x008f:
            int r10 = r10 + -97
            char r9 = (char) r10
            r3.append(r9)
            goto L_0x00f2
        L_0x0096:
            boolean r9 = m42998b(r10)
            if (r9 == 0) goto L_0x00a6
            r3.append(r14)
            int r10 = r10 + -65
            char r9 = (char) r10
            r3.append(r9)
            goto L_0x00f2
        L_0x00a6:
            boolean r9 = m43000d(r10)
            if (r9 == 0) goto L_0x00b0
            r3.append(r13)
            goto L_0x00e4
        L_0x00b0:
            r3.append(r15)
            byte[] r9 = f24171s
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x00f2
        L_0x00bc:
            boolean r9 = m42998b(r10)
            if (r9 == 0) goto L_0x00cf
            if (r10 != r12) goto L_0x00c8
            r3.append(r11)
            goto L_0x00f2
        L_0x00c8:
            int r10 = r10 + -65
            char r9 = (char) r10
            r3.append(r9)
            goto L_0x00f2
        L_0x00cf:
            boolean r9 = m42996a(r10)
            if (r9 == 0) goto L_0x00db
            r3.append(r14)
        L_0x00d8:
            r8 = 1
            goto L_0x0011
        L_0x00db:
            boolean r9 = m43000d(r10)
            if (r9 == 0) goto L_0x00e7
            r3.append(r13)
        L_0x00e4:
            r8 = 2
            goto L_0x0011
        L_0x00e7:
            r3.append(r15)
            byte[] r9 = f24171s
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
        L_0x00f2:
            int r7 = r7 + 1
            if (r7 < r1) goto L_0x0011
            int r0 = r3.length()
            r1 = 0
            r7 = 0
        L_0x00fc:
            if (r1 >= r0) goto L_0x011a
            int r9 = r1 % 2
            if (r9 == 0) goto L_0x0104
            r9 = 1
            goto L_0x0105
        L_0x0104:
            r9 = 0
        L_0x0105:
            if (r9 == 0) goto L_0x0113
            int r7 = r7 * 30
            char r9 = r3.charAt(r1)
            int r7 = r7 + r9
            char r7 = (char) r7
            r2.append(r7)
            goto L_0x0117
        L_0x0113:
            char r7 = r3.charAt(r1)
        L_0x0117:
            int r1 = r1 + 1
            goto L_0x00fc
        L_0x011a:
            int r0 = r0 % r4
            if (r0 == 0) goto L_0x0124
            int r7 = r7 * 30
            int r7 = r7 + r15
            char r0 = (char) r7
            r2.append(r0)
        L_0x0124:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p350z.p354g.C9188g.m42990a(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    /* renamed from: a */
    private static void m42995a(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb.append(913);
        } else if (i2 % 6 == 0) {
            sb.append(924);
        } else {
            sb.append(901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    /* renamed from: a */
    private static void m42994a(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    /* renamed from: a */
    private static int m42989a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (m42999c(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static int m42991a(String str, int i, Charset charset) throws WriterException {
        CharsetEncoder newEncoder = charset.newEncoder();
        int length = str.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && m42999c(charAt)) {
                i3++;
                int i4 = i2 + i3;
                if (i4 >= length) {
                    break;
                }
                charAt = str.charAt(i4);
            }
            if (i3 >= 13) {
                return i2 - i;
            }
            char charAt2 = str.charAt(i2);
            if (newEncoder.canEncode(charAt2)) {
                i2++;
            } else {
                StringBuilder sb = new StringBuilder("Non-encodable character detected: ");
                sb.append(charAt2);
                sb.append(" (Unicode: ");
                sb.append(charAt2);
                sb.append(')');
                throw new WriterException(sb.toString());
            }
        }
        return i2 - i;
    }

    /* renamed from: a */
    private static void m42993a(int i, StringBuilder sb) throws WriterException {
        if (i >= 0 && i < f24160h) {
            sb.append(927);
            sb.append((char) i);
        } else if (i < 810900) {
            sb.append(926);
            sb.append((char) ((i / f24160h) - 1));
            sb.append((char) (i % f24160h));
        } else if (i < 811800) {
            sb.append(925);
            sb.append((char) (810900 - i));
        } else {
            StringBuilder sb2 = new StringBuilder("ECI number not in valid range from 0..811799, but was ");
            sb2.append(i);
            throw new WriterException(sb2.toString());
        }
    }
}
