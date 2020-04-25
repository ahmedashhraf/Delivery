package p076c.p112d.p148d.p275b;

import com.google.common.base.C7397x;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
@C2775a
/* renamed from: c.d.d.b.d */
/* compiled from: CharEscaper */
public abstract class C6514d extends C6517f {

    /* renamed from: b */
    private static final int f18224b = 2;

    protected C6514d() {
    }

    /* renamed from: a */
    public String mo26396a(String str) {
        C7397x.m35664a(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (mo26397a(str.charAt(i)) != null) {
                return mo26403a(str, i);
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract char[] mo26397a(char c);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo26403a(String str, int i) {
        int i2;
        int length = str.length();
        char[] a = C6524h.m31015a();
        char[] cArr = a;
        int length2 = a.length;
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            char[] a2 = mo26397a(str.charAt(i));
            if (a2 != null) {
                int length3 = a2.length;
                int i5 = i - i3;
                int i6 = i4 + i5;
                int i7 = i6 + length3;
                if (length2 < i7) {
                    length2 = ((length - i) * 2) + i7;
                    cArr = m30986a(cArr, i4, length2);
                }
                if (i5 > 0) {
                    str.getChars(i3, i, cArr, i4);
                    i4 = i6;
                }
                if (length3 > 0) {
                    System.arraycopy(a2, 0, cArr, i4, length3);
                    i4 += length3;
                }
                i3 = i + 1;
            }
            i++;
        }
        int i8 = length - i3;
        if (i8 > 0) {
            i2 = i8 + i4;
            if (length2 < i2) {
                cArr = m30986a(cArr, i4, i2);
            }
            str.getChars(i3, length, cArr, i4);
        } else {
            i2 = i4;
        }
        return new String(cArr, 0, i2);
    }

    /* renamed from: a */
    private static char[] m30986a(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }
}
