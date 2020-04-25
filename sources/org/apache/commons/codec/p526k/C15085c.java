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

/* renamed from: org.apache.commons.codec.k.c */
/* compiled from: QuotedPrintableCodec */
public class C15085c implements C15067b, C15066a, C15071f, C15070e {

    /* renamed from: b */
    private static final BitSet f43853b = new BitSet(256);

    /* renamed from: c */
    private static byte f43854c = 61;

    /* renamed from: d */
    private static byte f43855d = 9;

    /* renamed from: e */
    private static byte f43856e = 32;

    /* renamed from: a */
    private String f43857a = "UTF-8";

    static {
        for (int i = 33; i <= 60; i++) {
            f43853b.set(i);
        }
        for (int i2 = 62; i2 <= 126; i2++) {
            f43853b.set(i2);
        }
        f43853b.set(f43855d);
        f43853b.set(f43856e);
    }

    public C15085c() {
    }

    /* renamed from: a */
    private static final void m66883a(int i, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(f43854c);
        char upperCase = Character.toUpperCase(Character.forDigit((i >> 4) & 15, 16));
        char upperCase2 = Character.toUpperCase(Character.forDigit(i & 15, 16));
        byteArrayOutputStream.write(upperCase);
        byteArrayOutputStream.write(upperCase2);
    }

    /* renamed from: c */
    public static final byte[] m66885c(byte[] bArr) throws DecoderException {
        String str = "Invalid quoted-printable encoding";
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == f43854c) {
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
        return m66884a(f43853b, bArr);
    }

    public String decode(String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return mo46767a(str, mo46766a());
        } catch (UnsupportedEncodingException e) {
            throw new DecoderException(e.getMessage());
        }
    }

    public String encode(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return mo46768b(str, mo46766a());
        } catch (UnsupportedEncodingException e) {
            throw new EncoderException(e.getMessage());
        }
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
        stringBuffer.append(" cannot be quoted-printable decoded");
        throw new DecoderException(stringBuffer.toString());
    }

    public C15085c(String str) {
        this.f43857a = str;
    }

    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v1, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m66884a(java.util.BitSet r4, byte[] r5) {
        /*
            if (r5 != 0) goto L_0x0004
            r4 = 0
            return r4
        L_0x0004:
            if (r4 != 0) goto L_0x0008
            java.util.BitSet r4 = f43853b
        L_0x0008:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
        L_0x000e:
            int r2 = r5.length
            if (r1 >= r2) goto L_0x0027
            byte r2 = r5[r1]
            if (r2 >= 0) goto L_0x0017
            int r2 = r2 + 256
        L_0x0017:
            boolean r3 = r4.get(r2)
            if (r3 == 0) goto L_0x0021
            r0.write(r2)
            goto L_0x0024
        L_0x0021:
            m66883a(r2, r0)
        L_0x0024:
            int r1 = r1 + 1
            goto L_0x000e
        L_0x0027:
            byte[] r4 = r0.toByteArray()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.p526k.C15085c.m66884a(java.util.BitSet, byte[]):byte[]");
    }

    /* renamed from: b */
    public String mo46768b(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new String(mo46721b(str.getBytes(str2)), "US-ASCII");
    }

    /* renamed from: a */
    public byte[] mo46720a(byte[] bArr) throws DecoderException {
        return m66885c(bArr);
    }

    /* renamed from: a */
    public String mo46767a(String str, String str2) throws DecoderException, UnsupportedEncodingException {
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
        stringBuffer.append(" cannot be quoted-printable encoded");
        throw new EncoderException(stringBuffer.toString());
    }

    /* renamed from: a */
    public String mo46766a() {
        return this.f43857a;
    }
}
