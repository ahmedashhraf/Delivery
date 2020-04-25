package p205i.p471b.p472a.p473a.p474c.p475i;

import org.jcodec.codecs.mjpeg.JpegConst;

/* renamed from: i.b.a.a.c.i.d */
/* compiled from: ByteVector */
public class C13943d {

    /* renamed from: a */
    byte[] f40484a;

    /* renamed from: b */
    int f40485b;

    public C13943d() {
        this.f40484a = new byte[64];
    }

    /* renamed from: d */
    private void m59910d(int i) {
        int length = this.f40484a.length * 2;
        int i2 = i + this.f40485b;
        if (length > i2) {
            i2 = length;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f40484a, 0, bArr, 0, this.f40485b);
        this.f40484a = bArr;
    }

    /* renamed from: a */
    public C13943d mo44066a(int i) {
        int i2 = this.f40485b;
        int i3 = i2 + 1;
        if (i3 > this.f40484a.length) {
            m59910d(1);
        }
        this.f40484a[i2] = (byte) i;
        this.f40485b = i3;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C13943d mo44073b(int i, int i2) {
        int i3 = this.f40485b;
        if (i3 + 3 > this.f40484a.length) {
            m59910d(3);
        }
        byte[] bArr = this.f40484a;
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i2;
        this.f40485b = i6;
        return this;
    }

    /* renamed from: c */
    public C13943d mo44074c(int i) {
        int i2 = this.f40485b;
        if (i2 + 2 > this.f40484a.length) {
            m59910d(2);
        }
        byte[] bArr = this.f40484a;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        this.f40485b = i4;
        return this;
    }

    public C13943d(int i) {
        this.f40484a = new byte[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13943d mo44067a(int i, int i2) {
        int i3 = this.f40485b;
        if (i3 + 2 > this.f40484a.length) {
            m59910d(2);
        }
        byte[] bArr = this.f40484a;
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        int i5 = i4 + 1;
        bArr[i4] = (byte) i2;
        this.f40485b = i5;
        return this;
    }

    /* renamed from: b */
    public C13943d mo44072b(int i) {
        int i2 = this.f40485b;
        if (i2 + 4 > this.f40484a.length) {
            m59910d(4);
        }
        byte[] bArr = this.f40484a;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i;
        this.f40485b = i6;
        return this;
    }

    /* renamed from: a */
    public C13943d mo44068a(long j) {
        int i = this.f40485b;
        if (i + 8 > this.f40484a.length) {
            m59910d(8);
        }
        byte[] bArr = this.f40484a;
        int i2 = (int) (j >>> 32);
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i2;
        int i7 = (int) j;
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 >>> 24);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i7 >>> 16);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i7 >>> 8);
        int i11 = i10 + 1;
        bArr[i10] = (byte) i7;
        this.f40485b = i11;
        return this;
    }

    /* renamed from: a */
    public C13943d mo44069a(String str) {
        int length = str.length();
        if (length <= 65535) {
            int i = this.f40485b;
            if (i + 2 + length > this.f40484a.length) {
                m59910d(length + 2);
            }
            byte[] bArr = this.f40484a;
            int i2 = i + 1;
            bArr[i] = (byte) (length >>> 8);
            int i3 = i2 + 1;
            bArr[i2] = (byte) length;
            int i4 = 0;
            while (i4 < length) {
                char charAt = str.charAt(i4);
                if (charAt < 1 || charAt > 127) {
                    this.f40485b = i3;
                    return mo44070a(str, i4, 65535);
                }
                int i5 = i3 + 1;
                bArr[i3] = (byte) charAt;
                i4++;
                i3 = i5;
            }
            this.f40485b = i3;
            return this;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13943d mo44070a(String str, int i, int i2) {
        int i3;
        int length = str.length();
        int i4 = i;
        int i5 = i4;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            i5 = (charAt < 1 || charAt > 127) ? charAt > 2047 ? i5 + 3 : i5 + 2 : i5 + 1;
            i4++;
        }
        if (i5 <= i2) {
            int i6 = (this.f40485b - i) - 2;
            if (i6 >= 0) {
                byte[] bArr = this.f40484a;
                bArr[i6] = (byte) (i5 >>> 8);
                bArr[i6 + 1] = (byte) i5;
            }
            if ((this.f40485b + i5) - i > this.f40484a.length) {
                m59910d(i5 - i);
            }
            int i7 = this.f40485b;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 >= 1 && charAt2 <= 127) {
                    i3 = i7 + 1;
                    this.f40484a[i7] = (byte) charAt2;
                } else if (charAt2 > 2047) {
                    byte[] bArr2 = this.f40484a;
                    int i8 = i7 + 1;
                    bArr2[i7] = (byte) (((charAt2 >> 12) & 15) | JpegConst.APP0);
                    int i9 = i8 + 1;
                    bArr2[i8] = (byte) (((charAt2 >> 6) & 63) | 128);
                    i3 = i9 + 1;
                    bArr2[i9] = (byte) ((charAt2 & '?') | 128);
                } else {
                    byte[] bArr3 = this.f40484a;
                    int i10 = i7 + 1;
                    bArr3[i7] = (byte) (((charAt2 >> 6) & 31) | 192);
                    i7 = i10 + 1;
                    bArr3[i10] = (byte) ((charAt2 & '?') | 128);
                    i++;
                }
                i7 = i3;
                i++;
            }
            this.f40485b = i7;
            return this;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C13943d mo44071a(byte[] bArr, int i, int i2) {
        if (this.f40485b + i2 > this.f40484a.length) {
            m59910d(i2);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i, this.f40484a, this.f40485b, i2);
        }
        this.f40485b += i2;
        return this;
    }
}
