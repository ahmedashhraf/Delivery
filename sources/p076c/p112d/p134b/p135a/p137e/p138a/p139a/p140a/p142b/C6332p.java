package p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b;

import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2716b;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2718d;
import p201f.p202a.C5952h;

@C2716b
/* renamed from: c.d.b.a.e.a.a.a.b.p */
/* compiled from: Strings */
public final class C6332p {
    private C6332p() {
    }

    @C5952h
    /* renamed from: a */
    public static String m29466a(@C5952h String str) {
        if (m29472b(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m29472b(@C5952h String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: c */
    public static String m29473c(@C5952h String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static String m29468a(String str, int i, char c) {
        C6329k.m29434a(str);
        if (str.length() >= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        for (int length = str.length(); length < i; length++) {
            sb.append(c);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m29471b(String str, int i, char c) {
        C6329k.m29434a(str);
        if (str.length() >= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i);
        for (int length = str.length(); length < i; length++) {
            sb.append(c);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m29467a(String str, int i) {
        C6329k.m29434a(str);
        if (i <= 1) {
            C6329k.m29442a(i >= 0, "invalid count: %s", Integer.valueOf(i));
            if (i == 0) {
                str = "";
            }
            return str;
        }
        int length = str.length();
        long j = ((long) length) * ((long) i);
        int i2 = (int) j;
        if (((long) i2) == j) {
            char[] cArr = new char[i2];
            str.getChars(0, length, cArr, 0);
            while (true) {
                int i3 = i2 - length;
                if (length < i3) {
                    System.arraycopy(cArr, 0, cArr, length, length);
                    length <<= 1;
                } else {
                    System.arraycopy(cArr, 0, cArr, length, i3);
                    return new String(cArr);
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Required array size too large: ");
            sb.append(j);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    /* renamed from: b */
    public static String m29470b(CharSequence charSequence, CharSequence charSequence2) {
        C6329k.m29434a(charSequence);
        C6329k.m29434a(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && charSequence.charAt((charSequence.length() - i) - 1) == charSequence2.charAt((charSequence2.length() - i) - 1)) {
            i++;
        }
        if (m29469a(charSequence, (charSequence.length() - i) - 1) || m29469a(charSequence2, (charSequence2.length() - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(charSequence.length() - i, charSequence.length()).toString();
    }

    /* renamed from: a */
    public static String m29465a(CharSequence charSequence, CharSequence charSequence2) {
        C6329k.m29434a(charSequence);
        C6329k.m29434a(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && charSequence.charAt(i) == charSequence2.charAt(i)) {
            i++;
        }
        int i2 = i - 1;
        if (m29469a(charSequence, i2) || m29469a(charSequence2, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    @C2718d
    /* renamed from: a */
    static boolean m29469a(CharSequence charSequence, int i) {
        return i >= 0 && i <= charSequence.length() + -2 && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1));
    }
}
