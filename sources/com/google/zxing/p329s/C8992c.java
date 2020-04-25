package com.google.zxing.p329s;

import com.google.zxing.C8929a;
import com.google.zxing.C8976f;
import com.google.zxing.C8989r;
import com.google.zxing.p329s.p332f.C8998a;
import com.google.zxing.p329s.p332f.C9000c;
import com.google.zxing.p335u.C9044b;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: com.google.zxing.s.c */
/* compiled from: AztecWriter */
public final class C8992c implements C8989r {

    /* renamed from: a */
    private static final Charset f23505a = Charset.forName("ISO-8859-1");

    /* renamed from: a */
    public C9044b mo32673a(String str, C8929a aVar, int i, int i2) {
        return mo32674a(str, aVar, i, i2, null);
    }

    /* renamed from: a */
    public C9044b mo32674a(String str, C8929a aVar, int i, int i2, Map<C8976f, ?> map) {
        int i3;
        int i4;
        Charset charset;
        Charset charset2 = f23505a;
        int i5 = 33;
        if (map != null) {
            if (map.containsKey(C8976f.CHARACTER_SET)) {
                charset2 = Charset.forName(map.get(C8976f.CHARACTER_SET).toString());
            }
            if (map.containsKey(C8976f.ERROR_CORRECTION)) {
                i5 = Integer.parseInt(map.get(C8976f.ERROR_CORRECTION).toString());
            }
            if (map.containsKey(C8976f.AZTEC_LAYERS)) {
                charset = charset2;
                i4 = i5;
                i3 = Integer.parseInt(map.get(C8976f.AZTEC_LAYERS).toString());
                return m42004a(str, aVar, i, i2, charset, i4, i3);
            }
            charset = charset2;
            i4 = i5;
        } else {
            charset = charset2;
            i4 = 33;
        }
        i3 = 0;
        return m42004a(str, aVar, i, i2, charset, i4, i3);
    }

    /* renamed from: a */
    private static C9044b m42004a(String str, C8929a aVar, int i, int i2, Charset charset, int i3, int i4) {
        if (aVar == C8929a.AZTEC) {
            return m42003a(C9000c.m42054a(str.getBytes(charset), i3, i4), i, i2);
        }
        StringBuilder sb = new StringBuilder("Can only encode AZTEC, but got ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private static C9044b m42003a(C8998a aVar, int i, int i2) {
        C9044b c = aVar.mo32852c();
        if (c != null) {
            int h = c.mo33005h();
            int e = c.mo33001e();
            int max = Math.max(i, h);
            int max2 = Math.max(i2, e);
            int min = Math.min(max / h, max2 / e);
            int i3 = (max - (h * min)) / 2;
            int i4 = (max2 - (e * min)) / 2;
            C9044b bVar = new C9044b(max, max2);
            int i5 = 0;
            while (i5 < e) {
                int i6 = i3;
                int i7 = 0;
                while (i7 < h) {
                    if (c.mo32995b(i7, i5)) {
                        bVar.mo32991a(i6, i4, min, min);
                    }
                    i7++;
                    i6 += min;
                }
                i5++;
                i4 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }
}
