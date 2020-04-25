package com.google.common.collect;

import com.google.common.base.C5827t;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.w1 */
/* compiled from: ForwardingMapEntry */
public abstract class C8244w1<K, V> extends C8301z1 implements Entry<K, V> {
    protected C8244w1() {
    }

    /* access modifiers changed from: protected */
    @C2775a
    /* renamed from: A */
    public String mo31177A() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append("=");
        sb.append(getValue());
        return sb.toString();
    }

    public boolean equals(@C5952h Object obj) {
        return mo26777y().equals(obj);
    }

    public K getKey() {
        return mo26777y().getKey();
    }

    public V getValue() {
        return mo26777y().getValue();
    }

    public int hashCode() {
        return mo26777y().hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo31180l(@C5952h Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (!C5827t.m25562a(getKey(), entry.getKey()) || !C5827t.m25562a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public V setValue(V v) {
        return mo26777y().setValue(v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract Entry<K, V> m39338y();

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo31181z() {
        int i;
        Object key = getKey();
        Object value = getValue();
        int i2 = 0;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }
}
