package org.apache.commons.codec.p526k;

import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.C15070e;
import org.apache.commons.codec.C15071f;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: org.apache.commons.codec.k.b */
/* compiled from: QCodec */
public class C15084b extends C15086d implements C15071f, C15070e {

    /* renamed from: c */
    private static final BitSet f43848c = new BitSet(256);

    /* renamed from: d */
    private static byte f43849d = 32;

    /* renamed from: e */
    private static byte f43850e = 95;

    /* renamed from: a */
    private String f43851a = "UTF-8";

    /* renamed from: b */
    private boolean f43852b = false;

    static {
        f43848c.set(32);
        f43848c.set(33);
        f43848c.set(34);
        f43848c.set(35);
        f43848c.set(36);
        f43848c.set(37);
        f43848c.set(38);
        f43848c.set(39);
        f43848c.set(40);
        f43848c.set(41);
        f43848c.set(42);
        f43848c.set(43);
        f43848c.set(44);
        f43848c.set(45);
        f43848c.set(46);
        f43848c.set(47);
        for (int i = 48; i <= 57; i++) {
            f43848c.set(i);
        }
        f43848c.set(58);
        f43848c.set(59);
        f43848c.set(60);
        f43848c.set(62);
        f43848c.set(64);
        for (int i2 = 65; i2 <= 90; i2++) {
            f43848c.set(i2);
        }
        f43848c.set(91);
        f43848c.set(92);
        f43848c.set(93);
        f43848c.set(94);
        f43848c.set(96);
        for (int i3 = 97; i3 <= 122; i3++) {
            f43848c.set(i3);
        }
        f43848c.set(123);
        f43848c.set(124);
        f43848c.set(C13959t.f40819N1);
        f43848c.set(C13959t.f40823O1);
    }

    public C15084b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo46757a() {
        return "Q";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] mo46758a(byte[] bArr) throws DecoderException {
        boolean z;
        if (bArr == null) {
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= bArr.length) {
                z = false;
                break;
            } else if (bArr[i] == f43850e) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            return C15085c.m66885c(bArr);
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b = bArr[i2];
            if (b != f43850e) {
                bArr2[i2] = b;
            } else {
                bArr2[i2] = f43849d;
            }
        }
        return C15085c.m66885c(bArr2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public byte[] mo46761b(byte[] bArr) throws EncoderException {
        if (bArr == null) {
            return null;
        }
        byte[] a = C15085c.m66884a(f43848c, bArr);
        if (this.f43852b) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == f43849d) {
                    a[i] = f43850e;
                }
            }
        }
        return a;
    }

    /* renamed from: c */
    public boolean mo46765c() {
        return this.f43852b;
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
        return mo46764b(str, mo46763b());
    }

    public C15084b(String str) {
        this.f43851a = str;
    }

    /* renamed from: b */
    public String mo46764b(String str, String str2) throws EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return mo46770a(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new EncoderException(e.getMessage());
        }
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
        stringBuffer.append(" cannot be decoded using Q codec");
        throw new DecoderException(stringBuffer.toString());
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
        stringBuffer.append(" cannot be encoded using Q codec");
        throw new EncoderException(stringBuffer.toString());
    }

    /* renamed from: b */
    public String mo46763b() {
        return this.f43851a;
    }

    /* renamed from: a */
    public void mo46762a(boolean z) {
        this.f43852b = z;
    }
}
