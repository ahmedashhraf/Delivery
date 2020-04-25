package com.google.common.cache;

import com.google.common.collect.C7800f4;
import com.google.common.collect.C8302z2;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.cache.b */
/* compiled from: AbstractLoadingCache */
public abstract class C7423b<K, V> extends C7420a<K, V> implements C7446i<K, V> {
    protected C7423b() {
    }

    /* renamed from: a */
    public C8302z2<K, V> mo29333a(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap e = C7800f4.m37347e();
        for (Object next : iterable) {
            if (!e.containsKey(next)) {
                e.put(next, get(next));
            }
        }
        return C8302z2.m39622a(e);
    }

    public final V apply(K k) {
        return mo29334c(k);
    }

    /* renamed from: c */
    public V mo29334c(K k) {
        try {
            return get(k);
        } catch (ExecutionException e) {
            throw new UncheckedExecutionException(e.getCause());
        }
    }

    /* renamed from: d */
    public void mo29335d(K k) {
        throw new UnsupportedOperationException();
    }
}
