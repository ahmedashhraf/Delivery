package org.apache.commons.codec.p525j;

import org.apache.commons.codec.C15071f;
import org.apache.commons.codec.EncoderException;

/* renamed from: org.apache.commons.codec.j.c */
/* compiled from: RefinedSoundex */
public class C15080c implements C15071f {

    /* renamed from: b */
    public static final C15080c f43839b = new C15080c();

    /* renamed from: c */
    public static final char[] f43840c = "01360240043788015936020505".toCharArray();

    /* renamed from: a */
    private char[] f43841a;

    public C15080c() {
        this(f43840c);
    }

    /* renamed from: a */
    public int mo46751a(String str, String str2) throws EncoderException {
        return C15082e.m66865a(this, str, str2);
    }

    public String encode(String str) {
        return mo46752a(str);
    }

    public C15080c(char[] cArr) {
        this.f43841a = cArr;
    }

    /* renamed from: a */
    public Object mo46723a(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return mo46752a((String) obj);
        }
        throw new EncoderException("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public char mo46750a(char c) {
        if (!Character.isLetter(c)) {
            return 0;
        }
        return this.f43841a[Character.toUpperCase(c) - 'A'];
    }

    /* renamed from: a */
    public String mo46752a(String str) {
        if (str == null) {
            return null;
        }
        String a = C15082e.m66866a(str);
        if (a.length() == 0) {
            return a;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(a.charAt(0));
        char c = '*';
        for (int i = 0; i < a.length(); i++) {
            char a2 = mo46750a(a.charAt(i));
            if (a2 != c) {
                if (a2 != 0) {
                    stringBuffer.append(a2);
                }
                c = a2;
            }
        }
        return stringBuffer.toString();
    }
}
