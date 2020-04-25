package com.google.zxing.p343x;

import com.google.zxing.C8969c;
import com.google.zxing.C8974d;
import com.google.zxing.C8984m;
import com.google.zxing.C8985n;
import com.google.zxing.C8987p;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.zxing.x.b */
/* compiled from: GenericMultipleBarcodeReader */
public final class C9093b implements C9094c {

    /* renamed from: b */
    private static final int f23829b = 100;

    /* renamed from: c */
    private static final int f23830c = 4;

    /* renamed from: a */
    private final C8984m f23831a;

    public C9093b(C8984m mVar) {
        this.f23831a = mVar;
    }

    /* renamed from: a */
    private void m42555a(C8969c cVar, Map<C8974d, ?> map, List<C8985n> list, int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        float f;
        C8969c cVar2 = cVar;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        if (i8 <= 4) {
            try {
                C8985n a = this.f23831a.mo32671a(cVar2, map);
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C8985n) it.next()).mo32827f().equals(a.mo32827f())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    list.add(m42554a(a, i6, i7));
                } else {
                    List<C8985n> list2 = list;
                }
                C8987p[] e = a.mo32826e();
                if (!(e == null || e.length == 0)) {
                    int c = cVar.mo32768c();
                    int b = cVar.mo32767b();
                    float f2 = (float) c;
                    float f3 = (float) b;
                    float f4 = f3;
                    float f5 = 0.0f;
                    float f6 = 0.0f;
                    float f7 = f2;
                    for (C8987p pVar : e) {
                        if (pVar != null) {
                            float a2 = pVar.mo32830a();
                            float b2 = pVar.mo32831b();
                            if (a2 < f7) {
                                f7 = a2;
                            }
                            if (b2 < f4) {
                                f4 = b2;
                            }
                            if (a2 > f5) {
                                f5 = a2;
                            }
                            if (b2 > f6) {
                                f6 = b2;
                            }
                        }
                    }
                    if (f7 > 100.0f) {
                        f = f4;
                        i5 = b;
                        i4 = c;
                        m42555a(cVar2.mo32764a(0, 0, (int) f7, b), map, list, i, i2, i8 + 1);
                    } else {
                        f = f4;
                        i5 = b;
                        i4 = c;
                    }
                    if (f > 100.0f) {
                        m42555a(cVar2.mo32764a(0, 0, i4, (int) f), map, list, i, i2, i8 + 1);
                    }
                    if (f5 < ((float) (i4 - 100))) {
                        int i9 = (int) f5;
                        m42555a(cVar2.mo32764a(i9, 0, i4 - i9, i5), map, list, i6 + i9, i2, i8 + 1);
                    }
                    if (f6 < ((float) (i5 - 100))) {
                        int i10 = (int) f6;
                        m42555a(cVar2.mo32764a(0, i10, i4, i5 - i10), map, list, i, i7 + i10, i8 + 1);
                    }
                }
            } catch (ReaderException unused) {
            }
        }
    }

    /* renamed from: b */
    public C8985n[] mo33106b(C8969c cVar) throws NotFoundException {
        return mo33107b(cVar, null);
    }

    /* renamed from: b */
    public C8985n[] mo33107b(C8969c cVar, Map<C8974d, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        m42555a(cVar, map, arrayList, 0, 0, 0);
        if (!arrayList.isEmpty()) {
            return (C8985n[]) arrayList.toArray(new C8985n[arrayList.size()]);
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private static C8985n m42554a(C8985n nVar, int i, int i2) {
        C8987p[] e = nVar.mo32826e();
        if (e == null) {
            return nVar;
        }
        C8987p[] pVarArr = new C8987p[e.length];
        for (int i3 = 0; i3 < e.length; i3++) {
            C8987p pVar = e[i3];
            if (pVar != null) {
                pVarArr[i3] = new C8987p(pVar.mo32830a() + ((float) i), pVar.mo32831b() + ((float) i2));
            }
        }
        C8985n nVar2 = new C8985n(nVar.mo32827f(), nVar.mo32824c(), nVar.mo32823b(), pVarArr, nVar.mo32819a(), nVar.mo32828g());
        nVar2.mo32821a(nVar.mo32825d());
        return nVar2;
    }
}
