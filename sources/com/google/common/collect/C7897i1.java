package com.google.common.collect;

import com.google.common.base.C5827t;
import com.google.common.base.C5831y;
import com.google.common.base.C7397x;
import com.google.common.base.C7398z;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.i1 */
/* compiled from: FilteredMultimapValues */
final class C7897i1<K, V> extends AbstractCollection<V> {

    /* renamed from: a */
    private final C7880h1<K, V> f21629a;

    C7897i1(C7880h1<K, V> h1Var) {
        this.f21629a = (C7880h1) C7397x.m35664a(h1Var);
    }

    public void clear() {
        this.f21629a.clear();
    }

    public boolean contains(@C5952h Object obj) {
        return this.f21629a.containsValue(obj);
    }

    public Iterator<V> iterator() {
        return C7800f4.m37319b(this.f21629a.mo29704m().iterator());
    }

    public boolean remove(@C5952h Object obj) {
        C5831y p = this.f21629a.mo29811p();
        Iterator it = this.f21629a.mo29810o().mo29704m().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (p.apply(entry) && C5827t.m25562a(entry.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean removeAll(Collection<?> collection) {
        return C8145s3.m39043g(this.f21629a.mo29810o().mo29704m(), C7398z.m35684a(this.f21629a.mo29811p(), C7800f4.m37311b(C7398z.m35689a(collection))));
    }

    public boolean retainAll(Collection<?> collection) {
        return C8145s3.m39043g(this.f21629a.mo29810o().mo29704m(), C7398z.m35684a(this.f21629a.mo29811p(), C7800f4.m37311b(C7398z.m35682a(C7398z.m35689a(collection)))));
    }

    public int size() {
        return this.f21629a.size();
    }
}
