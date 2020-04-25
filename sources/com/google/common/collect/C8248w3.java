package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.w3 */
/* compiled from: LinkedHashMultiset */
public final class C8248w3<E> extends C7783f<E> {
    @C2777c("not needed in emulated source")
    private static final long serialVersionUID = 0;

    private C8248w3() {
        super(new LinkedHashMap());
    }

    /* renamed from: l */
    public static <E> C8248w3<E> m39344l() {
        return new C8248w3<>();
    }

    @C2777c("java.io.ObjectInputStream")
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int a = C7984k5.m38238a(objectInputStream);
        mo30316a((Map<E, C7896i0>) new LinkedHashMap<E,C7896i0>(C7800f4.m37271a(a)));
        C7984k5.m38244a((C7982k4<E>) this, objectInputStream, a);
    }

    @C2777c("java.io.ObjectOutputStream")
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C7984k5.m38245a((C7982k4<E>) this, objectOutputStream);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ int mo29818a(Object obj, int i) {
        return super.mo29818a(obj, i);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return super.addAll(collection);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ int mo29893b(Object obj, int i) {
        return super.mo29893b(obj, i);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ int mo29894c(Object obj, int i) {
        return super.mo29894c(obj, i);
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

    private C8248w3(int i) {
        super(new LinkedHashMap(C7800f4.m37271a(i)));
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo29892a(Object obj, int i, int i2) {
        return super.mo29892a(obj, i, i2);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ int mo29708b(Object obj) {
        return super.mo29708b(obj);
    }

    /* renamed from: a */
    public static <E> C8248w3<E> m39342a(Iterable<? extends E> iterable) {
        C8248w3<E> b = m39343b(C8003l4.m38363b(iterable));
        C8145s3.m39018a((Collection<T>) b, iterable);
        return b;
    }

    /* renamed from: b */
    public static <E> C8248w3<E> m39343b(int i) {
        return new C8248w3<>(i);
    }
}
