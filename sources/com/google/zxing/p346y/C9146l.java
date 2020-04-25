package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.C8976f;
import com.google.zxing.WriterException;
import com.google.zxing.p335u.C9044b;
import java.util.Map;

/* renamed from: com.google.zxing.y.l */
/* compiled from: EAN8Writer */
public final class C9146l extends C9160z {

    /* renamed from: a */
    private static final int f23994a = 67;

    /* renamed from: a */
    public C9044b mo32674a(String str, C8929a aVar, int i, int i2, Map<C8976f, ?> map) throws WriterException {
        if (aVar == C8929a.EAN_8) {
            return super.mo32674a(str, aVar, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode EAN_8, but got ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean[] mo33119a(String str) {
        if (str.length() == 8) {
            boolean[] zArr = new boolean[67];
            int a = C9153s.m42769a(zArr, 0, C9159y.f24022f, true) + 0;
            int i = 0;
            while (i <= 3) {
                int i2 = i + 1;
                a += C9153s.m42769a(zArr, a, C9159y.f24025i[Integer.parseInt(str.substring(i, i2))], false);
                i = i2;
            }
            int a2 = a + C9153s.m42769a(zArr, a, C9159y.f24023g, false);
            int i3 = 4;
            while (i3 <= 7) {
                int i4 = i3 + 1;
                a2 += C9153s.m42769a(zArr, a2, C9159y.f24025i[Integer.parseInt(str.substring(i3, i4))], true);
                i3 = i4;
            }
            C9153s.m42769a(zArr, a2, C9159y.f24022f, true);
            return zArr;
        }
        StringBuilder sb = new StringBuilder("Requested contents should be 8 digits long, but got ");
        sb.append(str.length());
        throw new IllegalArgumentException(sb.toString());
    }
}
