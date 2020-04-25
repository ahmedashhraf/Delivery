package com.google.zxing.p341w;

import com.google.zxing.C8929a;
import com.google.zxing.C8969c;
import com.google.zxing.C8974d;
import com.google.zxing.C8984m;
import com.google.zxing.C8985n;
import com.google.zxing.C8986o;
import com.google.zxing.C8987p;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9044b;
import com.google.zxing.p335u.C9047e;
import com.google.zxing.p341w.p342b.C9091c;
import java.util.Map;

/* renamed from: com.google.zxing.w.a */
/* compiled from: MaxiCodeReader */
public final class C9088a implements C8984m {

    /* renamed from: b */
    private static final C8987p[] f23801b = new C8987p[0];

    /* renamed from: c */
    private static final int f23802c = 30;

    /* renamed from: d */
    private static final int f23803d = 33;

    /* renamed from: a */
    private final C9091c f23804a = new C9091c();

    /* renamed from: a */
    public C8985n mo32670a(C8969c cVar) throws NotFoundException, ChecksumException, FormatException {
        return mo32671a(cVar, null);
    }

    public void reset() {
    }

    /* renamed from: a */
    public C8985n mo32671a(C8969c cVar, Map<C8974d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        if (map == null || !map.containsKey(C8974d.PURE_BARCODE)) {
            throw NotFoundException.m41712a();
        }
        C9047e a = this.f23804a.mo33105a(m42535a(cVar.mo32766a()), map);
        C8985n nVar = new C8985n(a.mo33027j(), a.mo33024g(), f23801b, C8929a.MAXICODE);
        String b = a.mo33018b();
        if (b != null) {
            nVar.mo32820a(C8986o.ERROR_CORRECTION_LEVEL, b);
        }
        return nVar;
    }

    /* renamed from: a */
    private static C9044b m42535a(C9044b bVar) throws NotFoundException {
        int[] d = bVar.mo33000d();
        if (d != null) {
            int i = d[0];
            int i2 = d[1];
            int i3 = d[2];
            int i4 = d[3];
            C9044b bVar2 = new C9044b(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (bVar.mo32995b(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        bVar2.mo32996c(i7, i5);
                    }
                }
            }
            return bVar2;
        }
        throw NotFoundException.m41712a();
    }
}
