package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.t4 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4993t4<K> implements Entry<K, Object> {

    /* renamed from: a */
    private Entry<K, C4944r4> f14413a;

    private C4993t4(Entry<K, C4944r4> entry) {
        this.f14413a = entry;
    }

    /* renamed from: a */
    public final C4944r4 mo19689a() {
        return (C4944r4) this.f14413a.getValue();
    }

    public final K getKey() {
        return this.f14413a.getKey();
    }

    public final Object getValue() {
        if (((C4944r4) this.f14413a.getValue()) == null) {
            return null;
        }
        return C4944r4.m21082c();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C4945r5) {
            return ((C4944r4) this.f14413a.getValue()).mo19721a((C4945r5) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
