package org.jcodec.codecs.mpeg12;

import java.lang.reflect.Array;
import org.jcodec.common.model.Picture;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.tools.MathUtil;

public class MPEGPred {
    private int chromaFormat;
    private int[][] fCode;
    protected int[][][] mvPred = ((int[][][]) Array.newInstance(int.class, new int[]{2, 2, 2}));
    private boolean topFieldFirst;

    public MPEGPred(int[][] iArr, int i, boolean z) {
        this.fCode = iArr;
        this.chromaFormat = i;
        this.topFieldFirst = z;
    }

    private final int dpXField(int i, int i2, int i3) {
        return ((i + (i > 0 ? 1 : 0)) >> 1) + i2;
    }

    private final int dpYField(int i, int i2, int i3) {
        return ((i + (i > 0 ? 1 : 0)) >> 1) + (1 - (i3 << 1)) + i2;
    }

    private final int mvectDecode(BitReader bitReader, int i, int i2) {
        int readVLC = MPEGConst.vlcMotionCode.readVLC(bitReader);
        if (readVLC == 0) {
            return i2;
        }
        if (readVLC < 0) {
            return 65535;
        }
        int read1Bit = bitReader.read1Bit();
        int i3 = i - 1;
        if (i3 > 0) {
            readVLC = (bitReader.readNBit(i3) | ((readVLC - 1) << i3)) + 1;
        }
        if (read1Bit != 0) {
            readVLC = -readVLC;
        }
        return sign_extend(readVLC + i2, i3 + 5);
    }

    private void predict16x16DualPrimeField(Picture[] pictureArr, int i, int i2, BitReader bitReader, int[][] iArr, int i3) {
        BitReader bitReader2 = bitReader;
        Class<int> cls = int.class;
        int mvectDecode = mvectDecode(bitReader2, this.fCode[0][0], this.mvPred[0][0][0]);
        int readVLC = MPEGConst.vlcDualPrime.readVLC(bitReader2) - 1;
        int mvectDecode2 = mvectDecode(bitReader2, this.fCode[0][1], this.mvPred[0][0][1]);
        int readVLC2 = MPEGConst.vlcDualPrime.readVLC(bitReader2) - 1;
        int i4 = 1 - i3;
        int dpXField = dpXField(mvectDecode, readVLC, i4);
        int dpYField = dpYField(mvectDecode2, readVLC2, i4);
        int i5 = this.chromaFormat == 1 ? 1 : 0;
        int i6 = this.chromaFormat == 3 ? 0 : 1;
        int i7 = this.chromaFormat == 1 ? 2 : 1;
        int i8 = this.chromaFormat == 3 ? 1 : 2;
        int[][] iArr2 = (int[][]) Array.newInstance(cls, new int[]{3, 256});
        int[][] iArr3 = (int[][]) Array.newInstance(cls, new int[]{3, 256});
        int i9 = i << 1;
        int i10 = i2 << 1;
        int i11 = i9 >> i6;
        int i12 = i11 + (mvectDecode / i8);
        int i13 = i10 >> i5;
        int i14 = i13 + (mvectDecode2 / i7);
        int i15 = i3;
        int i16 = i4;
        int i17 = mvectDecode2;
        predictPlane(pictureArr[i3].getPlaneData(0), i9 + mvectDecode, i10 + mvectDecode2, pictureArr[i3].getPlaneWidth(0), pictureArr[i3].getPlaneHeight(0), 1, i15, iArr2[0], 0, 16, 16, 0);
        int i18 = 16 >> i6;
        int i19 = 16 >> i5;
        int i20 = i14;
        int i21 = i18;
        int i22 = i19;
        predictPlane(pictureArr[i3].getPlaneData(1), i12, i20, pictureArr[i3].getPlaneWidth(1), pictureArr[i3].getPlaneHeight(1), 1, i15, iArr2[1], 0, i21, i22, 0);
        predictPlane(pictureArr[i3].getPlaneData(2), i12, i20, pictureArr[i3].getPlaneWidth(2), pictureArr[i3].getPlaneHeight(2), 1, i15, iArr2[2], 0, i21, i22, 0);
        int i23 = i9 + dpXField;
        int i24 = i10 + dpYField;
        int i25 = i11 + (dpXField / i8);
        int i26 = i13 + (dpYField / i7);
        int i27 = i16;
        predictPlane(pictureArr[i16].getPlaneData(0), i23, i24, pictureArr[i16].getPlaneWidth(0), pictureArr[i16].getPlaneHeight(0), 1, i27, iArr3[0], 0, 16, 16, 0);
        int i28 = i26;
        int i29 = i18;
        int i30 = i19;
        predictPlane(pictureArr[i16].getPlaneData(1), i25, i28, pictureArr[i16].getPlaneWidth(1), pictureArr[i16].getPlaneHeight(1), 1, i27, iArr3[1], 0, i29, i30, 0);
        predictPlane(pictureArr[i16].getPlaneData(2), i25, i28, pictureArr[i16].getPlaneWidth(2), pictureArr[i16].getPlaneHeight(2), 1, i27, iArr3[2], 0, i29, i30, 0);
        for (int i31 = 0; i31 < 3; i31++) {
            for (int i32 = 0; i32 < iArr[i31].length; i32++) {
                iArr[i31][i32] = ((iArr2[i31][i32] + iArr3[i31][i32]) + 1) >> 1;
            }
        }
        int[][][] iArr4 = this.mvPred;
        int[] iArr5 = iArr4[1][0];
        iArr4[0][0][0] = mvectDecode;
        iArr5[0] = mvectDecode;
        int[] iArr6 = iArr4[1][0];
        iArr4[0][0][1] = i17;
        iArr6[1] = i17;
    }

    private void predict16x16DualPrimeFrame(Picture[] pictureArr, int i, int i2, BitReader bitReader, int i3, int[][] iArr) {
        BitReader bitReader2 = bitReader;
        Class<int> cls = int.class;
        int mvectDecode = mvectDecode(bitReader2, this.fCode[0][0], this.mvPred[0][0][0]);
        int readVLC = MPEGConst.vlcDualPrime.readVLC(bitReader2) - 1;
        int mvectDecode2 = mvectDecode(bitReader2, this.fCode[0][1], this.mvPred[0][0][1] >> 1);
        int readVLC2 = MPEGConst.vlcDualPrime.readVLC(bitReader2) - 1;
        int i4 = this.topFieldFirst ? 1 : 3;
        int i5 = (((mvectDecode * i4) + (mvectDecode > 0 ? 1 : 0)) >> 1) + readVLC;
        int i6 = ((((mvectDecode2 * i4) + (mvectDecode2 > 0 ? 1 : 0)) >> 1) + readVLC2) - 1;
        int i7 = 4 - i4;
        int i8 = (((mvectDecode * i7) + (mvectDecode > 0 ? 1 : 0)) >> 1) + readVLC;
        int i9 = (((i7 * mvectDecode2) + (mvectDecode2 > 0 ? 1 : 0)) >> 1) + readVLC2 + 1;
        int i10 = this.chromaFormat == 1 ? 1 : 0;
        int i11 = this.chromaFormat == 3 ? 0 : 1;
        int i12 = this.chromaFormat == 1 ? 2 : 1;
        int i13 = this.chromaFormat == 3 ? 1 : 2;
        int[][] iArr2 = (int[][]) Array.newInstance(cls, new int[]{3, 256});
        int[][] iArr3 = (int[][]) Array.newInstance(cls, new int[]{3, 256});
        int i14 = i << 1;
        int i15 = i14 + mvectDecode;
        int i16 = i2 + mvectDecode2;
        int i17 = i14 >> i11;
        int i18 = i17 + (mvectDecode / i13);
        int i19 = i2 >> i10;
        int i20 = i19 + (mvectDecode2 / i12);
        predictPlane(pictureArr[0].getPlaneData(0), i15, i16, pictureArr[0].getPlaneWidth(0), pictureArr[0].getPlaneHeight(0), 1, 0, iArr2[0], 0, 16, 8, 1);
        int i21 = 16 >> i11;
        int i22 = 8 >> i10;
        int i23 = i18;
        int i24 = i20;
        int i25 = i21;
        int i26 = i22;
        predictPlane(pictureArr[0].getPlaneData(1), i23, i24, pictureArr[0].getPlaneWidth(1), pictureArr[0].getPlaneHeight(1), 1, 0, iArr2[1], 0, i25, i26, 1);
        predictPlane(pictureArr[0].getPlaneData(2), i23, i24, pictureArr[0].getPlaneWidth(2), pictureArr[0].getPlaneHeight(2), 1, 0, iArr2[2], 0, i25, i26, 1);
        predictPlane(pictureArr[1].getPlaneData(0), i15, i16, pictureArr[1].getPlaneWidth(0), pictureArr[1].getPlaneHeight(0), 1, 1, iArr2[0], 1, 16, 8, 1);
        int i27 = i18;
        int i28 = i20;
        int i29 = i21;
        int i30 = i22;
        predictPlane(pictureArr[1].getPlaneData(1), i27, i28, pictureArr[1].getPlaneWidth(1), pictureArr[1].getPlaneHeight(1), 1, 1, iArr2[1], 1, i29, i30, 1);
        predictPlane(pictureArr[1].getPlaneData(2), i27, i28, pictureArr[1].getPlaneWidth(2), pictureArr[1].getPlaneHeight(2), 1, 1, iArr2[2], 1, i29, i30, 1);
        int i31 = i14 + i5;
        int i32 = i2 + i6;
        int i33 = i17 + (i5 / i13);
        int i34 = i19 + (i6 / i12);
        predictPlane(pictureArr[1].getPlaneData(0), i31, i32, pictureArr[1].getPlaneWidth(0), pictureArr[1].getPlaneHeight(0), 1, 1, iArr3[0], 0, 16, 8, 1);
        int i35 = i33;
        int i36 = i34;
        int i37 = i21;
        int i38 = i22;
        predictPlane(pictureArr[1].getPlaneData(1), i35, i36, pictureArr[1].getPlaneWidth(1), pictureArr[1].getPlaneHeight(1), 1, 1, iArr3[1], 0, i37, i38, 1);
        predictPlane(pictureArr[1].getPlaneData(2), i35, i36, pictureArr[1].getPlaneWidth(2), pictureArr[1].getPlaneHeight(2), 1, 1, iArr3[2], 0, i37, i38, 1);
        int i39 = i17 + (i8 / i13);
        int i40 = i19 + (i9 / i12);
        predictPlane(pictureArr[0].getPlaneData(0), i14 + i8, i2 + i9, pictureArr[0].getPlaneWidth(0), pictureArr[0].getPlaneHeight(0), 1, 0, iArr3[0], 1, 16, 8, 1);
        int i41 = i21;
        int i42 = i22;
        predictPlane(pictureArr[0].getPlaneData(1), i39, i40, pictureArr[0].getPlaneWidth(1), pictureArr[0].getPlaneHeight(1), 1, 0, iArr3[1], 1, i41, i42, 1);
        predictPlane(pictureArr[0].getPlaneData(2), i39, i40, pictureArr[0].getPlaneWidth(2), pictureArr[0].getPlaneHeight(2), 1, 0, iArr3[2], 1, i41, i42, 1);
        for (int i43 = 0; i43 < 3; i43++) {
            for (int i44 = 0; i44 < iArr[i43].length; i44++) {
                iArr[i43][i44] = ((iArr2[i43][i44] + iArr3[i43][i44]) + 1) >> 1;
            }
        }
        int[][][] iArr4 = this.mvPred;
        int[] iArr5 = iArr4[1][0];
        iArr4[0][0][0] = mvectDecode;
        iArr5[0] = mvectDecode;
        int[] iArr6 = iArr4[1][0];
        int i45 = mvectDecode2 << 1;
        iArr4[0][0][1] = i45;
        iArr6[1] = i45;
    }

    private void predict16x8MC(Picture[] pictureArr, int i, int i2, BitReader bitReader, int i3, int[][] iArr, int i4, int i5) {
        int read1Bit = bitReader.read1Bit();
        predictGeneric(pictureArr[read1Bit], i, i2 + i4, bitReader, i3, iArr, i4, 16, 8, 1, read1Bit, 0, i5, 0);
    }

    private void predictFieldInFrame(Picture picture, int i, int i2, int[][] iArr, BitReader bitReader, int i3, int i4) {
        int i5 = i4;
        int i6 = i2 >> 1;
        int read1Bit = bitReader.read1Bit();
        predictGeneric(picture, i, i6, bitReader, i3, iArr, 0, 16, 8, 1, read1Bit, 1, 0, 1);
        if (i5 == 0 || i5 == 1) {
            predictGeneric(picture, i, i6, bitReader, i3, iArr, 1, 16, 8, 1, bitReader.read1Bit(), 1, 1, 1);
            return;
        }
        int[][][] iArr2 = this.mvPred;
        iArr2[1][i3][0] = iArr2[0][i3][0];
        iArr2[1][i3][1] = iArr2[0][i3][1];
        predictMB(picture, iArr2[1][i3][0], 0, iArr2[1][i3][1], 0, 16, 8, 1, 1 - read1Bit, iArr, 1, 1);
    }

    private final int sign_extend(int i, int i2) {
        int i3 = 32 - i2;
        return (i << i3) >> i3;
    }

    /* access modifiers changed from: protected */
    public final int getPix1(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        return iArr[(MathUtil.clip(i4, 0, (i2 - (1 << i5)) + i6) * i) + MathUtil.clip(i3, 0, i - 1)];
    }

    /* access modifiers changed from: protected */
    public final int getPix2(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i - 1;
        int i10 = (i2 - (1 << i7)) + i8;
        return ((iArr[(MathUtil.clip(i4, 0, i10) * i) + MathUtil.clip(i3, 0, i9)] + iArr[(MathUtil.clip(i6, 0, i10) * i) + MathUtil.clip(i5, 0, i9)]) + 1) >> 1;
    }

    /* access modifiers changed from: protected */
    public final int getPix4(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13 = (i2 - (1 << i11)) + i12;
        int i14 = i - 1;
        return ((((iArr[(MathUtil.clip(i4, 0, i13) * i) + MathUtil.clip(i3, 0, i14)] + iArr[(MathUtil.clip(i6, 0, i13) * i) + MathUtil.clip(i5, 0, i14)]) + iArr[(MathUtil.clip(i8, 0, i13) * i) + MathUtil.clip(i7, 0, i14)]) + iArr[(MathUtil.clip(i10, 0, i13) * i) + MathUtil.clip(i9, 0, i14)]) + 3) >> 2;
    }

    /* access modifiers changed from: protected */
    public void predict16x16Field(Picture[] pictureArr, int i, int i2, BitReader bitReader, int i3, int[][] iArr) {
        int read1Bit = bitReader.read1Bit();
        predictGeneric(pictureArr[read1Bit], i, i2, bitReader, i3, iArr, 0, 16, 16, 1, read1Bit, 0, 0, 0);
        int[][][] iArr2 = this.mvPred;
        iArr2[1][i3][0] = iArr2[0][i3][0];
        iArr2[1][i3][1] = iArr2[0][i3][1];
    }

    /* access modifiers changed from: protected */
    public void predict16x16Frame(Picture picture, int i, int i2, BitReader bitReader, int i3, int[][] iArr) {
        predictGeneric(picture, i, i2, bitReader, i3, iArr, 0, 16, 16, 0, 0, 0, 0, 0);
        int[][][] iArr2 = this.mvPred;
        iArr2[1][i3][0] = iArr2[0][i3][0];
        iArr2[1][i3][1] = iArr2[0][i3][1];
    }

    public void predict16x16NoMV(Picture picture, int i, int i2, int i3, int i4, int[][] iArr) {
        int i5 = i3;
        if (i5 == 3) {
            int i6 = i << 1;
            int[][][] iArr2 = this.mvPred;
            predictMB(picture, i6, iArr2[0][i4][0], i2 << 1, iArr2[0][i4][1], 16, 16, 0, 0, iArr, 0, 0);
            return;
        }
        int i7 = i << 1;
        int[][][] iArr3 = this.mvPred;
        predictMB(picture, i7, iArr3[0][i4][0], i2 << 1, iArr3[0][i4][1], 16, 16, 1, i5 - 1, iArr, 0, 0);
    }

    public void predictEvenEvenSafe(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr2, int i7, int i8, int i9, int i10) {
        int i11 = (((i2 << i5) + i6) * i3) + i;
        int i12 = i7 * i8;
        int i13 = (i3 << i5) - i8;
        int i14 = i10 * i8;
        int i15 = i11;
        for (int i16 = 0; i16 < i9; i16++) {
            int i17 = i15;
            int i18 = 0;
            while (i18 < i8) {
                int i19 = i12 + 1;
                int i20 = i17 + 1;
                iArr2[i12] = iArr[i17];
                i18++;
                i12 = i19;
                i17 = i20;
            }
            i15 = i17 + i13;
            i12 += i14;
        }
    }

    public void predictEvenEvenUnSafe(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr2, int i7, int i8, int i9, int i10) {
        int i11 = i8;
        int i12 = i10 * i11;
        int i13 = i11 * i7;
        int i14 = i9;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = ((i15 + i2) << i5) + i6;
            int i17 = i13;
            int i18 = 0;
            while (i18 < i11) {
                int i19 = i17 + 1;
                iArr2[i17] = getPix1(iArr, i3, i4, i18 + i, i16, i5, i6);
                i18++;
                i17 = i19;
            }
            i13 = i17 + i12;
        }
    }

    public void predictEvenOddSafe(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr2, int i7, int i8, int i9, int i10) {
        int i11 = (((i2 << i5) + i6) * i3) + i;
        int i12 = i7 * i8;
        int i13 = (i3 << i5) - i8;
        int i14 = i10 * i8;
        int i15 = i11;
        for (int i16 = 0; i16 < i9; i16++) {
            int i17 = i15;
            int i18 = 0;
            while (i18 < i8) {
                int i19 = i12 + 1;
                int i20 = iArr[i17];
                i17++;
                iArr2[i12] = ((i20 + iArr[i17]) + 1) >> 1;
                i18++;
                i12 = i19;
            }
            i15 = i17 + i13;
            i12 += i14;
        }
    }

    public void predictEvenOddUnSafe(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr2, int i7, int i8, int i9, int i10) {
        int i11 = i8;
        int i12 = i10 * i11;
        int i13 = i11 * i7;
        int i14 = i9;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = ((i15 + i2) << i5) + i6;
            int i17 = i13;
            int i18 = 0;
            while (i18 < i11) {
                int i19 = i17 + 1;
                int i20 = i18 + i;
                iArr2[i17] = getPix2(iArr, i3, i4, i20, i16, i20 + 1, i16, i5, i6);
                i18++;
                i17 = i19;
            }
            i13 = i17 + i12;
        }
    }

    /* access modifiers changed from: protected */
    public void predictGeneric(Picture picture, int i, int i2, BitReader bitReader, int i3, int[][] iArr, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        BitReader bitReader2 = bitReader;
        int mvectDecode = mvectDecode(bitReader2, this.fCode[i3][0], this.mvPred[i10][i3][0]);
        int mvectDecode2 = mvectDecode(bitReader2, this.fCode[i3][1], this.mvPred[i10][i3][1] >> i11);
        predictMB(picture, i << 1, mvectDecode, i2 << 1, mvectDecode2, i5, i6, i7, i8, iArr, i4, i9);
        int[][][] iArr2 = this.mvPred;
        iArr2[i10][i3][0] = mvectDecode;
        iArr2[i10][i3][1] = mvectDecode2 << i11;
    }

    public void predictInField(Picture[] pictureArr, int i, int i2, int[][] iArr, BitReader bitReader, int i3, int i4, int i5) {
        int i6 = i3;
        if (i6 == 1) {
            predict16x16Field(pictureArr, i, i2, bitReader, i4, iArr);
        } else if (i6 == 2) {
            predict16x8MC(pictureArr, i, i2, bitReader, i4, iArr, 0, 0);
            predict16x8MC(pictureArr, i, i2, bitReader, i4, iArr, 8, 1);
        } else if (i6 == 3) {
            predict16x16DualPrimeField(pictureArr, i, i2, bitReader, iArr, i5);
        }
    }

    public void predictInFrame(Picture picture, int i, int i2, int[][] iArr, BitReader bitReader, int i3, int i4, int i5) {
        int i6 = i3;
        Picture[] pictureArr = {picture, picture};
        if (i6 == 1) {
            predictFieldInFrame(picture, i, i2, iArr, bitReader, i4, i5);
        } else if (i6 == 2) {
            predict16x16Frame(picture, i, i2, bitReader, i4, iArr);
        } else if (i6 == 3) {
            predict16x16DualPrimeFrame(pictureArr, i, i2, bitReader, i4, iArr);
        }
    }

    public void predictMB(Picture picture, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[][] iArr, int i9, int i10) {
        Picture picture2 = picture;
        int i11 = this.chromaFormat == 1 ? 1 : 0;
        int i12 = this.chromaFormat == 3 ? 0 : 1;
        int i13 = this.chromaFormat == 1 ? 2 : 1;
        int i14 = this.chromaFormat == 3 ? 1 : 2;
        int i15 = i7;
        int i16 = i8;
        int i17 = i9;
        int i18 = i10;
        predictPlane(picture2.getPlaneData(0), i + i2, i3 + i4, picture2.getPlaneWidth(0), picture2.getPlaneHeight(0), i15, i16, iArr[0], i17, i5, i6, i18);
        int i19 = (i >> i12) + (i2 / i14);
        int i20 = (i3 >> i11) + (i4 / i13);
        int i21 = i5 >> i12;
        int i22 = i6 >> i11;
        predictPlane(picture2.getPlaneData(1), i19, i20, picture2.getPlaneWidth(1), picture2.getPlaneHeight(1), i15, i16, iArr[1], i17, i21, i22, i18);
        predictPlane(picture2.getPlaneData(2), i19, i20, picture2.getPlaneWidth(2), picture2.getPlaneHeight(2), i15, i16, iArr[2], i17, i21, i22, i18);
    }

    public void predictOddEvenSafe(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr2, int i7, int i8, int i9, int i10) {
        int i11 = (((i2 << i5) + i6) * i3) + i;
        int i12 = i7 * i8;
        int i13 = i3 << i5;
        int i14 = i13 - i8;
        int i15 = i10 * i8;
        int i16 = i11;
        for (int i17 = 0; i17 < i9; i17++) {
            int i18 = i16;
            int i19 = 0;
            while (i19 < i8) {
                int i20 = i12 + 1;
                iArr2[i12] = ((iArr[i18] + iArr[i18 + i13]) + 1) >> 1;
                i18++;
                i19++;
                i12 = i20;
            }
            i16 = i18 + i14;
            i12 += i15;
        }
    }

    public void predictOddEvenUnSafe(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr2, int i7, int i8, int i9, int i10) {
        int i11 = i8;
        int i12 = i11 * i7;
        int i13 = i10 * i11;
        int i14 = i9;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i15 + i2;
            int i17 = (i16 << i5) + i6;
            int i18 = ((i16 + 1) << i5) + i6;
            int i19 = i12;
            int i20 = 0;
            while (i20 < i11) {
                int i21 = i19 + 1;
                int i22 = i20 + i;
                int i23 = i20;
                iArr2[i19] = getPix2(iArr, i3, i4, i22, i17, i22, i18, i5, i6);
                i20 = i23 + 1;
                i19 = i21;
            }
            i12 = i19 + i13;
        }
    }

    public void predictOddOddSafe(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr2, int i7, int i8, int i9, int i10) {
        int i11 = i8;
        int i12 = i3 << i5;
        int i13 = i12 - i11;
        int i14 = i10 * i11;
        int i15 = (((i2 << i5) + i6) * i3) + i;
        int i16 = i11 * i7;
        int i17 = i9;
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i16;
            int i20 = i15;
            int i21 = 0;
            while (i21 < i11) {
                int i22 = i19 + 1;
                int i23 = i20 + 1;
                int i24 = i20 + i12;
                iArr2[i19] = ((((iArr[i20] + iArr[i23]) + iArr[i24]) + iArr[i24 + 1]) + 3) >> 2;
                i21++;
                i19 = i22;
                i20 = i23;
            }
            i15 = i20 + i13;
            i16 = i19 + i14;
        }
    }

    public void predictOddOddUnSafe(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr2, int i7, int i8, int i9, int i10) {
        int i11 = i8;
        int i12 = i11 * i7;
        int i13 = i10 * i11;
        int i14 = i9;
        int i15 = 0;
        while (i15 < i14) {
            int i16 = i15 + i2;
            int i17 = (i16 << i5) + i6;
            int i18 = ((i16 + 1) << i5) + i6;
            int i19 = i12;
            int i20 = 0;
            while (i20 < i11) {
                int i21 = i20 + i;
                int i22 = i19 + 1;
                int i23 = i21 + 1;
                int i24 = i20;
                int i25 = i15;
                iArr2[i19] = getPix4(iArr, i3, i4, i21, i17, i23, i17, i21, i18, i23, i18, i5, i6);
                i20 = i24 + 1;
                int i26 = i9;
                i19 = i22;
                i15 = i25;
            }
            i12 = i19 + i13;
            i15++;
            i14 = i9;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void predictPlane(int[] r14, int r15, int r16, int r17, int r18, int r19, int r20, int[] r21, int r22, int r23, int r24, int r25) {
        /*
            r13 = this;
            int r2 = r15 >> 1
            int r3 = r16 >> 1
            r0 = 1
            if (r2 < 0) goto L_0x0019
            if (r3 < 0) goto L_0x0019
            int r1 = r2 + r23
            r4 = r17
            if (r1 >= r4) goto L_0x001b
            int r1 = r3 + r24
            int r1 = r1 << r19
            r5 = r18
            if (r1 >= r5) goto L_0x001d
            r1 = 1
            goto L_0x001e
        L_0x0019:
            r4 = r17
        L_0x001b:
            r5 = r18
        L_0x001d:
            r1 = 0
        L_0x001e:
            r6 = r15 & 1
            if (r6 != 0) goto L_0x008e
            r0 = r16 & 1
            if (r0 != 0) goto L_0x005a
            if (r1 == 0) goto L_0x0041
            r0 = r13
            r1 = r14
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r0.predictEvenEvenSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00f5
        L_0x0041:
            r0 = r13
            r1 = r14
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r0.predictEvenEvenUnSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00f5
        L_0x005a:
            if (r1 == 0) goto L_0x0075
            r0 = r13
            r1 = r14
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r0.predictOddEvenSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00f5
        L_0x0075:
            r0 = r13
            r1 = r14
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r0.predictOddEvenUnSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00f5
        L_0x008e:
            r0 = r16 & 1
            if (r0 != 0) goto L_0x00c4
            if (r1 == 0) goto L_0x00ac
            r0 = r13
            r1 = r14
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r0.predictEvenOddSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00f5
        L_0x00ac:
            r0 = r13
            r1 = r14
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r0.predictEvenOddUnSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00f5
        L_0x00c4:
            if (r1 == 0) goto L_0x00de
            r0 = r13
            r1 = r14
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r0.predictOddOddSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00f5
        L_0x00de:
            r0 = r13
            r1 = r14
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r0.predictOddOddUnSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.mpeg12.MPEGPred.predictPlane(int[], int, int, int, int, int, int, int[], int, int, int, int):void");
    }

    public void reset() {
        int[][][] iArr = this.mvPred;
        int[] iArr2 = iArr[0][0];
        int[] iArr3 = iArr[0][0];
        int[] iArr4 = iArr[0][1];
        int[] iArr5 = iArr[0][1];
        int[] iArr6 = iArr[1][0];
        int[] iArr7 = iArr[1][0];
        int[] iArr8 = iArr[1][1];
        iArr[1][1][1] = 0;
        iArr8[0] = 0;
        iArr7[1] = 0;
        iArr6[0] = 0;
        iArr5[1] = 0;
        iArr4[0] = 0;
        iArr3[1] = 0;
        iArr2[0] = 0;
    }

    public MPEGPred(MPEGPred mPEGPred) {
        this.fCode = mPEGPred.fCode;
        this.chromaFormat = mPEGPred.chromaFormat;
        this.topFieldFirst = mPEGPred.topFieldFirst;
    }
}
