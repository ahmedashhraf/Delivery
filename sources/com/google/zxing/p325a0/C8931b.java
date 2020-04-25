package com.google.zxing.p325a0;

import com.google.zxing.C8929a;
import com.google.zxing.C8976f;
import com.google.zxing.C8989r;
import com.google.zxing.WriterException;
import com.google.zxing.p325a0.p326c.C8945f;
import com.google.zxing.p325a0.p328e.C8962b;
import com.google.zxing.p325a0.p328e.C8963c;
import com.google.zxing.p325a0.p328e.C8967f;
import com.google.zxing.p335u.C9044b;
import java.util.Map;

/* renamed from: com.google.zxing.a0.b */
/* compiled from: QRCodeWriter */
public final class C8931b implements C8989r {

    /* renamed from: a */
    private static final int f23370a = 4;

    /* renamed from: a */
    public C9044b mo32673a(String str, C8929a aVar, int i, int i2) throws WriterException {
        return mo32674a(str, aVar, i, i2, null);
    }

    /* renamed from: a */
    public C9044b mo32674a(String str, C8929a aVar, int i, int i2, Map<C8976f, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != C8929a.QR_CODE) {
            StringBuilder sb = new StringBuilder("Can only encode QR_CODE, but got ");
            sb.append(aVar);
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb2 = new StringBuilder("Requested dimensions are too small: ");
            sb2.append(i);
            sb2.append('x');
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            C8945f fVar = C8945f.L;
            int i3 = 4;
            if (map != null) {
                if (map.containsKey(C8976f.ERROR_CORRECTION)) {
                    fVar = C8945f.valueOf(map.get(C8976f.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(C8976f.MARGIN)) {
                    i3 = Integer.parseInt(map.get(C8976f.MARGIN).toString());
                }
            }
            return m41718a(C8963c.m41844a(str, fVar, map), i, i2, i3);
        }
    }

    /* renamed from: a */
    private static C9044b m41718a(C8967f fVar, int i, int i2, int i3) {
        C8962b c = fVar.mo32754c();
        if (c != null) {
            int c2 = c.mo32745c();
            int b = c.mo32744b();
            int i4 = i3 << 1;
            int i5 = c2 + i4;
            int i6 = i4 + b;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (c2 * min)) / 2;
            int i8 = (max2 - (b * min)) / 2;
            C9044b bVar = new C9044b(max, max2);
            int i9 = 0;
            while (i9 < b) {
                int i10 = i7;
                int i11 = 0;
                while (i11 < c2) {
                    if (c.mo32738a(i11, i9) == 1) {
                        bVar.mo32991a(i10, i8, min, min);
                    }
                    i11++;
                    i10 += min;
                }
                i9++;
                i8 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }
}
