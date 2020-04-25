package com.google.common.collect;

import com.google.common.base.C7397x;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.d2 */
/* compiled from: ForwardingSortedMap */
public abstract class C7655d2<K, V> extends C8220v1<K, V> implements SortedMap<K, V> {

    @C2775a
    /* renamed from: com.google.common.collect.d2$a */
    /* compiled from: ForwardingSortedMap */
    protected class C7656a extends C7845z<K, V> {
        public C7656a() {
            super(C7655d2.this);
        }
    }

    protected C7655d2() {
    }

    /* renamed from: f */
    private int m36600f(Object obj, Object obj2) {
        Comparator comparator = comparator();
        if (comparator == null) {
            return ((Comparable) obj).compareTo(obj2);
        }
        return comparator.compare(obj, obj2);
    }

    public Comparator<? super K> comparator() {
        return m36604y().comparator();
    }

    /* access modifiers changed from: protected */
    @C2775a
    /* renamed from: e */
    public SortedMap<K, V> mo29933e(K k, K k2) {
        C7397x.m35671a(m36600f(k, k2) <= 0, (Object) "fromKey must be <= toKey");
        return tailMap(k).headMap(k2);
    }

    public K firstKey() {
        return m36604y().firstKey();
    }

    public SortedMap<K, V> headMap(K k) {
        return m36604y().headMap(k);
    }

    /* access modifiers changed from: protected */
    @C2775a
    /* renamed from: l */
    public boolean mo29936l(@C5952h Object obj) {
        try {
            if (m36600f(tailMap(obj).firstKey(), obj) == 0) {
                return true;
            }
            return false;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    public K lastKey() {
        return m36604y().lastKey();
    }

    public SortedMap<K, V> subMap(K k, K k2) {
        return m36604y().subMap(k, k2);
    }

    public SortedMap<K, V> tailMap(K k) {
        return m36604y().tailMap(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract SortedMap<K, V> m36605y();
}
