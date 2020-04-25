package p195e.p196a.p199x0.p200j;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p195e.p196a.p449w0.C12339o;

/* renamed from: e.a.x0.j.w */
/* compiled from: SorterFunction */
public final class C13770w<T> implements C12339o<List<T>, List<T>> {

    /* renamed from: a */
    final Comparator<? super T> f39819a;

    public C13770w(Comparator<? super T> comparator) {
        this.f39819a = comparator;
    }

    /* renamed from: a */
    public List<T> apply(List<T> list) throws Exception {
        Collections.sort(list, this.f39819a);
        return list;
    }
}
