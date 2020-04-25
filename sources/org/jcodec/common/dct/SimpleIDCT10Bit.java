package org.jcodec.common.dct;

public class SimpleIDCT10Bit {
    public static int COL_SHIFT = 20;
    public static int ROW_SHIFT = 15;

    /* renamed from: W1 */
    public static int f44813W1 = 90901;

    /* renamed from: W2 */
    public static int f44814W2 = 85627;

    /* renamed from: W3 */
    public static int f44815W3 = 77062;

    /* renamed from: W4 */
    public static int f44816W4 = 65535;

    /* renamed from: W5 */
    public static int f44817W5 = 51491;

    /* renamed from: W6 */
    public static int f44818W6 = 35468;

    /* renamed from: W7 */
    public static int f44819W7 = 18081;

    private static void fdctRow(int[] iArr, int i) {
    }

    public static final void idct10(int[] iArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            idctRow(iArr, (i2 << 3) + i);
        }
        for (int i3 = 0; i3 < 8; i3++) {
            idctCol(iArr, i + i3);
        }
    }

    private static final void idctCol(int[] iArr, int i) {
        int i2;
        int i3 = f44816W4;
        int i4 = (iArr[i + 0] + ((1 << (COL_SHIFT - 1)) / i3)) * i3;
        int i5 = f44814W2;
        int i6 = i + 16;
        int i7 = (iArr[i6] * i5) + i4;
        int i8 = f44818W6;
        int i9 = (iArr[i6] * i8) + i4;
        int i10 = ((-i8) * iArr[i6]) + i4;
        int i11 = i4 + ((-i5) * iArr[i6]);
        int i12 = f44813W1;
        int i13 = i + 8;
        int i14 = iArr[i13] * i12;
        int i15 = f44815W3;
        int i16 = iArr[i13] * i15;
        int i17 = f44817W5;
        int i18 = iArr[i13] * i17;
        int i19 = f44819W7;
        int i20 = i + 24;
        int i21 = i14 + (i15 * iArr[i20]);
        int i22 = i16 + ((-i19) * iArr[i20]);
        int i23 = i18 + ((-i12) * iArr[i20]);
        int i24 = (iArr[i13] * i19) + ((-i17) * iArr[i20]);
        int i25 = i + 32;
        if (iArr[i25] != 0) {
            i7 += iArr[i25] * i3;
            i9 += (-i3) * iArr[i25];
            i10 += (-i3) * iArr[i25];
            i11 += i3 * iArr[i25];
        }
        int i26 = i + 40;
        if (iArr[i26] != 0) {
            i21 += f44817W5 * iArr[i26];
            i22 += (-f44813W1) * iArr[i26];
            i23 += f44819W7 * iArr[i26];
            i24 += f44815W3 * iArr[i26];
        }
        int i27 = i + 48;
        if (iArr[i27] != 0) {
            int i28 = f44818W6;
            int i29 = i7 + (iArr[i27] * i28);
            int i30 = f44814W2;
            i2 = i29;
            i9 += (-i30) * iArr[i27];
            i10 += i30 * iArr[i27];
            i11 += (-i28) * iArr[i27];
        } else {
            i2 = i7;
        }
        int i31 = i + 56;
        if (iArr[i31] != 0) {
            i21 += f44819W7 * iArr[i31];
            i22 += (-f44817W5) * iArr[i31];
            i23 += f44815W3 * iArr[i31];
            i24 += (-f44813W1) * iArr[i31];
        }
        int i32 = i2 + i21;
        int i33 = COL_SHIFT;
        iArr[i] = i32 >> i33;
        iArr[i13] = (i9 + i22) >> i33;
        iArr[i6] = (i10 + i23) >> i33;
        iArr[i20] = (i11 + i24) >> i33;
        iArr[i25] = (i11 - i24) >> i33;
        iArr[i26] = (i10 - i23) >> i33;
        iArr[i27] = (i9 - i22) >> i33;
        iArr[i31] = (i2 - i21) >> i33;
    }

    private static final void idctRow(int[] iArr, int i) {
        int i2;
        int i3;
        int i4 = (f44816W4 * iArr[i]) + (1 << (ROW_SHIFT - 1));
        int i5 = f44814W2;
        int i6 = i + 2;
        int i7 = (iArr[i6] * i5) + i4;
        int i8 = f44818W6;
        int i9 = (iArr[i6] * i8) + i4;
        int i10 = i4 - (i8 * iArr[i6]);
        int i11 = i4 - (i5 * iArr[i6]);
        int i12 = f44813W1;
        int i13 = i + 1;
        int i14 = iArr[i13] * i12;
        int i15 = f44815W3;
        int i16 = i + 3;
        int i17 = i14 + (iArr[i16] * i15);
        int i18 = i15 * iArr[i13];
        int i19 = f44819W7;
        int i20 = i18 + ((-i19) * iArr[i16]);
        int i21 = f44817W5;
        int i22 = (iArr[i13] * i21) + ((-i12) * iArr[i16]);
        int i23 = (i19 * iArr[i13]) + ((-i21) * iArr[i16]);
        int i24 = i + 4;
        if (iArr[i24] == 0 && iArr[i + 5] == 0 && iArr[i + 6] == 0 && iArr[i + 7] == 0) {
            i3 = i11;
            i2 = i7;
        } else {
            int i25 = f44816W4;
            int i26 = iArr[i24] * i25;
            int i27 = f44818W6;
            int i28 = i + 6;
            int i29 = i7 + i26 + (iArr[i28] * i27);
            int i30 = (-i25) * iArr[i24];
            int i31 = f44814W2;
            i9 += i30 - (iArr[i28] * i31);
            i10 += ((-i25) * iArr[i24]) + (i31 * iArr[i28]);
            int i32 = i11 + ((i25 * iArr[i24]) - (i27 * iArr[i28]));
            int i33 = f44817W5;
            int i34 = i + 5;
            int i35 = i17 + (iArr[i34] * i33);
            int i36 = f44819W7;
            int i37 = i + 7;
            i17 = i35 + (iArr[i37] * i36);
            i3 = i32;
            int i38 = f44813W1;
            i2 = i29;
            i20 = i20 + ((-i38) * iArr[i34]) + ((-i33) * iArr[i37]);
            int i39 = i22 + (i36 * iArr[i34]);
            int i40 = f44815W3;
            i22 = i39 + (iArr[i37] * i40);
            i23 = i23 + (i40 * iArr[i34]) + ((-i38) * iArr[i37]);
        }
        int i41 = i + 0;
        int i42 = i2 + i17;
        int i43 = ROW_SHIFT;
        iArr[i41] = i42 >> i43;
        iArr[i + 7] = (i2 - i17) >> i43;
        iArr[i13] = (i9 + i20) >> i43;
        iArr[i + 6] = (i9 - i20) >> i43;
        iArr[i6] = (i10 + i22) >> i43;
        iArr[i + 5] = (i10 - i22) >> i43;
        iArr[i16] = (i3 + i23) >> i43;
        iArr[i24] = (i3 - i23) >> i43;
    }
}
