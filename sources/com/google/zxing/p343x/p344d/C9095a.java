package com.google.zxing.p343x.p344d;

import com.google.zxing.C8929a;
import com.google.zxing.C8969c;
import com.google.zxing.C8974d;
import com.google.zxing.C8985n;
import com.google.zxing.C8986o;
import com.google.zxing.C8987p;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.p325a0.C8930a;
import com.google.zxing.p325a0.p326c.C8948i;
import com.google.zxing.p335u.C9047e;
import com.google.zxing.p335u.C9049g;
import com.google.zxing.p343x.C9094c;
import com.google.zxing.p343x.p344d.p345b.C9098a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.zxing.x.d.a */
/* compiled from: QRCodeMultiReader */
public final class C9095a extends C8930a implements C9094c {

    /* renamed from: c */
    private static final C8985n[] f23832c = new C8985n[0];

    /* renamed from: d */
    private static final C8987p[] f23833d = new C8987p[0];

    /* renamed from: com.google.zxing.x.d.a$b */
    /* compiled from: QRCodeMultiReader */
    private static final class C9097b implements Serializable, Comparator<C8985n> {
        private C9097b() {
        }

        /* renamed from: a */
        public int compare(C8985n nVar, C8985n nVar2) {
            int intValue = ((Integer) nVar.mo32825d().get(C8986o.STRUCTURED_APPEND_SEQUENCE)).intValue();
            int intValue2 = ((Integer) nVar2.mo32825d().get(C8986o.STRUCTURED_APPEND_SEQUENCE)).intValue();
            if (intValue < intValue2) {
                return -1;
            }
            return intValue > intValue2 ? 1 : 0;
        }
    }

    /* renamed from: a */
    private static List<C8985n> m42560a(List<C8985n> list) {
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C8985n) it.next()).mo32825d().containsKey(C8986o.STRUCTURED_APPEND_SEQUENCE)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<C8985n> arrayList2 = new ArrayList<>();
        for (C8985n nVar : list) {
            arrayList.add(nVar);
            if (nVar.mo32825d().containsKey(C8986o.STRUCTURED_APPEND_SEQUENCE)) {
                arrayList2.add(nVar);
            }
        }
        Collections.sort(arrayList2, new C9097b());
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        for (C8985n nVar2 : arrayList2) {
            sb.append(nVar2.mo32827f());
            i += nVar2.mo32824c().length;
            if (nVar2.mo32825d().containsKey(C8986o.BYTE_SEGMENTS)) {
                for (byte[] length : (Iterable) nVar2.mo32825d().get(C8986o.BYTE_SEGMENTS)) {
                    i2 += length.length;
                }
            }
        }
        byte[] bArr = new byte[i];
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        for (C8985n nVar3 : arrayList2) {
            System.arraycopy(nVar3.mo32824c(), 0, bArr, i3, nVar3.mo32824c().length);
            i3 += nVar3.mo32824c().length;
            if (nVar3.mo32825d().containsKey(C8986o.BYTE_SEGMENTS)) {
                for (byte[] bArr3 : (Iterable) nVar3.mo32825d().get(C8986o.BYTE_SEGMENTS)) {
                    System.arraycopy(bArr3, 0, bArr2, i4, bArr3.length);
                    i4 += bArr3.length;
                }
            }
        }
        C8985n nVar4 = new C8985n(sb.toString(), bArr, f23833d, C8929a.QR_CODE);
        if (i2 > 0) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(bArr2);
            nVar4.mo32820a(C8986o.BYTE_SEGMENTS, arrayList3);
        }
        arrayList.add(nVar4);
        return arrayList;
    }

    /* renamed from: b */
    public C8985n[] mo33106b(C8969c cVar) throws NotFoundException {
        return mo33107b(cVar, null);
    }

    /* renamed from: b */
    public C8985n[] mo33107b(C8969c cVar, Map<C8974d, ?> map) throws NotFoundException {
        C9049g[] b;
        ArrayList arrayList = new ArrayList();
        for (C9049g gVar : new C9098a(cVar.mo32766a()).mo33110b(map)) {
            try {
                C9047e a = mo32669a().mo32686a(gVar.mo33031a(), map);
                C8987p[] b2 = gVar.mo33032b();
                if (a.mo33023f() instanceof C8948i) {
                    ((C8948i) a.mo33023f()).mo32696a(b2);
                }
                C8985n nVar = new C8985n(a.mo33027j(), a.mo33024g(), b2, C8929a.QR_CODE);
                List a2 = a.mo33014a();
                if (a2 != null) {
                    nVar.mo32820a(C8986o.BYTE_SEGMENTS, a2);
                }
                String b3 = a.mo33018b();
                if (b3 != null) {
                    nVar.mo32820a(C8986o.ERROR_CORRECTION_LEVEL, b3);
                }
                if (a.mo33028k()) {
                    nVar.mo32820a(C8986o.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(a.mo33026i()));
                    nVar.mo32820a(C8986o.STRUCTURED_APPEND_PARITY, Integer.valueOf(a.mo33025h()));
                }
                arrayList.add(nVar);
            } catch (ReaderException unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return f23832c;
        }
        List a3 = m42560a(arrayList);
        return (C8985n[]) a3.toArray(new C8985n[a3.size()]);
    }
}
