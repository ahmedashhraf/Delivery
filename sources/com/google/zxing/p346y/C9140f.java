package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.C8976f;
import com.google.zxing.WriterException;
import com.google.zxing.p335u.C9044b;
import java.util.Map;

/* renamed from: com.google.zxing.y.f */
/* compiled from: Code39Writer */
public final class C9140f extends C9153s {
    /* renamed from: a */
    public C9044b mo32674a(String str, C8929a aVar, int i, int i2, Map<C8976f, ?> map) throws WriterException {
        if (aVar == C8929a.CODE_39) {
            return super.mo32674a(str, aVar, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode CODE_39, but got ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean[] mo33119a(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            int i = length + 25;
            int i2 = 0;
            while (true) {
                String str2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%";
                if (i2 < length) {
                    int indexOf = str2.indexOf(str.charAt(i2));
                    if (indexOf >= 0) {
                        m42723a(C9139e.f23978g[indexOf], iArr);
                        int i3 = i;
                        for (int i4 = 0; i4 < 9; i4++) {
                            i3 += iArr[i4];
                        }
                        i2++;
                        i = i3;
                    } else {
                        StringBuilder sb = new StringBuilder("Bad contents: ");
                        sb.append(str);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    boolean[] zArr = new boolean[i];
                    m42723a(C9139e.f23979h, iArr);
                    int a = C9153s.m42769a(zArr, 0, iArr, true);
                    int[] iArr2 = {1};
                    int a2 = a + C9153s.m42769a(zArr, a, iArr2, false);
                    for (int i5 = 0; i5 < length; i5++) {
                        m42723a(C9139e.f23978g[str2.indexOf(str.charAt(i5))], iArr);
                        int a3 = a2 + C9153s.m42769a(zArr, a2, iArr, true);
                        a2 = a3 + C9153s.m42769a(zArr, a3, iArr2, false);
                    }
                    m42723a(C9139e.f23979h, iArr);
                    C9153s.m42769a(zArr, a2, iArr, true);
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
    private static void m42723a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }
}
