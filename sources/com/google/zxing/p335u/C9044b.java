package com.google.zxing.p335u;

import java.util.Arrays;

/* renamed from: com.google.zxing.u.b */
/* compiled from: BitMatrix */
public final class C9044b implements Cloneable {

    /* renamed from: N */
    private final int f23663N;

    /* renamed from: O */
    private final int[] f23664O;

    /* renamed from: a */
    private final int f23665a;

    /* renamed from: b */
    private final int f23666b;

    public C9044b(int i) {
        this(i, i);
    }

    /* renamed from: c */
    public static C9044b m42299c(String str, String str2, String str3) {
        if (str != null) {
            boolean[] zArr = new boolean[str.length()];
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = -1;
            int i5 = 0;
            while (true) {
                String str4 = "row lengths do not match";
                if (i >= str.length()) {
                    if (i2 > i3) {
                        if (i4 == -1) {
                            i4 = i2 - i3;
                        } else if (i2 - i3 != i4) {
                            throw new IllegalArgumentException(str4);
                        }
                        i5++;
                    }
                    C9044b bVar = new C9044b(i4, i5);
                    for (int i6 = 0; i6 < i2; i6++) {
                        if (zArr[i6]) {
                            bVar.mo32996c(i6 % i4, i6 / i4);
                        }
                    }
                    return bVar;
                } else if (str.charAt(i) == 10 || str.charAt(i) == 13) {
                    if (i2 > i3) {
                        if (i4 == -1) {
                            i4 = i2 - i3;
                        } else if (i2 - i3 != i4) {
                            throw new IllegalArgumentException(str4);
                        }
                        i5++;
                        i3 = i2;
                    }
                    i++;
                } else {
                    if (str.substring(i, str2.length() + i).equals(str2)) {
                        i += str2.length();
                        zArr[i2] = true;
                    } else if (str.substring(i, str3.length() + i).equals(str3)) {
                        i += str3.length();
                        zArr[i2] = false;
                    } else {
                        StringBuilder sb = new StringBuilder("illegal character encountered: ");
                        sb.append(str.substring(i));
                        throw new IllegalArgumentException(sb.toString());
                    }
                    i2++;
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public void mo32990a(int i, int i2) {
        int i3 = (i2 * this.f23663N) + (i / 32);
        int[] iArr = this.f23664O;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: b */
    public boolean mo32995b(int i, int i2) {
        return ((this.f23664O[(i2 * this.f23663N) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: d */
    public void mo32999d(int i, int i2) {
        int i3 = (i2 * this.f23663N) + (i / 32);
        int[] iArr = this.f23664O;
        iArr[i3] = ((1 << (i & 31)) ^ -1) & iArr[i3];
    }

    /* renamed from: e */
    public int mo33001e() {
        return this.f23666b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9044b)) {
            return false;
        }
        C9044b bVar = (C9044b) obj;
        if (this.f23665a == bVar.f23665a && this.f23666b == bVar.f23666b && this.f23663N == bVar.f23663N && Arrays.equals(this.f23664O, bVar.f23664O)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo33003f() {
        return this.f23663N;
    }

    /* renamed from: g */
    public int[] mo33004g() {
        int i = 0;
        while (true) {
            int[] iArr = this.f23664O;
            if (i >= iArr.length || iArr[i] != 0) {
                int[] iArr2 = this.f23664O;
            } else {
                i++;
            }
        }
        int[] iArr22 = this.f23664O;
        if (i == iArr22.length) {
            return null;
        }
        int i2 = this.f23663N;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr22[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: h */
    public int mo33005h() {
        return this.f23665a;
    }

    public int hashCode() {
        int i = this.f23665a;
        return (((((((i * 31) + i) * 31) + this.f23666b) * 31) + this.f23663N) * 31) + Arrays.hashCode(this.f23664O);
    }

    /* renamed from: i */
    public void mo33007i() {
        int h = mo33005h();
        int e = mo33001e();
        C9043a aVar = new C9043a(h);
        C9043a aVar2 = new C9043a(h);
        for (int i = 0; i < (e + 1) / 2; i++) {
            aVar = mo32987a(i, aVar);
            int i2 = (e - 1) - i;
            aVar2 = mo32987a(i2, aVar2);
            aVar.mo32984f();
            aVar2.mo32984f();
            mo32994b(i, aVar2);
            mo32994b(i2, aVar);
        }
    }

    public String toString() {
        return mo32988a("X ", "  ");
    }

    public C9044b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f23665a = i;
        this.f23666b = i2;
        this.f23663N = (i + 31) / 32;
        this.f23664O = new int[(this.f23663N * i2)];
    }

    public C9044b clone() {
        return new C9044b(this.f23665a, this.f23666b, this.f23663N, (int[]) this.f23664O.clone());
    }

    /* renamed from: a */
    public void mo32992a(C9044b bVar) {
        if (this.f23665a == bVar.mo33005h() && this.f23666b == bVar.mo33001e() && this.f23663N == bVar.mo33003f()) {
            C9043a aVar = new C9043a((this.f23665a / 32) + 1);
            for (int i = 0; i < this.f23666b; i++) {
                int i2 = this.f23663N * i;
                int[] c = bVar.mo32987a(i, aVar).mo32977c();
                for (int i3 = 0; i3 < this.f23663N; i3++) {
                    int[] iArr = this.f23664O;
                    int i4 = i2 + i3;
                    iArr[i4] = iArr[i4] ^ c[i3];
                }
            }
            return;
        }
        throw new IllegalArgumentException("input matrix dimensions do not match");
    }

    /* renamed from: b */
    public void mo32993b() {
        int length = this.f23664O.length;
        for (int i = 0; i < length; i++) {
            this.f23664O[i] = 0;
        }
    }

    /* renamed from: d */
    public int[] mo33000d() {
        int i = this.f23665a;
        int i2 = -1;
        int i3 = this.f23666b;
        int i4 = -1;
        int i5 = i;
        int i6 = 0;
        while (i6 < this.f23666b) {
            int i7 = i4;
            int i8 = i2;
            int i9 = i5;
            int i10 = 0;
            while (true) {
                int i11 = this.f23663N;
                if (i10 >= i11) {
                    break;
                }
                int i12 = this.f23664O[(i11 * i6) + i10];
                if (i12 != 0) {
                    if (i6 < i3) {
                        i3 = i6;
                    }
                    if (i6 > i7) {
                        i7 = i6;
                    }
                    int i13 = i10 << 5;
                    int i14 = 31;
                    if (i13 < i9) {
                        int i15 = 0;
                        while ((i12 << (31 - i15)) == 0) {
                            i15++;
                        }
                        int i16 = i15 + i13;
                        if (i16 < i9) {
                            i9 = i16;
                        }
                    }
                    if (i13 + 31 > i8) {
                        while ((i12 >>> i14) == 0) {
                            i14--;
                        }
                        int i17 = i13 + i14;
                        if (i17 > i8) {
                            i8 = i17;
                        }
                    }
                }
                i10++;
            }
            i6++;
            i5 = i9;
            i2 = i8;
            i4 = i7;
        }
        if (i2 < i5 || i4 < i3) {
            return null;
        }
        return new int[]{i5, i3, (i2 - i5) + 1, (i4 - i3) + 1};
    }

    /* renamed from: b */
    public void mo32994b(int i, C9043a aVar) {
        int[] c = aVar.mo32977c();
        int[] iArr = this.f23664O;
        int i2 = this.f23663N;
        System.arraycopy(c, 0, iArr, i * i2, i2);
    }

    /* renamed from: b */
    private String m42298b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f23666b * (this.f23665a + 1));
        for (int i = 0; i < this.f23666b; i++) {
            for (int i2 = 0; i2 < this.f23665a; i2++) {
                sb.append(mo32995b(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    private C9044b(int i, int i2, int i3, int[] iArr) {
        this.f23665a = i;
        this.f23666b = i2;
        this.f23663N = i3;
        this.f23664O = iArr;
    }

    /* renamed from: a */
    public void mo32991a(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f23666b || i5 > this.f23665a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f23663N * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f23664O;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    /* renamed from: a */
    public C9043a mo32987a(int i, C9043a aVar) {
        if (aVar == null || aVar.mo32979d() < this.f23665a) {
            aVar = new C9043a(this.f23665a);
        } else {
            aVar.mo32971b();
        }
        int i2 = i * this.f23663N;
        for (int i3 = 0; i3 < this.f23663N; i3++) {
            aVar.mo32972b(i3 << 5, this.f23664O[i2 + i3]);
        }
        return aVar;
    }

    /* renamed from: c */
    public void mo32996c(int i, int i2) {
        int i3 = (i2 * this.f23663N) + (i / 32);
        int[] iArr = this.f23664O;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: c */
    public int[] mo32997c() {
        int length = this.f23664O.length - 1;
        while (length >= 0 && this.f23664O[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f23663N;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f23664O[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    /* renamed from: a */
    public String mo32988a(String str, String str2) {
        return m42298b(str, str2, "\n");
    }

    @Deprecated
    /* renamed from: a */
    public String mo32989a(String str, String str2, String str3) {
        return m42298b(str, str2, str3);
    }
}
