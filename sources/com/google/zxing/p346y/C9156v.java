package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.C8985n;
import com.google.zxing.C8986o;
import com.google.zxing.C8987p;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.zxing.y.v */
/* compiled from: UPCEANExtension2Support */
final class C9156v {

    /* renamed from: a */
    private final int[] f24012a = new int[4];

    /* renamed from: b */
    private final StringBuilder f24013b = new StringBuilder();

    C9156v() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8985n mo33195a(int i, C9043a aVar, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.f24013b;
        sb.setLength(0);
        int a = m42785a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map a2 = m42786a(sb2);
        float f = (float) i;
        C8985n nVar = new C8985n(sb2, null, new C8987p[]{new C8987p(((float) (iArr[0] + iArr[1])) / 2.0f, f), new C8987p((float) a, f)}, C8929a.UPC_EAN_EXTENSION);
        if (a2 != null) {
            nVar.mo32821a(a2);
        }
        return nVar;
    }

    /* renamed from: a */
    private int m42785a(C9043a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f24012a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d = aVar.mo32979d();
        int i = iArr[1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 2 && i < d) {
            int a = C9159y.m42795a(aVar, iArr2, i, C9159y.f24026j);
            sb.append((char) ((a % 10) + 48));
            int i4 = i;
            for (int i5 : iArr2) {
                i4 += i5;
            }
            if (a >= 10) {
                i3 = (1 << (1 - i2)) | i3;
            }
            i = i2 != 1 ? aVar.mo32980d(aVar.mo32975c(i4)) : i4;
            i2++;
        }
        if (sb.length() != 2) {
            throw NotFoundException.m41712a();
        } else if (Integer.parseInt(sb.toString()) % 4 == i3) {
            return i;
        } else {
            throw NotFoundException.m41712a();
        }
    }

    /* renamed from: a */
    private static Map<C8986o, Object> m42786a(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C8986o.class);
        enumMap.put(C8986o.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }
}
