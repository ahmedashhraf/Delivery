package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.z0 */
/* compiled from: EnumMultiset */
public final class C8300z0<E extends Enum<E>> extends C7783f<E> {
    @C2777c("Not needed in emulated source")
    private static final long serialVersionUID = 0;

    /* renamed from: P */
    private transient Class<E> f22176P;

    private C8300z0(Class<E> cls) {
        super(C8098p6.m38798b(new EnumMap(cls)));
        this.f22176P = cls;
    }

    @C2777c("java.io.ObjectInputStream")
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f22176P = (Class) objectInputStream.readObject();
        mo30316a((Map<E, C7896i0>) C8098p6.m38798b(new EnumMap(this.f22176P)));
        C7984k5.m38243a((C7982k4<E>) this, objectInputStream);
    }

    @C2777c("java.io.ObjectOutputStream")
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f22176P);
        C7984k5.m38245a((C7982k4<E>) this, objectOutputStream);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ int mo29818a(Object obj, int i) {
        return super.mo29818a(obj, i);
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return super.addAll(collection);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ int mo29708b(Object obj) {
        return super.mo29708b(obj);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ Set mo29710h() {
        return super.mo29710h();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: a */
    public static <E extends Enum<E>> C8300z0<E> m39611a(Class<E> cls) {
        return new C8300z0<>(cls);
    }

    /* renamed from: a */
    public static <E extends Enum<E>> C8300z0<E> m39612a(Iterable<E> iterable) {
        Iterator it = iterable.iterator();
        C7397x.m35671a(it.hasNext(), (Object) "EnumMultiset constructor passed empty Iterable");
        C8300z0<E> z0Var = new C8300z0<>(((Enum) it.next()).getDeclaringClass());
        C8145s3.m39018a((Collection<T>) z0Var, iterable);
        return z0Var;
    }

    /* renamed from: a */
    public static <E extends Enum<E>> C8300z0<E> m39613a(Iterable<E> iterable, Class<E> cls) {
        C8300z0<E> a = m39611a(cls);
        C8145s3.m39018a((Collection<T>) a, iterable);
        return a;
    }
}
