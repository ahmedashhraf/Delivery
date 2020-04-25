package p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b;

import java.util.Collections;
import java.util.Set;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2716b;
import p201f.p202a.C5952h;

@C2716b
/* renamed from: c.d.b.a.e.a.a.a.b.m */
/* compiled from: Present */
final class C6330m<T> extends C6325i<T> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final T f17700a;

    C6330m(T t) {
        this.f17700a = t;
    }

    /* renamed from: a */
    public T mo25586a(T t) {
        C6329k.m29435a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.f17700a;
    }

    /* renamed from: d */
    public T mo25588d() {
        return this.f17700a;
    }

    /* renamed from: e */
    public boolean mo25589e() {
        return true;
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C6330m)) {
            return false;
        }
        return this.f17700a.equals(((C6330m) obj).f17700a);
    }

    /* renamed from: f */
    public T mo25591f() {
        return this.f17700a;
    }

    public int hashCode() {
        return this.f17700a.hashCode() + 1502476572;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Optional.of(");
        sb.append(this.f17700a);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public C6325i<T> mo25584a(C6325i<? extends T> iVar) {
        C6329k.m29434a(iVar);
        return this;
    }

    /* renamed from: a */
    public T mo25585a(C6333q<? extends T> qVar) {
        C6329k.m29434a(qVar);
        return this.f17700a;
    }

    /* renamed from: a */
    public Set<T> mo25587a() {
        return Collections.singleton(this.f17700a);
    }

    /* renamed from: a */
    public <V> C6325i<V> mo25583a(C6324f<? super T, V> fVar) {
        return new C6330m(C6329k.m29435a(fVar.apply(this.f17700a), (Object) "the Function passed to Optional.transform() must not return null."));
    }
}
