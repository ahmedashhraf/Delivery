package com.google.zxing.p350z.p351e;

import com.google.zxing.C8987p;

/* renamed from: com.google.zxing.z.e.h */
/* compiled from: DetectionResultRowIndicatorColumn */
final class C9174h extends C9173g {

    /* renamed from: d */
    private final boolean f24100d;

    C9174h(C9167c cVar, boolean z) {
        super(cVar);
        this.f24100d = z;
    }

    /* renamed from: b */
    private void m42893b(C9165a aVar) {
        C9167c a = mo33243a();
        C8987p g = this.f24100d ? a.mo33221g() : a.mo33222h();
        C8987p a2 = this.f24100d ? a.mo33214a() : a.mo33216b();
        int c = mo33248c((int) a2.mo32831b());
        C9168d[] b = mo33247b();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int c2 = mo33248c((int) g.mo32831b()); c2 < c; c2++) {
            if (b[c2] != null) {
                C9168d dVar = b[c2];
                dVar.mo33232h();
                int c3 = dVar.mo33227c() - i;
                if (c3 == 0) {
                    i2++;
                } else {
                    if (c3 == 1) {
                        i3 = Math.max(i3, i2);
                        i = dVar.mo33227c();
                    } else if (dVar.mo33227c() >= aVar.mo33208c()) {
                        b[c2] = null;
                    } else {
                        i = dVar.mo33227c();
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: f */
    private void m42894f() {
        C9168d[] b;
        for (C9168d dVar : mo33247b()) {
            if (dVar != null) {
                dVar.mo33232h();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33250a(C9165a aVar) {
        C9168d[] b = mo33247b();
        m42894f();
        m42892a(b, aVar);
        C9167c a = mo33243a();
        C8987p g = this.f24100d ? a.mo33221g() : a.mo33222h();
        C8987p a2 = this.f24100d ? a.mo33214a() : a.mo33216b();
        int c = mo33248c((int) g.mo32831b());
        int c2 = mo33248c((int) a2.mo32831b());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (c < c2) {
            if (b[c] != null) {
                C9168d dVar = b[c];
                int c3 = dVar.mo33227c() - i;
                if (c3 == 0) {
                    i2++;
                } else {
                    if (c3 == 1) {
                        i3 = Math.max(i3, i2);
                        i = dVar.mo33227c();
                    } else if (c3 < 0 || dVar.mo33227c() >= aVar.mo33208c() || c3 > c) {
                        b[c] = null;
                    } else {
                        if (i3 > 2) {
                            c3 *= i3 - 2;
                        }
                        boolean z = c3 >= c;
                        for (int i4 = 1; i4 <= c3 && !z; i4++) {
                            z = b[c - i4] != null;
                        }
                        if (z) {
                            b[c] = null;
                        } else {
                            i = dVar.mo33227c();
                        }
                    }
                    i2 = 1;
                }
            }
            c++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C9165a mo33251c() {
        C9168d[] b = mo33247b();
        C9166b bVar = new C9166b();
        C9166b bVar2 = new C9166b();
        C9166b bVar3 = new C9166b();
        C9166b bVar4 = new C9166b();
        for (C9168d dVar : b) {
            if (dVar != null) {
                dVar.mo33232h();
                int e = dVar.mo33229e() % 30;
                int c = dVar.mo33227c();
                if (!this.f24100d) {
                    c += 2;
                }
                int i = c % 3;
                if (i == 0) {
                    bVar2.mo33213b((e * 3) + 1);
                } else if (i == 1) {
                    bVar4.mo33213b(e / 3);
                    bVar3.mo33213b(e % 3);
                } else if (i == 2) {
                    bVar.mo33213b(e + 1);
                }
            }
        }
        if (bVar.mo33212a().length == 0 || bVar2.mo33212a().length == 0 || bVar3.mo33212a().length == 0 || bVar4.mo33212a().length == 0 || bVar.mo33212a()[0] <= 0 || bVar2.mo33212a()[0] + bVar3.mo33212a()[0] < 3 || bVar2.mo33212a()[0] + bVar3.mo33212a()[0] > 90) {
            return null;
        }
        C9165a aVar = new C9165a(bVar.mo33212a()[0], bVar2.mo33212a()[0], bVar3.mo33212a()[0], bVar4.mo33212a()[0]);
        m42892a(b, aVar);
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int[] mo33252d() {
        C9168d[] b;
        C9165a c = mo33251c();
        if (c == null) {
            return null;
        }
        m42893b(c);
        int[] iArr = new int[c.mo33208c()];
        for (C9168d dVar : mo33247b()) {
            if (dVar != null) {
                int c2 = dVar.mo33227c();
                if (c2 < iArr.length) {
                    iArr[c2] = iArr[c2] + 1;
                }
            }
        }
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo33253e() {
        return this.f24100d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IsLeft: ");
        sb.append(this.f24100d);
        sb.append(10);
        sb.append(super.toString());
        return sb.toString();
    }

    /* renamed from: a */
    private void m42892a(C9168d[] dVarArr, C9165a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            C9168d dVar = dVarArr[i];
            if (dVarArr[i] != null) {
                int e = dVar.mo33229e() % 30;
                int c = dVar.mo33227c();
                if (c > aVar.mo33208c()) {
                    dVarArr[i] = null;
                } else {
                    if (!this.f24100d) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != aVar.mo33206a()) {
                                dVarArr[i] = null;
                            }
                        } else if (e / 3 != aVar.mo33207b() || e % 3 != aVar.mo33209d()) {
                            dVarArr[i] = null;
                        }
                    } else if ((e * 3) + 1 != aVar.mo33210e()) {
                        dVarArr[i] = null;
                    }
                }
            }
        }
    }
}
