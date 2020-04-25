package org.jcodec.codecs.vp8;

import org.jcodec.codecs.vp8.Macroblock.Subblock;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class FilterUtil {

    public static class Segment {

        /* renamed from: p0 */
        int f44773p0;

        /* renamed from: p1 */
        int f44774p1;

        /* renamed from: p2 */
        int f44775p2;

        /* renamed from: p3 */
        int f44776p3;

        /* renamed from: q0 */
        int f44777q0;

        /* renamed from: q1 */
        int f44778q1;

        /* renamed from: q2 */
        int f44779q2;

        /* renamed from: q3 */
        int f44780q3;

        private int adjust(boolean z) {
            int access$000 = FilterUtil.minus128(this.f44774p1);
            int access$0002 = FilterUtil.minus128(this.f44773p0);
            int access$0003 = FilterUtil.minus128(this.f44777q0);
            int access$100 = FilterUtil.clipSigned((z ? FilterUtil.clipSigned(access$000 - FilterUtil.minus128(this.f44778q1)) : 0) + ((access$0003 - access$0002) * 3));
            int access$1002 = FilterUtil.clipSigned(access$100 + 3) >> 3;
            int access$1003 = FilterUtil.clipSigned(access$100 + 4) >> 3;
            this.f44777q0 = FilterUtil.clipPlus128(access$0003 - access$1003);
            this.f44773p0 = FilterUtil.clipPlus128(access$0002 + access$1002);
            return access$1003;
        }

        public static Segment horizontal(Subblock subblock, Subblock subblock2, int i) {
            Segment segment = new Segment();
            int[] iArr = subblock2.val;
            int i2 = i + 12;
            segment.f44773p0 = iArr[i2];
            int i3 = i + 8;
            segment.f44774p1 = iArr[i3];
            int i4 = i + 4;
            segment.f44775p2 = iArr[i4];
            int i5 = i + 0;
            segment.f44776p3 = iArr[i5];
            int[] iArr2 = subblock.val;
            segment.f44777q0 = iArr2[i5];
            segment.f44778q1 = iArr2[i4];
            segment.f44779q2 = iArr2[i3];
            segment.f44780q3 = iArr2[i2];
            return segment;
        }

        public static Segment vertical(Subblock subblock, Subblock subblock2, int i) {
            Segment segment = new Segment();
            int[] iArr = subblock2.val;
            int i2 = i * 4;
            int i3 = i2 + 3;
            segment.f44773p0 = iArr[i3];
            int i4 = i2 + 2;
            segment.f44774p1 = iArr[i4];
            int i5 = i2 + 1;
            segment.f44775p2 = iArr[i5];
            int i6 = i2 + 0;
            segment.f44776p3 = iArr[i6];
            int[] iArr2 = subblock.val;
            segment.f44777q0 = iArr2[i6];
            segment.f44778q1 = iArr2[i5];
            segment.f44779q2 = iArr2[i4];
            segment.f44780q3 = iArr2[i3];
            return segment;
        }

        public void applyHorizontally(Subblock subblock, Subblock subblock2, int i) {
            int[] iArr = subblock2.val;
            int i2 = i + 12;
            iArr[i2] = this.f44773p0;
            int i3 = i + 8;
            iArr[i3] = this.f44774p1;
            int i4 = i + 4;
            iArr[i4] = this.f44775p2;
            int i5 = i + 0;
            iArr[i5] = this.f44776p3;
            int[] iArr2 = subblock.val;
            iArr2[i5] = this.f44777q0;
            iArr2[i4] = this.f44778q1;
            iArr2[i3] = this.f44779q2;
            iArr2[i2] = this.f44780q3;
        }

        public void applyVertically(Subblock subblock, Subblock subblock2, int i) {
            int[] iArr = subblock2.val;
            int i2 = i * 4;
            int i3 = i2 + 3;
            iArr[i3] = this.f44773p0;
            int i4 = i2 + 2;
            iArr[i4] = this.f44774p1;
            int i5 = i2 + 1;
            iArr[i5] = this.f44775p2;
            int i6 = i2 + 0;
            iArr[i6] = this.f44776p3;
            int[] iArr2 = subblock.val;
            iArr2[i6] = this.f44777q0;
            iArr2[i5] = this.f44778q1;
            iArr2[i4] = this.f44779q2;
            iArr2[i3] = this.f44780q3;
        }

        /* access modifiers changed from: 0000 */
        public void filterMb(int i, int i2, int i3) {
            Segment signed = getSigned();
            if (!signed.isFilterRequired(i2, i3)) {
                return;
            }
            if (!signed.isHighVariance(i)) {
                int access$100 = FilterUtil.clipSigned(FilterUtil.clipSigned(signed.f44774p1 - signed.f44778q1) + ((signed.f44777q0 - signed.f44773p0) * 3));
                int i4 = ((access$100 * 27) + 63) >> 7;
                this.f44777q0 = FilterUtil.clipPlus128(signed.f44777q0 - i4);
                this.f44773p0 = FilterUtil.clipPlus128(signed.f44773p0 + i4);
                int i5 = ((access$100 * 18) + 63) >> 7;
                this.f44778q1 = FilterUtil.clipPlus128(signed.f44778q1 - i5);
                this.f44774p1 = FilterUtil.clipPlus128(signed.f44774p1 + i5);
                int i6 = ((access$100 * 9) + 63) >> 7;
                this.f44779q2 = FilterUtil.clipPlus128(signed.f44779q2 - i6);
                this.f44775p2 = FilterUtil.clipPlus128(signed.f44775p2 + i6);
                return;
            }
            adjust(true);
        }

        public void filterSb(int i, int i2, int i3) {
            Segment signed = getSigned();
            if (signed.isFilterRequired(i2, i3)) {
                boolean isHighVariance = signed.isHighVariance(i);
                int adjust = (adjust(isHighVariance) + 1) >> 1;
                if (!isHighVariance) {
                    this.f44778q1 = FilterUtil.clipPlus128(signed.f44778q1 - adjust);
                    this.f44774p1 = FilterUtil.clipPlus128(signed.f44774p1 + adjust);
                }
            }
        }

        public Segment getSigned() {
            Segment segment = new Segment();
            segment.f44776p3 = FilterUtil.minus128(this.f44776p3);
            segment.f44775p2 = FilterUtil.minus128(this.f44775p2);
            segment.f44774p1 = FilterUtil.minus128(this.f44774p1);
            segment.f44773p0 = FilterUtil.minus128(this.f44773p0);
            segment.f44777q0 = FilterUtil.minus128(this.f44777q0);
            segment.f44778q1 = FilterUtil.minus128(this.f44778q1);
            segment.f44779q2 = FilterUtil.minus128(this.f44779q2);
            segment.f44780q3 = FilterUtil.minus128(this.f44780q3);
            return segment;
        }

        public boolean isFilterRequired(int i, int i2) {
            return (Math.abs(this.f44773p0 - this.f44777q0) << 2) + (Math.abs(this.f44774p1 - this.f44778q1) >> 2) <= i2 && Math.abs(this.f44776p3 - this.f44775p2) <= i && Math.abs(this.f44775p2 - this.f44774p1) <= i && Math.abs(this.f44774p1 - this.f44773p0) <= i && Math.abs(this.f44780q3 - this.f44779q2) <= i && Math.abs(this.f44779q2 - this.f44778q1) <= i && Math.abs(this.f44778q1 - this.f44777q0) <= i;
        }

        public boolean isHighVariance(int i) {
            return Math.abs(this.f44774p1 - this.f44773p0) > i || Math.abs(this.f44778q1 - this.f44777q0) > i;
        }
    }

    /* access modifiers changed from: private */
    public static int clipPlus128(int i) {
        return clipSigned(i) + 128;
    }

    /* access modifiers changed from: private */
    public static int clipSigned(int i) {
        if (i < -128) {
            return -128;
        }
        return i > 127 ? C13959t.f40827P1 : i;
    }

    public static void loopFilterUV(Macroblock[][] macroblockArr, int i, boolean z) {
        int i2;
        Macroblock[][] macroblockArr2 = macroblockArr;
        int i3 = i;
        char c = 0;
        int i4 = 0;
        while (true) {
            int i5 = 2;
            if (i4 < macroblockArr2.length - 2) {
                int i6 = 0;
                while (i6 < macroblockArr2[c].length - i5) {
                    int i7 = i4 + 1;
                    int i8 = i6 + 1;
                    Macroblock macroblock = macroblockArr2[i7][i8];
                    Macroblock macroblock2 = macroblockArr2[i7][i8];
                    int i9 = macroblock.filterLevel;
                    if (i9 != 0) {
                        char c2 = 1;
                        if (i3 > 0) {
                            i2 = i9 >> (i3 > 4 ? 2 : 1);
                            int i10 = 9 - i3;
                            if (i2 > i10) {
                                i2 = i10;
                            }
                        } else {
                            i2 = i9;
                        }
                        if (i2 == 0) {
                            i2 = 1;
                        }
                        if (z) {
                            int i11 = i9 >= 40 ? 2 : i9 >= 15 ? 1 : 0;
                            int i12 = ((i9 + 2) * 2) + i2;
                            int i13 = (i9 * 2) + i2;
                            if (i6 > 0) {
                                Macroblock macroblock3 = macroblockArr2[i7][i8 - 1];
                                int i14 = 0;
                                while (i14 < i5) {
                                    Subblock subblock = macroblock.uSubblocks[i14][c];
                                    Subblock subblock2 = macroblock3.uSubblocks[i14][c2];
                                    Subblock subblock3 = macroblock.vSubblocks[i14][0];
                                    Subblock subblock4 = macroblock3.vSubblocks[i14][1];
                                    Macroblock macroblock4 = macroblock3;
                                    Macroblock macroblock5 = macroblock2;
                                    for (int i15 = 0; i15 < 4; i15++) {
                                        Segment horizontal = Segment.horizontal(subblock, subblock2, i15);
                                        horizontal.filterMb(i11, i2, i12);
                                        horizontal.applyHorizontally(subblock, subblock2, i15);
                                        Segment horizontal2 = Segment.horizontal(subblock3, subblock4, i15);
                                        horizontal2.filterMb(i11, i2, i12);
                                        horizontal2.applyHorizontally(subblock3, subblock4, i15);
                                    }
                                    i14++;
                                    int i16 = i;
                                    macroblock3 = macroblock4;
                                    macroblock2 = macroblock5;
                                    c = 0;
                                    i5 = 2;
                                    c2 = 1;
                                }
                            }
                            Macroblock macroblock6 = macroblock2;
                            if (!macroblock.skipFilter) {
                                int i17 = 1;
                                while (true) {
                                    if (i17 >= 2) {
                                        break;
                                    }
                                    int i18 = 0;
                                    for (int i19 = 2; i18 < i19; i19 = 2) {
                                        Subblock[][] subblockArr = macroblock.uSubblocks;
                                        int i20 = i17 - 1;
                                        Subblock subblock5 = subblockArr[i18][i20];
                                        Subblock subblock6 = subblockArr[i18][i17];
                                        Subblock[][] subblockArr2 = macroblock.vSubblocks;
                                        Subblock subblock7 = subblockArr2[i18][i20];
                                        Subblock subblock8 = subblockArr2[i18][i17];
                                        Macroblock macroblock7 = macroblock;
                                        int i21 = 0;
                                        for (int i22 = 4; i21 < i22; i22 = 4) {
                                            Segment horizontal3 = Segment.horizontal(subblock6, subblock5, i21);
                                            horizontal3.filterSb(i11, i2, i13);
                                            horizontal3.applyHorizontally(subblock6, subblock5, i21);
                                            Segment horizontal4 = Segment.horizontal(subblock8, subblock7, i21);
                                            horizontal4.filterSb(i11, i2, i13);
                                            horizontal4.applyHorizontally(subblock8, subblock7, i21);
                                            i21++;
                                        }
                                        i18++;
                                        macroblock = macroblock7;
                                    }
                                    Macroblock macroblock8 = macroblock;
                                    i17++;
                                }
                            }
                            Macroblock macroblock9 = macroblock;
                            if (i4 > 0) {
                                Macroblock macroblock10 = macroblockArr2[i7 - 1][i8];
                                int i23 = 0;
                                while (i23 < 2) {
                                    Subblock subblock9 = macroblock10.uSubblocks[1][i23];
                                    Macroblock macroblock11 = macroblock6;
                                    Subblock subblock10 = macroblock11.uSubblocks[0][i23];
                                    Subblock subblock11 = macroblock10.vSubblocks[1][i23];
                                    Subblock subblock12 = macroblock11.vSubblocks[0][i23];
                                    for (int i24 = 0; i24 < 4; i24++) {
                                        Segment vertical = Segment.vertical(subblock10, subblock9, i24);
                                        vertical.filterMb(i11, i2, i12);
                                        vertical.applyVertically(subblock10, subblock9, i24);
                                        Segment vertical2 = Segment.vertical(subblock12, subblock11, i24);
                                        vertical2.filterMb(i11, i2, i12);
                                        vertical2.applyVertically(subblock12, subblock11, i24);
                                    }
                                    i23++;
                                    macroblock6 = macroblock11;
                                }
                            }
                            Macroblock macroblock12 = macroblock6;
                            if (!macroblock9.skipFilter) {
                                int i25 = 1;
                                while (true) {
                                    if (i25 >= 2) {
                                        break;
                                    }
                                    int i26 = 0;
                                    for (int i27 = 2; i26 < i27; i27 = 2) {
                                        Subblock[][] subblockArr3 = macroblock12.uSubblocks;
                                        int i28 = i25 - 1;
                                        Subblock subblock13 = subblockArr3[i28][i26];
                                        Subblock subblock14 = subblockArr3[i25][i26];
                                        Subblock[][] subblockArr4 = macroblock12.vSubblocks;
                                        Subblock subblock15 = subblockArr4[i28][i26];
                                        Subblock subblock16 = subblockArr4[i25][i26];
                                        for (int i29 = 0; i29 < 4; i29++) {
                                            Segment vertical3 = Segment.vertical(subblock14, subblock13, i29);
                                            vertical3.filterSb(i11, i2, i13);
                                            vertical3.applyVertically(subblock14, subblock13, i29);
                                            Segment vertical4 = Segment.vertical(subblock16, subblock15, i29);
                                            vertical4.filterSb(i11, i2, i13);
                                            vertical4.applyVertically(subblock16, subblock15, i29);
                                        }
                                        i26++;
                                    }
                                    i25++;
                                }
                            }
                        } else {
                            throw new UnsupportedOperationException("TODO: non-key frames are not supported yet.");
                        }
                    }
                    i3 = i;
                    i6 = i8;
                    c = 0;
                    i5 = 2;
                }
                i4++;
                i3 = i;
                c = 0;
            } else {
                return;
            }
        }
    }

    public static void loopFilterY(Macroblock[][] macroblockArr, int i, boolean z) {
        int i2;
        Macroblock[][] macroblockArr2 = macroblockArr;
        int i3 = i;
        char c = 0;
        int i4 = 0;
        while (true) {
            if (i4 < macroblockArr2.length - 2) {
                int i5 = 0;
                for (int i6 = 2; i5 < macroblockArr2[c].length - i6; i6 = 2) {
                    int i7 = i4 + 1;
                    int i8 = i5 + 1;
                    Macroblock macroblock = macroblockArr2[i7][i8];
                    Macroblock macroblock2 = macroblockArr2[i7][i8];
                    int i9 = macroblock.filterLevel;
                    if (i9 != 0) {
                        int i10 = 4;
                        if (i3 > 0) {
                            i2 = i9 >> (i3 > 4 ? 2 : 1);
                            int i11 = 9 - i3;
                            if (i2 > i11) {
                                i2 = i11;
                            }
                        } else {
                            i2 = i9;
                        }
                        if (i2 == 0) {
                            i2 = 1;
                        }
                        if (z) {
                            int i12 = i9 >= 40 ? 2 : i9 >= 15 ? 1 : 0;
                            int i13 = ((i9 + 2) * 2) + i2;
                            int i14 = (i9 * 2) + i2;
                            if (i5 > 0) {
                                Macroblock macroblock3 = macroblockArr2[i7][(i5 - 1) + 1];
                                int i15 = 0;
                                while (i15 < i10) {
                                    Subblock subblock = macroblock.ySubblocks[i15][c];
                                    Subblock subblock2 = macroblock3.ySubblocks[i15][3];
                                    int i16 = 0;
                                    while (i16 < i10) {
                                        Segment horizontal = Segment.horizontal(subblock, subblock2, i16);
                                        horizontal.filterMb(i12, i2, i13);
                                        horizontal.applyHorizontally(subblock, subblock2, i16);
                                        i16++;
                                        i10 = 4;
                                    }
                                    i15++;
                                    c = 0;
                                    i10 = 4;
                                }
                            }
                            if (!macroblock.skipFilter) {
                                int i17 = 1;
                                while (true) {
                                    int i18 = 4;
                                    if (i17 >= 4) {
                                        break;
                                    }
                                    int i19 = 0;
                                    while (i19 < i18) {
                                        Subblock[][] subblockArr = macroblock.ySubblocks;
                                        Subblock subblock3 = subblockArr[i19][i17 - 1];
                                        Subblock subblock4 = subblockArr[i19][i17];
                                        int i20 = 0;
                                        while (i20 < i18) {
                                            Segment horizontal2 = Segment.horizontal(subblock4, subblock3, i20);
                                            horizontal2.filterSb(i12, i2, i14);
                                            horizontal2.applyHorizontally(subblock4, subblock3, i20);
                                            i20++;
                                            i18 = 4;
                                        }
                                        i19++;
                                        i18 = 4;
                                    }
                                    i17++;
                                }
                            }
                            if (i4 > 0) {
                                Macroblock macroblock4 = macroblockArr2[(i4 - 1) + 1][i8];
                                int i21 = 0;
                                while (true) {
                                    if (i21 >= 4) {
                                        break;
                                    }
                                    Subblock subblock5 = macroblock4.ySubblocks[3][i21];
                                    Subblock subblock6 = macroblock2.ySubblocks[0][i21];
                                    int i22 = 0;
                                    for (int i23 = 4; i22 < i23; i23 = 4) {
                                        Segment vertical = Segment.vertical(subblock6, subblock5, i22);
                                        vertical.filterMb(i12, i2, i13);
                                        vertical.applyVertically(subblock6, subblock5, i22);
                                        i22++;
                                    }
                                    i21++;
                                }
                            }
                            if (!macroblock.skipFilter) {
                                for (int i24 = 1; i24 < 4; i24++) {
                                    for (int i25 = 0; i25 < 4; i25++) {
                                        Subblock[][] subblockArr2 = macroblock2.ySubblocks;
                                        Subblock subblock7 = subblockArr2[i24 - 1][i25];
                                        Subblock subblock8 = subblockArr2[i24][i25];
                                        for (int i26 = 0; i26 < 4; i26++) {
                                            Segment vertical2 = Segment.vertical(subblock8, subblock7, i26);
                                            vertical2.filterSb(i12, i2, i14);
                                            vertical2.applyVertically(subblock8, subblock7, i26);
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new UnsupportedOperationException("TODO: non-key frames are not supported yet");
                        }
                    }
                    i5 = i8;
                    c = 0;
                }
                i4++;
                c = 0;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static int minus128(int i) {
        return i - 128;
    }
}
