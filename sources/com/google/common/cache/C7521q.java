package com.google.common.cache;

import com.google.common.base.C5827t;
import com.google.common.base.C7397x;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
@C2775a
/* renamed from: com.google.common.cache.q */
/* compiled from: RemovalNotification */
public final class C7521q<K, V> implements Entry<K, V> {

    /* renamed from: O */
    private static final long f21048O = 0;

    /* renamed from: N */
    private final C7511n f21049N;
    @C5952h

    /* renamed from: a */
    private final K f21050a;
    @C5952h

    /* renamed from: b */
    private final V f21051b;

    C7521q(@C5952h K k, @C5952h V v, C7511n nVar) {
        this.f21050a = k;
        this.f21051b = v;
        this.f21049N = (C7511n) C7397x.m35664a(nVar);
    }

    /* renamed from: a */
    public C7511n mo29587a() {
        return this.f21049N;
    }

    /* renamed from: b */
    public boolean mo29588b() {
        return this.f21049N.mo29585d();
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (!C5827t.m25562a(getKey(), entry.getKey()) || !C5827t.m25562a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    @C5952h
    public K getKey() {
        return this.f21050a;
    }

    @C5952h
    public V getValue() {
        return this.f21051b;
    }

    public int hashCode() {
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

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append("=");
        sb.append(getValue());
        return sb.toString();
    }
}
