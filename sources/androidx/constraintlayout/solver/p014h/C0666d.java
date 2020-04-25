package androidx.constraintlayout.solver.p014h;

import androidx.constraintlayout.solver.p014h.C0677h.C0680c;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.h.d */
/* compiled from: ChainHead */
public class C0666d {

    /* renamed from: a */
    protected C0677h f2673a;

    /* renamed from: b */
    protected C0677h f2674b;

    /* renamed from: c */
    protected C0677h f2675c;

    /* renamed from: d */
    protected C0677h f2676d;

    /* renamed from: e */
    protected C0677h f2677e;

    /* renamed from: f */
    protected C0677h f2678f;

    /* renamed from: g */
    protected C0677h f2679g;

    /* renamed from: h */
    protected ArrayList<C0677h> f2680h;

    /* renamed from: i */
    protected int f2681i;

    /* renamed from: j */
    protected int f2682j;

    /* renamed from: k */
    protected float f2683k = 0.0f;

    /* renamed from: l */
    private int f2684l;

    /* renamed from: m */
    private boolean f2685m = false;

    /* renamed from: n */
    protected boolean f2686n;

    /* renamed from: o */
    protected boolean f2687o;

    /* renamed from: p */
    protected boolean f2688p;

    /* renamed from: q */
    private boolean f2689q;

    public C0666d(C0677h hVar, int i, boolean z) {
        this.f2673a = hVar;
        this.f2684l = i;
        this.f2685m = z;
    }

    /* renamed from: a */
    private static boolean m3651a(C0677h hVar, int i) {
        if (hVar.mo3592T() != 8 && hVar.f2761E[i] == C0680c.MATCH_CONSTRAINT) {
            int[] iArr = hVar.f2795g;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    private void m3652j() {
        int i = this.f2684l * 2;
        boolean z = false;
        C0677h hVar = this.f2673a;
        C0677h hVar2 = hVar;
        boolean z2 = false;
        while (!z2) {
            this.f2681i++;
            C0677h[] hVarArr = hVar.f2834z0;
            int i2 = this.f2684l;
            C0677h hVar3 = null;
            hVarArr[i2] = null;
            hVar.f2832y0[i2] = null;
            if (hVar.mo3592T() != 8) {
                if (this.f2674b == null) {
                    this.f2674b = hVar;
                }
                this.f2676d = hVar;
                C0680c[] cVarArr = hVar.f2761E;
                int i3 = this.f2684l;
                if (cVarArr[i3] == C0680c.MATCH_CONSTRAINT) {
                    int[] iArr = hVar.f2795g;
                    if (iArr[i3] == 0 || iArr[i3] == 3 || iArr[i3] == 2) {
                        this.f2682j++;
                        float[] fArr = hVar.f2830x0;
                        int i4 = this.f2684l;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.f2683k += fArr[i4];
                        }
                        if (m3651a(hVar, this.f2684l)) {
                            if (f < 0.0f) {
                                this.f2686n = true;
                            } else {
                                this.f2687o = true;
                            }
                            if (this.f2680h == null) {
                                this.f2680h = new ArrayList<>();
                            }
                            this.f2680h.add(hVar);
                        }
                        if (this.f2678f == null) {
                            this.f2678f = hVar;
                        }
                        C0677h hVar4 = this.f2679g;
                        if (hVar4 != null) {
                            hVar4.f2832y0[this.f2684l] = hVar;
                        }
                        this.f2679g = hVar;
                    }
                }
            }
            if (hVar2 != hVar) {
                hVar2.f2834z0[this.f2684l] = hVar;
            }
            C0667e eVar = hVar.f2759C[i + 1].f2698d;
            if (eVar != null) {
                C0677h hVar5 = eVar.f2696b;
                C0667e[] eVarArr = hVar5.f2759C;
                if (eVarArr[i].f2698d != null && eVarArr[i].f2698d.f2696b == hVar) {
                    hVar3 = hVar5;
                }
            }
            if (hVar3 == null) {
                hVar3 = hVar;
                z2 = true;
            }
            hVar2 = hVar;
            hVar = hVar3;
        }
        this.f2675c = hVar;
        if (this.f2684l != 0 || !this.f2685m) {
            this.f2677e = this.f2673a;
        } else {
            this.f2677e = this.f2675c;
        }
        if (this.f2687o && this.f2686n) {
            z = true;
        }
        this.f2688p = z;
    }

    /* renamed from: b */
    public C0677h mo3513b() {
        return this.f2673a;
    }

    /* renamed from: c */
    public C0677h mo3514c() {
        return this.f2678f;
    }

    /* renamed from: d */
    public C0677h mo3515d() {
        return this.f2674b;
    }

    /* renamed from: e */
    public C0677h mo3516e() {
        return this.f2677e;
    }

    /* renamed from: f */
    public C0677h mo3517f() {
        return this.f2675c;
    }

    /* renamed from: g */
    public C0677h mo3518g() {
        return this.f2679g;
    }

    /* renamed from: h */
    public C0677h mo3519h() {
        return this.f2676d;
    }

    /* renamed from: i */
    public float mo3520i() {
        return this.f2683k;
    }

    /* renamed from: a */
    public void mo3512a() {
        if (!this.f2689q) {
            m3652j();
        }
        this.f2689q = true;
    }
}
