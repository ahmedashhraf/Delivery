package com.google.common.collect;

import com.google.common.base.C5827t;
import java.util.Collection;
import java.util.Iterator;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.l1 */
/* compiled from: ForwardingCollection */
public abstract class C7997l1<E> extends C8301z1 implements Collection<E> {
    protected C7997l1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo30758A() {
        return !iterator().hasNext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public Object[] mo30759C() {
        return toArray(new Object[size()]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public String mo30760D() {
        return C8292z.m39595b((Collection<?>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo30761a(Collection<? extends E> collection) {
        return C8178t3.m39106a((Collection<T>) this, collection.iterator());
    }

    public boolean add(E e) {
        return mo26777y().add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return mo26777y().addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo30763b(Collection<?> collection) {
        return C8292z.m39593a((Collection<?>) this, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo29681c(Collection<?> collection) {
        return C8178t3.m39109a(iterator(), collection);
    }

    public void clear() {
        mo26777y().clear();
    }

    public boolean contains(Object obj) {
        return mo26777y().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return mo26777y().containsAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo30764d(Collection<?> collection) {
        return C8178t3.m39116b(iterator(), collection);
    }

    public boolean isEmpty() {
        return mo26777y().isEmpty();
    }

    public Iterator<E> iterator() {
        return mo26777y().iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo30333l(@C5952h Object obj) {
        return C8178t3.m39108a(iterator(), obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo30335m(@C5952h Object obj) {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (C5827t.m25562a(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean remove(Object obj) {
        return mo26777y().remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return mo26777y().removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return mo26777y().retainAll(collection);
    }

    public int size() {
        return mo26777y().size();
    }

    public Object[] toArray() {
        return mo26777y().toArray();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract Collection<E> m38286y();

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo30767z() {
        C8178t3.m39123c(iterator());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T> T[] mo30762a(T[] tArr) {
        return C8109q4.m38831a((Collection<?>) this, tArr);
    }

    public <T> T[] toArray(T[] tArr) {
        return mo26777y().toArray(tArr);
    }
}
