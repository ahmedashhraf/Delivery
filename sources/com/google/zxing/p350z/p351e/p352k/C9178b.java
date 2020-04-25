package com.google.zxing.p350z.p351e.p352k;

import com.google.zxing.p350z.C9161a;

/* renamed from: com.google.zxing.z.e.k.b */
/* compiled from: ModulusGF */
public final class C9178b {

    /* renamed from: f */
    public static final C9178b f24107f = new C9178b(C9161a.f24030a, 3);

    /* renamed from: a */
    private final int[] f24108a;

    /* renamed from: b */
    private final int[] f24109b;

    /* renamed from: c */
    private final C9179c f24110c;

    /* renamed from: d */
    private final C9179c f24111d;

    /* renamed from: e */
    private final int f24112e;

    private C9178b(int i, int i2) {
        this.f24112e = i;
        this.f24108a = new int[i];
        this.f24109b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f24108a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f24109b[this.f24108a[i5]] = i5;
        }
        this.f24110c = new C9179c(this, new int[]{0});
        this.f24111d = new C9179c(this, new int[]{1});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9179c mo33257a() {
        return this.f24111d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C9179c mo33260b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f24110c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C9179c(this, iArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C9179c mo33263c() {
        return this.f24110c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo33264d(int i, int i2) {
        int i3 = this.f24112e;
        return ((i + i3) - i2) % i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo33256a(int i, int i2) {
        return (i + i2) % this.f24112e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo33261c(int i) {
        if (i != 0) {
            return this.f24109b[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo33255a(int i) {
        return this.f24108a[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo33262c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f24108a;
        int[] iArr2 = this.f24109b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f24112e - 1)];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo33259b(int i) {
        if (i != 0) {
            return this.f24108a[(this.f24112e - this.f24109b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo33258b() {
        return this.f24112e;
    }
}
