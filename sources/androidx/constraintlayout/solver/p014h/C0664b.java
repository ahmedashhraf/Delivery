package androidx.constraintlayout.solver.p014h;

import androidx.constraintlayout.solver.C0654d;
import androidx.constraintlayout.solver.C0656e;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.h.b */
/* compiled from: Barrier */
public class C0664b extends C0685l {

    /* renamed from: h1 */
    public static final int f2665h1 = 0;

    /* renamed from: i1 */
    public static final int f2666i1 = 1;

    /* renamed from: j1 */
    public static final int f2667j1 = 2;

    /* renamed from: k1 */
    public static final int f2668k1 = 3;

    /* renamed from: e1 */
    private int f2669e1 = 0;

    /* renamed from: f1 */
    private ArrayList<C0688o> f2670f1 = new ArrayList<>(4);

    /* renamed from: g1 */
    private boolean f2671g1 = true;

    /* renamed from: a */
    public void mo3504a(int i) {
        C0688o oVar;
        C0690q qVar;
        C0677h hVar = this.f2762F;
        if (hVar != null && ((C0681i) hVar).mo3511z(2)) {
            int i2 = this.f2669e1;
            if (i2 == 0) {
                oVar = this.f2823u.mo3542g();
            } else if (i2 == 1) {
                oVar = this.f2827w.mo3542g();
            } else if (i2 == 2) {
                oVar = this.f2825v.mo3542g();
            } else if (i2 == 3) {
                oVar = this.f2829x.mo3542g();
            } else {
                return;
            }
            oVar.mo3765b(5);
            int i3 = this.f2669e1;
            if (i3 == 0 || i3 == 1) {
                this.f2825v.mo3542g().mo3761a((C0688o) null, 0.0f);
                this.f2829x.mo3542g().mo3761a((C0688o) null, 0.0f);
            } else {
                this.f2823u.mo3542g().mo3761a((C0688o) null, 0.0f);
                this.f2827w.mo3542g().mo3761a((C0688o) null, 0.0f);
            }
            this.f2670f1.clear();
            for (int i4 = 0; i4 < this.f2892d1; i4++) {
                C0677h hVar2 = this.f2891c1[i4];
                if (this.f2671g1 || hVar2.mo3506a()) {
                    int i5 = this.f2669e1;
                    if (i5 == 0) {
                        qVar = hVar2.f2823u.mo3542g();
                    } else if (i5 == 1) {
                        qVar = hVar2.f2827w.mo3542g();
                    } else if (i5 == 2) {
                        qVar = hVar2.f2825v.mo3542g();
                    } else if (i5 != 3) {
                        qVar = null;
                    } else {
                        qVar = hVar2.f2829x.mo3542g();
                    }
                    if (qVar != null) {
                        this.f2670f1.add(qVar);
                        qVar.mo3776a((C0690q) oVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo3506a() {
        return true;
    }

    /* renamed from: c */
    public void mo3507c(boolean z) {
        this.f2671g1 = z;
    }

    /* renamed from: n0 */
    public void mo3508n0() {
        super.mo3508n0();
        this.f2670f1.clear();
    }

    /* renamed from: o0 */
    public void mo3509o0() {
        C0688o oVar;
        float f;
        C0688o oVar2;
        int i = this.f2669e1;
        float f2 = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                oVar = this.f2827w.mo3542g();
            } else if (i == 2) {
                oVar = this.f2825v.mo3542g();
            } else if (i == 3) {
                oVar = this.f2829x.mo3542g();
            } else {
                return;
            }
            f2 = 0.0f;
        } else {
            oVar = this.f2823u.mo3542g();
        }
        int size = this.f2670f1.size();
        C0688o oVar3 = null;
        int i2 = 0;
        while (i2 < size) {
            C0688o oVar4 = (C0688o) this.f2670f1.get(i2);
            if (oVar4.f2933b == 1) {
                int i3 = this.f2669e1;
                if (i3 == 0 || i3 == 2) {
                    f = oVar4.f2920k;
                    if (f < f2) {
                        oVar2 = oVar4.f2919j;
                    } else {
                        i2++;
                    }
                } else {
                    f = oVar4.f2920k;
                    if (f > f2) {
                        oVar2 = oVar4.f2919j;
                    } else {
                        i2++;
                    }
                }
                oVar3 = oVar2;
                f2 = f;
                i2++;
            } else {
                return;
            }
        }
        if (C0654d.m3572q() != null) {
            C0656e q = C0654d.m3572q();
            q.f2635z++;
        }
        oVar.f2919j = oVar3;
        oVar.f2920k = f2;
        oVar.mo3775a();
        int i4 = this.f2669e1;
        if (i4 == 0) {
            this.f2827w.mo3542g().mo3761a(oVar3, f2);
        } else if (i4 == 1) {
            this.f2823u.mo3542g().mo3761a(oVar3, f2);
        } else if (i4 == 2) {
            this.f2829x.mo3542g().mo3761a(oVar3, f2);
        } else if (i4 == 3) {
            this.f2825v.mo3542g().mo3761a(oVar3, f2);
        }
    }

    /* renamed from: s0 */
    public boolean mo3510s0() {
        return this.f2671g1;
    }

    /* renamed from: z */
    public void mo3511z(int i) {
        this.f2669e1 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r1 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3505a(androidx.constraintlayout.solver.C0654d r11) {
        /*
            r10 = this;
            androidx.constraintlayout.solver.h.e[] r0 = r10.f2759C
            androidx.constraintlayout.solver.h.e r1 = r10.f2823u
            r2 = 0
            r0[r2] = r1
            androidx.constraintlayout.solver.h.e r1 = r10.f2825v
            r3 = 2
            r0[r3] = r1
            androidx.constraintlayout.solver.h.e r1 = r10.f2827w
            r4 = 1
            r0[r4] = r1
            androidx.constraintlayout.solver.h.e r1 = r10.f2829x
            r5 = 3
            r0[r5] = r1
            r0 = 0
        L_0x0017:
            androidx.constraintlayout.solver.h.e[] r1 = r10.f2759C
            int r6 = r1.length
            if (r0 >= r6) goto L_0x0029
            r6 = r1[r0]
            r1 = r1[r0]
            androidx.constraintlayout.solver.g r1 = r11.mo3460a(r1)
            r6.f2704j = r1
            int r0 = r0 + 1
            goto L_0x0017
        L_0x0029:
            int r0 = r10.f2669e1
            if (r0 < 0) goto L_0x013a
            r6 = 4
            if (r0 >= r6) goto L_0x013a
            r0 = r1[r0]
            r1 = 0
        L_0x0033:
            int r6 = r10.f2892d1
            if (r1 >= r6) goto L_0x0068
            androidx.constraintlayout.solver.h.h[] r6 = r10.f2891c1
            r6 = r6[r1]
            boolean r7 = r10.f2671g1
            if (r7 != 0) goto L_0x0046
            boolean r7 = r6.mo3506a()
            if (r7 != 0) goto L_0x0046
            goto L_0x0065
        L_0x0046:
            int r7 = r10.f2669e1
            if (r7 == 0) goto L_0x004c
            if (r7 != r4) goto L_0x0056
        L_0x004c:
            androidx.constraintlayout.solver.h.h$c r7 = r6.mo3698u()
            androidx.constraintlayout.solver.h.h$c r8 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_CONSTRAINT
            if (r7 != r8) goto L_0x0056
        L_0x0054:
            r1 = 1
            goto L_0x0069
        L_0x0056:
            int r7 = r10.f2669e1
            if (r7 == r3) goto L_0x005c
            if (r7 != r5) goto L_0x0065
        L_0x005c:
            androidx.constraintlayout.solver.h.h$c r6 = r6.mo3591S()
            androidx.constraintlayout.solver.h.h$c r7 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x0065
            goto L_0x0054
        L_0x0065:
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0068:
            r1 = 0
        L_0x0069:
            int r6 = r10.f2669e1
            if (r6 == 0) goto L_0x007d
            if (r6 != r4) goto L_0x0070
            goto L_0x007d
        L_0x0070:
            androidx.constraintlayout.solver.h.h r6 = r10.mo3580G()
            androidx.constraintlayout.solver.h.h$c r6 = r6.mo3591S()
            androidx.constraintlayout.solver.h.h$c r7 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            if (r6 != r7) goto L_0x008a
            goto L_0x0089
        L_0x007d:
            androidx.constraintlayout.solver.h.h r6 = r10.mo3580G()
            androidx.constraintlayout.solver.h.h$c r6 = r6.mo3698u()
            androidx.constraintlayout.solver.h.h$c r7 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            if (r6 != r7) goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            r6 = 0
        L_0x008b:
            int r7 = r10.f2892d1
            if (r6 >= r7) goto L_0x00c3
            androidx.constraintlayout.solver.h.h[] r7 = r10.f2891c1
            r7 = r7[r6]
            boolean r8 = r10.f2671g1
            if (r8 != 0) goto L_0x009e
            boolean r8 = r7.mo3506a()
            if (r8 != 0) goto L_0x009e
            goto L_0x00c0
        L_0x009e:
            androidx.constraintlayout.solver.h.e[] r8 = r7.f2759C
            int r9 = r10.f2669e1
            r8 = r8[r9]
            androidx.constraintlayout.solver.g r8 = r11.mo3460a(r8)
            androidx.constraintlayout.solver.h.e[] r7 = r7.f2759C
            int r9 = r10.f2669e1
            r7 = r7[r9]
            r7.f2704j = r8
            if (r9 == 0) goto L_0x00bb
            if (r9 != r3) goto L_0x00b5
            goto L_0x00bb
        L_0x00b5:
            androidx.constraintlayout.solver.g r7 = r0.f2704j
            r11.mo3470a(r7, r8, r1)
            goto L_0x00c0
        L_0x00bb:
            androidx.constraintlayout.solver.g r7 = r0.f2704j
            r11.mo3476b(r7, r8, r1)
        L_0x00c0:
            int r6 = r6 + 1
            goto L_0x008b
        L_0x00c3:
            int r0 = r10.f2669e1
            r6 = 5
            r7 = 6
            if (r0 != 0) goto L_0x00e4
            androidx.constraintlayout.solver.h.e r0 = r10.f2827w
            androidx.constraintlayout.solver.g r0 = r0.f2704j
            androidx.constraintlayout.solver.h.e r3 = r10.f2823u
            androidx.constraintlayout.solver.g r3 = r3.f2704j
            r11.mo3457a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013a
            androidx.constraintlayout.solver.h.e r0 = r10.f2823u
            androidx.constraintlayout.solver.g r0 = r0.f2704j
            androidx.constraintlayout.solver.h.h r1 = r10.f2762F
            androidx.constraintlayout.solver.h.e r1 = r1.f2827w
            androidx.constraintlayout.solver.g r1 = r1.f2704j
            r11.mo3457a(r0, r1, r2, r6)
            goto L_0x013a
        L_0x00e4:
            if (r0 != r4) goto L_0x0101
            androidx.constraintlayout.solver.h.e r0 = r10.f2823u
            androidx.constraintlayout.solver.g r0 = r0.f2704j
            androidx.constraintlayout.solver.h.e r3 = r10.f2827w
            androidx.constraintlayout.solver.g r3 = r3.f2704j
            r11.mo3457a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013a
            androidx.constraintlayout.solver.h.e r0 = r10.f2823u
            androidx.constraintlayout.solver.g r0 = r0.f2704j
            androidx.constraintlayout.solver.h.h r1 = r10.f2762F
            androidx.constraintlayout.solver.h.e r1 = r1.f2823u
            androidx.constraintlayout.solver.g r1 = r1.f2704j
            r11.mo3457a(r0, r1, r2, r6)
            goto L_0x013a
        L_0x0101:
            if (r0 != r3) goto L_0x011e
            androidx.constraintlayout.solver.h.e r0 = r10.f2829x
            androidx.constraintlayout.solver.g r0 = r0.f2704j
            androidx.constraintlayout.solver.h.e r3 = r10.f2825v
            androidx.constraintlayout.solver.g r3 = r3.f2704j
            r11.mo3457a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013a
            androidx.constraintlayout.solver.h.e r0 = r10.f2825v
            androidx.constraintlayout.solver.g r0 = r0.f2704j
            androidx.constraintlayout.solver.h.h r1 = r10.f2762F
            androidx.constraintlayout.solver.h.e r1 = r1.f2829x
            androidx.constraintlayout.solver.g r1 = r1.f2704j
            r11.mo3457a(r0, r1, r2, r6)
            goto L_0x013a
        L_0x011e:
            if (r0 != r5) goto L_0x013a
            androidx.constraintlayout.solver.h.e r0 = r10.f2825v
            androidx.constraintlayout.solver.g r0 = r0.f2704j
            androidx.constraintlayout.solver.h.e r3 = r10.f2829x
            androidx.constraintlayout.solver.g r3 = r3.f2704j
            r11.mo3457a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013a
            androidx.constraintlayout.solver.h.e r0 = r10.f2825v
            androidx.constraintlayout.solver.g r0 = r0.f2704j
            androidx.constraintlayout.solver.h.h r1 = r10.f2762F
            androidx.constraintlayout.solver.h.e r1 = r1.f2825v
            androidx.constraintlayout.solver.g r1 = r1.f2704j
            r11.mo3457a(r0, r1, r2, r6)
        L_0x013a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.p014h.C0664b.mo3505a(androidx.constraintlayout.solver.d):void");
    }
}
