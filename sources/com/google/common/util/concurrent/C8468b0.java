package com.google.common.util.concurrent;

import com.google.common.base.C7397x;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.util.concurrent.b0 */
/* compiled from: JdkFutureAdapters */
public final class C8468b0 {

    /* renamed from: com.google.common.util.concurrent.b0$a */
    /* compiled from: JdkFutureAdapters */
    private static class C8469a<V> extends C8596v<V> implements C8473c0<V> {

        /* renamed from: P */
        private static final ThreadFactory f22373P = new C8586r0().mo31898a(true).mo31895a("ListenableFutureAdapter-thread-%d").mo31899a();

        /* renamed from: Q */
        private static final Executor f22374Q = Executors.newCachedThreadPool(f22373P);

        /* renamed from: N */
        private final AtomicBoolean f22375N;
        /* access modifiers changed from: private */

        /* renamed from: O */
        public final Future<V> f22376O;

        /* renamed from: a */
        private final Executor f22377a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C8570q f22378b;

        /* renamed from: com.google.common.util.concurrent.b0$a$a */
        /* compiled from: JdkFutureAdapters */
        class C8470a implements Runnable {
            C8470a() {
            }

            public void run() {
                try {
                    C8595u0.m40488a(C8469a.this.f22376O);
                } catch (Error e) {
                    throw e;
                } catch (Throwable unused) {
                }
                C8469a.this.f22378b.mo31887a();
            }
        }

        C8469a(Future<V> future) {
            this(future, f22374Q);
        }

        C8469a(Future<V> future, Executor executor) {
            this.f22378b = new C8570q();
            this.f22375N = new AtomicBoolean(false);
            this.f22376O = (Future) C7397x.m35664a(future);
            this.f22377a = (Executor) C7397x.m35664a(executor);
        }

        /* renamed from: a */
        public void mo31637a(Runnable runnable, Executor executor) {
            this.f22378b.mo31888a(runnable, executor);
            if (this.f22375N.compareAndSet(false, true)) {
                if (this.f22376O.isDone()) {
                    this.f22378b.mo31887a();
                    return;
                }
                this.f22377a.execute(new C8470a());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Future<V> m40091y() {
            return this.f22376O;
        }
    }

    private C8468b0() {
    }

    /* renamed from: a */
    public static <V> C8473c0<V> m40085a(Future<V> future) {
        if (future instanceof C8473c0) {
            return (C8473c0) future;
        }
        return new C8469a(future);
    }

    /* renamed from: a */
    public static <V> C8473c0<V> m40086a(Future<V> future, Executor executor) {
        C7397x.m35664a(executor);
        if (future instanceof C8473c0) {
            return (C8473c0) future;
        }
        return new C8469a(future, executor);
    }
}
