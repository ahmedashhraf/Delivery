package com.google.zxing.p346y;

import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.zxing.C8929a;
import com.google.zxing.C8974d;
import com.google.zxing.C8985n;
import com.google.zxing.C8987p;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;
import java.util.Arrays;
import java.util.Map;
import org.apache.http.C15470v;

/* renamed from: com.google.zxing.y.g */
/* compiled from: Code93Reader */
public final class C9141g extends C9152r {

    /* renamed from: c */
    static final String f23984c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";

    /* renamed from: d */
    private static final char[] f23985d = f23984c.toCharArray();

    /* renamed from: e */
    static final int[] f23986e;

    /* renamed from: f */
    private static final int f23987f;

    /* renamed from: a */
    private final StringBuilder f23988a = new StringBuilder(20);

    /* renamed from: b */
    private final int[] f23989b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, TiffUtil.TIFF_TAG_ORIENTATION, 266, C15470v.f44652O, C15470v.f44649L, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, C15470v.f44684y, C15470v.f44640C, 364, 358, 310, 314, 302, 468, 466, FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 366, 374, 430, 294, 474, 470, 306, 350};
        f23986e = iArr;
        f23987f = iArr[47];
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m42731b(java.lang.CharSequence r9) throws com.google.zxing.FormatException {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r0) goto L_0x009f
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto L_0x0098
            r5 = 100
            if (r4 > r5) goto L_0x0098
            int r5 = r0 + -1
            if (r3 >= r5) goto L_0x0093
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L_0x0082;
                case 98: goto L_0x004c;
                case 99: goto L_0x003b;
                case 100: goto L_0x002f;
                default: goto L_0x002c;
            }
        L_0x002c:
            r4 = 0
            goto L_0x008f
        L_0x002f:
            if (r5 < r8) goto L_0x0036
            if (r5 > r7) goto L_0x0036
            int r5 = r5 + 32
            goto L_0x0088
        L_0x0036:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.m41710a()
            throw r9
        L_0x003b:
            if (r5 < r8) goto L_0x0042
            if (r5 > r6) goto L_0x0042
            int r5 = r5 + -32
            goto L_0x0088
        L_0x0042:
            if (r5 != r7) goto L_0x0047
            r4 = 58
            goto L_0x008f
        L_0x0047:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.m41710a()
            throw r9
        L_0x004c:
            if (r5 < r8) goto L_0x0055
            r4 = 69
            if (r5 > r4) goto L_0x0055
            int r5 = r5 + -38
            goto L_0x0088
        L_0x0055:
            r4 = 70
            if (r5 < r4) goto L_0x0060
            r4 = 74
            if (r5 > r4) goto L_0x0060
            int r5 = r5 + -11
            goto L_0x0088
        L_0x0060:
            r4 = 75
            if (r5 < r4) goto L_0x0069
            if (r5 > r6) goto L_0x0069
            int r5 = r5 + 16
            goto L_0x0088
        L_0x0069:
            r4 = 80
            if (r5 < r4) goto L_0x0074
            r4 = 83
            if (r5 > r4) goto L_0x0074
            int r5 = r5 + 43
            goto L_0x0088
        L_0x0074:
            r4 = 84
            if (r5 < r4) goto L_0x007d
            if (r5 > r7) goto L_0x007d
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x008f
        L_0x007d:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.m41710a()
            throw r9
        L_0x0082:
            if (r5 < r8) goto L_0x008a
            if (r5 > r7) goto L_0x008a
            int r5 = r5 + -64
        L_0x0088:
            char r4 = (char) r5
            goto L_0x008f
        L_0x008a:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.m41710a()
            throw r9
        L_0x008f:
            r1.append(r4)
            goto L_0x009b
        L_0x0093:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.m41710a()
            throw r9
        L_0x0098:
            r1.append(r4)
        L_0x009b:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x009f:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p346y.C9141g.m42731b(java.lang.CharSequence):java.lang.String");
    }

    /* renamed from: a */
    public C8985n mo33114a(int i, C9043a aVar, Map<C8974d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] a = m42730a(aVar);
        int c = aVar.mo32975c(a[1]);
        int d = aVar.mo32979d();
        int[] iArr = this.f23989b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f23988a;
        sb.setLength(0);
        while (true) {
            C9152r.m42763a(aVar, c, iArr);
            int a2 = m42727a(iArr);
            if (a2 >= 0) {
                char a3 = m42726a(a2);
                sb.append(a3);
                int i2 = c;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int c2 = aVar.mo32975c(i2);
                if (a3 == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (c2 == d || !aVar.mo32974b(c2)) {
                        throw NotFoundException.m41712a();
                    } else if (sb.length() >= 2) {
                        m42728a((CharSequence) sb);
                        sb.setLength(sb.length() - 2);
                        float f = (float) i;
                        return new C8985n(m42731b(sb), null, new C8987p[]{new C8987p(((float) (a[1] + a[0])) / 2.0f, f), new C8987p(((float) c) + (((float) i4) / 2.0f), f)}, C8929a.CODE_93);
                    } else {
                        throw NotFoundException.m41712a();
                    }
                } else {
                    c = c2;
                }
            } else {
                throw NotFoundException.m41712a();
            }
        }
    }

    /* renamed from: a */
    private int[] m42730a(C9043a aVar) throws NotFoundException {
        int d = aVar.mo32979d();
        int c = aVar.mo32975c(0);
        Arrays.fill(this.f23989b, 0);
        int[] iArr = this.f23989b;
        int length = iArr.length;
        int i = c;
        boolean z = false;
        int i2 = 0;
        while (c < d) {
            if (aVar.mo32974b(c) ^ z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                int i3 = length - 1;
                if (i2 != i3) {
                    i2++;
                } else if (m42727a(iArr) == f23987f) {
                    return new int[]{i, c};
                } else {
                    i += iArr[0] + iArr[1];
                    int i4 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i3] = 0;
                    i2--;
                }
                iArr[i2] = 1;
                z = !z;
            }
            c++;
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private static int m42727a(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((((float) iArr[i4]) * 9.0f) / ((float) i));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                int i5 = i3;
                for (int i6 = 0; i6 < round; i6++) {
                    i5 = (i5 << 1) | 1;
                }
                i3 = i5;
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static char m42726a(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f23986e;
            if (i2 >= iArr.length) {
                throw NotFoundException.m41712a();
            } else if (iArr[i2] == i) {
                return f23985d[i2];
            } else {
                i2++;
            }
        }
    }

    /* renamed from: a */
    private static void m42728a(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        m42729a(charSequence, length - 2, 20);
        m42729a(charSequence, length - 1, 15);
    }

    /* renamed from: a */
    private static void m42729a(CharSequence charSequence, int i, int i2) throws ChecksumException {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += f23984c.indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f23985d[i3 % 47]) {
            throw ChecksumException.m41708a();
        }
    }
}
