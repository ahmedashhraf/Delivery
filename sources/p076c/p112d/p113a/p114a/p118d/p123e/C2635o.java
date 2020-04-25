package p076c.p112d.p113a.p114a.p118d.p123e;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: c.d.a.a.d.e.o */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C2635o {

    /* renamed from: a */
    private final ConcurrentHashMap<C2638r, List<Throwable>> f9749a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f9750b = new ReferenceQueue<>();

    C2635o() {
    }

    /* renamed from: a */
    public final List<Throwable> mo10150a(Throwable th, boolean z) {
        Reference poll = this.f9750b.poll();
        while (poll != null) {
            this.f9749a.remove(poll);
            poll = this.f9750b.poll();
        }
        List<Throwable> list = (List) this.f9749a.get(new C2638r(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f9749a.putIfAbsent(new C2638r(th, this.f9750b), vector);
        return list2 == null ? vector : list2;
    }
}
