package com.google.common.collect;

import com.google.common.base.C5831y;
import com.google.common.base.C7380p;
import com.google.common.base.C7392u;
import com.google.common.base.C7397x;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5944c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.k1 */
/* compiled from: FluentIterable */
public abstract class C5838k1<E> implements Iterable<E> {

    /* renamed from: a */
    private final Iterable<E> f16810a;

    /* renamed from: com.google.common.collect.k1$a */
    /* compiled from: FluentIterable */
    static class C5839a extends C5838k1<E> {

        /* renamed from: b */
        final /* synthetic */ Iterable f16811b;

        C5839a(Iterable iterable, Iterable iterable2) {
            this.f16811b = iterable2;
            super(iterable);
        }

        public Iterator<E> iterator() {
            return this.f16811b.iterator();
        }
    }

    /* renamed from: com.google.common.collect.k1$b */
    /* compiled from: FluentIterable */
    private static class C5840b<E> implements C7380p<Iterable<E>, C5838k1<E>> {
        private C5840b() {
        }

        /* renamed from: b */
        public C5838k1<E> apply(Iterable<E> iterable) {
            return C5838k1.m25634a(iterable);
        }
    }

    protected C5838k1() {
        this.f16810a = this;
    }

    /* renamed from: a */
    public static <E> C5838k1<E> m25634a(Iterable<E> iterable) {
        return iterable instanceof C5838k1 ? (C5838k1) iterable : new C5839a(iterable, iterable);
    }

    @C5944c
    /* renamed from: b */
    public final C5838k1<E> mo23209b() {
        return m25634a(C8145s3.m39032d(this.f16810a));
    }

    @C5944c
    /* renamed from: c */
    public final C5838k1<E> mo23217c(C5831y<? super E> yVar) {
        return m25634a(C8145s3.m39030c(this.f16810a, yVar));
    }

    public final boolean contains(@C5952h Object obj) {
        return C8145s3.m39016a(this.f16810a, obj);
    }

    /* renamed from: d */
    public final C7392u<E> mo23220d(C5831y<? super E> yVar) {
        return C8145s3.m39044h(this.f16810a, yVar);
    }

    /* renamed from: e */
    public final C7859g3<E> mo23222e() {
        return C7859g3.m37498a(this.f16810a);
    }

    public final C7392u<E> first() {
        Iterator it = this.f16810a.iterator();
        return it.hasNext() ? C7392u.m35645c(it.next()) : C7392u.m35646g();
    }

    public final E get(int i) {
        return C8145s3.m39009a(this.f16810a, i);
    }

    public final boolean isEmpty() {
        return !this.f16810a.iterator().hasNext();
    }

    public final C7392u<E> last() {
        Object next;
        Iterable<E> iterable = this.f16810a;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return C7392u.m35646g();
            }
            return C7392u.m35645c(list.get(list.size() - 1));
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return C7392u.m35646g();
        }
        Iterable<E> iterable2 = this.f16810a;
        if (iterable2 instanceof SortedSet) {
            return C7392u.m35645c(((SortedSet) iterable2).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return C7392u.m35645c(next);
    }

    public final int size() {
        return C8145s3.m39046i(this.f16810a);
    }

    public String toString() {
        return C8145s3.m39049l(this.f16810a);
    }

    @Deprecated
    /* renamed from: a */
    public static <E> C5838k1<E> m25633a(C5838k1<E> k1Var) {
        return (C5838k1) C7397x.m35664a(k1Var);
    }

    /* renamed from: b */
    public final boolean mo23213b(C5831y<? super E> yVar) {
        return C8145s3.m39024b(this.f16810a, yVar);
    }

    /* renamed from: c */
    public final <T> C5838k1<T> mo23216c(C7380p<? super E, T> pVar) {
        return m25634a(C8145s3.m39001a(this.f16810a, pVar));
    }

    /* renamed from: d */
    public <T> C5838k1<T> mo23221d(C7380p<? super E, ? extends Iterable<? extends T>> pVar) {
        return m25634a(C8145s3.m39022b(mo23216c(pVar)));
    }

    /* renamed from: e */
    public final <K> C8302z2<K, E> mo23223e(C7380p<? super E, K> pVar) {
        return C7800f4.m37314b(this.f16810a, pVar);
    }

    C5838k1(Iterable<E> iterable) {
        this.f16810a = (Iterable) C7397x.m35664a(iterable);
    }

    @C2777c("Class.isInstance")
    @C5944c
    /* renamed from: a */
    public final <T> C5838k1<T> mo23204a(Class<T> cls) {
        return m25634a(C8145s3.m39002a(this.f16810a, cls));
    }

    @C5944c
    /* renamed from: b */
    public final C5838k1<E> mo23210b(int i) {
        return m25634a(C8145s3.m39023b(this.f16810a, i));
    }

    @C5944c
    /* renamed from: c */
    public final C5838k1<E> mo23215c(int i) {
        return m25634a(C8145s3.m39037e(this.f16810a, i));
    }

    /* renamed from: a */
    public final boolean mo23208a(C5831y<? super E> yVar) {
        return C8145s3.m39015a(this.f16810a, yVar);
    }

    /* renamed from: b */
    public final C8068n3<E> mo23211b(Comparator<? super E> comparator) {
        return C8068n3.m38601a(comparator, this.f16810a);
    }

    /* renamed from: c */
    public final C8257x2<E> mo23218c() {
        return C8257x2.m39392a(this.f16810a);
    }

    @C2775a
    /* renamed from: a */
    public final C8257x2<E> mo23205a(Comparator<? super E> comparator) {
        return C8133r4.m38939b(comparator).mo30930a(this.f16810a);
    }

    /* renamed from: b */
    public final <V> C8302z2<E, V> mo23212b(C7380p<? super E, V> pVar) {
        return C7800f4.m37284a(this.f16810a, pVar);
    }

    /* renamed from: a */
    public final <K> C8281y2<K, E> mo23206a(C7380p<? super E, K> pVar) {
        return C7936j4.m37985a(this.f16810a, pVar);
    }

    @C2777c("Array.newArray(Class, int)")
    /* renamed from: b */
    public final E[] mo23214b(Class<E> cls) {
        return C8145s3.m39027b(this.f16810a, cls);
    }

    /* renamed from: a */
    public final <C extends Collection<? super E>> C mo23207a(C c) {
        C7397x.m35664a(c);
        Iterable<E> iterable = this.f16810a;
        if (iterable instanceof Collection) {
            c.addAll(C8292z.m39586a(iterable));
        } else {
            for (E add : iterable) {
                c.add(add);
            }
        }
        return c;
    }
}
