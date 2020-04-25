package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
/* renamed from: com.google.common.base.u */
/* compiled from: Optional */
public abstract class C7392u<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.common.base.u$a */
    /* compiled from: Optional */
    static class C7393a implements Iterable<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f20849a;

        /* renamed from: com.google.common.base.u$a$a */
        /* compiled from: Optional */
        class C7394a extends C7321b<T> {

            /* renamed from: N */
            private final Iterator<? extends C7392u<? extends T>> f20850N = ((Iterator) C7397x.m35664a(C7393a.this.f20849a.iterator()));

            C7394a() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public T mo23084b() {
                while (this.f20850N.hasNext()) {
                    C7392u uVar = (C7392u) this.f20850N.next();
                    if (uVar.mo29186e()) {
                        return uVar.mo29185d();
                    }
                }
                return mo29191c();
            }
        }

        C7393a(Iterable iterable) {
            this.f20849a = iterable;
        }

        public Iterator<T> iterator() {
            return new C7394a();
        }
    }

    C7392u() {
    }

    @C2775a
    /* renamed from: a */
    public static <T> Iterable<T> m35643a(Iterable<? extends C7392u<? extends T>> iterable) {
        C7397x.m35664a(iterable);
        return new C7393a(iterable);
    }

    /* renamed from: b */
    public static <T> C7392u<T> m35644b(@C5952h T t) {
        return t == null ? m35646g() : new C7320a0(t);
    }

    /* renamed from: c */
    public static <T> C7392u<T> m35645c(T t) {
        return new C7320a0(C7397x.m35664a(t));
    }

    /* renamed from: g */
    public static <T> C7392u<T> m35646g() {
        return C7319a.m35469h();
    }

    /* renamed from: a */
    public abstract <V> C7392u<V> mo29180a(C7380p<? super T, V> pVar);

    /* renamed from: a */
    public abstract C7392u<T> mo29181a(C7392u<? extends T> uVar);

    @C2775a
    /* renamed from: a */
    public abstract T mo29182a(C7344g0<? extends T> g0Var);

    /* renamed from: a */
    public abstract T mo29183a(T t);

    /* renamed from: a */
    public abstract Set<T> mo29184a();

    /* renamed from: d */
    public abstract T mo29185d();

    /* renamed from: e */
    public abstract boolean mo29186e();

    public abstract boolean equals(@C5952h Object obj);

    @C5952h
    /* renamed from: f */
    public abstract T mo29188f();

    public abstract int hashCode();

    public abstract String toString();
}
