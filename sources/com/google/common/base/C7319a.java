package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.base.a */
/* compiled from: Absent */
final class C7319a<T> extends C7392u<T> {

    /* renamed from: a */
    static final C7319a<Object> f20766a = new C7319a<>();
    private static final long serialVersionUID = 0;

    private C7319a() {
    }

    /* renamed from: h */
    static <T> C7392u<T> m35469h() {
        return f20766a;
    }

    private Object readResolve() {
        return f20766a;
    }

    /* renamed from: a */
    public T mo29183a(T t) {
        return C7397x.m35665a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
    }

    /* renamed from: d */
    public T mo29185d() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: e */
    public boolean mo29186e() {
        return false;
    }

    public boolean equals(@C5952h Object obj) {
        return obj == this;
    }

    @C5952h
    /* renamed from: f */
    public T mo29188f() {
        return null;
    }

    public int hashCode() {
        return 1502476572;
    }

    public String toString() {
        return "Optional.absent()";
    }

    /* renamed from: a */
    public C7392u<T> mo29181a(C7392u<? extends T> uVar) {
        return (C7392u) C7397x.m35664a(uVar);
    }

    /* renamed from: a */
    public T mo29182a(C7344g0<? extends T> g0Var) {
        return C7397x.m35665a(g0Var.get(), (Object) "use Optional.orNull() instead of a Supplier that returns null");
    }

    /* renamed from: a */
    public Set<T> mo29184a() {
        return Collections.emptySet();
    }

    /* renamed from: a */
    public <V> C7392u<V> mo29180a(C7380p<? super T, V> pVar) {
        C7397x.m35664a(pVar);
        return C7392u.m35646g();
    }
}
