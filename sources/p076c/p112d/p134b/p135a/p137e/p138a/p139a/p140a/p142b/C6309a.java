package p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b;

import java.util.Collections;
import java.util.Set;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2716b;
import p201f.p202a.C5952h;

@C2716b
/* renamed from: c.d.b.a.e.a.a.a.b.a */
/* compiled from: Absent */
final class C6309a<T> extends C6325i<T> {

    /* renamed from: a */
    static final C6309a<Object> f17678a = new C6309a<>();
    private static final long serialVersionUID = 0;

    private C6309a() {
    }

    /* renamed from: h */
    static <T> C6325i<T> m29368h() {
        return f17678a;
    }

    private Object readResolve() {
        return f17678a;
    }

    /* renamed from: a */
    public T mo25586a(T t) {
        return C6329k.m29435a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
    }

    /* renamed from: d */
    public T mo25588d() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: e */
    public boolean mo25589e() {
        return false;
    }

    public boolean equals(@C5952h Object obj) {
        return obj == this;
    }

    @C5952h
    /* renamed from: f */
    public T mo25591f() {
        return null;
    }

    public int hashCode() {
        return 1502476572;
    }

    public String toString() {
        return "Optional.absent()";
    }

    /* renamed from: a */
    public C6325i<T> mo25584a(C6325i<? extends T> iVar) {
        return (C6325i) C6329k.m29434a(iVar);
    }

    /* renamed from: a */
    public T mo25585a(C6333q<? extends T> qVar) {
        return C6329k.m29435a(qVar.get(), (Object) "use Optional.orNull() instead of a Supplier that returns null");
    }

    /* renamed from: a */
    public Set<T> mo25587a() {
        return Collections.emptySet();
    }

    /* renamed from: a */
    public <V> C6325i<V> mo25583a(C6324f<? super T, V> fVar) {
        C6329k.m29434a(fVar);
        return C6325i.m29420g();
    }
}
