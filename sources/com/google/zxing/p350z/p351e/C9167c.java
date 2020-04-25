package com.google.zxing.p350z.p351e;

import com.google.zxing.C8987p;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9044b;

/* renamed from: com.google.zxing.z.e.c */
/* compiled from: BoundingBox */
final class C9167c {

    /* renamed from: a */
    private C9044b f24052a;

    /* renamed from: b */
    private C8987p f24053b;

    /* renamed from: c */
    private C8987p f24054c;

    /* renamed from: d */
    private C8987p f24055d;

    /* renamed from: e */
    private C8987p f24056e;

    /* renamed from: f */
    private int f24057f;

    /* renamed from: g */
    private int f24058g;

    /* renamed from: h */
    private int f24059h;

    /* renamed from: i */
    private int f24060i;

    C9167c(C9044b bVar, C8987p pVar, C8987p pVar2, C8987p pVar3, C8987p pVar4) throws NotFoundException {
        if (!(pVar == null && pVar3 == null) && (!(pVar2 == null && pVar4 == null) && ((pVar == null || pVar2 != null) && (pVar3 == null || pVar4 != null)))) {
            m42841a(bVar, pVar, pVar2, pVar3, pVar4);
            return;
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private void m42841a(C9044b bVar, C8987p pVar, C8987p pVar2, C8987p pVar3, C8987p pVar4) {
        this.f24052a = bVar;
        this.f24053b = pVar;
        this.f24054c = pVar2;
        this.f24055d = pVar3;
        this.f24056e = pVar4;
        m42842i();
    }

    /* renamed from: i */
    private void m42842i() {
        if (this.f24053b == null) {
            this.f24053b = new C8987p(0.0f, this.f24055d.mo32831b());
            this.f24054c = new C8987p(0.0f, this.f24056e.mo32831b());
        } else if (this.f24055d == null) {
            this.f24055d = new C8987p((float) (this.f24052a.mo33005h() - 1), this.f24053b.mo32831b());
            this.f24056e = new C8987p((float) (this.f24052a.mo33005h() - 1), this.f24054c.mo32831b());
        }
        this.f24057f = (int) Math.min(this.f24053b.mo32830a(), this.f24054c.mo32830a());
        this.f24058g = (int) Math.max(this.f24055d.mo32830a(), this.f24056e.mo32830a());
        this.f24059h = (int) Math.min(this.f24053b.mo32831b(), this.f24055d.mo32831b());
        this.f24060i = (int) Math.max(this.f24054c.mo32831b(), this.f24056e.mo32831b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8987p mo33216b() {
        return this.f24056e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo33217c() {
        return this.f24058g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo33218d() {
        return this.f24060i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo33219e() {
        return this.f24057f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo33220f() {
        return this.f24059h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C8987p mo33221g() {
        return this.f24053b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C8987p mo33222h() {
        return this.f24055d;
    }

    C9167c(C9167c cVar) {
        m42841a(cVar.f24052a, cVar.f24053b, cVar.f24054c, cVar.f24055d, cVar.f24056e);
    }

    /* renamed from: a */
    static C9167c m42840a(C9167c cVar, C9167c cVar2) throws NotFoundException {
        if (cVar == null) {
            return cVar2;
        }
        if (cVar2 == null) {
            return cVar;
        }
        C9167c cVar3 = new C9167c(cVar.f24052a, cVar.f24053b, cVar.f24054c, cVar2.f24055d, cVar2.f24056e);
        return cVar3;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.p350z.p351e.C9167c mo33215a(int r13, int r14, boolean r15) throws com.google.zxing.NotFoundException {
        /*
            r12 = this;
            com.google.zxing.p r0 = r12.f24053b
            com.google.zxing.p r1 = r12.f24054c
            com.google.zxing.p r2 = r12.f24055d
            com.google.zxing.p r3 = r12.f24056e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.mo32831b()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            com.google.zxing.p r13 = new com.google.zxing.p
            float r4 = r4.mo32830a()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            com.google.zxing.p r13 = r12.f24054c
            goto L_0x0034
        L_0x0032:
            com.google.zxing.p r13 = r12.f24056e
        L_0x0034:
            float r0 = r13.mo32831b()
            int r0 = (int) r0
            int r0 = r0 + r14
            com.google.zxing.u.b r14 = r12.f24052a
            int r14 = r14.mo33001e()
            if (r0 < r14) goto L_0x004a
            com.google.zxing.u.b r14 = r12.f24052a
            int r14 = r14.mo33001e()
            int r0 = r14 + -1
        L_0x004a:
            com.google.zxing.p r14 = new com.google.zxing.p
            float r13 = r13.mo32830a()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            r12.m42842i()
            com.google.zxing.z.e.c r13 = new com.google.zxing.z.e.c
            com.google.zxing.u.b r7 = r12.f24052a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p350z.p351e.C9167c.mo33215a(int, int, boolean):com.google.zxing.z.e.c");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8987p mo33214a() {
        return this.f24054c;
    }
}
