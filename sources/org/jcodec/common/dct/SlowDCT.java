package org.jcodec.common.dct;

import org.jcodec.scale.ImageConvert;

public class SlowDCT extends DCT {
    public static final SlowDCT INSTANCE = new SlowDCT();
    private static final double rSqrt2 = (1.0d / Math.sqrt(2.0d));

    public int[] decode(int[] iArr) {
        int[] iArr2 = new int[64];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 8;
            if (i >= 8) {
                return iArr2;
            }
            int i4 = i2;
            int i5 = 0;
            while (i5 < i3) {
                double d = 0.0d;
                int i6 = 0;
                int i7 = 0;
                while (i6 < i3) {
                    double d2 = i6 == 0 ? rSqrt2 : 1.0d;
                    int i8 = i7;
                    double d3 = d;
                    int i9 = 0;
                    while (i9 < i3) {
                        double d4 = i9 == 0 ? rSqrt2 : 1.0d;
                        double d5 = (double) iArr[i8];
                        int i10 = i4;
                        double d6 = (double) (((i5 * 2) + 1) * i9);
                        Double.isNaN(d6);
                        double d7 = (d6 * 3.141592653589793d) / 16.0d;
                        int i11 = i;
                        double d8 = (double) (((i * 2) + 1) * i6);
                        Double.isNaN(d8);
                        double d9 = (d8 * 3.141592653589793d) / 16.0d;
                        double d10 = d4 * d2;
                        Double.isNaN(d5);
                        d3 += d10 * d5 * Math.cos(d7) * Math.cos(d9);
                        i8++;
                        i9++;
                        i4 = i10;
                        i = i11;
                        i3 = 8;
                    }
                    int i12 = i;
                    int i13 = i4;
                    i6++;
                    d = d3;
                    i7 = i8;
                    i3 = 8;
                }
                int i14 = i;
                int i15 = i4;
                i4 = i15 + 1;
                iArr2[i15] = ImageConvert.icrop((int) ((double) Math.round((d * 0.25d) + 128.0d)));
                i5++;
                i = i14;
                i3 = 8;
            }
            i++;
            i2 = i4;
        }
    }

    public short[] encode(byte[] bArr) {
        short[] sArr = new short[64];
        int i = 0;
        while (true) {
            int i2 = 8;
            if (i >= 8) {
                break;
            }
            int i3 = 0;
            while (i3 < i2) {
                int i4 = 0;
                float f = 0.0f;
                while (i4 < i2) {
                    float f2 = f;
                    int i5 = 0;
                    while (i5 < i2) {
                        double d = (double) f2;
                        double d2 = (double) ((float) bArr[(i4 * 8) + i5]);
                        double d3 = (double) i4;
                        Double.isNaN(d3);
                        double d4 = (d3 + 0.5d) * 0.39269908169872414d;
                        int i6 = i3;
                        double d5 = (double) i;
                        Double.isNaN(d5);
                        double cos = Math.cos(d4 * d5);
                        Double.isNaN(d2);
                        double d6 = d2 * cos;
                        double d7 = (double) i5;
                        Double.isNaN(d7);
                        double d8 = (d7 + 0.5d) * 0.39269908169872414d;
                        int i7 = i6;
                        double d9 = (double) i7;
                        Double.isNaN(d9);
                        double cos2 = d6 * Math.cos(d8 * d9);
                        Double.isNaN(d);
                        f2 = (float) (d + cos2);
                        i5++;
                        i3 = i7;
                        i2 = 8;
                    }
                    int i8 = i3;
                    i4++;
                    f = f2;
                    i2 = 8;
                }
                int i9 = i3;
                sArr[(i * 8) + i9] = (short) ((byte) ((int) f));
                i3 = i9 + 1;
                i2 = 8;
            }
            i++;
        }
        sArr[0] = (short) ((byte) ((int) (((float) sArr[0]) / 8.0f)));
        double sqrt = Math.sqrt(2.0d);
        for (int i10 = 1; i10 < 8; i10++) {
            double d10 = (double) ((float) sArr[0]);
            Double.isNaN(d10);
            sArr[i10] = (short) ((byte) ((int) ((d10 * sqrt) / 8.0d)));
            int i11 = i10 * 8;
            double d11 = (double) ((float) sArr[0]);
            Double.isNaN(d11);
            sArr[i11] = (short) ((byte) ((int) ((d11 * sqrt) / 8.0d)));
            for (int i12 = 1; i12 < 8; i12++) {
                sArr[i11 + i12] = (short) ((byte) ((int) (((float) sArr[0]) / 4.0f)));
            }
        }
        return sArr;
    }
}
