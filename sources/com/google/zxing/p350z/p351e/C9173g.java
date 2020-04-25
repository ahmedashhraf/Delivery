package com.google.zxing.p350z.p351e;

import java.util.Formatter;

/* renamed from: com.google.zxing.z.e.g */
/* compiled from: DetectionResultColumn */
class C9173g {

    /* renamed from: c */
    private static final int f24097c = 5;

    /* renamed from: a */
    private final C9167c f24098a;

    /* renamed from: b */
    private final C9168d[] f24099b;

    C9173g(C9167c cVar) {
        this.f24098a = new C9167c(cVar);
        this.f24099b = new C9168d[((cVar.mo33218d() - cVar.mo33220f()) + 1)];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33245a(int i, C9168d dVar) {
        this.f24099b[mo33248c(i)] = dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C9168d mo33246b(int i) {
        C9168d a = mo33244a(i);
        if (a != null) {
            return a;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int c = mo33248c(i) - i2;
            if (c >= 0) {
                C9168d dVar = this.f24099b[c];
                if (dVar != null) {
                    return dVar;
                }
            }
            int c2 = mo33248c(i) + i2;
            C9168d[] dVarArr = this.f24099b;
            if (c2 < dVarArr.length) {
                C9168d dVar2 = dVarArr[c2];
                if (dVar2 != null) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo33248c(int i) {
        return i - this.f24098a.mo33220f();
    }

    public String toString() {
        C9168d[] dVarArr;
        Formatter formatter = new Formatter();
        int i = 0;
        for (C9168d dVar : this.f24099b) {
            if (dVar == null) {
                int i2 = i + 1;
                formatter.format("%3d:    |   %n", new Object[]{Integer.valueOf(i)});
                i = i2;
            } else {
                int i3 = i + 1;
                formatter.format("%3d: %3d|%3d%n", new Object[]{Integer.valueOf(i), Integer.valueOf(dVar.mo33227c()), Integer.valueOf(dVar.mo33229e())});
                i = i3;
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C9168d mo33244a(int i) {
        return this.f24099b[mo33248c(i)];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C9167c mo33243a() {
        return this.f24098a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C9168d[] mo33247b() {
        return this.f24099b;
    }
}
