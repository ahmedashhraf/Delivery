package com.google.android.gms.internal.measurement;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.m2 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4871m2 {

    /* renamed from: a */
    private final ConcurrentHashMap<C4858l2, List<Throwable>> f14259a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f14260b = new ReferenceQueue<>();

    C4871m2() {
    }

    /* renamed from: a */
    public final List<Throwable> mo19271a(Throwable th, boolean z) {
        Reference poll = this.f14260b.poll();
        while (poll != null) {
            this.f14259a.remove(poll);
            poll = this.f14260b.poll();
        }
        List<Throwable> list = (List) this.f14259a.get(new C4858l2(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f14259a.putIfAbsent(new C4858l2(th, this.f14260b), vector);
        return list2 == null ? vector : list2;
    }
}
