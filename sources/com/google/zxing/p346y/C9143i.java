package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;

/* renamed from: com.google.zxing.y.i */
/* compiled from: EAN13Reader */
public final class C9143i extends C9159y {

    /* renamed from: l */
    static final int[] f23990l = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: k */
    private final int[] f23991k = new int[4];

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo33115a(C9043a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f23991k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d = aVar.mo32979d();
        int i = iArr[1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 6 && i < d) {
            int a = C9159y.m42795a(aVar, iArr2, i, C9159y.f24026j);
            sb.append((char) ((a % 10) + 48));
            int i4 = i;
            for (int i5 : iArr2) {
                i4 += i5;
            }
            if (a >= 10) {
                i3 = (1 << (5 - i2)) | i3;
            }
            i2++;
            i = i4;
        }
        m42738a(sb, i3);
        int i6 = C9159y.m42798a(aVar, i, true, C9159y.f24023g)[1];
        int i7 = 0;
        while (i7 < 6 && i6 < d) {
            sb.append((char) (C9159y.m42795a(aVar, iArr2, i6, C9159y.f24025i) + 48));
            int i8 = i6;
            for (int i9 : iArr2) {
                i8 += i9;
            }
            i7++;
            i6 = i8;
        }
        return i6;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8929a mo33116a() {
        return C8929a.EAN_13;
    }

    /* renamed from: a */
    private static void m42738a(StringBuilder sb, int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f23990l[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw NotFoundException.m41712a();
    }
}
