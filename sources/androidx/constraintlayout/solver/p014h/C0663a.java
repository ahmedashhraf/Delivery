package androidx.constraintlayout.solver.p014h;

import androidx.constraintlayout.solver.p014h.C0677h.C0680c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.constraintlayout.solver.h.a */
/* compiled from: Analyzer */
public class C0663a {
    private C0663a() {
    }

    /* renamed from: a */
    public static void m3635a(C0681i iVar) {
        if ((iVar.mo3726w0() & 32) != 32) {
            m3640b(iVar);
            return;
        }
        iVar.f2860v1 = true;
        iVar.f2854p1 = false;
        iVar.f2855q1 = false;
        iVar.f2856r1 = false;
        ArrayList<C0677h> arrayList = iVar.f2944c1;
        List<C0682j> list = iVar.f2853o1;
        boolean z = iVar.mo3698u() == C0680c.WRAP_CONTENT;
        boolean z2 = iVar.mo3591S() == C0680c.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (C0677h hVar : arrayList) {
            hVar.f2817r = null;
            hVar.f2820s0 = false;
            hVar.mo3508n0();
        }
        for (C0677h hVar2 : arrayList) {
            if (hVar2.f2817r == null && !m3639a(hVar2, list, z3)) {
                m3640b(iVar);
                iVar.f2860v1 = false;
                return;
            }
        }
        int i = 0;
        int i2 = 0;
        for (C0682j jVar : list) {
            i = Math.max(i, m3632a(jVar, 0));
            i2 = Math.max(i2, m3632a(jVar, 1));
        }
        if (z) {
            iVar.mo3617a(C0680c.FIXED);
            iVar.mo3699u(i);
            iVar.f2854p1 = true;
            iVar.f2855q1 = true;
            iVar.f2857s1 = i;
        }
        if (z2) {
            iVar.mo3631b(C0680c.FIXED);
            iVar.mo3679m(i2);
            iVar.f2854p1 = true;
            iVar.f2856r1 = true;
            iVar.f2858t1 = i2;
        }
        m3637a(list, 0, iVar.mo3593U());
        m3637a(list, 1, iVar.mo3688q());
    }

    /* renamed from: b */
    private static void m3640b(C0681i iVar) {
        iVar.f2853o1.clear();
        iVar.f2853o1.add(0, new C0682j(iVar.f2944c1));
    }

    /* renamed from: a */
    private static boolean m3639a(C0677h hVar, List<C0682j> list, boolean z) {
        C0682j jVar = new C0682j(new ArrayList(), true);
        list.add(jVar);
        return m3638a(hVar, jVar, list, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0181, code lost:
        if (r3.f2696b == r4) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0128, code lost:
        if (r3.f2696b == r4) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01c2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m3638a(androidx.constraintlayout.solver.p014h.C0677h r8, androidx.constraintlayout.solver.p014h.C0682j r9, java.util.List<androidx.constraintlayout.solver.p014h.C0682j> r10, boolean r11) {
        /*
            r0 = 1
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            r8.f2818r0 = r1
            androidx.constraintlayout.solver.h.h r2 = r8.mo3580G()
            androidx.constraintlayout.solver.h.i r2 = (androidx.constraintlayout.solver.p014h.C0681i) r2
            androidx.constraintlayout.solver.h.j r3 = r8.f2817r
            if (r3 != 0) goto L_0x01f0
            r8.f2816q0 = r0
            java.util.List<androidx.constraintlayout.solver.h.h> r3 = r9.f2864a
            r3.add(r8)
            r8.f2817r = r9
            androidx.constraintlayout.solver.h.e r3 = r8.f2823u
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 != 0) goto L_0x0044
            androidx.constraintlayout.solver.h.e r3 = r8.f2827w
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 != 0) goto L_0x0044
            androidx.constraintlayout.solver.h.e r3 = r8.f2825v
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 != 0) goto L_0x0044
            androidx.constraintlayout.solver.h.e r3 = r8.f2829x
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 != 0) goto L_0x0044
            androidx.constraintlayout.solver.h.e r3 = r8.f2831y
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 != 0) goto L_0x0044
            androidx.constraintlayout.solver.h.e r3 = r8.f2757B
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 != 0) goto L_0x0044
            m3636a(r2, r8, r9)
            if (r11 == 0) goto L_0x0044
            return r1
        L_0x0044:
            androidx.constraintlayout.solver.h.e r3 = r8.f2825v
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x0077
            androidx.constraintlayout.solver.h.e r3 = r8.f2829x
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x0077
            androidx.constraintlayout.solver.h.h$c r3 = r2.mo3591S()
            androidx.constraintlayout.solver.h.h$c r4 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            if (r11 == 0) goto L_0x005c
            m3636a(r2, r8, r9)
            return r1
        L_0x005c:
            androidx.constraintlayout.solver.h.e r3 = r8.f2825v
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            androidx.constraintlayout.solver.h.h r3 = r3.f2696b
            androidx.constraintlayout.solver.h.h r4 = r8.mo3580G()
            if (r3 != r4) goto L_0x0074
            androidx.constraintlayout.solver.h.e r3 = r8.f2829x
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            androidx.constraintlayout.solver.h.h r3 = r3.f2696b
            androidx.constraintlayout.solver.h.h r4 = r8.mo3580G()
            if (r3 == r4) goto L_0x0077
        L_0x0074:
            m3636a(r2, r8, r9)
        L_0x0077:
            androidx.constraintlayout.solver.h.e r3 = r8.f2823u
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x00aa
            androidx.constraintlayout.solver.h.e r3 = r8.f2827w
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x00aa
            androidx.constraintlayout.solver.h.h$c r3 = r2.mo3698u()
            androidx.constraintlayout.solver.h.h$c r4 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            if (r11 == 0) goto L_0x008f
            m3636a(r2, r8, r9)
            return r1
        L_0x008f:
            androidx.constraintlayout.solver.h.e r3 = r8.f2823u
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            androidx.constraintlayout.solver.h.h r3 = r3.f2696b
            androidx.constraintlayout.solver.h.h r4 = r8.mo3580G()
            if (r3 != r4) goto L_0x00a7
            androidx.constraintlayout.solver.h.e r3 = r8.f2827w
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            androidx.constraintlayout.solver.h.h r3 = r3.f2696b
            androidx.constraintlayout.solver.h.h r4 = r8.mo3580G()
            if (r3 == r4) goto L_0x00aa
        L_0x00a7:
            m3636a(r2, r8, r9)
        L_0x00aa:
            androidx.constraintlayout.solver.h.h$c r3 = r8.mo3698u()
            androidx.constraintlayout.solver.h.h$c r4 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_CONSTRAINT
            if (r3 != r4) goto L_0x00b4
            r3 = 1
            goto L_0x00b5
        L_0x00b4:
            r3 = 0
        L_0x00b5:
            androidx.constraintlayout.solver.h.h$c r4 = r8.mo3591S()
            androidx.constraintlayout.solver.h.h$c r5 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x00bf
            r4 = 1
            goto L_0x00c0
        L_0x00bf:
            r4 = 0
        L_0x00c0:
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x00ce
            float r3 = r8.f2765I
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00ce
            m3629a(r8)
            goto L_0x00e4
        L_0x00ce:
            androidx.constraintlayout.solver.h.h$c r3 = r8.mo3698u()
            androidx.constraintlayout.solver.h.h$c r4 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_CONSTRAINT
            if (r3 == r4) goto L_0x00de
            androidx.constraintlayout.solver.h.h$c r3 = r8.mo3591S()
            androidx.constraintlayout.solver.h.h$c r4 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_CONSTRAINT
            if (r3 != r4) goto L_0x00e4
        L_0x00de:
            m3636a(r2, r8, r9)
            if (r11 == 0) goto L_0x00e4
            return r1
        L_0x00e4:
            androidx.constraintlayout.solver.h.e r3 = r8.f2823u
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 != 0) goto L_0x00f0
            androidx.constraintlayout.solver.h.e r3 = r8.f2827w
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x012a
        L_0x00f0:
            androidx.constraintlayout.solver.h.e r3 = r8.f2823u
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x0102
            androidx.constraintlayout.solver.h.h r3 = r3.f2696b
            androidx.constraintlayout.solver.h.h r4 = r8.f2762F
            if (r3 != r4) goto L_0x0102
            androidx.constraintlayout.solver.h.e r3 = r8.f2827w
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x012a
        L_0x0102:
            androidx.constraintlayout.solver.h.e r3 = r8.f2827w
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x0114
            androidx.constraintlayout.solver.h.h r3 = r3.f2696b
            androidx.constraintlayout.solver.h.h r4 = r8.f2762F
            if (r3 != r4) goto L_0x0114
            androidx.constraintlayout.solver.h.e r3 = r8.f2823u
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x012a
        L_0x0114:
            androidx.constraintlayout.solver.h.e r3 = r8.f2823u
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x013d
            androidx.constraintlayout.solver.h.h r3 = r3.f2696b
            androidx.constraintlayout.solver.h.h r4 = r8.f2762F
            if (r3 != r4) goto L_0x013d
            androidx.constraintlayout.solver.h.e r3 = r8.f2827w
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x013d
            androidx.constraintlayout.solver.h.h r3 = r3.f2696b
            if (r3 != r4) goto L_0x013d
        L_0x012a:
            androidx.constraintlayout.solver.h.e r3 = r8.f2757B
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 != 0) goto L_0x013d
            boolean r3 = r8 instanceof androidx.constraintlayout.solver.p014h.C0683k
            if (r3 != 0) goto L_0x013d
            boolean r3 = r8 instanceof androidx.constraintlayout.solver.p014h.C0685l
            if (r3 != 0) goto L_0x013d
            java.util.List<androidx.constraintlayout.solver.h.h> r3 = r9.f2869f
            r3.add(r8)
        L_0x013d:
            androidx.constraintlayout.solver.h.e r3 = r8.f2825v
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 != 0) goto L_0x0149
            androidx.constraintlayout.solver.h.e r3 = r8.f2829x
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x0183
        L_0x0149:
            androidx.constraintlayout.solver.h.e r3 = r8.f2825v
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x015b
            androidx.constraintlayout.solver.h.h r3 = r3.f2696b
            androidx.constraintlayout.solver.h.h r4 = r8.f2762F
            if (r3 != r4) goto L_0x015b
            androidx.constraintlayout.solver.h.e r3 = r8.f2829x
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x0183
        L_0x015b:
            androidx.constraintlayout.solver.h.e r3 = r8.f2829x
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x016d
            androidx.constraintlayout.solver.h.h r3 = r3.f2696b
            androidx.constraintlayout.solver.h.h r4 = r8.f2762F
            if (r3 != r4) goto L_0x016d
            androidx.constraintlayout.solver.h.e r3 = r8.f2825v
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x0183
        L_0x016d:
            androidx.constraintlayout.solver.h.e r3 = r8.f2825v
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x019c
            androidx.constraintlayout.solver.h.h r3 = r3.f2696b
            androidx.constraintlayout.solver.h.h r4 = r8.f2762F
            if (r3 != r4) goto L_0x019c
            androidx.constraintlayout.solver.h.e r3 = r8.f2829x
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x019c
            androidx.constraintlayout.solver.h.h r3 = r3.f2696b
            if (r3 != r4) goto L_0x019c
        L_0x0183:
            androidx.constraintlayout.solver.h.e r3 = r8.f2757B
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 != 0) goto L_0x019c
            androidx.constraintlayout.solver.h.e r3 = r8.f2831y
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 != 0) goto L_0x019c
            boolean r3 = r8 instanceof androidx.constraintlayout.solver.p014h.C0683k
            if (r3 != 0) goto L_0x019c
            boolean r3 = r8 instanceof androidx.constraintlayout.solver.p014h.C0685l
            if (r3 != 0) goto L_0x019c
            java.util.List<androidx.constraintlayout.solver.h.h> r3 = r9.f2870g
            r3.add(r8)
        L_0x019c:
            boolean r3 = r8 instanceof androidx.constraintlayout.solver.p014h.C0685l
            if (r3 == 0) goto L_0x01bc
            m3636a(r2, r8, r9)
            if (r11 == 0) goto L_0x01a6
            return r1
        L_0x01a6:
            r3 = r8
            androidx.constraintlayout.solver.h.l r3 = (androidx.constraintlayout.solver.p014h.C0685l) r3
            r4 = 0
        L_0x01aa:
            int r5 = r3.f2892d1
            if (r4 >= r5) goto L_0x01bc
            androidx.constraintlayout.solver.h.h[] r5 = r3.f2891c1
            r5 = r5[r4]
            boolean r5 = m3638a(r5, r9, r10, r11)
            if (r5 != 0) goto L_0x01b9
            return r1
        L_0x01b9:
            int r4 = r4 + 1
            goto L_0x01aa
        L_0x01bc:
            androidx.constraintlayout.solver.h.e[] r3 = r8.f2759C
            int r3 = r3.length
            r4 = 0
        L_0x01c0:
            if (r4 >= r3) goto L_0x01ef
            androidx.constraintlayout.solver.h.e[] r5 = r8.f2759C
            r5 = r5[r4]
            androidx.constraintlayout.solver.h.e r6 = r5.f2698d
            if (r6 == 0) goto L_0x01ec
            androidx.constraintlayout.solver.h.h r6 = r6.f2696b
            androidx.constraintlayout.solver.h.h r7 = r8.mo3580G()
            if (r6 == r7) goto L_0x01ec
            androidx.constraintlayout.solver.h.e$d r6 = r5.f2697c
            androidx.constraintlayout.solver.h.e$d r7 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.CENTER
            if (r6 != r7) goto L_0x01de
            m3636a(r2, r8, r9)
            if (r11 == 0) goto L_0x01e1
            return r1
        L_0x01de:
            m3633a(r5)
        L_0x01e1:
            androidx.constraintlayout.solver.h.e r5 = r5.f2698d
            androidx.constraintlayout.solver.h.h r5 = r5.f2696b
            boolean r5 = m3638a(r5, r9, r10, r11)
            if (r5 != 0) goto L_0x01ec
            return r1
        L_0x01ec:
            int r4 = r4 + 1
            goto L_0x01c0
        L_0x01ef:
            return r0
        L_0x01f0:
            if (r3 == r9) goto L_0x022f
            java.util.List<androidx.constraintlayout.solver.h.h> r11 = r9.f2864a
            java.util.List<androidx.constraintlayout.solver.h.h> r2 = r3.f2864a
            r11.addAll(r2)
            java.util.List<androidx.constraintlayout.solver.h.h> r11 = r9.f2869f
            androidx.constraintlayout.solver.h.j r2 = r8.f2817r
            java.util.List<androidx.constraintlayout.solver.h.h> r2 = r2.f2869f
            r11.addAll(r2)
            java.util.List<androidx.constraintlayout.solver.h.h> r11 = r9.f2870g
            androidx.constraintlayout.solver.h.j r2 = r8.f2817r
            java.util.List<androidx.constraintlayout.solver.h.h> r2 = r2.f2870g
            r11.addAll(r2)
            androidx.constraintlayout.solver.h.j r11 = r8.f2817r
            boolean r11 = r11.f2867d
            if (r11 != 0) goto L_0x0213
            r9.f2867d = r1
        L_0x0213:
            androidx.constraintlayout.solver.h.j r11 = r8.f2817r
            r10.remove(r11)
            androidx.constraintlayout.solver.h.j r8 = r8.f2817r
            java.util.List<androidx.constraintlayout.solver.h.h> r8 = r8.f2864a
            java.util.Iterator r8 = r8.iterator()
        L_0x0220:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x022f
            java.lang.Object r10 = r8.next()
            androidx.constraintlayout.solver.h.h r10 = (androidx.constraintlayout.solver.p014h.C0677h) r10
            r10.f2817r = r9
            goto L_0x0220
        L_0x022f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.p014h.C0663a.m3638a(androidx.constraintlayout.solver.h.h, androidx.constraintlayout.solver.h.j, java.util.List, boolean):boolean");
    }

    /* renamed from: a */
    private static void m3636a(C0681i iVar, C0677h hVar, C0682j jVar) {
        jVar.f2867d = false;
        iVar.f2860v1 = false;
        hVar.f2816q0 = false;
    }

    /* renamed from: a */
    private static int m3632a(C0682j jVar, int i) {
        int i2 = i * 2;
        List a = jVar.mo3730a(i);
        int size = a.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C0677h hVar = (C0677h) a.get(i4);
            C0667e[] eVarArr = hVar.f2759C;
            int i5 = i2 + 1;
            i3 = Math.max(i3, m3631a(hVar, i, eVarArr[i5].f2698d == null || !(eVarArr[i2].f2698d == null || eVarArr[i5].f2698d == null), 0));
        }
        jVar.f2868e[i] = i3;
        return i3;
    }

    /* renamed from: a */
    private static int m3631a(C0677h hVar, int i, boolean z, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int U;
        int i9;
        int i10;
        int i11;
        C0677h hVar2 = hVar;
        int i12 = i;
        boolean z2 = z;
        int i13 = 0;
        if (!hVar2.f2816q0) {
            return 0;
        }
        boolean z3 = hVar2.f2831y.f2698d != null && i12 == 1;
        if (z2) {
            i6 = hVar.mo3643d();
            i5 = hVar.mo3688q() - hVar.mo3643d();
            i4 = i12 * 2;
            i3 = i4 + 1;
        } else {
            i6 = hVar.mo3688q() - hVar.mo3643d();
            i5 = hVar.mo3643d();
            i3 = i12 * 2;
            i4 = i3 + 1;
        }
        C0667e[] eVarArr = hVar2.f2759C;
        if (eVarArr[i3].f2698d == null || eVarArr[i4].f2698d != null) {
            i7 = i3;
            i8 = 1;
        } else {
            i7 = i4;
            i4 = i3;
            i8 = -1;
        }
        int c = (hVar2.f2759C[i4].mo3536c() * i8) + m3630a(hVar, i);
        int i14 = (z3 ? i2 - i6 : i2) + c;
        int U2 = (i12 == 0 ? hVar.mo3593U() : hVar.mo3688q()) * i8;
        Iterator it = hVar2.f2759C[i4].mo3542g().f2932a.iterator();
        while (it.hasNext()) {
            i13 = Math.max(i13, m3631a(((C0688o) it.next()).f2915f.f2696b, i12, z2, i14));
        }
        Iterator it2 = hVar2.f2759C[i7].mo3542g().f2932a.iterator();
        int i15 = 0;
        while (it2.hasNext()) {
            Iterator it3 = it2;
            i15 = Math.max(i15, m3631a(((C0688o) it2.next()).f2915f.f2696b, i12, z2, U2 + i14));
            it2 = it3;
        }
        if (z3) {
            i13 -= i6;
            U = i15 + i5;
        } else {
            U = i15 + ((i12 == 0 ? hVar.mo3593U() : hVar.mo3688q()) * i8);
        }
        int i16 = 1;
        if (i12 == 1) {
            Iterator it4 = hVar2.f2831y.mo3542g().f2932a.iterator();
            int i17 = 0;
            while (it4.hasNext()) {
                Iterator it5 = it4;
                C0688o oVar = (C0688o) it4.next();
                if (i8 == i16) {
                    i17 = Math.max(i17, m3631a(oVar.f2915f.f2696b, i12, z2, i6 + i14));
                    i11 = i7;
                } else {
                    i11 = i7;
                    i17 = Math.max(i17, m3631a(oVar.f2915f.f2696b, i12, z2, (i5 * i8) + i14));
                }
                it4 = it5;
                i7 = i11;
                i16 = 1;
            }
            i9 = i7;
            int i18 = i17;
            i10 = (hVar2.f2831y.mo3542g().f2932a.size() <= 0 || z3) ? i18 : i8 == 1 ? i18 + i6 : i18 - i5;
        } else {
            i9 = i7;
            i10 = 0;
        }
        int max = c + Math.max(i13, Math.max(U, i10));
        int i19 = i14 + U2;
        if (i8 != -1) {
            int i20 = i14;
            i14 = i19;
            i19 = i20;
        }
        if (z2) {
            C0686m.m3932a(hVar2, i12, i19);
            hVar2.mo3603a(i19, i14, i12);
        } else {
            hVar2.f2817r.mo3731a(hVar2, i12);
            hVar2.mo3660g(i19, i12);
        }
        if (hVar.mo3636c(i) == C0680c.MATCH_CONSTRAINT && hVar2.f2765I != 0.0f) {
            hVar2.f2817r.mo3731a(hVar2, i12);
        }
        C0667e[] eVarArr2 = hVar2.f2759C;
        if (!(eVarArr2[i4].f2698d == null || eVarArr2[i9].f2698d == null)) {
            C0677h G = hVar.mo3580G();
            C0667e[] eVarArr3 = hVar2.f2759C;
            if (eVarArr3[i4].f2698d.f2696b == G && eVarArr3[i9].f2698d.f2696b == G) {
                hVar2.f2817r.mo3731a(hVar2, i12);
            }
        }
        return max;
    }

    /* renamed from: a */
    private static void m3633a(C0667e eVar) {
        C0688o g = eVar.mo3542g();
        C0667e eVar2 = eVar.f2698d;
        if (eVar2 != null && eVar2.f2698d != eVar) {
            eVar2.mo3542g().mo3776a((C0690q) g);
        }
    }

    /* renamed from: a */
    public static void m3637a(List<C0682j> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (C0677h hVar : ((C0682j) list.get(i3)).mo3732b(i)) {
                if (hVar.f2816q0) {
                    m3634a(hVar, i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m3634a(C0677h hVar, int i, int i2) {
        int i3 = i * 2;
        C0667e[] eVarArr = hVar.f2759C;
        C0667e eVar = eVarArr[i3];
        C0667e eVar2 = eVarArr[i3 + 1];
        if ((eVar.f2698d == null || eVar2.f2698d == null) ? false : true) {
            C0686m.m3932a(hVar, i, m3630a(hVar, i) + eVar.mo3536c());
        } else if (hVar.f2765I == 0.0f || hVar.mo3636c(i) != C0680c.MATCH_CONSTRAINT) {
            int e = i2 - hVar.mo3650e(i);
            int d = e - hVar.mo3644d(i);
            hVar.mo3603a(d, e, i);
            C0686m.m3932a(hVar, i, d);
        } else {
            int a = m3629a(hVar);
            int i4 = (int) hVar.f2759C[i3].mo3542g().f2920k;
            int i5 = i4 + a;
            eVar2.mo3542g().f2919j = eVar.mo3542g();
            eVar2.mo3542g().f2920k = (float) a;
            eVar2.mo3542g().f2933b = 1;
            hVar.mo3603a(i4, i5, i);
        }
    }

    /* renamed from: a */
    private static int m3630a(C0677h hVar, int i) {
        int i2 = i * 2;
        C0667e[] eVarArr = hVar.f2759C;
        C0667e eVar = eVarArr[i2];
        C0667e eVar2 = eVarArr[i2 + 1];
        C0667e eVar3 = eVar.f2698d;
        if (eVar3 != null) {
            C0677h hVar2 = eVar3.f2696b;
            C0677h hVar3 = hVar.f2762F;
            if (hVar2 == hVar3) {
                C0667e eVar4 = eVar2.f2698d;
                if (eVar4 != null && eVar4.f2696b == hVar3) {
                    return (int) (((float) (((hVar3.mo3644d(i) - eVar.mo3536c()) - eVar2.mo3536c()) - hVar.mo3644d(i))) * (i == 0 ? hVar.f2782Z : hVar.f2784a0));
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static int m3629a(C0677h hVar) {
        float f;
        float f2;
        if (hVar.mo3698u() == C0680c.MATCH_CONSTRAINT) {
            if (hVar.f2766J == 0) {
                f2 = ((float) hVar.mo3688q()) * hVar.f2765I;
            } else {
                f2 = ((float) hVar.mo3688q()) / hVar.f2765I;
            }
            int i = (int) f2;
            hVar.mo3699u(i);
            return i;
        } else if (hVar.mo3591S() != C0680c.MATCH_CONSTRAINT) {
            return -1;
        } else {
            if (hVar.f2766J == 1) {
                f = ((float) hVar.mo3593U()) * hVar.f2765I;
            } else {
                f = ((float) hVar.mo3593U()) / hVar.f2765I;
            }
            int i2 = (int) f;
            hVar.mo3679m(i2);
            return i2;
        }
    }
}
