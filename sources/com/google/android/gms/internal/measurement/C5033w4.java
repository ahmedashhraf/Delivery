package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.w4 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C5033w4<K> implements Iterator<Entry<K, Object>> {

    /* renamed from: a */
    private Iterator<Entry<K, Object>> f14491a;

    public C5033w4(Iterator<Entry<K, Object>> it) {
        this.f14491a = it;
    }

    public final boolean hasNext() {
        return this.f14491a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f14491a.next();
        return entry.getValue() instanceof C4944r4 ? new C4993t4(entry) : entry;
    }

    public final void remove() {
        this.f14491a.remove();
    }
}
