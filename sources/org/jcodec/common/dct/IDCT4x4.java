package org.jcodec.common.dct;

public class IDCT4x4 {

    /* renamed from: C1 */
    public static final int f44807C1 = C_FIX(0.6532814824d);

    /* renamed from: C2 */
    public static final int f44808C2 = C_FIX(0.2705980501d);

    /* renamed from: C3 */
    public static final int f44809C3 = C_FIX(0.5d);
    public static final int CN_SHIFT = 12;
    public static final int C_SHIFT = 18;

    /* renamed from: R1 */
    public static final int f44810R1 = R_FIX(0.6532814824d);

    /* renamed from: R2 */
    public static final int f44811R2 = R_FIX(0.2705980501d);

    /* renamed from: R3 */
    public static final int f44812R3 = R_FIX(0.5d);
    public static final int RN_SHIFT = 15;
    public static final int R_SHIFT = 11;

    public static final int C_FIX(double d) {
        return (int) ((d * 1.414213562d * 4096.0d) + 0.5d);
    }

    public static final int R_FIX(double d) {
        return (int) ((d * 1.414213562d * 32768.0d) + 0.5d);
    }

    public static void idct(int[] iArr, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            idct4row(iArr, (i2 << 2) + i);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            idct4col_add(iArr, i + i3);
        }
    }

    private static void idct4col_add(int[] iArr, int i) {
        int i2 = iArr[i];
        int i3 = i + 4;
        int i4 = iArr[i3];
        int i5 = i + 8;
        int i6 = iArr[i5];
        int i7 = i + 12;
        int i8 = iArr[i7];
        int i9 = i2 + i6;
        int i10 = f44809C3;
        int i11 = (i9 * i10) + 131072;
        int i12 = ((i2 - i6) * i10) + 131072;
        int i13 = f44807C1;
        int i14 = i4 * i13;
        int i15 = f44808C2;
        int i16 = i14 + (i8 * i15);
        int i17 = (i4 * i15) - (i8 * i13);
        iArr[i] = (i11 + i16) >> 18;
        iArr[i3] = (i12 + i17) >> 18;
        iArr[i5] = (i12 - i17) >> 18;
        iArr[i7] = (i11 - i16) >> 18;
    }

    private static void idct4row(int[] iArr, int i) {
        int i2 = iArr[i];
        int i3 = i + 1;
        int i4 = iArr[i3];
        int i5 = i + 2;
        int i6 = iArr[i5];
        int i7 = i + 3;
        int i8 = iArr[i7];
        int i9 = i2 + i6;
        int i10 = f44812R3;
        int i11 = (i9 * i10) + 1024;
        int i12 = ((i2 - i6) * i10) + 1024;
        int i13 = f44810R1;
        int i14 = i4 * i13;
        int i15 = f44811R2;
        int i16 = i14 + (i8 * i15);
        int i17 = (i4 * i15) - (i8 * i13);
        iArr[i] = (i11 + i16) >> 11;
        iArr[i3] = (i12 + i17) >> 11;
        iArr[i5] = (i12 - i17) >> 11;
        iArr[i7] = (i11 - i16) >> 11;
    }
}
