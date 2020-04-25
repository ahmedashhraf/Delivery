package org.apache.commons.codec.p526k;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* renamed from: org.apache.commons.codec.k.d */
/* compiled from: RFC1522Codec */
abstract class C15086d {
    C15086d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo46757a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo46770a(String str, String str2) throws EncoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("=?");
        stringBuffer.append(str2);
        stringBuffer.append('?');
        stringBuffer.append(mo46757a());
        stringBuffer.append('?');
        stringBuffer.append(new String(mo46761b(str.getBytes(str2)), "US-ASCII"));
        stringBuffer.append("?=");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract byte[] mo46758a(byte[] bArr) throws DecoderException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract byte[] mo46761b(byte[] bArr) throws EncoderException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo46769a(String str) throws DecoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        if (!str.startsWith("=?") || !str.endsWith("?=")) {
            throw new DecoderException("RFC 1522 violation: malformed encoded content");
        }
        int length = str.length() - 2;
        String str2 = "?";
        int indexOf = str.indexOf(str2, 2);
        if (indexOf == -1 || indexOf == length) {
            throw new DecoderException("RFC 1522 violation: charset token not found");
        }
        String substring = str.substring(2, indexOf);
        if (!substring.equals("")) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(str2, i);
            if (indexOf2 == -1 || indexOf2 == length) {
                throw new DecoderException("RFC 1522 violation: encoding token not found");
            }
            String substring2 = str.substring(i, indexOf2);
            if (mo46757a().equalsIgnoreCase(substring2)) {
                int i2 = indexOf2 + 1;
                return new String(mo46758a(str.substring(i2, str.indexOf(str2, i2)).getBytes("US-ASCII")), substring);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("This codec cannot decode ");
            stringBuffer.append(substring2);
            stringBuffer.append(" encoded content");
            throw new DecoderException(stringBuffer.toString());
        }
        throw new DecoderException("RFC 1522 violation: charset not specified");
    }
}
