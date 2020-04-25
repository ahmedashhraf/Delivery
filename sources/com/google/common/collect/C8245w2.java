package com.google.common.collect;

import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.w2 */
/* compiled from: ImmutableEnumSet */
final class C8245w2<E extends Enum<E>> extends C7859g3<E> {

    /* renamed from: P */
    private final transient EnumSet<E> f22083P;

    /* renamed from: Q */
    private transient int f22084Q;

    /* renamed from: com.google.common.collect.w2$b */
    /* compiled from: ImmutableEnumSet */
    private static class C8247b<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final EnumSet<E> f22085a;

        C8247b(EnumSet<E> enumSet) {
            this.f22085a = enumSet;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return new C8245w2(this.f22085a.clone());
        }
    }

    /* renamed from: a */
    static <E extends Enum<E>> C7859g3<E> m39340a(EnumSet<E> enumSet) {
        int size = enumSet.size();
        if (size == 0) {
            return C7859g3.m37512m();
        }
        if (size != 1) {
            return new C8245w2(enumSet);
        }
        return C7859g3.m37499a(C8145s3.m39040f(enumSet));
    }

    public boolean contains(Object obj) {
        return this.f22083P.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f22083P.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return obj == this || this.f22083P.equals(obj);
    }

    public int hashCode() {
        int i = this.f22084Q;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f22083P.hashCode();
        this.f22084Q = hashCode;
        return hashCode;
    }

    public boolean isEmpty() {
        return this.f22083P.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return false;
    }

    public int size() {
        return this.f22083P.size();
    }

    public String toString() {
        return this.f22083P.toString();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C8247b(this.f22083P);
    }

    private C8245w2(EnumSet<E> enumSet) {
        this.f22083P = enumSet;
    }

    public C8023l6<E> iterator() {
        return C8178t3.m39140l(this.f22083P.iterator());
    }
}
