package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.g7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4777g7 implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f14146a = this.f14147b.f14044a.iterator();

    /* renamed from: b */
    private final /* synthetic */ C4727d7 f14147b;

    C4777g7(C4727d7 d7Var) {
        this.f14147b = d7Var;
    }

    public final boolean hasNext() {
        return this.f14146a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f14146a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
