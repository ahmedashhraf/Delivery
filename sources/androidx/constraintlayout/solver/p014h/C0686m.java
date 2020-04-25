package androidx.constraintlayout.solver.p014h;

import androidx.constraintlayout.solver.C0654d;
import androidx.constraintlayout.solver.p014h.C0677h.C0680c;

/* renamed from: androidx.constraintlayout.solver.h.m */
/* compiled from: Optimizer */
public class C0686m {

    /* renamed from: a */
    public static final int f2893a = 0;

    /* renamed from: b */
    public static final int f2894b = 1;

    /* renamed from: c */
    public static final int f2895c = 2;

    /* renamed from: d */
    public static final int f2896d = 4;

    /* renamed from: e */
    public static final int f2897e = 8;

    /* renamed from: f */
    public static final int f2898f = 16;

    /* renamed from: g */
    public static final int f2899g = 32;

    /* renamed from: h */
    public static final int f2900h = 7;

    /* renamed from: i */
    static boolean[] f2901i = new boolean[3];

    /* renamed from: j */
    static final int f2902j = 0;

    /* renamed from: k */
    static final int f2903k = 1;

    /* renamed from: l */
    static final int f2904l = 2;

    /* renamed from: a */
    static void m3933a(C0681i iVar, C0654d dVar, C0677h hVar) {
        if (iVar.f2761E[0] != C0680c.WRAP_CONTENT && hVar.f2761E[0] == C0680c.MATCH_PARENT) {
            int i = hVar.f2823u.f2699e;
            int U = iVar.mo3593U() - hVar.f2827w.f2699e;
            C0667e eVar = hVar.f2823u;
            eVar.f2704j = dVar.mo3460a((Object) eVar);
            C0667e eVar2 = hVar.f2827w;
            eVar2.f2704j = dVar.mo3460a((Object) eVar2);
            dVar.mo3466a(hVar.f2823u.f2704j, i);
            dVar.mo3466a(hVar.f2827w.f2704j, U);
            hVar.f2783a = 2;
            hVar.mo3639c(i, U);
        }
        if (iVar.f2761E[1] != C0680c.WRAP_CONTENT && hVar.f2761E[1] == C0680c.MATCH_PARENT) {
            int i2 = hVar.f2825v.f2699e;
            int q = iVar.mo3688q() - hVar.f2829x.f2699e;
            C0667e eVar3 = hVar.f2825v;
            eVar3.f2704j = dVar.mo3460a((Object) eVar3);
            C0667e eVar4 = hVar.f2829x;
            eVar4.f2704j = dVar.mo3460a((Object) eVar4);
            dVar.mo3466a(hVar.f2825v.f2704j, i2);
            dVar.mo3466a(hVar.f2829x.f2704j, q);
            if (hVar.f2777U > 0 || hVar.mo3592T() == 8) {
                C0667e eVar5 = hVar.f2831y;
                eVar5.f2704j = dVar.mo3460a((Object) eVar5);
                dVar.mo3466a(hVar.f2831y.f2704j, hVar.f2777U + i2);
            }
            hVar.f2785b = 2;
            hVar.mo3664h(i2, q);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003b A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m3934a(androidx.constraintlayout.solver.p014h.C0677h r5, int r6) {
        /*
            androidx.constraintlayout.solver.h.h$c[] r0 = r5.f2761E
            r1 = r0[r6]
            androidx.constraintlayout.solver.h.h$c r2 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r2) goto L_0x000a
            return r3
        L_0x000a:
            float r1 = r5.f2765I
            r2 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x001d
            if (r6 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            r5 = r0[r4]
            androidx.constraintlayout.solver.h.h$c r6 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x001c
        L_0x001c:
            return r3
        L_0x001d:
            if (r6 != 0) goto L_0x002d
            int r6 = r5.f2791e
            if (r6 == 0) goto L_0x0024
            return r3
        L_0x0024:
            int r6 = r5.f2797h
            if (r6 != 0) goto L_0x002c
            int r5 = r5.f2799i
            if (r5 == 0) goto L_0x003b
        L_0x002c:
            return r3
        L_0x002d:
            int r6 = r5.f2793f
            if (r6 == 0) goto L_0x0032
            return r3
        L_0x0032:
            int r6 = r5.f2803k
            if (r6 != 0) goto L_0x003c
            int r5 = r5.f2805l
            if (r5 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            return r4
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.p014h.C0686m.m3934a(androidx.constraintlayout.solver.h.h, int):boolean");
    }

    /* renamed from: a */
    static void m3931a(int i, C0677h hVar) {
        C0677h hVar2 = hVar;
        hVar.mo3690q0();
        C0688o g = hVar2.f2823u.mo3542g();
        C0688o g2 = hVar2.f2825v.mo3542g();
        C0688o g3 = hVar2.f2827w.mo3542g();
        C0688o g4 = hVar2.f2829x.mo3542g();
        boolean z = (i & 8) == 8;
        boolean z2 = hVar2.f2761E[0] == C0680c.MATCH_CONSTRAINT && m3934a(hVar2, 0);
        if (!(g.f2921l == 4 || g3.f2921l == 4)) {
            if (hVar2.f2761E[0] == C0680c.FIXED || (z2 && hVar.mo3592T() == 8)) {
                if (hVar2.f2823u.f2698d == null && hVar2.f2827w.f2698d == null) {
                    g.mo3765b(1);
                    g3.mo3765b(1);
                    if (z) {
                        g3.mo3763a(g, 1, hVar.mo3582I());
                    } else {
                        g3.mo3762a(g, hVar.mo3593U());
                    }
                } else if (hVar2.f2823u.f2698d != null && hVar2.f2827w.f2698d == null) {
                    g.mo3765b(1);
                    g3.mo3765b(1);
                    if (z) {
                        g3.mo3763a(g, 1, hVar.mo3582I());
                    } else {
                        g3.mo3762a(g, hVar.mo3593U());
                    }
                } else if (hVar2.f2823u.f2698d == null && hVar2.f2827w.f2698d != null) {
                    g.mo3765b(1);
                    g3.mo3765b(1);
                    g.mo3762a(g3, -hVar.mo3593U());
                    if (z) {
                        g.mo3763a(g3, -1, hVar.mo3582I());
                    } else {
                        g.mo3762a(g3, -hVar.mo3593U());
                    }
                } else if (!(hVar2.f2823u.f2698d == null || hVar2.f2827w.f2698d == null)) {
                    g.mo3765b(2);
                    g3.mo3765b(2);
                    if (z) {
                        hVar.mo3582I().mo3776a((C0690q) g);
                        hVar.mo3582I().mo3776a((C0690q) g3);
                        g.mo3767b(g3, -1, hVar.mo3582I());
                        g3.mo3767b(g, 1, hVar.mo3582I());
                    } else {
                        g.mo3766b(g3, (float) (-hVar.mo3593U()));
                        g3.mo3766b(g, (float) hVar.mo3593U());
                    }
                }
            } else if (z2) {
                int U = hVar.mo3593U();
                g.mo3765b(1);
                g3.mo3765b(1);
                if (hVar2.f2823u.f2698d == null && hVar2.f2827w.f2698d == null) {
                    if (z) {
                        g3.mo3763a(g, 1, hVar.mo3582I());
                    } else {
                        g3.mo3762a(g, U);
                    }
                } else if (hVar2.f2823u.f2698d == null || hVar2.f2827w.f2698d != null) {
                    if (hVar2.f2823u.f2698d != null || hVar2.f2827w.f2698d == null) {
                        if (!(hVar2.f2823u.f2698d == null || hVar2.f2827w.f2698d == null)) {
                            if (z) {
                                hVar.mo3582I().mo3776a((C0690q) g);
                                hVar.mo3582I().mo3776a((C0690q) g3);
                            }
                            if (hVar2.f2765I == 0.0f) {
                                g.mo3765b(3);
                                g3.mo3765b(3);
                                g.mo3766b(g3, 0.0f);
                                g3.mo3766b(g, 0.0f);
                            } else {
                                g.mo3765b(2);
                                g3.mo3765b(2);
                                g.mo3766b(g3, (float) (-U));
                                g3.mo3766b(g, (float) U);
                                hVar2.mo3699u(U);
                            }
                        }
                    } else if (z) {
                        g.mo3763a(g3, -1, hVar.mo3582I());
                    } else {
                        g.mo3762a(g3, -U);
                    }
                } else if (z) {
                    g3.mo3763a(g, 1, hVar.mo3582I());
                } else {
                    g3.mo3762a(g, U);
                }
            }
        }
        boolean z3 = hVar2.f2761E[1] == C0680c.MATCH_CONSTRAINT && m3934a(hVar2, 1);
        if (g2.f2921l != 4 && g4.f2921l != 4) {
            if (hVar2.f2761E[1] == C0680c.FIXED || (z3 && hVar.mo3592T() == 8)) {
                if (hVar2.f2825v.f2698d == null && hVar2.f2829x.f2698d == null) {
                    g2.mo3765b(1);
                    g4.mo3765b(1);
                    if (z) {
                        g4.mo3763a(g2, 1, hVar.mo3581H());
                    } else {
                        g4.mo3762a(g2, hVar.mo3688q());
                    }
                    C0667e eVar = hVar2.f2831y;
                    if (eVar.f2698d != null) {
                        eVar.mo3542g().mo3765b(1);
                        g2.mo3759a(1, hVar2.f2831y.mo3542g(), -hVar2.f2777U);
                    }
                } else if (hVar2.f2825v.f2698d != null && hVar2.f2829x.f2698d == null) {
                    g2.mo3765b(1);
                    g4.mo3765b(1);
                    if (z) {
                        g4.mo3763a(g2, 1, hVar.mo3581H());
                    } else {
                        g4.mo3762a(g2, hVar.mo3688q());
                    }
                    if (hVar2.f2777U > 0) {
                        hVar2.f2831y.mo3542g().mo3759a(1, g2, hVar2.f2777U);
                    }
                } else if (hVar2.f2825v.f2698d == null && hVar2.f2829x.f2698d != null) {
                    g2.mo3765b(1);
                    g4.mo3765b(1);
                    if (z) {
                        g2.mo3763a(g4, -1, hVar.mo3581H());
                    } else {
                        g2.mo3762a(g4, -hVar.mo3688q());
                    }
                    if (hVar2.f2777U > 0) {
                        hVar2.f2831y.mo3542g().mo3759a(1, g2, hVar2.f2777U);
                    }
                } else if (hVar2.f2825v.f2698d != null && hVar2.f2829x.f2698d != null) {
                    g2.mo3765b(2);
                    g4.mo3765b(2);
                    if (z) {
                        g2.mo3767b(g4, -1, hVar.mo3581H());
                        g4.mo3767b(g2, 1, hVar.mo3581H());
                        hVar.mo3581H().mo3776a((C0690q) g2);
                        hVar.mo3582I().mo3776a((C0690q) g4);
                    } else {
                        g2.mo3766b(g4, (float) (-hVar.mo3688q()));
                        g4.mo3766b(g2, (float) hVar.mo3688q());
                    }
                    if (hVar2.f2777U > 0) {
                        hVar2.f2831y.mo3542g().mo3759a(1, g2, hVar2.f2777U);
                    }
                }
            } else if (z3) {
                int q = hVar.mo3688q();
                g2.mo3765b(1);
                g4.mo3765b(1);
                if (hVar2.f2825v.f2698d == null && hVar2.f2829x.f2698d == null) {
                    if (z) {
                        g4.mo3763a(g2, 1, hVar.mo3581H());
                    } else {
                        g4.mo3762a(g2, q);
                    }
                } else if (hVar2.f2825v.f2698d == null || hVar2.f2829x.f2698d != null) {
                    if (hVar2.f2825v.f2698d != null || hVar2.f2829x.f2698d == null) {
                        if (hVar2.f2825v.f2698d != null && hVar2.f2829x.f2698d != null) {
                            if (z) {
                                hVar.mo3581H().mo3776a((C0690q) g2);
                                hVar.mo3582I().mo3776a((C0690q) g4);
                            }
                            if (hVar2.f2765I == 0.0f) {
                                g2.mo3765b(3);
                                g4.mo3765b(3);
                                g2.mo3766b(g4, 0.0f);
                                g4.mo3766b(g2, 0.0f);
                                return;
                            }
                            g2.mo3765b(2);
                            g4.mo3765b(2);
                            g2.mo3766b(g4, (float) (-q));
                            g4.mo3766b(g2, (float) q);
                            hVar2.mo3679m(q);
                            if (hVar2.f2777U > 0) {
                                hVar2.f2831y.mo3542g().mo3759a(1, g2, hVar2.f2777U);
                            }
                        }
                    } else if (z) {
                        g2.mo3763a(g4, -1, hVar.mo3581H());
                    } else {
                        g2.mo3762a(g4, -q);
                    }
                } else if (z) {
                    g4.mo3763a(g2, 1, hVar.mo3581H());
                } else {
                    g4.mo3762a(g2, q);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r7.f2822t0 == 2) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r7.f2824u0 == 2) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0109  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m3935a(androidx.constraintlayout.solver.p014h.C0681i r24, androidx.constraintlayout.solver.C0654d r25, int r26, int r27, androidx.constraintlayout.solver.p014h.C0666d r28) {
        /*
            r0 = r25
            r1 = r26
            r2 = r28
            androidx.constraintlayout.solver.h.h r3 = r2.f2673a
            androidx.constraintlayout.solver.h.h r4 = r2.f2675c
            androidx.constraintlayout.solver.h.h r5 = r2.f2674b
            androidx.constraintlayout.solver.h.h r6 = r2.f2676d
            androidx.constraintlayout.solver.h.h r7 = r2.f2677e
            float r8 = r2.f2683k
            androidx.constraintlayout.solver.h.h r9 = r2.f2678f
            androidx.constraintlayout.solver.h.h r2 = r2.f2679g
            r9 = r24
            androidx.constraintlayout.solver.h.h$c[] r2 = r9.f2761E
            r2 = r2[r1]
            androidx.constraintlayout.solver.h.h$c r9 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            r2 = 2
            r10 = 1
            if (r1 != 0) goto L_0x0038
            int r11 = r7.f2822t0
            if (r11 != 0) goto L_0x0028
            r11 = 1
            goto L_0x0029
        L_0x0028:
            r11 = 0
        L_0x0029:
            int r12 = r7.f2822t0
            if (r12 != r10) goto L_0x002f
            r12 = 1
            goto L_0x0030
        L_0x002f:
            r12 = 0
        L_0x0030:
            int r7 = r7.f2822t0
            if (r7 != r2) goto L_0x0036
        L_0x0034:
            r2 = 1
            goto L_0x004b
        L_0x0036:
            r2 = 0
            goto L_0x004b
        L_0x0038:
            int r11 = r7.f2824u0
            if (r11 != 0) goto L_0x003e
            r11 = 1
            goto L_0x003f
        L_0x003e:
            r11 = 0
        L_0x003f:
            int r12 = r7.f2824u0
            if (r12 != r10) goto L_0x0045
            r12 = 1
            goto L_0x0046
        L_0x0045:
            r12 = 0
        L_0x0046:
            int r7 = r7.f2824u0
            if (r7 != r2) goto L_0x0036
            goto L_0x0034
        L_0x004b:
            r14 = r3
            r10 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0053:
            r7 = 8
            if (r13 != 0) goto L_0x010c
            int r9 = r14.mo3592T()
            if (r9 == r7) goto L_0x00a1
            int r15 = r15 + 1
            if (r1 != 0) goto L_0x0066
            int r9 = r14.mo3593U()
            goto L_0x006a
        L_0x0066:
            int r9 = r14.mo3688q()
        L_0x006a:
            float r9 = (float) r9
            float r16 = r16 + r9
            if (r14 == r5) goto L_0x007a
            androidx.constraintlayout.solver.h.e[] r9 = r14.f2759C
            r9 = r9[r27]
            int r9 = r9.mo3536c()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x007a:
            if (r14 == r6) goto L_0x0089
            androidx.constraintlayout.solver.h.e[] r9 = r14.f2759C
            int r19 = r27 + 1
            r9 = r9[r19]
            int r9 = r9.mo3536c()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x0089:
            androidx.constraintlayout.solver.h.e[] r9 = r14.f2759C
            r9 = r9[r27]
            int r9 = r9.mo3536c()
            float r9 = (float) r9
            float r17 = r17 + r9
            androidx.constraintlayout.solver.h.e[] r9 = r14.f2759C
            int r19 = r27 + 1
            r9 = r9[r19]
            int r9 = r9.mo3536c()
            float r9 = (float) r9
            float r17 = r17 + r9
        L_0x00a1:
            androidx.constraintlayout.solver.h.e[] r9 = r14.f2759C
            r9 = r9[r27]
            int r9 = r14.mo3592T()
            if (r9 == r7) goto L_0x00df
            androidx.constraintlayout.solver.h.h$c[] r7 = r14.f2761E
            r7 = r7[r1]
            androidx.constraintlayout.solver.h.h$c r9 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_CONSTRAINT
            if (r7 != r9) goto L_0x00df
            int r10 = r10 + 1
            if (r1 != 0) goto L_0x00c7
            int r7 = r14.f2791e
            if (r7 == 0) goto L_0x00bd
            r7 = 0
            return r7
        L_0x00bd:
            r7 = 0
            int r9 = r14.f2797h
            if (r9 != 0) goto L_0x00c6
            int r9 = r14.f2799i
            if (r9 == 0) goto L_0x00d6
        L_0x00c6:
            return r7
        L_0x00c7:
            r7 = 0
            int r9 = r14.f2793f
            if (r9 == 0) goto L_0x00cd
            return r7
        L_0x00cd:
            int r9 = r14.f2803k
            if (r9 != 0) goto L_0x00de
            int r9 = r14.f2805l
            if (r9 == 0) goto L_0x00d6
            goto L_0x00de
        L_0x00d6:
            float r9 = r14.f2765I
            r18 = 0
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x00df
        L_0x00de:
            return r7
        L_0x00df:
            androidx.constraintlayout.solver.h.e[] r7 = r14.f2759C
            int r9 = r27 + 1
            r7 = r7[r9]
            androidx.constraintlayout.solver.h.e r7 = r7.f2698d
            if (r7 == 0) goto L_0x0101
            androidx.constraintlayout.solver.h.h r7 = r7.f2696b
            androidx.constraintlayout.solver.h.e[] r9 = r7.f2759C
            r20 = r7
            r7 = r9[r27]
            androidx.constraintlayout.solver.h.e r7 = r7.f2698d
            if (r7 == 0) goto L_0x0101
            r7 = r9[r27]
            androidx.constraintlayout.solver.h.e r7 = r7.f2698d
            androidx.constraintlayout.solver.h.h r7 = r7.f2696b
            if (r7 == r14) goto L_0x00fe
            goto L_0x0101
        L_0x00fe:
            r19 = r20
            goto L_0x0103
        L_0x0101:
            r19 = 0
        L_0x0103:
            if (r19 == 0) goto L_0x0109
            r14 = r19
            goto L_0x0053
        L_0x0109:
            r13 = 1
            goto L_0x0053
        L_0x010c:
            androidx.constraintlayout.solver.h.e[] r9 = r3.f2759C
            r9 = r9[r27]
            androidx.constraintlayout.solver.h.o r9 = r9.mo3542g()
            androidx.constraintlayout.solver.h.e[] r13 = r4.f2759C
            int r19 = r27 + 1
            r13 = r13[r19]
            androidx.constraintlayout.solver.h.o r13 = r13.mo3542g()
            androidx.constraintlayout.solver.h.o r7 = r9.f2917h
            if (r7 == 0) goto L_0x0382
            r21 = r3
            androidx.constraintlayout.solver.h.o r3 = r13.f2917h
            if (r3 != 0) goto L_0x012a
            goto L_0x0382
        L_0x012a:
            int r7 = r7.f2933b
            r0 = 1
            if (r7 != r0) goto L_0x0380
            int r3 = r3.f2933b
            if (r3 == r0) goto L_0x0135
            goto L_0x0380
        L_0x0135:
            if (r10 <= 0) goto L_0x013b
            if (r10 == r15) goto L_0x013b
            r0 = 0
            return r0
        L_0x013b:
            if (r2 != 0) goto L_0x0144
            if (r11 != 0) goto L_0x0144
            if (r12 == 0) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            r7 = 0
            goto L_0x015d
        L_0x0144:
            if (r5 == 0) goto L_0x0150
            androidx.constraintlayout.solver.h.e[] r0 = r5.f2759C
            r0 = r0[r27]
            int r0 = r0.mo3536c()
            float r7 = (float) r0
            goto L_0x0151
        L_0x0150:
            r7 = 0
        L_0x0151:
            if (r6 == 0) goto L_0x015d
            androidx.constraintlayout.solver.h.e[] r0 = r6.f2759C
            r0 = r0[r19]
            int r0 = r0.mo3536c()
            float r0 = (float) r0
            float r7 = r7 + r0
        L_0x015d:
            androidx.constraintlayout.solver.h.o r0 = r9.f2917h
            float r0 = r0.f2920k
            androidx.constraintlayout.solver.h.o r3 = r13.f2917h
            float r3 = r3.f2920k
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x016b
            float r3 = r3 - r0
            goto L_0x016d
        L_0x016b:
            float r3 = r0 - r3
        L_0x016d:
            float r3 = r3 - r16
            r22 = 1
            if (r10 <= 0) goto L_0x0223
            if (r10 != r15) goto L_0x0223
            androidx.constraintlayout.solver.h.h r2 = r14.mo3580G()
            if (r2 == 0) goto L_0x0189
            androidx.constraintlayout.solver.h.h r2 = r14.mo3580G()
            androidx.constraintlayout.solver.h.h$c[] r2 = r2.f2761E
            r2 = r2[r1]
            androidx.constraintlayout.solver.h.h$c r5 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            if (r2 != r5) goto L_0x0189
            r2 = 0
            return r2
        L_0x0189:
            float r3 = r3 + r16
            float r3 = r3 - r17
            r2 = r0
            r0 = r21
        L_0x0190:
            if (r0 == 0) goto L_0x0221
            androidx.constraintlayout.solver.e r5 = androidx.constraintlayout.solver.C0654d.f2589t
            if (r5 == 0) goto L_0x01a8
            long r6 = r5.f2607B
            long r6 = r6 - r22
            r5.f2607B = r6
            long r6 = r5.f2628s
            long r6 = r6 + r22
            r5.f2628s = r6
            long r6 = r5.f2634y
            long r6 = r6 + r22
            r5.f2634y = r6
        L_0x01a8:
            androidx.constraintlayout.solver.h.h[] r5 = r0.f2834z0
            r5 = r5[r1]
            if (r5 != 0) goto L_0x01b4
            if (r0 != r4) goto L_0x01b1
            goto L_0x01b4
        L_0x01b1:
            r13 = r25
            goto L_0x021e
        L_0x01b4:
            float r6 = (float) r10
            float r6 = r3 / r6
            r7 = 0
            int r11 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x01cd
            float[] r6 = r0.f2830x0
            r7 = r6[r1]
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x01c8
            r7 = 0
            goto L_0x01ce
        L_0x01c8:
            r6 = r6[r1]
            float r6 = r6 * r3
            float r6 = r6 / r8
        L_0x01cd:
            r7 = r6
        L_0x01ce:
            int r6 = r0.mo3592T()
            r11 = 8
            if (r6 != r11) goto L_0x01d7
            r7 = 0
        L_0x01d7:
            androidx.constraintlayout.solver.h.e[] r6 = r0.f2759C
            r6 = r6[r27]
            int r6 = r6.mo3536c()
            float r6 = (float) r6
            float r2 = r2 + r6
            androidx.constraintlayout.solver.h.e[] r6 = r0.f2759C
            r6 = r6[r27]
            androidx.constraintlayout.solver.h.o r6 = r6.mo3542g()
            androidx.constraintlayout.solver.h.o r11 = r9.f2919j
            r6.mo3761a(r11, r2)
            androidx.constraintlayout.solver.h.e[] r6 = r0.f2759C
            r6 = r6[r19]
            androidx.constraintlayout.solver.h.o r6 = r6.mo3542g()
            androidx.constraintlayout.solver.h.o r11 = r9.f2919j
            float r2 = r2 + r7
            r6.mo3761a(r11, r2)
            androidx.constraintlayout.solver.h.e[] r6 = r0.f2759C
            r6 = r6[r27]
            androidx.constraintlayout.solver.h.o r6 = r6.mo3542g()
            r13 = r25
            r6.mo3760a(r13)
            androidx.constraintlayout.solver.h.e[] r6 = r0.f2759C
            r6 = r6[r19]
            androidx.constraintlayout.solver.h.o r6 = r6.mo3542g()
            r6.mo3760a(r13)
            androidx.constraintlayout.solver.h.e[] r0 = r0.f2759C
            r0 = r0[r19]
            int r0 = r0.mo3536c()
            float r0 = (float) r0
            float r2 = r2 + r0
        L_0x021e:
            r0 = r5
            goto L_0x0190
        L_0x0221:
            r0 = 1
            return r0
        L_0x0223:
            r13 = r25
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x022d
            r2 = 1
            r11 = 0
            r12 = 0
        L_0x022d:
            if (r2 == 0) goto L_0x02ac
            float r3 = r3 - r7
            r2 = r21
            float r5 = r2.mo3625b(r1)
            float r3 = r3 * r5
            float r0 = r0 + r3
        L_0x0239:
            if (r2 == 0) goto L_0x02b3
            androidx.constraintlayout.solver.e r3 = androidx.constraintlayout.solver.C0654d.f2589t
            if (r3 == 0) goto L_0x0251
            long r5 = r3.f2607B
            long r5 = r5 - r22
            r3.f2607B = r5
            long r5 = r3.f2628s
            long r5 = r5 + r22
            r3.f2628s = r5
            long r5 = r3.f2634y
            long r5 = r5 + r22
            r3.f2634y = r5
        L_0x0251:
            androidx.constraintlayout.solver.h.h[] r3 = r2.f2834z0
            r3 = r3[r1]
            if (r3 != 0) goto L_0x0259
            if (r2 != r4) goto L_0x02aa
        L_0x0259:
            if (r1 != 0) goto L_0x0260
            int r5 = r2.mo3593U()
            goto L_0x0264
        L_0x0260:
            int r5 = r2.mo3688q()
        L_0x0264:
            float r5 = (float) r5
            androidx.constraintlayout.solver.h.e[] r6 = r2.f2759C
            r6 = r6[r27]
            int r6 = r6.mo3536c()
            float r6 = (float) r6
            float r0 = r0 + r6
            androidx.constraintlayout.solver.h.e[] r6 = r2.f2759C
            r6 = r6[r27]
            androidx.constraintlayout.solver.h.o r6 = r6.mo3542g()
            androidx.constraintlayout.solver.h.o r7 = r9.f2919j
            r6.mo3761a(r7, r0)
            androidx.constraintlayout.solver.h.e[] r6 = r2.f2759C
            r6 = r6[r19]
            androidx.constraintlayout.solver.h.o r6 = r6.mo3542g()
            androidx.constraintlayout.solver.h.o r7 = r9.f2919j
            float r0 = r0 + r5
            r6.mo3761a(r7, r0)
            androidx.constraintlayout.solver.h.e[] r5 = r2.f2759C
            r5 = r5[r27]
            androidx.constraintlayout.solver.h.o r5 = r5.mo3542g()
            r5.mo3760a(r13)
            androidx.constraintlayout.solver.h.e[] r5 = r2.f2759C
            r5 = r5[r19]
            androidx.constraintlayout.solver.h.o r5 = r5.mo3542g()
            r5.mo3760a(r13)
            androidx.constraintlayout.solver.h.e[] r2 = r2.f2759C
            r2 = r2[r19]
            int r2 = r2.mo3536c()
            float r2 = (float) r2
            float r0 = r0 + r2
        L_0x02aa:
            r2 = r3
            goto L_0x0239
        L_0x02ac:
            r2 = r21
            if (r11 != 0) goto L_0x02b6
            if (r12 == 0) goto L_0x02b3
            goto L_0x02b6
        L_0x02b3:
            r0 = 1
            goto L_0x037f
        L_0x02b6:
            if (r11 == 0) goto L_0x02ba
        L_0x02b8:
            float r3 = r3 - r7
            goto L_0x02bd
        L_0x02ba:
            if (r12 == 0) goto L_0x02bd
            goto L_0x02b8
        L_0x02bd:
            int r6 = r15 + 1
            float r6 = (float) r6
            float r6 = r3 / r6
            if (r12 == 0) goto L_0x02cf
            r7 = 1
            if (r15 <= r7) goto L_0x02cb
            int r6 = r15 + -1
            float r6 = (float) r6
            goto L_0x02cd
        L_0x02cb:
            r6 = 1073741824(0x40000000, float:2.0)
        L_0x02cd:
            float r6 = r3 / r6
        L_0x02cf:
            int r3 = r2.mo3592T()
            r7 = 8
            if (r3 == r7) goto L_0x02da
            float r3 = r0 + r6
            goto L_0x02db
        L_0x02da:
            r3 = r0
        L_0x02db:
            if (r12 == 0) goto L_0x02ea
            r7 = 1
            if (r15 <= r7) goto L_0x02ea
            androidx.constraintlayout.solver.h.e[] r3 = r5.f2759C
            r3 = r3[r27]
            int r3 = r3.mo3536c()
            float r3 = (float) r3
            float r3 = r3 + r0
        L_0x02ea:
            if (r11 == 0) goto L_0x02f8
            if (r5 == 0) goto L_0x02f8
            androidx.constraintlayout.solver.h.e[] r0 = r5.f2759C
            r0 = r0[r27]
            int r0 = r0.mo3536c()
            float r0 = (float) r0
            float r3 = r3 + r0
        L_0x02f8:
            if (r2 == 0) goto L_0x02b3
            androidx.constraintlayout.solver.e r0 = androidx.constraintlayout.solver.C0654d.f2589t
            if (r0 == 0) goto L_0x0310
            long r7 = r0.f2607B
            long r7 = r7 - r22
            r0.f2607B = r7
            long r7 = r0.f2628s
            long r7 = r7 + r22
            r0.f2628s = r7
            long r7 = r0.f2634y
            long r7 = r7 + r22
            r0.f2634y = r7
        L_0x0310:
            androidx.constraintlayout.solver.h.h[] r0 = r2.f2834z0
            r0 = r0[r1]
            if (r0 != 0) goto L_0x031c
            if (r2 != r4) goto L_0x0319
            goto L_0x031c
        L_0x0319:
            r7 = 8
            goto L_0x037c
        L_0x031c:
            if (r1 != 0) goto L_0x0323
            int r7 = r2.mo3593U()
            goto L_0x0327
        L_0x0323:
            int r7 = r2.mo3688q()
        L_0x0327:
            float r7 = (float) r7
            if (r2 == r5) goto L_0x0334
            androidx.constraintlayout.solver.h.e[] r8 = r2.f2759C
            r8 = r8[r27]
            int r8 = r8.mo3536c()
            float r8 = (float) r8
            float r3 = r3 + r8
        L_0x0334:
            androidx.constraintlayout.solver.h.e[] r8 = r2.f2759C
            r8 = r8[r27]
            androidx.constraintlayout.solver.h.o r8 = r8.mo3542g()
            androidx.constraintlayout.solver.h.o r10 = r9.f2919j
            r8.mo3761a(r10, r3)
            androidx.constraintlayout.solver.h.e[] r8 = r2.f2759C
            r8 = r8[r19]
            androidx.constraintlayout.solver.h.o r8 = r8.mo3542g()
            androidx.constraintlayout.solver.h.o r10 = r9.f2919j
            float r11 = r3 + r7
            r8.mo3761a(r10, r11)
            androidx.constraintlayout.solver.h.e[] r8 = r2.f2759C
            r8 = r8[r27]
            androidx.constraintlayout.solver.h.o r8 = r8.mo3542g()
            r8.mo3760a(r13)
            androidx.constraintlayout.solver.h.e[] r8 = r2.f2759C
            r8 = r8[r19]
            androidx.constraintlayout.solver.h.o r8 = r8.mo3542g()
            r8.mo3760a(r13)
            androidx.constraintlayout.solver.h.e[] r2 = r2.f2759C
            r2 = r2[r19]
            int r2 = r2.mo3536c()
            float r2 = (float) r2
            float r7 = r7 + r2
            float r3 = r3 + r7
            if (r0 == 0) goto L_0x0319
            int r2 = r0.mo3592T()
            r7 = 8
            if (r2 == r7) goto L_0x037c
            float r3 = r3 + r6
        L_0x037c:
            r2 = r0
            goto L_0x02f8
        L_0x037f:
            return r0
        L_0x0380:
            r0 = 0
            return r0
        L_0x0382:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.p014h.C0686m.m3935a(androidx.constraintlayout.solver.h.i, androidx.constraintlayout.solver.d, int, int, androidx.constraintlayout.solver.h.d):boolean");
    }

    /* renamed from: a */
    static void m3932a(C0677h hVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        hVar.f2759C[i3].mo3542g().f2919j = hVar.mo3580G().f2823u.mo3542g();
        hVar.f2759C[i3].mo3542g().f2920k = (float) i2;
        hVar.f2759C[i3].mo3542g().f2933b = 1;
        hVar.f2759C[i4].mo3542g().f2919j = hVar.f2759C[i3].mo3542g();
        hVar.f2759C[i4].mo3542g().f2920k = (float) hVar.mo3644d(i);
        hVar.f2759C[i4].mo3542g().f2933b = 1;
    }
}
