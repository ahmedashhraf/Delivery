package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;

/* renamed from: com.google.zxing.y.k */
/* compiled from: EAN8Reader */
public final class C9145k extends C9159y {

    /* renamed from: k */
    private final int[] f23993k = new int[4];

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo33115a(C9043a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f23993k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d = aVar.mo32979d();
        int i = iArr[1];
        int i2 = 0;
        while (i2 < 4 && i < d) {
            sb.append((char) (C9159y.m42795a(aVar, iArr2, i, C9159y.f24025i) + 48));
            int i3 = i;
            for (int i4 : iArr2) {
                i3 += i4;
            }
            i2++;
            i = i3;
        }
        int i5 = C9159y.m42798a(aVar, i, true, C9159y.f24023g)[1];
        int i6 = 0;
        while (i6 < 4 && i5 < d) {
            sb.append((char) (C9159y.m42795a(aVar, iArr2, i5, C9159y.f24025i) + 48));
            int i7 = i5;
            for (int i8 : iArr2) {
                i7 += i8;
            }
            i6++;
            i5 = i7;
        }
        return i5;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8929a mo33116a() {
        return C8929a.EAN_8;
    }
}
