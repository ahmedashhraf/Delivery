package p076c.p082c.p083a.p087t;

/* renamed from: c.c.a.t.c */
/* compiled from: NeuQuant */
class C2269c {

    /* renamed from: A */
    protected static final int f9053A = 6;

    /* renamed from: B */
    protected static final int f9054B = 64;

    /* renamed from: C */
    protected static final int f9055C = 2048;

    /* renamed from: D */
    protected static final int f9056D = 30;

    /* renamed from: E */
    protected static final int f9057E = 10;

    /* renamed from: F */
    protected static final int f9058F = 1024;

    /* renamed from: G */
    protected static final int f9059G = 8;

    /* renamed from: H */
    protected static final int f9060H = 256;

    /* renamed from: I */
    protected static final int f9061I = 18;

    /* renamed from: J */
    protected static final int f9062J = 262144;

    /* renamed from: j */
    protected static final int f9063j = 256;

    /* renamed from: k */
    protected static final int f9064k = 499;

    /* renamed from: l */
    protected static final int f9065l = 491;

    /* renamed from: m */
    protected static final int f9066m = 487;

    /* renamed from: n */
    protected static final int f9067n = 503;

    /* renamed from: o */
    protected static final int f9068o = 1509;

    /* renamed from: p */
    protected static final int f9069p = 255;

    /* renamed from: q */
    protected static final int f9070q = 4;

    /* renamed from: r */
    protected static final int f9071r = 100;

    /* renamed from: s */
    protected static final int f9072s = 16;

    /* renamed from: t */
    protected static final int f9073t = 65536;

    /* renamed from: u */
    protected static final int f9074u = 10;

    /* renamed from: v */
    protected static final int f9075v = 1024;

    /* renamed from: w */
    protected static final int f9076w = 10;

    /* renamed from: x */
    protected static final int f9077x = 64;

    /* renamed from: y */
    protected static final int f9078y = 65536;

    /* renamed from: z */
    protected static final int f9079z = 32;

    /* renamed from: a */
    protected int f9080a;

    /* renamed from: b */
    protected byte[] f9081b;

    /* renamed from: c */
    protected int f9082c;

    /* renamed from: d */
    protected int f9083d;

    /* renamed from: e */
    protected int[][] f9084e;

    /* renamed from: f */
    protected int[] f9085f = new int[256];

    /* renamed from: g */
    protected int[] f9086g = new int[256];

    /* renamed from: h */
    protected int[] f9087h = new int[256];

    /* renamed from: i */
    protected int[] f9088i = new int[32];

    public C2269c(byte[] bArr, int i, int i2) {
        this.f9081b = bArr;
        this.f9082c = i;
        this.f9083d = i2;
        this.f9084e = new int[256][];
        for (int i3 = 0; i3 < 256; i3++) {
            int[][] iArr = this.f9084e;
            iArr[i3] = new int[4];
            int[] iArr2 = iArr[i3];
            int i4 = (i3 << 12) / 256;
            iArr2[2] = i4;
            iArr2[1] = i4;
            iArr2[0] = i4;
            this.f9087h[i3] = 256;
            this.f9086g[i3] = 0;
        }
    }

    /* renamed from: a */
    public byte[] mo9627a() {
        byte[] bArr = new byte[768];
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            iArr[this.f9084e[i][3]] = i;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < 256) {
            int i4 = iArr[i2];
            int i5 = i3 + 1;
            int[][] iArr2 = this.f9084e;
            bArr[i3] = (byte) iArr2[i4][0];
            int i6 = i5 + 1;
            bArr[i5] = (byte) iArr2[i4][1];
            int i7 = i6 + 1;
            bArr[i6] = (byte) iArr2[i4][2];
            i2++;
            i3 = i7;
        }
        return bArr;
    }

    /* renamed from: b */
    public void mo9629b() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < 256) {
            int[] iArr = this.f9084e[i];
            int i4 = i + 1;
            int i5 = i;
            int i6 = iArr[1];
            for (int i7 = i4; i7 < 256; i7++) {
                int[] iArr2 = this.f9084e[i7];
                if (iArr2[1] < i6) {
                    i6 = iArr2[1];
                    i5 = i7;
                }
            }
            int[] iArr3 = this.f9084e[i5];
            if (i != i5) {
                int i8 = iArr3[0];
                iArr3[0] = iArr[0];
                iArr[0] = i8;
                int i9 = iArr3[1];
                iArr3[1] = iArr[1];
                iArr[1] = i9;
                int i10 = iArr3[2];
                iArr3[2] = iArr[2];
                iArr[2] = i10;
                int i11 = iArr3[3];
                iArr3[3] = iArr[3];
                iArr[3] = i11;
            }
            if (i6 != i2) {
                this.f9085f[i2] = (i3 + i) >> 1;
                while (true) {
                    i2++;
                    if (i2 >= i6) {
                        break;
                    }
                    this.f9085f[i2] = i;
                }
                i3 = i;
                i2 = i6;
            }
            i = i4;
        }
        this.f9085f[i2] = (i3 + 255) >> 1;
        for (int i12 = i2 + 1; i12 < 256; i12++) {
            this.f9085f[i12] = 255;
        }
    }

    /* renamed from: c */
    public void mo9631c() {
        if (this.f9082c < f9068o) {
            this.f9083d = 1;
        }
        int i = this.f9083d;
        this.f9080a = ((i - 1) / 3) + 30;
        byte[] bArr = this.f9081b;
        int i2 = this.f9082c;
        int i3 = i2 / (i * 3);
        int i4 = i3 / 100;
        for (int i5 = 0; i5 < 32; i5++) {
            this.f9088i[i5] = 1024 * (((1024 - (i5 * i5)) * 256) / 1024);
        }
        int i6 = this.f9082c;
        int i7 = i6 < f9068o ? 3 : i6 % f9064k != 0 ? 1497 : i6 % f9065l != 0 ? 1473 : i6 % f9066m != 0 ? 1461 : f9068o;
        int i8 = i4;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1024;
        int i12 = 32;
        int i13 = 2048;
        while (i9 < i3) {
            int i14 = (bArr[i10 + 0] & 255) << 4;
            int i15 = (bArr[i10 + 1] & 255) << 4;
            int i16 = (bArr[i10 + 2] & 255) << 4;
            int a = mo9625a(i14, i15, i16);
            int i17 = i16;
            int i18 = i15;
            int i19 = i14;
            mo9630b(i11, a, i14, i15, i17);
            if (i12 != 0) {
                mo9626a(i12, a, i19, i18, i17);
            }
            i10 += i7;
            if (i10 >= i2) {
                i10 -= this.f9082c;
            }
            i9++;
            if (i8 == 0) {
                i8 = 1;
            }
            if (i9 % i8 == 0) {
                i11 -= i11 / this.f9080a;
                i13 -= i13 / 30;
                int i20 = i13 >> 6;
                if (i20 <= 1) {
                    i20 = 0;
                }
                for (int i21 = 0; i21 < i20; i21++) {
                    int i22 = i20 * i20;
                    this.f9088i[i21] = (((i22 - (i21 * i21)) * 256) / i22) * i11;
                }
                i12 = i20;
            }
        }
    }

    /* renamed from: d */
    public byte[] mo9632d() {
        mo9631c();
        mo9633e();
        mo9629b();
        return mo9627a();
    }

    /* renamed from: e */
    public void mo9633e() {
        for (int i = 0; i < 256; i++) {
            int[][] iArr = this.f9084e;
            int[] iArr2 = iArr[i];
            iArr2[0] = iArr2[0] >> 4;
            int[] iArr3 = iArr[i];
            iArr3[1] = iArr3[1] >> 4;
            int[] iArr4 = iArr[i];
            iArr4[2] = iArr4[2] >> 4;
            iArr[i][3] = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9626a(int i, int i2, int i3, int i4, int i5) {
        int i6 = i2 - i;
        if (i6 < -1) {
            i6 = -1;
        }
        int i7 = i2 + i;
        if (i7 > 256) {
            i7 = 256;
        }
        int i8 = i2 + 1;
        int i9 = i2 - 1;
        int i10 = 1;
        while (true) {
            if (i8 < i7 || i9 > i6) {
                int i11 = i10 + 1;
                int i12 = this.f9088i[i10];
                if (i8 < i7) {
                    int i13 = i8 + 1;
                    int[] iArr = this.f9084e[i8];
                    try {
                        iArr[0] = iArr[0] - (((iArr[0] - i3) * i12) / 262144);
                        iArr[1] = iArr[1] - (((iArr[1] - i4) * i12) / 262144);
                        iArr[2] = iArr[2] - (((iArr[2] - i5) * i12) / 262144);
                    } catch (Exception unused) {
                    }
                    i8 = i13;
                }
                if (i9 > i6) {
                    int i14 = i9 - 1;
                    int[] iArr2 = this.f9084e[i9];
                    try {
                        iArr2[0] = iArr2[0] - (((iArr2[0] - i3) * i12) / 262144);
                        iArr2[1] = iArr2[1] - (((iArr2[1] - i4) * i12) / 262144);
                        iArr2[2] = iArr2[2] - ((i12 * (iArr2[2] - i5)) / 262144);
                    } catch (Exception unused2) {
                    }
                    i10 = i11;
                    i9 = i14;
                } else {
                    i10 = i11;
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo9625a(int i, int i2, int i3) {
        int i4 = -1;
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < 256; i8++) {
            int[] iArr = this.f9084e[i8];
            int i9 = iArr[0] - i;
            if (i9 < 0) {
                i9 = -i9;
            }
            int i10 = iArr[1] - i2;
            if (i10 < 0) {
                i10 = -i10;
            }
            int i11 = i9 + i10;
            int i12 = iArr[2] - i3;
            if (i12 < 0) {
                i12 = -i12;
            }
            int i13 = i11 + i12;
            if (i13 < i6) {
                i4 = i8;
                i6 = i13;
            }
            int i14 = i13 - (this.f9086g[i8] >> 12);
            if (i14 < i7) {
                i5 = i8;
                i7 = i14;
            }
            int[] iArr2 = this.f9087h;
            int i15 = iArr2[i8] >> 10;
            iArr2[i8] = iArr2[i8] - i15;
            int[] iArr3 = this.f9086g;
            iArr3[i8] = iArr3[i8] + (i15 << 10);
        }
        int[] iArr4 = this.f9087h;
        iArr4[i4] = iArr4[i4] + 64;
        int[] iArr5 = this.f9086g;
        iArr5[i4] = iArr5[i4] - 65536;
        return i5;
    }

    /* renamed from: b */
    public int mo9628b(int i, int i2, int i3) {
        int i4 = this.f9085f[i2];
        int i5 = i4 - 1;
        int i6 = -1;
        int i7 = 1000;
        while (true) {
            if (i4 >= 256 && i5 < 0) {
                return i6;
            }
            if (i4 < 256) {
                int[] iArr = this.f9084e[i4];
                int i8 = iArr[1] - i2;
                if (i8 >= i7) {
                    i4 = 256;
                } else {
                    i4++;
                    if (i8 < 0) {
                        i8 = -i8;
                    }
                    int i9 = iArr[0] - i;
                    if (i9 < 0) {
                        i9 = -i9;
                    }
                    int i10 = i8 + i9;
                    if (i10 < i7) {
                        int i11 = iArr[2] - i3;
                        if (i11 < 0) {
                            i11 = -i11;
                        }
                        int i12 = i10 + i11;
                        if (i12 < i7) {
                            i6 = iArr[3];
                            i7 = i12;
                        }
                    }
                }
            }
            if (i5 >= 0) {
                int[] iArr2 = this.f9084e[i5];
                int i13 = i2 - iArr2[1];
                if (i13 >= i7) {
                    i5 = -1;
                } else {
                    i5--;
                    if (i13 < 0) {
                        i13 = -i13;
                    }
                    int i14 = iArr2[0] - i;
                    if (i14 < 0) {
                        i14 = -i14;
                    }
                    int i15 = i13 + i14;
                    if (i15 < i7) {
                        int i16 = iArr2[2] - i3;
                        if (i16 < 0) {
                            i16 = -i16;
                        }
                        int i17 = i16 + i15;
                        if (i17 < i7) {
                            i6 = iArr2[3];
                            i7 = i17;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9630b(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.f9084e[i2];
        iArr[0] = iArr[0] - (((iArr[0] - i3) * i) / 1024);
        iArr[1] = iArr[1] - (((iArr[1] - i4) * i) / 1024);
        iArr[2] = iArr[2] - ((i * (iArr[2] - i5)) / 1024);
    }
}
