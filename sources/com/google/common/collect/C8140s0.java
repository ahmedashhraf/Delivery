package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.s0 */
/* compiled from: EmptyImmutableSet */
final class C8140s0 extends C7859g3<Object> {

    /* renamed from: P */
    static final C8140s0 f21950P = new C8140s0();
    private static final long serialVersionUID = 0;

    private C8140s0() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo29839a(Object[] objArr, int i) {
        return i;
    }

    public boolean contains(@C5952h Object obj) {
        return false;
    }

    public boolean containsAll(Collection<?> collection) {
        return collection.isEmpty();
    }

    /* renamed from: e */
    public C8257x2<Object> mo30933e() {
        return C8257x2.m39412m();
    }

    public boolean equals(@C5952h Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo29841k() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public Object readResolve() {
        return f21950P;
    }

    public int size() {
        return 0;
    }

    public String toString() {
        return "[]";
    }

    public C8023l6<Object> iterator() {
        return C8178t3.m39086a();
    }
}
