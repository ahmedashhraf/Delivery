package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p076c.p112d.p148d.p149a.C2778d;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.n2 */
/* compiled from: HashMultimap */
public final class C8067n2<K, V> extends C7971k<K, V> {

    /* renamed from: T */
    private static final int f21862T = 2;
    @C2777c("Not needed in emulated source")
    private static final long serialVersionUID = 0;
    @C2778d

    /* renamed from: S */
    transient int f21863S = 2;

    private C8067n2() {
        super(new HashMap());
    }

    @C2777c("java.io.ObjectInputStream")
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f21863S = objectInputStream.readInt();
        int a = C7984k5.m38238a(objectInputStream);
        mo30000a((Map<K, Collection<V>>) C7800f4.m37318b(a));
        C7984k5.m38241a((C7886h4<K, V>) this, objectInputStream, a);
    }

    /* renamed from: s */
    public static <K, V> C8067n2<K, V> m38579s() {
        return new C8067n2<>();
    }

    @C2777c("java.io.ObjectOutputStream")
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f21863S);
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
    public /* bridge */ /* synthetic */ Set mo29699e(Object obj) {
        return super.mo29699e(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ Set get(Object obj) {
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

    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
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
    public static <K, V> C8067n2<K, V> m38578b(C7886h4<? extends K, ? extends V> h4Var) {
        return new C8067n2<>(h4Var);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Set mo29698a(Object obj, Iterable iterable) {
        return super.mo29698a(obj, iterable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public Set<V> m38587l() {
        return C8047m5.m38509a(this.f21863S);
    }

    private C8067n2(int i, int i2) {
        super(C7800f4.m37318b(i));
        C7397x.m35670a(i2 >= 0);
        this.f21863S = i2;
    }

    /* renamed from: a */
    public static <K, V> C8067n2<K, V> m38577a(int i, int i2) {
        return new C8067n2<>(i, i2);
    }

    private C8067n2(C7886h4<? extends K, ? extends V> h4Var) {
        super(C7800f4.m37318b(h4Var.keySet().size()));
        mo29701a(h4Var);
    }
}
