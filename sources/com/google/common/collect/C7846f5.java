package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C8197t5.C8199b;
import com.google.common.collect.C8197t5.C8203c;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.f5 */
/* compiled from: RegularImmutableSortedSet */
final class C7846f5<E> extends C8068n3<E> {

    /* renamed from: T */
    private final transient C8257x2<E> f21552T;

    C7846f5(C8257x2<E> x2Var, Comparator<? super E> comparator) {
        super(comparator);
        this.f21552T = x2Var;
        C7397x.m35670a(!x2Var.isEmpty());
    }

    /* renamed from: g */
    private int m37435g(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.f21552T, obj, mo30457p());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo29839a(Object[] objArr, int i) {
        return this.f21552T.mo29839a(objArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8068n3<E> mo30440b(E e, boolean z) {
        return mo30439a(0, mo30447e(e, z));
    }

    /* renamed from: c */
    public E mo30442c(E e) {
        int f = mo30450f(e, true);
        if (f == size()) {
            return null;
        }
        return this.f21552T.get(f);
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m37435g(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof C7982k4) {
            collection = ((C7982k4) collection).mo29710h();
        }
        if (!C8165s5.m39056a(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C8164s4 h = C8178t3.m39136h(iterator());
        Iterator it = collection.iterator();
        Object next = it.next();
        while (h.hasNext()) {
            try {
                int b = mo30880b(h.peek(), next);
                if (b < 0) {
                    h.next();
                } else if (b == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (b > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: d */
    public E mo30445d(E e) {
        int e2 = mo30447e(e, true) - 1;
        if (e2 == -1) {
            return null;
        }
        return this.f21552T.get(e2);
    }

    @C2777c("NavigableSet")
    public C8023l6<E> descendingIterator() {
        return this.f21552T.mo30925k().iterator();
    }

    /* renamed from: e */
    public E mo30448e(E e) {
        int f = mo30450f(e, false);
        if (f == size()) {
            return null;
        }
        return this.f21552T.get(f);
    }

    public boolean equals(@C5952h Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (!C8165s5.m39056a(this.f21866P, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            C8023l6 it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                if (next2 != null) {
                    if (mo30880b(next, next2) != 0) {
                    }
                }
                return false;
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public E mo30451f(E e) {
        int e2 = mo30447e(e, false) - 1;
        if (e2 == -1) {
            return null;
        }
        return this.f21552T.get(e2);
    }

    public E first() {
        return this.f21552T.get(0);
    }

    /* access modifiers changed from: 0000 */
    public int indexOf(@C5952h Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int a = C8197t5.m39155a((List<? extends E>) this.f21552T, obj, mo30457p(), C8203c.ANY_PRESENT, C8199b.INVERTED_INSERTION_INDEX);
            if (a < 0) {
                a = -1;
            }
            return a;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public boolean isEmpty() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return this.f21552T.mo29686j();
    }

    public E last() {
        return this.f21552T.get(size() - 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public C8068n3<E> mo30456n() {
        return new C7846f5(this.f21552T.mo30925k(), C8133r4.m38939b(this.f21866P).mo30568g());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public Comparator<Object> mo30457p() {
        return this.f21866P;
    }

    public int size() {
        return this.f21552T.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8068n3<E> mo30439a(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new C7846f5(this.f21552T.subList(i, i2), this.f21866P);
        }
        return C8068n3.m38599a(this.f21866P);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8068n3<E> mo30441b(E e, boolean z, E e2, boolean z2) {
        return mo30444d(e, z).mo30440b(e2, z2);
    }

    public C8023l6<E> iterator() {
        return this.f21552T.iterator();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C8068n3<E> mo30444d(E e, boolean z) {
        return mo30439a(mo30450f(e, z), size());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo30447e(E e, boolean z) {
        return C8197t5.m39155a((List<? extends E>) this.f21552T, C7397x.m35664a(e), comparator(), z ? C8203c.FIRST_AFTER : C8203c.FIRST_PRESENT, C8199b.NEXT_HIGHER);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo30450f(E e, boolean z) {
        return C8197t5.m39155a((List<? extends E>) this.f21552T, C7397x.m35664a(e), comparator(), z ? C8203c.FIRST_PRESENT : C8203c.FIRST_AFTER, C8199b.NEXT_HIGHER);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C8257x2<E> mo29646f() {
        return new C7899i3(this, this.f21552T);
    }
}
