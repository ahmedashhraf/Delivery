package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.C8974d;
import com.google.zxing.C8985n;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.p335u.C9043a;
import com.google.zxing.p346y.p347c0.C9111e;
import com.google.zxing.p346y.p347c0.p348g.C9116d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.zxing.y.p */
/* compiled from: MultiFormatOneDReader */
public final class C9150p extends C9152r {

    /* renamed from: a */
    private final C9152r[] f24008a;

    public C9150p(Map<C8974d, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(C8974d.POSSIBLE_FORMATS);
        }
        boolean z = (map == null || map.get(C8974d.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C8929a.EAN_13) || collection.contains(C8929a.UPC_A) || collection.contains(C8929a.EAN_8) || collection.contains(C8929a.UPC_E)) {
                arrayList.add(new C9151q(map));
            }
            if (collection.contains(C8929a.CODE_39)) {
                arrayList.add(new C9139e(z));
            }
            if (collection.contains(C8929a.CODE_93)) {
                arrayList.add(new C9141g());
            }
            if (collection.contains(C8929a.CODE_128)) {
                arrayList.add(new C9106c());
            }
            if (collection.contains(C8929a.ITF)) {
                arrayList.add(new C9148n());
            }
            if (collection.contains(C8929a.CODABAR)) {
                arrayList.add(new C9102a());
            }
            if (collection.contains(C8929a.RSS_14)) {
                arrayList.add(new C9111e());
            }
            if (collection.contains(C8929a.RSS_EXPANDED)) {
                arrayList.add(new C9116d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C9151q(map));
            arrayList.add(new C9139e());
            arrayList.add(new C9102a());
            arrayList.add(new C9141g());
            arrayList.add(new C9106c());
            arrayList.add(new C9148n());
            arrayList.add(new C9111e());
            arrayList.add(new C9116d());
        }
        this.f24008a = (C9152r[]) arrayList.toArray(new C9152r[arrayList.size()]);
    }

    /* renamed from: a */
    public C8985n mo33114a(int i, C9043a aVar, Map<C8974d, ?> map) throws NotFoundException {
        C9152r[] rVarArr = this.f24008a;
        int i2 = 0;
        while (i2 < rVarArr.length) {
            try {
                return rVarArr[i2].mo33114a(i, aVar, map);
            } catch (ReaderException unused) {
                i2++;
            }
        }
        throw NotFoundException.m41712a();
    }

    public void reset() {
        for (C9152r reset : this.f24008a) {
            reset.reset();
        }
    }
}
