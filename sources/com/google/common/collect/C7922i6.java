package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.i6 */
/* compiled from: TreeMultimap */
public class C7922i6<K, V> extends C7995l<K, V> {
    @C2777c("not needed in emulated source")
    private static final long serialVersionUID = 0;

    /* renamed from: S */
    private transient Comparator<? super K> f21661S;

    /* renamed from: T */
    private transient Comparator<? super V> f21662T;

    C7922i6(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        super(new TreeMap(comparator));
        this.f21661S = comparator;
        this.f21662T = comparator2;
    }

    @C2777c("java.io.ObjectInputStream")
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f21661S = (Comparator) C7397x.m35664a((Comparator) objectInputStream.readObject());
        this.f21662T = (Comparator) C7397x.m35664a((Comparator) objectInputStream.readObject());
        mo30000a((Map<K, Collection<V>>) new TreeMap<K,Collection<V>>(this.f21661S));
        C7984k5.m38240a((C7886h4<K, V>) this, objectInputStream);
    }

    /* renamed from: t */
    public static <K extends Comparable, V extends Comparable> C7922i6<K, V> m37846t() {
        return new C7922i6<>(C8133r4.m38943j(), C8133r4.m38943j());
    }

    @C2777c("java.io.ObjectOutputStream")
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(mo30637s());
        objectOutputStream.writeObject(mo29707q());
        C7984k5.m38242a((C7886h4<K, V>) this, objectOutputStream);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo29702b(Object obj, Iterable iterable) {
        return super.mo29702b(obj, iterable);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo29884c(Object obj, Object obj2) {
        return super.mo29884c(obj, obj2);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ Set mo29704m() {
        return super.mo29704m();
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ C7982k4 mo29889n() {
        return super.mo29889n();
    }

    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    /* renamed from: q */
    public Comparator<? super V> mo29707q() {
        return this.f21662T;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    /* renamed from: s */
    public Comparator<? super K> mo30637s() {
        return this.f21661S;
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    /* renamed from: b */
    public static <K extends Comparable, V extends Comparable> C7922i6<K, V> m37845b(C7886h4<? extends K, ? extends V> h4Var) {
        return new C7922i6<>(C8133r4.m38943j(), C8133r4.m38943j(), h4Var);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo29701a(C7886h4 h4Var) {
        return super.mo29701a(h4Var);
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ SortedSet mo29699e(Object obj) {
        return super.m38555e(obj);
    }

    /* renamed from: j */
    public SortedMap<K, Collection<V>> m37860j() {
        return super.mo29703j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public SortedMap<K, Collection<V>> m37862k() {
        return super.mo30003k();
    }

    public SortedSet<K> keySet() {
        return super.keySet();
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ SortedSet mo29698a(Object obj, Iterable iterable) {
        return super.m38552a(obj, iterable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public SortedSet<K> m37857e() {
        return new C7690h(mo30003k());
    }

    public SortedSet<V> get(@C5952h K k) {
        return super.get((Object) k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public SortedSet<V> m37865l() {
        return new TreeSet(this.f21662T);
    }

    private C7922i6(Comparator<? super K> comparator, Comparator<? super V> comparator2, C7886h4<? extends K, ? extends V> h4Var) {
        this(comparator, comparator2);
        mo29701a((C7886h4) h4Var);
    }

    /* renamed from: a */
    public static <K, V> C7922i6<K, V> m37844a(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        return new C7922i6<>((Comparator) C7397x.m35664a(comparator), (Comparator) C7397x.m35664a(comparator2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Collection<V> mo29997a(@C5952h K k) {
        if (k == null) {
            mo30637s().compare(k, k);
        }
        return super.mo29997a(k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Collection<V> mo29999a(Collection<V> collection) {
        return Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Collection<V> mo29998a(K k, Collection<V> collection) {
        return new C7696l(k, (SortedSet) collection, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public SortedMap<K, Collection<V>> m37851a() {
        return new C7689g(mo30003k());
    }
}
