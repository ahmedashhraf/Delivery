package com.google.zxing.p346y.p347c0.p348g;

import com.google.zxing.p335u.C9043a;
import java.util.List;

/* renamed from: com.google.zxing.y.c0.g.a */
/* compiled from: BitArrayBuilder */
final class C9113a {
    private C9113a() {
    }

    /* renamed from: a */
    static C9043a m42617a(List<C9114b> list) {
        int size = (list.size() << 1) - 1;
        if (((C9114b) list.get(list.size() - 1)).mo33141c() == null) {
            size--;
        }
        C9043a aVar = new C9043a(size * 12);
        int b = ((C9114b) list.get(0)).mo33141c().mo33127b();
        int i = 0;
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b) != 0) {
                aVar.mo32982e(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C9114b bVar = (C9114b) list.get(i3);
            int b2 = bVar.mo33140b().mo33127b();
            int i4 = i;
            for (int i5 = 11; i5 >= 0; i5--) {
                if (((1 << i5) & b2) != 0) {
                    aVar.mo32982e(i4);
                }
                i4++;
            }
            if (bVar.mo33141c() != null) {
                int b3 = bVar.mo33141c().mo33127b();
                for (int i6 = 11; i6 >= 0; i6--) {
                    if (((1 << i6) & b3) != 0) {
                        aVar.mo32982e(i4);
                    }
                    i4++;
                }
            }
            i = i4;
        }
        return aVar;
    }
}
