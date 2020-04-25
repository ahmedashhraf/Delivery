package p076c.p082c.p083a.p088u.p090i.p091n;

import java.util.Queue;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.p090i.p091n.C2340h;

/* renamed from: c.c.a.u.i.n.b */
/* compiled from: BaseKeyPool */
abstract class C2329b<T extends C2340h> {

    /* renamed from: b */
    private static final int f9229b = 20;

    /* renamed from: a */
    private final Queue<T> f9230a = C2216i.m11342a(20);

    C2329b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo9726a();

    /* renamed from: a */
    public void mo9728a(T t) {
        if (this.f9230a.size() < 20) {
            this.f9230a.offer(t);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public T mo9729b() {
        T t = (C2340h) this.f9230a.poll();
        return t == null ? mo9726a() : t;
    }
}
