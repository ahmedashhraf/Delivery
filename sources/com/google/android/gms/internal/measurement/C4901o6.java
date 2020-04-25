package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.o6 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4901o6 implements Iterator<Entry<K, V>> {

    /* renamed from: N */
    private final /* synthetic */ C4875m6 f14320N;

    /* renamed from: a */
    private int f14321a;

    /* renamed from: b */
    private Iterator<Entry<K, V>> f14322b;

    private C4901o6(C4875m6 m6Var) {
        this.f14320N = m6Var;
        this.f14321a = this.f14320N.f14274b.size();
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m20902a() {
        if (this.f14322b == null) {
            this.f14322b = this.f14320N.f14271Q.entrySet().iterator();
        }
        return this.f14322b;
    }

    public final boolean hasNext() {
        int i = this.f14321a;
        return (i > 0 && i <= this.f14320N.f14274b.size()) || m20902a().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (m20902a().hasNext()) {
            return (Entry) m20902a().next();
        }
        List b = this.f14320N.f14274b;
        int i = this.f14321a - 1;
        this.f14321a = i;
        return (Entry) b.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ C4901o6(C4875m6 m6Var, C4862l6 l6Var) {
        this(m6Var);
    }
}
