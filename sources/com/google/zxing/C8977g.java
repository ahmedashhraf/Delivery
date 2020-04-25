package com.google.zxing;

/* renamed from: com.google.zxing.g */
/* compiled from: InvertedLuminanceSource */
public final class C8977g extends C8978h {

    /* renamed from: c */
    private final C8978h f23476c;

    public C8977g(C8978h hVar) {
        super(hVar.mo32812c(), hVar.mo32811a());
        this.f23476c = hVar;
    }

    /* renamed from: a */
    public byte[] mo32804a(int i, byte[] bArr) {
        byte[] a = this.f23476c.mo32804a(i, bArr);
        int c = mo32812c();
        for (int i2 = 0; i2 < c; i2++) {
            a[i2] = (byte) (255 - (a[i2] & 255));
        }
        return a;
    }

    /* renamed from: b */
    public byte[] mo32805b() {
        byte[] b = this.f23476c.mo32805b();
        int c = mo32812c() * mo32811a();
        byte[] bArr = new byte[c];
        for (int i = 0; i < c; i++) {
            bArr[i] = (byte) (255 - (b[i] & 255));
        }
        return bArr;
    }

    /* renamed from: d */
    public C8978h mo32806d() {
        return this.f23476c;
    }

    /* renamed from: e */
    public boolean mo32807e() {
        return this.f23476c.mo32807e();
    }

    /* renamed from: f */
    public boolean mo32808f() {
        return this.f23476c.mo32808f();
    }

    /* renamed from: g */
    public C8978h mo32809g() {
        return new C8977g(this.f23476c.mo32809g());
    }

    /* renamed from: h */
    public C8978h mo32810h() {
        return new C8977g(this.f23476c.mo32810h());
    }

    /* renamed from: a */
    public C8978h mo32803a(int i, int i2, int i3, int i4) {
        return new C8977g(this.f23476c.mo32803a(i, i2, i3, i4));
    }
}
