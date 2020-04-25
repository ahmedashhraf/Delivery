package com.google.zxing;

/* renamed from: com.google.zxing.h */
/* compiled from: LuminanceSource */
public abstract class C8978h {

    /* renamed from: a */
    private final int f23477a;

    /* renamed from: b */
    private final int f23478b;

    protected C8978h(int i, int i2) {
        this.f23477a = i;
        this.f23478b = i2;
    }

    /* renamed from: a */
    public final int mo32811a() {
        return this.f23478b;
    }

    /* renamed from: a */
    public abstract byte[] mo32804a(int i, byte[] bArr);

    /* renamed from: b */
    public abstract byte[] mo32805b();

    /* renamed from: c */
    public final int mo32812c() {
        return this.f23477a;
    }

    /* renamed from: d */
    public C8978h mo32806d() {
        return new C8977g(this);
    }

    /* renamed from: e */
    public boolean mo32807e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo32808f() {
        return false;
    }

    /* renamed from: g */
    public C8978h mo32809g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    /* renamed from: h */
    public C8978h mo32810h() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString() {
        int i = this.f23477a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.f23478b * (i + 1));
        byte[] bArr2 = bArr;
        for (int i2 = 0; i2 < this.f23478b; i2++) {
            bArr2 = mo32804a(i2, bArr2);
            for (int i3 = 0; i3 < this.f23477a; i3++) {
                byte b = bArr2[i3] & 255;
                char c = b < 64 ? '#' : b < 128 ? '+' : b < 192 ? '.' : ' ';
                sb.append(c);
            }
            sb.append(10);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public C8978h mo32803a(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }
}
