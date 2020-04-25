package com.google.zxing.p350z.p351e;

import com.google.zxing.p350z.C9161a;
import java.util.Formatter;

/* renamed from: com.google.zxing.z.e.f */
/* compiled from: DetectionResult */
final class C9172f {

    /* renamed from: e */
    private static final int f24092e = 2;

    /* renamed from: a */
    private final C9165a f24093a;

    /* renamed from: b */
    private final C9173g[] f24094b = new C9173g[(this.f24096d + 2)];

    /* renamed from: c */
    private C9167c f24095c;

    /* renamed from: d */
    private final int f24096d;

    C9172f(C9165a aVar, C9167c cVar) {
        this.f24093a = aVar;
        this.f24096d = aVar.mo33206a();
        this.f24095c = cVar;
    }

    /* renamed from: a */
    private void m42871a(C9173g gVar) {
        if (gVar != null) {
            ((C9174h) gVar).mo33250a(this.f24093a);
        }
    }

    /* renamed from: f */
    private int m42873f() {
        int g = m42874g();
        if (g == 0) {
            return 0;
        }
        for (int i = 1; i < this.f24096d + 1; i++) {
            C9168d[] b = this.f24094b[i].mo33247b();
            for (int i2 = 0; i2 < b.length; i2++) {
                if (b[i2] != null && !b[i2].mo33231g()) {
                    m42870a(i, i2, b);
                }
            }
        }
        return g;
    }

    /* renamed from: g */
    private int m42874g() {
        m42875h();
        return m42876i() + m42877j();
    }

    /* renamed from: h */
    private void m42875h() {
        C9173g[] gVarArr = this.f24094b;
        if (gVarArr[0] != null && gVarArr[this.f24096d + 1] != null) {
            C9168d[] b = gVarArr[0].mo33247b();
            C9168d[] b2 = this.f24094b[this.f24096d + 1].mo33247b();
            for (int i = 0; i < b.length; i++) {
                if (!(b[i] == null || b2[i] == null || b[i].mo33227c() != b2[i].mo33227c())) {
                    for (int i2 = 1; i2 <= this.f24096d; i2++) {
                        C9168d dVar = this.f24094b[i2].mo33247b()[i];
                        if (dVar != null) {
                            dVar.mo33226b(b[i].mo33227c());
                            if (!dVar.mo33231g()) {
                                this.f24094b[i2].mo33247b()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private int m42876i() {
        C9173g[] gVarArr = this.f24094b;
        if (gVarArr[0] == null) {
            return 0;
        }
        C9168d[] b = gVarArr[0].mo33247b();
        int i = 0;
        for (int i2 = 0; i2 < b.length; i2++) {
            if (b[i2] != null) {
                int c = b[i2].mo33227c();
                int i3 = i;
                int i4 = 0;
                for (int i5 = 1; i5 < this.f24096d + 1 && i4 < 2; i5++) {
                    C9168d dVar = this.f24094b[i5].mo33247b()[i2];
                    if (dVar != null) {
                        i4 = m42869a(c, i4, dVar);
                        if (!dVar.mo33231g()) {
                            i3++;
                        }
                    }
                }
                i = i3;
            }
        }
        return i;
    }

    /* renamed from: j */
    private int m42877j() {
        C9173g[] gVarArr = this.f24094b;
        int i = this.f24096d;
        if (gVarArr[i + 1] == null) {
            return 0;
        }
        C9168d[] b = gVarArr[i + 1].mo33247b();
        int i2 = 0;
        for (int i3 = 0; i3 < b.length; i3++) {
            if (b[i3] != null) {
                int c = b[i3].mo33227c();
                int i4 = i2;
                int i5 = 0;
                for (int i6 = this.f24096d + 1; i6 > 0 && i5 < 2; i6--) {
                    C9168d dVar = this.f24094b[i6].mo33247b()[i3];
                    if (dVar != null) {
                        i5 = m42869a(c, i5, dVar);
                        if (!dVar.mo33231g()) {
                            i4++;
                        }
                    }
                }
                i2 = i4;
            }
        }
        return i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo33238b() {
        return this.f24093a.mo33207b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo33239c() {
        return this.f24093a.mo33208c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C9167c mo33240d() {
        return this.f24095c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C9173g[] mo33241e() {
        m42871a(this.f24094b[0]);
        m42871a(this.f24094b[this.f24096d + 1]);
        int i = C9161a.f24031b;
        while (true) {
            int f = m42873f();
            if (f > 0 && f < i) {
                i = f;
            }
        }
        return this.f24094b;
    }

    public String toString() {
        C9173g[] gVarArr = this.f24094b;
        C9173g gVar = gVarArr[0];
        if (gVar == null) {
            gVar = gVarArr[this.f24096d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < gVar.mo33247b().length; i++) {
            formatter.format("CW %3d:", new Object[]{Integer.valueOf(i)});
            for (int i2 = 0; i2 < this.f24096d + 2; i2++) {
                C9173g[] gVarArr2 = this.f24094b;
                String str = "    |   ";
                if (gVarArr2[i2] == null) {
                    formatter.format(str, new Object[0]);
                } else {
                    C9168d dVar = gVarArr2[i2].mo33247b()[i];
                    if (dVar == null) {
                        formatter.format(str, new Object[0]);
                    } else {
                        formatter.format(" %3d|%3d", new Object[]{Integer.valueOf(dVar.mo33227c()), Integer.valueOf(dVar.mo33229e())});
                    }
                }
            }
            formatter.format("%n", new Object[0]);
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }

    /* renamed from: a */
    private static int m42869a(int i, int i2, C9168d dVar) {
        if (dVar == null) {
            return i2;
        }
        if (!dVar.mo33231g()) {
            if (dVar.mo33224a(i)) {
                dVar.mo33226b(i);
                i2 = 0;
            } else {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private void m42870a(int i, int i2, C9168d[] dVarArr) {
        C9168d dVar = dVarArr[i2];
        C9168d[] b = this.f24094b[i - 1].mo33247b();
        C9173g[] gVarArr = this.f24094b;
        int i3 = i + 1;
        C9168d[] b2 = gVarArr[i3] != null ? gVarArr[i3].mo33247b() : b;
        C9168d[] dVarArr2 = new C9168d[14];
        dVarArr2[2] = b[i2];
        dVarArr2[3] = b2[i2];
        int i4 = 0;
        if (i2 > 0) {
            int i5 = i2 - 1;
            dVarArr2[0] = dVarArr[i5];
            dVarArr2[4] = b[i5];
            dVarArr2[5] = b2[i5];
        }
        if (i2 > 1) {
            int i6 = i2 - 2;
            dVarArr2[8] = dVarArr[i6];
            dVarArr2[10] = b[i6];
            dVarArr2[11] = b2[i6];
        }
        if (i2 < dVarArr.length - 1) {
            int i7 = i2 + 1;
            dVarArr2[1] = dVarArr[i7];
            dVarArr2[6] = b[i7];
            dVarArr2[7] = b2[i7];
        }
        if (i2 < dVarArr.length - 2) {
            int i8 = i2 + 2;
            dVarArr2[9] = dVarArr[i8];
            dVarArr2[12] = b[i8];
            dVarArr2[13] = b2[i8];
        }
        while (i4 < 14 && !m42872a(dVar, dVarArr2[i4])) {
            i4++;
        }
    }

    /* renamed from: a */
    private static boolean m42872a(C9168d dVar, C9168d dVar2) {
        if (dVar2 == null || !dVar2.mo33231g() || dVar2.mo33223a() != dVar.mo33223a()) {
            return false;
        }
        dVar.mo33226b(dVar2.mo33227c());
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo33234a() {
        return this.f24096d;
    }

    /* renamed from: a */
    public void mo33237a(C9167c cVar) {
        this.f24095c = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33236a(int i, C9173g gVar) {
        this.f24094b[i] = gVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9173g mo33235a(int i) {
        return this.f24094b[i];
    }
}
