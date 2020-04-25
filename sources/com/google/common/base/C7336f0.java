package com.google.common.base;

import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2778d;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.base.f0 */
/* compiled from: Strings */
public final class C7336f0 {
    private C7336f0() {
    }

    @C5952h
    /* renamed from: a */
    public static String m35529a(@C5952h String str) {
        if (m35535b(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m35535b(@C5952h String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: c */
    public static String m35536c(@C5952h String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static String m35531a(String str, int i, char c) {
        C7397x.m35664a(str);
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
    public static String m35534b(String str, int i, char c) {
        C7397x.m35664a(str);
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
    public static String m35530a(String str, int i) {
        C7397x.m35664a(str);
        if (i <= 1) {
            C7397x.m35672a(i >= 0, "invalid count: %s", Integer.valueOf(i));
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
    public static String m35533b(CharSequence charSequence, CharSequence charSequence2) {
        C7397x.m35664a(charSequence);
        C7397x.m35664a(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && charSequence.charAt((charSequence.length() - i) - 1) == charSequence2.charAt((charSequence2.length() - i) - 1)) {
            i++;
        }
        if (m35532a(charSequence, (charSequence.length() - i) - 1) || m35532a(charSequence2, (charSequence2.length() - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(charSequence.length() - i, charSequence.length()).toString();
    }

    /* renamed from: a */
    public static String m35528a(CharSequence charSequence, CharSequence charSequence2) {
        C7397x.m35664a(charSequence);
        C7397x.m35664a(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && charSequence.charAt(i) == charSequence2.charAt(i)) {
            i++;
        }
        int i2 = i - 1;
        if (m35532a(charSequence, i2) || m35532a(charSequence2, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    @C2778d
    /* renamed from: a */
    static boolean m35532a(CharSequence charSequence, int i) {
        return i >= 0 && i <= charSequence.length() + -2 && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1));
    }
}
