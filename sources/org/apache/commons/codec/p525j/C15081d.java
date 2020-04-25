package org.apache.commons.codec.p525j;

import org.apache.commons.codec.C15071f;
import org.apache.commons.codec.EncoderException;

/* renamed from: org.apache.commons.codec.j.d */
/* compiled from: Soundex */
public class C15081d implements C15071f {

    /* renamed from: c */
    public static final C15081d f43842c = new C15081d();

    /* renamed from: d */
    public static final String f43843d = "01230120022455012623010202";

    /* renamed from: e */
    public static final char[] f43844e = f43843d.toCharArray();

    /* renamed from: a */
    private int f43845a;

    /* renamed from: b */
    private char[] f43846b;

    public C15081d() {
        this(f43844e);
    }

    /* renamed from: b */
    private char[] m66858b() {
        return this.f43846b;
    }

    /* renamed from: a */
    public int mo46754a(String str, String str2) throws EncoderException {
        return C15082e.m66865a(this, str, str2);
    }

    public String encode(String str) {
        return mo46755a(str);
    }

    public C15081d(char[] cArr) {
        this.f43845a = 4;
        m66857a(cArr);
    }

    /* renamed from: a */
    public Object mo46723a(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return mo46755a((String) obj);
        }
        throw new EncoderException("Parameter supplied to Soundex encode is not of type java.lang.String");
    }

    /* renamed from: a */
    private char m66856a(String str, int i) {
        char a = m66855a(str.charAt(i));
        if (i > 1 && a != '0') {
            char charAt = str.charAt(i - 1);
            if ('H' == charAt || 'W' == charAt) {
                char charAt2 = str.charAt(i - 2);
                if (m66855a(charAt2) == a || 'H' == charAt2 || 'W' == charAt2) {
                    return 0;
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public int mo46753a() {
        return this.f43845a;
    }

    /* renamed from: a */
    private char m66855a(char c) {
        int i = c - 'A';
        if (i >= 0 && i < m66858b().length) {
            return m66858b()[i];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("The character is not mapped: ");
        stringBuffer.append(c);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    /* renamed from: a */
    public void mo46756a(int i) {
        this.f43845a = i;
    }

    /* renamed from: a */
    private void m66857a(char[] cArr) {
        this.f43846b = cArr;
    }

    /* renamed from: a */
    public String mo46755a(String str) {
        if (str == null) {
            return null;
        }
        String a = C15082e.m66866a(str);
        if (a.length() == 0) {
            return a;
        }
        char[] cArr = {'0', '0', '0', '0'};
        cArr[0] = a.charAt(0);
        int i = 1;
        char a2 = m66856a(a, 0);
        int i2 = 1;
        while (i < a.length() && i2 < cArr.length) {
            int i3 = i + 1;
            char a3 = m66856a(a, i);
            if (a3 != 0) {
                if (!(a3 == '0' || a3 == a2)) {
                    int i4 = i2 + 1;
                    cArr[i2] = a3;
                    i2 = i4;
                }
                a2 = a3;
            }
            i = i3;
        }
        return new String(cArr);
    }
}
