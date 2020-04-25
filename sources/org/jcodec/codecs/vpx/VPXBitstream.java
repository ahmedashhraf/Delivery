package org.jcodec.codecs.vpx;

import org.jcodec.codecs.common.biari.VPxBooleanEncoder;
import org.jcodec.common.tools.MathUtil;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class VPXBitstream {
    public static final int[] coeffBandMapping = {0, 1, 2, 3, 6, 4, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7};
    private int[][] dctNzLeft = {new int[4], new int[2], new int[2]};
    private int[][] dctNzTop;
    private int[][][][] tokenBinProbs;
    private int whtNzLeft = 0;
    private int[] whtNzTop;

    public VPXBitstream(int[][][][] iArr, int i) {
        this.tokenBinProbs = iArr;
        this.whtNzTop = new int[i];
        int i2 = i << 1;
        this.dctNzTop = new int[][]{new int[(i << 2)], new int[i2], new int[i2]};
    }

    private int countCoeff(int[] iArr, int i) {
        while (i > 0) {
            i--;
            if (iArr[i] != 0) {
                return i + 1;
            }
        }
        return i;
    }

    private int fastCountCoeffWHT(int[] iArr) {
        if (iArr[15] != 0) {
            return 16;
        }
        return countCoeff(iArr, 15);
    }

    private static void writeCat3Ext(VPxBooleanEncoder vPxBooleanEncoder, int i) {
        int i2 = i - 11;
        vPxBooleanEncoder.writeBit(C13959t.f40804J2, i2 >> 2);
        vPxBooleanEncoder.writeBit(C13959t.f40921k2, (i2 >> 1) & 1);
        vPxBooleanEncoder.writeBit(C13959t.f40882c2, i2 & 1);
    }

    private static void writeCat4Ext(VPxBooleanEncoder vPxBooleanEncoder, int i) {
        int i2 = i - 19;
        vPxBooleanEncoder.writeBit(C13959t.f40816M2, i2 >> 3);
        vPxBooleanEncoder.writeBit(C13959t.f40949r2, (i2 >> 2) & 1);
        vPxBooleanEncoder.writeBit(C13959t.f40882c2, (i2 >> 1) & 1);
        vPxBooleanEncoder.writeBit(C13959t.f40859X1, i2 & 1);
    }

    private static final void writeCatExt(VPxBooleanEncoder vPxBooleanEncoder, int i, int i2, int[] iArr) {
        int i3 = i - i2;
        int length = iArr.length - 1;
        int i4 = 0;
        while (length >= 0) {
            int i5 = i4 + 1;
            vPxBooleanEncoder.writeBit(iArr[i4], (i3 >> length) & 1);
            length--;
            i4 = i5;
        }
    }

    public void encodeCoeffs(VPxBooleanEncoder vPxBooleanEncoder, int[] iArr, int i, int i2, int i3, int i4) {
        boolean z = false;
        while (i < i2) {
            int[] iArr2 = this.tokenBinProbs[i3][coeffBandMapping[i]][i4];
            int abs = MathUtil.abs(iArr[i]);
            if (!z) {
                vPxBooleanEncoder.writeBit(iArr2[0], 1);
            }
            if (abs == 0) {
                vPxBooleanEncoder.writeBit(iArr2[1], 0);
                i4 = 0;
            } else {
                vPxBooleanEncoder.writeBit(iArr2[1], 1);
                int i5 = 2;
                if (abs == 1) {
                    vPxBooleanEncoder.writeBit(iArr2[2], 0);
                    i5 = 1;
                } else {
                    vPxBooleanEncoder.writeBit(iArr2[2], 1);
                    if (abs <= 4) {
                        vPxBooleanEncoder.writeBit(iArr2[3], 0);
                        if (abs == 2) {
                            vPxBooleanEncoder.writeBit(iArr2[4], 0);
                        } else {
                            vPxBooleanEncoder.writeBit(iArr2[4], 1);
                            vPxBooleanEncoder.writeBit(iArr2[5], abs - 3);
                        }
                    } else {
                        vPxBooleanEncoder.writeBit(iArr2[3], 1);
                        if (abs <= 10) {
                            vPxBooleanEncoder.writeBit(iArr2[6], 0);
                            if (abs <= 6) {
                                vPxBooleanEncoder.writeBit(iArr2[7], 0);
                                vPxBooleanEncoder.writeBit(C13959t.f40965v2, abs - 5);
                            } else {
                                vPxBooleanEncoder.writeBit(iArr2[7], 1);
                                int i6 = abs - 7;
                                vPxBooleanEncoder.writeBit(C13959t.f40772B2, i6 >> 1);
                                vPxBooleanEncoder.writeBit(C13959t.f40907h2, i6 & 1);
                            }
                        } else {
                            vPxBooleanEncoder.writeBit(iArr2[6], 1);
                            if (abs <= 34) {
                                vPxBooleanEncoder.writeBit(iArr2[8], 0);
                                if (abs <= 18) {
                                    vPxBooleanEncoder.writeBit(iArr2[9], 0);
                                    writeCat3Ext(vPxBooleanEncoder, abs);
                                } else {
                                    vPxBooleanEncoder.writeBit(iArr2[9], 1);
                                    writeCat4Ext(vPxBooleanEncoder, abs);
                                }
                            } else {
                                vPxBooleanEncoder.writeBit(iArr2[8], 1);
                                if (abs <= 66) {
                                    vPxBooleanEncoder.writeBit(iArr2[10], 0);
                                    writeCatExt(vPxBooleanEncoder, abs, 35, VPXConst.probCoeffExtCat5);
                                } else {
                                    vPxBooleanEncoder.writeBit(iArr2[10], 1);
                                    writeCatExt(vPxBooleanEncoder, abs, 67, VPXConst.probCoeffExtCat6);
                                }
                            }
                        }
                    }
                }
                vPxBooleanEncoder.writeBit(128, MathUtil.sign(iArr[i]));
                i4 = i5;
            }
            z = abs == 0;
            i++;
        }
        if (i2 < 16) {
            vPxBooleanEncoder.writeBit(this.tokenBinProbs[i3][coeffBandMapping[i]][i4][0], 0);
        }
    }

    public void encodeCoeffsDCT15(VPxBooleanEncoder vPxBooleanEncoder, int[] iArr, int i, int i2, int i3) {
        int countCoeff = countCoeff(iArr, 16);
        int i4 = (i << 2) + i2;
        encodeCoeffs(vPxBooleanEncoder, iArr, 1, countCoeff, 0, ((i4 == 0 || this.dctNzLeft[0][i3] <= 0) ? 0 : 1) + (this.dctNzTop[0][i4] > 0 ? 1 : 0));
        int i5 = countCoeff - 1;
        this.dctNzLeft[0][i3] = Math.max(i5, 0);
        this.dctNzTop[0][i4] = Math.max(i5, 0);
    }

    public void encodeCoeffsDCT16(VPxBooleanEncoder vPxBooleanEncoder, int[] iArr, int i, int i2, int i3) {
        int countCoeff = countCoeff(iArr, 16);
        int i4 = (i << 2) + i2;
        int i5 = 1;
        int i6 = (i4 == 0 || this.dctNzLeft[0][i3] <= 0) ? 0 : 1;
        if (this.dctNzTop[0][i4] <= 0) {
            i5 = 0;
        }
        encodeCoeffs(vPxBooleanEncoder, iArr, 0, countCoeff, 3, i6 + i5);
        this.dctNzLeft[0][i3] = countCoeff;
        this.dctNzTop[0][i4] = countCoeff;
    }

    public void encodeCoeffsDCTUV(VPxBooleanEncoder vPxBooleanEncoder, int[] iArr, int i, int i2, int i3, int i4) {
        int countCoeff = countCoeff(iArr, 16);
        int i5 = (i2 << 1) + i3;
        int i6 = 0;
        int i7 = (i5 == 0 || this.dctNzLeft[i][i4] <= 0) ? 0 : 1;
        if (this.dctNzTop[i][i5] > 0) {
            i6 = 1;
        }
        encodeCoeffs(vPxBooleanEncoder, iArr, 0, countCoeff, 2, i7 + i6);
        this.dctNzLeft[i][i4] = countCoeff;
        this.dctNzTop[i][i5] = countCoeff;
    }

    public void encodeCoeffsWHT(VPxBooleanEncoder vPxBooleanEncoder, int[] iArr, int i) {
        int fastCountCoeffWHT = fastCountCoeffWHT(iArr);
        int i2 = 1;
        int i3 = (i == 0 || this.whtNzLeft <= 0) ? 0 : 1;
        if (this.whtNzTop[i] <= 0) {
            i2 = 0;
        }
        encodeCoeffs(vPxBooleanEncoder, iArr, 0, fastCountCoeffWHT, 1, i3 + i2);
        this.whtNzLeft = fastCountCoeffWHT;
        this.whtNzTop[i] = fastCountCoeffWHT;
    }
}
