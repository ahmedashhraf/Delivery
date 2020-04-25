package com.google.common.util.concurrent;

import com.google.common.util.concurrent.C8600w.C8601a;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.util.concurrent.a */
/* compiled from: AbstractCheckedFuture */
public abstract class C8436a<V, X extends Exception> extends C8601a<V> implements C8564o<V, X> {
    protected C8436a(C8473c0<V> c0Var) {
        super(c0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract X mo31613a(Exception exc);

    /* renamed from: a */
    public V mo31614a(long j, TimeUnit timeUnit) throws TimeoutException, Exception {
        try {
            return get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw mo31613a(e);
        } catch (CancellationException e2) {
            throw mo31613a(e2);
        } catch (ExecutionException e3) {
            throw mo31613a(e3);
        }
    }

    /* renamed from: l */
    public V mo31615l() throws Exception {
        try {
            return get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw mo31613a(e);
        } catch (CancellationException e2) {
            throw mo31613a(e2);
        } catch (ExecutionException e3) {
            throw mo31613a(e3);
        }
    }
}
