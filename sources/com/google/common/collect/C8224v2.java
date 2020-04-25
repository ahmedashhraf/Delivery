package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.v2 */
/* compiled from: ImmutableEnumMap */
final class C8224v2<K extends Enum<K>, V> extends C8302z2<K, V> {
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final transient EnumMap<K, V> f22041Q;

    /* renamed from: com.google.common.collect.v2$a */
    /* compiled from: ImmutableEnumMap */
    class C8225a extends C7859g3<K> {
        C8225a() {
        }

        public boolean contains(Object obj) {
            return C8224v2.this.f22041Q.containsKey(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public boolean mo29686j() {
            return true;
        }

        public int size() {
            return C8224v2.this.size();
        }

        public C8023l6<K> iterator() {
            return C8178t3.m39140l(C8224v2.this.f22041Q.keySet().iterator());
        }
    }

    /* renamed from: com.google.common.collect.v2$b */
    /* compiled from: ImmutableEnumMap */
    class C8226b extends C7556b3<K, V> {

        /* renamed from: com.google.common.collect.v2$b$a */
        /* compiled from: ImmutableEnumMap */
        class C8227a extends C8023l6<Entry<K, V>> {

            /* renamed from: a */
            private final Iterator<Entry<K, V>> f22044a = C8224v2.this.f22041Q.entrySet().iterator();

            C8227a() {
            }

            public boolean hasNext() {
                return this.f22044a.hasNext();
            }

            public Entry<K, V> next() {
                Entry entry = (Entry) this.f22044a.next();
                return C7800f4.m37291a(entry.getKey(), entry.getValue());
            }
        }

        C8226b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public C8302z2<K, V> mo29648n() {
            return C8224v2.this;
        }

        public C8023l6<Entry<K, V>> iterator() {
            return new C8227a();
        }
    }

    /* renamed from: com.google.common.collect.v2$c */
    /* compiled from: ImmutableEnumMap */
    private static class C8228c<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final EnumMap<K, V> f22046a;

        C8228c(EnumMap<K, V> enumMap) {
            this.f22046a = enumMap;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return new C8224v2(this.f22046a, null);
        }
    }

    /* synthetic */ C8224v2(EnumMap enumMap, C8225a aVar) {
        this(enumMap);
    }

    public boolean containsKey(@C5952h Object obj) {
        return this.f22041Q.containsKey(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C7859g3<Entry<K, V>> mo29642d() {
        return new C8226b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C7859g3<K> mo30737e() {
        return new C8225a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo29643f() {
        return false;
    }

    public V get(Object obj) {
        return this.f22041Q.get(obj);
    }

    public int size() {
        return this.f22041Q.size();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C8228c(this.f22041Q);
    }

    private C8224v2(EnumMap<K, V> enumMap) {
        this.f22041Q = enumMap;
        C7397x.m35670a(!enumMap.isEmpty());
    }

    /* renamed from: a */
    static <K extends Enum<K>, V> C8302z2<K, V> m39224a(EnumMap<K, V> enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return C8302z2.m39630i();
        }
        if (size != 1) {
            return new C8224v2(enumMap);
        }
        Entry entry = (Entry) C8145s3.m39040f(enumMap.entrySet());
        return C8302z2.m39626c(entry.getKey(), entry.getValue());
    }
}
