package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.y0 */
/* compiled from: EnumHashBiMap */
public final class C8278y0<K extends Enum<K>, V> extends C7529a<K, V> {
    @C2777c("only needed in emulated source.")
    private static final long serialVersionUID = 0;

    /* renamed from: Q */
    private transient Class<K> f22143Q;

    private C8278y0(Class<K> cls) {
        super((Map<K, V>) C8098p6.m38798b(new EnumMap(cls)), (Map<V, K>) C7800f4.m37318b(((Enum[]) cls.getEnumConstants()).length));
        this.f22143Q = cls;
    }

    /* renamed from: b */
    public static <K extends Enum<K>, V> C8278y0<K, V> m39487b(Class<K> cls) {
        return new C8278y0<>(cls);
    }

    @C2777c("java.io.ObjectInputStream")
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f22143Q = (Class) objectInputStream.readObject();
        mo29604a((Map<K, V>) C8098p6.m38798b(new EnumMap(this.f22143Q)), (Map<V, K>) new HashMap<V,K>((((Enum[]) this.f22143Q.getEnumConstants()).length * 3) / 2));
        C7984k5.m38246a((Map<K, V>) this, objectInputStream);
    }

    @C2777c("java.io.ObjectOutputStream")
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f22143Q);
        C7984k5.m38248a((Map<K, V>) this, objectOutputStream);
    }

    /* renamed from: E */
    public Class<K> mo31250E() {
        return this.f22143Q;
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

    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        return super.remove(obj);
    }

    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    /* renamed from: b */
    public static <K extends Enum<K>, V> C8278y0<K, V> m39488b(Map<K, ? extends V> map) {
        C8278y0<K, V> b = m39487b(C8255x0.m39373c(map));
        b.putAll(map);
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public K mo29609p(K k) {
        return (Enum) C7397x.m35664a(k);
    }

    /* renamed from: a */
    public V mo29602a(K k, @C5952h V v) {
        return super.mo29602a(k, v);
    }

    /* renamed from: b */
    public V put(K k, @C5952h V v) {
        return super.put(k, v);
    }
}
