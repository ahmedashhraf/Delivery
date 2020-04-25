package com.google.common.util.concurrent;

import com.google.common.base.C7397x;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.w */
/* compiled from: ForwardingListenableFuture */
public abstract class C8600w<V> extends C8596v<V> implements C8473c0<V> {

    /* renamed from: com.google.common.util.concurrent.w$a */
    /* compiled from: ForwardingListenableFuture */
    public static abstract class C8601a<V> extends C8600w<V> {

        /* renamed from: a */
        private final C8473c0<V> f22594a;

        protected C8601a(C8473c0<V> c0Var) {
            this.f22594a = (C8473c0) C7397x.m35664a(c0Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public final C8473c0<V> m40509y() {
            return this.f22594a;
        }
    }

    protected C8600w() {
    }

    /* renamed from: a */
    public void mo31637a(Runnable runnable, Executor executor) {
        m40506y().mo31637a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract C8473c0<V> m40506y();
}
