package p076c.p112d.p134b.p135a.p143g.p269s0;

/* renamed from: c.d.b.a.g.s0.e */
/* compiled from: UnicodeEscaper */
public abstract class C6422e extends C6418b {

    /* renamed from: a */
    private static final int f17897a = 32;

    /* renamed from: b */
    protected static int m29809b(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            String str = " at index ";
            String str2 = "' with value ";
            if (charAt > 56319) {
                int i4 = i3 - 1;
                StringBuilder sb = new StringBuilder(82);
                sb.append("Unexpected low surrogate character '");
                sb.append(charAt);
                sb.append(str2);
                sb.append(charAt);
                sb.append(str);
                sb.append(i4);
                throw new IllegalArgumentException(sb.toString());
            } else if (i3 == i2) {
                return -charAt;
            } else {
                char charAt2 = charSequence.charAt(i3);
                if (Character.isLowSurrogate(charAt2)) {
                    return Character.toCodePoint(charAt, charAt2);
                }
                StringBuilder sb2 = new StringBuilder(83);
                sb2.append("Expected low surrogate but got char '");
                sb2.append(charAt2);
                sb2.append(str2);
                sb2.append(charAt2);
                sb2.append(str);
                sb2.append(i3);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo25854a(CharSequence charSequence, int i, int i2);

    /* renamed from: a */
    public abstract String mo25853a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo25857a(String str, int i) {
        int i2;
        int length = str.length();
        char[] a = C6420d.m29807a();
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            int b = m29809b(str, i, length);
            if (b >= 0) {
                char[] a2 = mo25855a(b);
                int i5 = (Character.isSupplementaryCodePoint(b) ? 2 : 1) + i;
                if (a2 != null) {
                    int i6 = i - i3;
                    int i7 = i4 + i6;
                    int length2 = a2.length + i7;
                    if (a.length < length2) {
                        a = m29808a(a, i4, ((length2 + length) - i) + 32);
                    }
                    if (i6 > 0) {
                        str.getChars(i3, i, a, i4);
                        i4 = i7;
                    }
                    if (a2.length > 0) {
                        System.arraycopy(a2, 0, a, i4, a2.length);
                        i4 += a2.length;
                    }
                    i3 = i5;
                }
                i = mo25854a((CharSequence) str, i5, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i8 = length - i3;
        if (i8 > 0) {
            i2 = i8 + i4;
            if (a.length < i2) {
                a = m29808a(a, i4, i2);
            }
            str.getChars(i3, length, a, i4);
        } else {
            i2 = i4;
        }
        return new String(a, 0, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract char[] mo25855a(int i);

    /* renamed from: a */
    private static char[] m29808a(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }
}
