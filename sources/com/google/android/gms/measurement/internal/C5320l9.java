package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.internal.measurement.C4842l0.C4849d;
import com.google.android.gms.internal.measurement.C4842l0.C4854f;
import com.google.android.gms.internal.measurement.C4842l0.C4854f.C4856b;
import com.google.android.gms.internal.measurement.C4966t0.C4969b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.measurement.internal.l9 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
final class C5320l9 extends C5429v8 {
    C5320l9(C5461y8 y8Var) {
        super(y8Var);
    }

    /* renamed from: b */
    private static void m23199b(Map<Integer, List<Long>> map, int i, long j) {
        List list = (List) map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList();
            map.put(Integer.valueOf(i), list);
        }
        list.add(Long.valueOf(j / 1000));
    }

    /* JADX WARNING: type inference failed for: r28v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r15v3, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r15v4, types: [java.lang.Iterable] */
    /* JADX WARNING: type inference failed for: r9v27, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: type inference failed for: r9v28, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r15v19 */
    /* JADX WARNING: type inference failed for: r9v50 */
    /* JADX WARNING: type inference failed for: r9v51 */
    /* JADX WARNING: type inference failed for: r13v19 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: type inference failed for: r7v21 */
    /* JADX WARNING: type inference failed for: r5v109 */
    /* JADX WARNING: type inference failed for: r15v36 */
    /* JADX WARNING: type inference failed for: r15v37 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0fd2, code lost:
        if (r8.mo19237a() == false) goto L_0x0fdd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0fd4, code lost:
        r13 = java.lang.Integer.valueOf(r8.mo19238o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0fdd, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0fde, code lost:
        r3.mo21551a("Invalid property filter ID. appId, id", r4, java.lang.String.valueOf(r13));
        r10.add(java.lang.Integer.valueOf(r11));
        r6 = r86;
        r4 = r87;
        r5 = r88;
        r9 = r16;
        r45 = r17;
        r8 = r19;
        r3 = r21;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x054c  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x05da  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0668  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x067d  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x068d  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0891  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x08ce  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0b07  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0b0a  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0b12  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0b1a  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0c06  */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0f3a  */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x0f3d  */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x0f45  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0f57  */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x102d  */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x104a  */
    /* JADX WARNING: Removed duplicated region for block: B:561:0x12f1 A[Catch:{ SQLiteException -> 0x1303 }] */
    /* JADX WARNING: Removed duplicated region for block: B:588:0x02d2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:608:0x0963 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02cb  */
    /* JADX WARNING: Unknown variable types count: 7 */
    @androidx.annotation.C0226w0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.C4966t0.C4967a> mo21548a(java.lang.String r86, java.util.List<com.google.android.gms.internal.measurement.C4966t0.C4971c> r87, java.util.List<com.google.android.gms.internal.measurement.C4966t0.C4988k> r88, java.lang.Long r89) {
        /*
            r85 = this;
            r1 = r85
            r15 = r86
            com.google.android.gms.common.internal.C4300a0.m18630b(r86)
            com.google.android.gms.common.internal.C4300a0.m18620a(r87)
            com.google.android.gms.common.internal.C4300a0.m18620a(r88)
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            androidx.collection.a r14 = new androidx.collection.a
            r14.<init>()
            androidx.collection.a r11 = new androidx.collection.a
            r11.<init>()
            androidx.collection.a r12 = new androidx.collection.a
            r12.<init>()
            androidx.collection.a r9 = new androidx.collection.a
            r9.<init>()
            androidx.collection.a r10 = new androidx.collection.a
            r10.<init>()
            com.google.android.gms.measurement.internal.r9 r0 = r85.mo21214m()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C5310l.f15268u0
            boolean r0 = r0.mo21641d(r15, r2)
            r8 = 1
            r7 = 0
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r7)
            if (r0 != 0) goto L_0x0049
            com.google.android.gms.measurement.internal.r9 r0 = r85.mo21214m()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C5310l.f15270v0
            boolean r0 = r0.mo21641d(r15, r2)
            if (r0 == 0) goto L_0x0068
        L_0x0049:
            java.util.Iterator r0 = r87.iterator()
        L_0x004d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.measurement.t0$c r2 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r2
            java.lang.String r2 = r2.mo19478p()
            java.lang.String r3 = "_s"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x004d
            r20 = 1
            goto L_0x006a
        L_0x0068:
            r20 = 0
        L_0x006a:
            com.google.android.gms.measurement.internal.r9 r0 = r85.mo21214m()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C5310l.f15268u0
            boolean r2 = r0.mo21641d(r15, r2)
            com.google.android.gms.measurement.internal.r9 r0 = r85.mo21214m()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C5310l.f15270v0
            boolean r0 = r0.mo21641d(r15, r3)
            if (r20 == 0) goto L_0x00c6
            if (r0 == 0) goto L_0x00c6
            com.google.android.gms.measurement.internal.s9 r3 = r85.mo21217p()
            r3.mo21739s()
            r3.mo21209h()
            com.google.android.gms.common.internal.C4300a0.m18630b(r86)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r3.mo21709w()     // Catch:{ SQLiteException -> 0x00b1 }
            java.lang.String r5 = "events"
            java.lang.String r6 = "app_id = ?"
            r16 = r13
            java.lang.String[] r13 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x00af }
            r13[r7] = r15     // Catch:{ SQLiteException -> 0x00af }
            r4.update(r5, r0, r6, r13)     // Catch:{ SQLiteException -> 0x00af }
            goto L_0x00c8
        L_0x00af:
            r0 = move-exception
            goto L_0x00b4
        L_0x00b1:
            r0 = move-exception
            r16 = r13
        L_0x00b4:
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo21205d()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21533t()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r86)
            java.lang.String r5 = "Error resetting session-scoped event counts. appId"
            r3.mo21551a(r5, r4, r0)
            goto L_0x00c8
        L_0x00c6:
            r16 = r13
        L_0x00c8:
            com.google.android.gms.measurement.internal.s9 r0 = r85.mo21217p()
            java.util.Map r0 = r0.mo21703f(r15)
            if (r0 == 0) goto L_0x0340
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x0340
            java.util.HashSet r3 = new java.util.HashSet
            java.util.Set r4 = r0.keySet()
            r3.<init>(r4)
            if (r2 == 0) goto L_0x01d1
            if (r20 == 0) goto L_0x01d1
            com.google.android.gms.measurement.internal.l9 r4 = r85.mo21215n()
            com.google.android.gms.common.internal.C4300a0.m18630b(r86)
            com.google.android.gms.common.internal.C4300a0.m18620a(r0)
            androidx.collection.a r5 = new androidx.collection.a
            r5.<init>()
            boolean r6 = r0.isEmpty()
            if (r6 != 0) goto L_0x01d2
            com.google.android.gms.measurement.internal.s9 r6 = r4.mo21217p()
            java.util.Map r6 = r6.mo21702e(r15)
            java.util.Set r17 = r0.keySet()
            java.util.Iterator r17 = r17.iterator()
        L_0x010a:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L_0x01d2
            java.lang.Object r18 = r17.next()
            java.lang.Integer r18 = (java.lang.Integer) r18
            int r18 = r18.intValue()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r18)
            java.lang.Object r13 = r0.get(r13)
            com.google.android.gms.internal.measurement.t0$i r13 = (com.google.android.gms.internal.measurement.C4966t0.C4984i) r13
            java.lang.Integer r8 = java.lang.Integer.valueOf(r18)
            java.lang.Object r8 = r6.get(r8)
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x01be
            boolean r23 = r8.isEmpty()
            if (r23 == 0) goto L_0x0138
            goto L_0x01be
        L_0x0138:
            com.google.android.gms.measurement.internal.c9 r7 = r4.mo21216o()
            r24 = r6
            java.util.List r6 = r13.mo19641p()
            java.util.List r6 = r7.mo21195a(r6, r8)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x01bb
            com.google.android.gms.internal.measurement.i4$a r7 = r13.mo19052i()
            com.google.android.gms.internal.measurement.t0$i$a r7 = (com.google.android.gms.internal.measurement.C4966t0.C4984i.C4985a) r7
            com.google.android.gms.internal.measurement.t0$i$a r7 = r7.mo19654l()
            com.google.android.gms.internal.measurement.t0$i$a r6 = r7.mo19651b(r6)
            com.google.android.gms.measurement.internal.c9 r7 = r4.mo21216o()
            r25 = r4
            java.util.List r4 = r13.mo19637a()
            java.util.List r4 = r7.mo21195a(r4, r8)
            com.google.android.gms.internal.measurement.t0$i$a r7 = r6.mo19647a()
            r7.mo19649a(r4)
            r4 = 0
        L_0x0170:
            int r7 = r13.mo19644s()
            if (r4 >= r7) goto L_0x018e
            com.google.android.gms.internal.measurement.t0$b r7 = r13.mo19638b(r4)
            int r7 = r7.mo19470o()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x018b
            r6.mo19648a(r4)
        L_0x018b:
            int r4 = r4 + 1
            goto L_0x0170
        L_0x018e:
            r4 = 0
        L_0x018f:
            int r7 = r13.mo19646u()
            if (r4 >= r7) goto L_0x01ad
            com.google.android.gms.internal.measurement.t0$j r7 = r13.mo19639c(r4)
            int r7 = r7.mo19657o()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x01aa
            r6.mo19650b(r4)
        L_0x01aa:
            int r4 = r4 + 1
            goto L_0x018f
        L_0x01ad:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            com.google.android.gms.internal.measurement.r5 r6 = r6.mo19056B()
            com.google.android.gms.internal.measurement.t0$i r6 = (com.google.android.gms.internal.measurement.C4966t0.C4984i) r6
            r5.put(r4, r6)
            goto L_0x01c9
        L_0x01bb:
            r6 = r24
            goto L_0x01cd
        L_0x01be:
            r25 = r4
            r24 = r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            r5.put(r4, r13)
        L_0x01c9:
            r6 = r24
            r4 = r25
        L_0x01cd:
            r7 = 0
            r8 = 1
            goto L_0x010a
        L_0x01d1:
            r5 = r0
        L_0x01d2:
            java.util.Iterator r3 = r3.iterator()
        L_0x01d6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0340
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r5.get(r6)
            com.google.android.gms.internal.measurement.t0$i r6 = (com.google.android.gms.internal.measurement.C4966t0.C4984i) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Object r7 = r11.get(r7)
            java.util.BitSet r7 = (java.util.BitSet) r7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.lang.Object r8 = r12.get(r8)
            java.util.BitSet r8 = (java.util.BitSet) r8
            androidx.collection.a r13 = new androidx.collection.a
            r13.<init>()
            if (r6 == 0) goto L_0x025b
            int r17 = r6.mo19644s()
            if (r17 != 0) goto L_0x0212
            goto L_0x025b
        L_0x0212:
            java.util.List r17 = r6.mo19643r()
            java.util.Iterator r17 = r17.iterator()
        L_0x021a:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L_0x025b
            java.lang.Object r18 = r17.next()
            com.google.android.gms.internal.measurement.t0$b r18 = (com.google.android.gms.internal.measurement.C4966t0.C4969b) r18
            boolean r24 = r18.mo19469a()
            if (r24 == 0) goto L_0x0252
            int r24 = r18.mo19470o()
            r25 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            boolean r24 = r18.mo19471p()
            if (r24 == 0) goto L_0x024b
            long r26 = r18.mo19472q()
            java.lang.Long r18 = java.lang.Long.valueOf(r26)
            r84 = r18
            r18 = r5
            r5 = r84
            goto L_0x024e
        L_0x024b:
            r18 = r5
            r5 = 0
        L_0x024e:
            r13.put(r3, r5)
            goto L_0x0256
        L_0x0252:
            r25 = r3
            r18 = r5
        L_0x0256:
            r5 = r18
            r3 = r25
            goto L_0x021a
        L_0x025b:
            r25 = r3
            r18 = r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r9.put(r3, r13)
            if (r7 != 0) goto L_0x0280
            java.util.BitSet r7 = new java.util.BitSet
            r7.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r11.put(r3, r7)
            java.util.BitSet r8 = new java.util.BitSet
            r8.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r12.put(r3, r8)
        L_0x0280:
            if (r6 == 0) goto L_0x02db
            r3 = 0
        L_0x0283:
            int r5 = r6.mo19640o()
            int r5 = r5 << 6
            if (r3 >= r5) goto L_0x02db
            java.util.List r5 = r6.mo19637a()
            boolean r5 = com.google.android.gms.measurement.internal.C5221c9.m22550a(r5, r3)
            if (r5 == 0) goto L_0x02c2
            com.google.android.gms.measurement.internal.k3 r5 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21528C()
            r17 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r24 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r26 = r12
            java.lang.String r12 = "Filter already evaluated. audience ID, filter ID"
            r5.mo21551a(r12, r9, r11)
            r8.set(r3)
            java.util.List r5 = r6.mo19641p()
            boolean r5 = com.google.android.gms.measurement.internal.C5221c9.m22550a(r5, r3)
            if (r5 == 0) goto L_0x02c8
            r7.set(r3)
            r5 = 1
            goto L_0x02c9
        L_0x02c2:
            r17 = r9
            r24 = r11
            r26 = r12
        L_0x02c8:
            r5 = 0
        L_0x02c9:
            if (r5 != 0) goto L_0x02d2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r13.remove(r5)
        L_0x02d2:
            int r3 = r3 + 1
            r9 = r17
            r11 = r24
            r12 = r26
            goto L_0x0283
        L_0x02db:
            r17 = r9
            r24 = r11
            r26 = r12
            com.google.android.gms.internal.measurement.t0$a$a r3 = com.google.android.gms.internal.measurement.C4966t0.C4967a.m21123u()
            r5 = 0
            com.google.android.gms.internal.measurement.t0$a$a r3 = r3.mo19465a(r5)
            if (r2 == 0) goto L_0x02fa
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r0.get(r5)
            com.google.android.gms.internal.measurement.t0$i r5 = (com.google.android.gms.internal.measurement.C4966t0.C4984i) r5
            r3.mo19464a(r5)
            goto L_0x02fd
        L_0x02fa:
            r3.mo19464a(r6)
        L_0x02fd:
            com.google.android.gms.internal.measurement.t0$i$a r5 = com.google.android.gms.internal.measurement.C4966t0.C4984i.m21498v()
            java.util.List r6 = com.google.android.gms.measurement.internal.C5221c9.m22542a(r7)
            com.google.android.gms.internal.measurement.t0$i$a r5 = r5.mo19651b(r6)
            java.util.List r6 = com.google.android.gms.measurement.internal.C5221c9.m22542a(r8)
            com.google.android.gms.internal.measurement.t0$i$a r5 = r5.mo19649a(r6)
            java.util.List r6 = m23197a(r13)
            r5.mo19652c(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            androidx.collection.a r7 = new androidx.collection.a
            r7.<init>()
            r10.put(r6, r7)
            r3.mo19463a(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.google.android.gms.internal.measurement.r5 r3 = r3.mo19056B()
            com.google.android.gms.internal.measurement.t0$a r3 = (com.google.android.gms.internal.measurement.C4966t0.C4967a) r3
            r14.put(r4, r3)
            r9 = r17
            r5 = r18
            r11 = r24
            r3 = r25
            r12 = r26
            goto L_0x01d6
        L_0x0340:
            r17 = r9
            r24 = r11
            r26 = r12
            com.google.android.gms.measurement.internal.r9 r0 = r85.mo21214m()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C5310l.f15268u0
            boolean r25 = r0.mo21641d(r15, r2)
            com.google.android.gms.measurement.internal.r9 r0 = r85.mo21214m()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C5310l.f15270v0
            boolean r27 = r0.mo21641d(r15, r2)
            boolean r0 = r87.isEmpty()
            java.lang.String r28 = "null"
            java.lang.String r13 = "Filter definition"
            java.lang.String r9 = "Skipping failed audience ID"
            if (r0 != 0) goto L_0x0bd5
            androidx.collection.a r8 = new androidx.collection.a
            r8.<init>()
            java.util.Iterator r29 = r87.iterator()
            r30 = 0
            r3 = r30
            r0 = 0
            r2 = 0
        L_0x0375:
            boolean r5 = r29.hasNext()
            if (r5 == 0) goto L_0x0bd5
            java.lang.Object r5 = r29.next()
            r7 = r5
            com.google.android.gms.internal.measurement.t0$c r7 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r7
            java.lang.String r5 = r7.mo19478p()
            java.util.List r6 = r7.mo19475a()
            r85.mo21216o()
            java.lang.String r11 = "_eid"
            java.lang.Object r32 = com.google.android.gms.measurement.internal.C5221c9.m22551b(r7, r11)
            r12 = r32
            java.lang.Long r12 = (java.lang.Long) r12
            if (r12 == 0) goto L_0x039c
            r32 = 1
            goto L_0x039e
        L_0x039c:
            r32 = 0
        L_0x039e:
            r34 = r3
            if (r32 == 0) goto L_0x03ac
            java.lang.String r3 = "_ep"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x03ac
            r3 = 1
            goto L_0x03ad
        L_0x03ac:
            r3 = 0
        L_0x03ad:
            r36 = 1
            if (r3 == 0) goto L_0x04e2
            r85.mo21216o()
            java.lang.String r3 = "_en"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C5221c9.m22551b(r7, r3)
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L_0x03d8
            com.google.android.gms.measurement.internal.k3 r3 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21533t()
            java.lang.String r4 = "Extra parameter without an event name. eventId"
            r3.mo21550a(r4, r12)
            r38 = r8
            r39 = r13
            r23 = 1
            goto L_0x04da
        L_0x03d8:
            if (r0 == 0) goto L_0x03ed
            if (r2 == 0) goto L_0x03ed
            long r3 = r12.longValue()
            long r38 = r2.longValue()
            int r32 = (r3 > r38 ? 1 : (r3 == r38 ? 0 : -1))
            if (r32 == 0) goto L_0x03e9
            goto L_0x03ed
        L_0x03e9:
            r11 = r0
            r32 = r2
            goto L_0x0415
        L_0x03ed:
            com.google.android.gms.measurement.internal.s9 r3 = r85.mo21217p()
            android.util.Pair r3 = r3.mo21676a(r15, r12)
            if (r3 == 0) goto L_0x04c6
            java.lang.Object r4 = r3.first
            if (r4 != 0) goto L_0x03fd
            goto L_0x04c6
        L_0x03fd:
            com.google.android.gms.internal.measurement.t0$c r4 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r4
            java.lang.Object r0 = r3.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r85.mo21216o()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C5221c9.m22551b(r4, r11)
            java.lang.Long r0 = (java.lang.Long) r0
            r32 = r0
            r34 = r2
            r11 = r4
        L_0x0415:
            long r34 = r34 - r36
            int r0 = (r34 > r30 ? 1 : (r34 == r30 ? 0 : -1))
            if (r0 > 0) goto L_0x045f
            com.google.android.gms.measurement.internal.s9 r2 = r85.mo21217p()
            r2.mo21209h()
            com.google.android.gms.measurement.internal.k3 r0 = r2.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21528C()
            java.lang.String r3 = "Clearing complex main event info. appId"
            r0.mo21550a(r3, r15)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo21709w()     // Catch:{ SQLiteException -> 0x0444 }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r4 = 1
            java.lang.String[] r12 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0442 }
            r22 = 0
            r12[r22] = r15     // Catch:{ SQLiteException -> 0x0440 }
            r0.execSQL(r3, r12)     // Catch:{ SQLiteException -> 0x0440 }
            goto L_0x0455
        L_0x0440:
            r0 = move-exception
            goto L_0x0448
        L_0x0442:
            r0 = move-exception
            goto L_0x0446
        L_0x0444:
            r0 = move-exception
            r4 = 1
        L_0x0446:
            r22 = 0
        L_0x0448:
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo21205d()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21533t()
            java.lang.String r3 = "Error clearing complex main event"
            r2.mo21550a(r3, r0)
        L_0x0455:
            r12 = r6
            r38 = r8
            r39 = r13
            r23 = 1
            r8 = r5
            r13 = r7
            goto L_0x0478
        L_0x045f:
            r4 = 1
            r22 = 0
            com.google.android.gms.measurement.internal.s9 r2 = r85.mo21217p()
            r3 = r86
            r23 = 1
            r4 = r12
            r12 = r6
            r38 = r8
            r8 = r5
            r5 = r34
            r39 = r13
            r13 = r7
            r7 = r11
            r2.mo21693a(r3, r4, r5, r7)
        L_0x0478:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r0 = r11.mo19475a()
            java.util.Iterator r0 = r0.iterator()
        L_0x0485:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x04a2
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.measurement.t0$e r2 = (com.google.android.gms.internal.measurement.C4966t0.C4975e) r2
            r85.mo21216o()
            java.lang.String r3 = r2.mo19500a()
            com.google.android.gms.internal.measurement.t0$e r3 = com.google.android.gms.measurement.internal.C5221c9.m22540a(r13, r3)
            if (r3 != 0) goto L_0x0485
            r6.add(r2)
            goto L_0x0485
        L_0x04a2:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x04b2
            r6.addAll(r12)
            r40 = r6
            r0 = r8
            r22 = r11
            goto L_0x0534
        L_0x04b2:
            com.google.android.gms.measurement.internal.k3 r0 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21536w()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.mo21550a(r2, r8)
            r0 = r8
            r22 = r11
            r40 = r12
            goto L_0x0534
        L_0x04c6:
            r38 = r8
            r39 = r13
            r23 = 1
            r8 = r5
            com.google.android.gms.measurement.internal.k3 r3 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21533t()
            java.lang.String r4 = "Extra parameter without existing main event. eventName, eventId"
            r3.mo21551a(r4, r8, r12)
        L_0x04da:
            r3 = r34
            r8 = r38
            r13 = r39
            goto L_0x0375
        L_0x04e2:
            r38 = r8
            r39 = r13
            r23 = 1
            r8 = r6
            r13 = r7
            if (r32 == 0) goto L_0x052c
            r85.mo21216o()
            java.lang.Long r0 = java.lang.Long.valueOf(r30)
            java.lang.String r2 = "_epc"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C5221c9.m22551b(r13, r2)
            if (r2 != 0) goto L_0x04fc
            goto L_0x04fd
        L_0x04fc:
            r0 = r2
        L_0x04fd:
            java.lang.Long r0 = (java.lang.Long) r0
            long r34 = r0.longValue()
            int r0 = (r34 > r30 ? 1 : (r34 == r30 ? 0 : -1))
            if (r0 > 0) goto L_0x0516
            com.google.android.gms.measurement.internal.k3 r0 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21536w()
            java.lang.String r2 = "Complex event with zero extra param count. eventName"
            r0.mo21550a(r2, r5)
            r11 = r5
            goto L_0x0524
        L_0x0516:
            com.google.android.gms.measurement.internal.s9 r2 = r85.mo21217p()
            r3 = r86
            r4 = r12
            r11 = r5
            r5 = r34
            r7 = r13
            r2.mo21693a(r3, r4, r5, r7)
        L_0x0524:
            r40 = r8
            r0 = r11
            r32 = r12
            r22 = r13
            goto L_0x0534
        L_0x052c:
            r11 = r5
            r22 = r0
            r32 = r2
            r40 = r8
            r0 = r11
        L_0x0534:
            com.google.android.gms.measurement.internal.r9 r2 = r85.mo21214m()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C5310l.f15270v0
            boolean r2 = r2.mo21641d(r15, r3)
            com.google.android.gms.measurement.internal.s9 r3 = r85.mo21217p()
            java.lang.String r4 = r13.mo19478p()
            com.google.android.gms.measurement.internal.g r3 = r3.mo21677a(r15, r4)
            if (r3 != 0) goto L_0x05da
            com.google.android.gms.measurement.internal.k3 r3 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21536w()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r86)
            com.google.android.gms.measurement.internal.i3 r5 = r85.mo21211j()
            java.lang.String r5 = r5.mo21429a(r0)
            java.lang.String r6 = "Event aggregate wasn't created during raw event logging. appId, event"
            r3.mo21551a(r6, r4, r5)
            if (r2 == 0) goto L_0x05a8
            com.google.android.gms.measurement.internal.g r36 = new com.google.android.gms.measurement.internal.g
            r2 = r36
            java.lang.String r4 = r13.mo19478p()
            r5 = 1
            r7 = 1
            r3 = r38
            r11 = 1
            r37 = 1
            r42 = r9
            r41 = r10
            r12 = r17
            r9 = r37
            long r37 = r13.mo19480r()
            r45 = r12
            r43 = r24
            r44 = r26
            r11 = r37
            r17 = 0
            r21 = r13
            r48 = r14
            r47 = r16
            r49 = r39
            r13 = r17
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r1 = r3
            r3 = r86
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)
            goto L_0x0657
        L_0x05a8:
            r42 = r9
            r41 = r10
            r21 = r13
            r48 = r14
            r47 = r16
            r45 = r17
            r43 = r24
            r44 = r26
            r1 = r38
            r49 = r39
            com.google.android.gms.measurement.internal.g r17 = new com.google.android.gms.measurement.internal.g
            java.lang.String r4 = r21.mo19478p()
            r5 = 1
            r7 = 1
            long r9 = r21.mo19480r()
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r2 = r17
            r3 = r86
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r14, r15, r16)
            goto L_0x0657
        L_0x05da:
            r42 = r9
            r41 = r10
            r21 = r13
            r48 = r14
            r47 = r16
            r45 = r17
            r43 = r24
            r44 = r26
            r1 = r38
            r49 = r39
            if (r2 == 0) goto L_0x0624
            com.google.android.gms.measurement.internal.g r2 = new com.google.android.gms.measurement.internal.g
            r50 = r2
            java.lang.String r4 = r3.f15041a
            r51 = r4
            java.lang.String r4 = r3.f15042b
            r52 = r4
            long r4 = r3.f15043c
            long r53 = r4 + r36
            long r4 = r3.f15044d
            long r55 = r4 + r36
            long r4 = r3.f15045e
            long r57 = r4 + r36
            long r4 = r3.f15046f
            r59 = r4
            long r4 = r3.f15047g
            r61 = r4
            java.lang.Long r4 = r3.f15048h
            r63 = r4
            java.lang.Long r4 = r3.f15049i
            r64 = r4
            java.lang.Long r4 = r3.f15050j
            r65 = r4
            java.lang.Boolean r3 = r3.f15051k
            r66 = r3
            r50.<init>(r51, r52, r53, r55, r57, r59, r61, r63, r64, r65, r66)
            goto L_0x0657
        L_0x0624:
            com.google.android.gms.measurement.internal.g r2 = new com.google.android.gms.measurement.internal.g
            r66 = r2
            java.lang.String r4 = r3.f15041a
            r67 = r4
            java.lang.String r4 = r3.f15042b
            r68 = r4
            long r4 = r3.f15043c
            long r69 = r4 + r36
            long r4 = r3.f15044d
            long r71 = r4 + r36
            long r4 = r3.f15045e
            r73 = r4
            long r4 = r3.f15046f
            r75 = r4
            long r4 = r3.f15047g
            r77 = r4
            java.lang.Long r4 = r3.f15048h
            r79 = r4
            java.lang.Long r4 = r3.f15049i
            r80 = r4
            java.lang.Long r4 = r3.f15050j
            r81 = r4
            java.lang.Boolean r3 = r3.f15051k
            r82 = r3
            r66.<init>(r67, r68, r69, r71, r73, r75, r77, r79, r80, r81, r82)
        L_0x0657:
            com.google.android.gms.measurement.internal.s9 r3 = r85.mo21217p()
            r3.mo21686a(r2)
            long r3 = r2.f15043c
            java.lang.Object r5 = r1.get(r0)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L_0x067d
            com.google.android.gms.measurement.internal.s9 r5 = r85.mo21217p()
            r6 = r86
            java.util.Map r5 = r5.mo21704f(r6, r0)
            if (r5 != 0) goto L_0x0679
            androidx.collection.a r5 = new androidx.collection.a
            r5.<init>()
        L_0x0679:
            r1.put(r0, r5)
            goto L_0x067f
        L_0x067d:
            r6 = r86
        L_0x067f:
            java.util.Set r7 = r5.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0687:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0bb9
            java.lang.Object r8 = r7.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10 = r47
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x06b7
            com.google.android.gms.measurement.internal.k3 r9 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo21528C()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11 = r42
            r9.mo21550a(r11, r8)
            r47 = r10
            goto L_0x0687
        L_0x06b7:
            r11 = r42
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12 = r43
            java.lang.Object r9 = r12.get(r9)
            java.util.BitSet r9 = (java.util.BitSet) r9
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r14 = r44
            java.lang.Object r13 = r14.get(r13)
            java.util.BitSet r13 = (java.util.BitSet) r13
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            r38 = r1
            r1 = r45
            java.lang.Object r15 = r1.get(r15)
            java.util.Map r15 = (java.util.Map) r15
            r16 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r4 = r41
            java.lang.Object r3 = r4.get(r3)
            java.util.Map r3 = (java.util.Map) r3
            r87 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r18 = r7
            r7 = r48
            java.lang.Object r3 = r7.get(r3)
            com.google.android.gms.internal.measurement.t0$a r3 = (com.google.android.gms.internal.measurement.C4966t0.C4967a) r3
            if (r3 != 0) goto L_0x074c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            com.google.android.gms.internal.measurement.t0$a$a r9 = com.google.android.gms.internal.measurement.C4966t0.C4967a.m21123u()
            r13 = 1
            com.google.android.gms.internal.measurement.t0$a$a r9 = r9.mo19465a(r13)
            com.google.android.gms.internal.measurement.r5 r9 = r9.mo19056B()
            com.google.android.gms.internal.measurement.t0$a r9 = (com.google.android.gms.internal.measurement.C4966t0.C4967a) r9
            r7.put(r3, r9)
            java.util.BitSet r9 = new java.util.BitSet
            r9.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r12.put(r3, r9)
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            r14.put(r15, r3)
            androidx.collection.a r15 = new androidx.collection.a
            r15.<init>()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r1.put(r13, r15)
            androidx.collection.a r13 = new androidx.collection.a
            r13.<init>()
            r87 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r4.put(r3, r13)
            r83 = r13
            r13 = r87
            goto L_0x074e
        L_0x074c:
            r83 = r87
        L_0x074e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            java.lang.Object r3 = r5.get(r3)
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x075c:
            boolean r24 = r3.hasNext()
            if (r24 == 0) goto L_0x0b9d
            java.lang.Object r24 = r3.next()
            r87 = r3
            r3 = r24
            com.google.android.gms.internal.measurement.l0$b r3 = (com.google.android.gms.internal.measurement.C4842l0.C4845b) r3
            if (r27 == 0) goto L_0x077f
            if (r25 == 0) goto L_0x077f
            boolean r24 = r3.mo19212x()
            if (r24 == 0) goto L_0x077f
            r41 = r4
            r24 = r5
            long r4 = r2.f15045e
            r26 = r2
            goto L_0x0787
        L_0x077f:
            r41 = r4
            r24 = r5
            r26 = r2
            r4 = r16
        L_0x0787:
            com.google.android.gms.measurement.internal.k3 r2 = r85.mo21205d()
            r48 = r7
            r7 = 2
            boolean r2 = r2.mo21532a(r7)
            if (r2 == 0) goto L_0x07e3
            com.google.android.gms.measurement.internal.k3 r2 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21528C()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            boolean r33 = r3.mo19201a()
            if (r33 == 0) goto L_0x07b5
            int r33 = r3.mo19203o()
            java.lang.Integer r33 = java.lang.Integer.valueOf(r33)
            r45 = r1
            r44 = r14
            r1 = r33
            goto L_0x07ba
        L_0x07b5:
            r45 = r1
            r44 = r14
            r1 = 0
        L_0x07ba:
            com.google.android.gms.measurement.internal.i3 r14 = r85.mo21211j()
            r43 = r12
            java.lang.String r12 = r3.mo19204p()
            java.lang.String r12 = r14.mo21429a(r12)
            java.lang.String r14 = "Evaluating filter. audience, filter, event"
            r2.mo21552a(r14, r7, r1, r12)
            com.google.android.gms.measurement.internal.k3 r1 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21528C()
            com.google.android.gms.measurement.internal.c9 r2 = r85.mo21216o()
            java.lang.String r2 = r2.mo21192a(r3)
            r7 = r49
            r1.mo21550a(r7, r2)
            goto L_0x07eb
        L_0x07e3:
            r45 = r1
            r43 = r12
            r44 = r14
            r7 = r49
        L_0x07eb:
            boolean r1 = r3.mo19201a()
            if (r1 == 0) goto L_0x0b56
            int r1 = r3.mo19203o()
            r2 = 256(0x100, float:3.59E-43)
            if (r1 <= r2) goto L_0x07fb
            goto L_0x0b56
        L_0x07fb:
            boolean r1 = r3.mo19209u()
            boolean r12 = r3.mo19210v()
            if (r25 == 0) goto L_0x080d
            boolean r14 = r3.mo19212x()
            if (r14 == 0) goto L_0x080d
            r14 = 1
            goto L_0x080e
        L_0x080d:
            r14 = 0
        L_0x080e:
            if (r1 != 0) goto L_0x0817
            if (r12 != 0) goto L_0x0817
            if (r14 == 0) goto L_0x0815
            goto L_0x0817
        L_0x0815:
            r1 = 0
            goto L_0x0818
        L_0x0817:
            r1 = 1
        L_0x0818:
            int r14 = r3.mo19203o()
            boolean r14 = r9.get(r14)
            if (r14 == 0) goto L_0x0851
            if (r1 != 0) goto L_0x0851
            com.google.android.gms.measurement.internal.k3 r1 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21528C()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            boolean r5 = r3.mo19201a()
            if (r5 == 0) goto L_0x083f
            int r3 = r3.mo19203o()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0840
        L_0x083f:
            r3 = 0
        L_0x0840:
            java.lang.String r5 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo21551a(r5, r4, r3)
            r3 = r87
            r49 = r7
            r5 = r24
            r2 = r26
            r4 = r41
            goto L_0x0b93
        L_0x0851:
            boolean r14 = r3.mo19207s()
            if (r14 == 0) goto L_0x087a
            com.google.android.gms.internal.measurement.l0$d r14 = r3.mo19208t()
            r2 = r85
            r33 = r38
            java.lang.Boolean r4 = r2.m23191a(r4, r14)
            if (r4 != 0) goto L_0x086c
        L_0x0865:
            r49 = r7
        L_0x0867:
            r42 = r11
        L_0x0869:
            r5 = 0
            goto L_0x0afd
        L_0x086c:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x087e
            r49 = r7
            r42 = r11
        L_0x0876:
            r5 = r19
            goto L_0x0afd
        L_0x087a:
            r2 = r85
            r33 = r38
        L_0x087e:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.List r5 = r3.mo19205q()
            java.util.Iterator r5 = r5.iterator()
        L_0x088b:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x08bf
            java.lang.Object r14 = r5.next()
            com.google.android.gms.internal.measurement.l0$c r14 = (com.google.android.gms.internal.measurement.C4842l0.C4847c) r14
            java.lang.String r36 = r14.mo19224t()
            boolean r36 = r36.isEmpty()
            if (r36 == 0) goto L_0x08b7
            com.google.android.gms.measurement.internal.k3 r4 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21536w()
            com.google.android.gms.measurement.internal.i3 r5 = r85.mo21211j()
            java.lang.String r5 = r5.mo21429a(r0)
            java.lang.String r14 = "null or empty param name in filter. event"
            r4.mo21550a(r14, r5)
            goto L_0x0865
        L_0x08b7:
            java.lang.String r14 = r14.mo19224t()
            r4.add(r14)
            goto L_0x088b
        L_0x08bf:
            androidx.collection.a r5 = new androidx.collection.a
            r5.<init>()
            java.util.Iterator r14 = r40.iterator()
        L_0x08c8:
            boolean r36 = r14.hasNext()
            if (r36 == 0) goto L_0x0963
            java.lang.Object r36 = r14.next()
            com.google.android.gms.internal.measurement.t0$e r36 = (com.google.android.gms.internal.measurement.C4966t0.C4975e) r36
            r37 = r14
            java.lang.String r14 = r36.mo19500a()
            boolean r14 = r4.contains(r14)
            if (r14 == 0) goto L_0x095f
            boolean r14 = r36.mo19503q()
            if (r14 == 0) goto L_0x0904
            java.lang.String r14 = r36.mo19500a()
            boolean r38 = r36.mo19503q()
            if (r38 == 0) goto L_0x08fd
            long r38 = r36.mo19504r()
            java.lang.Long r36 = java.lang.Long.valueOf(r38)
            r38 = r4
            r4 = r36
            goto L_0x0900
        L_0x08fd:
            r38 = r4
            r4 = 0
        L_0x0900:
            r5.put(r14, r4)
            goto L_0x0935
        L_0x0904:
            r38 = r4
            boolean r4 = r36.mo19505s()
            if (r4 == 0) goto L_0x0924
            java.lang.String r4 = r36.mo19500a()
            boolean r14 = r36.mo19505s()
            if (r14 == 0) goto L_0x091f
            double r46 = r36.mo19506t()
            java.lang.Double r14 = java.lang.Double.valueOf(r46)
            goto L_0x0920
        L_0x091f:
            r14 = 0
        L_0x0920:
            r5.put(r4, r14)
            goto L_0x0935
        L_0x0924:
            boolean r4 = r36.mo19501o()
            if (r4 == 0) goto L_0x093a
            java.lang.String r4 = r36.mo19500a()
            java.lang.String r14 = r36.mo19502p()
            r5.put(r4, r14)
        L_0x0935:
            r14 = r37
            r4 = r38
            goto L_0x08c8
        L_0x093a:
            com.google.android.gms.measurement.internal.k3 r4 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21536w()
            com.google.android.gms.measurement.internal.i3 r5 = r85.mo21211j()
            java.lang.String r5 = r5.mo21429a(r0)
            com.google.android.gms.measurement.internal.i3 r14 = r85.mo21211j()
            r49 = r7
            java.lang.String r7 = r36.mo19500a()
            java.lang.String r7 = r14.mo21430b(r7)
            java.lang.String r14 = "Unknown value for param. event, param"
            r4.mo21551a(r14, r5, r7)
            goto L_0x0867
        L_0x095f:
            r14 = r37
            goto L_0x08c8
        L_0x0963:
            r49 = r7
            java.util.List r4 = r3.mo19205q()
            java.util.Iterator r4 = r4.iterator()
        L_0x096d:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0af6
            java.lang.Object r7 = r4.next()
            com.google.android.gms.internal.measurement.l0$c r7 = (com.google.android.gms.internal.measurement.C4842l0.C4847c) r7
            boolean r14 = r7.mo19222r()
            if (r14 == 0) goto L_0x0989
            boolean r14 = r7.mo19223s()
            if (r14 == 0) goto L_0x0989
            r36 = r4
            r14 = 1
            goto L_0x098c
        L_0x0989:
            r36 = r4
            r14 = 0
        L_0x098c:
            java.lang.String r4 = r7.mo19224t()
            boolean r37 = r4.isEmpty()
            if (r37 == 0) goto L_0x09ad
            com.google.android.gms.measurement.internal.k3 r4 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21536w()
            com.google.android.gms.measurement.internal.i3 r5 = r85.mo21211j()
            java.lang.String r5 = r5.mo21429a(r0)
            java.lang.String r7 = "Event has empty param name. event"
            r4.mo21550a(r7, r5)
            goto L_0x0867
        L_0x09ad:
            r42 = r11
            java.lang.Object r11 = r5.get(r4)
            r37 = r5
            boolean r5 = r11 instanceof java.lang.Long
            if (r5 == 0) goto L_0x0a00
            boolean r5 = r7.mo19220p()
            if (r5 != 0) goto L_0x09de
            com.google.android.gms.measurement.internal.k3 r5 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21536w()
            com.google.android.gms.measurement.internal.i3 r7 = r85.mo21211j()
            java.lang.String r7 = r7.mo21429a(r0)
            com.google.android.gms.measurement.internal.i3 r11 = r85.mo21211j()
            java.lang.String r4 = r11.mo21430b(r4)
            java.lang.String r11 = "No number filter for long param. event, param"
            r5.mo21551a(r11, r7, r4)
            goto L_0x0869
        L_0x09de:
            java.lang.Long r11 = (java.lang.Long) r11
            long r4 = r11.longValue()
            com.google.android.gms.internal.measurement.l0$d r7 = r7.mo19221q()
            java.lang.Boolean r4 = r2.m23191a(r4, r7)
            if (r4 != 0) goto L_0x09f0
        L_0x09ee:
            goto L_0x0869
        L_0x09f0:
            boolean r4 = r4.booleanValue()
            if (r4 != r14) goto L_0x09f8
        L_0x09f6:
            goto L_0x0876
        L_0x09f8:
            r4 = r36
            r5 = r37
            r11 = r42
            goto L_0x096d
        L_0x0a00:
            boolean r5 = r11 instanceof java.lang.Double
            if (r5 == 0) goto L_0x0a41
            boolean r5 = r7.mo19220p()
            if (r5 != 0) goto L_0x0a29
            com.google.android.gms.measurement.internal.k3 r5 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21536w()
            com.google.android.gms.measurement.internal.i3 r7 = r85.mo21211j()
            java.lang.String r7 = r7.mo21429a(r0)
            com.google.android.gms.measurement.internal.i3 r11 = r85.mo21211j()
            java.lang.String r4 = r11.mo21430b(r4)
            java.lang.String r11 = "No number filter for double param. event, param"
            r5.mo21551a(r11, r7, r4)
            goto L_0x0869
        L_0x0a29:
            java.lang.Double r11 = (java.lang.Double) r11
            double r4 = r11.doubleValue()
            com.google.android.gms.internal.measurement.l0$d r7 = r7.mo19221q()
            java.lang.Boolean r4 = r2.m23190a(r4, r7)
            if (r4 != 0) goto L_0x0a3a
            goto L_0x09ee
        L_0x0a3a:
            boolean r4 = r4.booleanValue()
            if (r4 != r14) goto L_0x09f8
            goto L_0x09f6
        L_0x0a41:
            boolean r5 = r11 instanceof java.lang.String
            if (r5 == 0) goto L_0x0ab6
            boolean r5 = r7.mo19218a()
            if (r5 == 0) goto L_0x0a56
            java.lang.String r11 = (java.lang.String) r11
            com.google.android.gms.internal.measurement.l0$f r4 = r7.mo19219o()
            java.lang.Boolean r4 = r2.m23195a(r11, r4)
            goto L_0x0a6c
        L_0x0a56:
            boolean r5 = r7.mo19220p()
            if (r5 == 0) goto L_0x0a97
            java.lang.String r11 = (java.lang.String) r11
            boolean r5 = com.google.android.gms.measurement.internal.C5221c9.m22549a(r11)
            if (r5 == 0) goto L_0x0a78
            com.google.android.gms.internal.measurement.l0$d r4 = r7.mo19221q()
            java.lang.Boolean r4 = r2.m23193a(r11, r4)
        L_0x0a6c:
            if (r4 != 0) goto L_0x0a70
            goto L_0x09ee
        L_0x0a70:
            boolean r4 = r4.booleanValue()
            if (r4 != r14) goto L_0x09f8
            goto L_0x09f6
        L_0x0a78:
            com.google.android.gms.measurement.internal.k3 r5 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21536w()
            com.google.android.gms.measurement.internal.i3 r7 = r85.mo21211j()
            java.lang.String r7 = r7.mo21429a(r0)
            com.google.android.gms.measurement.internal.i3 r11 = r85.mo21211j()
            java.lang.String r4 = r11.mo21430b(r4)
            java.lang.String r11 = "Invalid param value for number filter. event, param"
            r5.mo21551a(r11, r7, r4)
            goto L_0x0869
        L_0x0a97:
            com.google.android.gms.measurement.internal.k3 r5 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21536w()
            com.google.android.gms.measurement.internal.i3 r7 = r85.mo21211j()
            java.lang.String r7 = r7.mo21429a(r0)
            com.google.android.gms.measurement.internal.i3 r11 = r85.mo21211j()
            java.lang.String r4 = r11.mo21430b(r4)
            java.lang.String r11 = "No filter for String param. event, param"
            r5.mo21551a(r11, r7, r4)
            goto L_0x0869
        L_0x0ab6:
            if (r11 != 0) goto L_0x0ad7
            com.google.android.gms.measurement.internal.k3 r5 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21528C()
            com.google.android.gms.measurement.internal.i3 r7 = r85.mo21211j()
            java.lang.String r7 = r7.mo21429a(r0)
            com.google.android.gms.measurement.internal.i3 r11 = r85.mo21211j()
            java.lang.String r4 = r11.mo21430b(r4)
            java.lang.String r11 = "Missing param for filter. event, param"
            r5.mo21551a(r11, r7, r4)
            goto L_0x0876
        L_0x0ad7:
            com.google.android.gms.measurement.internal.k3 r5 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21536w()
            com.google.android.gms.measurement.internal.i3 r7 = r85.mo21211j()
            java.lang.String r7 = r7.mo21429a(r0)
            com.google.android.gms.measurement.internal.i3 r11 = r85.mo21211j()
            java.lang.String r4 = r11.mo21430b(r4)
            java.lang.String r11 = "Unknown param type. event, param"
            r5.mo21551a(r11, r7, r4)
            goto L_0x0869
        L_0x0af6:
            r42 = r11
            r4 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
        L_0x0afd:
            com.google.android.gms.measurement.internal.k3 r4 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21528C()
            if (r5 != 0) goto L_0x0b0a
            r7 = r28
            goto L_0x0b0b
        L_0x0b0a:
            r7 = r5
        L_0x0b0b:
            java.lang.String r11 = "Event filter result"
            r4.mo21550a(r11, r7)
            if (r5 != 0) goto L_0x0b1a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r10.add(r1)
            goto L_0x0b53
        L_0x0b1a:
            int r4 = r3.mo19203o()
            r13.set(r4)
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L_0x0b53
            int r4 = r3.mo19203o()
            r9.set(r4)
            if (r1 == 0) goto L_0x0b53
            boolean r1 = r21.mo19479q()
            if (r1 == 0) goto L_0x0b53
            if (r12 == 0) goto L_0x0b46
            int r1 = r3.mo19203o()
            long r3 = r21.mo19480r()
            r5 = r83
            m23199b(r5, r1, r3)
            goto L_0x0b53
        L_0x0b46:
            r5 = r83
            int r1 = r3.mo19203o()
            long r3 = r21.mo19480r()
            m23198a(r15, r1, r3)
        L_0x0b53:
            r3 = r87
            goto L_0x0b89
        L_0x0b56:
            r2 = r85
            r49 = r7
            r42 = r11
            r33 = r38
            r5 = r83
            com.google.android.gms.measurement.internal.k3 r1 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21536w()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r86)
            boolean r7 = r3.mo19201a()
            if (r7 == 0) goto L_0x0b7b
            int r3 = r3.mo19203o()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0b7c
        L_0x0b7b:
            r3 = 0
        L_0x0b7c:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r7 = "Invalid event filter ID. appId, id"
            r1.mo21551a(r7, r4, r3)
            r3 = r87
            r83 = r5
        L_0x0b89:
            r5 = r24
            r2 = r26
            r38 = r33
            r4 = r41
            r11 = r42
        L_0x0b93:
            r12 = r43
            r14 = r44
            r1 = r45
            r7 = r48
            goto L_0x075c
        L_0x0b9d:
            r26 = r2
            r2 = r85
            r45 = r1
            r41 = r4
            r48 = r7
            r47 = r10
            r42 = r11
            r43 = r12
            r44 = r14
            r3 = r16
            r7 = r18
            r2 = r26
            r1 = r38
            goto L_0x0687
        L_0x0bb9:
            r8 = r1
            r15 = r6
            r0 = r22
            r2 = r32
            r3 = r34
            r10 = r41
            r9 = r42
            r24 = r43
            r26 = r44
            r17 = r45
            r16 = r47
            r14 = r48
            r13 = r49
            r1 = r85
            goto L_0x0375
        L_0x0bd5:
            r2 = r1
            r42 = r9
            r41 = r10
            r49 = r13
            r48 = r14
            r6 = r15
            r10 = r16
            r45 = r17
            r43 = r24
            r44 = r26
            com.google.android.gms.measurement.internal.r9 r0 = r85.mo21214m()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C5310l.f15268u0
            boolean r0 = r0.mo21641d(r6, r1)
            com.google.android.gms.measurement.internal.r9 r1 = r85.mo21214m()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C5310l.f15276y0
            boolean r1 = r1.mo21641d(r6, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r4 = r88.isEmpty()
            if (r4 != 0) goto L_0x1016
            androidx.collection.a r4 = new androidx.collection.a
            r4.<init>()
            java.util.Iterator r5 = r88.iterator()
        L_0x0c0f:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x1016
            java.lang.Object r7 = r5.next()
            com.google.android.gms.internal.measurement.t0$k r7 = (com.google.android.gms.internal.measurement.C4966t0.C4988k) r7
            java.lang.String r8 = r7.mo19666p()
            r3.add(r8)
            java.lang.String r8 = r7.mo19666p()
            java.lang.Object r8 = r4.get(r8)
            java.util.Map r8 = (java.util.Map) r8
            if (r8 != 0) goto L_0x0c48
            com.google.android.gms.measurement.internal.s9 r8 = r85.mo21217p()
            java.lang.String r9 = r7.mo19666p()
            java.util.Map r8 = r8.mo21706g(r6, r9)
            if (r8 != 0) goto L_0x0c41
            androidx.collection.a r8 = new androidx.collection.a
            r8.<init>()
        L_0x0c41:
            java.lang.String r9 = r7.mo19666p()
            r4.put(r9, r8)
        L_0x0c48:
            java.util.Set r9 = r8.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0c50:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x1012
            java.lang.Object r11 = r9.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L_0x0c7c
            com.google.android.gms.measurement.internal.k3 r12 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r12 = r12.mo21528C()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13 = r42
            r12.mo21550a(r13, r11)
            goto L_0x0c50
        L_0x0c7c:
            r13 = r42
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r14 = r43
            java.lang.Object r12 = r14.get(r12)
            java.util.BitSet r12 = (java.util.BitSet) r12
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            r87 = r4
            r4 = r44
            java.lang.Object r15 = r4.get(r15)
            java.util.BitSet r15 = (java.util.BitSet) r15
            r88 = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r16 = r9
            r9 = r45
            java.lang.Object r5 = r9.get(r5)
            java.util.Map r5 = (java.util.Map) r5
            r17 = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r18 = r12
            r12 = r41
            java.lang.Object r5 = r12.get(r5)
            java.util.Map r5 = (java.util.Map) r5
            r19 = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r13 = r48
            java.lang.Object r5 = r13.get(r5)
            com.google.android.gms.internal.measurement.t0$a r5 = (com.google.android.gms.internal.measurement.C4966t0.C4967a) r5
            if (r5 != 0) goto L_0x0d1c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            com.google.android.gms.internal.measurement.t0$a$a r15 = com.google.android.gms.internal.measurement.C4966t0.C4967a.m21123u()
            r21 = r3
            r3 = 1
            com.google.android.gms.internal.measurement.t0$a$a r15 = r15.mo19465a(r3)
            com.google.android.gms.internal.measurement.r5 r3 = r15.mo19056B()
            com.google.android.gms.internal.measurement.t0$a r3 = (com.google.android.gms.internal.measurement.C4966t0.C4967a) r3
            r13.put(r5, r3)
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r14.put(r5, r3)
            java.util.BitSet r15 = new java.util.BitSet
            r15.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r4.put(r5, r15)
            androidx.collection.a r5 = new androidx.collection.a
            r5.<init>()
            r17 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r9.put(r3, r5)
            androidx.collection.a r3 = new androidx.collection.a
            r3.<init>()
            r18 = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r12.put(r5, r3)
            r41 = r12
            r5 = r18
            r12 = r3
            r3 = r17
            goto L_0x0d26
        L_0x0d1c:
            r21 = r3
            r41 = r12
            r5 = r17
            r3 = r18
            r12 = r19
        L_0x0d26:
            r17 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            java.lang.Object r9 = r8.get(r9)
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x0d36:
            boolean r18 = r9.hasNext()
            if (r18 == 0) goto L_0x0ffe
            java.lang.Object r18 = r9.next()
            r19 = r8
            r8 = r18
            com.google.android.gms.internal.measurement.l0$e r8 = (com.google.android.gms.internal.measurement.C4842l0.C4852e) r8
            r18 = r9
            com.google.android.gms.measurement.internal.k3 r9 = r85.mo21205d()
            r44 = r4
            r4 = 2
            boolean r9 = r9.mo21532a(r4)
            if (r9 == 0) goto L_0x0da2
            com.google.android.gms.measurement.internal.k3 r9 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo21528C()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            boolean r22 = r8.mo19237a()
            if (r22 == 0) goto L_0x0d76
            int r22 = r8.mo19238o()
            java.lang.Integer r22 = java.lang.Integer.valueOf(r22)
            r48 = r13
            r43 = r14
            r13 = r22
            goto L_0x0d7b
        L_0x0d76:
            r48 = r13
            r43 = r14
            r13 = 0
        L_0x0d7b:
            com.google.android.gms.measurement.internal.i3 r14 = r85.mo21211j()
            java.lang.String r6 = r8.mo19239p()
            java.lang.String r6 = r14.mo21431c(r6)
            java.lang.String r14 = "Evaluating filter. audience, filter, property"
            r9.mo21552a(r14, r4, r13, r6)
            com.google.android.gms.measurement.internal.k3 r4 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21528C()
            com.google.android.gms.measurement.internal.c9 r6 = r85.mo21216o()
            java.lang.String r6 = r6.mo21193a(r8)
            r9 = r49
            r4.mo21550a(r9, r6)
            goto L_0x0da8
        L_0x0da2:
            r48 = r13
            r43 = r14
            r9 = r49
        L_0x0da8:
            boolean r4 = r8.mo19237a()
            if (r4 == 0) goto L_0x0fc0
            int r4 = r8.mo19238o()
            r6 = 256(0x100, float:3.59E-43)
            if (r4 <= r6) goto L_0x0db8
            goto L_0x0fc0
        L_0x0db8:
            boolean r4 = r8.mo19241r()
            boolean r13 = r8.mo19242s()
            if (r0 == 0) goto L_0x0dca
            boolean r14 = r8.mo19244u()
            if (r14 == 0) goto L_0x0dca
            r14 = 1
            goto L_0x0dcb
        L_0x0dca:
            r14 = 0
        L_0x0dcb:
            if (r4 != 0) goto L_0x0dd4
            if (r13 != 0) goto L_0x0dd4
            if (r14 == 0) goto L_0x0dd2
            goto L_0x0dd4
        L_0x0dd2:
            r4 = 0
            goto L_0x0dd5
        L_0x0dd4:
            r4 = 1
        L_0x0dd5:
            int r6 = r8.mo19238o()
            boolean r6 = r3.get(r6)
            if (r6 == 0) goto L_0x0e12
            if (r4 != 0) goto L_0x0e12
            com.google.android.gms.measurement.internal.k3 r4 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21528C()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            boolean r13 = r8.mo19237a()
            if (r13 == 0) goto L_0x0dfc
            int r8 = r8.mo19238o()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            goto L_0x0dfd
        L_0x0dfc:
            r13 = 0
        L_0x0dfd:
            java.lang.String r8 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r4.mo21551a(r8, r6, r13)
            r6 = r86
            r49 = r9
            r9 = r18
            r8 = r19
        L_0x0e0a:
            r14 = r43
            r4 = r44
            r13 = r48
            goto L_0x0d36
        L_0x0e12:
            com.google.android.gms.internal.measurement.l0$c r6 = r8.mo19240q()
            r49 = r9
            boolean r9 = r6.mo19223s()
            boolean r22 = r7.mo19669s()
            if (r22 == 0) goto L_0x0e60
            boolean r22 = r6.mo19220p()
            if (r22 != 0) goto L_0x0e49
            com.google.android.gms.measurement.internal.k3 r6 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo21536w()
            com.google.android.gms.measurement.internal.i3 r9 = r85.mo21211j()
            r22 = r5
            java.lang.String r5 = r7.mo19666p()
            java.lang.String r5 = r9.mo21431c(r5)
            java.lang.String r9 = "No number filter for long property. property"
            r6.mo21550a(r9, r5)
            r5 = r12
            r24 = r13
        L_0x0e46:
            r13 = 0
            goto L_0x0f30
        L_0x0e49:
            r22 = r5
            r5 = r12
            r24 = r13
            long r12 = r7.mo19670t()
            com.google.android.gms.internal.measurement.l0$d r6 = r6.mo19221q()
            java.lang.Boolean r6 = r2.m23191a(r12, r6)
            java.lang.Boolean r13 = m23192a(r6, r9)
            goto L_0x0f30
        L_0x0e60:
            r22 = r5
            r5 = r12
            r24 = r13
            boolean r12 = r7.mo19671u()
            if (r12 == 0) goto L_0x0e9d
            boolean r12 = r6.mo19220p()
            if (r12 != 0) goto L_0x0e8b
            com.google.android.gms.measurement.internal.k3 r6 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo21536w()
            com.google.android.gms.measurement.internal.i3 r9 = r85.mo21211j()
            java.lang.String r12 = r7.mo19666p()
            java.lang.String r9 = r9.mo21431c(r12)
            java.lang.String r12 = "No number filter for double property. property"
            r6.mo21550a(r12, r9)
            goto L_0x0e46
        L_0x0e8b:
            double r12 = r7.mo19672v()
            com.google.android.gms.internal.measurement.l0$d r6 = r6.mo19221q()
            java.lang.Boolean r6 = r2.m23190a(r12, r6)
            java.lang.Boolean r13 = m23192a(r6, r9)
            goto L_0x0f30
        L_0x0e9d:
            boolean r12 = r7.mo19667q()
            if (r12 == 0) goto L_0x0f15
            boolean r12 = r6.mo19218a()
            if (r12 != 0) goto L_0x0f04
            boolean r12 = r6.mo19220p()
            if (r12 != 0) goto L_0x0eca
            com.google.android.gms.measurement.internal.k3 r6 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo21536w()
            com.google.android.gms.measurement.internal.i3 r9 = r85.mo21211j()
            java.lang.String r12 = r7.mo19666p()
            java.lang.String r9 = r9.mo21431c(r12)
            java.lang.String r12 = "No string or number filter defined. property"
            r6.mo21550a(r12, r9)
            goto L_0x0e46
        L_0x0eca:
            java.lang.String r12 = r7.mo19668r()
            boolean r12 = com.google.android.gms.measurement.internal.C5221c9.m22549a(r12)
            if (r12 == 0) goto L_0x0ee5
            java.lang.String r12 = r7.mo19668r()
            com.google.android.gms.internal.measurement.l0$d r6 = r6.mo19221q()
            java.lang.Boolean r6 = r2.m23193a(r12, r6)
            java.lang.Boolean r13 = m23192a(r6, r9)
            goto L_0x0f30
        L_0x0ee5:
            com.google.android.gms.measurement.internal.k3 r6 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo21536w()
            com.google.android.gms.measurement.internal.i3 r9 = r85.mo21211j()
            java.lang.String r12 = r7.mo19666p()
            java.lang.String r9 = r9.mo21431c(r12)
            java.lang.String r12 = r7.mo19668r()
            java.lang.String r13 = "Invalid user property value for Numeric number filter. property, value"
            r6.mo21551a(r13, r9, r12)
            goto L_0x0e46
        L_0x0f04:
            java.lang.String r12 = r7.mo19668r()
            com.google.android.gms.internal.measurement.l0$f r6 = r6.mo19219o()
            java.lang.Boolean r6 = r2.m23195a(r12, r6)
            java.lang.Boolean r13 = m23192a(r6, r9)
            goto L_0x0f30
        L_0x0f15:
            com.google.android.gms.measurement.internal.k3 r6 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo21536w()
            com.google.android.gms.measurement.internal.i3 r9 = r85.mo21211j()
            java.lang.String r12 = r7.mo19666p()
            java.lang.String r9 = r9.mo21431c(r12)
            java.lang.String r12 = "User property has no value, property"
            r6.mo21550a(r12, r9)
            goto L_0x0e46
        L_0x0f30:
            com.google.android.gms.measurement.internal.k3 r6 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo21528C()
            if (r13 != 0) goto L_0x0f3d
            r9 = r28
            goto L_0x0f3e
        L_0x0f3d:
            r9 = r13
        L_0x0f3e:
            java.lang.String r12 = "Property filter result"
            r6.mo21550a(r12, r9)
            if (r13 != 0) goto L_0x0f57
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r10.add(r4)
        L_0x0f4c:
            r6 = r86
            r12 = r5
            r9 = r18
            r8 = r19
            r5 = r22
            goto L_0x0e0a
        L_0x0f57:
            int r6 = r8.mo19238o()
            r15.set(r6)
            if (r0 == 0) goto L_0x0f68
            if (r14 == 0) goto L_0x0f68
            boolean r6 = r13.booleanValue()
            if (r6 == 0) goto L_0x0f4c
        L_0x0f68:
            int r6 = r8.mo19238o()
            boolean r6 = r3.get(r6)
            if (r6 == 0) goto L_0x0f78
            boolean r6 = r8.mo19241r()
            if (r6 == 0) goto L_0x0f83
        L_0x0f78:
            int r6 = r8.mo19238o()
            boolean r9 = r13.booleanValue()
            r3.set(r6, r9)
        L_0x0f83:
            boolean r6 = r13.booleanValue()
            if (r6 == 0) goto L_0x0f4c
            if (r4 == 0) goto L_0x0f4c
            boolean r4 = r7.mo19664a()
            if (r4 == 0) goto L_0x0f4c
            long r12 = r7.mo19665o()
            if (r1 == 0) goto L_0x0f9d
            if (r89 == 0) goto L_0x0f9d
            long r12 = r89.longValue()
        L_0x0f9d:
            if (r24 == 0) goto L_0x0fa7
            int r4 = r8.mo19238o()
            m23199b(r5, r4, r12)
            goto L_0x0f4c
        L_0x0fa7:
            int r4 = r8.mo19238o()
            r6 = r22
            m23198a(r6, r4, r12)
            r12 = r5
            r5 = r6
            r9 = r18
            r8 = r19
            r14 = r43
            r4 = r44
            r13 = r48
            r6 = r86
            goto L_0x0d36
        L_0x0fc0:
            r49 = r9
            com.google.android.gms.measurement.internal.k3 r3 = r85.mo21205d()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21536w()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r86)
            boolean r5 = r8.mo19237a()
            if (r5 == 0) goto L_0x0fdd
            int r5 = r8.mo19238o()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            goto L_0x0fde
        L_0x0fdd:
            r13 = 0
        L_0x0fde:
            java.lang.String r5 = java.lang.String.valueOf(r13)
            java.lang.String r6 = "Invalid property filter ID. appId, id"
            r3.mo21551a(r6, r4, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r10.add(r3)
            r6 = r86
            r4 = r87
            r5 = r88
            r9 = r16
            r45 = r17
            r8 = r19
            r3 = r21
            goto L_0x0c50
        L_0x0ffe:
            r6 = r86
            r5 = r88
            r44 = r4
            r48 = r13
            r43 = r14
            r9 = r16
            r45 = r17
            r3 = r21
            r4 = r87
            goto L_0x0c50
        L_0x1012:
            r6 = r86
            goto L_0x0c0f
        L_0x1016:
            r21 = r3
            r17 = r45
            com.google.android.gms.measurement.internal.r9 r0 = r85.mo21214m()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C5310l.f15276y0
            r3 = r86
            boolean r0 = r0.mo21641d(r3, r1)
            androidx.collection.a r1 = new androidx.collection.a
            r1.<init>()
            if (r0 == 0) goto L_0x1037
            com.google.android.gms.measurement.internal.s9 r0 = r85.mo21217p()
            r1 = r21
            java.util.Map r1 = r0.mo21684a(r3, r1)
        L_0x1037:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Set r0 = r43.keySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x1044:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x1330
            java.lang.Object r0 = r5.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            boolean r6 = r10.contains(r6)
            if (r6 != 0) goto L_0x132a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r7 = r48
            java.lang.Object r6 = r7.get(r6)
            com.google.android.gms.internal.measurement.t0$a r6 = (com.google.android.gms.internal.measurement.C4966t0.C4967a) r6
            if (r6 != 0) goto L_0x1071
            com.google.android.gms.internal.measurement.t0$a$a r6 = com.google.android.gms.internal.measurement.C4966t0.C4967a.m21123u()
            goto L_0x1077
        L_0x1071:
            com.google.android.gms.internal.measurement.i4$a r6 = r6.mo19052i()
            com.google.android.gms.internal.measurement.t0$a$a r6 = (com.google.android.gms.internal.measurement.C4966t0.C4967a.C4968a) r6
        L_0x1077:
            r6.mo19462a(r0)
            com.google.android.gms.internal.measurement.t0$i$a r8 = com.google.android.gms.internal.measurement.C4966t0.C4984i.m21498v()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r11 = r43
            java.lang.Object r9 = r11.get(r9)
            java.util.BitSet r9 = (java.util.BitSet) r9
            java.util.List r9 = com.google.android.gms.measurement.internal.C5221c9.m22542a(r9)
            com.google.android.gms.internal.measurement.t0$i$a r8 = r8.mo19651b(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r12 = r44
            java.lang.Object r9 = r12.get(r9)
            java.util.BitSet r9 = (java.util.BitSet) r9
            java.util.List r9 = com.google.android.gms.measurement.internal.C5221c9.m22542a(r9)
            com.google.android.gms.internal.measurement.t0$i$a r8 = r8.mo19649a(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r13 = r17
            java.lang.Object r9 = r13.get(r9)
            java.util.Map r9 = (java.util.Map) r9
            java.util.List r9 = m23197a(r9)
            r8.mo19652c(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r14 = r41
            java.lang.Object r9 = r14.get(r9)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 != 0) goto L_0x10d2
            java.util.List r9 = java.util.Collections.emptyList()
            r88 = r5
            r15 = r9
        L_0x10ce:
            r47 = r10
            goto L_0x1141
        L_0x10d2:
            java.util.ArrayList r15 = new java.util.ArrayList
            int r2 = r9.size()
            r15.<init>(r2)
            java.util.Set r2 = r9.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x10e3:
            boolean r16 = r2.hasNext()
            if (r16 == 0) goto L_0x113e
            java.lang.Object r16 = r2.next()
            r87 = r2
            r2 = r16
            java.lang.Integer r2 = (java.lang.Integer) r2
            r88 = r5
            com.google.android.gms.internal.measurement.t0$j$a r5 = com.google.android.gms.internal.measurement.C4966t0.C4986j.m21529r()
            r47 = r10
            int r10 = r2.intValue()
            com.google.android.gms.internal.measurement.t0$j$a r5 = r5.mo19661a(r10)
            java.lang.Object r2 = r9.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x112a
            java.util.Collections.sort(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x1112:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x112a
            java.lang.Object r10 = r2.next()
            java.lang.Long r10 = (java.lang.Long) r10
            r89 = r9
            long r9 = r10.longValue()
            r5.mo19662a(r9)
            r9 = r89
            goto L_0x1112
        L_0x112a:
            r89 = r9
            com.google.android.gms.internal.measurement.r5 r2 = r5.mo19056B()
            com.google.android.gms.internal.measurement.t0$j r2 = (com.google.android.gms.internal.measurement.C4966t0.C4986j) r2
            r15.add(r2)
            r2 = r87
            r5 = r88
            r9 = r89
            r10 = r47
            goto L_0x10e3
        L_0x113e:
            r88 = r5
            goto L_0x10ce
        L_0x1141:
            boolean r2 = r6.mo19467l()
            if (r2 == 0) goto L_0x1170
            com.google.android.gms.internal.measurement.C5065ya.m21848b()
            com.google.android.gms.measurement.internal.r9 r2 = r85.mo21214m()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C5310l.f15278z0
            boolean r2 = r2.mo21641d(r3, r5)
            if (r2 == 0) goto L_0x1158
            if (r20 != 0) goto L_0x1170
        L_0x1158:
            com.google.android.gms.internal.measurement.t0$i r2 = r6.mo19468m()
            java.util.List r2 = r2.mo19645t()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r1.get(r5)
            java.util.List r5 = (java.util.List) r5
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto L_0x117a
        L_0x1170:
            r17 = r1
            r16 = r6
            r43 = r11
            r18 = 1
            goto L_0x1291
        L_0x117a:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r15)
            androidx.collection.a r10 = new androidx.collection.a
            r10.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x1188:
            boolean r15 = r2.hasNext()
            if (r15 == 0) goto L_0x11cb
            java.lang.Object r15 = r2.next()
            com.google.android.gms.internal.measurement.t0$j r15 = (com.google.android.gms.internal.measurement.C4966t0.C4986j) r15
            boolean r16 = r15.mo19655a()
            if (r16 == 0) goto L_0x11c0
            int r16 = r15.mo19659q()
            if (r16 <= 0) goto L_0x11c0
            int r16 = r15.mo19657o()
            r17 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            int r16 = r15.mo19659q()
            r87 = r2
            r18 = 1
            int r2 = r16 + -1
            long r15 = r15.mo19656b(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r15)
            r10.put(r1, r2)
            goto L_0x11c6
        L_0x11c0:
            r17 = r1
            r87 = r2
            r18 = 1
        L_0x11c6:
            r2 = r87
            r1 = r17
            goto L_0x1188
        L_0x11cb:
            r17 = r1
            r18 = 1
            r1 = 0
        L_0x11d0:
            int r2 = r9.size()
            if (r1 >= r2) goto L_0x124e
            java.lang.Object r2 = r9.get(r1)
            com.google.android.gms.internal.measurement.t0$j r2 = (com.google.android.gms.internal.measurement.C4966t0.C4986j) r2
            boolean r15 = r2.mo19655a()
            if (r15 == 0) goto L_0x11eb
            int r15 = r2.mo19657o()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x11ec
        L_0x11eb:
            r15 = 0
        L_0x11ec:
            java.lang.Object r15 = r10.remove(r15)
            java.lang.Long r15 = (java.lang.Long) r15
            if (r15 == 0) goto L_0x1242
            if (r5 == 0) goto L_0x120a
            int r16 = r2.mo19657o()
            r43 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)
            boolean r11 = r5.contains(r11)
            if (r11 != 0) goto L_0x1207
            goto L_0x120c
        L_0x1207:
            r87 = r5
            goto L_0x1246
        L_0x120a:
            r43 = r11
        L_0x120c:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            long r21 = r15.longValue()
            r87 = r5
            r5 = 0
            long r23 = r2.mo19656b(r5)
            int r16 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r16 >= 0) goto L_0x1223
            r11.add(r15)
        L_0x1223:
            java.util.List r15 = r2.mo19658p()
            r11.addAll(r15)
            com.google.android.gms.internal.measurement.i4$a r2 = r2.mo19052i()
            com.google.android.gms.internal.measurement.t0$j$a r2 = (com.google.android.gms.internal.measurement.C4966t0.C4986j.C4987a) r2
            com.google.android.gms.internal.measurement.t0$j$a r2 = r2.mo19660a()
            com.google.android.gms.internal.measurement.t0$j$a r2 = r2.mo19663a(r11)
            com.google.android.gms.internal.measurement.r5 r2 = r2.mo19056B()
            com.google.android.gms.internal.measurement.t0$j r2 = (com.google.android.gms.internal.measurement.C4966t0.C4986j) r2
            r9.set(r1, r2)
            goto L_0x1247
        L_0x1242:
            r87 = r5
            r43 = r11
        L_0x1246:
            r5 = 0
        L_0x1247:
            int r1 = r1 + 1
            r5 = r87
            r11 = r43
            goto L_0x11d0
        L_0x124e:
            r43 = r11
            r5 = 0
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x1259:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x128e
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            com.google.android.gms.internal.measurement.t0$j$a r11 = com.google.android.gms.internal.measurement.C4966t0.C4986j.m21529r()
            int r15 = r2.intValue()
            com.google.android.gms.internal.measurement.t0$j$a r11 = r11.mo19661a(r15)
            java.lang.Object r2 = r10.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r16 = r6
            long r5 = r2.longValue()
            com.google.android.gms.internal.measurement.t0$j$a r2 = r11.mo19662a(r5)
            com.google.android.gms.internal.measurement.r5 r2 = r2.mo19056B()
            com.google.android.gms.internal.measurement.t0$j r2 = (com.google.android.gms.internal.measurement.C4966t0.C4986j) r2
            r9.add(r2)
            r6 = r16
            r5 = 0
            goto L_0x1259
        L_0x128e:
            r16 = r6
            r15 = r9
        L_0x1291:
            r8.mo19653d(r15)
            r6 = r16
            r6.mo19463a(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.google.android.gms.internal.measurement.r5 r2 = r6.mo19056B()
            com.google.android.gms.internal.measurement.t0$a r2 = (com.google.android.gms.internal.measurement.C4966t0.C4967a) r2
            r7.put(r1, r2)
            com.google.android.gms.internal.measurement.r5 r1 = r6.mo19056B()
            com.google.android.gms.internal.measurement.t0$a r1 = (com.google.android.gms.internal.measurement.C4966t0.C4967a) r1
            r4.add(r1)
            com.google.android.gms.measurement.internal.s9 r1 = r85.mo21217p()
            com.google.android.gms.internal.measurement.t0$i r2 = r6.mo19466a()
            r1.mo21739s()
            r1.mo21209h()
            com.google.android.gms.common.internal.C4300a0.m18630b(r86)
            com.google.android.gms.common.internal.C4300a0.m18620a(r2)
            byte[] r2 = r2.mo19359f()
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r6 = "app_id"
            r5.put(r6, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r6 = "audience_id"
            r5.put(r6, r0)
            java.lang.String r0 = "current_results"
            r5.put(r0, r2)
            android.database.sqlite.SQLiteDatabase r0 = r1.mo21709w()     // Catch:{ SQLiteException -> 0x1305 }
            java.lang.String r2 = "audience_filter_values"
            r6 = 5
            r8 = 0
            long r5 = r0.insertWithOnConflict(r2, r8, r5, r6)     // Catch:{ SQLiteException -> 0x1303 }
            r9 = -1
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x1318
            com.google.android.gms.measurement.internal.k3 r0 = r1.mo21205d()     // Catch:{ SQLiteException -> 0x1303 }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21533t()     // Catch:{ SQLiteException -> 0x1303 }
            java.lang.String r2 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r86)     // Catch:{ SQLiteException -> 0x1303 }
            r0.mo21550a(r2, r5)     // Catch:{ SQLiteException -> 0x1303 }
            goto L_0x1318
        L_0x1303:
            r0 = move-exception
            goto L_0x1307
        L_0x1305:
            r0 = move-exception
            r8 = 0
        L_0x1307:
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21533t()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r86)
            java.lang.String r5 = "Error storing filter results. appId"
            r1.mo21551a(r5, r2, r0)
        L_0x1318:
            r2 = r85
            r5 = r88
            r48 = r7
            r44 = r12
            r41 = r14
            r1 = r17
            r10 = r47
            r17 = r13
            goto L_0x1044
        L_0x132a:
            r13 = r17
            r2 = r85
            goto L_0x1044
        L_0x1330:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5320l9.mo21548a(java.lang.String, java.util.List, java.util.List, java.lang.Long):java.util.List");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo21219u() {
        return false;
    }

    @C4476d0
    /* renamed from: a */
    private static Boolean m23192a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    @C4476d0
    /* renamed from: a */
    private final Boolean m23195a(String str, C4854f fVar) {
        String str2;
        List list;
        C4300a0.m18620a(fVar);
        if (str == null || !fVar.mo19245a() || fVar.mo19246o() == C4856b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (fVar.mo19246o() == C4856b.IN_LIST) {
            if (fVar.mo19252u() == 0) {
                return null;
            }
        } else if (!fVar.mo19247p()) {
            return null;
        }
        C4856b o = fVar.mo19246o();
        boolean s = fVar.mo19250s();
        if (s || o == C4856b.REGEXP || o == C4856b.IN_LIST) {
            str2 = fVar.mo19248q();
        } else {
            str2 = fVar.mo19248q().toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (fVar.mo19252u() == 0) {
            list = null;
        } else {
            List<String> t = fVar.mo19251t();
            if (!s) {
                ArrayList arrayList = new ArrayList(t.size());
                for (String upperCase : t) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                t = Collections.unmodifiableList(arrayList);
            }
            list = t;
        }
        return m23194a(str, o, s, str3, list, o == C4856b.REGEXP ? str3 : null);
    }

    /* renamed from: a */
    private final Boolean m23194a(String str, C4856b bVar, boolean z, String str2, List<String> list, String str3) {
        if (str == null) {
            return null;
        }
        if (bVar == C4856b.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && bVar != C4856b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (C5353o9.f15363a[bVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    mo21205d().mo21536w().mo21550a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: a */
    private final Boolean m23191a(long j, C4849d dVar) {
        try {
            return m23196a(new BigDecimal(j), dVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final Boolean m23190a(double d, C4849d dVar) {
        try {
            return m23196a(new BigDecimal(d), dVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final Boolean m23193a(String str, C4849d dVar) {
        if (!C5221c9.m22549a(str)) {
            return null;
        }
        try {
            return m23196a(new BigDecimal(str), dVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r2 != null) goto L_0x0087;
     */
    @com.google.android.gms.common.util.C4476d0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean m23196a(java.math.BigDecimal r9, com.google.android.gms.internal.measurement.C4842l0.C4849d r10, double r11) {
        /*
            com.google.android.gms.common.internal.C4300a0.m18620a(r10)
            boolean r0 = r10.mo19225a()
            r1 = 0
            if (r0 == 0) goto L_0x0110
            com.google.android.gms.internal.measurement.l0$d$a r0 = r10.mo19226o()
            com.google.android.gms.internal.measurement.l0$d$a r2 = com.google.android.gms.internal.measurement.C4842l0.C4849d.C4850a.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x0110
        L_0x0014:
            com.google.android.gms.internal.measurement.l0$d$a r0 = r10.mo19226o()
            com.google.android.gms.internal.measurement.l0$d$a r2 = com.google.android.gms.internal.measurement.C4842l0.C4849d.C4850a.BETWEEN
            if (r0 != r2) goto L_0x0029
            boolean r0 = r10.mo19231t()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r10.mo19233v()
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r10.mo19229r()
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            com.google.android.gms.internal.measurement.l0$d$a r0 = r10.mo19226o()
            com.google.android.gms.internal.measurement.l0$d$a r2 = r10.mo19226o()
            com.google.android.gms.internal.measurement.l0$d$a r3 = com.google.android.gms.internal.measurement.C4842l0.C4849d.C4850a.BETWEEN
            if (r2 != r3) goto L_0x0067
            java.lang.String r2 = r10.mo19232u()
            boolean r2 = com.google.android.gms.measurement.internal.C5221c9.m22549a(r2)
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = r10.mo19234w()
            boolean r2 = com.google.android.gms.measurement.internal.C5221c9.m22549a(r2)
            if (r2 != 0) goto L_0x0051
            goto L_0x0066
        L_0x0051:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r3 = r10.mo19232u()     // Catch:{ NumberFormatException -> 0x0066 }
            r2.<init>(r3)     // Catch:{ NumberFormatException -> 0x0066 }
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r10 = r10.mo19234w()     // Catch:{ NumberFormatException -> 0x0066 }
            r3.<init>(r10)     // Catch:{ NumberFormatException -> 0x0066 }
            r10 = r2
            r2 = r1
            goto L_0x007d
        L_0x0066:
            return r1
        L_0x0067:
            java.lang.String r2 = r10.mo19230s()
            boolean r2 = com.google.android.gms.measurement.internal.C5221c9.m22549a(r2)
            if (r2 != 0) goto L_0x0072
            return r1
        L_0x0072:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0110 }
            java.lang.String r10 = r10.mo19230s()     // Catch:{ NumberFormatException -> 0x0110 }
            r2.<init>(r10)     // Catch:{ NumberFormatException -> 0x0110 }
            r10 = r1
            r3 = r10
        L_0x007d:
            com.google.android.gms.internal.measurement.l0$d$a r4 = com.google.android.gms.internal.measurement.C4842l0.C4849d.C4850a.BETWEEN
            if (r0 != r4) goto L_0x0085
            if (r10 == 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            return r1
        L_0x0085:
            if (r2 == 0) goto L_0x0110
        L_0x0087:
            int[] r4 = com.google.android.gms.measurement.internal.C5353o9.f15364b
            int r0 = r0.ordinal()
            r0 = r4[r0]
            r4 = -1
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L_0x0104
            r7 = 2
            if (r0 == r7) goto L_0x00f8
            r8 = 3
            if (r0 == r8) goto L_0x00b0
            r11 = 4
            if (r0 == r11) goto L_0x009e
            goto L_0x0110
        L_0x009e:
            int r10 = r9.compareTo(r10)
            if (r10 == r4) goto L_0x00ab
            int r9 = r9.compareTo(r3)
            if (r9 == r6) goto L_0x00ab
            r5 = 1
        L_0x00ab:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00b0:
            r0 = 0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x00ec
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r0)
            java.math.BigDecimal r10 = r2.subtract(r10)
            int r10 = r9.compareTo(r10)
            if (r10 != r6) goto L_0x00e7
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r11)
            java.math.BigDecimal r10 = r2.add(r10)
            int r9 = r9.compareTo(r10)
            if (r9 != r4) goto L_0x00e7
            r5 = 1
        L_0x00e7:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00ec:
            int r9 = r9.compareTo(r2)
            if (r9 != 0) goto L_0x00f3
            r5 = 1
        L_0x00f3:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00f8:
            int r9 = r9.compareTo(r2)
            if (r9 != r6) goto L_0x00ff
            r5 = 1
        L_0x00ff:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0104:
            int r9 = r9.compareTo(r2)
            if (r9 != r4) goto L_0x010b
            r5 = 1
        L_0x010b:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0110:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5320l9.m23196a(java.math.BigDecimal, com.google.android.gms.internal.measurement.l0$d, double):java.lang.Boolean");
    }

    /* renamed from: a */
    private static List<C4969b> m23197a(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Integer intValue : map.keySet()) {
            int intValue2 = intValue.intValue();
            arrayList.add((C4969b) C4969b.m21144r().mo19473a(intValue2).mo19474a(((Long) map.get(Integer.valueOf(intValue2))).longValue()).mo19056B());
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m23198a(Map<Integer, Long> map, int i, long j) {
        Long l = (Long) map.get(Integer.valueOf(i));
        long j2 = j / 1000;
        if (l == null || j2 > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j2));
        }
    }
}
