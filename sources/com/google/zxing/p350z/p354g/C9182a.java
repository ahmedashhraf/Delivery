package com.google.zxing.p350z.p354g;

import java.lang.reflect.Array;

/* renamed from: com.google.zxing.z.g.a */
/* compiled from: BarcodeMatrix */
public final class C9182a {

    /* renamed from: a */
    private final C9183b[] f24128a;

    /* renamed from: b */
    private int f24129b;

    /* renamed from: c */
    private final int f24130c;

    /* renamed from: d */
    private final int f24131d;

    C9182a(int i, int i2) {
        this.f24128a = new C9183b[i];
        int length = this.f24128a.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f24128a[i3] = new C9183b(((i2 + 4) * 17) + 1);
        }
        this.f24131d = i2 * 17;
        this.f24130c = i;
        this.f24129b = -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33280a(int i, int i2, byte b) {
        this.f24128a[i2].mo33284a(i, b);
    }

    /* renamed from: b */
    public byte[][] mo33282b() {
        return mo33281a(1, 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo33283c() {
        this.f24129b++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9183b mo33279a() {
        return this.f24128a[this.f24129b];
    }

    /* renamed from: a */
    public byte[][] mo33281a(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, new int[]{this.f24130c * i2, this.f24131d * i});
        int i3 = this.f24130c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f24128a[i4 / i2].mo33286a(i);
        }
        return bArr;
    }
}
