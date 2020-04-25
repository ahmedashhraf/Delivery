package com.google.zxing.p346y.p347c0.p348g.p349e;

import com.google.zxing.FormatException;

/* renamed from: com.google.zxing.y.c0.g.e.p */
/* compiled from: DecodedNumeric */
final class C9133p extends C9134q {

    /* renamed from: d */
    static final int f23951d = 10;

    /* renamed from: b */
    private final int f23952b;

    /* renamed from: c */
    private final int f23953c;

    C9133p(int i, int i2, int i3) throws FormatException {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.m41710a();
        }
        this.f23952b = i2;
        this.f23953c = i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo33182b() {
        return this.f23952b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo33183c() {
        return this.f23953c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo33184d() {
        return (this.f23952b * 10) + this.f23953c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo33185e() {
        return this.f23952b == 10 || this.f23953c == 10;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo33186f() {
        return this.f23952b == 10;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo33187g() {
        return this.f23953c == 10;
    }
}
