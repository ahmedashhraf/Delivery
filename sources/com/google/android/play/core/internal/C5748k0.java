package com.google.android.play.core.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.play.core.internal.k0 */
final class C5748k0 {

    /* renamed from: a */
    private final ConcurrentHashMap<C5754n0, List<Throwable>> f16618a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f16619b = new ReferenceQueue<>();

    C5748k0() {
    }

    /* renamed from: a */
    public final List<Throwable> mo23051a(Throwable th, boolean z) {
        while (true) {
            Reference poll = this.f16619b.poll();
            if (poll == null) {
                break;
            }
            this.f16618a.remove(poll);
        }
        List<Throwable> list = (List) this.f16618a.get(new C5754n0(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f16618a.putIfAbsent(new C5754n0(th, this.f16619b), vector);
        return list2 == null ? vector : list2;
    }
}
