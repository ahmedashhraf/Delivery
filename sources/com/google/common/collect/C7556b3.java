package com.google.common.collect;

import java.io.Serializable;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.b3 */
/* compiled from: ImmutableMapEntrySet */
abstract class C7556b3<K, V> extends C7859g3<Entry<K, V>> {

    @C2777c("serialization")
    /* renamed from: com.google.common.collect.b3$a */
    /* compiled from: ImmutableMapEntrySet */
    private static class C7557a<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C8302z2<K, V> f21111a;

        C7557a(C8302z2<K, V> z2Var) {
            this.f21111a = z2Var;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return this.f21111a.entrySet();
        }
    }

    C7556b3() {
    }

    public boolean contains(@C5952h Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object obj2 = mo29648n().get(entry.getKey());
        if (obj2 == null || !obj2.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return mo29648n().mo29643f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public abstract C8302z2<K, V> mo29648n();

    public int size() {
        return mo29648n().size();
    }

    /* access modifiers changed from: 0000 */
    @C2777c("serialization")
    public Object writeReplace() {
        return new C7557a(mo29648n());
    }
}
