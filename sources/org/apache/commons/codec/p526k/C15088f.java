package org.apache.commons.codec.p526k;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.C15066a;
import org.apache.commons.codec.C15067b;
import org.apache.commons.codec.C15070e;
import org.apache.commons.codec.C15071f;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* renamed from: org.apache.commons.codec.k.f */
/* compiled from: URLCodec */
public class C15088f implements C15067b, C15066a, C15071f, C15070e {

    /* renamed from: b */
    protected static byte f43860b = 37;

    /* renamed from: c */
    protected static final BitSet f43861c = new BitSet(256);

    /* renamed from: a */
    protected String f43862a = "UTF-8";

    static {
        for (int i = 97; i <= 122; i++) {
            f43861c.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f43861c.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            f43861c.set(i3);
        }
        f43861c.set(45);
        f43861c.set(95);
        f43861c.set(46);
        f43861c.set(42);
        f43861c.set(32);
    }

    public C15088f() {
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [int] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v1, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m66898a(java.util.BitSet r5, byte[] r6) {
        /*
            if (r6 != 0) goto L_0x0004
            r5 = 0
            return r5
        L_0x0004:
            if (r5 != 0) goto L_0x0008
            java.util.BitSet r5 = f43861c
        L_0x0008:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
        L_0x000e:
            int r2 = r6.length
            if (r1 >= r2) goto L_0x004d
            byte r2 = r6[r1]
            if (r2 >= 0) goto L_0x0017
            int r2 = r2 + 256
        L_0x0017:
            boolean r3 = r5.get(r2)
            if (r3 == 0) goto L_0x0027
            r3 = 32
            if (r2 != r3) goto L_0x0023
            r2 = 43
        L_0x0023:
            r0.write(r2)
            goto L_0x004a
        L_0x0027:
            r3 = 37
            r0.write(r3)
            int r3 = r2 >> 4
            r3 = r3 & 15
            r4 = 16
            char r3 = java.lang.Character.forDigit(r3, r4)
            char r3 = java.lang.Character.toUpperCase(r3)
            r2 = r2 & 15
            char r2 = java.lang.Character.forDigit(r2, r4)
            char r2 = java.lang.Character.toUpperCase(r2)
            r0.write(r3)
            r0.write(r2)
        L_0x004a:
            int r1 = r1 + 1
            goto L_0x000e
        L_0x004d:
            byte[] r5 = r0.toByteArray()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.p526k.C15088f.m66898a(java.util.BitSet, byte[]):byte[]");
    }

    /* renamed from: c */
    public static final byte[] m66899c(byte[] bArr) throws DecoderException {
        String str = "Invalid URL encoding";
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 43) {
                byteArrayOutputStream.write(32);
            } else if (b == 37) {
                int i2 = i + 1;
                try {
                    int digit = Character.digit((char) bArr[i2], 16);
                    i = i2 + 1;
                    int digit2 = Character.digit((char) bArr[i], 16);
                    if (digit == -1 || digit2 == -1) {
                        throw new DecoderException(str);
                    }
                    byteArrayOutputStream.write((char) ((digit << 4) + digit2));
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new DecoderException(str);
                }
            } else {
                byteArrayOutputStream.write(b);
            }
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    public byte[] mo46721b(byte[] bArr) {
        return m66898a(f43861c, bArr);
    }

    public String decode(String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return mo46772a(str, mo46771a());
        } catch (UnsupportedEncodingException e) {
            throw new DecoderException(e.getMessage());
        }
    }

    public String encode(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return mo46774b(str, mo46771a());
        } catch (UnsupportedEncodingException e) {
            throw new EncoderException(e.getMessage());
        }
    }

    /* renamed from: b */
    public String mo46774b(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new String(mo46721b(str.getBytes(str2)), "US-ASCII");
    }

    public C15088f(String str) {
        this.f43862a = str;
    }

    /* renamed from: b */
    public Object mo46722b(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return mo46720a((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Objects of type ");
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append(" cannot be URL decoded");
        throw new DecoderException(stringBuffer.toString());
    }

    /* renamed from: b */
    public String mo46773b() {
        return this.f43862a;
    }

    /* renamed from: a */
    public byte[] mo46720a(byte[] bArr) throws DecoderException {
        return m66899c(bArr);
    }

    /* renamed from: a */
    public String mo46772a(String str, String str2) throws DecoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new String(mo46720a(str.getBytes("US-ASCII")), str2);
    }

    /* renamed from: a */
    public Object mo46723a(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return mo46721b((byte[]) obj);
        }
        if (obj instanceof String) {
            return encode((String) obj);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Objects of type ");
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append(" cannot be URL encoded");
        throw new EncoderException(stringBuffer.toString());
    }

    /* renamed from: a */
    public String mo46771a() {
        return this.f43862a;
    }
}
