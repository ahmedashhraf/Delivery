package com.google.zxing.p329s.p331e;

import com.google.zxing.C8987p;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.C8970a;
import com.google.zxing.common.reedsolomon.C8972c;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.p329s.C8990a;
import com.google.zxing.p335u.C9044b;
import com.google.zxing.p335u.C9051i;
import com.google.zxing.p335u.p336m.C9055a;
import com.google.zxing.p335u.p336m.C9057c;
import kotlin.p217i1.C14662d0;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.s.e.a */
/* compiled from: Detector */
public final class C8996a {

    /* renamed from: g */
    private static final int[] f23513g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    private final C9044b f23514a;

    /* renamed from: b */
    private boolean f23515b;

    /* renamed from: c */
    private int f23516c;

    /* renamed from: d */
    private int f23517d;

    /* renamed from: e */
    private int f23518e;

    /* renamed from: f */
    private int f23519f;

    /* renamed from: com.google.zxing.s.e.a$a */
    /* compiled from: Detector */
    static final class C8997a {

        /* renamed from: a */
        private final int f23520a;

        /* renamed from: b */
        private final int f23521b;

        C8997a(int i, int i2) {
            this.f23520a = i;
            this.f23521b = i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo32842a() {
            return this.f23520a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo32843b() {
            return this.f23521b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C8987p mo32844c() {
            return new C8987p((float) mo32842a(), (float) mo32843b());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(this.f23520a);
            sb.append(' ');
            sb.append(this.f23521b);
            sb.append(C14662d0.f42854e);
            return sb.toString();
        }
    }

    public C8996a(C9044b bVar) {
        this.f23514a = bVar;
    }

    /* renamed from: b */
    private C8987p[] m42033b(C8987p[] pVarArr) {
        return m42030a(pVarArr, (float) (this.f23518e * 2), (float) m42031b());
    }

    /* renamed from: c */
    private C8997a m42034c() {
        C8987p pVar;
        C8987p pVar2;
        C8987p pVar3;
        C8987p pVar4;
        C8987p pVar5;
        C8987p pVar6;
        C8987p pVar7;
        C8987p pVar8;
        try {
            C8987p[] a = new C9057c(this.f23514a).mo33038a();
            pVar3 = a[0];
            pVar2 = a[1];
            pVar = a[2];
            pVar4 = a[3];
        } catch (NotFoundException unused) {
            int h = this.f23514a.mo33005h() / 2;
            int e = this.f23514a.mo33001e() / 2;
            int i = h + 7;
            int i2 = e - 7;
            C8987p c = m42023a(new C8997a(i, i2), false, 1, -1).mo32844c();
            int i3 = e + 7;
            C8987p c2 = m42023a(new C8997a(i, i3), false, 1, 1).mo32844c();
            int i4 = h - 7;
            C8987p c3 = m42023a(new C8997a(i4, i3), false, -1, 1).mo32844c();
            pVar4 = m42023a(new C8997a(i4, i2), false, -1, -1).mo32844c();
            C8987p pVar9 = c2;
            pVar = c3;
            pVar3 = c;
            pVar2 = pVar9;
        }
        int a2 = C9055a.m42370a((((pVar3.mo32830a() + pVar4.mo32830a()) + pVar2.mo32830a()) + pVar.mo32830a()) / 4.0f);
        int a3 = C9055a.m42370a((((pVar3.mo32831b() + pVar4.mo32831b()) + pVar2.mo32831b()) + pVar.mo32831b()) / 4.0f);
        try {
            C8987p[] a4 = new C9057c(this.f23514a, 15, a2, a3).mo33038a();
            pVar6 = a4[0];
            pVar5 = a4[1];
            pVar7 = a4[2];
            pVar8 = a4[3];
        } catch (NotFoundException unused2) {
            int i5 = a2 + 7;
            int i6 = a3 - 7;
            pVar6 = m42023a(new C8997a(i5, i6), false, 1, -1).mo32844c();
            int i7 = a3 + 7;
            pVar5 = m42023a(new C8997a(i5, i7), false, 1, 1).mo32844c();
            int i8 = a2 - 7;
            pVar7 = m42023a(new C8997a(i8, i7), false, -1, 1).mo32844c();
            pVar8 = m42023a(new C8997a(i8, i6), false, -1, -1).mo32844c();
        }
        return new C8997a(C9055a.m42370a((((pVar6.mo32830a() + pVar8.mo32830a()) + pVar5.mo32830a()) + pVar7.mo32830a()) / 4.0f), C9055a.m42370a((((pVar6.mo32831b() + pVar8.mo32831b()) + pVar5.mo32831b()) + pVar7.mo32831b()) / 4.0f));
    }

    /* renamed from: a */
    public C8990a mo32840a() throws NotFoundException {
        return mo32841a(false);
    }

    /* renamed from: b */
    private int m42032b(C8997a aVar, C8997a aVar2) {
        float a = m42019a(aVar, aVar2);
        float a2 = ((float) (aVar2.mo32842a() - aVar.mo32842a())) / a;
        float b = ((float) (aVar2.mo32843b() - aVar.mo32843b())) / a;
        float a3 = (float) aVar.mo32842a();
        float b2 = (float) aVar.mo32843b();
        boolean b3 = this.f23514a.mo32995b(aVar.mo32842a(), aVar.mo32843b());
        int ceil = (int) Math.ceil((double) a);
        boolean z = false;
        float f = a3;
        float f2 = b2;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            f += a2;
            f2 += b;
            if (this.f23514a.mo32995b(C9055a.m42370a(f), C9055a.m42370a(f2)) != b3) {
                i++;
            }
        }
        float f3 = ((float) i) / a;
        if (f3 > 0.1f && f3 < 0.9f) {
            return 0;
        }
        if (f3 <= 0.1f) {
            z = true;
        }
        return z == b3 ? 1 : -1;
    }

    /* renamed from: a */
    public C8990a mo32841a(boolean z) throws NotFoundException {
        C8987p[] a = m42029a(m42034c());
        if (z) {
            C8987p pVar = a[0];
            a[0] = a[2];
            a[2] = pVar;
        }
        m42025a(a);
        C9044b bVar = this.f23514a;
        int i = this.f23519f;
        C8990a aVar = new C8990a(m42024a(bVar, a[i % 4], a[(i + 1) % 4], a[(i + 2) % 4], a[(i + 3) % 4]), m42033b(a), this.f23515b, this.f23517d, this.f23516c);
        return aVar;
    }

    /* renamed from: b */
    private int m42031b() {
        if (this.f23515b) {
            return (this.f23516c * 4) + 11;
        }
        int i = this.f23516c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: a */
    private void m42025a(C8987p[] pVarArr) throws NotFoundException {
        long j;
        long j2;
        if (!m42027a(pVarArr[0]) || !m42027a(pVarArr[1]) || !m42027a(pVarArr[2]) || !m42027a(pVarArr[3])) {
            throw NotFoundException.m41712a();
        }
        int i = this.f23518e * 2;
        int[] iArr = {m42021a(pVarArr[0], pVarArr[1], i), m42021a(pVarArr[1], pVarArr[2], i), m42021a(pVarArr[2], pVarArr[3], i), m42021a(pVarArr[3], pVarArr[0], i)};
        this.f23519f = m42022a(iArr, i);
        long j3 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[(this.f23519f + i2) % 4];
            if (this.f23515b) {
                j2 = j3 << 7;
                j = (long) ((i3 >> 1) & C13959t.f40827P1);
            } else {
                j2 = j3 << 10;
                j = (long) (((i3 >> 2) & 992) + ((i3 >> 1) & 31));
            }
            j3 = j2 + j;
        }
        int a = m42020a(j3, this.f23515b);
        if (this.f23515b) {
            this.f23516c = (a >> 6) + 1;
            this.f23517d = (a & 63) + 1;
            return;
        }
        this.f23516c = (a >> 11) + 1;
        this.f23517d = (a & 2047) + 1;
    }

    /* renamed from: a */
    private static int m42022a(int[] iArr, int i) throws NotFoundException {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f23513g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private static int m42020a(long j, boolean z) throws NotFoundException {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C8972c(C8970a.f23457k).mo32795a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.m41712a();
        }
    }

    /* renamed from: a */
    private C8987p[] m42029a(C8997a aVar) throws NotFoundException {
        this.f23518e = 1;
        C8997a aVar2 = aVar;
        C8997a aVar3 = aVar2;
        C8997a aVar4 = aVar3;
        C8997a aVar5 = aVar4;
        boolean z = true;
        while (this.f23518e < 9) {
            C8997a a = m42023a(aVar2, z, 1, -1);
            C8997a a2 = m42023a(aVar3, z, 1, 1);
            C8997a a3 = m42023a(aVar4, z, -1, 1);
            C8997a a4 = m42023a(aVar5, z, -1, -1);
            if (this.f23518e > 2) {
                double a5 = (double) ((m42019a(a4, a) * ((float) this.f23518e)) / (m42019a(aVar5, aVar2) * ((float) (this.f23518e + 2))));
                if (a5 < 0.75d || a5 > 1.25d || !m42028a(a, a2, a3, a4)) {
                    break;
                }
            }
            z = !z;
            this.f23518e++;
            aVar5 = a4;
            aVar2 = a;
            aVar3 = a2;
            aVar4 = a3;
        }
        int i = this.f23518e;
        if (i == 5 || i == 7) {
            this.f23515b = this.f23518e == 5;
            C8987p[] pVarArr = {new C8987p(((float) aVar2.mo32842a()) + 0.5f, ((float) aVar2.mo32843b()) - 0.5f), new C8987p(((float) aVar3.mo32842a()) + 0.5f, ((float) aVar3.mo32843b()) + 0.5f), new C8987p(((float) aVar4.mo32842a()) - 0.5f, ((float) aVar4.mo32843b()) + 0.5f), new C8987p(((float) aVar5.mo32842a()) - 0.5f, ((float) aVar5.mo32843b()) - 0.5f)};
            int i2 = this.f23518e;
            return m42030a(pVarArr, (float) ((i2 * 2) - 3), (float) (i2 * 2));
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private C9044b m42024a(C9044b bVar, C8987p pVar, C8987p pVar2, C8987p pVar3, C8987p pVar4) throws NotFoundException {
        C9044b bVar2 = bVar;
        C9051i a = C9051i.m42349a();
        int b = m42031b();
        int i = b;
        int i2 = b;
        float f = ((float) b) / 2.0f;
        int i3 = this.f23518e;
        float f2 = f - ((float) i3);
        float f3 = f + ((float) i3);
        return a.mo33029a(bVar2, i2, i, f2, f2, f3, f2, f3, f3, f2, f3, pVar.mo32830a(), pVar.mo32831b(), pVar2.mo32830a(), pVar2.mo32831b(), pVar3.mo32830a(), pVar3.mo32831b(), pVar4.mo32830a(), pVar4.mo32831b());
    }

    /* renamed from: a */
    private int m42021a(C8987p pVar, C8987p pVar2, int i) {
        float a = m42018a(pVar, pVar2);
        float f = a / ((float) i);
        float a2 = pVar.mo32830a();
        float b = pVar.mo32831b();
        float a3 = ((pVar2.mo32830a() - pVar.mo32830a()) * f) / a;
        float b2 = (f * (pVar2.mo32831b() - pVar.mo32831b())) / a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = (float) i3;
            if (this.f23514a.mo32995b(C9055a.m42370a((f2 * a3) + a2), C9055a.m42370a((f2 * b2) + b))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    private boolean m42028a(C8997a aVar, C8997a aVar2, C8997a aVar3, C8997a aVar4) {
        C8997a aVar5 = new C8997a(aVar.mo32842a() - 3, aVar.mo32843b() + 3);
        C8997a aVar6 = new C8997a(aVar2.mo32842a() - 3, aVar2.mo32843b() - 3);
        C8997a aVar7 = new C8997a(aVar3.mo32842a() + 3, aVar3.mo32843b() - 3);
        C8997a aVar8 = new C8997a(aVar4.mo32842a() + 3, aVar4.mo32843b() + 3);
        int b = m42032b(aVar8, aVar5);
        if (b != 0 && m42032b(aVar5, aVar6) == b && m42032b(aVar6, aVar7) == b && m42032b(aVar7, aVar8) == b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private C8997a m42023a(C8997a aVar, boolean z, int i, int i2) {
        int a = aVar.mo32842a() + i;
        int b = aVar.mo32843b();
        while (true) {
            b += i2;
            if (!m42026a(a, b) || this.f23514a.mo32995b(a, b) != z) {
                int i3 = a - i;
                int i4 = b - i2;
            } else {
                a += i;
            }
        }
        int i32 = a - i;
        int i42 = b - i2;
        while (m42026a(i32, i42) && this.f23514a.mo32995b(i32, i42) == z) {
            i32 += i;
        }
        int i5 = i32 - i;
        while (m42026a(i5, i42) && this.f23514a.mo32995b(i5, i42) == z) {
            i42 += i2;
        }
        return new C8997a(i5, i42 - i2);
    }

    /* renamed from: a */
    private static C8987p[] m42030a(C8987p[] pVarArr, float f, float f2) {
        float f3 = f2 / (f * 2.0f);
        float a = (pVarArr[0].mo32830a() + pVarArr[2].mo32830a()) / 2.0f;
        float b = (pVarArr[0].mo32831b() + pVarArr[2].mo32831b()) / 2.0f;
        float a2 = (pVarArr[0].mo32830a() - pVarArr[2].mo32830a()) * f3;
        float b2 = (pVarArr[0].mo32831b() - pVarArr[2].mo32831b()) * f3;
        C8987p pVar = new C8987p(a + a2, b + b2);
        C8987p pVar2 = new C8987p(a - a2, b - b2);
        float a3 = (pVarArr[1].mo32830a() + pVarArr[3].mo32830a()) / 2.0f;
        float b3 = (pVarArr[1].mo32831b() + pVarArr[3].mo32831b()) / 2.0f;
        float a4 = (pVarArr[1].mo32830a() - pVarArr[3].mo32830a()) * f3;
        float b4 = f3 * (pVarArr[1].mo32831b() - pVarArr[3].mo32831b());
        return new C8987p[]{pVar, new C8987p(a3 + a4, b3 + b4), pVar2, new C8987p(a3 - a4, b3 - b4)};
    }

    /* renamed from: a */
    private boolean m42026a(int i, int i2) {
        return i >= 0 && i < this.f23514a.mo33005h() && i2 > 0 && i2 < this.f23514a.mo33001e();
    }

    /* renamed from: a */
    private boolean m42027a(C8987p pVar) {
        return m42026a(C9055a.m42370a(pVar.mo32830a()), C9055a.m42370a(pVar.mo32831b()));
    }

    /* renamed from: a */
    private static float m42019a(C8997a aVar, C8997a aVar2) {
        return C9055a.m42369a(aVar.mo32842a(), aVar.mo32843b(), aVar2.mo32842a(), aVar2.mo32843b());
    }

    /* renamed from: a */
    private static float m42018a(C8987p pVar, C8987p pVar2) {
        return C9055a.m42368a(pVar.mo32830a(), pVar.mo32831b(), pVar2.mo32830a(), pVar2.mo32831b());
    }
}
