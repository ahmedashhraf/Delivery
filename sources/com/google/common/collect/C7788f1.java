package com.google.common.collect;

import com.google.common.base.C5831y;
import com.google.common.base.C7397x;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.f1 */
/* compiled from: FilteredKeyMultimap */
class C7788f1<K, V> extends C7874h<K, V> implements C7880h1<K, V> {

    /* renamed from: Q */
    final C7886h4<K, V> f21483Q;

    /* renamed from: R */
    final C5831y<? super K> f21484R;

    /* renamed from: com.google.common.collect.f1$a */
    /* compiled from: FilteredKeyMultimap */
    static class C7789a<K, V> extends C8141s1<V> {

        /* renamed from: a */
        final K f21485a;

        C7789a(K k) {
            this.f21485a = k;
        }

        public boolean add(V v) {
            add(0, v);
            return true;
        }

        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        public void add(int i, V v) {
            C7397x.m35673b(i, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("Key does not satisfy predicate: ");
            sb.append(this.f21485a);
            throw new IllegalArgumentException(sb.toString());
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            C7397x.m35664a(collection);
            C7397x.m35673b(i, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("Key does not satisfy predicate: ");
            sb.append(this.f21485a);
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public List<V> m37221y() {
            return Collections.emptyList();
        }
    }

    /* renamed from: com.google.common.collect.f1$b */
    /* compiled from: FilteredKeyMultimap */
    static class C7790b<K, V> extends C7555b2<V> {

        /* renamed from: a */
        final K f21486a;

        C7790b(K k) {
            this.f21486a = k;
        }

        public boolean add(V v) {
            StringBuilder sb = new StringBuilder();
            sb.append("Key does not satisfy predicate: ");
            sb.append(this.f21486a);
            throw new IllegalArgumentException(sb.toString());
        }

        public boolean addAll(Collection<? extends V> collection) {
            C7397x.m35664a(collection);
            StringBuilder sb = new StringBuilder();
            sb.append("Key does not satisfy predicate: ");
            sb.append(this.f21486a);
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Set<V> m37224y() {
            return Collections.emptySet();
        }
    }

    /* renamed from: com.google.common.collect.f1$c */
    /* compiled from: FilteredKeyMultimap */
    class C7791c extends C7997l1<Entry<K, V>> {
        C7791c() {
        }

        public boolean remove(@C5952h Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                if (C7788f1.this.f21483Q.containsKey(entry.getKey()) && C7788f1.this.f21484R.apply(entry.getKey())) {
                    return C7788f1.this.f21483Q.remove(entry.getKey(), entry.getValue());
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Collection<Entry<K, V>> m37226y() {
            return C8292z.m39590a(C7788f1.this.f21483Q.mo29704m(), C7788f1.this.mo29811p());
        }
    }

    C7788f1(C7886h4<K, V> h4Var, C5831y<? super K> yVar) {
        this.f21483Q = (C7886h4) C7397x.m35664a(h4Var);
        this.f21484R = (C5831y) C7397x.m35664a(yVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<K, Collection<V>> mo29800a() {
        return C7800f4.m37322b(this.f21483Q.mo29703j(), this.f21484R);
    }

    public void clear() {
        keySet().clear();
    }

    public boolean containsKey(@C5952h Object obj) {
        if (this.f21483Q.containsKey(obj)) {
            return this.f21484R.apply(obj);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Collection<Entry<K, V>> mo29804d() {
        return new C7791c();
    }

    /* renamed from: e */
    public Collection<V> mo29699e(Object obj) {
        return containsKey(obj) ? this.f21483Q.mo29699e(obj) : mo30326k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C7982k4<K> mo29805f() {
        return C8003l4.m38356a(this.f21483Q.mo29889n(), this.f21484R);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Collection<V> mo29806g() {
        return new C7897i1(this);
    }

    public Collection<V> get(K k) {
        if (this.f21484R.apply(k)) {
            return this.f21483Q.get(k);
        }
        if (this.f21483Q instanceof C8022l5) {
            return new C7790b(k);
        }
        return new C7789a(k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Iterator<Entry<K, V>> mo29807h() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public Collection<V> mo30326k() {
        if (this.f21483Q instanceof C8022l5) {
            return C7859g3.m37512m();
        }
        return C8257x2.m39412m();
    }

    /* renamed from: o */
    public C7886h4<K, V> mo29810o() {
        return this.f21483Q;
    }

    /* renamed from: p */
    public C5831y<? super Entry<K, V>> mo29811p() {
        return C7800f4.m37276a(this.f21484R);
    }

    public int size() {
        int i = 0;
        for (Collection size : mo29703j().values()) {
            i += size.size();
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Set<K> mo30001e() {
        return C8047m5.m38515a(this.f21483Q.keySet(), this.f21484R);
    }
}
