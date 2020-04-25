package androidx.constraintlayout.solver.p014h;

import androidx.constraintlayout.solver.C0654d;
import androidx.constraintlayout.solver.C0656e;
import androidx.constraintlayout.solver.p014h.C0667e.C0671d;
import androidx.constraintlayout.solver.p014h.C0677h.C0680c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.constraintlayout.solver.h.i */
/* compiled from: ConstraintWidgetContainer */
public class C0681i extends C0693s {

    /* renamed from: A1 */
    private static final int f2837A1 = 8;

    /* renamed from: B1 */
    private static final boolean f2838B1 = false;

    /* renamed from: C1 */
    private static final boolean f2839C1 = false;

    /* renamed from: D1 */
    static final boolean f2840D1 = false;

    /* renamed from: z1 */
    private static final boolean f2841z1 = true;

    /* renamed from: d1 */
    private boolean f2842d1 = false;

    /* renamed from: e1 */
    protected C0654d f2843e1 = new C0654d();

    /* renamed from: f1 */
    private C0691r f2844f1;

    /* renamed from: g1 */
    int f2845g1;

    /* renamed from: h1 */
    int f2846h1;

    /* renamed from: i1 */
    int f2847i1;

    /* renamed from: j1 */
    int f2848j1;

    /* renamed from: k1 */
    int f2849k1 = 0;

    /* renamed from: l1 */
    int f2850l1 = 0;

    /* renamed from: m1 */
    C0666d[] f2851m1 = new C0666d[4];

    /* renamed from: n1 */
    C0666d[] f2852n1 = new C0666d[4];

    /* renamed from: o1 */
    public List<C0682j> f2853o1 = new ArrayList();

    /* renamed from: p1 */
    public boolean f2854p1 = false;

    /* renamed from: q1 */
    public boolean f2855q1 = false;

    /* renamed from: r1 */
    public boolean f2856r1 = false;

    /* renamed from: s1 */
    public int f2857s1 = 0;

    /* renamed from: t1 */
    public int f2858t1 = 0;

    /* renamed from: u1 */
    private int f2859u1 = 7;

    /* renamed from: v1 */
    public boolean f2860v1 = false;

    /* renamed from: w1 */
    private boolean f2861w1 = false;

    /* renamed from: x1 */
    private boolean f2862x1 = false;

    /* renamed from: y1 */
    int f2863y1 = 0;

    public C0681i() {
    }

    /* renamed from: J0 */
    private void mo3559J0() {
        this.f2849k1 = 0;
        this.f2850l1 = 0;
    }

    /* renamed from: h */
    private void m3867h(C0677h hVar) {
        int i = this.f2849k1 + 1;
        C0666d[] dVarArr = this.f2852n1;
        if (i >= dVarArr.length) {
            this.f2852n1 = (C0666d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f2852n1[this.f2849k1] = new C0666d(hVar, 0, mo3711C0());
        this.f2849k1++;
    }

    /* renamed from: A */
    public void mo3709A(int i) {
        this.f2859u1 = i;
    }

    /* renamed from: A0 */
    public boolean mo3553A0() {
        return false;
    }

    /* renamed from: B0 */
    public boolean mo3710B0() {
        return this.f2862x1;
    }

    /* renamed from: C0 */
    public boolean mo3711C0() {
        return this.f2842d1;
    }

    /* renamed from: D0 */
    public boolean mo3712D0() {
        return this.f2861w1;
    }

    /* renamed from: E0 */
    public void mo3713E0() {
        if (!mo3511z(8)) {
            mo3504a(this.f2859u1);
        }
        mo3717I0();
    }

    /* renamed from: F0 */
    public void mo3714F0() {
        int size = this.f2944c1.size();
        mo3508n0();
        for (int i = 0; i < size; i++) {
            ((C0677h) this.f2944c1.get(i)).mo3508n0();
        }
    }

    /* renamed from: G0 */
    public void mo3715G0() {
        mo3714F0();
        mo3504a(this.f2859u1);
    }

    /* renamed from: H0 */
    public void mo3716H0() {
        C0688o g = mo3599a(C0671d.LEFT).mo3542g();
        C0688o g2 = mo3599a(C0671d.TOP).mo3542g();
        g.mo3778c();
        g2.mo3778c();
        g.mo3761a((C0688o) null, 0.0f);
        g2.mo3761a((C0688o) null, 0.0f);
    }

    /* renamed from: I0 */
    public void mo3717I0() {
        C0688o g = mo3599a(C0671d.LEFT).mo3542g();
        C0688o g2 = mo3599a(C0671d.TOP).mo3542g();
        g.mo3761a((C0688o) null, 0.0f);
        g2.mo3761a((C0688o) null, 0.0f);
    }

    /* renamed from: O */
    public String mo3564O() {
        return "ConstraintLayout";
    }

    /* renamed from: a */
    public void mo3719a(C0656e eVar) {
        this.f2843e1.mo3465a(eVar);
    }

    /* renamed from: c */
    public void mo3721c(int i, int i2, int i3, int i4) {
        this.f2845g1 = i;
        this.f2846h1 = i2;
        this.f2847i1 = i3;
        this.f2848j1 = i4;
    }

    /* renamed from: d */
    public boolean mo3723d(C0654d dVar) {
        mo3505a(dVar);
        int size = this.f2944c1.size();
        for (int i = 0; i < size; i++) {
            C0677h hVar = (C0677h) this.f2944c1.get(i);
            if (hVar instanceof C0681i) {
                C0680c[] cVarArr = hVar.f2761E;
                C0680c cVar = cVarArr[0];
                C0680c cVar2 = cVarArr[1];
                if (cVar == C0680c.WRAP_CONTENT) {
                    hVar.mo3617a(C0680c.FIXED);
                }
                if (cVar2 == C0680c.WRAP_CONTENT) {
                    hVar.mo3631b(C0680c.FIXED);
                }
                hVar.mo3505a(dVar);
                if (cVar == C0680c.WRAP_CONTENT) {
                    hVar.mo3617a(cVar);
                }
                if (cVar2 == C0680c.WRAP_CONTENT) {
                    hVar.mo3631b(cVar2);
                }
            } else {
                C0686m.m3933a(this, dVar, hVar);
                hVar.mo3505a(dVar);
            }
        }
        if (this.f2849k1 > 0) {
            C0665c.m3649a(this, dVar, 0);
        }
        if (this.f2850l1 > 0) {
            C0665c.m3649a(this, dVar, 1);
        }
        return true;
    }

    /* renamed from: i */
    public void mo3724i(int i, int i2) {
        if (this.f2761E[0] != C0680c.WRAP_CONTENT) {
            C0689p pVar = this.f2787c;
            if (pVar != null) {
                pVar.mo3773a(i);
            }
        }
        if (this.f2761E[1] != C0680c.WRAP_CONTENT) {
            C0689p pVar2 = this.f2789d;
            if (pVar2 != null) {
                pVar2.mo3773a(i2);
            }
        }
    }

    /* renamed from: k0 */
    public void mo3674k0() {
        this.f2843e1.mo3488m();
        this.f2845g1 = 0;
        this.f2847i1 = 0;
        this.f2846h1 = 0;
        this.f2848j1 = 0;
        this.f2853o1.clear();
        this.f2860v1 = false;
        super.mo3674k0();
    }

    /* JADX WARNING: type inference failed for: r8v15, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r8v48 */
    /* JADX WARNING: type inference failed for: r8v49 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v15, types: [boolean]
      assigns: []
      uses: [?[int, short, byte, char], boolean]
      mth insns count: 342
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01da  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3725t0() {
        /*
            r21 = this;
            r1 = r21
            int r2 = r1.f2767K
            int r3 = r1.f2768L
            int r0 = r21.mo3593U()
            r4 = 0
            int r5 = java.lang.Math.max(r4, r0)
            int r0 = r21.mo3688q()
            int r6 = java.lang.Math.max(r4, r0)
            r1.f2861w1 = r4
            r1.f2862x1 = r4
            androidx.constraintlayout.solver.h.h r0 = r1.f2762F
            if (r0 == 0) goto L_0x0046
            androidx.constraintlayout.solver.h.r r0 = r1.f2844f1
            if (r0 != 0) goto L_0x002a
            androidx.constraintlayout.solver.h.r r0 = new androidx.constraintlayout.solver.h.r
            r0.<init>(r1)
            r1.f2844f1 = r0
        L_0x002a:
            androidx.constraintlayout.solver.h.r r0 = r1.f2844f1
            r0.mo3781b(r1)
            int r0 = r1.f2845g1
            r1.mo3705x(r0)
            int r0 = r1.f2846h1
            r1.mo3707y(r0)
            r21.mo3680m0()
            androidx.constraintlayout.solver.d r0 = r1.f2843e1
            androidx.constraintlayout.solver.Cache r0 = r0.mo3482g()
            r1.mo3606a(r0)
            goto L_0x004a
        L_0x0046:
            r1.f2767K = r4
            r1.f2768L = r4
        L_0x004a:
            int r0 = r1.f2859u1
            r7 = 32
            r8 = 8
            r9 = 1
            if (r0 == 0) goto L_0x006a
            boolean r0 = r1.mo3511z(r8)
            if (r0 != 0) goto L_0x005c
            r21.mo3714F0()
        L_0x005c:
            boolean r0 = r1.mo3511z(r7)
            if (r0 != 0) goto L_0x0065
            r21.mo3713E0()
        L_0x0065:
            androidx.constraintlayout.solver.d r0 = r1.f2843e1
            r0.f2596g = r9
            goto L_0x006e
        L_0x006a:
            androidx.constraintlayout.solver.d r0 = r1.f2843e1
            r0.f2596g = r4
        L_0x006e:
            androidx.constraintlayout.solver.h.h$c[] r0 = r1.f2761E
            r10 = r0[r9]
            r11 = r0[r4]
            r21.mo3559J0()
            java.util.List<androidx.constraintlayout.solver.h.j> r0 = r1.f2853o1
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0090
            java.util.List<androidx.constraintlayout.solver.h.j> r0 = r1.f2853o1
            r0.clear()
            java.util.List<androidx.constraintlayout.solver.h.j> r0 = r1.f2853o1
            androidx.constraintlayout.solver.h.j r12 = new androidx.constraintlayout.solver.h.j
            java.util.ArrayList<androidx.constraintlayout.solver.h.h> r13 = r1.f2944c1
            r12.<init>(r13)
            r0.add(r4, r12)
        L_0x0090:
            java.util.List<androidx.constraintlayout.solver.h.j> r0 = r1.f2853o1
            int r12 = r0.size()
            java.util.ArrayList<androidx.constraintlayout.solver.h.h> r13 = r1.f2944c1
            androidx.constraintlayout.solver.h.h$c r0 = r21.mo3698u()
            androidx.constraintlayout.solver.h.h$c r14 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            if (r0 == r14) goto L_0x00ab
            androidx.constraintlayout.solver.h.h$c r0 = r21.mo3591S()
            androidx.constraintlayout.solver.h.h$c r14 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            if (r0 != r14) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r14 = 0
            goto L_0x00ac
        L_0x00ab:
            r14 = 1
        L_0x00ac:
            r0 = 0
            r15 = 0
        L_0x00ae:
            if (r15 >= r12) goto L_0x02f4
            boolean r8 = r1.f2860v1
            if (r8 != 0) goto L_0x02f4
            java.util.List<androidx.constraintlayout.solver.h.j> r8 = r1.f2853o1
            java.lang.Object r8 = r8.get(r15)
            androidx.constraintlayout.solver.h.j r8 = (androidx.constraintlayout.solver.p014h.C0682j) r8
            boolean r8 = r8.f2867d
            if (r8 == 0) goto L_0x00c4
            r19 = r12
            goto L_0x02e8
        L_0x00c4:
            boolean r8 = r1.mo3511z(r7)
            if (r8 == 0) goto L_0x00f9
            androidx.constraintlayout.solver.h.h$c r8 = r21.mo3698u()
            androidx.constraintlayout.solver.h.h$c r7 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.FIXED
            if (r8 != r7) goto L_0x00eb
            androidx.constraintlayout.solver.h.h$c r7 = r21.mo3591S()
            androidx.constraintlayout.solver.h.h$c r8 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.FIXED
            if (r7 != r8) goto L_0x00eb
            java.util.List<androidx.constraintlayout.solver.h.j> r7 = r1.f2853o1
            java.lang.Object r7 = r7.get(r15)
            androidx.constraintlayout.solver.h.j r7 = (androidx.constraintlayout.solver.p014h.C0682j) r7
            java.util.List r7 = r7.mo3729a()
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r1.f2944c1 = r7
            goto L_0x00f9
        L_0x00eb:
            java.util.List<androidx.constraintlayout.solver.h.j> r7 = r1.f2853o1
            java.lang.Object r7 = r7.get(r15)
            androidx.constraintlayout.solver.h.j r7 = (androidx.constraintlayout.solver.p014h.C0682j) r7
            java.util.List<androidx.constraintlayout.solver.h.h> r7 = r7.f2864a
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r1.f2944c1 = r7
        L_0x00f9:
            r21.mo3559J0()
            java.util.ArrayList<androidx.constraintlayout.solver.h.h> r7 = r1.f2944c1
            int r7 = r7.size()
            r8 = 0
        L_0x0103:
            if (r8 >= r7) goto L_0x011b
            java.util.ArrayList<androidx.constraintlayout.solver.h.h> r4 = r1.f2944c1
            java.lang.Object r4 = r4.get(r8)
            androidx.constraintlayout.solver.h.h r4 = (androidx.constraintlayout.solver.p014h.C0677h) r4
            boolean r9 = r4 instanceof androidx.constraintlayout.solver.p014h.C0693s
            if (r9 == 0) goto L_0x0116
            androidx.constraintlayout.solver.h.s r4 = (androidx.constraintlayout.solver.p014h.C0693s) r4
            r4.mo3725t0()
        L_0x0116:
            int r8 = r8 + 1
            r4 = 0
            r9 = 1
            goto L_0x0103
        L_0x011b:
            r9 = r0
            r0 = 0
            r4 = 1
        L_0x011e:
            if (r4 == 0) goto L_0x02d7
            r17 = r4
            r8 = 1
            int r4 = r0 + 1
            androidx.constraintlayout.solver.d r0 = r1.f2843e1     // Catch:{ Exception -> 0x0162 }
            r0.mo3488m()     // Catch:{ Exception -> 0x0162 }
            r21.mo3559J0()     // Catch:{ Exception -> 0x0162 }
            androidx.constraintlayout.solver.d r0 = r1.f2843e1     // Catch:{ Exception -> 0x0162 }
            r1.mo3630b(r0)     // Catch:{ Exception -> 0x0162 }
            r0 = 0
        L_0x0133:
            if (r0 >= r7) goto L_0x0149
            java.util.ArrayList<androidx.constraintlayout.solver.h.h> r8 = r1.f2944c1     // Catch:{ Exception -> 0x0162 }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ Exception -> 0x0162 }
            androidx.constraintlayout.solver.h.h r8 = (androidx.constraintlayout.solver.p014h.C0677h) r8     // Catch:{ Exception -> 0x0162 }
            r18 = r9
            androidx.constraintlayout.solver.d r9 = r1.f2843e1     // Catch:{ Exception -> 0x0160 }
            r8.mo3630b(r9)     // Catch:{ Exception -> 0x0160 }
            int r0 = r0 + 1
            r9 = r18
            goto L_0x0133
        L_0x0149:
            r18 = r9
            androidx.constraintlayout.solver.d r0 = r1.f2843e1     // Catch:{ Exception -> 0x0160 }
            boolean r8 = r1.mo3723d(r0)     // Catch:{ Exception -> 0x0160 }
            if (r8 == 0) goto L_0x015b
            androidx.constraintlayout.solver.d r0 = r1.f2843e1     // Catch:{ Exception -> 0x0159 }
            r0.mo3487l()     // Catch:{ Exception -> 0x0159 }
            goto L_0x015b
        L_0x0159:
            r0 = move-exception
            goto L_0x0167
        L_0x015b:
            r17 = r8
            r19 = r12
            goto L_0x0184
        L_0x0160:
            r0 = move-exception
            goto L_0x0165
        L_0x0162:
            r0 = move-exception
            r18 = r9
        L_0x0165:
            r8 = r17
        L_0x0167:
            r0.printStackTrace()
            java.io.PrintStream r9 = java.lang.System.out
            r17 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r19 = r12
            java.lang.String r12 = "EXCEPTION : "
            r8.append(r12)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r9.println(r0)
        L_0x0184:
            if (r17 == 0) goto L_0x018f
            androidx.constraintlayout.solver.d r8 = r1.f2843e1
            boolean[] r9 = androidx.constraintlayout.solver.p014h.C0686m.f2901i
            r1.mo3718a(r8, r9)
        L_0x018d:
            r9 = 2
            goto L_0x01d8
        L_0x018f:
            androidx.constraintlayout.solver.d r8 = r1.f2843e1
            r1.mo3568c(r8)
            r8 = 0
        L_0x0195:
            if (r8 >= r7) goto L_0x018d
            java.util.ArrayList<androidx.constraintlayout.solver.h.h> r9 = r1.f2944c1
            java.lang.Object r9 = r9.get(r8)
            androidx.constraintlayout.solver.h.h r9 = (androidx.constraintlayout.solver.p014h.C0677h) r9
            androidx.constraintlayout.solver.h.h$c[] r12 = r9.f2761E
            r16 = 0
            r12 = r12[r16]
            androidx.constraintlayout.solver.h.h$c r0 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_CONSTRAINT
            if (r12 != r0) goto L_0x01ba
            int r0 = r9.mo3593U()
            int r12 = r9.mo3595W()
            if (r0 >= r12) goto L_0x01ba
            boolean[] r0 = androidx.constraintlayout.solver.p014h.C0686m.f2901i
            r8 = 2
            r12 = 1
            r0[r8] = r12
            goto L_0x018d
        L_0x01ba:
            r12 = 1
            androidx.constraintlayout.solver.h.h$c[] r0 = r9.f2761E
            r0 = r0[r12]
            androidx.constraintlayout.solver.h.h$c r12 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_CONSTRAINT
            if (r0 != r12) goto L_0x01d4
            int r0 = r9.mo3688q()
            int r9 = r9.mo3594V()
            if (r0 >= r9) goto L_0x01d4
            boolean[] r0 = androidx.constraintlayout.solver.p014h.C0686m.f2901i
            r8 = 1
            r9 = 2
            r0[r9] = r8
            goto L_0x01d8
        L_0x01d4:
            r9 = 2
            int r8 = r8 + 1
            goto L_0x0195
        L_0x01d8:
            if (r14 == 0) goto L_0x0252
            r8 = 8
            if (r4 >= r8) goto L_0x0252
            boolean[] r0 = androidx.constraintlayout.solver.p014h.C0686m.f2901i
            boolean r0 = r0[r9]
            if (r0 == 0) goto L_0x0252
            r0 = 0
            r9 = 0
            r12 = 0
        L_0x01e7:
            if (r0 >= r7) goto L_0x0211
            java.util.ArrayList<androidx.constraintlayout.solver.h.h> r8 = r1.f2944c1
            java.lang.Object r8 = r8.get(r0)
            androidx.constraintlayout.solver.h.h r8 = (androidx.constraintlayout.solver.p014h.C0677h) r8
            r17 = r4
            int r4 = r8.f2767K
            int r20 = r8.mo3593U()
            int r4 = r4 + r20
            int r9 = java.lang.Math.max(r9, r4)
            int r4 = r8.f2768L
            int r8 = r8.mo3688q()
            int r4 = r4 + r8
            int r12 = java.lang.Math.max(r12, r4)
            int r0 = r0 + 1
            r4 = r17
            r8 = 8
            goto L_0x01e7
        L_0x0211:
            r17 = r4
            int r0 = r1.f2778V
            int r0 = java.lang.Math.max(r0, r9)
            int r4 = r1.f2779W
            int r4 = java.lang.Math.max(r4, r12)
            androidx.constraintlayout.solver.h.h$c r8 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            if (r11 != r8) goto L_0x0237
            int r8 = r21.mo3593U()
            if (r8 >= r0) goto L_0x0237
            r1.mo3699u(r0)
            androidx.constraintlayout.solver.h.h$c[] r0 = r1.f2761E
            androidx.constraintlayout.solver.h.h$c r8 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            r9 = 0
            r0[r9] = r8
            r0 = 1
            r18 = 1
            goto L_0x0238
        L_0x0237:
            r0 = 0
        L_0x0238:
            androidx.constraintlayout.solver.h.h$c r8 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            if (r10 != r8) goto L_0x024f
            int r8 = r21.mo3688q()
            if (r8 >= r4) goto L_0x024f
            r1.mo3679m(r4)
            androidx.constraintlayout.solver.h.h$c[] r0 = r1.f2761E
            androidx.constraintlayout.solver.h.h$c r4 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            r8 = 1
            r0[r8] = r4
            r0 = 1
            r9 = 1
            goto L_0x0257
        L_0x024f:
            r9 = r18
            goto L_0x0257
        L_0x0252:
            r17 = r4
            r9 = r18
            r0 = 0
        L_0x0257:
            int r4 = r1.f2778V
            int r8 = r21.mo3593U()
            int r4 = java.lang.Math.max(r4, r8)
            int r8 = r21.mo3593U()
            if (r4 <= r8) goto L_0x0273
            r1.mo3699u(r4)
            androidx.constraintlayout.solver.h.h$c[] r0 = r1.f2761E
            androidx.constraintlayout.solver.h.h$c r4 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.FIXED
            r8 = 0
            r0[r8] = r4
            r0 = 1
            r9 = 1
        L_0x0273:
            int r4 = r1.f2779W
            int r8 = r21.mo3688q()
            int r4 = java.lang.Math.max(r4, r8)
            int r8 = r21.mo3688q()
            if (r4 <= r8) goto L_0x0290
            r1.mo3679m(r4)
            androidx.constraintlayout.solver.h.h$c[] r0 = r1.f2761E
            androidx.constraintlayout.solver.h.h$c r4 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.FIXED
            r8 = 1
            r0[r8] = r4
            r0 = 1
            r9 = 1
            goto L_0x0291
        L_0x0290:
            r8 = 1
        L_0x0291:
            if (r9 != 0) goto L_0x02d0
            androidx.constraintlayout.solver.h.h$c[] r4 = r1.f2761E
            r12 = 0
            r4 = r4[r12]
            androidx.constraintlayout.solver.h.h$c r12 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            if (r4 != r12) goto L_0x02b2
            if (r5 <= 0) goto L_0x02b2
            int r4 = r21.mo3593U()
            if (r4 <= r5) goto L_0x02b2
            r1.f2861w1 = r8
            androidx.constraintlayout.solver.h.h$c[] r0 = r1.f2761E
            androidx.constraintlayout.solver.h.h$c r4 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.FIXED
            r9 = 0
            r0[r9] = r4
            r1.mo3699u(r5)
            r0 = 1
            r9 = 1
        L_0x02b2:
            androidx.constraintlayout.solver.h.h$c[] r4 = r1.f2761E
            r4 = r4[r8]
            androidx.constraintlayout.solver.h.h$c r12 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            if (r4 != r12) goto L_0x02d0
            if (r6 <= 0) goto L_0x02d0
            int r4 = r21.mo3688q()
            if (r4 <= r6) goto L_0x02d0
            r1.f2862x1 = r8
            androidx.constraintlayout.solver.h.h$c[] r0 = r1.f2761E
            androidx.constraintlayout.solver.h.h$c r4 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.FIXED
            r0[r8] = r4
            r1.mo3679m(r6)
            r4 = 1
            r9 = 1
            goto L_0x02d1
        L_0x02d0:
            r4 = r0
        L_0x02d1:
            r0 = r17
            r12 = r19
            goto L_0x011e
        L_0x02d7:
            r18 = r9
            r19 = r12
            java.util.List<androidx.constraintlayout.solver.h.j> r0 = r1.f2853o1
            java.lang.Object r0 = r0.get(r15)
            androidx.constraintlayout.solver.h.j r0 = (androidx.constraintlayout.solver.p014h.C0682j) r0
            r0.mo3733b()
            r0 = r18
        L_0x02e8:
            int r15 = r15 + 1
            r12 = r19
            r4 = 0
            r7 = 32
            r8 = 8
            r9 = 1
            goto L_0x00ae
        L_0x02f4:
            r1.f2944c1 = r13
            androidx.constraintlayout.solver.h.h r4 = r1.f2762F
            if (r4 == 0) goto L_0x0326
            int r2 = r1.f2778V
            int r3 = r21.mo3593U()
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.f2779W
            int r4 = r21.mo3688q()
            int r3 = java.lang.Math.max(r3, r4)
            androidx.constraintlayout.solver.h.r r4 = r1.f2844f1
            r4.mo3780a(r1)
            int r4 = r1.f2845g1
            int r2 = r2 + r4
            int r4 = r1.f2847i1
            int r2 = r2 + r4
            r1.mo3699u(r2)
            int r2 = r1.f2846h1
            int r3 = r3 + r2
            int r2 = r1.f2848j1
            int r3 = r3 + r2
            r1.mo3679m(r3)
            goto L_0x032a
        L_0x0326:
            r1.f2767K = r2
            r1.f2768L = r3
        L_0x032a:
            if (r0 == 0) goto L_0x0334
            androidx.constraintlayout.solver.h.h$c[] r0 = r1.f2761E
            r2 = 0
            r0[r2] = r11
            r2 = 1
            r0[r2] = r10
        L_0x0334:
            androidx.constraintlayout.solver.d r0 = r1.f2843e1
            androidx.constraintlayout.solver.Cache r0 = r0.mo3482g()
            r1.mo3606a(r0)
            androidx.constraintlayout.solver.h.i r0 = r21.mo3789s0()
            if (r1 != r0) goto L_0x0346
            r21.mo3687p0()
        L_0x0346:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.p014h.C0681i.mo3725t0():void");
    }

    /* renamed from: v0 */
    public ArrayList<C0683k> mo3572v0() {
        ArrayList<C0683k> arrayList = new ArrayList<>();
        int size = this.f2944c1.size();
        for (int i = 0; i < size; i++) {
            C0677h hVar = (C0677h) this.f2944c1.get(i);
            if (hVar instanceof C0683k) {
                C0683k kVar = (C0683k) hVar;
                if (kVar.mo3745u0() == 0) {
                    arrayList.add(kVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: w0 */
    public int mo3726w0() {
        return this.f2859u1;
    }

    /* renamed from: x0 */
    public C0654d mo3727x0() {
        return this.f2843e1;
    }

    /* renamed from: y0 */
    public ArrayList<C0683k> mo3573y0() {
        ArrayList<C0683k> arrayList = new ArrayList<>();
        int size = this.f2944c1.size();
        for (int i = 0; i < size; i++) {
            C0677h hVar = (C0677h) this.f2944c1.get(i);
            if (hVar instanceof C0683k) {
                C0683k kVar = (C0683k) hVar;
                if (kVar.mo3745u0() == 1) {
                    arrayList.add(kVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    public boolean mo3511z(int i) {
        return (this.f2859u1 & i) == i;
    }

    /* renamed from: z0 */
    public List<C0682j> mo3728z0() {
        return this.f2853o1;
    }

    /* renamed from: a */
    public void mo3718a(C0654d dVar, boolean[] zArr) {
        zArr[2] = false;
        mo3568c(dVar);
        int size = this.f2944c1.size();
        for (int i = 0; i < size; i++) {
            C0677h hVar = (C0677h) this.f2944c1.get(i);
            hVar.mo3568c(dVar);
            if (hVar.f2761E[0] == C0680c.MATCH_CONSTRAINT && hVar.mo3593U() < hVar.mo3595W()) {
                zArr[2] = true;
            }
            if (hVar.f2761E[1] == C0680c.MATCH_CONSTRAINT && hVar.mo3688q() < hVar.mo3594V()) {
                zArr[2] = true;
            }
        }
    }

    /* renamed from: i */
    private void m3868i(C0677h hVar) {
        int i = this.f2850l1 + 1;
        C0666d[] dVarArr = this.f2851m1;
        if (i >= dVarArr.length) {
            this.f2851m1 = (C0666d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f2851m1[this.f2850l1] = new C0666d(hVar, 1, mo3711C0());
        this.f2850l1++;
    }

    /* renamed from: c */
    public void mo3722c(boolean z) {
        this.f2842d1 = z;
    }

    /* renamed from: a */
    public void mo3504a(int i) {
        super.mo3504a(i);
        int size = this.f2944c1.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0677h) this.f2944c1.get(i2)).mo3504a(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3720a(C0677h hVar, int i) {
        if (i == 0) {
            m3867h(hVar);
        } else if (i == 1) {
            m3868i(hVar);
        }
    }

    public C0681i(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    public C0681i(int i, int i2) {
        super(i, i2);
    }
}
