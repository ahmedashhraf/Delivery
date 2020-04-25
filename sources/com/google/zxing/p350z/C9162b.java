package com.google.zxing.p350z;

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
import com.google.zxing.p335u.C9047e;
import com.google.zxing.p343x.C9094c;
import com.google.zxing.p350z.p351e.C9176j;
import com.google.zxing.p350z.p353f.C9180a;
import com.google.zxing.p350z.p353f.C9181b;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.zxing.z.b */
/* compiled from: PDF417Reader */
public final class C9162b implements C8984m, C9094c {
    /* renamed from: a */
    public C8985n mo32670a(C8969c cVar) throws NotFoundException, FormatException, ChecksumException {
        return mo32671a(cVar, null);
    }

    /* renamed from: b */
    public C8985n[] mo33106b(C8969c cVar) throws NotFoundException {
        return mo33107b(cVar, null);
    }

    public void reset() {
    }

    /* renamed from: a */
    public C8985n mo32671a(C8969c cVar, Map<C8974d, ?> map) throws NotFoundException, FormatException, ChecksumException {
        C8985n[] a = m42812a(cVar, map, false);
        if (a != null && a.length != 0 && a[0] != null) {
            return a[0];
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: b */
    public C8985n[] mo33107b(C8969c cVar, Map<C8974d, ?> map) throws NotFoundException {
        try {
            return m42812a(cVar, map, true);
        } catch (ChecksumException | FormatException unused) {
            throw NotFoundException.m41712a();
        }
    }

    /* renamed from: b */
    private static int m42813b(C8987p pVar, C8987p pVar2) {
        if (pVar == null || pVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(pVar.mo32830a() - pVar2.mo32830a());
    }

    /* renamed from: b */
    private static int m42814b(C8987p[] pVarArr) {
        return Math.min(Math.min(m42813b(pVarArr[0], pVarArr[4]), (m42813b(pVarArr[6], pVarArr[2]) * 17) / 18), Math.min(m42813b(pVarArr[1], pVarArr[5]), (m42813b(pVarArr[7], pVarArr[3]) * 17) / 18));
    }

    /* renamed from: a */
    private static C8985n[] m42812a(C8969c cVar, Map<C8974d, ?> map, boolean z) throws NotFoundException, FormatException, ChecksumException {
        ArrayList arrayList = new ArrayList();
        C9181b a = C9180a.m42954a(cVar, map, z);
        for (C8987p[] pVarArr : a.mo33278b()) {
            C9047e a2 = C9176j.m42909a(a.mo33277a(), pVarArr[4], pVarArr[5], pVarArr[6], pVarArr[7], m42814b(pVarArr), m42811a(pVarArr));
            C8985n nVar = new C8985n(a2.mo33027j(), a2.mo33024g(), pVarArr, C8929a.PDF_417);
            nVar.mo32820a(C8986o.ERROR_CORRECTION_LEVEL, a2.mo33018b());
            C9163c cVar2 = (C9163c) a2.mo33023f();
            if (cVar2 != null) {
                nVar.mo32820a(C8986o.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(nVar);
        }
        return (C8985n[]) arrayList.toArray(new C8985n[arrayList.size()]);
    }

    /* renamed from: a */
    private static int m42810a(C8987p pVar, C8987p pVar2) {
        if (pVar == null || pVar2 == null) {
            return 0;
        }
        return (int) Math.abs(pVar.mo32830a() - pVar2.mo32830a());
    }

    /* renamed from: a */
    private static int m42811a(C8987p[] pVarArr) {
        return Math.max(Math.max(m42810a(pVarArr[0], pVarArr[4]), (m42810a(pVarArr[6], pVarArr[2]) * 17) / 18), Math.max(m42810a(pVarArr[1], pVarArr[5]), (m42810a(pVarArr[7], pVarArr[3]) * 17) / 18));
    }
}
