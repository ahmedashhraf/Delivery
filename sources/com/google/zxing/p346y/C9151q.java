package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.C8974d;
import com.google.zxing.C8985n;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.p335u.C9043a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.zxing.y.q */
/* compiled from: MultiFormatUPCEANReader */
public final class C9151q extends C9152r {

    /* renamed from: a */
    private final C9159y[] f24009a;

    public C9151q(Map<C8974d, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(C8974d.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C8929a.EAN_13)) {
                arrayList.add(new C9143i());
            } else if (collection.contains(C8929a.UPC_A)) {
                arrayList.add(new C9154t());
            }
            if (collection.contains(C8929a.EAN_8)) {
                arrayList.add(new C9145k());
            }
            if (collection.contains(C8929a.UPC_E)) {
                arrayList.add(new C9103a0());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C9143i());
            arrayList.add(new C9145k());
            arrayList.add(new C9103a0());
        }
        this.f24009a = (C9159y[]) arrayList.toArray(new C9159y[arrayList.size()]);
    }

    /* renamed from: a */
    public C8985n mo33114a(int i, C9043a aVar, Map<C8974d, ?> map) throws NotFoundException {
        Collection collection;
        int[] a = C9159y.m42797a(aVar);
        C9159y[] yVarArr = this.f24009a;
        boolean z = false;
        int i2 = 0;
        while (i2 < yVarArr.length) {
            try {
                C8985n a2 = yVarArr[i2].mo33194a(i, aVar, a, map);
                boolean z2 = a2.mo32819a() == C8929a.EAN_13 && a2.mo32827f().charAt(0) == '0';
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(C8974d.POSSIBLE_FORMATS);
                }
                if (collection == null || collection.contains(C8929a.UPC_A)) {
                    z = true;
                }
                if (!z2 || !z) {
                    return a2;
                }
                C8985n nVar = new C8985n(a2.mo32827f().substring(1), a2.mo32824c(), a2.mo32826e(), C8929a.UPC_A);
                nVar.mo32821a(a2.mo32825d());
                return nVar;
            } catch (ReaderException unused) {
                i2++;
            }
        }
        throw NotFoundException.m41712a();
    }

    public void reset() {
        for (C9159y reset : this.f24009a) {
            reset.reset();
        }
    }
}
