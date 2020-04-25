package org.jcodec.codecs.h264.decode.deblock;

import java.lang.reflect.Array;
import org.jcodec.codecs.h264.p552io.model.MBType;
import org.jcodec.codecs.h264.p552io.model.SliceHeader;
import org.jcodec.codecs.mjpeg.JpegConst;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.tools.MathUtil;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class DeblockingFilter {
    static int[] alphaTab = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 5, 6, 7, 8, 9, 10, 12, 13, 15, 17, 20, 22, 25, 28, 32, 36, 40, 45, 50, 56, 63, 71, 80, 90, 101, 113, C13959t.f40827P1, C13959t.f40902g2, C13959t.f40977y2, C13959t.f40840S2, 203, JpegConst.APP2, 255, 255};
    static int[] betaTab = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18};
    static int[] inverse = {0, 1, 4, 5, 2, 3, 6, 7, 8, 9, 12, 13, 10, 11, 14, 15};
    static int[][] tcs = {new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 6, 7, 8, 9, 10, 11, 13}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 7, 8, 8, 10, 11, 12, 13, 15, 17}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 6, 7, 8, 9, 10, 11, 13, 14, 16, 18, 20, 23, 25}};
    private int[][] mbQps;
    private MBType[] mbTypes;
    private int[][][][] mvs;
    private int[][] nCoeff;
    private Picture[][][] refsUsed;
    private SliceHeader[] shs;
    private boolean[] tr8x8Used;

    public DeblockingFilter(int i, int i2, int[][] iArr, int[][][][] iArr2, MBType[] mBTypeArr, int[][] iArr3, SliceHeader[] sliceHeaderArr, boolean[] zArr, Picture[][][] pictureArr) {
        this.nCoeff = iArr;
        this.mvs = iArr2;
        this.mbTypes = mBTypeArr;
        this.mbQps = iArr3;
        this.shs = sliceHeaderArr;
        this.tr8x8Used = zArr;
        this.refsUsed = pictureArr;
    }

    private int calcBoundaryStrenth(boolean z, boolean z2, boolean z3, int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i3, int i4) {
        if (z && (z2 || z3)) {
            return 4;
        }
        if (z2 || z3) {
            return 3;
        }
        if (i > 0 || i2 > 0) {
            return 2;
        }
        int i5 = 0;
        if ((iArr[2] == -1 ? 0 : 1) + (iArr3[2] == -1 ? 0 : 1) != (iArr2[2] == -1 ? 0 : 1) + (iArr4[2] == -1 ? 0 : 1)) {
            return 1;
        }
        Picture picture = null;
        Picture picture2 = iArr[2] < 0 ? null : this.refsUsed[i3][0][iArr[2]];
        Picture picture3 = iArr3[2] < 0 ? null : this.refsUsed[i3][1][iArr3[2]];
        Picture picture4 = iArr2[2] < 0 ? null : this.refsUsed[i4][0][iArr2[2]];
        if (iArr4[2] >= 0) {
            picture = this.refsUsed[i4][1][iArr4[2]];
        }
        if ((picture2 != picture4 && picture2 != picture) || ((picture3 != picture4 && picture3 != picture) || ((picture4 != picture2 && picture4 != picture3) || (picture != picture2 && picture != picture3)))) {
            return 1;
        }
        if (picture2 == picture3 && picture3 == picture4 && picture4 == picture) {
            if (picture2 != null && (mvThresh(iArr, iArr2) || mvThresh(iArr3, iArr2) || mvThresh(iArr, iArr4) || mvThresh(iArr3, iArr4))) {
                i5 = 1;
            }
            return i5;
        } else if (picture2 == picture4 && picture3 == picture) {
            if ((picture2 != null && mvThresh(iArr, iArr2)) || (picture3 != null && mvThresh(iArr3, iArr4))) {
                i5 = 1;
            }
            return i5;
        } else {
            if (picture2 == picture && picture3 == picture4 && ((picture2 != null && mvThresh(iArr, iArr4)) || (picture3 != null && mvThresh(iArr3, iArr2)))) {
                i5 = 1;
            }
            return i5;
        }
    }

    private void calcBsH(Picture picture, int i, int[][] iArr) {
        SliceHeader[] sliceHeaderArr = this.shs;
        SliceHeader sliceHeader = sliceHeaderArr[i];
        char c = 1;
        int i2 = sliceHeader.sps.pic_width_in_mbs_minus1 + 1;
        int i3 = i % i2;
        int i4 = i / i2;
        boolean z = i4 > 0 && (sliceHeader.disable_deblocking_filter_idc != 2 || sliceHeaderArr[i - i2] == sliceHeader);
        MBType[] mBTypeArr = this.mbTypes;
        boolean z2 = mBTypeArr[i] != null && mBTypeArr[i].isIntra();
        int i5 = 4;
        if (z) {
            MBType[] mBTypeArr2 = this.mbTypes;
            int i6 = i - i2;
            boolean z3 = mBTypeArr2[i6] != null && mBTypeArr2[i6].isIntra();
            int i7 = 0;
            while (i7 < i5) {
                int i8 = (i3 << 2) + i7;
                int i9 = i4 << 2;
                int[] iArr2 = iArr[0];
                int[][] iArr3 = this.nCoeff;
                int i10 = iArr3[i9][i8];
                int i11 = i9 - 1;
                int i12 = iArr3[i11][i8];
                int[][][][] iArr4 = this.mvs;
                int[] iArr5 = iArr4[0][i9][i8];
                int[] iArr6 = iArr4[0][i11][i8];
                int[] iArr7 = iArr4[c][i9][i8];
                int[] iArr8 = iArr4[c][i11][i8];
                int i13 = i12;
                int[] iArr9 = iArr5;
                int[] iArr10 = iArr6;
                int[] iArr11 = iArr7;
                int i14 = i7;
                iArr2[i14] = calcBoundaryStrenth(true, z3, z2, i10, i13, iArr9, iArr10, iArr11, iArr8, i, i6);
                i7 = i14 + 1;
                i5 = 4;
                c = 1;
            }
        }
        int i15 = 1;
        while (i15 < 4) {
            int i16 = 0;
            while (i16 < 4) {
                int i17 = (i3 << 2) + i16;
                int i18 = (i4 << 2) + i15;
                int[] iArr12 = iArr[i15];
                int[][] iArr13 = this.nCoeff;
                int i19 = iArr13[i18][i17];
                int i20 = i18 - 1;
                int i21 = iArr13[i20][i17];
                int[][][][] iArr14 = this.mvs;
                int[] iArr15 = iArr14[0][i18][i17];
                int[] iArr16 = iArr14[0][i20][i17];
                int[] iArr17 = iArr14[1][i18][i17];
                int[] iArr18 = iArr14[1][i20][i17];
                int i22 = i21;
                int[] iArr19 = iArr15;
                int[] iArr20 = iArr16;
                int[] iArr21 = iArr17;
                int[] iArr22 = iArr18;
                int i23 = i16;
                int i24 = i15;
                iArr12[i23] = calcBoundaryStrenth(false, z2, z2, i19, i22, iArr19, iArr20, iArr21, iArr22, i, i);
                i16 = i23 + 1;
                i15 = i24;
            }
            i15++;
        }
    }

    private void calcBsV(Picture picture, int i, int[][] iArr) {
        SliceHeader[] sliceHeaderArr = this.shs;
        SliceHeader sliceHeader = sliceHeaderArr[i];
        char c = 1;
        int i2 = sliceHeader.sps.pic_width_in_mbs_minus1 + 1;
        int i3 = i % i2;
        int i4 = i / i2;
        boolean z = i3 > 0 && (sliceHeader.disable_deblocking_filter_idc != 2 || sliceHeaderArr[i + -1] == sliceHeader);
        MBType[] mBTypeArr = this.mbTypes;
        boolean z2 = mBTypeArr[i] != null && mBTypeArr[i].isIntra();
        int i5 = 4;
        if (z) {
            MBType[] mBTypeArr2 = this.mbTypes;
            int i6 = i - 1;
            boolean z3 = mBTypeArr2[i6] != null && mBTypeArr2[i6].isIntra();
            int i7 = 0;
            while (i7 < i5) {
                int i8 = i3 << 2;
                int i9 = (i4 << 2) + i7;
                int[] iArr2 = iArr[i7];
                int[][] iArr3 = this.nCoeff;
                int i10 = iArr3[i9][i8];
                int i11 = i8 - 1;
                int i12 = iArr3[i9][i11];
                int[][][][] iArr4 = this.mvs;
                int[] iArr5 = iArr4[0][i9][i8];
                int[] iArr6 = iArr4[0][i9][i11];
                int[] iArr7 = iArr4[c][i9][i8];
                int[] iArr8 = iArr4[c][i9][i11];
                int i13 = i12;
                int[] iArr9 = iArr5;
                int[] iArr10 = iArr6;
                int[] iArr11 = iArr7;
                int i14 = i7;
                iArr2[0] = calcBoundaryStrenth(true, z3, z2, i10, i13, iArr9, iArr10, iArr11, iArr8, i, i6);
                i7 = i14 + 1;
                i5 = 4;
                c = 1;
            }
        }
        int i15 = 1;
        while (i15 < 4) {
            int i16 = 0;
            while (i16 < 4) {
                int i17 = (i3 << 2) + i15;
                int i18 = (i4 << 2) + i16;
                int[] iArr12 = iArr[i16];
                int[][] iArr13 = this.nCoeff;
                int i19 = iArr13[i18][i17];
                int i20 = i17 - 1;
                int i21 = iArr13[i18][i20];
                int[][][][] iArr14 = this.mvs;
                int[] iArr15 = iArr14[0][i18][i17];
                int[] iArr16 = iArr14[0][i18][i20];
                int[] iArr17 = iArr14[1][i18][i17];
                int[] iArr18 = iArr14[1][i18][i20];
                int i22 = i21;
                int[] iArr19 = iArr15;
                int[] iArr20 = iArr16;
                int[] iArr21 = iArr17;
                int[] iArr22 = iArr18;
                int i23 = i16;
                int i24 = i15;
                iArr12[i24] = calcBoundaryStrenth(false, z2, z2, i19, i22, iArr19, iArr20, iArr21, iArr22, i, i);
                i16 = i23 + 1;
                i15 = i24;
            }
            i15++;
        }
    }

    private void fillHorizontalEdge(Picture picture, int i, int i2, int[][] iArr) {
        SliceHeader[] sliceHeaderArr = this.shs;
        SliceHeader sliceHeader = sliceHeaderArr[i2];
        int i3 = sliceHeader.sps.pic_width_in_mbs_minus1 + 1;
        int i4 = sliceHeader.slice_alpha_c0_offset_div2 << 1;
        int i5 = sliceHeader.slice_beta_offset_div2 << 1;
        int i6 = i2 % i3;
        int i7 = i2 / i3;
        char c = 0;
        boolean z = i7 > 0 && (sliceHeader.disable_deblocking_filter_idc != 2 || sliceHeaderArr[i2 - i3] == sliceHeader);
        int i8 = this.mbQps[i][i2];
        int i9 = 2 - picture.getColor().compWidth[i];
        int i10 = 2 - picture.getColor().compHeight[i];
        int i11 = 4;
        if (z) {
            int i12 = ((this.mbQps[i][i2 - i3] + i8) + 1) >> 1;
            int i13 = 0;
            while (i13 < i11) {
                int i14 = ((i6 << 2) + i13) << i9;
                int i15 = (i7 << 2) << i10;
                int idxAlpha = getIdxAlpha(i4, i12);
                int idxBeta = getIdxBeta(i5, i12);
                int i16 = iArr[c][i13];
                int i17 = i13;
                int i18 = i14;
                int i19 = i12;
                int i20 = i10;
                int i21 = i8;
                filterBlockEdgeHoris(picture, i, i18, i15, idxAlpha, idxBeta, i16, 1 << i9);
                i13 = i17 + 1;
                i10 = i20;
                i12 = i19;
                i8 = i21;
                i11 = 4;
                c = 0;
            }
        }
        int i22 = i10;
        int i23 = i8;
        boolean z2 = (i == 0 && this.tr8x8Used[i2]) || i22 == 1;
        int i24 = 4;
        int i25 = 1;
        while (i25 < i24) {
            if (!z2 || (i25 & 1) != 1) {
                int i26 = 0;
                while (i26 < i24) {
                    int i27 = ((i6 << 2) + i26) << i9;
                    int i28 = ((i7 << 2) + i25) << i22;
                    int i29 = i23;
                    int idxAlpha2 = getIdxAlpha(i4, i29);
                    int idxBeta2 = getIdxBeta(i5, i29);
                    int i30 = idxAlpha2;
                    int i31 = i26;
                    int i32 = i25;
                    filterBlockEdgeHoris(picture, i, i27, i28, i30, idxBeta2, iArr[i25][i26], 1 << i9);
                    i26 = i31 + 1;
                    i25 = i32;
                    i24 = 4;
                }
            }
            i25++;
            i24 = 4;
        }
    }

    private void fillVerticalEdge(Picture picture, int i, int i2, int[][] iArr) {
        SliceHeader[] sliceHeaderArr = this.shs;
        SliceHeader sliceHeader = sliceHeaderArr[i2];
        int i3 = sliceHeader.sps.pic_width_in_mbs_minus1 + 1;
        int i4 = sliceHeader.slice_alpha_c0_offset_div2 << 1;
        int i5 = sliceHeader.slice_beta_offset_div2 << 1;
        int i6 = i2 % i3;
        int i7 = i2 / i3;
        char c = 0;
        boolean z = i6 > 0 && (sliceHeader.disable_deblocking_filter_idc != 2 || sliceHeaderArr[i2 + -1] == sliceHeader);
        int i8 = this.mbQps[i][i2];
        int i9 = 2 - picture.getColor().compWidth[i];
        int i10 = 2 - picture.getColor().compHeight[i];
        int i11 = 4;
        if (z) {
            int i12 = ((this.mbQps[i][i2 - 1] + i8) + 1) >> 1;
            int i13 = 0;
            while (i13 < i11) {
                int i14 = (i6 << 2) << i9;
                int i15 = ((i7 << 2) + i13) << i10;
                int idxAlpha = getIdxAlpha(i4, i12);
                int idxBeta = getIdxBeta(i5, i12);
                int i16 = iArr[i13][c];
                int i17 = i13;
                int i18 = i14;
                int i19 = i12;
                int i20 = i9;
                int i21 = i8;
                filterBlockEdgeVert(picture, i, i18, i15, idxAlpha, idxBeta, i16, 1 << i10);
                i13 = i17 + 1;
                i9 = i20;
                i12 = i19;
                i8 = i21;
                i11 = 4;
                c = 0;
            }
        }
        int i22 = i9;
        int i23 = i8;
        boolean z2 = (i == 0 && this.tr8x8Used[i2]) || i22 == 1;
        int i24 = 4;
        int i25 = 1;
        while (i25 < i24) {
            if (!z2 || (i25 & 1) != 1) {
                int i26 = 0;
                while (i26 < i24) {
                    int i27 = ((i6 << 2) + i25) << i22;
                    int i28 = ((i7 << 2) + i26) << i10;
                    int i29 = i23;
                    int idxAlpha2 = getIdxAlpha(i4, i29);
                    int idxBeta2 = getIdxBeta(i5, i29);
                    int i30 = idxAlpha2;
                    int i31 = i26;
                    int i32 = i25;
                    filterBlockEdgeVert(picture, i, i27, i28, i30, idxBeta2, iArr[i26][i25], 1 << i10);
                    i26 = i31 + 1;
                    i25 = i32;
                    i24 = 4;
                }
            }
            i25++;
            i24 = 4;
        }
    }

    private void filterBlockEdgeHoris(Picture picture, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9 = i6;
        int planeWidth = picture.getPlaneWidth(i);
        int i10 = (i3 * planeWidth) + i2;
        int i11 = i7;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = planeWidth * 3;
            int i14 = (i10 - i13) + i12;
            int i15 = planeWidth * 2;
            int i16 = (i10 - i15) + i12;
            int i17 = (i10 - planeWidth) + i12;
            int i18 = i10 + i12;
            int i19 = i10 + planeWidth + i12;
            int i20 = i15 + i10 + i12;
            if (i9 == 4) {
                filterBs4(i4, i5, picture.getPlaneData(i), (i10 - (planeWidth * 4)) + i12, i14, i16, i17, i18, i19, i20, i13 + i10 + i12, i != 0);
            } else if (i9 > 0) {
                i8 = i12;
                filterBs(i6, i4, i5, picture.getPlaneData(i), i14, i16, i17, i18, i19, i20, i != 0);
                i12 = i8 + 1;
                i11 = i7;
            }
            i8 = i12;
            i12 = i8 + 1;
            i11 = i7;
        }
    }

    private void filterBlockEdgeVert(Picture picture, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9 = i6;
        int planeWidth = picture.getPlaneWidth(i);
        int i10 = i7;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = ((i3 + i11) * planeWidth) + i2;
            int i13 = i12 - 3;
            int i14 = i12 - 2;
            int i15 = i12 - 1;
            int i16 = i12 + 1;
            int i17 = i12 + 2;
            if (i9 == 4) {
                filterBs4(i4, i5, picture.getPlaneData(i), i12 - 4, i13, i14, i15, i12, i16, i17, i12 + 3, i != 0);
            } else if (i9 > 0) {
                i8 = i11;
                filterBs(i6, i4, i5, picture.getPlaneData(i), i13, i14, i15, i12, i16, i17, i != 0);
                i11 = i8 + 1;
            }
            i8 = i11;
            i11 = i8 + 1;
        }
    }

    private void filterBs(int i, int i2, int i3, int[] iArr, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        int i10;
        boolean z2;
        boolean z3;
        int i11 = iArr[i5];
        int i12 = iArr[i6];
        int i13 = iArr[i7];
        int i14 = iArr[i8];
        int i15 = alphaTab[i2];
        int i16 = betaTab[i3];
        if (Math.abs(i12 - i13) < i15 && Math.abs(i11 - i12) < i16 && Math.abs(i14 - i13) < i16) {
            int i17 = tcs[i - 1][i2];
            if (!z) {
                int abs = Math.abs(iArr[i4] - i12);
                int abs2 = Math.abs(iArr[i9] - i13);
                i10 = (abs < i16 ? 1 : 0) + i17 + (abs2 < i16 ? 1 : 0);
                z2 = abs < i16;
                z3 = abs2 < i16;
            } else {
                i10 = i17 + 1;
                z3 = false;
                z2 = false;
            }
            int i18 = ((((i13 - i12) << 2) + (i11 - i14)) + 4) >> 3;
            int i19 = -i10;
            if (i18 < i19) {
                i18 = i19;
            } else if (i18 > i10) {
                i18 = i10;
            }
            int i20 = i12 + i18;
            if (i20 < 0) {
                i20 = 0;
            }
            int i21 = i13 - i18;
            if (i21 < 0) {
                i21 = 0;
            }
            if (z2) {
                int i22 = ((iArr[i4] + (((i12 + i13) + 1) >> 1)) - (i11 << 1)) >> 1;
                int i23 = -i17;
                if (i22 < i23) {
                    i22 = i23;
                } else if (i22 > i17) {
                    i22 = i17;
                }
                iArr[i5] = MathUtil.clip(i11 + i22, 0, 255);
            }
            if (z3) {
                int i24 = ((iArr[i9] + (((i12 + i13) + 1) >> 1)) - (i14 << 1)) >> 1;
                int i25 = -i17;
                if (i24 < i25) {
                    i17 = i25;
                } else if (i24 <= i17) {
                    i17 = i24;
                }
                iArr[i8] = MathUtil.clip(i14 + i17, 0, 255);
            }
            iArr[i7] = MathUtil.clip(i21, 0, 255);
            iArr[i6] = MathUtil.clip(i20, 0, 255);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (java.lang.Math.abs(r6) < ((r4 >> 2) + 2)) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void filterBs4(int r13, int r14, int[] r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, boolean r24) {
        /*
            r12 = this;
            r0 = r15[r19]
            r1 = r15[r20]
            r2 = r15[r18]
            r3 = r15[r21]
            int[] r4 = alphaTab
            r4 = r4[r13]
            int[] r5 = betaTab
            r5 = r5[r14]
            int r6 = r0 - r1
            int r7 = java.lang.Math.abs(r6)
            r8 = 1
            r9 = 0
            if (r7 >= r4) goto L_0x002c
            int r7 = r2 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r7 >= r5) goto L_0x002c
            int r7 = r3 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r7 >= r5) goto L_0x002c
            r7 = 1
            goto L_0x002d
        L_0x002c:
            r7 = 0
        L_0x002d:
            if (r7 != 0) goto L_0x0030
            return
        L_0x0030:
            if (r24 == 0) goto L_0x0035
            r7 = 0
        L_0x0033:
            r8 = 0
            goto L_0x005e
        L_0x0035:
            r7 = r15[r17]
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            r10 = r15[r22]
            int r10 = r10 - r1
            int r10 = java.lang.Math.abs(r10)
            if (r7 >= r5) goto L_0x0051
            int r7 = java.lang.Math.abs(r6)
            int r11 = r4 >> 2
            int r11 = r11 + 2
            if (r7 >= r11) goto L_0x0051
            r7 = 1
            goto L_0x0052
        L_0x0051:
            r7 = 0
        L_0x0052:
            if (r10 >= r5) goto L_0x0033
            int r5 = java.lang.Math.abs(r6)
            int r4 = r4 >> 2
            int r4 = r4 + 2
            if (r5 >= r4) goto L_0x0033
        L_0x005e:
            r4 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L_0x009b
            r5 = r15[r16]
            r6 = r15[r17]
            int r7 = r2 * 2
            int r7 = r7 + r6
            int r10 = r0 * 2
            int r7 = r7 + r10
            int r10 = r1 * 2
            int r7 = r7 + r10
            int r7 = r7 + r3
            int r7 = r7 + 4
            int r7 = r7 >> 3
            int r10 = r6 + r2
            int r10 = r10 + r0
            int r10 = r10 + r1
            int r10 = r10 + 2
            int r10 = r10 >> 2
            int r5 = r5 * 2
            int r6 = r6 * 3
            int r5 = r5 + r6
            int r5 = r5 + r2
            int r5 = r5 + r0
            int r5 = r5 + r1
            int r5 = r5 + 4
            int r5 = r5 >> 3
            int r6 = org.jcodec.common.tools.MathUtil.clip(r7, r9, r4)
            r15[r19] = r6
            int r6 = org.jcodec.common.tools.MathUtil.clip(r10, r9, r4)
            r15[r18] = r6
            int r5 = org.jcodec.common.tools.MathUtil.clip(r5, r9, r4)
            r15[r17] = r5
            goto L_0x00a9
        L_0x009b:
            int r5 = r2 * 2
            int r5 = r5 + r0
            int r5 = r5 + r3
            int r5 = r5 + 2
            int r5 = r5 >> 2
            int r5 = org.jcodec.common.tools.MathUtil.clip(r5, r9, r4)
            r15[r19] = r5
        L_0x00a9:
            if (r8 == 0) goto L_0x00e6
            if (r24 != 0) goto L_0x00e6
            r5 = r15[r22]
            r6 = r15[r23]
            int r7 = r0 * 2
            int r2 = r2 + r7
            int r7 = r1 * 2
            int r2 = r2 + r7
            int r7 = r3 * 2
            int r2 = r2 + r7
            int r2 = r2 + r5
            int r2 = r2 + 4
            int r2 = r2 >> 3
            int r7 = r0 + r1
            int r7 = r7 + r3
            int r7 = r7 + r5
            int r7 = r7 + 2
            int r7 = r7 >> 2
            int r6 = r6 * 2
            int r5 = r5 * 3
            int r6 = r6 + r5
            int r6 = r6 + r3
            int r6 = r6 + r1
            int r6 = r6 + r0
            int r6 = r6 + 4
            int r0 = r6 >> 3
            int r1 = org.jcodec.common.tools.MathUtil.clip(r2, r9, r4)
            r15[r20] = r1
            int r1 = org.jcodec.common.tools.MathUtil.clip(r7, r9, r4)
            r15[r21] = r1
            int r0 = org.jcodec.common.tools.MathUtil.clip(r0, r9, r4)
            r15[r22] = r0
            goto L_0x00f4
        L_0x00e6:
            int r3 = r3 * 2
            int r3 = r3 + r1
            int r3 = r3 + r2
            int r3 = r3 + 2
            int r0 = r3 >> 2
            int r0 = org.jcodec.common.tools.MathUtil.clip(r0, r9, r4)
            r15[r20] = r0
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.decode.deblock.DeblockingFilter.filterBs4(int, int, int[], int, int, int, int, int, int, int, int, boolean):void");
    }

    private static int getIdxAlpha(int i, int i2) {
        return MathUtil.clip(i2 + i, 0, 51);
    }

    private static int getIdxBeta(int i, int i2) {
        return MathUtil.clip(i2 + i, 0, 51);
    }

    private boolean mvThresh(int[] iArr, int[] iArr2) {
        return Math.abs(iArr[0] - iArr2[0]) >= 4 || Math.abs(iArr[1] - iArr2[1]) >= 4;
    }

    public void deblockFrame(Picture picture) {
        Class<int> cls = int.class;
        ColorSpace color = picture.getColor();
        int[][] iArr = (int[][]) Array.newInstance(cls, new int[]{4, 4});
        int[][] iArr2 = (int[][]) Array.newInstance(cls, new int[]{4, 4});
        for (int i = 0; i < this.shs.length; i++) {
            calcBsH(picture, i, iArr2);
            calcBsV(picture, i, iArr);
            for (int i2 = 0; i2 < color.nComp; i2++) {
                fillVerticalEdge(picture, i2, i, iArr);
                fillHorizontalEdge(picture, i2, i, iArr2);
            }
        }
    }
}
