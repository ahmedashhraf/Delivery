package com.google.zxing.p350z.p353f;

import com.google.zxing.C8969c;
import com.google.zxing.C8974d;
import com.google.zxing.C8987p;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9044b;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.zxing.z.f.a */
/* compiled from: Detector */
public final class C9180a {

    /* renamed from: a */
    private static final int[] f24115a = {0, 4, 1, 5};

    /* renamed from: b */
    private static final int[] f24116b = {6, 2, 7, 3};

    /* renamed from: c */
    private static final float f24117c = 0.42f;

    /* renamed from: d */
    private static final float f24118d = 0.8f;

    /* renamed from: e */
    private static final int[] f24119e = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: f */
    private static final int[] f24120f = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: g */
    private static final int f24121g = 3;

    /* renamed from: h */
    private static final int f24122h = 5;

    /* renamed from: i */
    private static final int f24123i = 25;

    /* renamed from: j */
    private static final int f24124j = 5;

    /* renamed from: k */
    private static final int f24125k = 10;

    private C9180a() {
    }

    /* renamed from: a */
    public static C9181b m42954a(C8969c cVar, Map<C8974d, ?> map, boolean z) throws NotFoundException {
        C9044b a = cVar.mo32766a();
        List a2 = m42955a(z, a);
        if (a2.isEmpty()) {
            a = a.clone();
            a.mo33007i();
            a2 = m42955a(z, a);
        }
        return new C9181b(a, a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r4.hasNext() == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r5 = (com.google.zxing.C8987p[]) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r5[1] == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r3 = (int) java.lang.Math.max((float) r3, r5[1].mo32831b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r5[3] == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r3 = java.lang.Math.max(r3, (int) r5[3].mo32831b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r4 = r0.iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.google.zxing.C8987p[]> m42955a(boolean r8, com.google.zxing.p335u.C9044b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
        L_0x0008:
            r4 = 0
            r5 = 0
        L_0x000a:
            int r6 = r9.mo33001e()
            if (r3 >= r6) goto L_0x007c
            com.google.zxing.p[] r4 = m42958a(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L_0x0052
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L_0x0052
            if (r5 == 0) goto L_0x007c
            java.util.Iterator r4 = r0.iterator()
        L_0x0023:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            com.google.zxing.p[] r5 = (com.google.zxing.C8987p[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L_0x003f
            float r3 = (float) r3
            r7 = r5[r1]
            float r7 = r7.mo32831b()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L_0x003f:
            r7 = r5[r6]
            if (r7 == 0) goto L_0x0023
            r5 = r5[r6]
            float r5 = r5.mo32831b()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x0023
        L_0x004f:
            int r3 = r3 + 5
            goto L_0x0008
        L_0x0052:
            r0.add(r4)
            if (r8 == 0) goto L_0x007c
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L_0x006a
            r5 = r4[r3]
            float r5 = r5.mo32830a()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.mo32831b()
            goto L_0x0078
        L_0x006a:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.mo32830a()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.mo32831b()
        L_0x0078:
            int r3 = (int) r3
            r4 = r5
            r5 = 1
            goto L_0x000a
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p350z.p353f.C9180a.m42955a(boolean, com.google.zxing.u.b):java.util.List");
    }

    /* renamed from: a */
    private static C8987p[] m42958a(C9044b bVar, int i, int i2) {
        int e = bVar.mo33001e();
        int h = bVar.mo33005h();
        C8987p[] pVarArr = new C8987p[8];
        m42956a(pVarArr, m42959a(bVar, e, h, i, i2, f24119e), f24115a);
        if (pVarArr[4] != null) {
            i2 = (int) pVarArr[4].mo32830a();
            i = (int) pVarArr[4].mo32831b();
        }
        m42956a(pVarArr, m42959a(bVar, e, h, i, i2, f24120f), f24116b);
        return pVarArr;
    }

    /* renamed from: a */
    private static void m42956a(C8987p[] pVarArr, C8987p[] pVarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            pVarArr[iArr[i]] = pVarArr2[i];
        }
    }

    /* renamed from: a */
    private static C8987p[] m42959a(C9044b bVar, int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        boolean z;
        int i6;
        int i7;
        int[] iArr2;
        int i8 = i;
        C8987p[] pVarArr = new C8987p[4];
        int[] iArr3 = new int[iArr.length];
        int i9 = i3;
        while (true) {
            if (i9 >= i8) {
                z = false;
                break;
            }
            int[] a = m42957a(bVar, i4, i9, i2, false, iArr, iArr3);
            if (a != null) {
                while (true) {
                    iArr2 = a;
                    if (i9 <= 0) {
                        break;
                    }
                    i9--;
                    a = m42957a(bVar, i4, i9, i2, false, iArr, iArr3);
                    if (a == null) {
                        i9++;
                        break;
                    }
                }
                float f = (float) i9;
                pVarArr[0] = new C8987p((float) iArr2[0], f);
                pVarArr[1] = new C8987p((float) iArr2[1], f);
                z = true;
            } else {
                i9 += 5;
            }
        }
        int i10 = i9 + 1;
        if (z) {
            int[] iArr4 = {(int) pVarArr[0].mo32830a(), (int) pVarArr[1].mo32830a()};
            int i11 = i10;
            int i12 = 0;
            while (true) {
                if (i11 >= i8) {
                    i6 = i12;
                    i7 = i11;
                    break;
                }
                i6 = i12;
                i7 = i11;
                int[] a2 = m42957a(bVar, iArr4[0], i11, i2, false, iArr, iArr3);
                if (a2 == null || Math.abs(iArr4[0] - a2[0]) >= 5 || Math.abs(iArr4[1] - a2[1]) >= 5) {
                    if (i6 > 25) {
                        break;
                    }
                    i12 = i6 + 1;
                } else {
                    iArr4 = a2;
                    i12 = 0;
                }
                i11 = i7 + 1;
            }
            i10 = i7 - (i6 + 1);
            float f2 = (float) i10;
            pVarArr[2] = new C8987p((float) iArr4[0], f2);
            pVarArr[3] = new C8987p((float) iArr4[1], f2);
        }
        if (i10 - i9 < 10) {
            for (i5 = 0; i5 < 4; i5++) {
                pVarArr[i5] = null;
            }
        }
        return pVarArr;
    }

    /* renamed from: a */
    private static int[] m42957a(C9044b bVar, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (bVar.mo32995b(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        int i6 = i;
        boolean z2 = z;
        int i7 = 0;
        while (i < i3) {
            if (bVar.mo32995b(i, i2) ^ z2) {
                iArr2[i7] = iArr2[i7] + 1;
            } else {
                int i8 = length - 1;
                if (i7 != i8) {
                    i7++;
                } else if (m42953a(iArr2, iArr, (float) f24118d) < f24117c) {
                    return new int[]{i6, i};
                } else {
                    i6 += iArr2[0] + iArr2[1];
                    int i9 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i9);
                    iArr2[i9] = 0;
                    iArr2[i8] = 0;
                    i7--;
                }
                iArr2[i7] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i7 != length - 1 || m42953a(iArr2, iArr, (float) f24118d) >= f24117c) {
            return null;
        }
        return new int[]{i6, i - 1};
    }

    /* renamed from: a */
    private static float m42953a(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) iArr[i4];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
