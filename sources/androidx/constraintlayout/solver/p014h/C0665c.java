package androidx.constraintlayout.solver.p014h;

import androidx.constraintlayout.solver.C0654d;

/* renamed from: androidx.constraintlayout.solver.h.c */
/* compiled from: Chain */
class C0665c {

    /* renamed from: a */
    private static final boolean f2672a = false;

    C0665c() {
    }

    /* renamed from: a */
    static void m3649a(C0681i iVar, C0654d dVar, int i) {
        int i2;
        C0666d[] dVarArr;
        int i3;
        if (i == 0) {
            int i4 = iVar.f2849k1;
            dVarArr = iVar.f2852n1;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            int i5 = iVar.f2850l1;
            i2 = i5;
            dVarArr = iVar.f2851m1;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            C0666d dVar2 = dVarArr[i6];
            dVar2.mo3512a();
            if (!iVar.mo3511z(4)) {
                m3650a(iVar, dVar, i, i3, dVar2);
            } else if (!C0686m.m3935a(iVar, dVar, i, i3, dVar2)) {
                m3650a(iVar, dVar, i, i3, dVar2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2.f2822t0 == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r2.f2824u0 == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0454  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0367 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m3650a(androidx.constraintlayout.solver.p014h.C0681i r36, androidx.constraintlayout.solver.C0654d r37, int r38, int r39, androidx.constraintlayout.solver.p014h.C0666d r40) {
        /*
            r0 = r36
            r9 = r37
            r1 = r40
            androidx.constraintlayout.solver.h.h r10 = r1.f2673a
            androidx.constraintlayout.solver.h.h r11 = r1.f2675c
            androidx.constraintlayout.solver.h.h r12 = r1.f2674b
            androidx.constraintlayout.solver.h.h r13 = r1.f2676d
            androidx.constraintlayout.solver.h.h r2 = r1.f2677e
            float r3 = r1.f2683k
            androidx.constraintlayout.solver.h.h r4 = r1.f2678f
            androidx.constraintlayout.solver.h.h r4 = r1.f2679g
            androidx.constraintlayout.solver.h.h$c[] r4 = r0.f2761E
            r4 = r4[r38]
            androidx.constraintlayout.solver.h.h$c r5 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r38 != 0) goto L_0x0038
            int r8 = r2.f2822t0
            if (r8 != 0) goto L_0x002b
            r8 = 1
            goto L_0x002c
        L_0x002b:
            r8 = 0
        L_0x002c:
            int r14 = r2.f2822t0
            if (r14 != r7) goto L_0x0032
            r14 = 1
            goto L_0x0033
        L_0x0032:
            r14 = 0
        L_0x0033:
            int r15 = r2.f2822t0
            if (r15 != r5) goto L_0x004c
            goto L_0x004a
        L_0x0038:
            int r8 = r2.f2824u0
            if (r8 != 0) goto L_0x003e
            r8 = 1
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            int r14 = r2.f2824u0
            if (r14 != r7) goto L_0x0045
            r14 = 1
            goto L_0x0046
        L_0x0045:
            r14 = 0
        L_0x0046:
            int r15 = r2.f2824u0
            if (r15 != r5) goto L_0x004c
        L_0x004a:
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r15 = r8
            r8 = r10
            r16 = r14
            r14 = r5
            r5 = 0
        L_0x0053:
            r21 = 0
            if (r5 != 0) goto L_0x0124
            androidx.constraintlayout.solver.h.e[] r7 = r8.f2759C
            r7 = r7[r39]
            if (r4 != 0) goto L_0x0063
            if (r14 == 0) goto L_0x0060
            goto L_0x0063
        L_0x0060:
            r23 = 4
            goto L_0x0065
        L_0x0063:
            r23 = 1
        L_0x0065:
            int r24 = r7.mo3536c()
            androidx.constraintlayout.solver.h.e r6 = r7.f2698d
            if (r6 == 0) goto L_0x0075
            if (r8 == r10) goto L_0x0075
            int r6 = r6.mo3536c()
            int r24 = r24 + r6
        L_0x0075:
            r6 = r24
            if (r14 == 0) goto L_0x0083
            if (r8 == r10) goto L_0x0083
            if (r8 == r12) goto L_0x0083
            r24 = r3
            r23 = r5
            r3 = 6
            goto L_0x0093
        L_0x0083:
            if (r15 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x008d
            r24 = r3
            r23 = r5
            r3 = 4
            goto L_0x0093
        L_0x008d:
            r24 = r3
            r3 = r23
            r23 = r5
        L_0x0093:
            androidx.constraintlayout.solver.h.e r5 = r7.f2698d
            if (r5 == 0) goto L_0x00bc
            if (r8 != r12) goto L_0x00a6
            r25 = r15
            androidx.constraintlayout.solver.g r15 = r7.f2704j
            androidx.constraintlayout.solver.g r5 = r5.f2704j
            r26 = r2
            r2 = 5
            r9.mo3475b(r15, r5, r6, r2)
            goto L_0x00b2
        L_0x00a6:
            r26 = r2
            r25 = r15
            androidx.constraintlayout.solver.g r2 = r7.f2704j
            androidx.constraintlayout.solver.g r5 = r5.f2704j
            r15 = 6
            r9.mo3475b(r2, r5, r6, r15)
        L_0x00b2:
            androidx.constraintlayout.solver.g r2 = r7.f2704j
            androidx.constraintlayout.solver.h.e r5 = r7.f2698d
            androidx.constraintlayout.solver.g r5 = r5.f2704j
            r9.mo3457a(r2, r5, r6, r3)
            goto L_0x00c0
        L_0x00bc:
            r26 = r2
            r25 = r15
        L_0x00c0:
            if (r4 == 0) goto L_0x00f5
            int r2 = r8.mo3592T()
            r3 = 8
            if (r2 == r3) goto L_0x00e4
            androidx.constraintlayout.solver.h.h$c[] r2 = r8.f2761E
            r2 = r2[r38]
            androidx.constraintlayout.solver.h.h$c r3 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00e4
            androidx.constraintlayout.solver.h.e[] r2 = r8.f2759C
            int r3 = r39 + 1
            r3 = r2[r3]
            androidx.constraintlayout.solver.g r3 = r3.f2704j
            r2 = r2[r39]
            androidx.constraintlayout.solver.g r2 = r2.f2704j
            r5 = 5
            r6 = 0
            r9.mo3475b(r3, r2, r6, r5)
            goto L_0x00e5
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            androidx.constraintlayout.solver.h.e[] r2 = r8.f2759C
            r2 = r2[r39]
            androidx.constraintlayout.solver.g r2 = r2.f2704j
            androidx.constraintlayout.solver.h.e[] r3 = r0.f2759C
            r3 = r3[r39]
            androidx.constraintlayout.solver.g r3 = r3.f2704j
            r5 = 6
            r9.mo3475b(r2, r3, r6, r5)
        L_0x00f5:
            androidx.constraintlayout.solver.h.e[] r2 = r8.f2759C
            int r3 = r39 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.h.e r2 = r2.f2698d
            if (r2 == 0) goto L_0x0114
            androidx.constraintlayout.solver.h.h r2 = r2.f2696b
            androidx.constraintlayout.solver.h.e[] r3 = r2.f2759C
            r5 = r3[r39]
            androidx.constraintlayout.solver.h.e r5 = r5.f2698d
            if (r5 == 0) goto L_0x0114
            r3 = r3[r39]
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            androidx.constraintlayout.solver.h.h r3 = r3.f2696b
            if (r3 == r8) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r21 = r2
        L_0x0114:
            if (r21 == 0) goto L_0x011b
            r8 = r21
            r5 = r23
            goto L_0x011c
        L_0x011b:
            r5 = 1
        L_0x011c:
            r3 = r24
            r15 = r25
            r2 = r26
            goto L_0x0053
        L_0x0124:
            r26 = r2
            r24 = r3
            r25 = r15
            if (r13 == 0) goto L_0x014c
            androidx.constraintlayout.solver.h.e[] r2 = r11.f2759C
            int r3 = r39 + 1
            r5 = r2[r3]
            androidx.constraintlayout.solver.h.e r5 = r5.f2698d
            if (r5 == 0) goto L_0x014c
            androidx.constraintlayout.solver.h.e[] r5 = r13.f2759C
            r5 = r5[r3]
            androidx.constraintlayout.solver.g r6 = r5.f2704j
            r2 = r2[r3]
            androidx.constraintlayout.solver.h.e r2 = r2.f2698d
            androidx.constraintlayout.solver.g r2 = r2.f2704j
            int r3 = r5.mo3536c()
            int r3 = -r3
            r7 = 5
            r9.mo3478c(r6, r2, r3, r7)
            goto L_0x014d
        L_0x014c:
            r7 = 5
        L_0x014d:
            if (r4 == 0) goto L_0x0167
            androidx.constraintlayout.solver.h.e[] r0 = r0.f2759C
            int r2 = r39 + 1
            r0 = r0[r2]
            androidx.constraintlayout.solver.g r0 = r0.f2704j
            androidx.constraintlayout.solver.h.e[] r3 = r11.f2759C
            r4 = r3[r2]
            androidx.constraintlayout.solver.g r4 = r4.f2704j
            r2 = r3[r2]
            int r2 = r2.mo3536c()
            r3 = 6
            r9.mo3475b(r0, r4, r2, r3)
        L_0x0167:
            java.util.ArrayList<androidx.constraintlayout.solver.h.h> r0 = r1.f2680h
            if (r0 == 0) goto L_0x0216
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0216
            boolean r4 = r1.f2686n
            if (r4 == 0) goto L_0x017e
            boolean r4 = r1.f2688p
            if (r4 != 0) goto L_0x017e
            int r4 = r1.f2682j
            float r4 = (float) r4
            goto L_0x0180
        L_0x017e:
            r4 = r24
        L_0x0180:
            r5 = 0
            r8 = r21
            r6 = 0
            r28 = 0
        L_0x0186:
            if (r6 >= r2) goto L_0x0216
            java.lang.Object r15 = r0.get(r6)
            androidx.constraintlayout.solver.h.h r15 = (androidx.constraintlayout.solver.p014h.C0677h) r15
            float[] r3 = r15.f2830x0
            r3 = r3[r38]
            int r23 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r23 >= 0) goto L_0x01b2
            boolean r3 = r1.f2688p
            if (r3 == 0) goto L_0x01ad
            androidx.constraintlayout.solver.h.e[] r3 = r15.f2759C
            int r15 = r39 + 1
            r15 = r3[r15]
            androidx.constraintlayout.solver.g r15 = r15.f2704j
            r3 = r3[r39]
            androidx.constraintlayout.solver.g r3 = r3.f2704j
            r5 = 0
            r7 = 4
            r9.mo3457a(r15, r3, r5, r7)
            r7 = 6
            goto L_0x01c8
        L_0x01ad:
            r7 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            goto L_0x01b3
        L_0x01b2:
            r7 = 4
        L_0x01b3:
            int r20 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r20 != 0) goto L_0x01cd
            androidx.constraintlayout.solver.h.e[] r3 = r15.f2759C
            int r15 = r39 + 1
            r15 = r3[r15]
            androidx.constraintlayout.solver.g r15 = r15.f2704j
            r3 = r3[r39]
            androidx.constraintlayout.solver.g r3 = r3.f2704j
            r5 = 0
            r7 = 6
            r9.mo3457a(r15, r3, r5, r7)
        L_0x01c8:
            r24 = r0
            r22 = r2
            goto L_0x020b
        L_0x01cd:
            r5 = 0
            r7 = 6
            if (r8 == 0) goto L_0x0204
            androidx.constraintlayout.solver.h.e[] r8 = r8.f2759C
            r5 = r8[r39]
            androidx.constraintlayout.solver.g r5 = r5.f2704j
            int r22 = r39 + 1
            r8 = r8[r22]
            androidx.constraintlayout.solver.g r8 = r8.f2704j
            androidx.constraintlayout.solver.h.e[] r7 = r15.f2759C
            r24 = r0
            r0 = r7[r39]
            androidx.constraintlayout.solver.g r0 = r0.f2704j
            r7 = r7[r22]
            androidx.constraintlayout.solver.g r7 = r7.f2704j
            r22 = r2
            androidx.constraintlayout.solver.b r2 = r37.mo3473b()
            r27 = r2
            r29 = r4
            r30 = r3
            r31 = r5
            r32 = r8
            r33 = r0
            r34 = r7
            r27.mo3426a(r28, r29, r30, r31, r32, r33, r34)
            r9.mo3462a(r2)
            goto L_0x0208
        L_0x0204:
            r24 = r0
            r22 = r2
        L_0x0208:
            r28 = r3
            r8 = r15
        L_0x020b:
            int r6 = r6 + 1
            r2 = r22
            r0 = r24
            r3 = 1
            r5 = 0
            r7 = 5
            goto L_0x0186
        L_0x0216:
            if (r12 == 0) goto L_0x0278
            if (r12 == r13) goto L_0x021c
            if (r14 == 0) goto L_0x0278
        L_0x021c:
            androidx.constraintlayout.solver.h.e[] r0 = r10.f2759C
            r1 = r0[r39]
            androidx.constraintlayout.solver.h.e[] r2 = r11.f2759C
            int r3 = r39 + 1
            r2 = r2[r3]
            r4 = r0[r39]
            androidx.constraintlayout.solver.h.e r4 = r4.f2698d
            if (r4 == 0) goto L_0x0234
            r0 = r0[r39]
            androidx.constraintlayout.solver.h.e r0 = r0.f2698d
            androidx.constraintlayout.solver.g r0 = r0.f2704j
            r4 = r0
            goto L_0x0236
        L_0x0234:
            r4 = r21
        L_0x0236:
            androidx.constraintlayout.solver.h.e[] r0 = r11.f2759C
            r5 = r0[r3]
            androidx.constraintlayout.solver.h.e r5 = r5.f2698d
            if (r5 == 0) goto L_0x0246
            r0 = r0[r3]
            androidx.constraintlayout.solver.h.e r0 = r0.f2698d
            androidx.constraintlayout.solver.g r0 = r0.f2704j
            r5 = r0
            goto L_0x0248
        L_0x0246:
            r5 = r21
        L_0x0248:
            if (r12 != r13) goto L_0x0250
            androidx.constraintlayout.solver.h.e[] r0 = r12.f2759C
            r1 = r0[r39]
            r2 = r0[r3]
        L_0x0250:
            if (r4 == 0) goto L_0x049a
            if (r5 == 0) goto L_0x049a
            if (r38 != 0) goto L_0x025b
            r0 = r26
            float r0 = r0.f2782Z
            goto L_0x025f
        L_0x025b:
            r0 = r26
            float r0 = r0.f2784a0
        L_0x025f:
            r6 = r0
            int r3 = r1.mo3536c()
            int r7 = r2.mo3536c()
            androidx.constraintlayout.solver.g r1 = r1.f2704j
            androidx.constraintlayout.solver.g r8 = r2.f2704j
            r10 = 5
            r0 = r37
            r2 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r0.mo3468a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x049a
        L_0x0278:
            if (r25 == 0) goto L_0x036b
            if (r12 == 0) goto L_0x036b
            int r0 = r1.f2682j
            if (r0 <= 0) goto L_0x0287
            int r1 = r1.f2681i
            if (r1 != r0) goto L_0x0287
            r17 = 1
            goto L_0x0289
        L_0x0287:
            r17 = 0
        L_0x0289:
            r14 = r12
            r15 = r14
        L_0x028b:
            if (r14 == 0) goto L_0x049a
            androidx.constraintlayout.solver.h.h[] r0 = r14.f2834z0
            r0 = r0[r38]
            r8 = r0
        L_0x0292:
            if (r8 == 0) goto L_0x02a1
            int r0 = r8.mo3592T()
            r7 = 8
            if (r0 != r7) goto L_0x02a3
            androidx.constraintlayout.solver.h.h[] r0 = r8.f2834z0
            r8 = r0[r38]
            goto L_0x0292
        L_0x02a1:
            r7 = 8
        L_0x02a3:
            if (r8 != 0) goto L_0x02b0
            if (r14 != r13) goto L_0x02a8
            goto L_0x02b0
        L_0x02a8:
            r18 = r8
            r19 = 4
            r20 = 6
            goto L_0x035e
        L_0x02b0:
            androidx.constraintlayout.solver.h.e[] r0 = r14.f2759C
            r0 = r0[r39]
            androidx.constraintlayout.solver.g r1 = r0.f2704j
            androidx.constraintlayout.solver.h.e r2 = r0.f2698d
            if (r2 == 0) goto L_0x02bd
            androidx.constraintlayout.solver.g r2 = r2.f2704j
            goto L_0x02bf
        L_0x02bd:
            r2 = r21
        L_0x02bf:
            if (r15 == r14) goto L_0x02ca
            androidx.constraintlayout.solver.h.e[] r2 = r15.f2759C
            int r3 = r39 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.g r2 = r2.f2704j
            goto L_0x02df
        L_0x02ca:
            if (r14 != r12) goto L_0x02df
            if (r15 != r14) goto L_0x02df
            androidx.constraintlayout.solver.h.e[] r2 = r10.f2759C
            r3 = r2[r39]
            androidx.constraintlayout.solver.h.e r3 = r3.f2698d
            if (r3 == 0) goto L_0x02dd
            r2 = r2[r39]
            androidx.constraintlayout.solver.h.e r2 = r2.f2698d
            androidx.constraintlayout.solver.g r2 = r2.f2704j
            goto L_0x02df
        L_0x02dd:
            r2 = r21
        L_0x02df:
            int r0 = r0.mo3536c()
            androidx.constraintlayout.solver.h.e[] r3 = r14.f2759C
            int r4 = r39 + 1
            r3 = r3[r4]
            int r3 = r3.mo3536c()
            if (r8 == 0) goto L_0x02fc
            androidx.constraintlayout.solver.h.e[] r5 = r8.f2759C
            r5 = r5[r39]
            androidx.constraintlayout.solver.g r6 = r5.f2704j
            androidx.constraintlayout.solver.h.e[] r7 = r14.f2759C
            r7 = r7[r4]
            androidx.constraintlayout.solver.g r7 = r7.f2704j
            goto L_0x030f
        L_0x02fc:
            androidx.constraintlayout.solver.h.e[] r5 = r11.f2759C
            r5 = r5[r4]
            androidx.constraintlayout.solver.h.e r5 = r5.f2698d
            if (r5 == 0) goto L_0x0307
            androidx.constraintlayout.solver.g r6 = r5.f2704j
            goto L_0x0309
        L_0x0307:
            r6 = r21
        L_0x0309:
            androidx.constraintlayout.solver.h.e[] r7 = r14.f2759C
            r7 = r7[r4]
            androidx.constraintlayout.solver.g r7 = r7.f2704j
        L_0x030f:
            if (r5 == 0) goto L_0x0316
            int r5 = r5.mo3536c()
            int r3 = r3 + r5
        L_0x0316:
            if (r15 == 0) goto L_0x0321
            androidx.constraintlayout.solver.h.e[] r5 = r15.f2759C
            r5 = r5[r4]
            int r5 = r5.mo3536c()
            int r0 = r0 + r5
        L_0x0321:
            if (r1 == 0) goto L_0x02a8
            if (r2 == 0) goto L_0x02a8
            if (r6 == 0) goto L_0x02a8
            if (r7 == 0) goto L_0x02a8
            if (r14 != r12) goto L_0x0333
            androidx.constraintlayout.solver.h.e[] r0 = r12.f2759C
            r0 = r0[r39]
            int r0 = r0.mo3536c()
        L_0x0333:
            r5 = r0
            if (r14 != r13) goto L_0x0341
            androidx.constraintlayout.solver.h.e[] r0 = r13.f2759C
            r0 = r0[r4]
            int r0 = r0.mo3536c()
            r18 = r0
            goto L_0x0343
        L_0x0341:
            r18 = r3
        L_0x0343:
            if (r17 == 0) goto L_0x0348
            r22 = 6
            goto L_0x034a
        L_0x0348:
            r22 = 4
        L_0x034a:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r3 = r5
            r5 = r6
            r6 = r7
            r19 = 4
            r20 = 6
            r7 = r18
            r18 = r8
            r8 = r22
            r0.mo3468a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x035e:
            int r0 = r14.mo3592T()
            r8 = 8
            if (r0 == r8) goto L_0x0367
            r15 = r14
        L_0x0367:
            r14 = r18
            goto L_0x028b
        L_0x036b:
            r8 = 8
            r19 = 4
            r20 = 6
            if (r16 == 0) goto L_0x049a
            if (r12 == 0) goto L_0x049a
            int r0 = r1.f2682j
            if (r0 <= 0) goto L_0x0380
            int r1 = r1.f2681i
            if (r1 != r0) goto L_0x0380
            r17 = 1
            goto L_0x0382
        L_0x0380:
            r17 = 0
        L_0x0382:
            r14 = r12
            r15 = r14
        L_0x0384:
            if (r14 == 0) goto L_0x043c
            androidx.constraintlayout.solver.h.h[] r0 = r14.f2834z0
            r0 = r0[r38]
        L_0x038a:
            if (r0 == 0) goto L_0x0397
            int r1 = r0.mo3592T()
            if (r1 != r8) goto L_0x0397
            androidx.constraintlayout.solver.h.h[] r0 = r0.f2834z0
            r0 = r0[r38]
            goto L_0x038a
        L_0x0397:
            if (r14 == r12) goto L_0x0429
            if (r14 == r13) goto L_0x0429
            if (r0 == 0) goto L_0x0429
            if (r0 != r13) goto L_0x03a2
            r7 = r21
            goto L_0x03a3
        L_0x03a2:
            r7 = r0
        L_0x03a3:
            androidx.constraintlayout.solver.h.e[] r0 = r14.f2759C
            r0 = r0[r39]
            androidx.constraintlayout.solver.g r1 = r0.f2704j
            androidx.constraintlayout.solver.h.e r2 = r0.f2698d
            if (r2 == 0) goto L_0x03af
            androidx.constraintlayout.solver.g r2 = r2.f2704j
        L_0x03af:
            androidx.constraintlayout.solver.h.e[] r2 = r15.f2759C
            int r3 = r39 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.g r2 = r2.f2704j
            int r0 = r0.mo3536c()
            androidx.constraintlayout.solver.h.e[] r4 = r14.f2759C
            r4 = r4[r3]
            int r4 = r4.mo3536c()
            if (r7 == 0) goto L_0x03d5
            androidx.constraintlayout.solver.h.e[] r5 = r7.f2759C
            r5 = r5[r39]
            androidx.constraintlayout.solver.g r6 = r5.f2704j
            androidx.constraintlayout.solver.h.e r8 = r5.f2698d
            if (r8 == 0) goto L_0x03d2
            androidx.constraintlayout.solver.g r8 = r8.f2704j
            goto L_0x03e8
        L_0x03d2:
            r8 = r21
            goto L_0x03e8
        L_0x03d5:
            androidx.constraintlayout.solver.h.e[] r5 = r14.f2759C
            r5 = r5[r3]
            androidx.constraintlayout.solver.h.e r5 = r5.f2698d
            if (r5 == 0) goto L_0x03e0
            androidx.constraintlayout.solver.g r6 = r5.f2704j
            goto L_0x03e2
        L_0x03e0:
            r6 = r21
        L_0x03e2:
            androidx.constraintlayout.solver.h.e[] r8 = r14.f2759C
            r8 = r8[r3]
            androidx.constraintlayout.solver.g r8 = r8.f2704j
        L_0x03e8:
            if (r5 == 0) goto L_0x03ef
            int r5 = r5.mo3536c()
            int r4 = r4 + r5
        L_0x03ef:
            r18 = r4
            if (r15 == 0) goto L_0x03fc
            androidx.constraintlayout.solver.h.e[] r4 = r15.f2759C
            r3 = r4[r3]
            int r3 = r3.mo3536c()
            int r0 = r0 + r3
        L_0x03fc:
            r3 = r0
            if (r17 == 0) goto L_0x0402
            r22 = 6
            goto L_0x0404
        L_0x0402:
            r22 = 4
        L_0x0404:
            if (r1 == 0) goto L_0x0420
            if (r2 == 0) goto L_0x0420
            if (r6 == 0) goto L_0x0420
            if (r8 == 0) goto L_0x0420
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r5 = r6
            r6 = r8
            r23 = r7
            r7 = r18
            r18 = r15
            r15 = 8
            r8 = r22
            r0.mo3468a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0426
        L_0x0420:
            r23 = r7
            r18 = r15
            r15 = 8
        L_0x0426:
            r0 = r23
            goto L_0x042d
        L_0x0429:
            r18 = r15
            r15 = 8
        L_0x042d:
            int r1 = r14.mo3592T()
            if (r1 == r15) goto L_0x0434
            goto L_0x0436
        L_0x0434:
            r14 = r18
        L_0x0436:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x0384
        L_0x043c:
            androidx.constraintlayout.solver.h.e[] r0 = r12.f2759C
            r0 = r0[r39]
            androidx.constraintlayout.solver.h.e[] r1 = r10.f2759C
            r1 = r1[r39]
            androidx.constraintlayout.solver.h.e r1 = r1.f2698d
            androidx.constraintlayout.solver.h.e[] r2 = r13.f2759C
            int r3 = r39 + 1
            r10 = r2[r3]
            androidx.constraintlayout.solver.h.e[] r2 = r11.f2759C
            r2 = r2[r3]
            androidx.constraintlayout.solver.h.e r14 = r2.f2698d
            if (r1 == 0) goto L_0x0489
            if (r12 == r13) goto L_0x0463
            androidx.constraintlayout.solver.g r2 = r0.f2704j
            androidx.constraintlayout.solver.g r1 = r1.f2704j
            int r0 = r0.mo3536c()
            r15 = 5
            r9.mo3457a(r2, r1, r0, r15)
            goto L_0x048a
        L_0x0463:
            r15 = 5
            if (r14 == 0) goto L_0x048a
            androidx.constraintlayout.solver.g r2 = r0.f2704j
            androidx.constraintlayout.solver.g r3 = r1.f2704j
            int r4 = r0.mo3536c()
            r5 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.solver.g r6 = r10.f2704j
            androidx.constraintlayout.solver.g r7 = r14.f2704j
            int r8 = r10.mo3536c()
            r17 = 5
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r17
            r0.mo3468a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x048a
        L_0x0489:
            r15 = 5
        L_0x048a:
            if (r14 == 0) goto L_0x049a
            if (r12 == r13) goto L_0x049a
            androidx.constraintlayout.solver.g r0 = r10.f2704j
            androidx.constraintlayout.solver.g r1 = r14.f2704j
            int r2 = r10.mo3536c()
            int r2 = -r2
            r9.mo3457a(r0, r1, r2, r15)
        L_0x049a:
            if (r25 != 0) goto L_0x049e
            if (r16 == 0) goto L_0x04fe
        L_0x049e:
            if (r12 == 0) goto L_0x04fe
            androidx.constraintlayout.solver.h.e[] r0 = r12.f2759C
            r0 = r0[r39]
            androidx.constraintlayout.solver.h.e[] r1 = r13.f2759C
            int r2 = r39 + 1
            r1 = r1[r2]
            androidx.constraintlayout.solver.h.e r3 = r0.f2698d
            if (r3 == 0) goto L_0x04b1
            androidx.constraintlayout.solver.g r3 = r3.f2704j
            goto L_0x04b3
        L_0x04b1:
            r3 = r21
        L_0x04b3:
            androidx.constraintlayout.solver.h.e r4 = r1.f2698d
            if (r4 == 0) goto L_0x04ba
            androidx.constraintlayout.solver.g r4 = r4.f2704j
            goto L_0x04bc
        L_0x04ba:
            r4 = r21
        L_0x04bc:
            if (r11 == r13) goto L_0x04cb
            androidx.constraintlayout.solver.h.e[] r4 = r11.f2759C
            r4 = r4[r2]
            androidx.constraintlayout.solver.h.e r4 = r4.f2698d
            if (r4 == 0) goto L_0x04c9
            androidx.constraintlayout.solver.g r4 = r4.f2704j
            goto L_0x04cb
        L_0x04c9:
            r4 = r21
        L_0x04cb:
            r5 = r4
            if (r12 != r13) goto L_0x04d9
            androidx.constraintlayout.solver.h.e[] r0 = r12.f2759C
            r1 = r0[r39]
            r0 = r0[r2]
            r35 = r1
            r1 = r0
            r0 = r35
        L_0x04d9:
            if (r3 == 0) goto L_0x04fe
            if (r5 == 0) goto L_0x04fe
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.mo3536c()
            if (r13 != 0) goto L_0x04e6
            goto L_0x04e7
        L_0x04e6:
            r11 = r13
        L_0x04e7:
            androidx.constraintlayout.solver.h.e[] r7 = r11.f2759C
            r2 = r7[r2]
            int r7 = r2.mo3536c()
            androidx.constraintlayout.solver.g r2 = r0.f2704j
            androidx.constraintlayout.solver.g r8 = r1.f2704j
            r10 = 5
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.mo3468a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x04fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.p014h.C0665c.m3650a(androidx.constraintlayout.solver.h.i, androidx.constraintlayout.solver.d, int, int, androidx.constraintlayout.solver.h.d):void");
    }
}
