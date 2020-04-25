package com.google.zxing.p325a0.p326c;

/* renamed from: com.google.zxing.a0.c.g */
/* compiled from: FormatInformation */
final class C8946g {

    /* renamed from: c */
    private static final int f23384c = 21522;

    /* renamed from: d */
    private static final int[][] f23385d = {new int[]{f23384c, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    private final C8945f f23386a;

    /* renamed from: b */
    private final byte f23387b;

    private C8946g(int i) {
        this.f23386a = C8945f.m41755a((i >> 3) & 3);
        this.f23387b = (byte) (i & 7);
    }

    /* renamed from: a */
    static C8946g m41757a(int i, int i2) {
        C8946g b = m41758b(i, i2);
        if (b != null) {
            return b;
        }
        return m41758b(i ^ f23384c, i2 ^ f23384c);
    }

    /* renamed from: b */
    private static C8946g m41758b(int i, int i2) {
        int[][] iArr;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr2 : f23385d) {
            int i5 = iArr2[0];
            if (i5 == i || i5 == i2) {
                return new C8946g(iArr2[1]);
            }
            int c = m41759c(i, i5);
            if (c < i3) {
                i4 = iArr2[1];
                i3 = c;
            }
            if (i != i2) {
                int c2 = m41759c(i2, i5);
                if (c2 < i3) {
                    i4 = iArr2[1];
                    i3 = c2;
                }
            }
        }
        if (i3 <= 3) {
            return new C8946g(i4);
        }
        return null;
    }

    /* renamed from: c */
    static int m41759c(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8946g)) {
            return false;
        }
        C8946g gVar = (C8946g) obj;
        if (this.f23386a == gVar.f23386a && this.f23387b == gVar.f23387b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f23386a.ordinal() << 3) | this.f23387b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public byte mo32690a() {
        return this.f23387b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8945f mo32691b() {
        return this.f23386a;
    }
}
