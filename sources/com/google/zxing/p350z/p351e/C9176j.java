package com.google.zxing.p350z.p351e;

import com.google.zxing.C8987p;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9044b;
import com.google.zxing.p335u.C9047e;
import com.google.zxing.p335u.p336m.C9055a;
import com.google.zxing.p350z.C9161a;
import com.google.zxing.p350z.p351e.p352k.C9177a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Formatter;

/* renamed from: com.google.zxing.z.e.j */
/* compiled from: PDF417ScanningDecoder */
public final class C9176j {

    /* renamed from: a */
    private static final int f24102a = 2;

    /* renamed from: b */
    private static final int f24103b = 3;

    /* renamed from: c */
    private static final int f24104c = 512;

    /* renamed from: d */
    private static final C9177a f24105d = new C9177a();

    private C9176j() {
    }

    /* renamed from: a */
    public static C9047e m42909a(C9044b bVar, C8987p pVar, C8987p pVar2, C8987p pVar3, C8987p pVar4, int i, int i2) throws NotFoundException, FormatException, ChecksumException {
        C9174h hVar;
        C9173g gVar;
        int i3;
        int i4;
        int i5;
        C9167c cVar = new C9167c(bVar, pVar, pVar2, pVar3, pVar4);
        C9174h hVar2 = null;
        C9172f fVar = null;
        C9174h hVar3 = null;
        C9167c cVar2 = cVar;
        int i6 = 0;
        while (true) {
            if (i6 >= 2) {
                hVar = hVar2;
                break;
            }
            if (pVar != null) {
                hVar2 = m42914a(bVar, cVar2, pVar, true, i, i2);
            }
            hVar = hVar2;
            if (pVar3 != null) {
                hVar3 = m42914a(bVar, cVar2, pVar3, false, i, i2);
            }
            fVar = m42925b(hVar, hVar3);
            if (fVar == null) {
                throw NotFoundException.m41712a();
            } else if (i6 != 0 || fVar.mo33240d() == null || (fVar.mo33240d().mo33220f() >= cVar2.mo33220f() && fVar.mo33240d().mo33218d() <= cVar2.mo33218d())) {
                fVar.mo33237a(cVar2);
            } else {
                cVar2 = fVar.mo33240d();
                i6++;
                hVar2 = hVar;
            }
        }
        int a = fVar.mo33234a() + 1;
        fVar.mo33236a(0, (C9173g) hVar);
        fVar.mo33236a(a, (C9173g) hVar3);
        boolean z = hVar != null;
        int i7 = i;
        int i8 = i2;
        int i9 = 1;
        while (i9 <= a) {
            int i10 = z ? i9 : a - i9;
            if (fVar.mo33235a(i10) == null) {
                if (i10 == 0 || i10 == a) {
                    gVar = new C9174h(cVar2, i10 == 0);
                } else {
                    gVar = new C9173g(cVar2);
                }
                fVar.mo33236a(i10, gVar);
                int i11 = -1;
                int i12 = i8;
                int i13 = -1;
                int i14 = i7;
                int f = cVar2.mo33220f();
                while (f <= cVar2.mo33218d()) {
                    int a2 = m42905a(fVar, i10, f, z);
                    if (a2 >= 0 && a2 <= cVar2.mo33217c()) {
                        i5 = a2;
                    } else if (i13 != i11) {
                        i5 = i13;
                    } else {
                        i3 = i13;
                        i4 = i12;
                        i12 = i4;
                        i13 = i3;
                        f++;
                        i11 = -1;
                    }
                    i3 = i13;
                    int i15 = i12;
                    C9168d a3 = m42913a(bVar, cVar2.mo33219e(), cVar2.mo33217c(), z, i5, f, i14, i15);
                    if (a3 != null) {
                        gVar.mo33245a(f, a3);
                        i14 = Math.min(i14, a3.mo33230f());
                        i12 = Math.max(i15, a3.mo33230f());
                        i13 = i5;
                        f++;
                        i11 = -1;
                    } else {
                        i4 = i15;
                        i12 = i4;
                        i13 = i3;
                        f++;
                        i11 = -1;
                    }
                }
                i7 = i14;
                i8 = i12;
            }
            i9++;
        }
        return m42924b(fVar);
    }

    /* renamed from: a */
    private static boolean m42918a(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    /* renamed from: b */
    private static C9172f m42925b(C9174h hVar, C9174h hVar2) throws NotFoundException {
        if (hVar == null && hVar2 == null) {
            return null;
        }
        C9165a a = m42911a(hVar, hVar2);
        if (a == null) {
            return null;
        }
        return new C9172f(a, C9167c.m42840a(m42912a(hVar), m42912a(hVar2)));
    }

    /* renamed from: c */
    private static int m42927c(int i) {
        return 2 << i;
    }

    /* renamed from: b */
    private static int m42923b(int[] iArr) {
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    /* renamed from: b */
    private static C9047e m42924b(C9172f fVar) throws FormatException, ChecksumException, NotFoundException {
        C9166b[][] a = m42921a(fVar);
        m42916a(fVar, a);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(fVar.mo33239c() * fVar.mo33234a())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < fVar.mo33239c(); i++) {
            int i2 = 0;
            while (i2 < fVar.mo33234a()) {
                int i3 = i2 + 1;
                int[] a2 = a[i][i3].mo33212a();
                int a3 = (fVar.mo33234a() * i) + i2;
                if (a2.length == 0) {
                    arrayList.add(Integer.valueOf(a3));
                } else if (a2.length == 1) {
                    iArr[a3] = a2[0];
                } else {
                    arrayList3.add(Integer.valueOf(a3));
                    arrayList2.add(a2);
                }
                i2 = i3;
            }
        }
        int[][] iArr2 = new int[arrayList2.size()][];
        for (int i4 = 0; i4 < iArr2.length; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m42908a(fVar.mo33238b(), iArr, C9161a.m42809a((Collection<Integer>) arrayList), C9161a.m42809a((Collection<Integer>) arrayList3), iArr2);
    }

    /* renamed from: a */
    private static C9167c m42912a(C9174h hVar) throws NotFoundException {
        if (hVar == null) {
            return null;
        }
        int[] d = hVar.mo33252d();
        if (d == null) {
            return null;
        }
        int b = m42923b(d);
        int i = 0;
        int i2 = 0;
        for (int i3 : d) {
            i2 += b - i3;
            if (i3 > 0) {
                break;
            }
        }
        C9168d[] b2 = hVar.mo33247b();
        int i4 = 0;
        while (i2 > 0 && b2[i4] == null) {
            i2--;
            i4++;
        }
        for (int length = d.length - 1; length >= 0; length--) {
            i += b - d[length];
            if (d[length] > 0) {
                break;
            }
        }
        int length2 = b2.length - 1;
        while (i > 0 && b2[length2] == null) {
            i--;
            length2--;
        }
        return hVar.mo33243a().mo33215a(i2, i, hVar.mo33253e());
    }

    /* renamed from: b */
    private static int[] m42926b(C9044b bVar, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
            } else if (i3 >= i2) {
                break;
            }
            if (i6 >= 8) {
                break;
            } else if (bVar.mo32995b(i3, i4) == z2) {
                iArr[i6] = iArr[i6] + 1;
                i3 += i5;
            } else {
                i6++;
                z2 = !z2;
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (!(i3 == i && i6 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    /* renamed from: b */
    private static int m42922b(int i) {
        return m42906a(m42920a(i));
    }

    /* renamed from: a */
    private static C9165a m42911a(C9174h hVar, C9174h hVar2) {
        if (hVar != null) {
            C9165a c = hVar.mo33251c();
            if (c != null) {
                if (hVar2 != null) {
                    C9165a c2 = hVar2.mo33251c();
                    if (!(c2 == null || c.mo33206a() == c2.mo33206a() || c.mo33207b() == c2.mo33207b() || c.mo33208c() == c2.mo33208c())) {
                        return null;
                    }
                }
                return c;
            }
        }
        if (hVar2 == null) {
            return null;
        }
        return hVar2.mo33251c();
    }

    /* renamed from: a */
    private static C9174h m42914a(C9044b bVar, C9167c cVar, C8987p pVar, boolean z, int i, int i2) {
        boolean z2 = z;
        C9174h hVar = new C9174h(cVar, z2);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int a = (int) pVar.mo32830a();
            int b = (int) pVar.mo32831b();
            while (b <= cVar.mo33218d() && b >= cVar.mo33220f()) {
                C9168d a2 = m42913a(bVar, 0, bVar.mo33005h(), z, a, b, i, i2);
                if (a2 != null) {
                    hVar.mo33245a(b, a2);
                    if (z2) {
                        a = a2.mo33228d();
                    } else {
                        a = a2.mo33225b();
                    }
                }
                b += i4;
            }
            i3++;
        }
        return hVar;
    }

    /* renamed from: a */
    private static void m42916a(C9172f fVar, C9166b[][] bVarArr) throws NotFoundException {
        int[] a = bVarArr[0][1].mo33212a();
        int a2 = (fVar.mo33234a() * fVar.mo33239c()) - m42927c(fVar.mo33238b());
        if (a.length != 0) {
            if (a[0] != a2) {
                bVarArr[0][1].mo33213b(a2);
            }
        } else if (a2 <= 0 || a2 > 928) {
            throw NotFoundException.m41712a();
        } else {
            bVarArr[0][1].mo33213b(a2);
        }
    }

    /* renamed from: a */
    private static C9047e m42908a(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws FormatException, ChecksumException {
        int[] iArr5 = new int[iArr3.length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < iArr5.length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m42910a(iArr, i, iArr2);
                } catch (ChecksumException unused) {
                    if (iArr5.length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= iArr5.length) {
                                break;
                            } else if (iArr5[i5] < iArr4[i5].length - 1) {
                                iArr5[i5] = iArr5[i5] + 1;
                                break;
                            } else {
                                iArr5[i5] = 0;
                                if (i5 != iArr5.length - 1) {
                                    i5++;
                                } else {
                                    throw ChecksumException.m41708a();
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        throw ChecksumException.m41708a();
                    }
                }
            } else {
                throw ChecksumException.m41708a();
            }
        }
    }

    /* renamed from: a */
    private static C9166b[][] m42921a(C9172f fVar) {
        C9173g[] e;
        C9168d[] b;
        C9166b[][] bVarArr = (C9166b[][]) Array.newInstance(C9166b.class, new int[]{fVar.mo33239c(), fVar.mo33234a() + 2});
        for (int i = 0; i < bVarArr.length; i++) {
            for (int i2 = 0; i2 < bVarArr[i].length; i2++) {
                bVarArr[i][i2] = new C9166b();
            }
        }
        int i3 = 0;
        for (C9173g gVar : fVar.mo33241e()) {
            if (gVar != null) {
                for (C9168d dVar : gVar.mo33247b()) {
                    if (dVar != null) {
                        int c = dVar.mo33227c();
                        if (c >= 0 && c < bVarArr.length) {
                            bVarArr[c][i3].mo33213b(dVar.mo33229e());
                        }
                    }
                }
            }
            i3++;
        }
        return bVarArr;
    }

    /* renamed from: a */
    private static boolean m42919a(C9172f fVar, int i) {
        return i >= 0 && i <= fVar.mo33234a() + 1;
    }

    /* renamed from: a */
    private static int m42905a(C9172f fVar, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        C9168d dVar = null;
        int i4 = i - i3;
        if (m42919a(fVar, i4)) {
            dVar = fVar.mo33235a(i4).mo33244a(i2);
        }
        if (dVar != null) {
            return z ? dVar.mo33225b() : dVar.mo33228d();
        }
        C9168d b = fVar.mo33235a(i).mo33246b(i2);
        if (b != null) {
            return z ? b.mo33228d() : b.mo33225b();
        }
        if (m42919a(fVar, i4)) {
            b = fVar.mo33235a(i4).mo33246b(i2);
        }
        if (b != null) {
            return z ? b.mo33225b() : b.mo33228d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (m42919a(fVar, i)) {
                C9168d[] b2 = fVar.mo33235a(i).mo33247b();
                int length = b2.length;
                for (int i6 = 0; i6 < length; i6++) {
                    C9168d dVar2 = b2[i6];
                    if (dVar2 != null) {
                        return (z ? dVar2.mo33225b() : dVar2.mo33228d()) + (i3 * i5 * (dVar2.mo33225b() - dVar2.mo33228d()));
                    }
                }
                i5++;
            } else {
                C9167c d = fVar.mo33240d();
                return z ? d.mo33219e() : d.mo33217c();
            }
        }
    }

    /* renamed from: a */
    private static C9168d m42913a(C9044b bVar, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int a = m42904a(bVar, i, i2, z, i3, i4);
        int[] b = m42926b(bVar, i, i2, z, a, i4);
        if (b == null) {
            return null;
        }
        int a2 = C9055a.m42371a(b);
        if (z) {
            int i8 = a;
            a += a2;
            i7 = i8;
        } else {
            for (int i9 = 0; i9 < b.length / 2; i9++) {
                int i10 = b[i9];
                b[i9] = b[(b.length - 1) - i9];
                b[(b.length - 1) - i9] = i10;
            }
            i7 = a - a2;
        }
        if (!m42918a(a2, i5, i6)) {
            return null;
        }
        int d = C9175i.m42902d(b);
        int a3 = C9161a.m42807a(d);
        if (a3 == -1) {
            return null;
        }
        return new C9168d(i7, a, m42922b(d), a3);
    }

    /* renamed from: a */
    private static int m42904a(C9044b bVar, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        boolean z2 = z;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z2) {
                    if (i6 >= i2) {
                        continue;
                        break;
                    }
                } else if (i6 < i) {
                    continue;
                    break;
                }
                if (z2 != bVar.mo32995b(i6, i4)) {
                    continue;
                    break;
                } else if (Math.abs(i3 - i6) > 2) {
                    return i3;
                } else {
                    i6 += i5;
                }
            }
            i5 = -i5;
            z2 = !z2;
        }
        return i6;
    }

    /* renamed from: a */
    private static C9047e m42910a(int[] iArr, int i, int[] iArr2) throws FormatException, ChecksumException {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int a = m42907a(iArr, iArr2, i2);
            m42917a(iArr, i2);
            C9047e a2 = C9169e.m42865a(iArr, String.valueOf(i));
            a2.mo33019b(Integer.valueOf(a));
            a2.mo33016a(Integer.valueOf(iArr2.length));
            return a2;
        }
        throw FormatException.m41710a();
    }

    /* renamed from: a */
    private static int m42907a(int[] iArr, int[] iArr2, int i) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f24105d.mo33254a(iArr, i, iArr2);
        }
        throw ChecksumException.m41708a();
    }

    /* renamed from: a */
    private static void m42917a(int[] iArr, int i) throws FormatException {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw FormatException.m41710a();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw FormatException.m41710a();
            }
        } else {
            throw FormatException.m41710a();
        }
    }

    /* renamed from: a */
    private static int[] m42920a(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: a */
    private static int m42906a(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: a */
    public static String m42915a(C9166b[][] bVarArr) {
        Formatter formatter = new Formatter();
        for (int i = 0; i < bVarArr.length; i++) {
            formatter.format("Row %2d: ", new Object[]{Integer.valueOf(i)});
            for (C9166b bVar : bVarArr[i]) {
                if (bVar.mo33212a().length == 0) {
                    formatter.format("        ", null);
                } else {
                    formatter.format("%4d(%2d)", new Object[]{Integer.valueOf(bVar.mo33212a()[0]), bVar.mo33211a(bVar.mo33212a()[0])});
                }
            }
            formatter.format("%n", new Object[0]);
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
