package com.google.zxing.p337v.p340e;

import androidx.recyclerview.widget.C1744m.C1750f;
import org.apache.http.C15470v;
import org.jcodec.codecs.mjpeg.JpegConst;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.v.e.i */
/* compiled from: ErrorCorrection */
public final class C9082i {

    /* renamed from: a */
    private static final int[] f23766a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* renamed from: b */
    private static final int[][] f23767b = {new int[]{JpegConst.APP4, 48, 15, 111, 62}, new int[]{23, 68, C13959t.f40902g2, C13959t.f40855W1, 240, 92, JpegConst.COM}, new int[]{28, 24, C13959t.f40852V2, C13959t.f40776C2, 223, 248, 116, 255, 110, 61}, new int[]{175, C13959t.f40872a2, C15470v.f44668i, 12, 194, C13959t.f40784E2, 39, 245, 60, 97, 120}, new int[]{41, C13959t.f40941p2, C13959t.f40961u2, 91, 61, 42, C13959t.f40892e2, JpegConst.RST5, 97, 178, 100, 242}, new int[]{C13959t.f40953s2, 97, 192, 252, 95, 9, C13959t.f40957t2, 119, C13959t.f40872a2, 45, 18, C13959t.f40856W2, 83, C13959t.f40852V2}, new int[]{83, 195, 100, 39, C13959t.f40864Y2, 75, 66, 61, 241, JpegConst.RST5, 109, C13959t.f40835R1, 94, JpegConst.COM, 225, 48, 90, C13959t.f40864Y2}, new int[]{15, 195, 244, 9, JpegConst.APP9, 71, C13959t.f40784E2, 2, C13959t.f40864Y2, C13959t.f40969w2, C13959t.f40941p2, C13959t.f40907h2, 253, 79, 108, 82, 27, C13959t.f40808K2, C13959t.f40856W2, C13959t.f40800I2}, new int[]{52, 190, 88, C15470v.f44668i, 109, 39, C13959t.f40816M2, 21, C13959t.f40949r2, C13959t.f40903g3, 251, 223, C13959t.f40949r2, 21, 5, C13959t.f40800I2, JpegConst.COM, 124, 12, 181, 184, 96, 50, 193}, new int[]{JpegConst.RST3, JpegConst.APP7, 43, 97, 71, 96, 103, C13959t.f40808K2, 37, C13959t.f40933n2, C13959t.f40792G2, 53, 75, 34, 249, 121, 17, C13959t.f40872a2, 110, JpegConst.RST5, C13959t.f40887d2, C13959t.f40863Y1, 120, C13959t.f40933n2, JpegConst.APP9, C13959t.f40784E2, 93, 255}, new int[]{245, C13959t.f40827P1, 242, 218, C13959t.f40839S1, C1750f.f6813c, C13959t.f40977y2, 181, 102, 120, 84, 179, 220, 251, 80, C13959t.f40840S2, JpegConst.APP5, 18, 2, 4, 68, 33, 101, C13959t.f40867Z1, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, C13959t.f40867Z1, 31, 19, 38, 22, C13959t.f40941p2, 247, 105, 122, 2, 245, C13959t.f40851V1, 242, 8, 175, 95, 100, 9, C13959t.f40780D2, 105, JpegConst.RST6, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, C15470v.f44665f, 69, 50, C13959t.f40929m2, C13959t.f40820N2, JpegConst.APP2, 5, 9, 5}, new int[]{245, C13959t.f40847U1, C13959t.f40800I2, 223, 96, 32, 117, 22, JpegConst.APPE, C13959t.f40851V1, JpegConst.APPE, JpegConst.APP7, C15470v.f44668i, C13959t.f40864Y2, JpegConst.APPD, 87, C13959t.f40878b3, 106, 16, C13959t.f40917j2, 118, 23, 37, 90, C13959t.f40792G2, C15470v.f44668i, C13959t.f40843T1, 88, 120, 100, 66, C13959t.f40872a2, C13959t.f40856W2, 240, 82, 44, C13959t.f40816M2, 87, C13959t.f40860X2, C13959t.f40917j2, C13959t.f40969w2, 175, 69, JpegConst.RST5, 92, 253, 225, 19}, new int[]{175, 9, 223, JpegConst.APPE, 12, 17, 220, 208, 100, 29, 175, C13959t.f40792G2, JpegConst.APP6, 192, 215, JpegConst.APPB, C13959t.f40929m2, C13959t.f40965v2, 36, 223, 38, 200, C13959t.f40847U1, 54, JpegConst.APP4, C13959t.f40912i2, 218, JpegConst.APPA, 117, 203, 29, JpegConst.APP8, C13959t.f40902g2, JpegConst.APPE, 22, C13959t.f40929m2, 201, 117, 62, C15470v.f44670k, C13959t.f40768A2, 13, C13959t.f40867Z1, 245, C13959t.f40827P1, 67, 247, 28, C13959t.f40949r2, 43, 203, 107, JpegConst.APP9, 53, C13959t.f40897f2, 46}, new int[]{242, 93, C13959t.f40788F2, 50, C13959t.f40902g2, JpegConst.RST2, 39, 118, C15470v.f44665f, C13959t.f40864Y2, 201, C13959t.f40868Z2, C13959t.f40897f2, 108, JpegConst.DHT, 37, C13959t.f40852V2, 112, C13959t.f40855W1, JpegConst.APP6, 245, 63, C13959t.f40903g3, 190, C1750f.f6813c, 106, C13959t.f40852V2, JpegConst.DRI, 175, 64, 114, 71, C13959t.f40973x2, 44, C13959t.f40917j2, 6, 27, 218, 51, 63, 87, 10, 40, C13959t.f40839S1, C13959t.f40864Y2, 17, C13959t.f40981z2, 31, C13959t.f40816M2, C13959t.f40792G2, 4, 107, JpegConst.APP8, 7, 94, C13959t.f40776C2, JpegConst.APP0, 124, 86, 47, 11, 204}, new int[]{220, JpegConst.APP4, C13959t.f40804J2, 89, 251, C13959t.f40925l2, C13959t.f40965v2, 56, 89, 33, C13959t.f40917j2, 244, C13959t.f40945q2, 36, 73, C13959t.f40827P1, JpegConst.RST5, C13959t.f40863Y1, 248, 180, JpegConst.APPA, C13959t.f40903g3, C13959t.f40961u2, C13959t.f40820N2, 68, 122, 93, JpegConst.RST5, 15, C13959t.f40969w2, JpegConst.APP3, JpegConst.APPC, 66, C13959t.f40877b2, C13959t.f40941p2, C13959t.f40852V2, C15470v.f44665f, C13959t.f40780D2, 179, 25, 220, JpegConst.APP8, 96, JpegConst.RST2, JpegConst.APP7, C13959t.f40863Y1, 223, JpegConst.APPF, 181, 241, 59, 52, C13959t.f40800I2, 25, 49, JpegConst.APP8, JpegConst.RST3, C13959t.f40868Z2, 64, 54, 108, C13959t.f40941p2, C13959t.f40847U1, 63, 96, 103, 82, C13959t.f40856W2}};

    /* renamed from: c */
    private static final int f23768c = 301;

    /* renamed from: d */
    private static final int[] f23769d = new int[256];

    /* renamed from: e */
    private static final int[] f23770e = new int[255];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            f23770e[i2] = i;
            f23769d[i] = i2;
            i <<= 1;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    private C9082i() {
    }

    /* renamed from: a */
    public static String m42494a(String str, C9084k kVar) {
        if (str.length() == kVar.mo33095b()) {
            StringBuilder sb = new StringBuilder(kVar.mo33095b() + kVar.mo33097c());
            sb.append(str);
            int d = kVar.mo33069d();
            if (d == 1) {
                sb.append(m42492a((CharSequence) str, kVar.mo33097c()));
            } else {
                sb.setLength(sb.capacity());
                int[] iArr = new int[d];
                int[] iArr2 = new int[d];
                int[] iArr3 = new int[d];
                int i = 0;
                while (i < d) {
                    int i2 = i + 1;
                    iArr[i] = kVar.mo33068a(i2);
                    iArr2[i] = kVar.mo33096b(i2);
                    iArr3[i] = 0;
                    if (i > 0) {
                        iArr3[i] = iArr3[i - 1] + iArr[i];
                    }
                    i = i2;
                }
                for (int i3 = 0; i3 < d; i3++) {
                    StringBuilder sb2 = new StringBuilder(iArr[i3]);
                    for (int i4 = i3; i4 < kVar.mo33095b(); i4 += d) {
                        sb2.append(str.charAt(i4));
                    }
                    String a = m42492a((CharSequence) sb2.toString(), iArr2[i3]);
                    int i5 = i3;
                    int i6 = 0;
                    while (i5 < iArr2[i3] * d) {
                        int i7 = i6 + 1;
                        sb.setCharAt(kVar.mo33095b() + i5, a.charAt(i6));
                        i5 += d;
                        i6 = i7;
                    }
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
    }

    /* renamed from: a */
    private static String m42492a(CharSequence charSequence, int i) {
        return m42493a(charSequence, 0, charSequence.length(), i);
    }

    /* renamed from: a */
    private static String m42493a(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 0;
        while (true) {
            int[] iArr = f23766a;
            if (i4 >= iArr.length) {
                i4 = -1;
                break;
            } else if (iArr[i4] == i3) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int[] iArr2 = f23767b[i4];
            char[] cArr = new char[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                cArr[i5] = 0;
            }
            for (int i6 = i; i6 < i + i2; i6++) {
                int i7 = i3 - 1;
                char charAt = cArr[i7] ^ charSequence.charAt(i6);
                while (i7 > 0) {
                    if (charAt == 0 || iArr2[i7] == 0) {
                        cArr[i7] = cArr[i7 - 1];
                    } else {
                        char c = cArr[i7 - 1];
                        int[] iArr3 = f23770e;
                        int[] iArr4 = f23769d;
                        cArr[i7] = (char) (c ^ iArr3[(iArr4[charAt] + iArr4[iArr2[i7]]) % 255]);
                    }
                    i7--;
                }
                if (charAt == 0 || iArr2[0] == 0) {
                    cArr[0] = 0;
                } else {
                    int[] iArr5 = f23770e;
                    int[] iArr6 = f23769d;
                    cArr[0] = (char) iArr5[(iArr6[charAt] + iArr6[iArr2[0]]) % 255];
                }
            }
            char[] cArr2 = new char[i3];
            for (int i8 = 0; i8 < i3; i8++) {
                cArr2[i8] = cArr[(i3 - i8) - 1];
            }
            return String.valueOf(cArr2);
        }
        StringBuilder sb = new StringBuilder("Illegal number of error correction codewords specified: ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }
}
