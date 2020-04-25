package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.r6 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4946r6 implements Comparable<C4946r6>, Entry<K, V> {

    /* renamed from: N */
    private final /* synthetic */ C4875m6 f14385N;

    /* renamed from: a */
    private final K f14386a;

    /* renamed from: b */
    private V f14387b;

    C4946r6(C4875m6 m6Var, Entry<K, V> entry) {
        this(m6Var, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    private static boolean m21088a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C4946r6) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m21088a(this.f14386a, entry.getKey()) && m21088a(this.f14387b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f14386a;
    }

    public final V getValue() {
        return this.f14387b;
    }

    public final int hashCode() {
        K k = this.f14386a;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f14387b;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f14385N.m20689f();
        V v2 = this.f14387b;
        this.f14387b = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14386a);
        String valueOf2 = String.valueOf(this.f14387b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    C4946r6(C4875m6 m6Var, K k, V v) {
        this.f14385N = m6Var;
        this.f14386a = k;
        this.f14387b = v;
    }
}
