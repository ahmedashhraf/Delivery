package com.google.common.collect;

import com.google.common.base.C7397x;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.p5 */
/* compiled from: SingletonImmutableSet */
final class C8097p5<E> extends C7859g3<E> {

    /* renamed from: P */
    final transient E f21899P;

    /* renamed from: Q */
    private transient int f21900Q;

    C8097p5(E e) {
        this.f21899P = C7397x.m35664a(e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo29839a(Object[] objArr, int i) {
        objArr[i] = this.f21899P;
        return i + 1;
    }

    public boolean contains(Object obj) {
        return this.f21899P.equals(obj);
    }

    public boolean equals(@C5952h Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != 1 || !this.f21899P.equals(set.iterator().next())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        int i = this.f21900Q;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f21899P.hashCode();
        this.f21900Q = hashCode;
        return hashCode;
    }

    public boolean isEmpty() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo29841k() {
        return this.f21900Q != 0;
    }

    public int size() {
        return 1;
    }

    public String toString() {
        String obj = this.f21899P.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public C8023l6<E> iterator() {
        return C8178t3.m39089a(this.f21899P);
    }

    C8097p5(E e, int i) {
        this.f21899P = e;
        this.f21900Q = i;
    }
}
