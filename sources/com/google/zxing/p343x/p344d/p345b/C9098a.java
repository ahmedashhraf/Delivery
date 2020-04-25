package com.google.zxing.p343x.p344d.p345b;

import com.google.zxing.C8974d;
import com.google.zxing.C8988q;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.p325a0.p327d.C8954c;
import com.google.zxing.p325a0.p327d.C8960f;
import com.google.zxing.p335u.C9044b;
import com.google.zxing.p335u.C9049g;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.zxing.x.d.b.a */
/* compiled from: MultiDetector */
public final class C9098a extends C8954c {

    /* renamed from: c */
    private static final C9049g[] f23834c = new C9049g[0];

    public C9098a(C9044b bVar) {
        super(bVar);
    }

    /* renamed from: b */
    public C9049g[] mo33110b(Map<C8974d, ?> map) throws NotFoundException {
        C8988q qVar;
        C9044b b = mo32719b();
        if (map == null) {
            qVar = null;
        } else {
            qVar = (C8988q) map.get(C8974d.NEED_RESULT_POINT_CALLBACK);
        }
        C8960f[] b2 = new C9099b(b, qVar).mo33111b(map);
        if (b2.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (C8960f a : b2) {
                try {
                    arrayList.add(mo32717a(a));
                } catch (ReaderException unused) {
                }
            }
            if (arrayList.isEmpty()) {
                return f23834c;
            }
            return (C9049g[]) arrayList.toArray(new C9049g[arrayList.size()]);
        }
        throw NotFoundException.m41712a();
    }
}
