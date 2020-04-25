package androidx.constraintlayout.solver.p014h;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.constraintlayout.solver.h.j */
/* compiled from: ConstraintWidgetGroup */
public class C0682j {

    /* renamed from: a */
    public List<C0677h> f2864a;

    /* renamed from: b */
    int f2865b = -1;

    /* renamed from: c */
    int f2866c = -1;

    /* renamed from: d */
    public boolean f2867d = false;

    /* renamed from: e */
    public final int[] f2868e = {this.f2865b, this.f2866c};

    /* renamed from: f */
    List<C0677h> f2869f = new ArrayList();

    /* renamed from: g */
    List<C0677h> f2870g = new ArrayList();

    /* renamed from: h */
    HashSet<C0677h> f2871h = new HashSet<>();

    /* renamed from: i */
    HashSet<C0677h> f2872i = new HashSet<>();

    /* renamed from: j */
    List<C0677h> f2873j = new ArrayList();

    /* renamed from: k */
    List<C0677h> f2874k = new ArrayList();

    C0682j(List<C0677h> list) {
        this.f2864a = list;
    }

    /* renamed from: a */
    public List<C0677h> mo3730a(int i) {
        if (i == 0) {
            return this.f2869f;
        }
        if (i == 1) {
            return this.f2870g;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Set<C0677h> mo3732b(int i) {
        if (i == 0) {
            return this.f2871h;
        }
        if (i == 1) {
            return this.f2872i;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3731a(C0677h hVar, int i) {
        if (i == 0) {
            this.f2871h.add(hVar);
        } else if (i == 1) {
            this.f2872i.add(hVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3733b() {
        int size = this.f2874k.size();
        for (int i = 0; i < size; i++) {
            m3896a((C0677h) this.f2874k.get(i));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C0677h> mo3729a() {
        if (!this.f2873j.isEmpty()) {
            return this.f2873j;
        }
        int size = this.f2864a.size();
        for (int i = 0; i < size; i++) {
            C0677h hVar = (C0677h) this.f2864a.get(i);
            if (!hVar.f2816q0) {
                m3897a((ArrayList) this.f2873j, hVar);
            }
        }
        this.f2874k.clear();
        this.f2874k.addAll(this.f2864a);
        this.f2874k.removeAll(this.f2873j);
        return this.f2873j;
    }

    C0682j(List<C0677h> list, boolean z) {
        this.f2864a = list;
        this.f2867d = z;
    }

    /* renamed from: a */
    private void m3897a(ArrayList<C0677h> arrayList, C0677h hVar) {
        if (!hVar.f2820s0) {
            arrayList.add(hVar);
            hVar.f2820s0 = true;
            if (!hVar.mo3624a0()) {
                if (hVar instanceof C0685l) {
                    C0685l lVar = (C0685l) hVar;
                    int i = lVar.f2892d1;
                    for (int i2 = 0; i2 < i; i2++) {
                        m3897a(arrayList, lVar.f2891c1[i2]);
                    }
                }
                for (C0667e eVar : hVar.f2759C) {
                    C0667e eVar2 = eVar.f2698d;
                    if (eVar2 != null) {
                        C0677h hVar2 = eVar2.f2696b;
                        if (!(eVar2 == null || hVar2 == hVar.mo3580G())) {
                            m3897a(arrayList, hVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3896a(androidx.constraintlayout.solver.p014h.C0677h r7) {
        /*
            r6 = this;
            boolean r0 = r7.f2816q0
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r7.mo3624a0()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            androidx.constraintlayout.solver.h.e r0 = r7.f2827w
            androidx.constraintlayout.solver.h.e r0 = r0.f2698d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x001d
            androidx.constraintlayout.solver.h.e r3 = r7.f2827w
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            goto L_0x0021
        L_0x001d:
            androidx.constraintlayout.solver.h.e r3 = r7.f2823u
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
        L_0x0021:
            if (r3 == 0) goto L_0x0045
            androidx.constraintlayout.solver.h.h r4 = r3.f2696b
            boolean r5 = r4.f2818r0
            if (r5 != 0) goto L_0x002c
            r6.m3896a(r4)
        L_0x002c:
            androidx.constraintlayout.solver.h.e$d r4 = r3.f2697c
            androidx.constraintlayout.solver.h.e$d r5 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.RIGHT
            if (r4 != r5) goto L_0x003c
            androidx.constraintlayout.solver.h.h r3 = r3.f2696b
            int r4 = r3.f2767K
            int r3 = r3.mo3593U()
            int r3 = r3 + r4
            goto L_0x0046
        L_0x003c:
            androidx.constraintlayout.solver.h.e$d r5 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.LEFT
            if (r4 != r5) goto L_0x0045
            androidx.constraintlayout.solver.h.h r3 = r3.f2696b
            int r3 = r3.f2767K
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x0050
            androidx.constraintlayout.solver.h.e r0 = r7.f2827w
            int r0 = r0.mo3536c()
            int r3 = r3 - r0
            goto L_0x005c
        L_0x0050:
            androidx.constraintlayout.solver.h.e r0 = r7.f2823u
            int r0 = r0.mo3536c()
            int r4 = r7.mo3593U()
            int r0 = r0 + r4
            int r3 = r3 + r0
        L_0x005c:
            int r0 = r7.mo3593U()
            int r0 = r3 - r0
            r7.mo3639c(r0, r3)
            androidx.constraintlayout.solver.h.e r0 = r7.f2831y
            androidx.constraintlayout.solver.h.e r0 = r0.f2698d
            if (r0 == 0) goto L_0x0087
            androidx.constraintlayout.solver.h.h r1 = r0.f2696b
            boolean r3 = r1.f2818r0
            if (r3 != 0) goto L_0x0074
            r6.m3896a(r1)
        L_0x0074:
            androidx.constraintlayout.solver.h.h r0 = r0.f2696b
            int r1 = r0.f2768L
            int r0 = r0.f2777U
            int r1 = r1 + r0
            int r0 = r7.f2777U
            int r1 = r1 - r0
            int r0 = r7.f2764H
            int r0 = r0 + r1
            r7.mo3664h(r1, r0)
            r7.f2818r0 = r2
            return
        L_0x0087:
            androidx.constraintlayout.solver.h.e r0 = r7.f2829x
            androidx.constraintlayout.solver.h.e r0 = r0.f2698d
            if (r0 == 0) goto L_0x008e
            r1 = 1
        L_0x008e:
            if (r1 == 0) goto L_0x0095
            androidx.constraintlayout.solver.h.e r0 = r7.f2829x
            androidx.constraintlayout.solver.h.e r0 = r0.f2698d
            goto L_0x0099
        L_0x0095:
            androidx.constraintlayout.solver.h.e r0 = r7.f2825v
            androidx.constraintlayout.solver.h.e r0 = r0.f2698d
        L_0x0099:
            if (r0 == 0) goto L_0x00bc
            androidx.constraintlayout.solver.h.h r4 = r0.f2696b
            boolean r5 = r4.f2818r0
            if (r5 != 0) goto L_0x00a4
            r6.m3896a(r4)
        L_0x00a4:
            androidx.constraintlayout.solver.h.e$d r4 = r0.f2697c
            androidx.constraintlayout.solver.h.e$d r5 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.BOTTOM
            if (r4 != r5) goto L_0x00b4
            androidx.constraintlayout.solver.h.h r0 = r0.f2696b
            int r3 = r0.f2768L
            int r0 = r0.mo3688q()
            int r3 = r3 + r0
            goto L_0x00bc
        L_0x00b4:
            androidx.constraintlayout.solver.h.e$d r5 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.TOP
            if (r4 != r5) goto L_0x00bc
            androidx.constraintlayout.solver.h.h r0 = r0.f2696b
            int r3 = r0.f2768L
        L_0x00bc:
            if (r1 == 0) goto L_0x00c6
            androidx.constraintlayout.solver.h.e r0 = r7.f2829x
            int r0 = r0.mo3536c()
            int r3 = r3 - r0
            goto L_0x00d2
        L_0x00c6:
            androidx.constraintlayout.solver.h.e r0 = r7.f2825v
            int r0 = r0.mo3536c()
            int r1 = r7.mo3688q()
            int r0 = r0 + r1
            int r3 = r3 + r0
        L_0x00d2:
            int r0 = r7.mo3688q()
            int r0 = r3 - r0
            r7.mo3664h(r0, r3)
            r7.f2818r0 = r2
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.p014h.C0682j.m3896a(androidx.constraintlayout.solver.h.h):void");
    }
}
