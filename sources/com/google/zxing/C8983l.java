package com.google.zxing;

/* renamed from: com.google.zxing.l */
/* compiled from: RGBLuminanceSource */
public final class C8983l extends C8978h {

    /* renamed from: c */
    private final byte[] f23488c;

    /* renamed from: d */
    private final int f23489d;

    /* renamed from: e */
    private final int f23490e;

    /* renamed from: f */
    private final int f23491f;

    /* renamed from: g */
    private final int f23492g;

    public C8983l(int i, int i2, int[] iArr) {
        super(i, i2);
        this.f23489d = i;
        this.f23490e = i2;
        this.f23491f = 0;
        this.f23492g = 0;
        int i3 = i * i2;
        this.f23488c = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = iArr[i4];
            int i6 = (i5 >> 16) & 255;
            int i7 = (i5 >> 7) & 510;
            this.f23488c[i4] = (byte) (((i6 + i7) + (i5 & 255)) / 4);
        }
    }

    /* renamed from: a */
    public byte[] mo32804a(int i, byte[] bArr) {
        if (i < 0 || i >= mo32811a()) {
            StringBuilder sb = new StringBuilder("Requested row is outside the image: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int c = mo32812c();
        if (bArr == null || bArr.length < c) {
            bArr = new byte[c];
        }
        System.arraycopy(this.f23488c, ((i + this.f23492g) * this.f23489d) + this.f23491f, bArr, 0, c);
        return bArr;
    }

    /* renamed from: b */
    public byte[] mo32805b() {
        int c = mo32812c();
        int a = mo32811a();
        if (c == this.f23489d && a == this.f23490e) {
            return this.f23488c;
        }
        int i = c * a;
        byte[] bArr = new byte[i];
        int i2 = this.f23492g;
        int i3 = this.f23489d;
        int i4 = (i2 * i3) + this.f23491f;
        if (c == i3) {
            System.arraycopy(this.f23488c, i4, bArr, 0, i);
            return bArr;
        }
        for (int i5 = 0; i5 < a; i5++) {
            System.arraycopy(this.f23488c, i4, bArr, i5 * c, c);
            i4 += this.f23489d;
        }
        return bArr;
    }

    /* renamed from: e */
    public boolean mo32807e() {
        return true;
    }

    /* renamed from: a */
    public C8978h mo32803a(int i, int i2, int i3, int i4) {
        C8983l lVar = new C8983l(this.f23488c, this.f23489d, this.f23490e, this.f23491f + i, this.f23492g + i2, i3, i4);
        return lVar;
    }

    private C8983l(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i5 + i3 > i || i6 + i4 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f23488c = bArr;
        this.f23489d = i;
        this.f23490e = i2;
        this.f23491f = i3;
        this.f23492g = i4;
    }
}
