package com.google.common.util.concurrent;

import com.google.common.base.C7380p;
import com.google.common.base.C7392u;
import com.google.common.base.C7397x;
import com.google.common.collect.C8047m5;
import com.google.common.collect.C8133r4;
import com.google.common.collect.C8175t2;
import com.google.common.collect.C8216u4;
import com.google.common.collect.C8257x2;
import com.google.common.collect.C8257x2.C8259b;
import com.google.common.collect.C8309z3;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: com.google.common.util.concurrent.a0 */
/* compiled from: Futures */
public final class C8437a0 {

    /* renamed from: a */
    private static final C8512h<C8473c0<Object>, Object> f22327a = new C8440c();

    /* renamed from: b */
    private static final C8133r4<Constructor<?>> f22328b = C8133r4.m38943j().mo30985a((C7380p<F, ? extends T>) new C8443f<F,Object>()).mo30568g();

    /* renamed from: com.google.common.util.concurrent.a0$a */
    /* compiled from: Futures */
    static class C8438a implements C8512h<I, O> {

        /* renamed from: a */
        final /* synthetic */ C7380p f22329a;

        C8438a(C7380p pVar) {
            this.f22329a = pVar;
        }

        public C8473c0<O> apply(I i) {
            return C8437a0.m40043b(this.f22329a.apply(i));
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$b */
    /* compiled from: Futures */
    static class C8439b implements Future<O> {

        /* renamed from: a */
        final /* synthetic */ Future f22330a;

        /* renamed from: b */
        final /* synthetic */ C7380p f22331b;

        C8439b(Future future, C7380p pVar) {
            this.f22330a = future;
            this.f22331b = pVar;
        }

        /* renamed from: a */
        private O m40047a(I i) throws ExecutionException {
            try {
                return this.f22331b.apply(i);
            } catch (Throwable th) {
                throw new ExecutionException(th);
            }
        }

        public boolean cancel(boolean z) {
            return this.f22330a.cancel(z);
        }

        public O get() throws InterruptedException, ExecutionException {
            return m40047a(this.f22330a.get());
        }

        public boolean isCancelled() {
            return this.f22330a.isCancelled();
        }

        public boolean isDone() {
            return this.f22330a.isDone();
        }

        public O get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return m40047a(this.f22330a.get(j, timeUnit));
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$c */
    /* compiled from: Futures */
    static class C8440c implements C8512h<C8473c0<Object>, Object> {
        C8440c() {
        }

        /* renamed from: a */
        public C8473c0<Object> apply(C8473c0<Object> c0Var) {
            return c0Var;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$d */
    /* compiled from: Futures */
    static class C8441d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ConcurrentLinkedQueue f22332a;

        /* renamed from: b */
        final /* synthetic */ C8473c0 f22333b;

        C8441d(ConcurrentLinkedQueue concurrentLinkedQueue, C8473c0 c0Var) {
            this.f22332a = concurrentLinkedQueue;
            this.f22333b = c0Var;
        }

        public void run() {
            ((C8514i) this.f22332a.remove()).mo31724a(this.f22333b);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$e */
    /* compiled from: Futures */
    static class C8442e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8473c0 f22334a;

        /* renamed from: b */
        final /* synthetic */ C8605y f22335b;

        C8442e(C8473c0 c0Var, C8605y yVar) {
            this.f22334a = c0Var;
            this.f22335b = yVar;
        }

        public void run() {
            try {
                this.f22335b.onSuccess(C8595u0.m40488a((Future<V>) this.f22334a));
            } catch (ExecutionException e) {
                this.f22335b.onFailure(e.getCause());
            } catch (RuntimeException e2) {
                this.f22335b.onFailure(e2);
            } catch (Error e3) {
                this.f22335b.onFailure(e3);
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$f */
    /* compiled from: Futures */
    static class C8443f implements C7380p<Constructor<?>, Boolean> {
        C8443f() {
        }

        /* renamed from: a */
        public Boolean apply(Constructor<?> constructor) {
            return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(String.class));
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$g */
    /* compiled from: Futures */
    static class C8444g implements C8453k<V, List<V>> {
        C8444g() {
        }

        /* renamed from: a */
        public List<V> m40051a(List<C7392u<V>> list) {
            ArrayList a = C8309z3.m39648a();
            for (C7392u uVar : list) {
                a.add(uVar != null ? uVar.mo29188f() : null);
            }
            return Collections.unmodifiableList(a);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$h */
    /* compiled from: Futures */
    private static class C8445h<I, O> extends C8471c<O> implements Runnable {

        /* renamed from: N */
        private C8512h<? super I, ? extends O> f22336N;

        /* renamed from: O */
        private C8473c0<? extends I> f22337O;
        /* access modifiers changed from: private */

        /* renamed from: P */
        public volatile C8473c0<? extends O> f22338P;

        /* renamed from: Q */
        private final CountDownLatch f22339Q;

        /* renamed from: com.google.common.util.concurrent.a0$h$a */
        /* compiled from: Futures */
        class C8446a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C8473c0 f22340a;

            C8446a(C8473c0 c0Var) {
                this.f22340a = c0Var;
            }

            public void run() {
                try {
                    C8445h.this.mo31654a(C8595u0.m40488a((Future<V>) this.f22340a));
                } catch (CancellationException unused) {
                    C8445h.this.cancel(false);
                    C8445h.this.f22338P = null;
                    return;
                } catch (ExecutionException e) {
                    C8445h.this.mo31655a(e.getCause());
                } catch (Throwable th) {
                    C8445h.this.f22338P = null;
                    throw th;
                }
                C8445h.this.f22338P = null;
            }
        }

        /* synthetic */ C8445h(C8512h hVar, C8473c0 c0Var, C8438a aVar) {
            this(hVar, c0Var);
        }

        public boolean cancel(boolean z) {
            if (!super.cancel(z)) {
                return false;
            }
            m40053a((Future<?>) this.f22337O, z);
            m40053a((Future<?>) this.f22338P, z);
            return true;
        }

        public void run() {
            try {
                try {
                    C8473c0<? extends O> c0Var = (C8473c0) C7397x.m35665a(this.f22336N.apply(C8595u0.m40488a((Future<V>) this.f22337O)), (Object) "AsyncFunction may not return null.");
                    this.f22338P = c0Var;
                    if (isCancelled()) {
                        c0Var.cancel(mo31656b());
                        this.f22338P = null;
                        this.f22336N = null;
                        this.f22337O = null;
                        this.f22339Q.countDown();
                        return;
                    }
                    c0Var.mo31637a(new C8446a(c0Var), C8520j0.m40280c());
                    this.f22336N = null;
                    this.f22337O = null;
                    this.f22339Q.countDown();
                } catch (UndeclaredThrowableException e) {
                    mo31655a(e.getCause());
                } catch (Throwable th) {
                    this.f22336N = null;
                    this.f22337O = null;
                    this.f22339Q.countDown();
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e2) {
                mo31655a(e2.getCause());
            }
        }

        private C8445h(C8512h<? super I, ? extends O> hVar, C8473c0<? extends I> c0Var) {
            this.f22339Q = new CountDownLatch(1);
            this.f22336N = (C8512h) C7397x.m35664a(hVar);
            this.f22337O = (C8473c0) C7397x.m35664a(c0Var);
        }

        /* renamed from: a */
        private void m40053a(@C5952h Future<?> future, boolean z) {
            if (future != null) {
                future.cancel(z);
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$i */
    /* compiled from: Futures */
    private static class C8447i<V, C> extends C8471c<C> {

        /* renamed from: U */
        private static final Logger f22342U = Logger.getLogger(C8447i.class.getName());

        /* renamed from: N */
        C8175t2<? extends C8473c0<? extends V>> f22343N;

        /* renamed from: O */
        final boolean f22344O;

        /* renamed from: P */
        final AtomicInteger f22345P;

        /* renamed from: Q */
        C8453k<V, C> f22346Q;

        /* renamed from: R */
        List<C7392u<V>> f22347R;

        /* renamed from: S */
        final Object f22348S = new Object();

        /* renamed from: T */
        Set<Throwable> f22349T;

        /* renamed from: com.google.common.util.concurrent.a0$i$a */
        /* compiled from: Futures */
        class C8448a implements Runnable {
            C8448a() {
            }

            public void run() {
                if (C8447i.this.isCancelled()) {
                    Iterator it = C8447i.this.f22343N.iterator();
                    while (it.hasNext()) {
                        ((C8473c0) it.next()).cancel(C8447i.this.mo31656b());
                    }
                }
                C8447i iVar = C8447i.this;
                iVar.f22343N = null;
                iVar.f22347R = null;
                iVar.f22346Q = null;
            }
        }

        /* renamed from: com.google.common.util.concurrent.a0$i$b */
        /* compiled from: Futures */
        class C8449b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f22352a;

            /* renamed from: b */
            final /* synthetic */ C8473c0 f22353b;

            C8449b(int i, C8473c0 c0Var) {
                this.f22352a = i;
                this.f22353b = c0Var;
            }

            public void run() {
                C8447i.this.m40054a(this.f22352a, this.f22353b);
            }
        }

        C8447i(C8175t2<? extends C8473c0<? extends V>> t2Var, boolean z, Executor executor, C8453k<V, C> kVar) {
            this.f22343N = t2Var;
            this.f22344O = z;
            this.f22345P = new AtomicInteger(t2Var.size());
            this.f22346Q = kVar;
            this.f22347R = C8309z3.m39664b(t2Var.size());
            mo31630a(executor);
        }

        /* renamed from: b */
        private void m40056b(Throwable th) {
            boolean z;
            boolean z2;
            if (this.f22344O) {
                z2 = super.mo31655a(th);
                synchronized (this.f22348S) {
                    if (this.f22349T == null) {
                        this.f22349T = C8047m5.m38530c();
                    }
                    z = this.f22349T.add(th);
                }
            } else {
                z2 = false;
                z = true;
            }
            if ((th instanceof Error) || (this.f22344O && !z2 && z)) {
                f22342U.log(Level.SEVERE, "input future failed.", th);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo31630a(Executor executor) {
            mo31637a((Runnable) new C8448a(), (Executor) C8520j0.m40280c());
            if (this.f22343N.isEmpty()) {
                mo31654a(this.f22346Q.mo31626a(C8257x2.m39412m()));
                return;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.f22343N.size(); i2++) {
                this.f22347R.add(null);
            }
            Iterator it = this.f22343N.iterator();
            while (it.hasNext()) {
                C8473c0 c0Var = (C8473c0) it.next();
                int i3 = i + 1;
                c0Var.mo31637a(new C8449b(i, c0Var), executor);
                i = i3;
            }
        }

        /* JADX INFO: used method not loaded: com.google.common.util.concurrent.c.a(java.lang.Object):null, types can be incorrect */
        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
            if (r1 != null) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            mo31654a(r7.mo31626a(r1));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
            if (r1 != null) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0091, code lost:
            if (r1 != null) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ae, code lost:
            if (r1 != null) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0094 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m40054a(int r7, java.util.concurrent.Future<? extends V> r8) {
            /*
                r6 = this;
                java.lang.String r0 = "Less than 0 remaining futures"
                java.util.List<com.google.common.base.u<V>> r1 = r6.f22347R
                boolean r2 = r6.isDone()
                r3 = 1
                r4 = 0
                if (r2 != 0) goto L_0x000e
                if (r1 != 0) goto L_0x0021
            L_0x000e:
                boolean r2 = r6.f22344O
                if (r2 != 0) goto L_0x001b
                boolean r2 = r6.isCancelled()
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                java.lang.String r5 = "Future was done before all dependencies completed"
                com.google.common.base.C7397x.m35677b(r2, r5)
            L_0x0021:
                boolean r2 = r8.isDone()     // Catch:{ CancellationException -> 0x0094, ExecutionException -> 0x0076, all -> 0x005c }
                java.lang.String r5 = "Tried to set value from future which is not done"
                com.google.common.base.C7397x.m35677b(r2, r5)     // Catch:{ CancellationException -> 0x0094, ExecutionException -> 0x0076, all -> 0x005c }
                java.lang.Object r8 = com.google.common.util.concurrent.C8595u0.m40488a(r8)     // Catch:{ CancellationException -> 0x0094, ExecutionException -> 0x0076, all -> 0x005c }
                if (r1 == 0) goto L_0x0037
                com.google.common.base.u r8 = com.google.common.base.C7392u.m35644b(r8)     // Catch:{ CancellationException -> 0x0094, ExecutionException -> 0x0076, all -> 0x005c }
                r1.set(r7, r8)     // Catch:{ CancellationException -> 0x0094, ExecutionException -> 0x0076, all -> 0x005c }
            L_0x0037:
                java.util.concurrent.atomic.AtomicInteger r7 = r6.f22345P
                int r7 = r7.decrementAndGet()
                if (r7 < 0) goto L_0x0040
                goto L_0x0041
            L_0x0040:
                r3 = 0
            L_0x0041:
                com.google.common.base.C7397x.m35677b(r3, r0)
                if (r7 != 0) goto L_0x00b1
                com.google.common.util.concurrent.a0$k<V, C> r7 = r6.f22346Q
                if (r7 == 0) goto L_0x0054
                if (r1 == 0) goto L_0x0054
            L_0x004c:
                java.lang.Object r7 = r7.mo31626a(r1)
                r6.mo31654a(r7)
                goto L_0x00b1
            L_0x0054:
                boolean r7 = r6.isDone()
                com.google.common.base.C7397x.m35676b(r7)
                goto L_0x00b1
            L_0x005c:
                r7 = move-exception
                r6.m40056b(r7)     // Catch:{ all -> 0x00b2 }
                java.util.concurrent.atomic.AtomicInteger r7 = r6.f22345P
                int r7 = r7.decrementAndGet()
                if (r7 < 0) goto L_0x0069
                goto L_0x006a
            L_0x0069:
                r3 = 0
            L_0x006a:
                com.google.common.base.C7397x.m35677b(r3, r0)
                if (r7 != 0) goto L_0x00b1
                com.google.common.util.concurrent.a0$k<V, C> r7 = r6.f22346Q
                if (r7 == 0) goto L_0x0054
                if (r1 == 0) goto L_0x0054
                goto L_0x004c
            L_0x0076:
                r7 = move-exception
                java.lang.Throwable r7 = r7.getCause()     // Catch:{ all -> 0x00b2 }
                r6.m40056b(r7)     // Catch:{ all -> 0x00b2 }
                java.util.concurrent.atomic.AtomicInteger r7 = r6.f22345P
                int r7 = r7.decrementAndGet()
                if (r7 < 0) goto L_0x0087
                goto L_0x0088
            L_0x0087:
                r3 = 0
            L_0x0088:
                com.google.common.base.C7397x.m35677b(r3, r0)
                if (r7 != 0) goto L_0x00b1
                com.google.common.util.concurrent.a0$k<V, C> r7 = r6.f22346Q
                if (r7 == 0) goto L_0x0054
                if (r1 == 0) goto L_0x0054
                goto L_0x004c
            L_0x0094:
                boolean r7 = r6.f22344O     // Catch:{ all -> 0x00b2 }
                if (r7 == 0) goto L_0x009b
                r6.cancel(r4)     // Catch:{ all -> 0x00b2 }
            L_0x009b:
                java.util.concurrent.atomic.AtomicInteger r7 = r6.f22345P
                int r7 = r7.decrementAndGet()
                if (r7 < 0) goto L_0x00a4
                goto L_0x00a5
            L_0x00a4:
                r3 = 0
            L_0x00a5:
                com.google.common.base.C7397x.m35677b(r3, r0)
                if (r7 != 0) goto L_0x00b1
                com.google.common.util.concurrent.a0$k<V, C> r7 = r6.f22346Q
                if (r7 == 0) goto L_0x0054
                if (r1 == 0) goto L_0x0054
                goto L_0x004c
            L_0x00b1:
                return
            L_0x00b2:
                r7 = move-exception
                java.util.concurrent.atomic.AtomicInteger r8 = r6.f22345P
                int r8 = r8.decrementAndGet()
                if (r8 < 0) goto L_0x00bc
                goto L_0x00bd
            L_0x00bc:
                r3 = 0
            L_0x00bd:
                com.google.common.base.C7397x.m35677b(r3, r0)
                if (r8 != 0) goto L_0x00d7
                com.google.common.util.concurrent.a0$k<V, C> r8 = r6.f22346Q
                if (r8 == 0) goto L_0x00d0
                if (r1 == 0) goto L_0x00d0
                java.lang.Object r8 = r8.mo31626a(r1)
                r6.mo31654a(r8)
                goto L_0x00d7
            L_0x00d0:
                boolean r8 = r6.isDone()
                com.google.common.base.C7397x.m35676b(r8)
            L_0x00d7:
                goto L_0x00d9
            L_0x00d8:
                throw r7
            L_0x00d9:
                goto L_0x00d8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C8437a0.C8447i.m40054a(int, java.util.concurrent.Future):void");
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$j */
    /* compiled from: Futures */
    private static class C8450j<V> extends C8471c<V> {
        /* access modifiers changed from: private */

        /* renamed from: N */
        public volatile C8473c0<? extends V> f22354N;

        /* renamed from: com.google.common.util.concurrent.a0$j$a */
        /* compiled from: Futures */
        class C8451a implements C8605y<V> {

            /* renamed from: a */
            final /* synthetic */ C8606z f22355a;

            /* renamed from: com.google.common.util.concurrent.a0$j$a$a */
            /* compiled from: Futures */
            class C8452a implements C8605y<V> {
                C8452a() {
                }

                public void onFailure(Throwable th) {
                    if (C8450j.this.f22354N.isCancelled()) {
                        C8450j.this.cancel(false);
                    } else {
                        C8450j.this.mo31655a(th);
                    }
                }

                public void onSuccess(V v) {
                    C8450j.this.mo31654a(v);
                }
            }

            C8451a(C8606z zVar) {
                this.f22355a = zVar;
            }

            public void onFailure(Throwable th) {
                if (!C8450j.this.isCancelled()) {
                    try {
                        C8450j.this.f22354N = this.f22355a.mo31944a(th);
                        if (C8450j.this.isCancelled()) {
                            C8450j.this.f22354N.cancel(C8450j.this.mo31656b());
                        } else {
                            C8437a0.m40038a(C8450j.this.f22354N, (C8605y<? super V>) new C8452a<Object>(), (Executor) C8520j0.m40280c());
                        }
                    } catch (Throwable th2) {
                        C8450j.this.mo31655a(th2);
                    }
                }
            }

            public void onSuccess(V v) {
                C8450j.this.mo31654a(v);
            }
        }

        C8450j(C8473c0<? extends V> c0Var, C8606z<? extends V> zVar, Executor executor) {
            this.f22354N = c0Var;
            C8437a0.m40038a(this.f22354N, (C8605y<? super V>) new C8451a<Object>(zVar), executor);
        }

        public boolean cancel(boolean z) {
            if (!super.cancel(z)) {
                return false;
            }
            this.f22354N.cancel(z);
            return true;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$k */
    /* compiled from: Futures */
    private interface C8453k<V, C> {
        /* renamed from: a */
        C mo31626a(List<C7392u<V>> list);
    }

    /* renamed from: com.google.common.util.concurrent.a0$l */
    /* compiled from: Futures */
    private static class C8454l<V> extends C8457o<V> {

        /* renamed from: b */
        private final CancellationException f22358b = new CancellationException("Immediate cancelled future.");

        C8454l() {
            super(null);
        }

        public V get() {
            throw C8471c.m40092a("Task was cancelled.", (Throwable) this.f22358b);
        }

        public boolean isCancelled() {
            return true;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$m */
    /* compiled from: Futures */
    private static class C8455m<V, X extends Exception> extends C8457o<V> implements C8564o<V, X> {

        /* renamed from: b */
        private final X f22359b;

        C8455m(X x) {
            super(null);
            this.f22359b = x;
        }

        /* renamed from: a */
        public V mo31614a(long j, TimeUnit timeUnit) throws Exception {
            C7397x.m35664a(timeUnit);
            throw this.f22359b;
        }

        public V get() throws ExecutionException {
            throw new ExecutionException(this.f22359b);
        }

        /* renamed from: l */
        public V mo31615l() throws Exception {
            throw this.f22359b;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$n */
    /* compiled from: Futures */
    private static class C8456n<V> extends C8457o<V> {

        /* renamed from: b */
        private final Throwable f22360b;

        C8456n(Throwable th) {
            super(null);
            this.f22360b = th;
        }

        public V get() throws ExecutionException {
            throw new ExecutionException(this.f22360b);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$o */
    /* compiled from: Futures */
    private static abstract class C8457o<V> implements C8473c0<V> {

        /* renamed from: a */
        private static final Logger f22361a = Logger.getLogger(C8457o.class.getName());

        private C8457o() {
        }

        /* renamed from: a */
        public void mo31637a(Runnable runnable, Executor executor) {
            C7397x.m35665a(runnable, (Object) "Runnable was null.");
            C7397x.m35665a(executor, (Object) "Executor was null.");
            try {
                executor.execute(runnable);
            } catch (RuntimeException e) {
                Logger logger = f22361a;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder();
                sb.append("RuntimeException while executing runnable ");
                sb.append(runnable);
                sb.append(" with executor ");
                sb.append(executor);
                logger.log(level, sb.toString(), e);
            }
        }

        public boolean cancel(boolean z) {
            return false;
        }

        public abstract V get() throws ExecutionException;

        public V get(long j, TimeUnit timeUnit) throws ExecutionException {
            C7397x.m35664a(timeUnit);
            return get();
        }

        public boolean isCancelled() {
            return false;
        }

        public boolean isDone() {
            return true;
        }

        /* synthetic */ C8457o(C8438a aVar) {
            this();
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$p */
    /* compiled from: Futures */
    private static class C8458p<V, X extends Exception> extends C8457o<V> implements C8564o<V, X> {
        @C5952h

        /* renamed from: b */
        private final V f22362b;

        C8458p(@C5952h V v) {
            super(null);
            this.f22362b = v;
        }

        /* renamed from: a */
        public V mo31614a(long j, TimeUnit timeUnit) {
            C7397x.m35664a(timeUnit);
            return this.f22362b;
        }

        public V get() {
            return this.f22362b;
        }

        /* renamed from: l */
        public V mo31615l() {
            return this.f22362b;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$q */
    /* compiled from: Futures */
    private static class C8459q<V> extends C8457o<V> {
        @C5952h

        /* renamed from: b */
        private final V f22363b;

        C8459q(@C5952h V v) {
            super(null);
            this.f22363b = v;
        }

        public V get() {
            return this.f22363b;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$r */
    /* compiled from: Futures */
    private static class C8460r<V, X extends Exception> extends C8436a<V, X> {

        /* renamed from: b */
        final C7380p<Exception, X> f22364b;

        C8460r(C8473c0<V> c0Var, C7380p<Exception, X> pVar) {
            super(c0Var);
            this.f22364b = (C7380p) C7397x.m35664a(pVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public X mo31613a(Exception exc) {
            return (Exception) this.f22364b.apply(exc);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a0$s */
    /* compiled from: Futures */
    private static class C8461s<V> extends C8471c<V> {

        /* renamed from: com.google.common.util.concurrent.a0$s$a */
        /* compiled from: Futures */
        class C8462a implements C8605y<V> {

            /* renamed from: a */
            final /* synthetic */ C8473c0 f22365a;

            C8462a(C8473c0 c0Var) {
                this.f22365a = c0Var;
            }

            public void onFailure(Throwable th) {
                if (this.f22365a.isCancelled()) {
                    C8461s.this.cancel(false);
                } else {
                    C8461s.this.mo31655a(th);
                }
            }

            public void onSuccess(V v) {
                C8461s.this.mo31654a(v);
            }
        }

        C8461s(C8473c0<V> c0Var) {
            C7397x.m35664a(c0Var);
            C8437a0.m40038a(c0Var, (C8605y<? super V>) new C8462a<Object>(c0Var), (Executor) C8520j0.m40280c());
        }
    }

    private C8437a0() {
    }

    /* renamed from: a */
    public static <V, X extends Exception> C8564o<V, X> m40027a(C8473c0<V> c0Var, C7380p<Exception, X> pVar) {
        return new C8460r((C8473c0) C7397x.m35664a(c0Var), pVar);
    }

    /* renamed from: b */
    public static <V> C8473c0<V> m40043b(@C5952h V v) {
        return new C8459q(v);
    }

    @C2775a
    /* renamed from: c */
    public static <V> C8473c0<List<V>> m40046c(Iterable<? extends C8473c0<? extends V>> iterable) {
        return m40017a(C8257x2.m39392a(iterable), false, (Executor) C8520j0.m40280c());
    }

    /* renamed from: a */
    public static <V, X extends Exception> C8564o<V, X> m40029a(@C5952h V v) {
        return new C8458p(v);
    }

    /* renamed from: b */
    public static <I, O> C8473c0<O> m40042b(C8473c0<I> c0Var, C7380p<? super I, ? extends O> pVar) {
        return m40019a(c0Var, pVar, (Executor) C8520j0.m40280c());
    }

    /* renamed from: a */
    public static <V> C8473c0<V> m40025a(Throwable th) {
        C7397x.m35664a(th);
        return new C8456n(th);
    }

    /* renamed from: b */
    public static <V> C8473c0<V> m40041b(C8473c0<V> c0Var) {
        return new C8461s(c0Var);
    }

    @C2775a
    /* renamed from: b */
    public static <V> C8473c0<List<V>> m40044b(C8473c0<? extends V>... c0VarArr) {
        return m40017a(C8257x2.m39410c(c0VarArr), false, (Executor) C8520j0.m40280c());
    }

    /* renamed from: a */
    public static <V> C8473c0<V> m40016a() {
        return new C8454l();
    }

    @C2775a
    /* renamed from: b */
    public static <T> C8257x2<C8473c0<T>> m40040b(Iterable<? extends C8473c0<? extends T>> iterable) {
        ConcurrentLinkedQueue a = C8216u4.m39185a();
        C8259b l = C8257x2.m39411l();
        C8544m0 m0Var = new C8544m0(C8520j0.m40280c());
        for (C8473c0 c0Var : iterable) {
            C8514i A = C8514i.m40209A();
            a.add(A);
            c0Var.mo31637a(new C8441d(a, c0Var), m0Var);
            l.m39420a((Object) A);
        }
        return l.mo30346a();
    }

    /* renamed from: a */
    public static <V, X extends Exception> C8564o<V, X> m40028a(X x) {
        C7397x.m35664a(x);
        return new C8455m(x);
    }

    /* renamed from: a */
    public static <V> C8473c0<V> m40022a(C8473c0<? extends V> c0Var, C8606z<? extends V> zVar) {
        return m40023a(c0Var, zVar, (Executor) C8520j0.m40280c());
    }

    /* renamed from: a */
    public static <V> C8473c0<V> m40023a(C8473c0<? extends V> c0Var, C8606z<? extends V> zVar, Executor executor) {
        C7397x.m35664a(zVar);
        return new C8450j(c0Var, zVar, executor);
    }

    /* renamed from: a */
    public static <I, O> C8473c0<O> m40020a(C8473c0<I> c0Var, C8512h<? super I, ? extends O> hVar) {
        return m40021a(c0Var, hVar, (Executor) C8520j0.m40280c());
    }

    /* renamed from: a */
    public static <I, O> C8473c0<O> m40021a(C8473c0<I> c0Var, C8512h<? super I, ? extends O> hVar, Executor executor) {
        C8445h hVar2 = new C8445h(hVar, c0Var, null);
        c0Var.mo31637a(hVar2, executor);
        return hVar2;
    }

    /* renamed from: a */
    public static <I, O> C8473c0<O> m40019a(C8473c0<I> c0Var, C7380p<? super I, ? extends O> pVar, Executor executor) {
        C7397x.m35664a(pVar);
        return m40021a(c0Var, (C8512h<? super I, ? extends O>) new C8438a<Object,Object>(pVar), executor);
    }

    /* renamed from: b */
    private static void m40045b(Throwable th) {
        if (th instanceof Error) {
            throw new C8566p((Error) th);
        }
        throw new UncheckedExecutionException(th);
    }

    /* renamed from: a */
    public static <I, O> Future<O> m40036a(Future<I> future, C7380p<? super I, ? extends O> pVar) {
        C7397x.m35664a(future);
        C7397x.m35664a(pVar);
        return new C8439b(future, pVar);
    }

    /* renamed from: a */
    public static <V> C8473c0<V> m40018a(C8473c0<? extends C8473c0<? extends V>> c0Var) {
        return m40020a(c0Var, f22327a);
    }

    @C2775a
    /* renamed from: a */
    public static <V> C8473c0<List<V>> m40026a(C8473c0<? extends V>... c0VarArr) {
        return m40017a(C8257x2.m39410c(c0VarArr), true, (Executor) C8520j0.m40280c());
    }

    @C2775a
    /* renamed from: a */
    public static <V> C8473c0<List<V>> m40024a(Iterable<? extends C8473c0<? extends V>> iterable) {
        return m40017a(C8257x2.m39392a(iterable), true, (Executor) C8520j0.m40280c());
    }

    /* renamed from: a */
    public static <V> void m40037a(C8473c0<V> c0Var, C8605y<? super V> yVar) {
        m40038a(c0Var, yVar, (Executor) C8520j0.m40280c());
    }

    /* renamed from: a */
    public static <V> void m40038a(C8473c0<V> c0Var, C8605y<? super V> yVar, Executor executor) {
        C7397x.m35664a(yVar);
        c0Var.mo31637a(new C8442e(c0Var, yVar), executor);
    }

    /* renamed from: a */
    public static <V, X extends Exception> V m40034a(Future<V> future, Class<X> cls) throws Exception {
        C7397x.m35664a(future);
        C7397x.m35672a(!RuntimeException.class.isAssignableFrom(cls), "Futures.get exception type (%s) must not be a RuntimeException", cls);
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw m40030a(cls, (Throwable) e);
        } catch (ExecutionException e2) {
            m40039a(e2.getCause(), cls);
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public static <V, X extends Exception> V m40033a(Future<V> future, long j, TimeUnit timeUnit, Class<X> cls) throws Exception {
        C7397x.m35664a(future);
        C7397x.m35664a(timeUnit);
        C7397x.m35672a(!RuntimeException.class.isAssignableFrom(cls), "Futures.get exception type (%s) must not be a RuntimeException", cls);
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw m40030a(cls, (Throwable) e);
        } catch (TimeoutException e2) {
            throw m40030a(cls, (Throwable) e2);
        } catch (ExecutionException e3) {
            m40039a(e3.getCause(), cls);
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private static <X extends Exception> void m40039a(Throwable th, Class<X> cls) throws Exception {
        if (th instanceof Error) {
            throw new C8566p((Error) th);
        } else if (th instanceof RuntimeException) {
            throw new UncheckedExecutionException(th);
        } else {
            throw m40030a(cls, th);
        }
    }

    /* renamed from: a */
    public static <V> V m40032a(Future<V> future) {
        C7397x.m35664a(future);
        try {
            return C8595u0.m40488a(future);
        } catch (ExecutionException e) {
            m40045b(e.getCause());
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private static <X extends Exception> X m40030a(Class<X> cls, Throwable th) {
        for (Constructor a : m40035a(Arrays.asList(cls.getConstructors()))) {
            X x = (Exception) m40031a(a, th);
            if (x != null) {
                if (x.getCause() == null) {
                    x.initCause(th);
                }
                return x;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No appropriate constructor for exception of type ");
        sb.append(cls);
        sb.append(" in response to chained exception");
        throw new IllegalArgumentException(sb.toString(), th);
    }

    /* renamed from: a */
    private static <X extends Exception> List<Constructor<X>> m40035a(List<Constructor<X>> list) {
        return f22328b.mo30931f(list);
    }

    @C5952h
    /* renamed from: a */
    private static <X> X m40031a(Constructor<X> constructor, Throwable th) {
        Class[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else if (!cls.equals(Throwable.class)) {
                return null;
            } else {
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static <V> C8473c0<List<V>> m40017a(C8257x2<C8473c0<? extends V>> x2Var, boolean z, Executor executor) {
        return new C8447i(x2Var, z, executor, new C8444g());
    }
}
