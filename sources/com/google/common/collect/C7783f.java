package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C7982k4.C7983a;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p076c.p112d.p148d.p150g.C6637f;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.f */
/* compiled from: AbstractMapBasedMultiset */
abstract class C7783f<E> extends C7893i<E> implements Serializable {
    @C2777c("not needed in emulated source.")
    private static final long serialVersionUID = -2250766705698539974L;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public transient Map<E, C7896i0> f21471N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public transient long f21472O = ((long) super.size());

    /* renamed from: com.google.common.collect.f$a */
    /* compiled from: AbstractMapBasedMultiset */
    class C7784a implements Iterator<C7983a<E>> {

        /* renamed from: a */
        Entry<E, C7896i0> f21474a;

        /* renamed from: b */
        final /* synthetic */ Iterator f21475b;

        /* renamed from: com.google.common.collect.f$a$a */
        /* compiled from: AbstractMapBasedMultiset */
        class C7785a extends C8013f<E> {

            /* renamed from: a */
            final /* synthetic */ Entry f21476a;

            C7785a(Entry entry) {
                this.f21476a = entry;
            }

            public int getCount() {
                int i;
                C7896i0 i0Var = (C7896i0) this.f21476a.getValue();
                if (i0Var == null || i0Var.mo30587a() == 0) {
                    C7896i0 i0Var2 = (C7896i0) C7783f.this.f21471N.get(getElement());
                    if (i0Var2 != null) {
                        return i0Var2.mo30587a();
                    }
                }
                if (i0Var == null) {
                    i = 0;
                } else {
                    i = i0Var.mo30587a();
                }
                return i;
            }

            public E getElement() {
                return this.f21476a.getKey();
            }
        }

        C7784a(Iterator it) {
            this.f21475b = it;
        }

        public boolean hasNext() {
            return this.f21475b.hasNext();
        }

        public void remove() {
            C8277y.m39486a(this.f21474a != null);
            C7783f.m37197a(C7783f.this, (long) ((C7896i0) this.f21474a.getValue()).mo30590c(0));
            this.f21475b.remove();
            this.f21474a = null;
        }

        public C7983a<E> next() {
            Entry<E, C7896i0> entry = (Entry) this.f21475b.next();
            this.f21474a = entry;
            return new C7785a(entry);
        }
    }

    /* renamed from: com.google.common.collect.f$b */
    /* compiled from: AbstractMapBasedMultiset */
    private class C7786b implements Iterator<E> {

        /* renamed from: N */
        int f21478N;

        /* renamed from: O */
        boolean f21479O;

        /* renamed from: a */
        final Iterator<Entry<E, C7896i0>> f21481a;

        /* renamed from: b */
        Entry<E, C7896i0> f21482b;

        C7786b() {
            this.f21481a = C7783f.this.f21471N.entrySet().iterator();
        }

        public boolean hasNext() {
            return this.f21478N > 0 || this.f21481a.hasNext();
        }

        public E next() {
            if (this.f21478N == 0) {
                this.f21482b = (Entry) this.f21481a.next();
                this.f21478N = ((C7896i0) this.f21482b.getValue()).mo30587a();
            }
            this.f21478N--;
            this.f21479O = true;
            return this.f21482b.getKey();
        }

        public void remove() {
            C8277y.m39486a(this.f21479O);
            if (((C7896i0) this.f21482b.getValue()).mo30587a() > 0) {
                if (((C7896i0) this.f21482b.getValue()).mo30588a(-1) == 0) {
                    this.f21481a.remove();
                }
                C7783f.this.f21472O = C7783f.this.f21472O - 1;
                this.f21479O = false;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    protected C7783f(Map<E, C7896i0> map) {
        this.f21471N = (Map) C7397x.m35664a(map);
    }

    @C2777c("java.io.ObjectStreamException")
    /* renamed from: l */
    private void m37200l() throws ObjectStreamException {
        throw new InvalidObjectException("Stream data required");
    }

    /* renamed from: c */
    public int mo29894c(@C5952h E e, int i) {
        int i2;
        C8277y.m39484a(i, "count");
        if (i == 0) {
            i2 = m37196a((C7896i0) this.f21471N.remove(e), i);
        } else {
            C7896i0 i0Var = (C7896i0) this.f21471N.get(e);
            int a = m37196a(i0Var, i);
            if (i0Var == null) {
                this.f21471N.put(e, new C7896i0(i));
            }
            i2 = a;
        }
        this.f21472O += (long) (i - i2);
        return i2;
    }

    public void clear() {
        for (C7896i0 d : this.f21471N.values()) {
            d.mo30591d(0);
        }
        this.f21471N.clear();
        this.f21472O = 0;
    }

    public Set<C7983a<E>> entrySet() {
        return super.entrySet();
    }

    public Iterator<E> iterator() {
        return new C7786b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo30100j() {
        return this.f21471N.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public Iterator<C7983a<E>> mo30101k() {
        return new C7784a(this.f21471N.entrySet().iterator());
    }

    public int size() {
        return C6637f.m31672b(this.f21472O);
    }

    /* renamed from: a */
    static /* synthetic */ long m37197a(C7783f fVar, long j) {
        long j2 = fVar.f21472O - j;
        fVar.f21472O = j2;
        return j2;
    }

    /* renamed from: b */
    public int mo29708b(@C5952h Object obj) {
        C7896i0 i0Var = (C7896i0) C7800f4.m37346e(this.f21471N, obj);
        if (i0Var == null) {
            return 0;
        }
        return i0Var.mo30587a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30316a(Map<E, C7896i0> map) {
        this.f21471N = map;
    }

    /* renamed from: a */
    public int mo29818a(@C5952h Object obj, int i) {
        if (i == 0) {
            return mo29708b(obj);
        }
        C7397x.m35672a(i > 0, "occurrences cannot be negative: %s", Integer.valueOf(i));
        C7896i0 i0Var = (C7896i0) this.f21471N.get(obj);
        if (i0Var == null) {
            return 0;
        }
        int a = i0Var.mo30587a();
        if (a <= i) {
            this.f21471N.remove(obj);
            i = a;
        }
        i0Var.mo30588a(-i);
        this.f21472O -= (long) i;
        return a;
    }

    /* renamed from: b */
    public int mo29893b(@C5952h E e, int i) {
        int i2;
        if (i == 0) {
            return mo29708b((Object) e);
        }
        C7397x.m35672a(i > 0, "occurrences cannot be negative: %s", Integer.valueOf(i));
        C7896i0 i0Var = (C7896i0) this.f21471N.get(e);
        if (i0Var == null) {
            this.f21471N.put(e, new C7896i0(i));
            i2 = 0;
        } else {
            i2 = i0Var.mo30587a();
            long j = ((long) i2) + ((long) i);
            C7397x.m35672a(j <= 2147483647L, "too many occurrences: %s", Long.valueOf(j));
            i0Var.mo30589b(i);
        }
        this.f21472O += (long) i;
        return i2;
    }

    /* renamed from: a */
    private static int m37196a(C7896i0 i0Var, int i) {
        if (i0Var == null) {
            return 0;
        }
        return i0Var.mo30590c(i);
    }
}
