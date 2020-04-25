package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.p0 */
/* compiled from: EmptyContiguousSet */
final class C8089p0<C extends Comparable> extends C7879h0<C> {

    @C2777c("serialization")
    /* renamed from: com.google.common.collect.p0$b */
    /* compiled from: EmptyContiguousSet */
    private static final class C8091b<C extends Comparable> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final C8078o0<C> f21890a;

        private Object readResolve() {
            return new C8089p0(this.f21890a);
        }

        private C8091b(C8078o0<C> o0Var) {
            this.f21890a = o0Var;
        }
    }

    C8089p0(C8078o0<C> o0Var) {
        super(o0Var);
    }

    /* renamed from: a */
    public C7879h0<C> mo30535a(C7879h0<C> h0Var) {
        return this;
    }

    /* renamed from: a */
    public C8235v4<C> mo30540a(C8209u uVar, C8209u uVar2) {
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C7879h0<C> mo30440b(C c, boolean z) {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C7879h0<C> mo30441b(C c, boolean z, C c2, boolean z2) {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C7879h0<C> mo30444d(C c, boolean z) {
        return this;
    }

    @C2777c("NavigableSet")
    public C8023l6<C> descendingIterator() {
        return C8178t3.m39086a();
    }

    /* renamed from: e */
    public C8257x2<C> mo30933e() {
        return C8257x2.m39412m();
    }

    public boolean equals(@C5952h Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    @C2777c("not used by GWT emulation")
    public int indexOf(Object obj) {
        return -1;
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
    @C2777c("NavigableSet")
    /* renamed from: n */
    public C8068n3<C> mo30456n() {
        return new C8243w0(C8133r4.m38943j().mo30568g());
    }

    /* renamed from: p */
    public C8235v4<C> mo30457p() {
        throw new NoSuchElementException();
    }

    public int size() {
        return 0;
    }

    public String toString() {
        return "[]";
    }

    /* access modifiers changed from: 0000 */
    @C2777c("serialization")
    public Object writeReplace() {
        return new C8091b(this.f21607T);
    }

    public C first() {
        throw new NoSuchElementException();
    }

    public C8023l6<C> iterator() {
        return C8178t3.m39086a();
    }

    public C last() {
        throw new NoSuchElementException();
    }
}
