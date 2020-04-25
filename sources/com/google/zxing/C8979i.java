package com.google.zxing;

import com.google.zxing.p325a0.C8930a;
import com.google.zxing.p329s.C8991b;
import com.google.zxing.p337v.C9058a;
import com.google.zxing.p341w.C9088a;
import com.google.zxing.p346y.C9150p;
import com.google.zxing.p350z.C9162b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.zxing.i */
/* compiled from: MultiFormatReader */
public final class C8979i implements C8984m {

    /* renamed from: a */
    private Map<C8974d, ?> f23479a;

    /* renamed from: b */
    private C8984m[] f23480b;

    /* renamed from: c */
    private C8985n m41959c(C8969c cVar) throws NotFoundException {
        C8984m[] mVarArr = this.f23480b;
        if (mVarArr != null) {
            int length = mVarArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return mVarArr[i].mo32671a(cVar, this.f23479a);
                } catch (ReaderException unused) {
                    i++;
                }
            }
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    public C8985n mo32670a(C8969c cVar) throws NotFoundException {
        mo32814a(null);
        return m41959c(cVar);
    }

    /* renamed from: b */
    public C8985n mo32815b(C8969c cVar) throws NotFoundException {
        if (this.f23480b == null) {
            mo32814a(null);
        }
        return m41959c(cVar);
    }

    public void reset() {
        C8984m[] mVarArr = this.f23480b;
        if (mVarArr != null) {
            for (C8984m reset : mVarArr) {
                reset.reset();
            }
        }
    }

    /* renamed from: a */
    public C8985n mo32671a(C8969c cVar, Map<C8974d, ?> map) throws NotFoundException {
        mo32814a(map);
        return m41959c(cVar);
    }

    /* renamed from: a */
    public void mo32814a(Map<C8974d, ?> map) {
        Collection collection;
        this.f23479a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(C8974d.TRY_HARDER);
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(C8974d.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(C8929a.UPC_A) && !collection.contains(C8929a.UPC_E) && !collection.contains(C8929a.EAN_13) && !collection.contains(C8929a.EAN_8) && !collection.contains(C8929a.CODABAR) && !collection.contains(C8929a.CODE_39) && !collection.contains(C8929a.CODE_93) && !collection.contains(C8929a.CODE_128) && !collection.contains(C8929a.ITF) && !collection.contains(C8929a.RSS_14) && !collection.contains(C8929a.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new C9150p(map));
            }
            if (collection.contains(C8929a.QR_CODE)) {
                arrayList.add(new C8930a());
            }
            if (collection.contains(C8929a.DATA_MATRIX)) {
                arrayList.add(new C9058a());
            }
            if (collection.contains(C8929a.AZTEC)) {
                arrayList.add(new C8991b());
            }
            if (collection.contains(C8929a.PDF_417)) {
                arrayList.add(new C9162b());
            }
            if (collection.contains(C8929a.MAXICODE)) {
                arrayList.add(new C9088a());
            }
            if (z && z2) {
                arrayList.add(new C9150p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new C9150p(map));
            }
            arrayList.add(new C8930a());
            arrayList.add(new C9058a());
            arrayList.add(new C8991b());
            arrayList.add(new C9162b());
            arrayList.add(new C9088a());
            if (z2) {
                arrayList.add(new C9150p(map));
            }
        }
        this.f23480b = (C8984m[]) arrayList.toArray(new C8984m[arrayList.size()]);
    }
}
