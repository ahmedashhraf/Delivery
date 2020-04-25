package com.google.zxing.p325a0.p326c;

import com.google.zxing.FormatException;
import com.google.zxing.p335u.C9044b;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.a0.c.j */
/* compiled from: Version */
public final class C8949j {

    /* renamed from: e */
    private static final int[] f23389e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    private static final C8949j[] f23390f = m41770f();

    /* renamed from: a */
    private final int f23391a;

    /* renamed from: b */
    private final int[] f23392b;

    /* renamed from: c */
    private final C8951b[] f23393c;

    /* renamed from: d */
    private final int f23394d;

    /* renamed from: com.google.zxing.a0.c.j$a */
    /* compiled from: Version */
    public static final class C8950a {

        /* renamed from: a */
        private final int f23395a;

        /* renamed from: b */
        private final int f23396b;

        C8950a(int i, int i2) {
            this.f23395a = i;
            this.f23396b = i2;
        }

        /* renamed from: a */
        public int mo32705a() {
            return this.f23395a;
        }

        /* renamed from: b */
        public int mo32706b() {
            return this.f23396b;
        }
    }

    /* renamed from: com.google.zxing.a0.c.j$b */
    /* compiled from: Version */
    public static final class C8951b {

        /* renamed from: a */
        private final int f23397a;

        /* renamed from: b */
        private final C8950a[] f23398b;

        C8951b(int i, C8950a... aVarArr) {
            this.f23397a = i;
            this.f23398b = aVarArr;
        }

        /* renamed from: a */
        public C8950a[] mo32707a() {
            return this.f23398b;
        }

        /* renamed from: b */
        public int mo32708b() {
            return this.f23397a;
        }

        /* renamed from: c */
        public int mo32709c() {
            int i = 0;
            for (C8950a a : this.f23398b) {
                i += a.mo32705a();
            }
            return i;
        }

        /* renamed from: d */
        public int mo32710d() {
            return this.f23397a * mo32709c();
        }
    }

    private C8949j(int i, int[] iArr, C8951b... bVarArr) {
        this.f23391a = i;
        this.f23392b = iArr;
        this.f23393c = bVarArr;
        int b = bVarArr[0].mo32708b();
        int i2 = 0;
        for (C8950a aVar : bVarArr[0].mo32707a()) {
            i2 += aVar.mo32705a() * (aVar.mo32706b() + b);
        }
        this.f23394d = i2;
    }

    /* renamed from: f */
    private static C8949j[] m41770f() {
        return new C8949j[]{new C8949j(1, new int[0], new C8951b(7, new C8950a(1, 19)), new C8951b(10, new C8950a(1, 16)), new C8951b(13, new C8950a(1, 13)), new C8951b(17, new C8950a(1, 9))), new C8949j(2, new int[]{6, 18}, new C8951b(10, new C8950a(1, 34)), new C8951b(16, new C8950a(1, 28)), new C8951b(22, new C8950a(1, 22)), new C8951b(28, new C8950a(1, 16))), new C8949j(3, new int[]{6, 22}, new C8951b(15, new C8950a(1, 55)), new C8951b(26, new C8950a(1, 44)), new C8951b(18, new C8950a(2, 17)), new C8951b(22, new C8950a(2, 13))), new C8949j(4, new int[]{6, 26}, new C8951b(20, new C8950a(1, 80)), new C8951b(18, new C8950a(2, 32)), new C8951b(26, new C8950a(2, 24)), new C8951b(16, new C8950a(4, 9))), new C8949j(5, new int[]{6, 30}, new C8951b(26, new C8950a(1, 108)), new C8951b(24, new C8950a(2, 43)), new C8951b(18, new C8950a(2, 15), new C8950a(2, 16)), new C8951b(22, new C8950a(2, 11), new C8950a(2, 12))), new C8949j(6, new int[]{6, 34}, new C8951b(18, new C8950a(2, 68)), new C8951b(16, new C8950a(4, 27)), new C8951b(24, new C8950a(4, 19)), new C8951b(28, new C8950a(4, 15))), new C8949j(7, new int[]{6, 22, 38}, new C8951b(20, new C8950a(2, 78)), new C8951b(18, new C8950a(4, 31)), new C8951b(18, new C8950a(2, 14), new C8950a(4, 15)), new C8951b(26, new C8950a(4, 13), new C8950a(1, 14))), new C8949j(8, new int[]{6, 24, 42}, new C8951b(24, new C8950a(2, 97)), new C8951b(22, new C8950a(2, 38), new C8950a(2, 39)), new C8951b(22, new C8950a(4, 18), new C8950a(2, 19)), new C8951b(26, new C8950a(4, 14), new C8950a(2, 15))), new C8949j(9, new int[]{6, 26, 46}, new C8951b(30, new C8950a(2, 116)), new C8951b(22, new C8950a(3, 36), new C8950a(2, 37)), new C8951b(20, new C8950a(4, 16), new C8950a(4, 17)), new C8951b(24, new C8950a(4, 12), new C8950a(4, 13))), new C8949j(10, new int[]{6, 28, 50}, new C8951b(18, new C8950a(2, 68), new C8950a(2, 69)), new C8951b(26, new C8950a(4, 43), new C8950a(1, 44)), new C8951b(24, new C8950a(6, 19), new C8950a(2, 20)), new C8951b(28, new C8950a(6, 15), new C8950a(2, 16))), new C8949j(11, new int[]{6, 30, 54}, new C8951b(20, new C8950a(4, 81)), new C8951b(30, new C8950a(1, 50), new C8950a(4, 51)), new C8951b(28, new C8950a(4, 22), new C8950a(4, 23)), new C8951b(24, new C8950a(3, 12), new C8950a(8, 13))), new C8949j(12, new int[]{6, 32, 58}, new C8951b(24, new C8950a(2, 92), new C8950a(2, 93)), new C8951b(22, new C8950a(6, 36), new C8950a(2, 37)), new C8951b(26, new C8950a(4, 20), new C8950a(6, 21)), new C8951b(28, new C8950a(7, 14), new C8950a(4, 15))), new C8949j(13, new int[]{6, 34, 62}, new C8951b(26, new C8950a(4, 107)), new C8951b(22, new C8950a(8, 37), new C8950a(1, 38)), new C8951b(24, new C8950a(8, 20), new C8950a(4, 21)), new C8951b(22, new C8950a(12, 11), new C8950a(4, 12))), new C8949j(14, new int[]{6, 26, 46, 66}, new C8951b(30, new C8950a(3, 115), new C8950a(1, 116)), new C8951b(24, new C8950a(4, 40), new C8950a(5, 41)), new C8951b(20, new C8950a(11, 16), new C8950a(5, 17)), new C8951b(24, new C8950a(11, 12), new C8950a(5, 13))), new C8949j(15, new int[]{6, 26, 48, 70}, new C8951b(22, new C8950a(5, 87), new C8950a(1, 88)), new C8951b(24, new C8950a(5, 41), new C8950a(5, 42)), new C8951b(30, new C8950a(5, 24), new C8950a(7, 25)), new C8951b(24, new C8950a(11, 12), new C8950a(7, 13))), new C8949j(16, new int[]{6, 26, 50, 74}, new C8951b(24, new C8950a(5, 98), new C8950a(1, 99)), new C8951b(28, new C8950a(7, 45), new C8950a(3, 46)), new C8951b(24, new C8950a(15, 19), new C8950a(2, 20)), new C8951b(30, new C8950a(3, 15), new C8950a(13, 16))), new C8949j(17, new int[]{6, 30, 54, 78}, new C8951b(28, new C8950a(1, 107), new C8950a(5, 108)), new C8951b(28, new C8950a(10, 46), new C8950a(1, 47)), new C8951b(28, new C8950a(1, 22), new C8950a(15, 23)), new C8951b(28, new C8950a(2, 14), new C8950a(17, 15))), new C8949j(18, new int[]{6, 30, 56, 82}, new C8951b(30, new C8950a(5, 120), new C8950a(1, 121)), new C8951b(26, new C8950a(9, 43), new C8950a(4, 44)), new C8951b(28, new C8950a(17, 22), new C8950a(1, 23)), new C8951b(28, new C8950a(2, 14), new C8950a(19, 15))), new C8949j(19, new int[]{6, 30, 58, 86}, new C8951b(28, new C8950a(3, 113), new C8950a(4, 114)), new C8951b(26, new C8950a(3, 44), new C8950a(11, 45)), new C8951b(26, new C8950a(17, 21), new C8950a(4, 22)), new C8951b(26, new C8950a(9, 13), new C8950a(16, 14))), new C8949j(20, new int[]{6, 34, 62, 90}, new C8951b(28, new C8950a(3, 107), new C8950a(5, 108)), new C8951b(26, new C8950a(3, 41), new C8950a(13, 42)), new C8951b(30, new C8950a(15, 24), new C8950a(5, 25)), new C8951b(28, new C8950a(15, 15), new C8950a(10, 16))), new C8949j(21, new int[]{6, 28, 50, 72, 94}, new C8951b(28, new C8950a(4, 116), new C8950a(4, 117)), new C8951b(26, new C8950a(17, 42)), new C8951b(28, new C8950a(17, 22), new C8950a(6, 23)), new C8951b(30, new C8950a(19, 16), new C8950a(6, 17))), new C8949j(22, new int[]{6, 26, 50, 74, 98}, new C8951b(28, new C8950a(2, 111), new C8950a(7, 112)), new C8951b(28, new C8950a(17, 46)), new C8951b(30, new C8950a(7, 24), new C8950a(16, 25)), new C8951b(24, new C8950a(34, 13))), new C8949j(23, new int[]{6, 30, 54, 78, 102}, new C8951b(30, new C8950a(4, 121), new C8950a(5, 122)), new C8951b(28, new C8950a(4, 47), new C8950a(14, 48)), new C8951b(30, new C8950a(11, 24), new C8950a(14, 25)), new C8951b(30, new C8950a(16, 15), new C8950a(14, 16))), new C8949j(24, new int[]{6, 28, 54, 80, 106}, new C8951b(30, new C8950a(6, 117), new C8950a(4, 118)), new C8951b(28, new C8950a(6, 45), new C8950a(14, 46)), new C8951b(30, new C8950a(11, 24), new C8950a(16, 25)), new C8951b(30, new C8950a(30, 16), new C8950a(2, 17))), new C8949j(25, new int[]{6, 32, 58, 84, 110}, new C8951b(26, new C8950a(8, 106), new C8950a(4, 107)), new C8951b(28, new C8950a(8, 47), new C8950a(13, 48)), new C8951b(30, new C8950a(7, 24), new C8950a(22, 25)), new C8951b(30, new C8950a(22, 15), new C8950a(13, 16))), new C8949j(26, new int[]{6, 30, 58, 86, 114}, new C8951b(28, new C8950a(10, 114), new C8950a(2, 115)), new C8951b(28, new C8950a(19, 46), new C8950a(4, 47)), new C8951b(28, new C8950a(28, 22), new C8950a(6, 23)), new C8951b(30, new C8950a(33, 16), new C8950a(4, 17))), new C8949j(27, new int[]{6, 34, 62, 90, 118}, new C8951b(30, new C8950a(8, 122), new C8950a(4, 123)), new C8951b(28, new C8950a(22, 45), new C8950a(3, 46)), new C8951b(30, new C8950a(8, 23), new C8950a(26, 24)), new C8951b(30, new C8950a(12, 15), new C8950a(28, 16))), new C8949j(28, new int[]{6, 26, 50, 74, 98, 122}, new C8951b(30, new C8950a(3, 117), new C8950a(10, 118)), new C8951b(28, new C8950a(3, 45), new C8950a(23, 46)), new C8951b(30, new C8950a(4, 24), new C8950a(31, 25)), new C8951b(30, new C8950a(11, 15), new C8950a(31, 16))), new C8949j(29, new int[]{6, 30, 54, 78, 102, C13959t.f40823O1}, new C8951b(30, new C8950a(7, 116), new C8950a(7, 117)), new C8951b(28, new C8950a(21, 45), new C8950a(7, 46)), new C8951b(30, new C8950a(1, 23), new C8950a(37, 24)), new C8951b(30, new C8950a(19, 15), new C8950a(26, 16))), new C8949j(30, new int[]{6, 26, 52, 78, 104, C13959t.f40839S1}, new C8951b(30, new C8950a(5, 115), new C8950a(10, 116)), new C8951b(28, new C8950a(19, 47), new C8950a(10, 48)), new C8951b(30, new C8950a(15, 24), new C8950a(25, 25)), new C8951b(30, new C8950a(23, 15), new C8950a(25, 16))), new C8949j(31, new int[]{6, 30, 56, 82, 108, C13959t.f40855W1}, new C8951b(30, new C8950a(13, 115), new C8950a(3, 116)), new C8951b(28, new C8950a(2, 46), new C8950a(29, 47)), new C8951b(30, new C8950a(42, 24), new C8950a(1, 25)), new C8951b(30, new C8950a(23, 15), new C8950a(28, 16))), new C8949j(32, new int[]{6, 34, 60, 86, 112, C13959t.f40872a2}, new C8951b(30, new C8950a(17, 115)), new C8951b(28, new C8950a(10, 46), new C8950a(23, 47)), new C8951b(30, new C8950a(10, 24), new C8950a(35, 25)), new C8951b(30, new C8950a(19, 15), new C8950a(35, 16))), new C8949j(33, new int[]{6, 30, 58, 86, 114, C13959t.f40892e2}, new C8951b(30, new C8950a(17, 115), new C8950a(1, 116)), new C8951b(28, new C8950a(14, 46), new C8950a(21, 47)), new C8951b(30, new C8950a(29, 24), new C8950a(19, 25)), new C8951b(30, new C8950a(11, 15), new C8950a(46, 16))), new C8949j(34, new int[]{6, 34, 62, 90, 118, C13959t.f40912i2}, new C8951b(30, new C8950a(13, 115), new C8950a(6, 116)), new C8951b(28, new C8950a(14, 46), new C8950a(23, 47)), new C8951b(30, new C8950a(44, 24), new C8950a(7, 25)), new C8951b(30, new C8950a(59, 16), new C8950a(1, 17))), new C8949j(35, new int[]{6, 30, 54, 78, 102, C13959t.f40823O1, C13959t.f40929m2}, new C8951b(30, new C8950a(12, 121), new C8950a(7, 122)), new C8951b(28, new C8950a(12, 47), new C8950a(26, 48)), new C8951b(30, new C8950a(39, 24), new C8950a(14, 25)), new C8951b(30, new C8950a(22, 15), new C8950a(41, 16))), new C8949j(36, new int[]{6, 24, 50, 76, 102, 128, C13959t.f40945q2}, new C8951b(30, new C8950a(6, 121), new C8950a(14, 122)), new C8951b(28, new C8950a(6, 47), new C8950a(34, 48)), new C8951b(30, new C8950a(46, 24), new C8950a(10, 25)), new C8951b(30, new C8950a(2, 15), new C8950a(64, 16))), new C8949j(37, new int[]{6, 28, 54, 80, 106, C13959t.f40847U1, C13959t.f40961u2}, new C8951b(30, new C8950a(17, 122), new C8950a(4, 123)), new C8951b(28, new C8950a(29, 46), new C8950a(14, 47)), new C8951b(30, new C8950a(49, 24), new C8950a(10, 25)), new C8951b(30, new C8950a(24, 15), new C8950a(46, 16))), new C8949j(38, new int[]{6, 32, 58, 84, 110, C13959t.f40863Y1, C13959t.f40977y2}, new C8951b(30, new C8950a(4, 122), new C8950a(18, 123)), new C8951b(28, new C8950a(13, 46), new C8950a(32, 47)), new C8951b(30, new C8950a(48, 24), new C8950a(14, 25)), new C8951b(30, new C8950a(42, 15), new C8950a(32, 16))), new C8949j(39, new int[]{6, 26, 54, 82, 110, C13959t.f40872a2, C13959t.f40776C2}, new C8951b(30, new C8950a(20, 117), new C8950a(4, 118)), new C8951b(28, new C8950a(40, 47), new C8950a(7, 48)), new C8951b(30, new C8950a(43, 24), new C8950a(22, 25)), new C8951b(30, new C8950a(10, 15), new C8950a(67, 16))), new C8949j(40, new int[]{6, 30, 58, 86, 114, C13959t.f40892e2, C13959t.f40792G2}, new C8951b(30, new C8950a(19, 118), new C8950a(6, 119)), new C8951b(28, new C8950a(18, 47), new C8950a(31, 48)), new C8951b(30, new C8950a(34, 24), new C8950a(34, 25)), new C8951b(30, new C8950a(20, 15), new C8950a(61, 16)))};
    }

    /* renamed from: a */
    public C8951b mo32698a(C8945f fVar) {
        return this.f23393c[fVar.ordinal()];
    }

    /* renamed from: b */
    public int[] mo32700b() {
        return this.f23392b;
    }

    /* renamed from: c */
    public int mo32701c() {
        return (this.f23391a * 4) + 17;
    }

    /* renamed from: d */
    public int mo32702d() {
        return this.f23394d;
    }

    /* renamed from: e */
    public int mo32703e() {
        return this.f23391a;
    }

    public String toString() {
        return String.valueOf(this.f23391a);
    }

    /* renamed from: a */
    static C8949j m41767a(int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        while (true) {
            int[] iArr = f23389e;
            if (i2 < iArr.length) {
                int i5 = iArr[i2];
                if (i5 == i) {
                    return m41769c(i2 + 7);
                }
                int c = C8946g.m41759c(i, i5);
                if (c < i3) {
                    i4 = i2 + 7;
                    i3 = c;
                }
                i2++;
            } else if (i3 <= 3) {
                return m41769c(i4);
            } else {
                return null;
            }
        }
    }

    /* renamed from: b */
    public static C8949j m41768b(int i) throws FormatException {
        if (i % 4 == 1) {
            try {
                return m41769c((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw FormatException.m41710a();
            }
        } else {
            throw FormatException.m41710a();
        }
    }

    /* renamed from: c */
    public static C8949j m41769c(int i) {
        if (i > 0 && i <= 40) {
            return f23390f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9044b mo32699a() {
        int c = mo32701c();
        C9044b bVar = new C9044b(c);
        bVar.mo32991a(0, 0, 9, 9);
        int i = c - 8;
        bVar.mo32991a(i, 0, 8, 9);
        bVar.mo32991a(0, i, 9, 8);
        int length = this.f23392b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f23392b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if (!((i2 == 0 && (i4 == 0 || i4 == length - 1)) || (i2 == length - 1 && i4 == 0))) {
                    bVar.mo32991a(this.f23392b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = c - 17;
        bVar.mo32991a(6, 9, 1, i5);
        bVar.mo32991a(9, 6, i5, 1);
        if (this.f23391a > 6) {
            int i6 = c - 11;
            bVar.mo32991a(i6, 0, 3, 6);
            bVar.mo32991a(0, i6, 6, 3);
        }
        return bVar;
    }
}
