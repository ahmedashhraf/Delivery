package androidx.constraintlayout.solver.p014h;

import androidx.constraintlayout.solver.C0654d;
import androidx.constraintlayout.solver.C0660g;
import androidx.constraintlayout.solver.p014h.C0667e.C0671d;
import androidx.constraintlayout.solver.p014h.C0677h.C0680c;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.h.k */
/* compiled from: Guideline */
public class C0683k extends C0677h {

    /* renamed from: l1 */
    public static final int f2875l1 = 0;

    /* renamed from: m1 */
    public static final int f2876m1 = 1;

    /* renamed from: n1 */
    public static final int f2877n1 = 0;

    /* renamed from: o1 */
    public static final int f2878o1 = 1;

    /* renamed from: p1 */
    public static final int f2879p1 = 2;

    /* renamed from: q1 */
    public static final int f2880q1 = -1;

    /* renamed from: c1 */
    protected float f2881c1 = -1.0f;

    /* renamed from: d1 */
    protected int f2882d1 = -1;

    /* renamed from: e1 */
    protected int f2883e1 = -1;

    /* renamed from: f1 */
    private C0667e f2884f1 = this.f2825v;

    /* renamed from: g1 */
    private int f2885g1;

    /* renamed from: h1 */
    private boolean f2886h1;

    /* renamed from: i1 */
    private int f2887i1;

    /* renamed from: j1 */
    private C0687n f2888j1;

    /* renamed from: k1 */
    private int f2889k1;

    /* renamed from: androidx.constraintlayout.solver.h.k$a */
    /* compiled from: Guideline */
    static /* synthetic */ class C0684a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2890a = new int[C0671d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.constraintlayout.solver.h.e$d[] r0 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2890a = r0
                int[] r0 = f2890a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.LEFT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f2890a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.RIGHT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f2890a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.TOP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f2890a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f2890a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.BASELINE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f2890a     // Catch:{ NoSuchFieldError -> 0x004b }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.CENTER     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f2890a     // Catch:{ NoSuchFieldError -> 0x0056 }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f2890a     // Catch:{ NoSuchFieldError -> 0x0062 }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f2890a     // Catch:{ NoSuchFieldError -> 0x006e }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.NONE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.p014h.C0683k.C0684a.<clinit>():void");
        }
    }

    public C0683k() {
        this.f2885g1 = 0;
        this.f2886h1 = false;
        this.f2887i1 = 0;
        this.f2888j1 = new C0687n();
        this.f2889k1 = 8;
        this.f2760D.clear();
        this.f2760D.add(this.f2884f1);
        int length = this.f2759C.length;
        for (int i = 0; i < length; i++) {
            this.f2759C[i] = this.f2884f1;
        }
    }

    /* renamed from: A */
    public void mo3734A(int i) {
        if (i > -1) {
            this.f2881c1 = -1.0f;
            this.f2882d1 = -1;
            this.f2883e1 = i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A0 */
    public void mo3735A0() {
        int U = mo3580G().mo3593U() - mo3596X();
        if (this.f2885g1 == 0) {
            U = mo3580G().mo3688q() - mo3597Y();
        }
        mo3734A(U);
    }

    /* renamed from: B */
    public void mo3736B(int i) {
        mo3741e(((float) i) / 100.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B0 */
    public void mo3737B0() {
        float X = ((float) mo3596X()) / ((float) mo3580G().mo3593U());
        if (this.f2885g1 == 0) {
            X = ((float) mo3597Y()) / ((float) mo3580G().mo3688q());
        }
        mo3741e(X);
    }

    /* renamed from: C */
    public void mo3738C(int i) {
        this.f2887i1 = i;
    }

    /* renamed from: D */
    public void mo3739D(int i) {
        if (this.f2885g1 != i) {
            this.f2885g1 = i;
            this.f2760D.clear();
            if (this.f2885g1 == 1) {
                this.f2884f1 = this.f2823u;
            } else {
                this.f2884f1 = this.f2825v;
            }
            this.f2760D.add(this.f2884f1);
            int length = this.f2759C.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f2759C[i2] = this.f2884f1;
            }
        }
    }

    /* renamed from: O */
    public String mo3564O() {
        return "Guideline";
    }

    /* renamed from: a */
    public C0667e mo3599a(C0671d dVar) {
        switch (C0684a.f2890a[dVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f2885g1 == 1) {
                    return this.f2884f1;
                }
                break;
            case 3:
            case 4:
                if (this.f2885g1 == 0) {
                    return this.f2884f1;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(dVar.name());
    }

    /* renamed from: a */
    public boolean mo3506a() {
        return true;
    }

    /* renamed from: b */
    public void mo3628b(int i, int i2) {
        if (this.f2885g1 == 1) {
            int i3 = i - this.f2775S;
            if (this.f2882d1 != -1) {
                mo3511z(i3);
            } else if (this.f2883e1 != -1) {
                mo3734A(mo3580G().mo3593U() - i3);
            } else if (this.f2881c1 != -1.0f) {
                mo3741e(((float) i3) / ((float) mo3580G().mo3593U()));
            }
        } else {
            int i4 = i2 - this.f2776T;
            if (this.f2882d1 != -1) {
                mo3511z(i4);
            } else if (this.f2883e1 != -1) {
                mo3734A(mo3580G().mo3688q() - i4);
            } else if (this.f2881c1 != -1.0f) {
                mo3741e(((float) i4) / ((float) mo3580G().mo3688q()));
            }
        }
    }

    /* renamed from: c */
    public void mo3740c(boolean z) {
        if (this.f2886h1 != z) {
            this.f2886h1 = z;
        }
    }

    /* renamed from: e */
    public void mo3741e(float f) {
        if (f > -1.0f) {
            this.f2881c1 = f;
            this.f2882d1 = -1;
            this.f2883e1 = -1;
        }
    }

    /* renamed from: r0 */
    public void mo3742r0() {
        if (this.f2882d1 != -1) {
            mo3737B0();
        } else if (this.f2881c1 != -1.0f) {
            mo3735A0();
        } else if (this.f2883e1 != -1) {
            mo3750z0();
        }
    }

    /* renamed from: s0 */
    public C0667e mo3743s0() {
        return this.f2884f1;
    }

    /* renamed from: t0 */
    public C0687n mo3744t0() {
        C0687n nVar = this.f2888j1;
        int o = mo3683o() - this.f2889k1;
        int p = mo3685p();
        int i = this.f2889k1;
        nVar.mo3753a(o, p - (i * 2), i * 2, i * 2);
        if (mo3745u0() == 0) {
            C0687n nVar2 = this.f2888j1;
            int o2 = mo3683o() - (this.f2889k1 * 2);
            int p2 = mo3685p();
            int i2 = this.f2889k1;
            nVar2.mo3753a(o2, p2 - i2, i2 * 2, i2 * 2);
        }
        return this.f2888j1;
    }

    /* renamed from: u0 */
    public int mo3745u0() {
        return this.f2885g1;
    }

    /* renamed from: v0 */
    public int mo3746v0() {
        return this.f2882d1;
    }

    /* renamed from: w0 */
    public int mo3747w0() {
        if (this.f2881c1 != -1.0f) {
            return 0;
        }
        if (this.f2882d1 != -1) {
            return 1;
        }
        if (this.f2883e1 != -1) {
            return 2;
        }
        return -1;
    }

    /* renamed from: x0 */
    public int mo3748x0() {
        return this.f2883e1;
    }

    /* renamed from: y0 */
    public float mo3749y0() {
        return this.f2881c1;
    }

    /* renamed from: z */
    public void mo3511z(int i) {
        if (i > -1) {
            this.f2881c1 = -1.0f;
            this.f2882d1 = i;
            this.f2883e1 = -1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z0 */
    public void mo3750z0() {
        int X = mo3596X();
        if (this.f2885g1 == 0) {
            X = mo3597Y();
        }
        mo3511z(X);
    }

    /* renamed from: c */
    public ArrayList<C0667e> mo3637c() {
        return this.f2760D;
    }

    /* renamed from: c */
    public void mo3568c(C0654d dVar) {
        if (mo3580G() != null) {
            int b = dVar.mo3472b((Object) this.f2884f1);
            if (this.f2885g1 == 1) {
                mo3705x(b);
                mo3707y(0);
                mo3679m(mo3580G().mo3688q());
                mo3699u(0);
            } else {
                mo3705x(0);
                mo3707y(b);
                mo3699u(mo3580G().mo3593U());
                mo3679m(0);
            }
        }
    }

    /* renamed from: a */
    public void mo3504a(int i) {
        C0677h G = mo3580G();
        if (G != null) {
            if (mo3745u0() == 1) {
                this.f2825v.mo3542g().mo3759a(1, G.f2825v.mo3542g(), 0);
                this.f2829x.mo3542g().mo3759a(1, G.f2825v.mo3542g(), 0);
                if (this.f2882d1 != -1) {
                    this.f2823u.mo3542g().mo3759a(1, G.f2823u.mo3542g(), this.f2882d1);
                    this.f2827w.mo3542g().mo3759a(1, G.f2823u.mo3542g(), this.f2882d1);
                } else if (this.f2883e1 != -1) {
                    this.f2823u.mo3542g().mo3759a(1, G.f2827w.mo3542g(), -this.f2883e1);
                    this.f2827w.mo3542g().mo3759a(1, G.f2827w.mo3542g(), -this.f2883e1);
                } else if (this.f2881c1 != -1.0f && G.mo3698u() == C0680c.FIXED) {
                    int i2 = (int) (((float) G.f2763G) * this.f2881c1);
                    this.f2823u.mo3542g().mo3759a(1, G.f2823u.mo3542g(), i2);
                    this.f2827w.mo3542g().mo3759a(1, G.f2823u.mo3542g(), i2);
                }
            } else {
                this.f2823u.mo3542g().mo3759a(1, G.f2823u.mo3542g(), 0);
                this.f2827w.mo3542g().mo3759a(1, G.f2823u.mo3542g(), 0);
                if (this.f2882d1 != -1) {
                    this.f2825v.mo3542g().mo3759a(1, G.f2825v.mo3542g(), this.f2882d1);
                    this.f2829x.mo3542g().mo3759a(1, G.f2825v.mo3542g(), this.f2882d1);
                } else if (this.f2883e1 != -1) {
                    this.f2825v.mo3542g().mo3759a(1, G.f2829x.mo3542g(), -this.f2883e1);
                    this.f2829x.mo3542g().mo3759a(1, G.f2829x.mo3542g(), -this.f2883e1);
                } else if (this.f2881c1 != -1.0f && G.mo3591S() == C0680c.FIXED) {
                    int i3 = (int) (((float) G.f2764H) * this.f2881c1);
                    this.f2825v.mo3542g().mo3759a(1, G.f2825v.mo3542g(), i3);
                    this.f2829x.mo3542g().mo3759a(1, G.f2825v.mo3542g(), i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3505a(C0654d dVar) {
        C0681i iVar = (C0681i) mo3580G();
        if (iVar != null) {
            C0667e a = iVar.mo3599a(C0671d.LEFT);
            C0667e a2 = iVar.mo3599a(C0671d.RIGHT);
            C0677h hVar = this.f2762F;
            boolean z = hVar != null && hVar.f2761E[0] == C0680c.WRAP_CONTENT;
            if (this.f2885g1 == 0) {
                a = iVar.mo3599a(C0671d.TOP);
                a2 = iVar.mo3599a(C0671d.BOTTOM);
                C0677h hVar2 = this.f2762F;
                z = hVar2 != null && hVar2.f2761E[1] == C0680c.WRAP_CONTENT;
            }
            if (this.f2882d1 != -1) {
                C0660g a3 = dVar.mo3460a((Object) this.f2884f1);
                dVar.mo3457a(a3, dVar.mo3460a((Object) a), this.f2882d1, 6);
                if (z) {
                    dVar.mo3475b(dVar.mo3460a((Object) a2), a3, 0, 5);
                }
            } else if (this.f2883e1 != -1) {
                C0660g a4 = dVar.mo3460a((Object) this.f2884f1);
                C0660g a5 = dVar.mo3460a((Object) a2);
                dVar.mo3457a(a4, a5, -this.f2883e1, 6);
                if (z) {
                    dVar.mo3475b(a4, dVar.mo3460a((Object) a), 0, 5);
                    dVar.mo3475b(a5, a4, 0, 5);
                }
            } else if (this.f2881c1 != -1.0f) {
                dVar.mo3462a(C0654d.m3557a(dVar, dVar.mo3460a((Object) this.f2884f1), dVar.mo3460a((Object) a), dVar.mo3460a((Object) a2), this.f2881c1, this.f2886h1));
            }
        }
    }
}
