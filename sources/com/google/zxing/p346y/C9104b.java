package com.google.zxing.p346y;

/* renamed from: com.google.zxing.y.b */
/* compiled from: CodaBarWriter */
public final class C9104b extends C9153s {

    /* renamed from: a */
    private static final char[] f23854a = {'A', 'B', 'C', 'D'};

    /* renamed from: b */
    private static final char[] f23855b = {'T', 'N', '*', 'E'};

    /* renamed from: c */
    private static final char[] f23856c = {'/', ':', '+', '.'};

    /* renamed from: d */
    private static final char f23857d = f23854a[0];

    /* renamed from: a */
    public boolean[] mo33119a(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(f23857d);
            sb.append(str);
            sb.append(f23857d);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            boolean a = C9102a.m42571a(f23854a, upperCase);
            boolean a2 = C9102a.m42571a(f23854a, upperCase2);
            boolean a3 = C9102a.m42571a(f23855b, upperCase);
            boolean a4 = C9102a.m42571a(f23855b, upperCase2);
            String str2 = "Invalid start/end guards: ";
            if (a) {
                if (!a2) {
                    StringBuilder sb2 = new StringBuilder(str2);
                    sb2.append(str);
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else if (a3) {
                if (!a4) {
                    StringBuilder sb3 = new StringBuilder(str2);
                    sb3.append(str);
                    throw new IllegalArgumentException(sb3.toString());
                }
            } else if (a2 || a4) {
                StringBuilder sb4 = new StringBuilder(str2);
                sb4.append(str);
                throw new IllegalArgumentException(sb4.toString());
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(f23857d);
                sb5.append(str);
                sb5.append(f23857d);
                str = sb5.toString();
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else if (C9102a.m42571a(f23856c, str.charAt(i3))) {
                i2 += 10;
            } else {
                StringBuilder sb6 = new StringBuilder("Cannot encode : '");
                sb6.append(str.charAt(i3));
                sb6.append('\'');
                throw new IllegalArgumentException(sb6.toString());
            }
        }
        boolean[] zArr = new boolean[(i2 + (str.length() - 1))];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr = C9102a.f23843g;
                if (i6 >= cArr.length) {
                    i = 0;
                    break;
                } else if (upperCase3 == cArr[i6]) {
                    i = C9102a.f23844h[i6];
                    break;
                } else {
                    i6++;
                }
            }
            int i7 = i4;
            int i8 = 0;
            boolean z = true;
            while (true) {
                int i9 = 0;
                while (i8 < 7) {
                    zArr[i7] = z;
                    i7++;
                    if (((i >> (6 - i8)) & 1) == 0 || i9 == 1) {
                        z = !z;
                        i8++;
                    } else {
                        i9++;
                    }
                }
                break;
            }
            if (i5 < str.length() - 1) {
                zArr[i7] = false;
                i7++;
            }
            i4 = i7;
        }
        return zArr;
    }
}
