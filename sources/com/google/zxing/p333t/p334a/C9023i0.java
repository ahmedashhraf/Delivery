package com.google.zxing.p333t.p334a;

import com.google.zxing.C8929a;
import com.google.zxing.C8985n;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.t.a.i0 */
/* compiled from: VINResultParser */
public final class C9023i0 extends C9037u {

    /* renamed from: f */
    private static final Pattern f23616f = Pattern.compile("[IOQ]");

    /* renamed from: g */
    private static final Pattern f23617g = Pattern.compile("[A-Z0-9]{17}");

    /* renamed from: b */
    private static int m42187b(int i) {
        if (i > 0 && i <= 7) {
            return 9 - i;
        }
        if (i == 8) {
            return 10;
        }
        if (i == 9) {
            return 0;
        }
        if (i >= 10 && i <= 17) {
            return 19 - i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    private static int m42189c(char c) {
        if (c >= 'A' && c <= 'I') {
            return (c - 'A') + 1;
        }
        if (c >= 'J' && c <= 'R') {
            return (c - 'J') + 1;
        }
        if (c >= 'S' && c <= 'Z') {
            return (c - 'S') + 2;
        }
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    private static int m42186b(char c) {
        if (c >= 'E' && c <= 'H') {
            return (c - 'E') + 1984;
        }
        if (c >= 'J' && c <= 'N') {
            return (c - 'J') + 1988;
        }
        if (c == 'P') {
            return 1993;
        }
        if (c >= 'R' && c <= 'T') {
            return (c - 'R') + 1994;
        }
        if (c >= 'V' && c <= 'Y') {
            return (c - 'V') + 1997;
        }
        if (c >= '1' && c <= '9') {
            return (c - '1') + 2001;
        }
        if (c >= 'A' && c <= 'D') {
            return (c - 'A') + 2010;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C9021h0 m42191a(C8985n nVar) {
        if (nVar.mo32819a() != C8929a.CODE_39) {
            return null;
        }
        String trim = f23616f.matcher(nVar.mo32827f()).replaceAll("").trim();
        if (!f23617g.matcher(trim).matches()) {
            return null;
        }
        try {
            if (!m42185a((CharSequence) trim)) {
                return null;
            }
            String substring = trim.substring(0, 3);
            C9021h0 h0Var = new C9021h0(trim, substring, trim.substring(3, 9), trim.substring(9, 17), m42188b((CharSequence) substring), trim.substring(3, 8), m42186b(trim.charAt(9)), trim.charAt(10), trim.substring(11));
            return h0Var;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m42188b(CharSequence charSequence) {
        char charAt = charSequence.charAt(0);
        char charAt2 = charSequence.charAt(1);
        if (charAt != '9') {
            String str = "DE";
            if (charAt != 'S') {
                if (charAt != 'Z') {
                    switch (charAt) {
                        case '1':
                        case '4':
                        case '5':
                            return "US";
                        case '2':
                            return "CA";
                        case '3':
                            if (charAt2 >= 'A' && charAt2 <= 'W') {
                                return "MX";
                            }
                        default:
                            switch (charAt) {
                                case 'J':
                                    if (charAt2 >= 'A' && charAt2 <= 'T') {
                                        return "JP";
                                    }
                                case 'K':
                                    if (charAt2 >= 'L' && charAt2 <= 'R') {
                                        return "KO";
                                    }
                                case 'L':
                                    return "CN";
                                case 'M':
                                    if (charAt2 >= 'A' && charAt2 <= 'E') {
                                        return "IN";
                                    }
                                default:
                                    switch (charAt) {
                                        case 'V':
                                            if (charAt2 >= 'F' && charAt2 <= 'R') {
                                                return "FR";
                                            }
                                            if (charAt2 >= 'S' && charAt2 <= 'W') {
                                                return "ES";
                                            }
                                        case 'W':
                                            return str;
                                        case 'X':
                                            if (charAt2 == '0' || (charAt2 >= '3' && charAt2 <= '9')) {
                                                return "RU";
                                            }
                                    }
                                    break;
                            }
                            break;
                    }
                } else if (charAt2 >= 'A' && charAt2 <= 'R') {
                    return "IT";
                }
            } else if (charAt2 >= 'A' && charAt2 <= 'M') {
                return "UK";
            } else {
                if (charAt2 >= 'N' && charAt2 <= 'T') {
                    return str;
                }
            }
        } else if ((charAt2 >= 'A' && charAt2 <= 'E') || (charAt2 >= '3' && charAt2 <= '9')) {
            return "BR";
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m42185a(CharSequence charSequence) {
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i + 1;
            i2 += m42187b(i3) * m42189c(charSequence.charAt(i));
            i = i3;
        }
        if (charSequence.charAt(8) == m42184a(i2 % 11)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static char m42184a(int i) {
        if (i < 10) {
            return (char) (i + 48);
        }
        if (i == 10) {
            return 'X';
        }
        throw new IllegalArgumentException();
    }
}
