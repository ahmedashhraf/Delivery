package com.google.zxing.common.reedsolomon;

/* renamed from: com.google.zxing.common.reedsolomon.a */
/* compiled from: GenericGF */
public final class C8970a {

    /* renamed from: h */
    public static final C8970a f23454h = new C8970a(4201, 4096, 1);

    /* renamed from: i */
    public static final C8970a f23455i = new C8970a(1033, 1024, 1);

    /* renamed from: j */
    public static final C8970a f23456j = new C8970a(67, 64, 1);

    /* renamed from: k */
    public static final C8970a f23457k = new C8970a(19, 16, 1);

    /* renamed from: l */
    public static final C8970a f23458l = new C8970a(285, 256, 0);

    /* renamed from: m */
    public static final C8970a f23459m;

    /* renamed from: n */
    public static final C8970a f23460n;

    /* renamed from: o */
    public static final C8970a f23461o = f23456j;

    /* renamed from: a */
    private final int[] f23462a;

    /* renamed from: b */
    private final int[] f23463b;

    /* renamed from: c */
    private final C8971b f23464c;

    /* renamed from: d */
    private final C8971b f23465d;

    /* renamed from: e */
    private final int f23466e;

    /* renamed from: f */
    private final int f23467f;

    /* renamed from: g */
    private final int f23468g;

    static {
        C8970a aVar = new C8970a(301, 256, 1);
        f23459m = aVar;
        f23460n = aVar;
    }

    public C8970a(int i, int i2, int i3) {
        this.f23467f = i;
        this.f23466e = i2;
        this.f23468g = i3;
        this.f23462a = new int[i2];
        this.f23463b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f23462a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f23463b[this.f23462a[i6]] = i6;
        }
        this.f23464c = new C8971b(this, new int[]{0});
        this.f23465d = new C8971b(this, new int[]{1});
    }

    /* renamed from: c */
    static int m41912c(int i, int i2) {
        return i ^ i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8971b mo32776a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f23464c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C8971b(this, iArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8971b mo32779b() {
        return this.f23465d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo32781c(int i) {
        if (i != 0) {
            return this.f23463b[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C8971b mo32782d() {
        return this.f23464c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f23467f));
        sb.append(',');
        sb.append(this.f23466e);
        sb.append(')');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo32777b(int i) {
        if (i != 0) {
            return this.f23462a[(this.f23466e - this.f23463b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: c */
    public int mo32780c() {
        return this.f23466e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo32778b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f23462a;
        int[] iArr2 = this.f23463b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f23466e - 1)];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo32775a(int i) {
        return this.f23462a[i];
    }

    /* renamed from: a */
    public int mo32774a() {
        return this.f23468g;
    }
}
