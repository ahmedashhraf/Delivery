package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C8257x2.C8259b;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p278e.C6602d;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.w */
/* compiled from: CartesianList */
final class C8241w<E> extends AbstractList<List<E>> implements RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final transient C8257x2<List<E>> f22079a;

    /* renamed from: b */
    private final transient int[] f22080b;

    /* renamed from: com.google.common.collect.w$a */
    /* compiled from: CartesianList */
    class C8242a extends C8257x2<E> {

        /* renamed from: N */
        final /* synthetic */ int f22081N;

        C8242a(int i) {
            this.f22081N = i;
        }

        public E get(int i) {
            C7397x.m35663a(i, size());
            return ((List) C8241w.this.f22079a.get(i)).get(C8241w.this.m39323a(this.f22081N, i));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public boolean mo29686j() {
            return true;
        }

        public int size() {
            return C8241w.this.f22079a.size();
        }
    }

    C8241w(C8257x2<List<E>> x2Var) {
        this.f22079a = x2Var;
        int[] iArr = new int[(x2Var.size() + 1)];
        iArr[x2Var.size()] = 1;
        try {
            for (int size = x2Var.size() - 1; size >= 0; size--) {
                iArr[size] = C6602d.m31380c(iArr[size + 1], ((List) x2Var.get(size)).size());
            }
            this.f22080b = iArr;
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
    }

    public boolean contains(@C5952h Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (list.size() != this.f22079a.size()) {
            return false;
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (!((List) this.f22079a.get(listIterator.nextIndex())).contains(listIterator.next())) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return this.f22080b[0];
    }

    public C8257x2<E> get(int i) {
        C7397x.m35663a(i, size());
        return new C8242a(i);
    }

    /* renamed from: a */
    static <E> List<List<E>> m39326a(List<? extends List<? extends E>> list) {
        C8259b bVar = new C8259b(list.size());
        for (List a : list) {
            C8257x2 a2 = C8257x2.m39405a((Collection<? extends E>) a);
            if (a2.isEmpty()) {
                return C8257x2.m39412m();
            }
            bVar.m39420a((Object) a2);
        }
        return new C8241w(bVar.mo30346a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m39323a(int i, int i2) {
        return (i / this.f22080b[i2 + 1]) % ((List) this.f22079a.get(i2)).size();
    }
}
