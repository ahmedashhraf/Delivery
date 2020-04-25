package com.fasterxml.jackson.core;

import java.io.Serializable;
import java.util.Arrays;
import kotlin.p217i1.C14662d0;

/* renamed from: com.fasterxml.jackson.core.a */
/* compiled from: Base64Variant */
public final class C3785a implements Serializable {

    /* renamed from: S */
    static final char f11804S = '\u0000';

    /* renamed from: T */
    public static final int f11805T = -1;

    /* renamed from: U */
    public static final int f11806U = -2;
    private static final long serialVersionUID = 1;

    /* renamed from: N */
    private final transient byte[] f11807N;

    /* renamed from: O */
    protected final String f11808O;

    /* renamed from: P */
    protected final transient boolean f11809P;

    /* renamed from: Q */
    protected final transient char f11810Q;

    /* renamed from: R */
    protected final transient int f11811R;

    /* renamed from: a */
    private final transient int[] f11812a;

    /* renamed from: b */
    private final transient char[] f11813b;

    public C3785a(String str, String str2, boolean z, char c, int i) {
        this.f11812a = new int[128];
        this.f11813b = new char[64];
        this.f11807N = new byte[64];
        this.f11808O = str;
        this.f11809P = z;
        this.f11810Q = c;
        this.f11811R = i;
        int length = str2.length();
        if (length == 64) {
            str2.getChars(0, length, this.f11813b, 0);
            Arrays.fill(this.f11812a, -1);
            for (int i2 = 0; i2 < length; i2++) {
                char c2 = this.f11813b[i2];
                this.f11807N[i2] = (byte) c2;
                this.f11812a[c2] = i2;
            }
            if (z) {
                this.f11812a[c] = -2;
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Base64Alphabet length must be exactly 64 (was ");
        sb.append(length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public int mo16486a() {
        return this.f11811R;
    }

    /* renamed from: b */
    public boolean mo16499b(char c) {
        return c == this.f11810Q;
    }

    /* renamed from: c */
    public char mo16500c(int i) {
        return this.f11813b[i];
    }

    /* renamed from: d */
    public boolean mo16502d(int i) {
        return i == this.f11810Q;
    }

    /* renamed from: e */
    public char mo16503e() {
        return this.f11810Q;
    }

    /* renamed from: f */
    public boolean mo16504f() {
        return this.f11809P;
    }

    public String getName() {
        return this.f11808O;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return C3786b.m15846a(this.f11808O);
    }

    public String toString() {
        return this.f11808O;
    }

    /* renamed from: a */
    public int mo16488a(char c) {
        if (c <= 127) {
            return this.f11812a[c];
        }
        return -1;
    }

    /* renamed from: b */
    public byte mo16498b(int i) {
        return this.f11807N[i];
    }

    /* renamed from: d */
    public byte mo16501d() {
        return (byte) this.f11810Q;
    }

    /* renamed from: a */
    public int mo16489a(int i) {
        if (i <= 127) {
            return this.f11812a[i];
        }
        return -1;
    }

    /* renamed from: a */
    public int mo16487a(byte b) {
        if (b <= Byte.MAX_VALUE) {
            return this.f11812a[b];
        }
        return -1;
    }

    /* renamed from: a */
    public int mo16493a(int i, char[] cArr, int i2) {
        int i3 = i2 + 1;
        char[] cArr2 = this.f11813b;
        cArr[i2] = cArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        cArr[i3] = cArr2[(i >> 12) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i >> 6) & 63];
        int i6 = i5 + 1;
        cArr[i5] = cArr2[i & 63];
        return i6;
    }

    /* renamed from: a */
    public void mo16496a(StringBuilder sb, int i) {
        sb.append(this.f11813b[(i >> 18) & 63]);
        sb.append(this.f11813b[(i >> 12) & 63]);
        sb.append(this.f11813b[(i >> 6) & 63]);
        sb.append(this.f11813b[i & 63]);
    }

    /* renamed from: a */
    public int mo16491a(int i, int i2, char[] cArr, int i3) {
        int i4 = i3 + 1;
        char[] cArr2 = this.f11813b;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i >> 12) & 63];
        if (this.f11809P) {
            int i6 = i5 + 1;
            cArr[i5] = i2 == 2 ? cArr2[(i >> 6) & 63] : this.f11810Q;
            int i7 = i6 + 1;
            cArr[i6] = this.f11810Q;
            return i7;
        } else if (i2 != 2) {
            return i5;
        } else {
            int i8 = i5 + 1;
            cArr[i5] = cArr2[(i >> 6) & 63];
            return i8;
        }
    }

    public C3785a(C3785a aVar, String str, int i) {
        this(aVar, str, aVar.f11809P, aVar.f11810Q, i);
    }

    public C3785a(C3785a aVar, String str, boolean z, char c, int i) {
        this.f11812a = new int[128];
        this.f11813b = new char[64];
        this.f11807N = new byte[64];
        this.f11808O = str;
        byte[] bArr = aVar.f11807N;
        System.arraycopy(bArr, 0, this.f11807N, 0, bArr.length);
        char[] cArr = aVar.f11813b;
        System.arraycopy(cArr, 0, this.f11813b, 0, cArr.length);
        int[] iArr = aVar.f11812a;
        System.arraycopy(iArr, 0, this.f11812a, 0, iArr.length);
        this.f11809P = z;
        this.f11810Q = c;
        this.f11811R = i;
    }

    /* renamed from: a */
    public void mo16497a(StringBuilder sb, int i, int i2) {
        sb.append(this.f11813b[(i >> 18) & 63]);
        sb.append(this.f11813b[(i >> 12) & 63]);
        if (this.f11809P) {
            sb.append(i2 == 2 ? this.f11813b[(i >> 6) & 63] : this.f11810Q);
            sb.append(this.f11810Q);
        } else if (i2 == 2) {
            sb.append(this.f11813b[(i >> 6) & 63]);
        }
    }

    /* renamed from: a */
    public int mo16492a(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        byte[] bArr2 = this.f11807N;
        bArr[i2] = bArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        bArr[i3] = bArr2[(i >> 12) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i >> 6) & 63];
        int i6 = i5 + 1;
        bArr[i5] = bArr2[i & 63];
        return i6;
    }

    /* renamed from: a */
    public int mo16490a(int i, int i2, byte[] bArr, int i3) {
        int i4 = i3 + 1;
        byte[] bArr2 = this.f11807N;
        bArr[i3] = bArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i >> 12) & 63];
        if (this.f11809P) {
            byte b = (byte) this.f11810Q;
            int i6 = i5 + 1;
            bArr[i5] = i2 == 2 ? bArr2[(i >> 6) & 63] : b;
            int i7 = i6 + 1;
            bArr[i6] = b;
            return i7;
        } else if (i2 != 2) {
            return i5;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = bArr2[(i >> 6) & 63];
            return i8;
        }
    }

    /* renamed from: a */
    public String mo16494a(byte[] bArr) {
        return mo16495a(bArr, false);
    }

    /* renamed from: a */
    public String mo16495a(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append(C14662d0.f42850a);
        }
        int a = mo16486a() >> 2;
        int i = 0;
        int i2 = length - 3;
        while (i <= i2) {
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            mo16496a(sb, (int) (((bArr[i] << 8) | (bArr[i3] & 255)) << 8) | (bArr[i4] & 255));
            a--;
            if (a <= 0) {
                sb.append('\\');
                sb.append('n');
                a = mo16486a() >> 2;
            }
            i = i5;
        }
        int i6 = length - i;
        if (i6 > 0) {
            int i7 = i + 1;
            int i8 = bArr[i] << 16;
            if (i6 == 2) {
                i8 |= (bArr[i7] & 255) << 8;
            }
            mo16497a(sb, i8, i6);
        }
        if (z) {
            sb.append(C14662d0.f42850a);
        }
        return sb.toString();
    }
}
