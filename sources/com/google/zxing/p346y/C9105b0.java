package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.C8976f;
import com.google.zxing.WriterException;
import com.google.zxing.p335u.C9044b;
import java.util.Map;

/* renamed from: com.google.zxing.y.b0 */
/* compiled from: UPCEWriter */
public final class C9105b0 extends C9160z {

    /* renamed from: a */
    private static final int f23858a = 51;

    /* renamed from: a */
    public C9044b mo32674a(String str, C8929a aVar, int i, int i2, Map<C8976f, ?> map) throws WriterException {
        if (aVar == C8929a.UPC_E) {
            return super.mo32674a(str, aVar, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode UPC_E, but got ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean[] mo33119a(String str) {
        if (str.length() == 8) {
            int i = C9103a0.f23850l[Integer.parseInt(str.substring(7, 8))];
            boolean[] zArr = new boolean[51];
            int a = C9153s.m42769a(zArr, 0, C9159y.f24022f, true) + 0;
            int i2 = 1;
            while (i2 <= 6) {
                int i3 = i2 + 1;
                int parseInt = Integer.parseInt(str.substring(i2, i3));
                if (((i >> (6 - i2)) & 1) == 1) {
                    parseInt += 10;
                }
                a += C9153s.m42769a(zArr, a, C9159y.f24026j[parseInt], false);
                i2 = i3;
            }
            C9153s.m42769a(zArr, a, C9159y.f24024h, false);
            return zArr;
        }
        StringBuilder sb = new StringBuilder("Requested contents should be 8 digits long, but got ");
        sb.append(str.length());
        throw new IllegalArgumentException(sb.toString());
    }
}
