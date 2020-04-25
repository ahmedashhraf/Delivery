package com.google.common.collect;

import com.google.common.base.C7397x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.g0 */
/* compiled from: Constraints */
final class C7849g0 {

    /* renamed from: com.google.common.collect.g0$a */
    /* compiled from: Constraints */
    static class C7850a<E> extends C7997l1<E> {

        /* renamed from: a */
        private final Collection<E> f21554a;

        /* renamed from: b */
        private final C7787f0<? super E> f21555b;

        public C7850a(Collection<E> collection, C7787f0<? super E> f0Var) {
            this.f21554a = (Collection) C7397x.m35664a(collection);
            this.f21555b = (C7787f0) C7397x.m35664a(f0Var);
        }

        public boolean add(E e) {
            this.f21555b.mo29691a(e);
            return this.f21554a.add(e);
        }

        public boolean addAll(Collection<? extends E> collection) {
            return this.f21554a.addAll(C7849g0.m37457b(collection, this.f21555b));
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Collection<E> m37462y() {
            return this.f21554a;
        }
    }

    @C2776b
    /* renamed from: com.google.common.collect.g0$b */
    /* compiled from: Constraints */
    private static class C7851b<E> extends C8141s1<E> {

        /* renamed from: a */
        final List<E> f21556a;

        /* renamed from: b */
        final C7787f0<? super E> f21557b;

        C7851b(List<E> list, C7787f0<? super E> f0Var) {
            this.f21556a = (List) C7397x.m35664a(list);
            this.f21557b = (C7787f0) C7397x.m35664a(f0Var);
        }

        public boolean add(E e) {
            this.f21557b.mo29691a(e);
            return this.f21556a.add(e);
        }

        public boolean addAll(Collection<? extends E> collection) {
            return this.f21556a.addAll(C7849g0.m37457b(collection, this.f21557b));
        }

        public ListIterator<E> listIterator() {
            return C7849g0.m37458b(this.f21556a.listIterator(), this.f21557b);
        }

        public E set(int i, E e) {
            this.f21557b.mo29691a(e);
            return this.f21556a.set(i, e);
        }

        public List<E> subList(int i, int i2) {
            return C7849g0.m37453a(this.f21556a.subList(i, i2), this.f21557b);
        }

        public boolean addAll(int i, Collection<? extends E> collection) {
            return this.f21556a.addAll(i, C7849g0.m37457b(collection, this.f21557b));
        }

        public ListIterator<E> listIterator(int i) {
            return C7849g0.m37458b(this.f21556a.listIterator(i), this.f21557b);
        }

        public void add(int i, E e) {
            this.f21557b.mo29691a(e);
            this.f21556a.add(i, e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public List<E> m37465y() {
            return this.f21556a;
        }
    }

    /* renamed from: com.google.common.collect.g0$c */
    /* compiled from: Constraints */
    static class C7852c<E> extends C8174t1<E> {

        /* renamed from: a */
        private final ListIterator<E> f21558a;

        /* renamed from: b */
        private final C7787f0<? super E> f21559b;

        public C7852c(ListIterator<E> listIterator, C7787f0<? super E> f0Var) {
            this.f21558a = listIterator;
            this.f21559b = f0Var;
        }

        public void add(E e) {
            this.f21559b.mo29691a(e);
            this.f21558a.add(e);
        }

        public void set(E e) {
            this.f21559b.mo29691a(e);
            this.f21558a.set(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public ListIterator<E> m37468y() {
            return this.f21558a;
        }
    }

    /* renamed from: com.google.common.collect.g0$d */
    /* compiled from: Constraints */
    static class C7853d<E> extends C7851b<E> implements RandomAccess {
        C7853d(List<E> list, C7787f0<? super E> f0Var) {
            super(list, f0Var);
        }
    }

    /* renamed from: com.google.common.collect.g0$e */
    /* compiled from: Constraints */
    static class C7854e<E> extends C7555b2<E> {

        /* renamed from: a */
        private final Set<E> f21560a;

        /* renamed from: b */
        private final C7787f0<? super E> f21561b;

        public C7854e(Set<E> set, C7787f0<? super E> f0Var) {
            this.f21560a = (Set) C7397x.m35664a(set);
            this.f21561b = (C7787f0) C7397x.m35664a(f0Var);
        }

        public boolean add(E e) {
            this.f21561b.mo29691a(e);
            return this.f21560a.add(e);
        }

        public boolean addAll(Collection<? extends E> collection) {
            return this.f21560a.addAll(C7849g0.m37457b(collection, this.f21561b));
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Set<E> m37471y() {
            return this.f21560a;
        }
    }

    /* renamed from: com.google.common.collect.g0$f */
    /* compiled from: Constraints */
    private static class C7855f<E> extends C7792f2<E> {

        /* renamed from: a */
        final SortedSet<E> f21562a;

        /* renamed from: b */
        final C7787f0<? super E> f21563b;

        C7855f(SortedSet<E> sortedSet, C7787f0<? super E> f0Var) {
            this.f21562a = (SortedSet) C7397x.m35664a(sortedSet);
            this.f21563b = (C7787f0) C7397x.m35664a(f0Var);
        }

        public boolean add(E e) {
            this.f21563b.mo29691a(e);
            return this.f21562a.add(e);
        }

        public boolean addAll(Collection<? extends E> collection) {
            return this.f21562a.addAll(C7849g0.m37457b(collection, this.f21563b));
        }

        public SortedSet<E> headSet(E e) {
            return C7849g0.m37456a(this.f21562a.headSet(e), this.f21563b);
        }

        public SortedSet<E> subSet(E e, E e2) {
            return C7849g0.m37456a(this.f21562a.subSet(e, e2), this.f21563b);
        }

        public SortedSet<E> tailSet(E e) {
            return C7849g0.m37456a(this.f21562a.tailSet(e), this.f21563b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public SortedSet<E> m37475y() {
            return this.f21562a;
        }
    }

    private C7849g0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <E> ListIterator<E> m37458b(ListIterator<E> listIterator, C7787f0<? super E> f0Var) {
        return new C7852c(listIterator, f0Var);
    }

    /* renamed from: c */
    public static <E> Collection<E> m37459c(Collection<E> collection, C7787f0<? super E> f0Var) {
        return new C7850a(collection, f0Var);
    }

    /* renamed from: d */
    static <E> Collection<E> m37460d(Collection<E> collection, C7787f0<E> f0Var) {
        if (collection instanceof SortedSet) {
            return m37456a((SortedSet) collection, f0Var);
        }
        if (collection instanceof Set) {
            return m37455a((Set) collection, f0Var);
        }
        if (collection instanceof List) {
            return m37453a((List) collection, f0Var);
        }
        return m37459c(collection, f0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <E> Collection<E> m37457b(Collection<E> collection, C7787f0<? super E> f0Var) {
        ArrayList<Object> b = C8309z3.m39665b((Iterable<? extends E>) collection);
        for (Object a : b) {
            f0Var.mo29691a(a);
        }
        return b;
    }

    /* renamed from: a */
    public static <E> Set<E> m37455a(Set<E> set, C7787f0<? super E> f0Var) {
        return new C7854e(set, f0Var);
    }

    /* renamed from: a */
    public static <E> SortedSet<E> m37456a(SortedSet<E> sortedSet, C7787f0<? super E> f0Var) {
        return new C7855f(sortedSet, f0Var);
    }

    /* renamed from: a */
    public static <E> List<E> m37453a(List<E> list, C7787f0<? super E> f0Var) {
        return list instanceof RandomAccess ? new C7853d(list, f0Var) : new C7851b(list, f0Var);
    }
}
