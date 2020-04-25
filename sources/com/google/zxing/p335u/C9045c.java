package com.google.zxing.p335u;

/* renamed from: com.google.zxing.u.c */
/* compiled from: BitSource */
public final class C9045c {

    /* renamed from: a */
    private final byte[] f23667a;

    /* renamed from: b */
    private int f23668b;

    /* renamed from: c */
    private int f23669c;

    public C9045c(byte[] bArr) {
        this.f23667a = bArr;
    }

    /* renamed from: a */
    public int mo33010a(int i) {
        byte b;
        if (i <= 0 || i > 32 || i > mo33009a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.f23669c;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int i4 = i < i3 ? i : i3;
            int i5 = i3 - i4;
            int i6 = (255 >> (8 - i4)) << i5;
            byte[] bArr = this.f23667a;
            int i7 = this.f23668b;
            b = (i6 & bArr[i7]) >> i5;
            i -= i4;
            this.f23669c += i4;
            if (this.f23669c == 8) {
                this.f23669c = 0;
                this.f23668b = i7 + 1;
            }
        } else {
            b = 0;
        }
        if (i <= 0) {
            return b;
        }
        while (i >= 8) {
            int i8 = b << 8;
            byte[] bArr2 = this.f23667a;
            int i9 = this.f23668b;
            b = i8 | (bArr2[i9] & 255);
            this.f23668b = i9 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i10 = 8 - i;
        int i11 = (b << i) | ((((255 >> i10) << i10) & this.f23667a[this.f23668b]) >> i10);
        this.f23669c += i;
        return i11;
    }

    /* renamed from: b */
    public int mo33011b() {
        return this.f23669c;
    }

    /* renamed from: c */
    public int mo33012c() {
        return this.f23668b;
    }

    /* renamed from: a */
    public int mo33009a() {
        return ((this.f23667a.length - this.f23668b) * 8) - this.f23669c;
    }
}
