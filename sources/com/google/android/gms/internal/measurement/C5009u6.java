package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.u6 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C5009u6 implements Iterator<Entry<K, V>> {

    /* renamed from: N */
    private Iterator<Entry<K, V>> f14447N;

    /* renamed from: O */
    private final /* synthetic */ C4875m6 f14448O;

    /* renamed from: a */
    private int f14449a;

    /* renamed from: b */
    private boolean f14450b;

    private C5009u6(C4875m6 m6Var) {
        this.f14448O = m6Var;
        this.f14449a = -1;
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m21606a() {
        if (this.f14447N == null) {
            this.f14447N = this.f14448O.f14268N.entrySet().iterator();
        }
        return this.f14447N;
    }

    public final boolean hasNext() {
        if (this.f14449a + 1 < this.f14448O.f14274b.size() || (!this.f14448O.f14268N.isEmpty() && m21606a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f14450b = true;
        int i = this.f14449a + 1;
        this.f14449a = i;
        if (i < this.f14448O.f14274b.size()) {
            return (Entry) this.f14448O.f14274b.get(this.f14449a);
        }
        return (Entry) m21606a().next();
    }

    public final void remove() {
        if (this.f14450b) {
            this.f14450b = false;
            this.f14448O.m20689f();
            if (this.f14449a < this.f14448O.f14274b.size()) {
                C4875m6 m6Var = this.f14448O;
                int i = this.f14449a;
                this.f14449a = i - 1;
                m6Var.m20686c(i);
                return;
            }
            m21606a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* synthetic */ C5009u6(C4875m6 m6Var, C4862l6 l6Var) {
        this(m6Var);
    }
}
