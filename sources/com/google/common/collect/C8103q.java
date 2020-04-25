package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p076c.p112d.p148d.p149a.C2778d;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.q */
/* compiled from: ArrayListMultimap */
public final class C8103q<K, V> extends C7647d<K, V> {

    /* renamed from: T */
    private static final int f21907T = 3;
    @C2777c("Not needed in emulated source.")
    private static final long serialVersionUID = 0;
    @C2778d

    /* renamed from: S */
    transient int f21908S;

    private C8103q() {
        super(new HashMap());
        this.f21908S = 3;
    }

    @C2777c("java.io.ObjectOutputStream")
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f21908S = objectInputStream.readInt();
        int a = C7984k5.m38238a(objectInputStream);
        mo30000a((Map<K, Collection<V>>) C7800f4.m37318b(a));
        C7984k5.m38241a((C7886h4<K, V>) this, objectInputStream, a);
    }

    /* renamed from: t */
    public static <K, V> C8103q<K, V> m38806t() {
        return new C8103q<>();
    }

    @C2777c("java.io.ObjectOutputStream")
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f21908S);
        C7984k5.m38242a((C7886h4<K, V>) this, objectOutputStream);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo29701a(C7886h4 h4Var) {
        return super.mo29701a(h4Var);
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

    /* renamed from: e */
    public /* bridge */ /* synthetic */ List mo29699e(Object obj) {
        return super.mo29699e(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ List get(Object obj) {
        return super.get(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ Map mo29703j() {
        return super.mo29703j();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ Collection mo29704m() {
        return super.mo29704m();
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ C7982k4 mo29889n() {
        return super.mo29889n();
    }

    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    /* renamed from: s */
    public void mo30949s() {
        for (ArrayList trimToSize : mo30003k().values()) {
            trimToSize.trimToSize();
        }
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
    public static <K, V> C8103q<K, V> m38805b(C7886h4<? extends K, ? extends V> h4Var) {
        return new C8103q<>(h4Var);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ List mo29698a(Object obj, Iterable iterable) {
        return super.mo29698a(obj, iterable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public List<V> m38814l() {
        return new ArrayList(this.f21908S);
    }

    private C8103q(int i, int i2) {
        super(C7800f4.m37318b(i));
        C8277y.m39484a(i2, "expectedValuesPerKey");
        this.f21908S = i2;
    }

    /* renamed from: a */
    public static <K, V> C8103q<K, V> m38804a(int i, int i2) {
        return new C8103q<>(i, i2);
    }

    private C8103q(C7886h4<? extends K, ? extends V> h4Var) {
        this(h4Var.keySet().size(), h4Var instanceof C8103q ? ((C8103q) h4Var).f21908S : 3);
        mo29701a(h4Var);
    }
}
