package p076c.p082c.p083a.p088u.p090i.p094q;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: c.c.a.u.i.q.c */
/* compiled from: PreFillQueue */
final class C2388c {

    /* renamed from: a */
    private final Map<C2389d, Integer> f9333a;

    /* renamed from: b */
    private final List<C2389d> f9334b;

    /* renamed from: c */
    private int f9335c;

    /* renamed from: d */
    private int f9336d;

    public C2388c(Map<C2389d, Integer> map) {
        this.f9333a = map;
        this.f9334b = new ArrayList(map.keySet());
        for (Integer intValue : map.values()) {
            this.f9335c += intValue.intValue();
        }
    }

    /* renamed from: a */
    public int mo9797a() {
        return this.f9335c;
    }

    /* renamed from: b */
    public boolean mo9798b() {
        return this.f9335c == 0;
    }

    /* renamed from: c */
    public C2389d mo9799c() {
        C2389d dVar = (C2389d) this.f9334b.get(this.f9336d);
        Integer num = (Integer) this.f9333a.get(dVar);
        if (num.intValue() == 1) {
            this.f9333a.remove(dVar);
            this.f9334b.remove(this.f9336d);
        } else {
            this.f9333a.put(dVar, Integer.valueOf(num.intValue() - 1));
        }
        this.f9335c--;
        this.f9336d = this.f9334b.isEmpty() ? 0 : (this.f9336d + 1) % this.f9334b.size();
        return dVar;
    }
}
