package com.google.zxing.p335u;

import java.util.Arrays;

/* renamed from: com.google.zxing.u.a */
/* compiled from: BitArray */
public final class C9043a implements Cloneable {

    /* renamed from: a */
    private int[] f23661a;

    /* renamed from: b */
    private int f23662b;

    public C9043a() {
        this.f23662b = 0;
        this.f23661a = new int[1];
    }

    /* renamed from: f */
    private void m42278f(int i) {
        if (i > (this.f23661a.length << 5)) {
            int[] g = m42279g(i);
            int[] iArr = this.f23661a;
            System.arraycopy(iArr, 0, g, 0, iArr.length);
            this.f23661a = g;
        }
    }

    /* renamed from: g */
    private static int[] m42279g(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: a */
    public void mo32965a(int i) {
        int[] iArr = this.f23661a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) ^ iArr[i2];
    }

    /* renamed from: b */
    public boolean mo32974b(int i) {
        return ((1 << (i & 31)) & this.f23661a[i / 32]) != 0;
    }

    /* renamed from: c */
    public int mo32975c(int i) {
        int i2 = this.f23662b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (((1 << (i & 31)) - 1) ^ -1) & this.f23661a[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f23661a;
            if (i3 == iArr.length) {
                return this.f23662b;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f23662b;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: d */
    public int mo32979d() {
        return this.f23662b;
    }

    /* renamed from: e */
    public int mo32981e() {
        return (this.f23662b + 7) / 8;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9043a)) {
            return false;
        }
        C9043a aVar = (C9043a) obj;
        if (this.f23662b != aVar.f23662b || !Arrays.equals(this.f23661a, aVar.f23661a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f23662b * 31) + Arrays.hashCode(this.f23661a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f23662b);
        for (int i = 0; i < this.f23662b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(mo32974b(i) ? 'X' : '.');
        }
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo32970a(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.f23662b) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                int i7 = 31;
                int i8 = i6 > i4 ? 0 : i & 31;
                if (i6 >= i5) {
                    i7 = 31 & i3;
                }
                int i9 = (2 << i7) - (1 << i8);
                int i10 = this.f23661a[i6] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
                i6++;
            }
            return true;
        }
    }

    /* renamed from: b */
    public void mo32972b(int i, int i2) {
        this.f23661a[i / 32] = i2;
    }

    public C9043a clone() {
        return new C9043a((int[]) this.f23661a.clone(), this.f23662b);
    }

    /* renamed from: d */
    public int mo32980d(int i) {
        int i2 = this.f23662b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (((1 << (i & 31)) - 1) ^ -1) & (this.f23661a[i3] ^ -1);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f23661a;
            if (i3 == iArr.length) {
                return this.f23662b;
            }
            i4 = iArr[i3] ^ -1;
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f23662b;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: e */
    public void mo32982e(int i) {
        int[] iArr = this.f23661a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: b */
    public void mo32971b() {
        int length = this.f23661a.length;
        for (int i = 0; i < length; i++) {
            this.f23661a[i] = 0;
        }
    }

    public C9043a(int i) {
        this.f23662b = i;
        this.f23661a = m42279g(i);
    }

    /* renamed from: b */
    public void mo32973b(C9043a aVar) {
        if (this.f23662b == aVar.f23662b) {
            int i = 0;
            while (true) {
                int[] iArr = this.f23661a;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ aVar.f23661a[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    /* renamed from: f */
    public void mo32984f() {
        int[] iArr = new int[this.f23661a.length];
        int i = (this.f23662b - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.f23661a[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f23662b;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f23661a = iArr;
    }

    C9043a(int[] iArr, int i) {
        this.f23661a = iArr;
        this.f23662b = i;
    }

    /* renamed from: a */
    public void mo32969a(boolean z) {
        m42278f(this.f23662b + 1);
        if (z) {
            int[] iArr = this.f23661a;
            int i = this.f23662b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f23662b++;
    }

    /* renamed from: c */
    public void mo32976c(int i, int i2) {
        if (i2 < i || i < 0 || i2 > this.f23662b) {
            throw new IllegalArgumentException();
        } else if (i2 != i) {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                int i7 = 31;
                int i8 = i6 > i4 ? 0 : i & 31;
                if (i6 >= i5) {
                    i7 = 31 & i3;
                }
                int i9 = (2 << i7) - (1 << i8);
                int[] iArr = this.f23661a;
                iArr[i6] = i9 | iArr[i6];
                i6++;
            }
        }
    }

    /* renamed from: a */
    public void mo32966a(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m42278f(this.f23662b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            mo32969a(z);
            i2--;
        }
    }

    /* renamed from: a */
    public void mo32968a(C9043a aVar) {
        int i = aVar.f23662b;
        m42278f(this.f23662b + i);
        for (int i2 = 0; i2 < i; i2++) {
            mo32969a(aVar.mo32974b(i2));
        }
    }

    /* renamed from: c */
    public int[] mo32977c() {
        return this.f23661a;
    }

    /* renamed from: a */
    public void mo32967a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i4;
            int i7 = 0;
            for (int i8 = 0; i8 < 8; i8++) {
                if (mo32974b(i6)) {
                    i7 |= 1 << (7 - i8);
                }
                i6++;
            }
            bArr[i2 + i5] = (byte) i7;
            i5++;
            i4 = i6;
        }
    }
}
