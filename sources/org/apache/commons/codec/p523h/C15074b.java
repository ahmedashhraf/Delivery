package org.apache.commons.codec.p523h;

import org.apache.commons.codec.C15066a;
import org.apache.commons.codec.C15067b;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* renamed from: org.apache.commons.codec.h.b */
/* compiled from: BinaryCodec */
public class C15074b implements C15066a, C15067b {

    /* renamed from: a */
    private static final char[] f43813a = new char[0];

    /* renamed from: b */
    private static final byte[] f43814b = new byte[0];

    /* renamed from: c */
    private static final int f43815c = 1;

    /* renamed from: d */
    private static final int f43816d = 2;

    /* renamed from: e */
    private static final int f43817e = 4;

    /* renamed from: f */
    private static final int f43818f = 8;

    /* renamed from: g */
    private static final int f43819g = 16;

    /* renamed from: h */
    private static final int f43820h = 32;

    /* renamed from: i */
    private static final int f43821i = 64;

    /* renamed from: j */
    private static final int f43822j = 128;

    /* renamed from: k */
    private static final int[] f43823k = {1, 2, 4, 8, 16, 32, 64, 128};

    /* renamed from: c */
    public static byte[] m66761c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return f43814b;
        }
        byte[] bArr2 = new byte[(bArr.length >> 3)];
        int length = bArr.length - 1;
        int i = 0;
        while (i < bArr2.length) {
            int i2 = 0;
            while (true) {
                int[] iArr = f43823k;
                if (i2 >= iArr.length) {
                    break;
                }
                if (bArr[length - i2] == 49) {
                    bArr2[i] = (byte) (iArr[i2] | bArr2[i]);
                }
                i2++;
            }
            i++;
            length -= 8;
        }
        return bArr2;
    }

    /* renamed from: d */
    public static byte[] m66762d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return f43814b;
        }
        byte[] bArr2 = new byte[(bArr.length << 3)];
        int length = bArr2.length - 1;
        int i = 0;
        while (i < bArr.length) {
            int i2 = 0;
            while (true) {
                int[] iArr = f43823k;
                if (i2 >= iArr.length) {
                    break;
                }
                if ((iArr[i2] & bArr[i]) == 0) {
                    bArr2[length - i2] = 48;
                } else {
                    bArr2[length - i2] = 49;
                }
                i2++;
            }
            i++;
            length -= 8;
        }
        return bArr2;
    }

    /* renamed from: e */
    public static char[] m66763e(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return f43813a;
        }
        char[] cArr = new char[(bArr.length << 3)];
        int length = cArr.length - 1;
        int i = 0;
        while (i < bArr.length) {
            int i2 = 0;
            while (true) {
                int[] iArr = f43823k;
                if (i2 >= iArr.length) {
                    break;
                }
                if ((iArr[i2] & bArr[i]) == 0) {
                    cArr[length - i2] = '0';
                } else {
                    cArr[length - i2] = '1';
                }
                i2++;
            }
            i++;
            length -= 8;
        }
        return cArr;
    }

    /* renamed from: f */
    public static String m66764f(byte[] bArr) {
        return new String(m66763e(bArr));
    }

    /* renamed from: a */
    public Object mo46723a(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return m66763e((byte[]) obj);
        }
        throw new EncoderException("argument not a byte array");
    }

    /* renamed from: b */
    public byte[] mo46721b(byte[] bArr) {
        return m66762d(bArr);
    }

    /* renamed from: b */
    public Object mo46722b(Object obj) throws DecoderException {
        if (obj == null) {
            return f43814b;
        }
        if (obj instanceof byte[]) {
            return m66761c((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return m66760a((char[]) obj);
        }
        if (obj instanceof String) {
            return m66760a(((String) obj).toCharArray());
        }
        throw new DecoderException("argument not a byte array");
    }

    /* renamed from: a */
    public byte[] mo46720a(byte[] bArr) {
        return m66761c(bArr);
    }

    /* renamed from: a */
    public byte[] mo46727a(String str) {
        if (str == null) {
            return f43814b;
        }
        return m66760a(str.toCharArray());
    }

    /* renamed from: a */
    public static byte[] m66760a(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return f43814b;
        }
        byte[] bArr = new byte[(cArr.length >> 3)];
        int length = cArr.length - 1;
        int i = 0;
        while (i < bArr.length) {
            int i2 = 0;
            while (true) {
                int[] iArr = f43823k;
                if (i2 >= iArr.length) {
                    break;
                }
                if (cArr[length - i2] == '1') {
                    bArr[i] = (byte) (iArr[i2] | bArr[i]);
                }
                i2++;
            }
            i++;
            length -= 8;
        }
        return bArr;
    }
}
