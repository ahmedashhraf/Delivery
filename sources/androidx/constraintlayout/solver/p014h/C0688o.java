package androidx.constraintlayout.solver.p014h;

import androidx.constraintlayout.solver.C0654d;
import androidx.constraintlayout.solver.C0656e;
import androidx.constraintlayout.solver.C0660g;
import androidx.constraintlayout.solver.p014h.C0667e.C0671d;

/* renamed from: androidx.constraintlayout.solver.h.o */
/* compiled from: ResolutionAnchor */
public class C0688o extends C0690q {

    /* renamed from: s */
    public static final int f2909s = 0;

    /* renamed from: t */
    public static final int f2910t = 1;

    /* renamed from: u */
    public static final int f2911u = 2;

    /* renamed from: v */
    public static final int f2912v = 3;

    /* renamed from: w */
    public static final int f2913w = 4;

    /* renamed from: x */
    public static final int f2914x = 5;

    /* renamed from: f */
    C0667e f2915f;

    /* renamed from: g */
    float f2916g;

    /* renamed from: h */
    C0688o f2917h;

    /* renamed from: i */
    float f2918i;

    /* renamed from: j */
    C0688o f2919j;

    /* renamed from: k */
    float f2920k;

    /* renamed from: l */
    int f2921l = 0;

    /* renamed from: m */
    private C0688o f2922m;

    /* renamed from: n */
    private float f2923n;

    /* renamed from: o */
    private C0689p f2924o = null;

    /* renamed from: p */
    private int f2925p = 1;

    /* renamed from: q */
    private C0689p f2926q = null;

    /* renamed from: r */
    private int f2927r = 1;

    public C0688o(C0667e eVar) {
        this.f2915f = eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo3758a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: a */
    public void mo3764a(C0689p pVar) {
        C0689p pVar2 = this.f2924o;
        if (pVar2 == pVar) {
            this.f2924o = null;
            this.f2918i = (float) this.f2925p;
        } else if (pVar2 == this.f2926q) {
            this.f2926q = null;
            this.f2923n = (float) this.f2927r;
        }
        mo3769f();
    }

    /* renamed from: b */
    public void mo3765b(int i) {
        this.f2921l = i;
    }

    /* renamed from: e */
    public void mo3768e() {
        super.mo3768e();
        this.f2917h = null;
        this.f2918i = 0.0f;
        this.f2924o = null;
        this.f2925p = 1;
        this.f2926q = null;
        this.f2927r = 1;
        this.f2919j = null;
        this.f2920k = 0.0f;
        this.f2916g = 0.0f;
        this.f2922m = null;
        this.f2923n = 0.0f;
        this.f2921l = 0;
    }

    /* renamed from: f */
    public void mo3769f() {
        float f;
        float f2;
        float f3;
        float f4;
        boolean z = true;
        if (this.f2933b != 1 && this.f2921l != 4) {
            C0689p pVar = this.f2924o;
            if (pVar != null) {
                if (pVar.f2933b == 1) {
                    this.f2918i = ((float) this.f2925p) * pVar.f2928f;
                } else {
                    return;
                }
            }
            C0689p pVar2 = this.f2926q;
            if (pVar2 != null) {
                if (pVar2.f2933b == 1) {
                    this.f2923n = ((float) this.f2927r) * pVar2.f2928f;
                } else {
                    return;
                }
            }
            if (this.f2921l == 1) {
                C0688o oVar = this.f2917h;
                if (oVar == null || oVar.f2933b == 1) {
                    C0688o oVar2 = this.f2917h;
                    if (oVar2 == null) {
                        this.f2919j = this;
                        this.f2920k = this.f2918i;
                    } else {
                        this.f2919j = oVar2.f2919j;
                        this.f2920k = oVar2.f2920k + this.f2918i;
                    }
                    mo3775a();
                }
            }
            if (this.f2921l == 2) {
                C0688o oVar3 = this.f2917h;
                if (oVar3 != null && oVar3.f2933b == 1) {
                    C0688o oVar4 = this.f2922m;
                    if (oVar4 != null) {
                        C0688o oVar5 = oVar4.f2917h;
                        if (oVar5 != null && oVar5.f2933b == 1) {
                            if (C0654d.m3572q() != null) {
                                C0656e q = C0654d.m3572q();
                                q.f2632w++;
                            }
                            this.f2919j = this.f2917h.f2919j;
                            C0688o oVar6 = this.f2922m;
                            oVar6.f2919j = oVar6.f2917h.f2919j;
                            C0671d dVar = this.f2915f.f2697c;
                            int i = 0;
                            if (!(dVar == C0671d.RIGHT || dVar == C0671d.BOTTOM)) {
                                z = false;
                            }
                            if (z) {
                                f2 = this.f2917h.f2920k;
                                f = this.f2922m.f2917h.f2920k;
                            } else {
                                f2 = this.f2922m.f2917h.f2920k;
                                f = this.f2917h.f2920k;
                            }
                            float f5 = f2 - f;
                            C0667e eVar = this.f2915f;
                            C0671d dVar2 = eVar.f2697c;
                            if (dVar2 == C0671d.LEFT || dVar2 == C0671d.RIGHT) {
                                f4 = f5 - ((float) this.f2915f.f2696b.mo3593U());
                                f3 = this.f2915f.f2696b.f2782Z;
                            } else {
                                f4 = f5 - ((float) eVar.f2696b.mo3688q());
                                f3 = this.f2915f.f2696b.f2784a0;
                            }
                            int c = this.f2915f.mo3536c();
                            int c2 = this.f2922m.f2915f.mo3536c();
                            if (this.f2915f.mo3546k() == this.f2922m.f2915f.mo3546k()) {
                                f3 = 0.5f;
                                c2 = 0;
                            } else {
                                i = c;
                            }
                            float f6 = (float) i;
                            float f7 = (float) c2;
                            float f8 = (f4 - f6) - f7;
                            if (z) {
                                C0688o oVar7 = this.f2922m;
                                oVar7.f2920k = oVar7.f2917h.f2920k + f7 + (f8 * f3);
                                this.f2920k = (this.f2917h.f2920k - f6) - (f8 * (1.0f - f3));
                            } else {
                                this.f2920k = this.f2917h.f2920k + f6 + (f8 * f3);
                                C0688o oVar8 = this.f2922m;
                                oVar8.f2920k = (oVar8.f2917h.f2920k - f7) - (f8 * (1.0f - f3));
                            }
                            mo3775a();
                            this.f2922m.mo3775a();
                        }
                    }
                }
            }
            if (this.f2921l == 3) {
                C0688o oVar9 = this.f2917h;
                if (oVar9 != null && oVar9.f2933b == 1) {
                    C0688o oVar10 = this.f2922m;
                    if (oVar10 != null) {
                        C0688o oVar11 = oVar10.f2917h;
                        if (oVar11 != null && oVar11.f2933b == 1) {
                            if (C0654d.m3572q() != null) {
                                C0656e q2 = C0654d.m3572q();
                                q2.f2633x++;
                            }
                            C0688o oVar12 = this.f2917h;
                            this.f2919j = oVar12.f2919j;
                            C0688o oVar13 = this.f2922m;
                            C0688o oVar14 = oVar13.f2917h;
                            oVar13.f2919j = oVar14.f2919j;
                            this.f2920k = oVar12.f2920k + this.f2918i;
                            oVar13.f2920k = oVar14.f2920k + oVar13.f2918i;
                            mo3775a();
                            this.f2922m.mo3775a();
                        }
                    }
                }
            }
            if (this.f2921l == 5) {
                this.f2915f.f2696b.mo3509o0();
            }
        }
    }

    /* renamed from: g */
    public float mo3770g() {
        return this.f2920k;
    }

    /* renamed from: h */
    public void mo3771h() {
        C0667e k = this.f2915f.mo3546k();
        if (k != null) {
            if (k.mo3546k() == this.f2915f) {
                this.f2921l = 4;
                k.mo3542g().f2921l = 4;
            }
            int c = this.f2915f.mo3536c();
            C0671d dVar = this.f2915f.f2697c;
            if (dVar == C0671d.RIGHT || dVar == C0671d.BOTTOM) {
                c = -c;
            }
            mo3762a(k.mo3542g(), c);
        }
    }

    public String toString() {
        if (this.f2933b == 1) {
            String str = ", RESOLVED: ";
            String str2 = "[";
            if (this.f2919j == this) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f2915f);
                sb.append(str);
                sb.append(this.f2920k);
                sb.append("]  type: ");
                sb.append(mo3758a(this.f2921l));
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(this.f2915f);
            sb2.append(str);
            sb2.append(this.f2919j);
            sb2.append(":");
            sb2.append(this.f2920k);
            sb2.append("] type: ");
            sb2.append(mo3758a(this.f2921l));
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("{ ");
        sb3.append(this.f2915f);
        sb3.append(" UNRESOLVED} type: ");
        sb3.append(mo3758a(this.f2921l));
        return sb3.toString();
    }

    /* renamed from: b */
    public void mo3766b(C0688o oVar, float f) {
        this.f2922m = oVar;
        this.f2923n = f;
    }

    /* renamed from: b */
    public void mo3767b(C0688o oVar, int i, C0689p pVar) {
        this.f2922m = oVar;
        this.f2926q = pVar;
        this.f2927r = i;
    }

    /* renamed from: a */
    public void mo3761a(C0688o oVar, float f) {
        if (this.f2933b == 0 || !(this.f2919j == oVar || this.f2920k == f)) {
            this.f2919j = oVar;
            this.f2920k = f;
            if (this.f2933b == 1) {
                mo3777b();
            }
            mo3775a();
        }
    }

    /* renamed from: a */
    public void mo3759a(int i, C0688o oVar, int i2) {
        this.f2921l = i;
        this.f2917h = oVar;
        this.f2918i = (float) i2;
        this.f2917h.mo3776a((C0690q) this);
    }

    /* renamed from: a */
    public void mo3762a(C0688o oVar, int i) {
        this.f2917h = oVar;
        this.f2918i = (float) i;
        this.f2917h.mo3776a((C0690q) this);
    }

    /* renamed from: a */
    public void mo3763a(C0688o oVar, int i, C0689p pVar) {
        this.f2917h = oVar;
        this.f2917h.mo3776a((C0690q) this);
        this.f2924o = pVar;
        this.f2925p = i;
        this.f2924o.mo3776a((C0690q) this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3760a(C0654d dVar) {
        C0660g i = this.f2915f.mo3544i();
        C0688o oVar = this.f2919j;
        if (oVar == null) {
            dVar.mo3466a(i, (int) (this.f2920k + 0.5f));
        } else {
            dVar.mo3457a(i, dVar.mo3460a((Object) oVar.f2915f), (int) (this.f2920k + 0.5f), 6);
        }
    }
}
