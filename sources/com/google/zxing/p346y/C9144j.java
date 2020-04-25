package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.C8976f;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import com.google.zxing.p335u.C9044b;
import java.util.Map;

/* renamed from: com.google.zxing.y.j */
/* compiled from: EAN13Writer */
public final class C9144j extends C9160z {

    /* renamed from: a */
    private static final int f23992a = 95;

    /* renamed from: a */
    public C9044b mo32674a(String str, C8929a aVar, int i, int i2, Map<C8976f, ?> map) throws WriterException {
        if (aVar == C8929a.EAN_13) {
            return super.mo32674a(str, aVar, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode EAN_13, but got ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean[] mo33119a(String str) {
        if (str.length() == 13) {
            try {
                if (C9159y.m42796a((CharSequence) str)) {
                    int i = C9143i.f23990l[Integer.parseInt(str.substring(0, 1))];
                    boolean[] zArr = new boolean[95];
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
                    int a2 = a + C9153s.m42769a(zArr, a, C9159y.f24023g, false);
                    int i4 = 7;
                    while (i4 <= 12) {
                        int i5 = i4 + 1;
                        a2 += C9153s.m42769a(zArr, a2, C9159y.f24025i[Integer.parseInt(str.substring(i4, i5))], true);
                        i4 = i5;
                    }
                    C9153s.m42769a(zArr, a2, C9159y.f24022f, true);
                    return zArr;
                }
                throw new IllegalArgumentException("Contents do not pass checksum");
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            StringBuilder sb = new StringBuilder("Requested contents should be 13 digits long, but got ");
            sb.append(str.length());
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
