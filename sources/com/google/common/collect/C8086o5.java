package com.google.common.collect;

import com.google.common.base.C7397x;
import java.util.List;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.o5 */
/* compiled from: SingletonImmutableList */
final class C8086o5<E> extends C8257x2<E> {

    /* renamed from: N */
    final transient E f21887N;

    C8086o5(E e) {
        this.f21887N = C7397x.m35664a(e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo29839a(Object[] objArr, int i) {
        objArr[i] = this.f21887N;
        return i + 1;
    }

    public boolean contains(@C5952h Object obj) {
        return this.f21887N.equals(obj);
    }

    public boolean equals(@C5952h Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (list.size() != 1 || !this.f21887N.equals(list.get(0))) {
            z = false;
        }
        return z;
    }

    public E get(int i) {
        C7397x.m35663a(i, 1);
        return this.f21887N;
    }

    public int hashCode() {
        return this.f21887N.hashCode() + 31;
    }

    public int indexOf(@C5952h Object obj) {
        return this.f21887N.equals(obj) ? 0 : -1;
    }

    public boolean isEmpty() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return false;
    }

    /* renamed from: k */
    public C8257x2<E> mo30925k() {
        return this;
    }

    public int lastIndexOf(@C5952h Object obj) {
        return indexOf(obj);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        String obj = this.f21887N.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public C8023l6<E> iterator() {
        return C8178t3.m39089a(this.f21887N);
    }

    public C8257x2<E> subList(int i, int i2) {
        C7397x.m35675b(i, i2, 1);
        return i == i2 ? C8257x2.m39412m() : this;
    }
}
