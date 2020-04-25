package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.x0 */
/* compiled from: EnumBiMap */
public final class C8255x0<K extends Enum<K>, V extends Enum<V>> extends C7529a<K, V> {
    @C2777c("not needed in emulated source.")
    private static final long serialVersionUID = 0;

    /* renamed from: Q */
    private transient Class<K> f22093Q;

    /* renamed from: R */
    private transient Class<V> f22094R;

    private C8255x0(Class<K> cls, Class<V> cls2) {
        super((Map<K, V>) C8098p6.m38798b(new EnumMap(cls)), (Map<V, K>) C8098p6.m38798b(new EnumMap(cls2)));
        this.f22093Q = cls;
        this.f22094R = cls2;
    }

    /* renamed from: a */
    public static <K extends Enum<K>, V extends Enum<V>> C8255x0<K, V> m39371a(Class<K> cls, Class<V> cls2) {
        return new C8255x0<>(cls, cls2);
    }

    /* renamed from: b */
    public static <K extends Enum<K>, V extends Enum<V>> C8255x0<K, V> m39372b(Map<K, V> map) {
        C8255x0<K, V> a = m39371a(m39373c(map), m39374d(map));
        a.putAll(map);
        return a;
    }

    /* renamed from: c */
    static <K extends Enum<K>> Class<K> m39373c(Map<K, ?> map) {
        if (map instanceof C8255x0) {
            return ((C8255x0) map).mo31192E();
        }
        if (map instanceof C8278y0) {
            return ((C8278y0) map).mo31250E();
        }
        C7397x.m35670a(!map.isEmpty());
        return ((Enum) map.keySet().iterator().next()).getDeclaringClass();
    }

    /* renamed from: d */
    private static <V extends Enum<V>> Class<V> m39374d(Map<?, V> map) {
        if (map instanceof C8255x0) {
            return ((C8255x0) map).f22094R;
        }
        C7397x.m35670a(!map.isEmpty());
        return ((Enum) map.values().iterator().next()).getDeclaringClass();
    }

    @C2777c("java.io.ObjectInputStream")
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f22093Q = (Class) objectInputStream.readObject();
        this.f22094R = (Class) objectInputStream.readObject();
        mo29604a((Map<K, V>) C8098p6.m38798b(new EnumMap(this.f22093Q)), (Map<V, K>) C8098p6.m38798b(new EnumMap(this.f22094R)));
        C7984k5.m38246a((Map<K, V>) this, objectInputStream);
    }

    @C2777c("java.io.ObjectOutputStream")
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f22093Q);
        objectOutputStream.writeObject(this.f22094R);
        C7984k5.m38248a((Map<K, V>) this, objectOutputStream);
    }

    /* renamed from: E */
    public Class<K> mo31192E() {
        return this.f22093Q;
    }

    /* renamed from: F */
    public Class<V> mo31193F() {
        return this.f22094R;
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ C8139s mo29607k() {
        return super.mo29607k();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public K mo29609p(K k) {
        return (Enum) C7397x.m35664a(k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public V mo29610q(V v) {
        return (Enum) C7397x.m35664a(v);
    }
}
