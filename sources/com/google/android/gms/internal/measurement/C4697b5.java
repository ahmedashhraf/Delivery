package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.b5 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4697b5 extends C4683a5 {
    private C4697b5() {
        super();
    }

    /* renamed from: c */
    private static <E> C4912p4<E> m19953c(Object obj, long j) {
        return (C4912p4) C4759f7.m20173f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo18826a(Object obj, long j) {
        C4912p4 c = m19953c(obj, j);
        if (c.mo19360a()) {
            return c;
        }
        int size = c.size();
        C4912p4 a = c.mo18907a(size == 0 ? 10 : size << 1);
        C4759f7.m20151a(obj, j, (Object) a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo18828b(Object obj, long j) {
        m19953c(obj, j).mo19361d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo18827a(Object obj, Object obj2, long j) {
        C4912p4 c = m19953c(obj, j);
        C4912p4 c2 = m19953c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo19360a()) {
                c = c.mo18907a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        C4759f7.m20151a(obj, j, (Object) c2);
    }
}
