package androidx.constraintlayout.solver.p014h;

import androidx.constraintlayout.solver.Cache;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.h.s */
/* compiled from: WidgetContainer */
public class C0693s extends C0677h {

    /* renamed from: c1 */
    protected ArrayList<C0677h> f2944c1 = new ArrayList<>();

    public C0693s() {
    }

    /* renamed from: a */
    public void mo3785a(C0677h... hVarArr) {
        for (C0677h f : hVarArr) {
            mo3787f(f);
        }
    }

    /* renamed from: b */
    public ArrayList<C0677h> mo3786b(int i, int i2, int i3, int i4) {
        ArrayList<C0677h> arrayList = new ArrayList<>();
        C0687n nVar = new C0687n();
        nVar.mo3753a(i, i2, i3, i4);
        int size = this.f2944c1.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0677h hVar = (C0677h) this.f2944c1.get(i5);
            C0687n nVar2 = new C0687n();
            nVar2.mo3753a(hVar.mo3683o(), hVar.mo3685p(), hVar.mo3593U(), hVar.mo3688q());
            if (nVar.mo3755a(nVar2)) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public void mo3651e(int i, int i2) {
        super.mo3651e(i, i2);
        int size = this.f2944c1.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0677h) this.f2944c1.get(i3)).mo3651e(mo3585L(), mo3586M());
        }
    }

    /* renamed from: f */
    public void mo3787f(C0677h hVar) {
        this.f2944c1.add(hVar);
        if (hVar.mo3580G() != null) {
            ((C0693s) hVar.mo3580G()).mo3788g(hVar);
        }
        hVar.mo3652e((C0677h) this);
    }

    /* renamed from: g */
    public void mo3788g(C0677h hVar) {
        this.f2944c1.remove(hVar);
        hVar.mo3652e((C0677h) null);
    }

    /* renamed from: k0 */
    public void mo3674k0() {
        this.f2944c1.clear();
        super.mo3674k0();
    }

    /* renamed from: p0 */
    public void mo3687p0() {
        super.mo3687p0();
        ArrayList<C0677h> arrayList = this.f2944c1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0677h hVar = (C0677h) this.f2944c1.get(i);
                hVar.mo3651e(mo3683o(), mo3685p());
                if (!(hVar instanceof C0681i)) {
                    hVar.mo3687p0();
                }
            }
        }
    }

    /* renamed from: r0 */
    public ArrayList<C0677h> mo3742r0() {
        return this.f2944c1;
    }

    /* renamed from: s0 */
    public C0681i mo3789s0() {
        C0677h G = mo3580G();
        C0681i iVar = this instanceof C0681i ? (C0681i) this : null;
        while (G != null) {
            C0677h G2 = G.mo3580G();
            if (G instanceof C0681i) {
                iVar = (C0681i) G;
            }
            G = G2;
        }
        return iVar;
    }

    /* renamed from: t0 */
    public void mo3725t0() {
        mo3687p0();
        ArrayList<C0677h> arrayList = this.f2944c1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0677h hVar = (C0677h) this.f2944c1.get(i);
                if (hVar instanceof C0693s) {
                    ((C0693s) hVar).mo3725t0();
                }
            }
        }
    }

    /* renamed from: u0 */
    public void mo3790u0() {
        this.f2944c1.clear();
    }

    public C0693s(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [androidx.constraintlayout.solver.h.h] */
    /* JADX WARNING: type inference failed for: r3v4, types: [androidx.constraintlayout.solver.h.h] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r3v7, types: [androidx.constraintlayout.solver.h.h] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3
      assigns: []
      uses: []
      mth insns count: 61
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
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.solver.p014h.C0677h mo3784a(float r9, float r10) {
        /*
            r8 = this;
            int r0 = r8.mo3683o()
            int r1 = r8.mo3685p()
            int r2 = r8.mo3593U()
            int r2 = r2 + r0
            int r3 = r8.mo3688q()
            int r3 = r3 + r1
            float r0 = (float) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0028
            float r0 = (float) r2
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0028
            float r0 = (float) r1
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0028
            float r0 = (float) r3
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0028
            r0 = r8
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r1 = 0
            java.util.ArrayList<androidx.constraintlayout.solver.h.h> r2 = r8.f2944c1
            int r2 = r2.size()
        L_0x0030:
            if (r1 >= r2) goto L_0x0071
            java.util.ArrayList<androidx.constraintlayout.solver.h.h> r3 = r8.f2944c1
            java.lang.Object r3 = r3.get(r1)
            androidx.constraintlayout.solver.h.h r3 = (androidx.constraintlayout.solver.p014h.C0677h) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.solver.p014h.C0693s
            if (r4 == 0) goto L_0x0047
            androidx.constraintlayout.solver.h.s r3 = (androidx.constraintlayout.solver.p014h.C0693s) r3
            androidx.constraintlayout.solver.h.h r3 = r3.mo3784a(r9, r10)
            if (r3 == 0) goto L_0x006e
            goto L_0x006d
        L_0x0047:
            int r4 = r3.mo3683o()
            int r5 = r3.mo3685p()
            int r6 = r3.mo3593U()
            int r6 = r6 + r4
            int r7 = r3.mo3688q()
            int r7 = r7 + r5
            float r4 = (float) r4
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x006e
            float r4 = (float) r6
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x006e
            float r4 = (float) r5
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x006e
            float r4 = (float) r7
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x006e
        L_0x006d:
            r0 = r3
        L_0x006e:
            int r1 = r1 + 1
            goto L_0x0030
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.p014h.C0693s.mo3784a(float, float):androidx.constraintlayout.solver.h.h");
    }

    public C0693s(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: a */
    public static C0687n m3971a(ArrayList<C0677h> arrayList) {
        C0687n nVar = new C0687n();
        if (arrayList.size() == 0) {
            return nVar;
        }
        int size = arrayList.size();
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            C0677h hVar = (C0677h) arrayList.get(i5);
            if (hVar.mo3596X() < i) {
                i = hVar.mo3596X();
            }
            if (hVar.mo3597Y() < i2) {
                i2 = hVar.mo3597Y();
            }
            if (hVar.mo3583J() > i3) {
                i3 = hVar.mo3583J();
            }
            if (hVar.mo3649e() > i4) {
                i4 = hVar.mo3649e();
            }
        }
        nVar.mo3753a(i, i2, i3 - i, i4 - i2);
        return nVar;
    }

    /* renamed from: a */
    public void mo3606a(Cache cache) {
        super.mo3606a(cache);
        int size = this.f2944c1.size();
        for (int i = 0; i < size; i++) {
            ((C0677h) this.f2944c1.get(i)).mo3606a(cache);
        }
    }
}
