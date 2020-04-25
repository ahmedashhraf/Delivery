package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.C8976f;
import com.google.zxing.WriterException;
import com.google.zxing.p335u.C9044b;
import java.util.Map;

/* renamed from: com.google.zxing.y.h */
/* compiled from: Code93Writer */
public class C9142h extends C9153s {
    /* renamed from: a */
    public C9044b mo32674a(String str, C8929a aVar, int i, int i2, Map<C8976f, ?> map) throws WriterException {
        if (aVar == C8929a.CODE_93) {
            return super.mo32674a(str, aVar, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode CODE_93, but got ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean[] mo33119a(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[(((str.length() + 2 + 2) * 9) + 1)];
            m42735a(C9141g.f23986e[47], iArr);
            int i = 0;
            int a = m42734a(zArr, 0, iArr, true);
            while (true) {
                String str2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
                if (i < length) {
                    m42735a(C9141g.f23986e[str2.indexOf(str.charAt(i))], iArr);
                    a += m42734a(zArr, a, iArr, true);
                    i++;
                } else {
                    int a2 = m42733a(str, 20);
                    m42735a(C9141g.f23986e[a2], iArr);
                    int a3 = a + m42734a(zArr, a, iArr, true);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str2.charAt(a2));
                    m42735a(C9141g.f23986e[m42733a(sb.toString(), 15)], iArr);
                    int a4 = a3 + m42734a(zArr, a3, iArr, true);
                    m42735a(C9141g.f23986e[47], iArr);
                    zArr[a4 + m42734a(zArr, a4, iArr, true)] = true;
                    return zArr;
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    private static void m42735a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    /* renamed from: a */
    protected static int m42734a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int length = iArr.length;
        int i2 = i;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i2 + 1;
            zArr[i2] = iArr[i3] != 0;
            i3++;
            i2 = i4;
        }
        return 9;
    }

    /* renamed from: a */
    private static int m42733a(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }
}
