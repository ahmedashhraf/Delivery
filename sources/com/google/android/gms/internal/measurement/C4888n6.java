package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.n6 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4888n6 extends C4995t6 {

    /* renamed from: b */
    private final /* synthetic */ C4875m6 f14288b;

    private C4888n6(C4875m6 m6Var) {
        this.f14288b = m6Var;
        super(m6Var, null);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new C4901o6(this.f14288b, null);
    }

    /* synthetic */ C4888n6(C4875m6 m6Var, C4862l6 l6Var) {
        this(m6Var);
    }
}
