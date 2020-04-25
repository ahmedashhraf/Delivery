package com.google.common.collect;

import java.io.Serializable;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.u2 */
/* compiled from: ImmutableEntry */
class C8214u2<K, V> extends C7848g<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final K f22032a;

    /* renamed from: b */
    final V f22033b;

    C8214u2(@C5952h K k, @C5952h V v) {
        this.f22032a = k;
        this.f22033b = v;
    }

    @C5952h
    public final K getKey() {
        return this.f22032a;
    }

    @C5952h
    public final V getValue() {
        return this.f22033b;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
