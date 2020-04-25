package com.google.zxing.p343x.p344d.p345b;

import com.google.zxing.C8974d;
import com.google.zxing.C8987p;
import com.google.zxing.C8988q;
import com.google.zxing.NotFoundException;
import com.google.zxing.p325a0.p327d.C8955d;
import com.google.zxing.p325a0.p327d.C8956e;
import com.google.zxing.p325a0.p327d.C8960f;
import com.google.zxing.p335u.C9044b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.zxing.x.d.b.b */
/* compiled from: MultiFinderPatternFinder */
final class C9099b extends C8956e {

    /* renamed from: i */
    private static final C8960f[] f23835i = new C8960f[0];

    /* renamed from: j */
    private static final float f23836j = 180.0f;

    /* renamed from: k */
    private static final float f23837k = 9.0f;

    /* renamed from: l */
    private static final float f23838l = 0.05f;

    /* renamed from: m */
    private static final float f23839m = 0.5f;

    /* renamed from: com.google.zxing.x.d.b.b$b */
    /* compiled from: MultiFinderPatternFinder */
    private static final class C9101b implements Serializable, Comparator<C8955d> {
        private C9101b() {
        }

        /* renamed from: a */
        public int compare(C8955d dVar, C8955d dVar2) {
            double d = (double) (dVar2.mo32724d() - dVar.mo32724d());
            if (d < 0.0d) {
                return -1;
            }
            return d > 0.0d ? 1 : 0;
        }
    }

    C9099b(C9044b bVar) {
        super(bVar);
    }

    /* renamed from: c */
    private C8955d[][] m42565c() throws NotFoundException {
        List b = mo32728b();
        int size = b.size();
        int i = 3;
        if (size >= 3) {
            char c = 0;
            if (size == 3) {
                return new C8955d[][]{new C8955d[]{(C8955d) b.get(0), (C8955d) b.get(1), (C8955d) b.get(2)}};
            }
            Collections.sort(b, new C9101b());
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < size - 2) {
                C8955d dVar = (C8955d) b.get(i2);
                if (dVar != null) {
                    int i3 = i2 + 1;
                    while (i3 < size - 1) {
                        C8955d dVar2 = (C8955d) b.get(i3);
                        if (dVar2 != null) {
                            float d = (dVar.mo32724d() - dVar2.mo32724d()) / Math.min(dVar.mo32724d(), dVar2.mo32724d());
                            float abs = Math.abs(dVar.mo32724d() - dVar2.mo32724d());
                            float f = f23838l;
                            float f2 = 0.5f;
                            if (abs > 0.5f && d >= f23838l) {
                                break;
                            }
                            int i4 = i3 + 1;
                            while (i4 < size) {
                                C8955d dVar3 = (C8955d) b.get(i4);
                                if (dVar3 != null) {
                                    float d2 = (dVar2.mo32724d() - dVar3.mo32724d()) / Math.min(dVar2.mo32724d(), dVar3.mo32724d());
                                    if (Math.abs(dVar2.mo32724d() - dVar3.mo32724d()) > f2 && d2 >= f) {
                                        break;
                                    }
                                    C8955d[] dVarArr = new C8955d[i];
                                    dVarArr[c] = dVar;
                                    dVarArr[1] = dVar2;
                                    dVarArr[2] = dVar3;
                                    C8987p.m41992a(dVarArr);
                                    C8960f fVar = new C8960f(dVarArr);
                                    float a = C8987p.m41990a(fVar.mo32734b(), fVar.mo32733a());
                                    float a2 = C8987p.m41990a(fVar.mo32735c(), fVar.mo32733a());
                                    float a3 = C8987p.m41990a(fVar.mo32734b(), fVar.mo32735c());
                                    float d3 = (a + a3) / (dVar.mo32724d() * 2.0f);
                                    if (d3 <= 180.0f && d3 >= f23837k && Math.abs((a - a3) / Math.min(a, a3)) < 0.1f) {
                                        float sqrt = (float) Math.sqrt((double) ((a * a) + (a3 * a3)));
                                        if (Math.abs((a2 - sqrt) / Math.min(a2, sqrt)) < 0.1f) {
                                            arrayList.add(dVarArr);
                                        }
                                    }
                                }
                                i4++;
                                i = 3;
                                c = 0;
                                f = f23838l;
                                f2 = 0.5f;
                            }
                        }
                        i3++;
                        i = 3;
                        c = 0;
                    }
                }
                i2++;
                i = 3;
                c = 0;
            }
            if (!arrayList.isEmpty()) {
                return (C8955d[][]) arrayList.toArray(new C8955d[arrayList.size()][]);
            }
            throw NotFoundException.m41712a();
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: b */
    public C8960f[] mo33111b(Map<C8974d, ?> map) throws NotFoundException {
        boolean z = map != null && map.containsKey(C8974d.TRY_HARDER);
        boolean z2 = map != null && map.containsKey(C8974d.PURE_BARCODE);
        C9044b a = mo32726a();
        int e = a.mo33001e();
        int h = a.mo33005h();
        int i = (int) ((((float) e) / 228.0f) * 3.0f);
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        for (int i2 = i - 1; i2 < e; i2 += i) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < h; i4++) {
                if (a.mo32995b(i4, i2)) {
                    if ((i3 & 1) == 1) {
                        i3++;
                    }
                    iArr[i3] = iArr[i3] + 1;
                } else if ((i3 & 1) != 0) {
                    iArr[i3] = iArr[i3] + 1;
                } else if (i3 != 4) {
                    i3++;
                    iArr[i3] = iArr[i3] + 1;
                } else if (!C8956e.m41809a(iArr) || !mo32727a(iArr, i2, i4, z2)) {
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = iArr[4];
                    iArr[3] = 1;
                    iArr[4] = 0;
                    i3 = 3;
                } else {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    iArr[3] = 0;
                    iArr[4] = 0;
                    i3 = 0;
                }
            }
            if (C8956e.m41809a(iArr)) {
                mo32727a(iArr, i2, h, z2);
            }
        }
        C8955d[][] c = m42565c();
        ArrayList arrayList = new ArrayList();
        for (C8955d[] dVarArr : c) {
            C8987p.m41992a(dVarArr);
            arrayList.add(new C8960f(dVarArr));
        }
        if (arrayList.isEmpty()) {
            return f23835i;
        }
        return (C8960f[]) arrayList.toArray(new C8960f[arrayList.size()]);
    }

    C9099b(C9044b bVar, C8988q qVar) {
        super(bVar, qVar);
    }
}
