package p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2715a;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2716b;
import p201f.p202a.C5952h;

@C2716b(serializable = true)
/* renamed from: c.d.b.a.e.a.a.a.b.i */
/* compiled from: Optional */
public abstract class C6325i<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: c.d.b.a.e.a.a.a.b.i$a */
    /* compiled from: Optional */
    static class C6326a implements Iterable<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f17697a;

        /* renamed from: c.d.b.a.e.a.a.a.b.i$a$a */
        /* compiled from: Optional */
        class C6327a extends C6310b<T> {

            /* renamed from: N */
            private final Iterator<? extends C6325i<? extends T>> f17698N = ((Iterator) C6329k.m29434a(C6326a.this.f17697a.iterator()));

            C6327a() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public T mo10480b() {
                while (this.f17698N.hasNext()) {
                    C6325i iVar = (C6325i) this.f17698N.next();
                    if (iVar.mo25589e()) {
                        return iVar.mo25588d();
                    }
                }
                return mo25594c();
            }
        }

        C6326a(Iterable iterable) {
            this.f17697a = iterable;
        }

        public Iterator<T> iterator() {
            return new C6327a();
        }
    }

    C6325i() {
    }

    @C2715a
    /* renamed from: a */
    public static <T> Iterable<T> m29417a(Iterable<? extends C6325i<? extends T>> iterable) {
        C6329k.m29434a(iterable);
        return new C6326a(iterable);
    }

    /* renamed from: b */
    public static <T> C6325i<T> m29418b(@C5952h T t) {
        return t == null ? m29420g() : new C6330m(t);
    }

    /* renamed from: c */
    public static <T> C6325i<T> m29419c(T t) {
        return new C6330m(C6329k.m29434a(t));
    }

    /* renamed from: g */
    public static <T> C6325i<T> m29420g() {
        return C6309a.m29368h();
    }

    /* renamed from: a */
    public abstract <V> C6325i<V> mo25583a(C6324f<? super T, V> fVar);

    /* renamed from: a */
    public abstract C6325i<T> mo25584a(C6325i<? extends T> iVar);

    @C2715a
    /* renamed from: a */
    public abstract T mo25585a(C6333q<? extends T> qVar);

    /* renamed from: a */
    public abstract T mo25586a(T t);

    /* renamed from: a */
    public abstract Set<T> mo25587a();

    /* renamed from: d */
    public abstract T mo25588d();

    /* renamed from: e */
    public abstract boolean mo25589e();

    public abstract boolean equals(@C5952h Object obj);

    @C5952h
    /* renamed from: f */
    public abstract T mo25591f();

    public abstract int hashCode();

    public abstract String toString();
}
