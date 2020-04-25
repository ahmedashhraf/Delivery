package com.google.api.client.repackaged.org.apache.commons.codec.p311e;

import com.google.common.base.C5785c;
import java.math.BigInteger;

/* renamed from: com.google.api.client.repackaged.org.apache.commons.codec.e.a */
/* compiled from: Base64 */
public class C7316a extends C7317b {

    /* renamed from: A */
    static final byte[] f20735A = {13, 10};

    /* renamed from: B */
    private static final byte[] f20736B = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: C */
    private static final byte[] f20737C = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: D */
    private static final byte[] f20738D = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, C5785c.f16694m, C5785c.f16695n, 13, C5785c.f16697p, C5785c.f16698q, 16, 17, C5785c.f16702u, 19, C5785c.f16705x, C5785c.f16706y, C5785c.f16707z, C5785c.f16668A, C5785c.f16669B, C5785c.f16670C, -1, -1, -1, -1, 63, -1, C5785c.f16671D, C5785c.f16672E, C5785c.f16673F, C5785c.f16674G, C5785c.f16675H, C5785c.f16676I, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: E */
    private static final int f20739E = 63;

    /* renamed from: x */
    private static final int f20740x = 6;

    /* renamed from: y */
    private static final int f20741y = 3;

    /* renamed from: z */
    private static final int f20742z = 4;

    /* renamed from: r */
    private final byte[] f20743r;

    /* renamed from: s */
    private final byte[] f20744s;

    /* renamed from: t */
    private final byte[] f20745t;

    /* renamed from: u */
    private final int f20746u;

    /* renamed from: v */
    private final int f20747v;

    /* renamed from: w */
    private int f20748w;

    public C7316a() {
        this(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r0[r2] != -1) goto L_0x0013;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m35416c(byte r2) {
        /*
            r0 = 61
            if (r2 == r0) goto L_0x0013
            if (r2 < 0) goto L_0x0011
            byte[] r0 = f20738D
            int r1 = r0.length
            if (r2 >= r1) goto L_0x0011
            byte r2 = r0[r2]
            r0 = -1
            if (r2 == r0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2 = 0
            goto L_0x0014
        L_0x0013:
            r2 = 1
        L_0x0014:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.repackaged.org.apache.commons.codec.p311e.C7316a.m35416c(byte):boolean");
    }

    /* renamed from: g */
    public static byte[] m35419g(byte[] bArr) {
        return new C7316a().mo29160a(bArr);
    }

    /* renamed from: h */
    public static BigInteger m35420h(byte[] bArr) {
        return new BigInteger(1, m35419g(bArr));
    }

    /* renamed from: i */
    public static byte[] m35421i(byte[] bArr) {
        return m35415b(bArr, false);
    }

    /* renamed from: j */
    public static byte[] m35422j(byte[] bArr) {
        return m35415b(bArr, true);
    }

    /* renamed from: k */
    public static String m35423k(byte[] bArr) {
        return C7318c.m35467f(m35415b(bArr, false));
    }

    /* renamed from: l */
    public static byte[] m35424l(byte[] bArr) {
        return m35412a(bArr, false, true);
    }

    /* renamed from: m */
    public static String m35425m(byte[] bArr) {
        return C7318c.m35467f(m35412a(bArr, false, true));
    }

    /* renamed from: n */
    public static boolean m35426n(byte[] bArr) {
        return m35427o(bArr);
    }

    /* renamed from: o */
    public static boolean m35427o(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (!m35416c(bArr[i]) && !C7317b.m35432b(bArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29164a(byte[] bArr, int i, int i2) {
        if (!this.f20763i) {
            if (i2 < 0) {
                this.f20763i = true;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                mo29169a(this.f20746u);
                int i4 = i + 1;
                byte b = bArr[i];
                if (b == 61) {
                    this.f20763i = true;
                    break;
                }
                if (b >= 0) {
                    byte[] bArr2 = f20738D;
                    if (b < bArr2.length) {
                        byte b2 = bArr2[b];
                        if (b2 >= 0) {
                            this.f20765k = (this.f20765k + 1) % 4;
                            this.f20748w = (this.f20748w << 6) + b2;
                            if (this.f20765k == 0) {
                                byte[] bArr3 = this.f20760f;
                                int i5 = this.f20761g;
                                this.f20761g = i5 + 1;
                                int i6 = this.f20748w;
                                bArr3[i5] = (byte) ((i6 >> 16) & 255);
                                int i7 = this.f20761g;
                                this.f20761g = i7 + 1;
                                bArr3[i7] = (byte) ((i6 >> 8) & 255);
                                int i8 = this.f20761g;
                                this.f20761g = i8 + 1;
                                bArr3[i8] = (byte) (i6 & 255);
                            }
                        }
                    }
                }
                i3++;
                i = i4;
            }
            if (this.f20763i && this.f20765k != 0) {
                mo29169a(this.f20746u);
                int i9 = this.f20765k;
                if (i9 == 2) {
                    this.f20748w >>= 4;
                    byte[] bArr4 = this.f20760f;
                    int i10 = this.f20761g;
                    this.f20761g = i10 + 1;
                    bArr4[i10] = (byte) (this.f20748w & 255);
                } else if (i9 == 3) {
                    this.f20748w >>= 2;
                    byte[] bArr5 = this.f20760f;
                    int i11 = this.f20761g;
                    this.f20761g = i11 + 1;
                    int i12 = this.f20748w;
                    bArr5[i11] = (byte) ((i12 >> 8) & 255);
                    int i13 = this.f20761g;
                    this.f20761g = i13 + 1;
                    bArr5[i13] = (byte) (i12 & 255);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v20 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v2, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29166b(byte[] r9, int r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r8.f20763i
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r11 >= 0) goto L_0x00b7
            r8.f20763i = r1
            int r9 = r8.f20765k
            if (r9 != 0) goto L_0x0014
            int r9 = r8.f20758d
            if (r9 != 0) goto L_0x0014
            return
        L_0x0014:
            int r9 = r8.f20747v
            r8.mo29169a(r9)
            int r9 = r8.f20761g
            int r10 = r8.f20765k
            r11 = 61
            if (r10 == r1) goto L_0x0060
            r1 = 2
            if (r10 == r1) goto L_0x0025
            goto L_0x0094
        L_0x0025:
            byte[] r10 = r8.f20760f
            int r2 = r9 + 1
            r8.f20761g = r2
            byte[] r2 = r8.f20743r
            int r3 = r8.f20748w
            int r4 = r3 >> 10
            r4 = r4 & 63
            byte r4 = r2[r4]
            r10[r9] = r4
            int r4 = r8.f20761g
            int r5 = r4 + 1
            r8.f20761g = r5
            int r5 = r3 >> 4
            r5 = r5 & 63
            byte r5 = r2[r5]
            r10[r4] = r5
            int r4 = r8.f20761g
            int r5 = r4 + 1
            r8.f20761g = r5
            int r1 = r3 << 2
            r1 = r1 & 63
            byte r1 = r2[r1]
            r10[r4] = r1
            byte[] r1 = f20736B
            if (r2 != r1) goto L_0x0094
            int r1 = r8.f20761g
            int r2 = r1 + 1
            r8.f20761g = r2
            r10[r1] = r11
            goto L_0x0094
        L_0x0060:
            byte[] r10 = r8.f20760f
            int r1 = r9 + 1
            r8.f20761g = r1
            byte[] r1 = r8.f20743r
            int r2 = r8.f20748w
            int r3 = r2 >> 2
            r3 = r3 & 63
            byte r3 = r1[r3]
            r10[r9] = r3
            int r3 = r8.f20761g
            int r4 = r3 + 1
            r8.f20761g = r4
            int r2 = r2 << 4
            r2 = r2 & 63
            byte r2 = r1[r2]
            r10[r3] = r2
            byte[] r2 = f20736B
            if (r1 != r2) goto L_0x0094
            int r1 = r8.f20761g
            int r2 = r1 + 1
            r8.f20761g = r2
            r10[r1] = r11
            int r1 = r8.f20761g
            int r2 = r1 + 1
            r8.f20761g = r2
            r10[r1] = r11
        L_0x0094:
            int r10 = r8.f20764j
            int r11 = r8.f20761g
            int r9 = r11 - r9
            int r10 = r10 + r9
            r8.f20764j = r10
            int r9 = r8.f20758d
            if (r9 <= 0) goto L_0x013b
            int r9 = r8.f20764j
            if (r9 <= 0) goto L_0x013b
            byte[] r9 = r8.f20745t
            byte[] r10 = r8.f20760f
            int r1 = r9.length
            java.lang.System.arraycopy(r9, r0, r10, r11, r1)
            int r9 = r8.f20761g
            byte[] r10 = r8.f20745t
            int r10 = r10.length
            int r9 = r9 + r10
            r8.f20761g = r9
            goto L_0x013b
        L_0x00b7:
            r2 = r10
            r10 = 0
        L_0x00b9:
            if (r10 >= r11) goto L_0x013b
            int r3 = r8.f20747v
            r8.mo29169a(r3)
            int r3 = r8.f20765k
            int r3 = r3 + r1
            int r3 = r3 % 3
            r8.f20765k = r3
            int r3 = r2 + 1
            byte r2 = r9[r2]
            if (r2 >= 0) goto L_0x00cf
            int r2 = r2 + 256
        L_0x00cf:
            int r4 = r8.f20748w
            int r4 = r4 << 8
            int r4 = r4 + r2
            r8.f20748w = r4
            int r2 = r8.f20765k
            if (r2 != 0) goto L_0x0136
            byte[] r2 = r8.f20760f
            int r4 = r8.f20761g
            int r5 = r4 + 1
            r8.f20761g = r5
            byte[] r5 = r8.f20743r
            int r6 = r8.f20748w
            int r7 = r6 >> 18
            r7 = r7 & 63
            byte r7 = r5[r7]
            r2[r4] = r7
            int r4 = r8.f20761g
            int r7 = r4 + 1
            r8.f20761g = r7
            int r7 = r6 >> 12
            r7 = r7 & 63
            byte r7 = r5[r7]
            r2[r4] = r7
            int r4 = r8.f20761g
            int r7 = r4 + 1
            r8.f20761g = r7
            int r7 = r6 >> 6
            r7 = r7 & 63
            byte r7 = r5[r7]
            r2[r4] = r7
            int r4 = r8.f20761g
            int r7 = r4 + 1
            r8.f20761g = r7
            r6 = r6 & 63
            byte r5 = r5[r6]
            r2[r4] = r5
            int r4 = r8.f20764j
            int r4 = r4 + 4
            r8.f20764j = r4
            int r4 = r8.f20758d
            if (r4 <= 0) goto L_0x0136
            int r5 = r8.f20764j
            if (r4 > r5) goto L_0x0136
            byte[] r4 = r8.f20745t
            int r5 = r8.f20761g
            int r6 = r4.length
            java.lang.System.arraycopy(r4, r0, r2, r5, r6)
            int r2 = r8.f20761g
            byte[] r4 = r8.f20745t
            int r4 = r4.length
            int r2 = r2 + r4
            r8.f20761g = r2
            r8.f20764j = r0
        L_0x0136:
            int r10 = r10 + 1
            r2 = r3
            goto L_0x00b9
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.repackaged.org.apache.commons.codec.p311e.C7316a.mo29166b(byte[], int, int):void");
    }

    /* renamed from: d */
    public boolean mo29167d() {
        return this.f20743r == f20737C;
    }

    public C7316a(boolean z) {
        this(76, f20735A, z);
    }

    /* renamed from: c */
    public static byte[] m35417c(String str) {
        return new C7316a().mo29171a(str);
    }

    /* renamed from: d */
    public static boolean m35418d(String str) {
        return m35427o(C7318c.m35468f(str));
    }

    public C7316a(int i) {
        this(i, f20735A);
    }

    public C7316a(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public C7316a(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.f20744s = f20738D;
        if (bArr == null) {
            this.f20747v = 4;
            this.f20745t = null;
        } else if (mo29176c(bArr)) {
            String f = C7318c.m35467f(bArr);
            StringBuilder sb = new StringBuilder();
            sb.append("lineSeparator must not contain base64 characters: [");
            sb.append(f);
            sb.append("]");
            throw new IllegalArgumentException(sb.toString());
        } else if (i > 0) {
            this.f20747v = bArr.length + 4;
            this.f20745t = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.f20745t, 0, bArr.length);
        } else {
            this.f20747v = 4;
            this.f20745t = null;
        }
        this.f20746u = this.f20747v - 1;
        this.f20743r = z ? f20737C : f20736B;
    }

    /* renamed from: a */
    public static byte[] m35412a(byte[] bArr, boolean z, boolean z2) {
        return m35413a(bArr, z, z2, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static byte[] m35413a(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        C7316a aVar = z ? new C7316a(z2) : new C7316a(0, f20735A, z2);
        long f = aVar.mo29179f(bArr);
        if (f <= ((long) i)) {
            return aVar.mo29161b(bArr);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input array too big, the output array would be bigger (");
        sb.append(f);
        sb.append(") than the specified maximum size of ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static byte[] m35411a(BigInteger bigInteger) {
        if (bigInteger != null) {
            return m35415b(m35414b(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29165a(byte b) {
        if (b >= 0) {
            byte[] bArr = this.f20744s;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static byte[] m35415b(byte[] bArr, boolean z) {
        return m35412a(bArr, z, false);
    }

    /* renamed from: b */
    static byte[] m35414b(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int i = 0;
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
            i = 1;
        }
        int i2 = bitLength / 8;
        int i3 = i2 - length;
        byte[] bArr = new byte[i2];
        System.arraycopy(byteArray, i, bArr, i3, length);
        return bArr;
    }
}
