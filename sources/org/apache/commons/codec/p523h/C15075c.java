package org.apache.commons.codec.p523h;

import com.google.common.base.C5785c;
import org.apache.commons.codec.C15066a;
import org.apache.commons.codec.C15067b;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* renamed from: org.apache.commons.codec.h.c */
/* compiled from: Hex */
public class C15075c implements C15067b, C15066a {

    /* renamed from: a */
    private static final char[] f43824a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static byte[] m66771a(char[] cArr) throws DecoderException {
        int length = cArr.length;
        if ((length & 1) == 0) {
            byte[] bArr = new byte[(length >> 1)];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                i = i3 + 1;
                bArr[i2] = (byte) (((m66770a(cArr[i], i) << 4) | m66770a(cArr[i3], i3)) & 255);
                i2++;
            }
            return bArr;
        }
        throw new DecoderException("Odd number of characters.");
    }

    /* renamed from: c */
    public static char[] m66772c(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            char[] cArr2 = f43824a;
            cArr[i] = cArr2[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[bArr[i2] & C5785c.f16698q];
        }
        return cArr;
    }

    /* renamed from: b */
    public Object mo46722b(Object obj) throws DecoderException {
        try {
            return m66771a(obj instanceof String ? ((String) obj).toCharArray() : (char[]) obj);
        } catch (ClassCastException e) {
            throw new DecoderException(e.getMessage());
        }
    }

    /* renamed from: b */
    public byte[] mo46721b(byte[] bArr) {
        return new String(m66772c(bArr)).getBytes();
    }

    /* renamed from: a */
    protected static int m66770a(char c, int i) throws DecoderException {
        int digit = Character.digit(c, 16);
        if (digit != -1) {
            return digit;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Illegal hexadecimal charcter ");
        stringBuffer.append(c);
        stringBuffer.append(" at index ");
        stringBuffer.append(i);
        throw new DecoderException(stringBuffer.toString());
    }

    /* renamed from: a */
    public byte[] mo46720a(byte[] bArr) throws DecoderException {
        return m66771a(new String(bArr).toCharArray());
    }

    /* renamed from: a */
    public Object mo46723a(Object obj) throws EncoderException {
        try {
            return m66772c(obj instanceof String ? ((String) obj).getBytes() : (byte[]) obj);
        } catch (ClassCastException e) {
            throw new EncoderException(e.getMessage());
        }
    }
}
