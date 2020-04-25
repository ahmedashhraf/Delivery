package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.t6 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
class C4995t6 extends AbstractSet<Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ C4875m6 f14414a;

    private C4995t6(C4875m6 m6Var) {
        this.f14414a = m6Var;
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f14414a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f14414a.clear();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f14414a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public Iterator<Entry<K, V>> iterator() {
        return new C5009u6(this.f14414a, null);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f14414a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f14414a.size();
    }

    /* synthetic */ C4995t6(C4875m6 m6Var, C4862l6 l6Var) {
        this(m6Var);
    }
}
