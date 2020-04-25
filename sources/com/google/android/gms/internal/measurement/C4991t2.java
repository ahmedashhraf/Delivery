package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.t2 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
abstract class C4991t2<E> extends AbstractList<E> implements C4912p4<E> {

    /* renamed from: a */
    private boolean f14409a = true;

    C4991t2() {
    }

    /* renamed from: a */
    public boolean mo19360a() {
        return this.f14409a;
    }

    public boolean add(E e) {
        mo19681b();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo19681b();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo19681b() {
        if (!this.f14409a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo19681b();
        super.clear();
    }

    /* renamed from: d */
    public final void mo19361d() {
        this.f14409a = false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public E remove(int i) {
        mo19681b();
        return super.remove(i);
    }

    public boolean removeAll(Collection<?> collection) {
        mo19681b();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo19681b();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo19681b();
        return super.set(i, e);
    }

    public void add(int i, E e) {
        mo19681b();
        super.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo19681b();
        return super.addAll(i, collection);
    }

    public boolean remove(Object obj) {
        mo19681b();
        return super.remove(obj);
    }
}
