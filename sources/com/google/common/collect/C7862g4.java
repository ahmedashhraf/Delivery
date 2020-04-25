package com.google.common.collect;

import com.google.common.base.C7397x;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2778d;
import p076c.p112d.p148d.p278e.C6602d;

@C2775a
/* renamed from: com.google.common.collect.g4 */
/* compiled from: MinMaxPriorityQueue */
public final class C7862g4<E> extends AbstractQueue<E> {

    /* renamed from: R */
    private static final int f21569R = 1431655765;

    /* renamed from: S */
    private static final int f21570S = -1431655766;

    /* renamed from: T */
    private static final int f21571T = 11;
    @C2778d

    /* renamed from: N */
    final int f21572N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public Object[] f21573O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public int f21574P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public int f21575Q;

    /* renamed from: a */
    private final C7865c f21576a;

    /* renamed from: b */
    private final C7865c f21577b;

    @C2775a
    /* renamed from: com.google.common.collect.g4$b */
    /* compiled from: MinMaxPriorityQueue */
    public static final class C7864b<B> {

        /* renamed from: d */
        private static final int f21578d = -1;

        /* renamed from: a */
        private final Comparator<B> f21579a;

        /* renamed from: b */
        private int f21580b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f21581c;

        private C7864b(Comparator<B> comparator) {
            this.f21580b = -1;
            this.f21581c = Integer.MAX_VALUE;
            this.f21579a = (Comparator) C7397x.m35664a(comparator);
        }

        /* renamed from: a */
        public C7864b<B> mo30492a(int i) {
            C7397x.m35670a(i >= 0);
            this.f21580b = i;
            return this;
        }

        /* renamed from: b */
        public C7864b<B> mo30495b(int i) {
            C7397x.m35670a(i > 0);
            this.f21581c = i;
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public <T extends B> C8133r4<T> m37548b() {
            return C8133r4.m38939b(this.f21579a);
        }

        /* renamed from: a */
        public <T extends B> C7862g4<T> mo30493a() {
            return mo30494a((Iterable<? extends T>) Collections.emptySet());
        }

        /* renamed from: a */
        public <T extends B> C7862g4<T> mo30494a(Iterable<? extends T> iterable) {
            C7862g4<T> g4Var = new C7862g4<>(this, C7862g4.m37526a(this.f21580b, this.f21581c, iterable));
            for (Object offer : iterable) {
                g4Var.offer(offer);
            }
            return g4Var;
        }
    }

    /* renamed from: com.google.common.collect.g4$c */
    /* compiled from: MinMaxPriorityQueue */
    private class C7865c {

        /* renamed from: a */
        final C8133r4<E> f21582a;

        /* renamed from: b */
        C7865c f21583b;

        C7865c(C8133r4<E> r4Var) {
            this.f21582a = r4Var;
        }

        /* renamed from: e */
        private int m37555e(int i) {
            return (i * 2) + 1;
        }

        /* renamed from: f */
        private int m37556f(int i) {
            return (i - 1) / 2;
        }

        /* renamed from: g */
        private int m37557g(int i) {
            return (i * 2) + 2;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public boolean m37558h(int i) {
            if (m37555e(i) < C7862g4.this.f21574P && mo30497a(i, m37555e(i)) > 0) {
                return false;
            }
            if (m37557g(i) < C7862g4.this.f21574P && mo30497a(i, m37557g(i)) > 0) {
                return false;
            }
            if (i > 0 && mo30497a(i, m37556f(i)) > 0) {
                return false;
            }
            if (i <= 2 || mo30497a(m37554d(i), i) <= 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo30503b(int i, E e) {
            while (i > 2) {
                int d = m37554d(i);
                Object b = C7862g4.this.mo30475b(d);
                if (this.f21582a.compare(b, e) <= 0) {
                    break;
                }
                C7862g4.this.f21573O[i] = b;
                i = d;
            }
            C7862g4.this.f21573O[i] = e;
            return i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo30504c(int i) {
            int e = m37555e(i);
            if (e < 0) {
                return -1;
            }
            return mo30502b(m37555e(e), 4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo30506d(int i, E e) {
            if (i == 0) {
                C7862g4.this.f21573O[0] = e;
                return 0;
            }
            int f = m37556f(i);
            Object b = C7862g4.this.mo30475b(f);
            if (f != 0) {
                int g = m37557g(m37556f(f));
                if (g != f && m37555e(g) >= C7862g4.this.f21574P) {
                    Object b2 = C7862g4.this.mo30475b(g);
                    if (this.f21582a.compare(b2, b) < 0) {
                        f = g;
                        b = b2;
                    }
                }
            }
            if (this.f21582a.compare(b, e) < 0) {
                C7862g4.this.f21573O[i] = b;
                C7862g4.this.f21573O[f] = e;
                return f;
            }
            C7862g4.this.f21573O[i] = e;
            return i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo30497a(int i, int i2) {
            return this.f21582a.compare(C7862g4.this.mo30475b(i), C7862g4.this.mo30475b(i2));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C7866d<E> mo30499a(int i, int i2, E e) {
            Object obj;
            int c = mo30505c(i2, e);
            if (c == i2) {
                return null;
            }
            if (c < i) {
                obj = C7862g4.this.mo30475b(i);
            } else {
                obj = C7862g4.this.mo30475b(m37556f(i));
            }
            if (this.f21583b.mo30503b(c, e) < i) {
                return new C7866d<>(e, obj);
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo30505c(int i, E e) {
            int b = mo30501b(i);
            if (b <= 0 || this.f21582a.compare(C7862g4.this.mo30475b(b), e) >= 0) {
                return mo30506d(i, e);
            }
            C7862g4.this.f21573O[i] = C7862g4.this.mo30475b(b);
            C7862g4.this.f21573O[b] = e;
            return b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo30502b(int i, int i2) {
            if (i >= C7862g4.this.f21574P) {
                return -1;
            }
            C7397x.m35676b(i > 0);
            int min = Math.min(i, C7862g4.this.f21574P - i2) + i2;
            for (int i3 = i + 1; i3 < min; i3++) {
                if (mo30497a(i3, i) < 0) {
                    i = i3;
                }
            }
            return i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30500a(int i, E e) {
            C7865c cVar;
            int d = mo30506d(i, e);
            if (d == i) {
                d = i;
                cVar = this;
            } else {
                cVar = this.f21583b;
            }
            cVar.mo30503b(d, e);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo30501b(int i) {
            return mo30502b(m37555e(i), 2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo30498a(E e) {
            int f = m37556f(C7862g4.this.f21574P);
            if (f != 0) {
                int g = m37557g(m37556f(f));
                if (g != f && m37555e(g) >= C7862g4.this.f21574P) {
                    Object b = C7862g4.this.mo30475b(g);
                    if (this.f21582a.compare(b, e) < 0) {
                        C7862g4.this.f21573O[g] = e;
                        C7862g4.this.f21573O[C7862g4.this.f21574P] = b;
                        return g;
                    }
                }
            }
            return C7862g4.this.f21574P;
        }

        /* renamed from: d */
        private int m37554d(int i) {
            return m37556f(m37556f(i));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo30496a(int i) {
            while (true) {
                int c = mo30504c(i);
                if (c <= 0) {
                    return i;
                }
                C7862g4.this.f21573O[i] = C7862g4.this.mo30475b(c);
                i = c;
            }
        }
    }

    /* renamed from: com.google.common.collect.g4$d */
    /* compiled from: MinMaxPriorityQueue */
    static class C7866d<E> {

        /* renamed from: a */
        final E f21585a;

        /* renamed from: b */
        final E f21586b;

        C7866d(E e, E e2) {
            this.f21585a = e;
            this.f21586b = e2;
        }
    }

    /* renamed from: com.google.common.collect.g4$e */
    /* compiled from: MinMaxPriorityQueue */
    private class C7867e implements Iterator<E> {

        /* renamed from: N */
        private Queue<E> f21587N;

        /* renamed from: O */
        private List<E> f21588O;

        /* renamed from: P */
        private E f21589P;

        /* renamed from: Q */
        private boolean f21590Q;

        /* renamed from: a */
        private int f21592a;

        /* renamed from: b */
        private int f21593b;

        private C7867e() {
            this.f21592a = -1;
            this.f21593b = C7862g4.this.f21575Q;
        }

        /* renamed from: a */
        private boolean m37571a(Iterable<E> iterable, E e) {
            for (E e2 : iterable) {
                if (e2 == e) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30508b() {
            if (C7862g4.this.f21575Q != this.f21593b) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasNext() {
            mo30508b();
            if (m37570a(this.f21592a + 1) < C7862g4.this.size()) {
                return true;
            }
            Queue<E> queue = this.f21587N;
            return queue != null && !queue.isEmpty();
        }

        public E next() {
            mo30508b();
            int a = m37570a(this.f21592a + 1);
            if (a < C7862g4.this.size()) {
                this.f21592a = a;
                this.f21590Q = true;
                return C7862g4.this.mo30475b(this.f21592a);
            }
            if (this.f21587N != null) {
                this.f21592a = C7862g4.this.size();
                this.f21589P = this.f21587N.poll();
                E e = this.f21589P;
                if (e != null) {
                    this.f21590Q = true;
                    return e;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        public void remove() {
            C8277y.m39486a(this.f21590Q);
            mo30508b();
            this.f21590Q = false;
            this.f21593b++;
            if (this.f21592a < C7862g4.this.size()) {
                C7866d c = C7862g4.this.mo30476c(this.f21592a);
                if (c != null) {
                    if (this.f21587N == null) {
                        this.f21587N = new LinkedList();
                        this.f21588O = new ArrayList(3);
                    }
                    this.f21587N.add(c.f21585a);
                    this.f21588O.add(c.f21586b);
                }
                this.f21592a--;
                return;
            }
            C7397x.m35676b(mo30507a((Object) this.f21589P));
            this.f21589P = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30507a(Object obj) {
            for (int i = 0; i < C7862g4.this.f21574P; i++) {
                if (C7862g4.this.f21573O[i] == obj) {
                    C7862g4.this.mo30476c(i);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        private int m37570a(int i) {
            if (this.f21588O != null) {
                while (i < C7862g4.this.size() && m37571a(this.f21588O, C7862g4.this.mo30475b(i))) {
                    i++;
                }
            }
            return i;
        }
    }

    /* renamed from: d */
    public static C7864b<Comparable> m37533d(int i) {
        return new C7864b(C8133r4.m38943j()).mo30492a(i);
    }

    /* renamed from: e */
    private int m37534e() {
        int i;
        int length = this.f21573O.length;
        if (length < 64) {
            i = (length + 1) * 2;
        } else {
            i = C6602d.m31380c(length / 2, 3);
        }
        return m37525a(i, this.f21572N);
    }

    /* renamed from: f */
    public static <E extends Comparable<E>> C7862g4<E> m37535f() {
        return new C7864b(C8133r4.m38943j()).mo30493a();
    }

    /* renamed from: g */
    private C7865c m37536g(int i) {
        return m37537h(i) ? this.f21576a : this.f21577b;
    }

    @C2778d
    /* renamed from: h */
    static boolean m37537h(int i) {
        int i2 = i + 1;
        C7397x.m35677b(i2 > 0, (Object) "negative index");
        return (f21569R & i2) > (i2 & f21570S);
    }

    /* renamed from: i */
    public static C7864b<Comparable> m37538i(int i) {
        return new C7864b(C8133r4.m38943j()).mo30495b(i);
    }

    /* renamed from: j */
    private int m37539j() {
        int i = this.f21574P;
        int i2 = 1;
        if (i == 1) {
            return 0;
        }
        if (i != 2 && this.f21577b.mo30497a(1, 2) > 0) {
            i2 = 2;
        }
        return i2;
    }

    /* renamed from: k */
    private void m37541k() {
        if (this.f21574P > this.f21573O.length) {
            Object[] objArr = new Object[m37534e()];
            Object[] objArr2 = this.f21573O;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f21573O = objArr;
        }
    }

    public boolean add(E e) {
        offer(e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        boolean z = false;
        for (Object offer : collection) {
            offer(offer);
            z = true;
        }
        return z;
    }

    public void clear() {
        for (int i = 0; i < this.f21574P; i++) {
            this.f21573O[i] = null;
        }
        this.f21574P = 0;
    }

    public Comparator<? super E> comparator() {
        return this.f21576a.f21582a;
    }

    public Iterator<E> iterator() {
        return new C7867e();
    }

    public boolean offer(E e) {
        C7397x.m35664a(e);
        this.f21575Q++;
        int i = this.f21574P;
        this.f21574P = i + 1;
        m37541k();
        m37536g(i).mo30500a(i, e);
        if (this.f21574P <= this.f21572N || pollLast() != e) {
            return true;
        }
        return false;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return mo30475b(0);
    }

    public E peekFirst() {
        return peek();
    }

    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return mo30475b(m37539j());
    }

    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return m37540j(0);
    }

    public E pollFirst() {
        return poll();
    }

    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return m37540j(m37539j());
    }

    public E removeFirst() {
        return remove();
    }

    public E removeLast() {
        if (!isEmpty()) {
            return m37540j(m37539j());
        }
        throw new NoSuchElementException();
    }

    public int size() {
        return this.f21574P;
    }

    public Object[] toArray() {
        int i = this.f21574P;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f21573O, 0, objArr, 0, i);
        return objArr;
    }

    private C7862g4(C7864b<? super E> bVar, int i) {
        C8133r4 a = bVar.m37548b();
        this.f21576a = new C7865c<>(a);
        this.f21577b = new C7865c<>(a.mo30568g());
        C7865c cVar = this.f21576a;
        C7865c cVar2 = this.f21577b;
        cVar.f21583b = cVar2;
        cVar2.f21583b = cVar;
        this.f21572N = bVar.f21581c;
        this.f21573O = new Object[i];
    }

    /* renamed from: a */
    public static <E extends Comparable<E>> C7862g4<E> m37529a(Iterable<? extends E> iterable) {
        return new C7864b(C8133r4.m38943j()).mo30494a(iterable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public E mo30475b(int i) {
        return this.f21573O[i];
    }

    /* access modifiers changed from: 0000 */
    @C2778d
    /* renamed from: c */
    public C7866d<E> mo30476c(int i) {
        C7397x.m35673b(i, this.f21574P);
        this.f21575Q++;
        this.f21574P--;
        int i2 = this.f21574P;
        if (i2 == i) {
            this.f21573O[i2] = null;
            return null;
        }
        Object b = mo30475b(i2);
        int a = m37536g(this.f21574P).mo30498a(b);
        Object b2 = mo30475b(this.f21574P);
        this.f21573O[this.f21574P] = null;
        C7866d<E> a2 = m37528a(i, (E) b2);
        if (a >= i) {
            return a2;
        }
        if (a2 == null) {
            return new C7866d<>(b, b2);
        }
        return new C7866d<>(b, a2.f21586b);
    }

    /* renamed from: a */
    public static <B> C7864b<B> m37527a(Comparator<B> comparator) {
        return new C7864b<>(comparator);
    }

    /* renamed from: j */
    private E m37540j(int i) {
        E b = mo30475b(i);
        mo30476c(i);
        return b;
    }

    /* access modifiers changed from: 0000 */
    @C2778d
    /* renamed from: b */
    public int mo30474b() {
        return this.f21573O.length;
    }

    /* renamed from: a */
    private C7866d<E> m37528a(int i, E e) {
        C7865c g = m37536g(i);
        int a = g.mo30496a(i);
        int b = g.mo30503b(a, e);
        if (b == a) {
            return g.mo30499a(i, a, e);
        }
        return b < i ? new C7866d<>(e, mo30475b(i)) : null;
    }

    @C2778d
    /* renamed from: a */
    static int m37526a(int i, int i2, Iterable<?> iterable) {
        if (i == -1) {
            i = 11;
        }
        if (iterable instanceof Collection) {
            i = Math.max(i, ((Collection) iterable).size());
        }
        return m37525a(i, i2);
    }

    /* renamed from: a */
    private static int m37525a(int i, int i2) {
        return Math.min(i - 1, i2) + 1;
    }

    /* access modifiers changed from: 0000 */
    @C2778d
    /* renamed from: c */
    public boolean mo30477c() {
        for (int i = 1; i < this.f21574P; i++) {
            if (!m37536g(i).m37558h(i)) {
                return false;
            }
        }
        return true;
    }
}
