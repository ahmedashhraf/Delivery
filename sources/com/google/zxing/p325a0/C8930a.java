package com.google.zxing.p325a0;

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
import com.google.zxing.p325a0.p326c.C8944e;
import com.google.zxing.p325a0.p326c.C8948i;
import com.google.zxing.p325a0.p327d.C8954c;
import com.google.zxing.p335u.C9044b;
import com.google.zxing.p335u.C9047e;
import com.google.zxing.p335u.C9049g;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.zxing.a0.a */
/* compiled from: QRCodeReader */
public class C8930a implements C8984m {

    /* renamed from: b */
    private static final C8987p[] f23368b = new C8987p[0];

    /* renamed from: a */
    private final C8944e f23369a = new C8944e();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C8944e mo32669a() {
        return this.f23369a;
    }

    public void reset() {
    }

    /* renamed from: a */
    public C8985n mo32670a(C8969c cVar) throws NotFoundException, ChecksumException, FormatException {
        return mo32671a(cVar, null);
    }

    /* renamed from: a */
    public final C8985n mo32671a(C8969c cVar, Map<C8974d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        C8987p[] pVarArr;
        C9047e eVar;
        if (map == null || !map.containsKey(C8974d.PURE_BARCODE)) {
            C9049g a = new C8954c(cVar.mo32766a()).mo32718a(map);
            C9047e a2 = this.f23369a.mo32686a(a.mo33031a(), map);
            pVarArr = a.mo33032b();
            eVar = a2;
        } else {
            eVar = this.f23369a.mo32686a(m41714a(cVar.mo32766a()), map);
            pVarArr = f23368b;
        }
        if (eVar.mo33023f() instanceof C8948i) {
            ((C8948i) eVar.mo33023f()).mo32696a(pVarArr);
        }
        C8985n nVar = new C8985n(eVar.mo33027j(), eVar.mo33024g(), pVarArr, C8929a.QR_CODE);
        List a3 = eVar.mo33014a();
        if (a3 != null) {
            nVar.mo32820a(C8986o.BYTE_SEGMENTS, a3);
        }
        String b = eVar.mo33018b();
        if (b != null) {
            nVar.mo32820a(C8986o.ERROR_CORRECTION_LEVEL, b);
        }
        if (eVar.mo33028k()) {
            nVar.mo32820a(C8986o.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.mo33026i()));
            nVar.mo32820a(C8986o.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.mo33025h()));
        }
        return nVar;
    }

    /* renamed from: a */
    private static C9044b m41714a(C9044b bVar) throws NotFoundException {
        int[] g = bVar.mo33004g();
        int[] c = bVar.mo32997c();
        if (g == null || c == null) {
            throw NotFoundException.m41712a();
        }
        float a = m41713a(g, bVar);
        int i = g[1];
        int i2 = c[1];
        int i3 = g[0];
        int i4 = c[0];
        if (i3 >= i4 || i >= i2) {
            throw NotFoundException.m41712a();
        }
        int i5 = i2 - i;
        if (i5 != i4 - i3) {
            i4 = i3 + i5;
            if (i4 >= bVar.mo33005h()) {
                throw NotFoundException.m41712a();
            }
        }
        int round = Math.round(((float) ((i4 - i3) + 1)) / a);
        int round2 = Math.round(((float) (i5 + 1)) / a);
        if (round <= 0 || round2 <= 0) {
            throw NotFoundException.m41712a();
        } else if (round2 == round) {
            int i6 = (int) (a / 2.0f);
            int i7 = i + i6;
            int i8 = i3 + i6;
            int i9 = (((int) (((float) (round - 1)) * a)) + i8) - i4;
            if (i9 > 0) {
                if (i9 <= i6) {
                    i8 -= i9;
                } else {
                    throw NotFoundException.m41712a();
                }
            }
            int i10 = (((int) (((float) (round2 - 1)) * a)) + i7) - i2;
            if (i10 > 0) {
                if (i10 <= i6) {
                    i7 -= i10;
                } else {
                    throw NotFoundException.m41712a();
                }
            }
            C9044b bVar2 = new C9044b(round, round2);
            for (int i11 = 0; i11 < round2; i11++) {
                int i12 = ((int) (((float) i11) * a)) + i7;
                for (int i13 = 0; i13 < round; i13++) {
                    if (bVar.mo32995b(((int) (((float) i13) * a)) + i8, i12)) {
                        bVar2.mo32996c(i13, i11);
                    }
                }
            }
            return bVar2;
        } else {
            throw NotFoundException.m41712a();
        }
    }

    /* renamed from: a */
    private static float m41713a(int[] iArr, C9044b bVar) throws NotFoundException {
        int e = bVar.mo33001e();
        int h = bVar.mo33005h();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < h && i2 < e) {
            if (z != bVar.mo32995b(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != h && i2 != e) {
            return ((float) (i - iArr[0])) / 7.0f;
        }
        throw NotFoundException.m41712a();
    }
}
