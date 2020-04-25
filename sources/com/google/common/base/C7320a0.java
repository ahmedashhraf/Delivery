package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.base.a0 */
/* compiled from: Present */
final class C7320a0<T> extends C7392u<T> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final T f20767a;

    C7320a0(T t) {
        this.f20767a = t;
    }

    /* renamed from: a */
    public T mo29183a(T t) {
        C7397x.m35665a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.f20767a;
    }

    /* renamed from: d */
    public T mo29185d() {
        return this.f20767a;
    }

    /* renamed from: e */
    public boolean mo29186e() {
        return true;
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C7320a0)) {
            return false;
        }
        return this.f20767a.equals(((C7320a0) obj).f20767a);
    }

    /* renamed from: f */
    public T mo29188f() {
        return this.f20767a;
    }

    public int hashCode() {
        return this.f20767a.hashCode() + 1502476572;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Optional.of(");
        sb.append(this.f20767a);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public C7392u<T> mo29181a(C7392u<? extends T> uVar) {
        C7397x.m35664a(uVar);
        return this;
    }

    /* renamed from: a */
    public T mo29182a(C7344g0<? extends T> g0Var) {
        C7397x.m35664a(g0Var);
        return this.f20767a;
    }

    /* renamed from: a */
    public Set<T> mo29184a() {
        return Collections.singleton(this.f20767a);
    }

    /* renamed from: a */
    public <V> C7392u<V> mo29180a(C7380p<? super T, V> pVar) {
        return new C7320a0(C7397x.m35665a(pVar.apply(this.f20767a), (Object) "the Function passed to Optional.transform() must not return null."));
    }
}
