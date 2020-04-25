package com.google.zxing.p335u;

import com.google.zxing.NotFoundException;

/* renamed from: com.google.zxing.u.f */
/* compiled from: DefaultGridSampler */
public final class C9048f extends C9051i {
    /* renamed from: a */
    public C9044b mo33029a(C9044b bVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException {
        C9044b bVar2 = bVar;
        int i3 = i;
        int i4 = i2;
        return mo33030a(bVar, i, i2, C9053k.m42361a(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    /* renamed from: a */
    public C9044b mo33030a(C9044b bVar, int i, int i2, C9053k kVar) throws NotFoundException {
        if (i <= 0 || i2 <= 0) {
            throw NotFoundException.m41712a();
        }
        C9044b bVar2 = new C9044b(i, i2);
        float[] fArr = new float[(i * 2)];
        for (int i3 = 0; i3 < i2; i3++) {
            int length = fArr.length;
            float f = ((float) i3) + 0.5f;
            for (int i4 = 0; i4 < length; i4 += 2) {
                fArr[i4] = ((float) (i4 / 2)) + 0.5f;
                fArr[i4 + 1] = f;
            }
            kVar.mo33035a(fArr);
            C9051i.m42350a(bVar, fArr);
            int i5 = 0;
            while (i5 < length) {
                try {
                    if (bVar.mo32995b((int) fArr[i5], (int) fArr[i5 + 1])) {
                        bVar2.mo32996c(i5 / 2, i3);
                    }
                    i5 += 2;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw NotFoundException.m41712a();
                }
            }
        }
        return bVar2;
    }
}
