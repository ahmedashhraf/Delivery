package com.google.zxing.p337v;

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
import com.google.zxing.p335u.C9049g;
import com.google.zxing.p337v.p338c.C9065d;
import com.google.zxing.p337v.p339d.C9070a;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.zxing.v.a */
/* compiled from: DataMatrixReader */
public final class C9058a implements C8984m {

    /* renamed from: b */
    private static final C8987p[] f23722b = new C8987p[0];

    /* renamed from: a */
    private final C9065d f23723a = new C9065d();

    /* renamed from: a */
    public C8985n mo32670a(C8969c cVar) throws NotFoundException, ChecksumException, FormatException {
        return mo32671a(cVar, null);
    }

    public void reset() {
    }

    /* renamed from: a */
    public C8985n mo32671a(C8969c cVar, Map<C8974d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        C8987p[] pVarArr;
        C9047e eVar;
        if (map == null || !map.containsKey(C8974d.PURE_BARCODE)) {
            C9049g a = new C9070a(cVar.mo32766a()).mo33057a();
            C9047e a2 = this.f23723a.mo33043a(a.mo33031a());
            pVarArr = a.mo33032b();
            eVar = a2;
        } else {
            eVar = this.f23723a.mo33043a(m42380a(cVar.mo32766a()));
            pVarArr = f23722b;
        }
        C8985n nVar = new C8985n(eVar.mo33027j(), eVar.mo33024g(), pVarArr, C8929a.DATA_MATRIX);
        List a3 = eVar.mo33014a();
        if (a3 != null) {
            nVar.mo32820a(C8986o.BYTE_SEGMENTS, a3);
        }
        String b = eVar.mo33018b();
        if (b != null) {
            nVar.mo32820a(C8986o.ERROR_CORRECTION_LEVEL, b);
        }
        return nVar;
    }

    /* renamed from: a */
    private static C9044b m42380a(C9044b bVar) throws NotFoundException {
        int[] g = bVar.mo33004g();
        int[] c = bVar.mo32997c();
        if (g == null || c == null) {
            throw NotFoundException.m41712a();
        }
        int a = m42379a(g, bVar);
        int i = g[1];
        int i2 = c[1];
        int i3 = g[0];
        int i4 = ((c[0] - i3) + 1) / a;
        int i5 = ((i2 - i) + 1) / a;
        if (i4 <= 0 || i5 <= 0) {
            throw NotFoundException.m41712a();
        }
        int i6 = a / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        C9044b bVar2 = new C9044b(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * a) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (bVar.mo32995b((i11 * a) + i8, i10)) {
                    bVar2.mo32996c(i11, i9);
                }
            }
        }
        return bVar2;
    }

    /* renamed from: a */
    private static int m42379a(int[] iArr, C9044b bVar) throws NotFoundException {
        int h = bVar.mo33005h();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < h && bVar.mo32995b(i, i2)) {
            i++;
        }
        if (i != h) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw NotFoundException.m41712a();
        }
        throw NotFoundException.m41712a();
    }
}
