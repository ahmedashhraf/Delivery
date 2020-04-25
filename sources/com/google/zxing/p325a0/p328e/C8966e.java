package com.google.zxing.p325a0.p328e;

import com.google.zxing.WriterException;
import com.google.zxing.p325a0.p326c.C8945f;
import com.google.zxing.p325a0.p326c.C8949j;
import com.google.zxing.p335u.C9043a;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.a0.e.e */
/* compiled from: MatrixUtil */
final class C8966e {

    /* renamed from: a */
    private static final int[][] f23438a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f23439b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f23440c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, C13959t.f40823O1, -1}, new int[]{6, 26, 52, 78, 104, C13959t.f40839S1, -1}, new int[]{6, 30, 56, 82, 108, C13959t.f40855W1, -1}, new int[]{6, 34, 60, 86, 112, C13959t.f40872a2, -1}, new int[]{6, 30, 58, 86, 114, C13959t.f40892e2, -1}, new int[]{6, 34, 62, 90, 118, C13959t.f40912i2, -1}, new int[]{6, 30, 54, 78, 102, C13959t.f40823O1, C13959t.f40929m2}, new int[]{6, 24, 50, 76, 102, 128, C13959t.f40945q2}, new int[]{6, 28, 54, 80, 106, C13959t.f40847U1, C13959t.f40961u2}, new int[]{6, 32, 58, 84, 110, C13959t.f40863Y1, C13959t.f40977y2}, new int[]{6, 26, 54, 82, 110, C13959t.f40872a2, C13959t.f40776C2}, new int[]{6, 30, 58, 86, 114, C13959t.f40892e2, C13959t.f40792G2}};

    /* renamed from: d */
    private static final int[][] f23441d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: e */
    private static final int f23442e = 7973;

    /* renamed from: f */
    private static final int f23443f = 1335;

    /* renamed from: g */
    private static final int f23444g = 21522;

    private C8966e() {
    }

    /* renamed from: a */
    static void m41874a(C8962b bVar) {
        bVar.mo32739a(-1);
    }

    /* renamed from: b */
    private static void m41879b(C8962b bVar) throws WriterException {
        if (bVar.mo32738a(8, bVar.mo32744b() - 8) != 0) {
            bVar.mo32741a(8, bVar.mo32744b() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    /* renamed from: b */
    private static boolean m41880b(int i) {
        return i == -1;
    }

    /* renamed from: c */
    static void m41882c(C8949j jVar, C8962b bVar) throws WriterException {
        if (jVar.mo32703e() >= 7) {
            C9043a aVar = new C9043a();
            m41873a(jVar, aVar);
            int i = 0;
            int i2 = 17;
            while (i < 6) {
                int i3 = i2;
                for (int i4 = 0; i4 < 3; i4++) {
                    boolean b = aVar.mo32974b(i3);
                    i3--;
                    bVar.mo32742a(i, (bVar.mo32744b() - 11) + i4, b);
                    bVar.mo32742a((bVar.mo32744b() - 11) + i4, i, b);
                }
                i++;
                i2 = i3;
            }
        }
    }

    /* renamed from: d */
    private static void m41885d(C8962b bVar) {
        int i = 8;
        while (i < bVar.mo32745c() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m41880b((int) bVar.mo32738a(i, 6))) {
                bVar.mo32741a(i, 6, i3);
            }
            if (m41880b((int) bVar.mo32738a(6, i))) {
                bVar.mo32741a(6, i, i3);
            }
            i = i2;
        }
    }

    /* renamed from: a */
    static void m41876a(C9043a aVar, C8945f fVar, C8949j jVar, int i, C8962b bVar) throws WriterException {
        m41874a(bVar);
        m41872a(jVar, bVar);
        m41870a(fVar, i, bVar);
        m41882c(jVar, bVar);
        m41875a(aVar, i, bVar);
    }

    /* renamed from: b */
    private static void m41877b(int i, int i2, C8962b bVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 5; i4++) {
                bVar.mo32741a(i + i4, i2 + i3, f23439b[i3][i4]);
            }
        }
    }

    /* renamed from: b */
    private static void m41878b(C8949j jVar, C8962b bVar) {
        if (jVar.mo32703e() >= 2) {
            int e = jVar.mo32703e() - 1;
            int[][] iArr = f23440c;
            int[] iArr2 = iArr[e];
            int length = iArr[e].length;
            for (int i = 0; i < length; i++) {
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = iArr2[i];
                    int i4 = iArr2[i2];
                    if (!(i4 == -1 || i3 == -1 || !m41880b((int) bVar.mo32738a(i4, i3)))) {
                        m41877b(i4 - 2, i3 - 2, bVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static void m41872a(C8949j jVar, C8962b bVar) throws WriterException {
        m41883c(bVar);
        m41879b(bVar);
        m41878b(jVar, bVar);
        m41885d(bVar);
    }

    /* renamed from: c */
    private static void m41881c(int i, int i2, C8962b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.mo32741a(i + i4, i2 + i3, f23438a[i3][i4]);
            }
        }
    }

    /* renamed from: d */
    private static void m41884d(int i, int i2, C8962b bVar) throws WriterException {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (m41880b((int) bVar.mo32738a(i, i4))) {
                bVar.mo32741a(i, i4, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: c */
    private static void m41883c(C8962b bVar) throws WriterException {
        int length = f23438a[0].length;
        m41881c(0, 0, bVar);
        m41881c(bVar.mo32745c() - length, 0, bVar);
        m41881c(0, bVar.mo32745c() - length, bVar);
        m41869a(0, 7, bVar);
        m41869a(bVar.mo32745c() - 8, 7, bVar);
        m41869a(0, bVar.mo32745c() - 8, bVar);
        m41884d(7, 0, bVar);
        m41884d((bVar.mo32744b() - 7) - 1, 0, bVar);
        m41884d(7, bVar.mo32744b() - 7, bVar);
    }

    /* renamed from: a */
    static void m41870a(C8945f fVar, int i, C8962b bVar) throws WriterException {
        C9043a aVar = new C9043a();
        m41871a(fVar, i, aVar);
        for (int i2 = 0; i2 < aVar.mo32979d(); i2++) {
            boolean b = aVar.mo32974b((aVar.mo32979d() - 1) - i2);
            int[][] iArr = f23441d;
            bVar.mo32742a(iArr[i2][0], iArr[i2][1], b);
            if (i2 < 8) {
                bVar.mo32742a((bVar.mo32745c() - i2) - 1, 8, b);
            } else {
                bVar.mo32742a(8, (bVar.mo32744b() - 7) + (i2 - 8), b);
            }
        }
    }

    /* renamed from: a */
    static void m41875a(C9043a aVar, int i, C8962b bVar) throws WriterException {
        boolean z;
        int c = bVar.mo32745c() - 1;
        int b = bVar.mo32744b() - 1;
        int i2 = 0;
        int i3 = -1;
        while (c > 0) {
            if (c == 6) {
                c--;
            }
            while (b >= 0 && b < bVar.mo32744b()) {
                int i4 = i2;
                for (int i5 = 0; i5 < 2; i5++) {
                    int i6 = c - i5;
                    if (m41880b((int) bVar.mo32738a(i6, b))) {
                        if (i4 < aVar.mo32979d()) {
                            z = aVar.mo32974b(i4);
                            i4++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && C8965d.m41861a(i, i6, b)) {
                            z = !z;
                        }
                        bVar.mo32742a(i6, b, z);
                    }
                }
                b += i3;
                i2 = i4;
            }
            i3 = -i3;
            b += i3;
            c -= 2;
        }
        if (i2 != aVar.mo32979d()) {
            StringBuilder sb = new StringBuilder("Not all bits consumed: ");
            sb.append(i2);
            sb.append('/');
            sb.append(aVar.mo32979d());
            throw new WriterException(sb.toString());
        }
    }

    /* renamed from: a */
    static int m41867a(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: a */
    static int m41868a(int i, int i2) {
        if (i2 != 0) {
            int a = m41867a(i2);
            int i3 = i << (a - 1);
            while (m41867a(i3) >= a) {
                i3 ^= i2 << (m41867a(i3) - a);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: a */
    static void m41871a(C8945f fVar, int i, C9043a aVar) throws WriterException {
        if (C8967f.m41886b(i)) {
            int d = (fVar.mo32689d() << 3) | i;
            aVar.mo32966a(d, 5);
            aVar.mo32966a(m41868a(d, (int) f23443f), 10);
            C9043a aVar2 = new C9043a();
            aVar2.mo32966a(f23444g, 15);
            aVar.mo32973b(aVar2);
            if (aVar.mo32979d() != 15) {
                StringBuilder sb = new StringBuilder("should not happen but we got: ");
                sb.append(aVar.mo32979d());
                throw new WriterException(sb.toString());
            }
            return;
        }
        throw new WriterException("Invalid mask pattern");
    }

    /* renamed from: a */
    static void m41873a(C8949j jVar, C9043a aVar) throws WriterException {
        aVar.mo32966a(jVar.mo32703e(), 6);
        aVar.mo32966a(m41868a(jVar.mo32703e(), (int) f23442e), 12);
        if (aVar.mo32979d() != 18) {
            StringBuilder sb = new StringBuilder("should not happen but we got: ");
            sb.append(aVar.mo32979d());
            throw new WriterException(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m41869a(int i, int i2, C8962b bVar) throws WriterException {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (m41880b((int) bVar.mo32738a(i4, i2))) {
                bVar.mo32741a(i4, i2, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }
}
