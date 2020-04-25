package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.c5 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4711c5 extends C4683a5 {

    /* renamed from: c */
    private static final Class<?> f14025c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C4711c5() {
        super();
    }

    /* renamed from: c */
    private static <E> List<E> m19993c(Object obj, long j) {
        return (List) C4759f7.m20173f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo18826a(Object obj, long j) {
        return m19992a(obj, j, 10);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo18828b(Object obj, long j) {
        Object obj2;
        List list = (List) C4759f7.m20173f(obj, j);
        if (list instanceof C5046x4) {
            obj2 = ((C5046x4) list).mo18922g();
        } else if (!f14025c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C4726d6) || !(list instanceof C4912p4)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C4912p4 p4Var = (C4912p4) list;
                if (p4Var.mo19360a()) {
                    p4Var.mo19361d();
                }
                return;
            }
        } else {
            return;
        }
        C4759f7.m20151a(obj, j, obj2);
    }

    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<L>] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m19992a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m19993c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C5046x4
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.measurement.y4 r0 = new com.google.android.gms.internal.measurement.y4
            r0.<init>(r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C4726d6
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C4912p4
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.measurement.p4 r0 = (com.google.android.gms.internal.measurement.C4912p4) r0
            com.google.android.gms.internal.measurement.p4 r6 = r0.mo18907a(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r3, r4, r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f14025c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C4727d7
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.measurement.y4 r1 = new com.google.android.gms.internal.measurement.y4
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            com.google.android.gms.internal.measurement.d7 r0 = (com.google.android.gms.internal.measurement.C4727d7) r0
            r1.addAll(r0)
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C4726d6
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C4912p4
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.measurement.p4 r1 = (com.google.android.gms.internal.measurement.C4912p4) r1
            boolean r2 = r1.mo19360a()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.measurement.p4 r0 = r1.mo18907a(r0)
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r3, r4, r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4711c5.m19992a(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo18827a(Object obj, Object obj2, long j) {
        List c = m19993c(obj2, j);
        List a = m19992a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size > 0) {
            c = a;
        }
        C4759f7.m20151a(obj, j, (Object) c);
    }
}
