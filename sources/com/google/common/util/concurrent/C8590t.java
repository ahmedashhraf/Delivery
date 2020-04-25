package com.google.common.util.concurrent;

import com.google.common.base.C7397x;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.util.concurrent.t */
/* compiled from: ForwardingCheckedFuture */
public abstract class C8590t<V, X extends Exception> extends C8600w<V> implements C8564o<V, X> {

    @C2775a
    /* renamed from: com.google.common.util.concurrent.t$a */
    /* compiled from: ForwardingCheckedFuture */
    public static abstract class C8591a<V, X extends Exception> extends C8590t<V, X> {

        /* renamed from: a */
        private final C8564o<V, X> f22587a;

        protected C8591a(C8564o<V, X> oVar) {
            this.f22587a = (C8564o) C7397x.m35664a(oVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public final C8564o<V, X> m40481y() {
            return this.f22587a;
        }
    }

    /* renamed from: a */
    public V mo31614a(long j, TimeUnit timeUnit) throws TimeoutException, Exception {
        return m40479y().mo31614a(j, timeUnit);
    }

    /* renamed from: l */
    public V mo31615l() throws Exception {
        return m40479y().mo31615l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract C8564o<V, X> m40477y();
}
