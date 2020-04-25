package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C7982k4.C7983a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2778d;
import p076c.p112d.p148d.p150g.C6637f;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.collect.e0 */
/* compiled from: ConcurrentHashMultiset */
public final class C7697e0<E> extends C7893i<E> implements Serializable {
    private static final long serialVersionUID = 1;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final transient ConcurrentMap<E, AtomicInteger> f21304N;

    /* renamed from: O */
    private transient C7701d f21305O;

    /* renamed from: com.google.common.collect.e0$a */
    /* compiled from: ConcurrentHashMultiset */
    class C7698a extends C7555b2<E> {

        /* renamed from: a */
        final /* synthetic */ Set f21306a;

        C7698a(Set set) {
            this.f21306a = set;
        }

        public boolean contains(@C5952h Object obj) {
            return obj != null && C8292z.m39592a((Collection<?>) this.f21306a, obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return mo30763b(collection);
        }

        public boolean remove(Object obj) {
            return obj != null && C8292z.m39598b((Collection<?>) this.f21306a, obj);
        }

        public boolean removeAll(Collection<?> collection) {
            return mo29681c(collection);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Set<E> m36740y() {
            return this.f21306a;
        }
    }

    /* renamed from: com.google.common.collect.e0$b */
    /* compiled from: ConcurrentHashMultiset */
    class C7699b extends C7603c<C7983a<E>> {

        /* renamed from: N */
        private Iterator<Entry<E, AtomicInteger>> f21308N = C7697e0.this.f21304N.entrySet().iterator();

        C7699b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C7983a<E> m36742b() {
            while (this.f21308N.hasNext()) {
                Entry entry = (Entry) this.f21308N.next();
                int i = ((AtomicInteger) entry.getValue()).get();
                if (i != 0) {
                    return C8003l4.m38354a(entry.getKey(), i);
                }
            }
            return (C7983a) mo29793c();
        }
    }

    /* renamed from: com.google.common.collect.e0$c */
    /* compiled from: ConcurrentHashMultiset */
    class C7700c extends C8124r1<C7983a<E>> {

        /* renamed from: a */
        private C7983a<E> f21311a;

        /* renamed from: b */
        final /* synthetic */ Iterator f21312b;

        C7700c(Iterator it) {
            this.f21312b = it;
        }

        public void remove() {
            C8277y.m39486a(this.f21311a != null);
            C7697e0.this.mo29894c(this.f21311a.getElement(), 0);
            this.f21311a = null;
        }

        public C7983a<E> next() {
            this.f21311a = (C7983a) super.next();
            return this.f21311a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Iterator<C7983a<E>> m36744y() {
            return this.f21312b;
        }
    }

    /* renamed from: com.google.common.collect.e0$d */
    /* compiled from: ConcurrentHashMultiset */
    private class C7701d extends C7895b {
        private C7701d() {
            super();
        }

        /* renamed from: c */
        private List<C7983a<E>> m36745c() {
            ArrayList c = C8309z3.m39669c(size());
            C8178t3.m39106a((Collection<T>) c, iterator());
            return c;
        }

        public Object[] toArray() {
            return m36745c().toArray();
        }

        /* synthetic */ C7701d(C7697e0 e0Var, C7698a aVar) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7697e0<E> m36747b() {
            return C7697e0.this;
        }

        public <T> T[] toArray(T[] tArr) {
            return m36745c().toArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.e0$e */
    /* compiled from: ConcurrentHashMultiset */
    private static class C7702e {

        /* renamed from: a */
        static final C7986b<C7697e0> f21314a = C7984k5.m38239a(C7697e0.class, "countMap");

        private C7702e() {
        }
    }

    @C2778d
    C7697e0(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        C7397x.m35670a(concurrentMap.isEmpty());
        this.f21304N = concurrentMap;
    }

    /* renamed from: l */
    public static <E> C7697e0<E> m36726l() {
        return new C7697e0<>(new ConcurrentHashMap());
    }

    /* renamed from: m */
    private List<E> m36727m() {
        ArrayList c = C8309z3.m39669c(size());
        for (C7983a aVar : entrySet()) {
            Object element = aVar.getElement();
            for (int count = aVar.getCount(); count > 0; count--) {
                c.add(element);
            }
        }
        return c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        C7702e.f21314a.mo30742a(this, (Object) (ConcurrentMap) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f21304N);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return super.addAll(collection);
    }

    /* renamed from: b */
    public int mo29708b(@C5952h Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) C7800f4.m37346e(this.f21304N, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r6 != 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r4.f21304N.putIfAbsent(r5, r2) == null) goto L_0x0044;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo29894c(E r5, int r6) {
        /*
            r4 = this;
            com.google.common.base.C7397x.m35664a(r5)
            java.lang.String r0 = "count"
            com.google.common.collect.C8277y.m39484a(r6, r0)
        L_0x0008:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.f21304N
            java.lang.Object r0 = com.google.common.collect.C7800f4.m37346e(r0, r5)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 != 0) goto L_0x0026
            if (r6 != 0) goto L_0x0016
            return r1
        L_0x0016:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.f21304N
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L_0x0026
            return r1
        L_0x0026:
            int r2 = r0.get()
            if (r2 != 0) goto L_0x0045
            if (r6 != 0) goto L_0x002f
            return r1
        L_0x002f:
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.f21304N
            java.lang.Object r3 = r3.putIfAbsent(r5, r2)
            if (r3 == 0) goto L_0x0044
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.f21304N
            boolean r0 = r3.replace(r5, r0, r2)
            if (r0 == 0) goto L_0x0008
        L_0x0044:
            return r1
        L_0x0045:
            boolean r3 = r0.compareAndSet(r2, r6)
            if (r3 == 0) goto L_0x0026
            if (r6 != 0) goto L_0x0052
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r6 = r4.f21304N
            r6.remove(r5, r0)
        L_0x0052:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C7697e0.mo29894c(java.lang.Object, int):int");
    }

    public void clear() {
        this.f21304N.clear();
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    /* renamed from: d */
    public boolean mo30096d(@C5952h Object obj, int i) {
        int i2;
        int i3;
        if (i == 0) {
            return true;
        }
        C7397x.m35672a(i > 0, "Invalid occurrences: %s", Integer.valueOf(i));
        AtomicInteger atomicInteger = (AtomicInteger) C7800f4.m37346e(this.f21304N, obj);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 < i) {
                return false;
            }
            i3 = i2 - i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        if (i3 == 0) {
            this.f21304N.remove(obj, atomicInteger);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Set<E> mo30097e() {
        return new C7698a(this.f21304N.keySet());
    }

    public Set<C7983a<E>> entrySet() {
        C7701d dVar = this.f21305O;
        if (dVar != null) {
            return dVar;
        }
        C7701d dVar2 = new C7701d<>(this, null);
        this.f21305O = dVar2;
        return dVar2;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ Set mo29710h() {
        return super.mo29710h();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public boolean isEmpty() {
        return this.f21304N.isEmpty();
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo30100j() {
        return this.f21304N.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public Iterator<C7983a<E>> mo30101k() {
        return new C7700c(new C7699b());
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public int size() {
        long j = 0;
        for (AtomicInteger atomicInteger : this.f21304N.values()) {
            j += (long) atomicInteger.get();
        }
        return C6637f.m31672b(j);
    }

    public Object[] toArray() {
        return m36727m().toArray();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: a */
    public static <E> C7697e0<E> m36724a(Iterable<? extends E> iterable) {
        C7697e0<E> l = m36726l();
        C8145s3.m39018a((Collection<T>) l, iterable);
        return l;
    }

    public <T> T[] toArray(T[] tArr) {
        return m36727m().toArray(tArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        if (r4.f21304N.putIfAbsent(r5, r2) == null) goto L_0x007d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo29893b(E r5, int r6) {
        /*
            r4 = this;
            com.google.common.base.C7397x.m35664a(r5)
            if (r6 != 0) goto L_0x000a
            int r5 = r4.mo29708b(r5)
            return r5
        L_0x000a:
            r0 = 1
            r1 = 0
            if (r6 <= 0) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r0[r1] = r3
            java.lang.String r3 = "Invalid occurrences: %s"
            com.google.common.base.C7397x.m35672a(r2, r3, r0)
        L_0x001e:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.f21304N
            java.lang.Object r0 = com.google.common.collect.C7800f4.m37346e(r0, r5)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L_0x0038
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.f21304N
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L_0x0038
            return r1
        L_0x0038:
            int r2 = r0.get()
            if (r2 == 0) goto L_0x0068
            int r3 = p076c.p112d.p148d.p278e.C6602d.m31376b(r2, r6)     // Catch:{ ArithmeticException -> 0x0049 }
            boolean r3 = r0.compareAndSet(r2, r3)     // Catch:{ ArithmeticException -> 0x0049 }
            if (r3 == 0) goto L_0x0038
            return r2
        L_0x0049:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Overflow adding "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " occurrences to a count of "
            r0.append(r6)
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L_0x0068:
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.f21304N
            java.lang.Object r3 = r3.putIfAbsent(r5, r2)
            if (r3 == 0) goto L_0x007d
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.f21304N
            boolean r0 = r3.replace(r5, r0, r2)
            if (r0 == 0) goto L_0x001e
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C7697e0.mo29893b(java.lang.Object, int):int");
    }

    @C2775a
    /* renamed from: a */
    public static <E> C7697e0<E> m36723a(C7660d4 d4Var) {
        return new C7697e0<>(d4Var.mo29954c());
    }

    /* renamed from: a */
    public int mo29818a(@C5952h Object obj, int i) {
        int i2;
        int max;
        if (i == 0) {
            return mo29708b(obj);
        }
        C7397x.m35672a(i > 0, "Invalid occurrences: %s", Integer.valueOf(i));
        AtomicInteger atomicInteger = (AtomicInteger) C7800f4.m37346e(this.f21304N, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 == 0) {
                return 0;
            }
            max = Math.max(0, i2 - i);
        } while (!atomicInteger.compareAndSet(i2, max));
        if (max == 0) {
            this.f21304N.remove(obj, atomicInteger);
        }
        return i2;
    }

    /* renamed from: a */
    public boolean mo29892a(E e, int i, int i2) {
        C7397x.m35664a(e);
        C8277y.m39484a(i, "oldCount");
        C8277y.m39484a(i2, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) C7800f4.m37346e(this.f21304N, e);
        boolean z = false;
        if (atomicInteger != null) {
            int i3 = atomicInteger.get();
            if (i3 == i) {
                if (i3 == 0) {
                    if (i2 == 0) {
                        this.f21304N.remove(e, atomicInteger);
                        return true;
                    }
                    AtomicInteger atomicInteger2 = new AtomicInteger(i2);
                    if (this.f21304N.putIfAbsent(e, atomicInteger2) == null || this.f21304N.replace(e, atomicInteger, atomicInteger2)) {
                        z = true;
                    }
                    return z;
                } else if (atomicInteger.compareAndSet(i3, i2)) {
                    if (i2 == 0) {
                        this.f21304N.remove(e, atomicInteger);
                    }
                    return true;
                }
            }
            return false;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 == 0) {
                return true;
            }
            if (this.f21304N.putIfAbsent(e, new AtomicInteger(i2)) == null) {
                z = true;
            }
            return z;
        }
    }
}
