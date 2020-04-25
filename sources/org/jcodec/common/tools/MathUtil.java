package org.jcodec.common.tools;

import androidx.recyclerview.widget.C1744m.C1750f;
import com.mrsool.utils.C11644i;
import org.apache.http.C15470v;
import org.jcodec.codecs.mjpeg.JpegConst;
import org.jcodec.common.model.Rational;
import org.jcodec.common.model.RationalLarge;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class MathUtil {
    private static final int[] logTab = {0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
    private static final int[] reverseTab = {0, 128, 64, 192, 32, C13959t.f40969w2, 96, JpegConst.APP0, 16, C13959t.f40902g2, 80, 208, 48, C13959t.f40816M2, 112, 240, 8, C13959t.f40863Y1, 72, 200, 40, C13959t.f40784E2, 104, JpegConst.APP8, 24, C13959t.f40937o2, 88, 216, 56, 184, 120, 248, 4, C13959t.f40847U1, 68, JpegConst.DHT, 36, C13959t.f40768A2, 100, JpegConst.APP4, 20, C13959t.f40921k2, 84, JpegConst.RST4, 52, 180, 116, 244, 12, C13959t.f40882c2, 76, 204, 44, C13959t.f40800I2, 108, JpegConst.APPC, 28, C13959t.f40953s2, 92, 220, 60, C13959t.f40864Y2, 124, 252, 2, C13959t.f40839S1, 66, 194, 34, C13959t.f40977y2, 98, JpegConst.APP2, 18, C13959t.f40912i2, 82, JpegConst.RST2, 50, 178, 114, 242, 10, C13959t.f40872a2, 74, C15470v.f44665f, 42, C13959t.f40792G2, 106, JpegConst.APPA, 26, C13959t.f40945q2, 90, 218, 58, C13959t.f40856W2, 122, C1750f.f6813c, 6, C13959t.f40855W1, 70, C13959t.f40908h3, 38, C13959t.f40776C2, 102, JpegConst.APP6, 22, C13959t.f40929m2, 86, JpegConst.RST6, 54, C13959t.f40840S2, 118, 246, 14, C13959t.f40892e2, 78, C15470v.f44669j, 46, C13959t.f40808K2, 110, JpegConst.APPE, 30, C13959t.f40961u2, 94, C11644i.f33366n0, 62, 190, C13959t.f40823O1, JpegConst.COM, 1, C13959t.f40835R1, 65, 193, 33, C13959t.f40973x2, 97, 225, 17, C13959t.f40907h2, 81, JpegConst.RST1, 49, C13959t.f40820N2, 113, 241, 9, C13959t.f40867Z1, 73, 201, 41, C13959t.f40788F2, 105, JpegConst.APP9, 25, C13959t.f40941p2, 89, 217, 57, C13959t.f40852V2, 121, 249, 5, C13959t.f40851V1, 69, C13959t.f40903g3, 37, C13959t.f40772B2, 101, JpegConst.APP5, 21, C13959t.f40925l2, 85, JpegConst.RST5, 53, 181, 117, 245, 13, C13959t.f40887d2, 77, C15470v.f44668i, 45, C13959t.f40804J2, 109, JpegConst.APPD, 29, C13959t.f40957t2, 93, JpegConst.DRI, 61, C13959t.f40868Z2, C13959t.f40819N1, 253, 3, C13959t.f40843T1, 67, 195, 35, C13959t.f40981z2, 99, JpegConst.APP3, 19, C13959t.f40917j2, 83, JpegConst.RST3, 51, 179, 115, 243, 11, C13959t.f40877b2, 75, 203, 43, C13959t.f40796H2, 107, JpegConst.APPB, 27, C13959t.f40949r2, 91, JpegConst.DQT, 59, C13959t.f40860X2, 123, 251, 7, C13959t.f40859X1, 71, C13959t.f40913i3, 39, C13959t.f40780D2, 103, JpegConst.APP7, 23, C13959t.f40933n2, 87, 215, 55, 183, 119, 247, 15, C13959t.f40897f2, 79, C15470v.f44670k, 47, 175, 111, JpegConst.APPF, 31, C13959t.f40965v2, 95, 223, 63, C13959t.f40878b3, C13959t.f40827P1, 255};

    public static final int abs(int i) {
        int i2 = i >> 31;
        return (i ^ i2) - i2;
    }

    public static final int clip(int i, int i2) {
        return i < i2 ? i : i2;
    }

    public static final int clip(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static int cubeRoot(int i) {
        return 0;
    }

    public static int gcd(int i, int i2) {
        return i2 != 0 ? gcd(i2, i % i2) : i;
    }

    public static final int golomb(int i) {
        if (i == 0) {
            return 0;
        }
        return (abs(i) << 1) - ((i ^ -1) >>> 31);
    }

    public static int log2(int i) {
        int i2;
        if ((-65536 & i) != 0) {
            i >>= 16;
            i2 = 16;
        } else {
            i2 = 0;
        }
        if ((65280 & i) != 0) {
            i >>= 8;
            i2 += 8;
        }
        return i2 + logTab[i];
    }

    public static int log2Slow(int i) {
        int i2 = 0;
        while ((Integer.MIN_VALUE & i) == 0) {
            i <<= 1;
            i2++;
        }
        return 31 - i2;
    }

    public static int nextPowerOfTwo(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 1);
        int i4 = i3 | (i3 >> 2);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 8);
        return (i6 | (i6 >> 16)) + 1;
    }

    public static Rational reduce(Rational rational) {
        return reduce(rational.getNum(), rational.getDen());
    }

    public static final int reverse(int i) {
        return reverseTab[i & 255];
    }

    public static final int sign(int i) {
        return -(i >> 31);
    }

    public static final int toSigned(int i, int i2) {
        return (i ^ i2) - i2;
    }

    public static int wrap(int i, int i2) {
        return i < 0 ? i + i2 : i >= i2 ? i - i2 : i;
    }

    public static long gcd(long j, long j2) {
        return j2 != 0 ? gcd(j2, j % j2) : j;
    }

    public static int log2(long j) {
        int i = 32;
        if ((-4294967296L & j) != 0) {
            j >>= 32;
        } else {
            i = 0;
        }
        if ((4294901760L & j) != 0) {
            j >>= 16;
            i += 16;
        }
        if ((65280 & j) != 0) {
            j >>= 8;
            i += 8;
        }
        return i + logTab[(int) j];
    }

    public static Rational reduce(int i, int i2) {
        int gcd = gcd(i, i2);
        return new Rational(i / gcd, i2 / gcd);
    }

    public static RationalLarge reduce(long j, long j2) {
        long gcd = gcd(j, j2);
        return new RationalLarge(j / gcd, j2 / gcd);
    }
}
