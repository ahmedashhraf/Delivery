package org.apache.http.client.p533n;

import java.util.StringTokenizer;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.client.n.e */
/* compiled from: Rfc3492Idn */
public class C15174e implements C15171b {

    /* renamed from: a */
    private static final int f44056a = 36;

    /* renamed from: b */
    private static final int f44057b = 1;

    /* renamed from: c */
    private static final int f44058c = 26;

    /* renamed from: d */
    private static final int f44059d = 38;

    /* renamed from: e */
    private static final int f44060e = 700;

    /* renamed from: f */
    private static final int f44061f = 72;

    /* renamed from: g */
    private static final int f44062g = 128;

    /* renamed from: h */
    private static final char f44063h = '-';

    /* renamed from: i */
    private static final String f44064i = "xn--";

    /* renamed from: a */
    private int m67281a(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = i / f44060e;
        } else {
            i3 = i / 2;
        }
        int i4 = i3 + (i3 / i2);
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return i5 + ((i4 * 36) / (i4 + 38));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo46978b(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int lastIndexOf = str.lastIndexOf(45);
        int i = 128;
        int i2 = 72;
        if (lastIndexOf != -1) {
            sb.append(str.subSequence(0, lastIndexOf));
            str = str.substring(lastIndexOf + 1);
        }
        int i3 = 0;
        while (str.length() > 0) {
            int i4 = i3;
            int i5 = 1;
            int i6 = 36;
            while (str.length() != 0) {
                char charAt = str.charAt(0);
                str = str.substring(1);
                int a = m67280a(charAt);
                i4 += a * i5;
                int i7 = i6 <= i2 + 1 ? 1 : i6 >= i2 + 26 ? 26 : i6 - i2;
                if (a < i7) {
                    break;
                }
                i5 *= 36 - i7;
                i6 += 36;
            }
            i2 = m67281a(i4 - i3, sb.length() + 1, i3 == 0);
            i += i4 / (sb.length() + 1);
            int length = i4 % (sb.length() + 1);
            sb.insert(length, (char) i);
            i3 = length + 1;
        }
        return sb.toString();
    }

    /* renamed from: a */
    private int m67280a(char c) {
        if (c >= 'A' && c <= 'Z') {
            return c - 'A';
        }
        if (c >= 'a' && c <= 'z') {
            return c - 'a';
        }
        if (c >= '0' && c <= '9') {
            return (c - '0') + 26;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("illegal digit: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public String mo46977a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (sb.length() > 0) {
                sb.append('.');
            }
            if (nextToken.startsWith(f44064i)) {
                nextToken = mo46978b(nextToken.substring(4));
            }
            sb.append(nextToken);
        }
        return sb.toString();
    }
}
