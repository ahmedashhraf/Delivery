package com.google.zxing.p346y;

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
import org.jcodec.codecs.mjpeg.JpegConst;
import org.jcodec.containers.mps.MPSUtils;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.y.e */
/* compiled from: Code39Reader */
public final class C9139e extends C9152r {

    /* renamed from: e */
    static final String f23976e = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%";

    /* renamed from: f */
    private static final String f23977f = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";

    /* renamed from: g */
    static final int[] f23978g;

    /* renamed from: h */
    static final int f23979h;

    /* renamed from: a */
    private final boolean f23980a;

    /* renamed from: b */
    private final boolean f23981b;

    /* renamed from: c */
    private final StringBuilder f23982c;

    /* renamed from: d */
    private final int[] f23983d;

    static {
        int[] iArr = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, TiffUtil.TIFF_TAG_ORIENTATION, 82, 7, 262, 70, 22, 385, 193, MPSUtils.AUDIO_MIN, C13959t.f40907h2, 400, 208, C13959t.f40851V1, 388, JpegConst.DHT, C13959t.f40921k2, C13959t.f40784E2, C13959t.f40977y2, C13959t.f40872a2, 42};
        f23978g = iArr;
        f23979h = iArr[39];
    }

    public C9139e() {
        this(false);
    }

    /* renamed from: a */
    public C8985n mo33114a(int i, C9043a aVar, Map<C8974d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        String str;
        String str2;
        int[] iArr = this.f23983d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f23982c;
        sb.setLength(0);
        int[] a = m42721a(aVar, iArr);
        int c = aVar.mo32975c(a[1]);
        int d = aVar.mo32979d();
        while (true) {
            C9152r.m42763a(aVar, c, iArr);
            int a2 = m42719a(iArr);
            if (a2 >= 0) {
                char a3 = m42718a(a2);
                sb.append(a3);
                int i2 = c;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int c2 = aVar.mo32975c(i2);
                if (a3 == '*') {
                    sb.setLength(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    int i6 = (c2 - c) - i4;
                    if (c2 == d || (i6 << 1) >= i4) {
                        if (this.f23980a) {
                            int length = sb.length() - 1;
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                str2 = f23977f;
                                if (i7 >= length) {
                                    break;
                                }
                                i8 += str2.indexOf(this.f23982c.charAt(i7));
                                i7++;
                            }
                            if (sb.charAt(length) == str2.charAt(i8 % 43)) {
                                sb.setLength(length);
                            } else {
                                throw ChecksumException.m41708a();
                            }
                        }
                        if (sb.length() != 0) {
                            if (this.f23981b) {
                                str = m42720a((CharSequence) sb);
                            } else {
                                str = sb.toString();
                            }
                            float f = (float) i;
                            return new C8985n(str, null, new C8987p[]{new C8987p(((float) (a[1] + a[0])) / 2.0f, f), new C8987p(((float) c) + (((float) i4) / 2.0f), f)}, C8929a.CODE_39);
                        }
                        throw NotFoundException.m41712a();
                    }
                    throw NotFoundException.m41712a();
                }
                c = c2;
            } else {
                throw NotFoundException.m41712a();
            }
        }
    }

    public C9139e(boolean z) {
        this(z, false);
    }

    public C9139e(boolean z, boolean z2) {
        this.f23980a = z;
        this.f23981b = z2;
        this.f23982c = new StringBuilder(20);
        this.f23983d = new int[9];
    }

    /* renamed from: a */
    private static int[] m42721a(C9043a aVar, int[] iArr) throws NotFoundException {
        int d = aVar.mo32979d();
        int c = aVar.mo32975c(0);
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
                } else if (m42719a(iArr) != f23979h || !aVar.mo32970a(Math.max(0, i - ((c - i) / 2)), i, false)) {
                    i += iArr[0] + iArr[1];
                    int i4 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i3] = 0;
                    i2--;
                } else {
                    return new int[]{i, c};
                }
                iArr[i2] = 1;
                z = !z;
            }
            c++;
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private static int m42719a(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: a */
    private static char m42718a(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f23978g;
            if (i2 >= iArr.length) {
                throw NotFoundException.m41712a();
            } else if (iArr[i2] == i) {
                return f23976e.charAt(i2);
            } else {
                i2++;
            }
        }
    }

    /* renamed from: a */
    private static String m42720a(CharSequence charSequence) throws FormatException {
        char c;
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt != '/') {
                                c = 0;
                            } else if (charAt2 >= 'A' && charAt2 <= 'O') {
                                i = charAt2 - ' ';
                            } else if (charAt2 == 'Z') {
                                c = ':';
                            } else {
                                throw FormatException.m41710a();
                            }
                            sb.append(c);
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw FormatException.m41710a();
                        } else {
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 < 'F' || charAt2 > 'W') {
                        throw FormatException.m41710a();
                    } else {
                        i = charAt2 - 11;
                    }
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw FormatException.m41710a();
                } else {
                    i = charAt2 - '@';
                }
                c = (char) i;
                sb.append(c);
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }
}
