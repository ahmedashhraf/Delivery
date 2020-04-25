package p195e.p196a.p199x0.p200j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e.a.x0.j.y */
/* compiled from: VolatileSizeArrayList */
public final class C13771y<T> extends AtomicInteger implements List<T>, RandomAccess {
    private static final long serialVersionUID = 3972397474470203923L;

    /* renamed from: a */
    final ArrayList<T> f39820a;

    public C13771y() {
        this.f39820a = new ArrayList<>();
    }

    public boolean add(T t) {
        boolean add = this.f39820a.add(t);
        lazySet(this.f39820a.size());
        return add;
    }

    public boolean addAll(Collection<? extends T> collection) {
        boolean addAll = this.f39820a.addAll(collection);
        lazySet(this.f39820a.size());
        return addAll;
    }

    public void clear() {
        this.f39820a.clear();
        lazySet(0);
    }

    public boolean contains(Object obj) {
        return this.f39820a.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f39820a.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C13771y) {
            return this.f39820a.equals(((C13771y) obj).f39820a);
        }
        return this.f39820a.equals(obj);
    }

    public T get(int i) {
        return this.f39820a.get(i);
    }

    public int hashCode() {
        return this.f39820a.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f39820a.indexOf(obj);
    }

    public boolean isEmpty() {
        return get() == 0;
    }

    public Iterator<T> iterator() {
        return this.f39820a.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f39820a.lastIndexOf(obj);
    }

    public ListIterator<T> listIterator() {
        return this.f39820a.listIterator();
    }

    public boolean remove(Object obj) {
        boolean remove = this.f39820a.remove(obj);
        lazySet(this.f39820a.size());
        return remove;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean removeAll = this.f39820a.removeAll(collection);
        lazySet(this.f39820a.size());
        return removeAll;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean retainAll = this.f39820a.retainAll(collection);
        lazySet(this.f39820a.size());
        return retainAll;
    }

    public T set(int i, T t) {
        return this.f39820a.set(i, t);
    }

    public int size() {
        return get();
    }

    public List<T> subList(int i, int i2) {
        return this.f39820a.subList(i, i2);
    }

    public Object[] toArray() {
        return this.f39820a.toArray();
    }

    public String toString() {
        return this.f39820a.toString();
    }

    public ListIterator<T> listIterator(int i) {
        return this.f39820a.listIterator(i);
    }

    public <E> E[] toArray(E[] eArr) {
        return this.f39820a.toArray(eArr);
    }

    public C13771y(int i) {
        this.f39820a = new ArrayList<>(i);
    }

    public void add(int i, T t) {
        this.f39820a.add(i, t);
        lazySet(this.f39820a.size());
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = this.f39820a.addAll(i, collection);
        lazySet(this.f39820a.size());
        return addAll;
    }

    public T remove(int i) {
        T remove = this.f39820a.remove(i);
        lazySet(this.f39820a.size());
        return remove;
    }
}
