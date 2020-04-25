package org.apache.commons.codec.p523h;

import com.google.common.base.C5785c;
import org.apache.commons.codec.C15066a;
import org.apache.commons.codec.C15067b;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* renamed from: org.apache.commons.codec.h.a */
/* compiled from: Base64 */
public class C15073a implements C15067b, C15066a {

    /* renamed from: a */
    static final int f43801a = 76;

    /* renamed from: b */
    static final byte[] f43802b = "\r\n".getBytes();

    /* renamed from: c */
    static final int f43803c = 255;

    /* renamed from: d */
    static final int f43804d = 64;

    /* renamed from: e */
    static final int f43805e = 8;

    /* renamed from: f */
    static final int f43806f = 16;

    /* renamed from: g */
    static final int f43807g = 24;

    /* renamed from: h */
    static final int f43808h = 4;

    /* renamed from: i */
    static final int f43809i = -128;

    /* renamed from: j */
    static final byte f43810j = 61;

    /* renamed from: k */
    private static byte[] f43811k = new byte[255];

    /* renamed from: l */
    private static byte[] f43812l = new byte[64];

    static {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < 255; i4++) {
            f43811k[i4] = -1;
        }
        for (int i5 = 90; i5 >= 65; i5--) {
            f43811k[i5] = (byte) (i5 - 65);
        }
        int i6 = 122;
        while (true) {
            i = 26;
            if (i6 < 97) {
                break;
            }
            f43811k[i6] = (byte) ((i6 - 97) + 26);
            i6--;
        }
        int i7 = 57;
        while (true) {
            i2 = 52;
            if (i7 < 48) {
                break;
            }
            f43811k[i7] = (byte) ((i7 - 48) + 52);
            i7--;
        }
        byte[] bArr = f43811k;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i8 = 0; i8 <= 25; i8++) {
            f43812l[i8] = (byte) (i8 + 65);
        }
        int i9 = 0;
        while (i <= 51) {
            f43812l[i] = (byte) (i9 + 97);
            i++;
            i9++;
        }
        while (i2 <= 61) {
            f43812l[i2] = (byte) (i3 + 48);
            i2++;
            i3++;
        }
        byte[] bArr2 = f43812l;
        bArr2[62] = 43;
        bArr2[63] = 47;
    }

    /* renamed from: a */
    private static boolean m66748a(byte b) {
        return b == 61 || f43811k[b] != -1;
    }

    /* renamed from: c */
    public static byte[] m66750c(byte[] bArr) {
        byte[] d = m66751d(bArr);
        if (d.length == 0) {
            return new byte[0];
        }
        int length = d.length / 4;
        int length2 = d.length;
        while (d[length2 - 1] == 61) {
            length2--;
            if (length2 == 0) {
                return new byte[0];
            }
        }
        byte[] bArr2 = new byte[(length2 - length)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 4;
            byte b = d[i3 + 2];
            byte b2 = d[i3 + 3];
            byte[] bArr3 = f43811k;
            byte b3 = bArr3[d[i3]];
            byte b4 = bArr3[d[i3 + 1]];
            if (b != 61 && b2 != 61) {
                byte b5 = bArr3[b];
                byte b6 = bArr3[b2];
                bArr2[i] = (byte) ((b3 << 2) | (b4 >> 4));
                bArr2[i + 1] = (byte) (((b4 & C5785c.f16698q) << 4) | ((b5 >> 2) & 15));
                bArr2[i + 2] = (byte) ((b5 << 6) | b6);
            } else if (b == 61) {
                bArr2[i] = (byte) ((b4 >> 4) | (b3 << 2));
            } else if (b2 == 61) {
                byte b7 = f43811k[b];
                bArr2[i] = (byte) ((b3 << 2) | (b4 >> 4));
                bArr2[i + 1] = (byte) (((b4 & C5785c.f16698q) << 4) | ((b7 >> 2) & 15));
            }
            i += 3;
        }
        return bArr2;
    }

    /* renamed from: d */
    static byte[] m66751d(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (m66748a(bArr[i2])) {
                int i3 = i + 1;
                bArr2[i] = bArr[i2];
                i = i3;
            }
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr2, 0, bArr3, 0, i);
        return bArr3;
    }

    /* renamed from: e */
    static byte[] m66752e(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b = bArr[i2];
            if (!(b == 9 || b == 10 || b == 13 || b == 32)) {
                int i3 = i + 1;
                bArr2[i] = bArr[i2];
                i = i3;
            }
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr2, 0, bArr3, 0, i);
        return bArr3;
    }

    /* renamed from: f */
    public static byte[] m66753f(byte[] bArr) {
        return m66749a(bArr, false);
    }

    /* renamed from: g */
    public static byte[] m66754g(byte[] bArr) {
        return m66749a(bArr, true);
    }

    /* renamed from: h */
    public static boolean m66755h(byte[] bArr) {
        if (r0 == 0) {
            return true;
        }
        for (byte a : m66752e(bArr)) {
            if (!m66748a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public Object mo46722b(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return mo46720a((byte[]) obj);
        }
        throw new DecoderException("Parameter supplied to Base64 decode is not a byte[]");
    }

    /* renamed from: a */
    public byte[] mo46720a(byte[] bArr) {
        return m66750c(bArr);
    }

    /* renamed from: a */
    public static byte[] m66749a(byte[] bArr, boolean z) {
        int i;
        byte[] bArr2 = bArr;
        int length = bArr2.length * 8;
        int i2 = length % 24;
        int i3 = length / 24;
        int i4 = i2 != 0 ? (i3 + 1) * 4 : i3 * 4;
        if (z) {
            i = f43802b.length == 0 ? 0 : (int) Math.ceil((double) (((float) i4) / 76.0f));
            i4 += f43802b.length * i;
        } else {
            i = 0;
        }
        byte[] bArr3 = new byte[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 76;
        while (i5 < i3) {
            int i9 = i5 * 3;
            byte b = bArr2[i9];
            byte b2 = bArr2[i9 + 1];
            byte b3 = bArr2[i9 + 2];
            byte b4 = (byte) (b2 & C5785c.f16698q);
            byte b5 = (byte) (b & 3);
            byte b6 = b & Byte.MIN_VALUE;
            int i10 = b >> 2;
            if (b6 != 0) {
                i10 ^= 192;
            }
            byte b7 = (byte) i10;
            byte b8 = b2 & Byte.MIN_VALUE;
            int i11 = b2 >> 4;
            if (b8 != 0) {
                i11 ^= 240;
            }
            byte b9 = (byte) i11;
            int i12 = b3 >> 6;
            if ((b3 & Byte.MIN_VALUE) != 0) {
                i12 ^= 252;
            }
            byte b10 = (byte) i12;
            byte[] bArr4 = f43812l;
            bArr3[i6] = bArr4[b7];
            bArr3[i6 + 1] = bArr4[(b5 << 4) | b9];
            bArr3[i6 + 2] = bArr4[(b4 << 2) | b10];
            bArr3[i6 + 3] = bArr4[b3 & 63];
            i6 += 4;
            if (z && i6 == i8) {
                byte[] bArr5 = f43802b;
                System.arraycopy(bArr5, 0, bArr3, i6, bArr5.length);
                i7++;
                int i13 = (i7 + 1) * 76;
                byte[] bArr6 = f43802b;
                i6 += bArr6.length;
                i8 = i13 + (bArr6.length * i7);
            }
            i5++;
        }
        int i14 = i5 * 3;
        if (i2 == 8) {
            byte b11 = bArr2[i14];
            byte b12 = (byte) (b11 & 3);
            byte b13 = b11 & Byte.MIN_VALUE;
            int i15 = b11 >> 2;
            if (b13 != 0) {
                i15 ^= 192;
            }
            byte b14 = (byte) i15;
            byte[] bArr7 = f43812l;
            bArr3[i6] = bArr7[b14];
            bArr3[i6 + 1] = bArr7[b12 << 4];
            bArr3[i6 + 2] = f43810j;
            bArr3[i6 + 3] = f43810j;
        } else if (i2 == 16) {
            byte b15 = bArr2[i14];
            byte b16 = bArr2[i14 + 1];
            byte b17 = (byte) (b16 & C5785c.f16698q);
            byte b18 = (byte) (b15 & 3);
            byte b19 = b15 & Byte.MIN_VALUE;
            int i16 = b15 >> 2;
            if (b19 != 0) {
                i16 ^= 192;
            }
            byte b20 = (byte) i16;
            byte b21 = b16 & Byte.MIN_VALUE;
            int i17 = b16 >> 4;
            if (b21 != 0) {
                i17 ^= 240;
            }
            byte b22 = (byte) i17;
            byte[] bArr8 = f43812l;
            bArr3[i6] = bArr8[b20];
            bArr3[i6 + 1] = bArr8[b22 | (b18 << 4)];
            bArr3[i6 + 2] = bArr8[b17 << 2];
            bArr3[i6 + 3] = f43810j;
        }
        if (z && i7 < i) {
            byte[] bArr9 = f43802b;
            System.arraycopy(bArr9, 0, bArr3, i4 - bArr9.length, bArr9.length);
        }
        return bArr3;
    }

    /* renamed from: b */
    public byte[] mo46721b(byte[] bArr) {
        return m66749a(bArr, false);
    }

    /* renamed from: a */
    public Object mo46723a(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return mo46721b((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base64 encode is not a byte[]");
    }
}
