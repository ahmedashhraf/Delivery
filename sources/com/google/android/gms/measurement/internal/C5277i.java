package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.i */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5277i implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f15112a = this.f15113b.f15683a.keySet().iterator();

    /* renamed from: b */
    private final /* synthetic */ zzaf f15113b;

    C5277i(zzaf zzaf) {
        this.f15113b = zzaf;
    }

    public final boolean hasNext() {
        return this.f15112a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f15112a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
