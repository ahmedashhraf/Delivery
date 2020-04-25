package com.google.zxing.p337v.p338c;

import com.google.zxing.FormatException;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.v.c.e */
/* compiled from: Version */
public final class C9066e {

    /* renamed from: h */
    private static final C9066e[] f23736h = m42413h();

    /* renamed from: a */
    private final int f23737a;

    /* renamed from: b */
    private final int f23738b;

    /* renamed from: c */
    private final int f23739c;

    /* renamed from: d */
    private final int f23740d;

    /* renamed from: e */
    private final int f23741e;

    /* renamed from: f */
    private final C9069c f23742f;

    /* renamed from: g */
    private final int f23743g;

    /* renamed from: com.google.zxing.v.c.e$b */
    /* compiled from: Version */
    static final class C9068b {

        /* renamed from: a */
        private final int f23744a;

        /* renamed from: b */
        private final int f23745b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo33053a() {
            return this.f23744a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo33054b() {
            return this.f23745b;
        }

        private C9068b(int i, int i2) {
            this.f23744a = i;
            this.f23745b = i2;
        }
    }

    /* renamed from: com.google.zxing.v.c.e$c */
    /* compiled from: Version */
    static final class C9069c {

        /* renamed from: a */
        private final int f23746a;

        /* renamed from: b */
        private final C9068b[] f23747b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C9068b[] mo33055a() {
            return this.f23747b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo33056b() {
            return this.f23746a;
        }

        private C9069c(int i, C9068b bVar) {
            this.f23746a = i;
            this.f23747b = new C9068b[]{bVar};
        }

        private C9069c(int i, C9068b bVar, C9068b bVar2) {
            this.f23746a = i;
            this.f23747b = new C9068b[]{bVar, bVar2};
        }
    }

    private C9066e(int i, int i2, int i3, int i4, int i5, C9069c cVar) {
        C9068b[] a;
        this.f23737a = i;
        this.f23738b = i2;
        this.f23739c = i3;
        this.f23740d = i4;
        this.f23741e = i5;
        this.f23742f = cVar;
        int b = cVar.mo33056b();
        int i6 = 0;
        for (C9068b bVar : cVar.mo33055a()) {
            i6 += bVar.mo33053a() * (bVar.mo33054b() + b);
        }
        this.f23743g = i6;
    }

    /* renamed from: h */
    private static C9066e[] m42413h() {
        C9066e eVar = new C9066e(1, 10, 10, 8, 8, new C9069c(5, new C9068b(1, 3)));
        C9066e eVar2 = new C9066e(2, 12, 12, 10, 10, new C9069c(7, new C9068b(1, 5)));
        C9066e eVar3 = new C9066e(3, 14, 14, 12, 12, new C9069c(10, new C9068b(1, 8)));
        C9066e eVar4 = new C9066e(4, 16, 16, 14, 14, new C9069c(12, new C9068b(1, 12)));
        C9066e eVar5 = new C9066e(5, 18, 18, 16, 16, new C9069c(14, new C9068b(1, 18)));
        C9066e eVar6 = new C9066e(6, 20, 20, 18, 18, new C9069c(18, new C9068b(1, 22)));
        C9066e eVar7 = new C9066e(7, 22, 22, 20, 20, new C9069c(20, new C9068b(1, 30)));
        C9066e eVar8 = new C9066e(8, 24, 24, 22, 22, new C9069c(24, new C9068b(1, 36)));
        C9066e eVar9 = new C9066e(9, 26, 26, 24, 24, new C9069c(28, new C9068b(1, 44)));
        C9066e eVar10 = new C9066e(10, 32, 32, 14, 14, new C9069c(36, new C9068b(1, 62)));
        C9066e eVar11 = new C9066e(11, 36, 36, 16, 16, new C9069c(42, new C9068b(1, 86)));
        C9066e eVar12 = new C9066e(12, 40, 40, 18, 18, new C9069c(48, new C9068b(1, 114)));
        C9066e eVar13 = new C9066e(13, 44, 44, 20, 20, new C9069c(56, new C9068b(1, C13959t.f40902g2)));
        C9066e eVar14 = new C9066e(14, 48, 48, 22, 22, new C9069c(68, new C9068b(1, C13959t.f40808K2)));
        C9066e eVar15 = new C9066e(15, 52, 52, 24, 24, new C9069c(42, new C9068b(2, 102)));
        C9066e eVar16 = new C9066e(16, 64, 64, 14, 14, new C9069c(56, new C9068b(2, C13959t.f40882c2)));
        C9066e eVar17 = new C9066e(17, 72, 72, 16, 16, new C9069c(36, new C9068b(4, 92)));
        C9066e eVar18 = new C9066e(18, 80, 80, 18, 18, new C9069c(48, new C9068b(4, 114)));
        C9066e eVar19 = new C9066e(19, 88, 88, 20, 20, new C9069c(56, new C9068b(4, C13959t.f40902g2)));
        C9066e eVar20 = new C9066e(20, 96, 96, 22, 22, new C9069c(68, new C9068b(4, C13959t.f40808K2)));
        C9066e eVar21 = new C9066e(21, 104, 104, 24, 24, new C9069c(56, new C9068b(6, C13959t.f40863Y1)));
        C9066e eVar22 = new C9066e(22, 120, 120, 18, 18, new C9069c(68, new C9068b(6, 175)));
        C9066e eVar23 = new C9066e(23, C13959t.f40847U1, C13959t.f40847U1, 20, 20, new C9069c(62, new C9068b(8, C13959t.f40981z2)));
        C9066e eVar24 = new C9066e(24, C13959t.f40902g2, C13959t.f40902g2, 22, 22, new C9069c(62, new C9068b(8, C13959t.f40953s2), new C9068b(2, C13959t.f40949r2)));
        C9066e eVar25 = new C9066e(25, 8, 18, 6, 16, new C9069c(7, new C9068b(1, 5)));
        C9066e eVar26 = new C9066e(26, 8, 32, 6, 14, new C9069c(11, new C9068b(1, 10)));
        C9066e eVar27 = new C9066e(27, 12, 26, 10, 24, new C9069c(14, new C9068b(1, 16)));
        C9066e eVar28 = new C9066e(28, 12, 36, 10, 16, new C9069c(18, new C9068b(1, 22)));
        C9066e eVar29 = new C9066e(29, 16, 36, 14, 16, new C9069c(24, new C9068b(1, 32)));
        C9066e eVar30 = new C9066e(30, 16, 48, 14, 22, new C9069c(28, new C9068b(1, 49)));
        return new C9066e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22, eVar23, eVar24, eVar25, eVar26, eVar27, eVar28, eVar29, eVar30};
    }

    /* renamed from: a */
    public int mo33045a() {
        return this.f23741e;
    }

    /* renamed from: b */
    public int mo33046b() {
        return this.f23740d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C9069c mo33047c() {
        return this.f23742f;
    }

    /* renamed from: d */
    public int mo33048d() {
        return this.f23739c;
    }

    /* renamed from: e */
    public int mo33049e() {
        return this.f23738b;
    }

    /* renamed from: f */
    public int mo33050f() {
        return this.f23743g;
    }

    /* renamed from: g */
    public int mo33051g() {
        return this.f23737a;
    }

    public String toString() {
        return String.valueOf(this.f23737a);
    }

    /* renamed from: a */
    public static C9066e m42412a(int i, int i2) throws FormatException {
        C9066e[] eVarArr;
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (C9066e eVar : f23736h) {
                if (eVar.f23738b == i && eVar.f23739c == i2) {
                    return eVar;
                }
            }
            throw FormatException.m41710a();
        }
        throw FormatException.m41710a();
    }
}
