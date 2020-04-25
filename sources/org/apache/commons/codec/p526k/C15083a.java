package org.apache.commons.codec.p526k;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.C15070e;
import org.apache.commons.codec.C15071f;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.p523h.C15073a;

/* renamed from: org.apache.commons.codec.k.a */
/* compiled from: BCodec */
public class C15083a extends C15086d implements C15071f, C15070e {

    /* renamed from: a */
    private String f43847a = "UTF-8";

    public C15083a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo46757a() {
        return "B";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] mo46758a(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        return C15073a.m66750c(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public byte[] mo46761b(byte[] bArr) throws EncoderException {
        if (bArr == null) {
            return null;
        }
        return C15073a.m66753f(bArr);
    }

    public String decode(String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return mo46769a(str);
        } catch (UnsupportedEncodingException e) {
            throw new DecoderException(e.getMessage());
        }
    }

    public String encode(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        return mo46760b(str, mo46759b());
    }

    /* renamed from: a */
    public Object mo46723a(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return encode((String) obj);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Objects of type ");
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append(" cannot be encoded using BCodec");
        throw new EncoderException(stringBuffer.toString());
    }

    /* renamed from: b */
    public String mo46760b(String str, String str2) throws EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return mo46770a(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new EncoderException(e.getMessage());
        }
    }

    public C15083a(String str) {
        this.f43847a = str;
    }

    /* renamed from: b */
    public Object mo46722b(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Objects of type ");
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append(" cannot be decoded using BCodec");
        throw new DecoderException(stringBuffer.toString());
    }

    /* renamed from: b */
    public String mo46759b() {
        return this.f43847a;
    }
}
