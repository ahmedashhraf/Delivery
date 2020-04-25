package com.google.zxing;

import androidx.core.p034l.C0962e0;

/* renamed from: com.google.zxing.k */
/* compiled from: PlanarYUVLuminanceSource */
public final class C8982k extends C8978h {

    /* renamed from: h */
    private static final int f23482h = 2;

    /* renamed from: c */
    private final byte[] f23483c;

    /* renamed from: d */
    private final int f23484d;

    /* renamed from: e */
    private final int f23485e;

    /* renamed from: f */
    private final int f23486f;

    /* renamed from: g */
    private final int f23487g;

    public C8982k(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f23483c = bArr;
        this.f23484d = i;
        this.f23485e = i2;
        this.f23486f = i3;
        this.f23487g = i4;
        if (z) {
            m41966a(i5, i6);
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
        System.arraycopy(this.f23483c, ((i + this.f23487g) * this.f23484d) + this.f23486f, bArr, 0, c);
        return bArr;
    }

    /* renamed from: b */
    public byte[] mo32805b() {
        int c = mo32812c();
        int a = mo32811a();
        if (c == this.f23484d && a == this.f23485e) {
            return this.f23483c;
        }
        int i = c * a;
        byte[] bArr = new byte[i];
        int i2 = this.f23487g;
        int i3 = this.f23484d;
        int i4 = (i2 * i3) + this.f23486f;
        if (c == i3) {
            System.arraycopy(this.f23483c, i4, bArr, 0, i);
            return bArr;
        }
        for (int i5 = 0; i5 < a; i5++) {
            System.arraycopy(this.f23483c, i4, bArr, i5 * c, c);
            i4 += this.f23484d;
        }
        return bArr;
    }

    /* renamed from: e */
    public boolean mo32807e() {
        return true;
    }

    /* renamed from: i */
    public int mo32816i() {
        return mo32811a() / 2;
    }

    /* renamed from: j */
    public int mo32817j() {
        return mo32812c() / 2;
    }

    /* renamed from: k */
    public int[] mo32818k() {
        int c = mo32812c() / 2;
        int a = mo32811a() / 2;
        int[] iArr = new int[(c * a)];
        byte[] bArr = this.f23483c;
        int i = (this.f23487g * this.f23484d) + this.f23486f;
        for (int i2 = 0; i2 < a; i2++) {
            int i3 = i2 * c;
            for (int i4 = 0; i4 < c; i4++) {
                iArr[i3 + i4] = ((bArr[(i4 << 1) + i] & 255) * 65793) | C0962e0.f4343t;
            }
            i += this.f23484d << 1;
        }
        return iArr;
    }

    /* renamed from: a */
    public C8978h mo32803a(int i, int i2, int i3, int i4) {
        C8982k kVar = new C8982k(this.f23483c, this.f23484d, this.f23485e, this.f23486f + i, this.f23487g + i2, i3, i4, false);
        return kVar;
    }

    /* renamed from: a */
    private void m41966a(int i, int i2) {
        byte[] bArr = this.f23483c;
        int i3 = (this.f23487g * this.f23484d) + this.f23486f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f23484d;
        }
    }
}
