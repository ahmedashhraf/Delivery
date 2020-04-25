package com.google.zxing.p337v;

import com.google.zxing.C8929a;
import com.google.zxing.C8975e;
import com.google.zxing.C8976f;
import com.google.zxing.C8989r;
import com.google.zxing.p325a0.p328e.C8962b;
import com.google.zxing.p335u.C9044b;
import com.google.zxing.p337v.p340e.C9078e;
import com.google.zxing.p337v.p340e.C9082i;
import com.google.zxing.p337v.p340e.C9083j;
import com.google.zxing.p337v.p340e.C9084k;
import com.google.zxing.p337v.p340e.C9085l;
import java.util.Map;

/* renamed from: com.google.zxing.v.b */
/* compiled from: DataMatrixWriter */
public final class C9059b implements C8989r {
    /* renamed from: a */
    public C9044b mo32673a(String str, C8929a aVar, int i, int i2) {
        return mo32674a(str, aVar, i, i2, null);
    }

    /* renamed from: a */
    public C9044b mo32674a(String str, C8929a aVar, int i, int i2, Map<C8976f, ?> map) {
        C8975e eVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != C8929a.DATA_MATRIX) {
            StringBuilder sb = new StringBuilder("Can only encode DATA_MATRIX, but got ");
            sb.append(aVar);
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb2 = new StringBuilder("Requested dimensions are too small: ");
            sb2.append(i);
            sb2.append('x');
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            C9085l lVar = C9085l.FORCE_NONE;
            C8975e eVar2 = null;
            if (map != null) {
                C9085l lVar2 = (C9085l) map.get(C8976f.DATA_MATRIX_SHAPE);
                if (lVar2 != null) {
                    lVar = lVar2;
                }
                eVar = (C8975e) map.get(C8976f.MIN_SIZE);
                if (eVar == null) {
                    eVar = null;
                }
                C8975e eVar3 = (C8975e) map.get(C8976f.MAX_SIZE);
                if (eVar3 != null) {
                    eVar2 = eVar3;
                }
            } else {
                eVar = null;
            }
            String a = C9083j.m42501a(str, lVar, eVar, eVar2);
            C9084k a2 = C9084k.m42512a(a.length(), lVar, eVar, eVar2, true);
            C9078e eVar4 = new C9078e(C9082i.m42494a(a, a2), a2.mo33099f(), a2.mo33098e());
            eVar4.mo33074d();
            return m42384a(eVar4, a2);
        }
    }

    /* renamed from: a */
    private static C9044b m42384a(C9078e eVar, C9084k kVar) {
        int f = kVar.mo33099f();
        int e = kVar.mo33098e();
        C8962b bVar = new C8962b(kVar.mo33101h(), kVar.mo33100g());
        int i = 0;
        for (int i2 = 0; i2 < e; i2++) {
            if (i2 % kVar.f23797e == 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < kVar.mo33101h(); i4++) {
                    bVar.mo32742a(i3, i, i4 % 2 == 0);
                    i3++;
                }
                i++;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < f; i6++) {
                if (i6 % kVar.f23796d == 0) {
                    bVar.mo32742a(i5, i, true);
                    i5++;
                }
                bVar.mo32742a(i5, i, eVar.mo33070a(i6, i2));
                i5++;
                int i7 = kVar.f23796d;
                if (i6 % i7 == i7 - 1) {
                    bVar.mo32742a(i5, i, i2 % 2 == 0);
                    i5++;
                }
            }
            i++;
            int i8 = kVar.f23797e;
            if (i2 % i8 == i8 - 1) {
                int i9 = 0;
                for (int i10 = 0; i10 < kVar.mo33101h(); i10++) {
                    bVar.mo32742a(i9, i, true);
                    i9++;
                }
                i++;
            }
        }
        return m42383a(bVar);
    }

    /* renamed from: a */
    private static C9044b m42383a(C8962b bVar) {
        int c = bVar.mo32745c();
        int b = bVar.mo32744b();
        C9044b bVar2 = new C9044b(c, b);
        bVar2.mo32993b();
        for (int i = 0; i < c; i++) {
            for (int i2 = 0; i2 < b; i2++) {
                if (bVar.mo32738a(i, i2) == 1) {
                    bVar2.mo32996c(i, i2);
                }
            }
        }
        return bVar2;
    }
}
