package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.C8976f;
import com.google.zxing.WriterException;
import com.google.zxing.p335u.C9044b;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.zxing.y.d */
/* compiled from: Code128Writer */
public final class C9137d extends C9153s {

    /* renamed from: a */
    private static final int f23963a = 104;

    /* renamed from: b */
    private static final int f23964b = 105;

    /* renamed from: c */
    private static final int f23965c = 100;

    /* renamed from: d */
    private static final int f23966d = 99;

    /* renamed from: e */
    private static final int f23967e = 106;

    /* renamed from: f */
    private static final char f23968f = 'ñ';

    /* renamed from: g */
    private static final char f23969g = 'ò';

    /* renamed from: h */
    private static final char f23970h = 'ó';

    /* renamed from: i */
    private static final char f23971i = 'ô';

    /* renamed from: j */
    private static final int f23972j = 102;

    /* renamed from: k */
    private static final int f23973k = 97;

    /* renamed from: l */
    private static final int f23974l = 96;

    /* renamed from: m */
    private static final int f23975m = 100;

    /* renamed from: com.google.zxing.y.d$a */
    /* compiled from: Code128Writer */
    private enum C9138a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: a */
    public C9044b mo32674a(String str, C8929a aVar, int i, int i2, Map<C8976f, ?> map) throws WriterException {
        if (aVar == C8929a.CODE_128) {
            return super.mo32674a(str, aVar, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode CODE_128, but got ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean[] mo33119a(String str) {
        int i;
        int length = str.length();
        if (length <= 0 || length > 80) {
            StringBuilder sb = new StringBuilder("Contents length should be between 1 and 80 characters, but got ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < ' ' || charAt > '~') {
                switch (charAt) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder("Bad character in input: ");
                        sb2.append(charAt);
                        throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i4 < length) {
            int a = m42714a(str, i4, i6);
            int i8 = 100;
            if (a == i6) {
                switch (str.charAt(i4)) {
                    case 241:
                        i8 = 102;
                        break;
                    case 242:
                        i8 = 97;
                        break;
                    case 243:
                        i8 = 96;
                        break;
                    case 244:
                        break;
                    default:
                        if (i6 != 100) {
                            i8 = Integer.parseInt(str.substring(i4, i4 + 2));
                            i4++;
                            break;
                        } else {
                            i8 = str.charAt(i4) - ' ';
                            break;
                        }
                }
                i4++;
            } else {
                i = i6 == 0 ? a == 100 ? 104 : 105 : a;
                i6 = a;
            }
            arrayList.add(C9106c.f23859a[i]);
            i5 += i * i7;
            if (i4 != 0) {
                i7++;
            }
        }
        arrayList.add(C9106c.f23859a[i5 % 103]);
        arrayList.add(C9106c.f23859a[106]);
        int i9 = 0;
        for (int[] iArr : arrayList) {
            int i10 = i9;
            for (int i11 : (int[]) r12.next()) {
                i10 += i11;
            }
            i9 = i10;
        }
        boolean[] zArr = new boolean[i9];
        for (int[] a2 : arrayList) {
            i2 += C9153s.m42769a(zArr, i2, a2, true);
        }
        return zArr;
    }

    /* renamed from: a */
    private static C9138a m42715a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return C9138a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return C9138a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return C9138a.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return C9138a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 < '0' || charAt2 > '9') {
            return C9138a.ONE_DIGIT;
        }
        return C9138a.TWO_DIGITS;
    }

    /* renamed from: a */
    private static int m42714a(CharSequence charSequence, int i, int i2) {
        C9138a a;
        C9138a a2 = m42715a(charSequence, i);
        if (!(a2 == C9138a.UNCODABLE || a2 == C9138a.ONE_DIGIT)) {
            if (i2 == 99) {
                return i2;
            }
            if (i2 != 100) {
                if (a2 == C9138a.FNC_1) {
                    a2 = m42715a(charSequence, i + 1);
                }
                if (a2 == C9138a.TWO_DIGITS) {
                    return 99;
                }
            } else if (a2 == C9138a.FNC_1) {
                return i2;
            } else {
                C9138a a3 = m42715a(charSequence, i + 2);
                if (a3 == C9138a.UNCODABLE || a3 == C9138a.ONE_DIGIT) {
                    return i2;
                }
                if (a3 == C9138a.FNC_1) {
                    return m42715a(charSequence, i + 3) == C9138a.TWO_DIGITS ? 99 : 100;
                }
                int i3 = i + 4;
                while (true) {
                    a = m42715a(charSequence, i3);
                    if (a != C9138a.TWO_DIGITS) {
                        break;
                    }
                    i3 += 2;
                }
                return a == C9138a.ONE_DIGIT ? 100 : 99;
            }
        }
        return 100;
    }
}
