package com.google.common.util.concurrent;

import com.google.common.base.C7344g0;
import com.google.common.base.C7358i0;
import com.google.common.base.C7397x;
import com.google.common.util.concurrent.C8600w.C8601a;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2778d;

/* renamed from: com.google.common.util.concurrent.j0 */
/* compiled from: MoreExecutors */
public final class C8520j0 {

    /* renamed from: com.google.common.util.concurrent.j0$a */
    /* compiled from: MoreExecutors */
    static class C8521a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BlockingQueue f22469a;

        /* renamed from: b */
        final /* synthetic */ C8473c0 f22470b;

        C8521a(BlockingQueue blockingQueue, C8473c0 c0Var) {
            this.f22469a = blockingQueue;
            this.f22470b = c0Var;
        }

        public void run() {
            this.f22469a.add(this.f22470b);
        }
    }

    /* renamed from: com.google.common.util.concurrent.j0$b */
    /* compiled from: MoreExecutors */
    static class C8522b implements Executor {

        /* renamed from: a */
        final /* synthetic */ Executor f22471a;

        /* renamed from: b */
        final /* synthetic */ C7344g0 f22472b;

        C8522b(Executor executor, C7344g0 g0Var) {
            this.f22471a = executor;
            this.f22472b = g0Var;
        }

        public void execute(Runnable runnable) {
            this.f22471a.execute(C8547n.m40367a(runnable, this.f22472b));
        }
    }

    /* renamed from: com.google.common.util.concurrent.j0$c */
    /* compiled from: MoreExecutors */
    static class C8523c extends C8598v0 {

        /* renamed from: b */
        final /* synthetic */ C7344g0 f22473b;

        C8523c(ExecutorService executorService, C7344g0 g0Var) {
            this.f22473b = g0Var;
            super(executorService);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public <T> Callable<T> mo31773a(Callable<T> callable) {
            return C8547n.m40369a(callable, this.f22473b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Runnable mo31772a(Runnable runnable) {
            return C8547n.m40367a(runnable, this.f22473b);
        }
    }

    /* renamed from: com.google.common.util.concurrent.j0$d */
    /* compiled from: MoreExecutors */
    static class C8524d extends C8602w0 {

        /* renamed from: N */
        final /* synthetic */ C7344g0 f22474N;

        C8524d(ScheduledExecutorService scheduledExecutorService, C7344g0 g0Var) {
            this.f22474N = g0Var;
            super(scheduledExecutorService);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public <T> Callable<T> mo31773a(Callable<T> callable) {
            return C8547n.m40369a(callable, this.f22474N);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Runnable mo31772a(Runnable runnable) {
            return C8547n.m40367a(runnable, this.f22474N);
        }
    }

    @C2778d
    /* renamed from: com.google.common.util.concurrent.j0$e */
    /* compiled from: MoreExecutors */
    static class C8525e {

        /* renamed from: com.google.common.util.concurrent.j0$e$a */
        /* compiled from: MoreExecutors */
        class C8526a implements Runnable {

            /* renamed from: N */
            final /* synthetic */ TimeUnit f22475N;

            /* renamed from: a */
            final /* synthetic */ ExecutorService f22477a;

            /* renamed from: b */
            final /* synthetic */ long f22478b;

            C8526a(ExecutorService executorService, long j, TimeUnit timeUnit) {
                this.f22477a = executorService;
                this.f22478b = j;
                this.f22475N = timeUnit;
            }

            public void run() {
                try {
                    this.f22477a.shutdown();
                    this.f22477a.awaitTermination(this.f22478b, this.f22475N);
                } catch (InterruptedException unused) {
                }
            }
        }

        C8525e() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ExecutorService mo31775a(ThreadPoolExecutor threadPoolExecutor, long j, TimeUnit timeUnit) {
            C8520j0.m40281c(threadPoolExecutor);
            ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
            mo31779a(unconfigurableExecutorService, j, timeUnit);
            return unconfigurableExecutorService;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ScheduledExecutorService mo31777a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, TimeUnit timeUnit) {
            C8520j0.m40281c(scheduledThreadPoolExecutor);
            ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
            mo31779a((ExecutorService) unconfigurableScheduledExecutorService, j, timeUnit);
            return unconfigurableScheduledExecutorService;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo31779a(ExecutorService executorService, long j, TimeUnit timeUnit) {
            C7397x.m35664a(executorService);
            C7397x.m35664a(timeUnit);
            StringBuilder sb = new StringBuilder();
            sb.append("DelayedShutdownHook-for-");
            sb.append(executorService);
            String sb2 = sb.toString();
            C8526a aVar = new C8526a(executorService, j, timeUnit);
            mo31778a(C8520j0.m40267a(sb2, (Runnable) aVar));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ExecutorService mo31774a(ThreadPoolExecutor threadPoolExecutor) {
            return mo31775a(threadPoolExecutor, 120, TimeUnit.SECONDS);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ScheduledExecutorService mo31776a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
            return mo31777a(scheduledThreadPoolExecutor, 120, TimeUnit.SECONDS);
        }

        /* access modifiers changed from: 0000 */
        @C2778d
        /* renamed from: a */
        public void mo31778a(Thread thread) {
            Runtime.getRuntime().addShutdownHook(thread);
        }
    }

    /* renamed from: com.google.common.util.concurrent.j0$f */
    /* compiled from: MoreExecutors */
    private static class C8527f extends C8481e {

        /* renamed from: a */
        private final ExecutorService f22479a;

        C8527f(ExecutorService executorService) {
            this.f22479a = (ExecutorService) C7397x.m35664a(executorService);
        }

        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f22479a.awaitTermination(j, timeUnit);
        }

        public void execute(Runnable runnable) {
            this.f22479a.execute(runnable);
        }

        public boolean isShutdown() {
            return this.f22479a.isShutdown();
        }

        public boolean isTerminated() {
            return this.f22479a.isTerminated();
        }

        public void shutdown() {
            this.f22479a.shutdown();
        }

        public List<Runnable> shutdownNow() {
            return this.f22479a.shutdownNow();
        }
    }

    /* renamed from: com.google.common.util.concurrent.j0$g */
    /* compiled from: MoreExecutors */
    private static class C8528g extends C8481e {

        /* renamed from: N */
        private int f22480N;

        /* renamed from: O */
        private boolean f22481O;

        /* renamed from: a */
        private final Lock f22482a;

        /* renamed from: b */
        private final Condition f22483b;

        private C8528g() {
            this.f22482a = new ReentrantLock();
            this.f22483b = this.f22482a.newCondition();
            this.f22480N = 0;
            this.f22481O = false;
        }

        /* renamed from: a */
        private void m40292a() {
            this.f22482a.lock();
            try {
                this.f22480N--;
                if (isTerminated()) {
                    this.f22483b.signalAll();
                }
            } finally {
                this.f22482a.unlock();
            }
        }

        /* renamed from: b */
        private void m40293b() {
            this.f22482a.lock();
            try {
                if (!isShutdown()) {
                    this.f22480N++;
                    return;
                }
                throw new RejectedExecutionException("Executor already shutdown");
            } finally {
                this.f22482a.unlock();
            }
        }

        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            boolean z;
            long nanos = timeUnit.toNanos(j);
            this.f22482a.lock();
            while (true) {
                try {
                    if (isTerminated()) {
                        z = true;
                        break;
                    } else if (nanos <= 0) {
                        z = false;
                        break;
                    } else {
                        nanos = this.f22483b.awaitNanos(nanos);
                    }
                } finally {
                    this.f22482a.unlock();
                }
            }
            return z;
        }

        public void execute(Runnable runnable) {
            m40293b();
            try {
                runnable.run();
            } finally {
                m40292a();
            }
        }

        public boolean isShutdown() {
            this.f22482a.lock();
            try {
                return this.f22481O;
            } finally {
                this.f22482a.unlock();
            }
        }

        public boolean isTerminated() {
            this.f22482a.lock();
            try {
                return this.f22481O && this.f22480N == 0;
            } finally {
                this.f22482a.unlock();
            }
        }

        public void shutdown() {
            this.f22482a.lock();
            try {
                this.f22481O = true;
            } finally {
                this.f22482a.unlock();
            }
        }

        public List<Runnable> shutdownNow() {
            shutdown();
            return Collections.emptyList();
        }

        /* synthetic */ C8528g(C8521a aVar) {
            this();
        }
    }

    /* renamed from: com.google.common.util.concurrent.j0$h */
    /* compiled from: MoreExecutors */
    private static class C8529h extends C8527f implements C8513h0 {

        /* renamed from: b */
        final ScheduledExecutorService f22484b;

        /* renamed from: com.google.common.util.concurrent.j0$h$a */
        /* compiled from: MoreExecutors */
        private static final class C8530a<V> extends C8601a<V> implements C8482e0<V> {

            /* renamed from: b */
            private final ScheduledFuture<?> f22485b;

            public C8530a(C8473c0<V> c0Var, ScheduledFuture<?> scheduledFuture) {
                super(c0Var);
                this.f22485b = scheduledFuture;
            }

            /* renamed from: a */
            public int compareTo(Delayed delayed) {
                return this.f22485b.compareTo(delayed);
            }

            public boolean cancel(boolean z) {
                boolean cancel = super.cancel(z);
                if (cancel) {
                    this.f22485b.cancel(z);
                }
                return cancel;
            }

            public long getDelay(TimeUnit timeUnit) {
                return this.f22485b.getDelay(timeUnit);
            }
        }

        /* renamed from: com.google.common.util.concurrent.j0$h$b */
        /* compiled from: MoreExecutors */
        private static final class C8531b extends C8471c<Void> implements Runnable {

            /* renamed from: N */
            private final Runnable f22486N;

            public C8531b(Runnable runnable) {
                this.f22486N = (Runnable) C7397x.m35664a(runnable);
            }

            public void run() {
                try {
                    this.f22486N.run();
                } catch (Throwable th) {
                    mo31655a(th);
                    throw C7358i0.m35589d(th);
                }
            }
        }

        C8529h(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f22484b = (ScheduledExecutorService) C7397x.m35664a(scheduledExecutorService);
        }

        public C8482e0<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            C8531b bVar = new C8531b(runnable);
            return new C8530a(bVar, this.f22484b.scheduleAtFixedRate(bVar, j, j2, timeUnit));
        }

        public C8482e0<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            C8531b bVar = new C8531b(runnable);
            return new C8530a(bVar, this.f22484b.scheduleWithFixedDelay(bVar, j, j2, timeUnit));
        }

        public C8482e0<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            C8480d0 a = C8480d0.m40125a(runnable, null);
            return new C8530a(a, this.f22484b.schedule(a, j, timeUnit));
        }

        public <V> C8482e0<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            C8480d0 a = C8480d0.m40126a(callable);
            return new C8530a(a, this.f22484b.schedule(a, j, timeUnit));
        }
    }

    private C8520j0() {
    }

    @C2775a
    /* renamed from: b */
    public static ExecutorService m40277b(ThreadPoolExecutor threadPoolExecutor) {
        return new C8525e().mo31774a(threadPoolExecutor);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m40281c(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setThreadFactory(new C8586r0().mo31898a(true).mo31897a(threadPoolExecutor.getThreadFactory()).mo31899a());
    }

    @C2775a
    /* renamed from: a */
    public static ExecutorService m40270a(ThreadPoolExecutor threadPoolExecutor, long j, TimeUnit timeUnit) {
        return new C8525e().mo31775a(threadPoolExecutor, j, timeUnit);
    }

    @C2775a
    /* renamed from: b */
    public static ThreadFactory m40278b() {
        String str = "Couldn't invoke ThreadManager.currentRequestThreadFactory";
        if (!m40276a()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke(null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(str, e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(str, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(str, e3);
        } catch (InvocationTargetException e4) {
            throw C7358i0.m35589d(e4.getCause());
        }
    }

    /* renamed from: c */
    public static C8511g0 m40280c() {
        return new C8528g(null);
    }

    @C2775a
    /* renamed from: a */
    public static ScheduledExecutorService m40273a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, TimeUnit timeUnit) {
        return new C8525e().mo31777a(scheduledThreadPoolExecutor, j, timeUnit);
    }

    @C2775a
    /* renamed from: a */
    public static void m40274a(ExecutorService executorService, long j, TimeUnit timeUnit) {
        new C8525e().mo31779a(executorService, j, timeUnit);
    }

    @C2775a
    /* renamed from: a */
    public static ScheduledExecutorService m40272a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return new C8525e().mo31776a(scheduledThreadPoolExecutor);
    }

    /* renamed from: a */
    public static C8511g0 m40264a(ExecutorService executorService) {
        if (executorService instanceof C8511g0) {
            return (C8511g0) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new C8529h((ScheduledExecutorService) executorService) : new C8527f(executorService);
    }

    /* renamed from: a */
    public static C8513h0 m40265a(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof C8513h0 ? (C8513h0) scheduledExecutorService : new C8529h(scheduledExecutorService);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00af A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> T m40266a(com.google.common.util.concurrent.C8511g0 r16, java.util.Collection<? extends java.util.concurrent.Callable<T>> r17, boolean r18, long r19) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        /*
            r1 = r16
            com.google.common.base.C7397x.m35664a(r16)
            int r0 = r17.size()
            r2 = 1
            if (r0 <= 0) goto L_0x000e
            r3 = 1
            goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            com.google.common.base.C7397x.m35670a(r3)
            java.util.ArrayList r3 = com.google.common.collect.C8309z3.m39664b(r0)
            java.util.concurrent.LinkedBlockingQueue r4 = com.google.common.collect.C8216u4.m39188b()
            if (r18 == 0) goto L_0x0024
            long r5 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0021 }
            goto L_0x0026
        L_0x0021:
            r0 = move-exception
            goto L_0x00b3
        L_0x0024:
            r5 = 0
        L_0x0026:
            java.util.Iterator r7 = r17.iterator()     // Catch:{ all -> 0x0021 }
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0021 }
            java.util.concurrent.Callable r8 = (java.util.concurrent.Callable) r8     // Catch:{ all -> 0x0021 }
            com.google.common.util.concurrent.c0 r8 = m40263a(r1, r8, r4)     // Catch:{ all -> 0x0021 }
            r3.add(r8)     // Catch:{ all -> 0x0021 }
            int r0 = r0 + -1
            r8 = 0
            r9 = r19
            r11 = r5
            r6 = r8
            r5 = 1
        L_0x003f:
            java.lang.Object r13 = r4.poll()     // Catch:{ all -> 0x0021 }
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch:{ all -> 0x0021 }
            if (r13 != 0) goto L_0x0085
            if (r0 <= 0) goto L_0x005b
            int r0 = r0 + -1
            java.lang.Object r14 = r7.next()     // Catch:{ all -> 0x0021 }
            java.util.concurrent.Callable r14 = (java.util.concurrent.Callable) r14     // Catch:{ all -> 0x0021 }
            com.google.common.util.concurrent.c0 r14 = m40263a(r1, r14, r4)     // Catch:{ all -> 0x0021 }
            r3.add(r14)     // Catch:{ all -> 0x0021 }
            int r5 = r5 + 1
            goto L_0x0085
        L_0x005b:
            if (r5 != 0) goto L_0x0065
            if (r6 != 0) goto L_0x0064
            java.util.concurrent.ExecutionException r6 = new java.util.concurrent.ExecutionException     // Catch:{ all -> 0x0021 }
            r6.<init>(r8)     // Catch:{ all -> 0x0021 }
        L_0x0064:
            throw r6     // Catch:{ all -> 0x0021 }
        L_0x0065:
            if (r18 == 0) goto L_0x007f
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0021 }
            java.lang.Object r13 = r4.poll(r9, r13)     // Catch:{ all -> 0x0021 }
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch:{ all -> 0x0021 }
            if (r13 == 0) goto L_0x0079
            long r14 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0021 }
            long r11 = r14 - r11
            long r9 = r9 - r11
            goto L_0x0086
        L_0x0079:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0021 }
            r0.<init>()     // Catch:{ all -> 0x0021 }
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x007f:
            java.lang.Object r13 = r4.take()     // Catch:{ all -> 0x0021 }
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch:{ all -> 0x0021 }
        L_0x0085:
            r14 = r11
        L_0x0086:
            r10 = r9
            r9 = r0
            if (r13 == 0) goto L_0x00af
            int r5 = r5 + -1
            java.lang.Object r0 = r13.get()     // Catch:{ ExecutionException -> 0x00ad, RuntimeException -> 0x00a5 }
            java.util.Iterator r1 = r3.iterator()
        L_0x0094:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00a4
            java.lang.Object r3 = r1.next()
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            r3.cancel(r2)
            goto L_0x0094
        L_0x00a4:
            return r0
        L_0x00a5:
            r0 = move-exception
            r6 = r0
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException     // Catch:{ all -> 0x0021 }
            r0.<init>(r6)     // Catch:{ all -> 0x0021 }
            goto L_0x00ae
        L_0x00ad:
            r0 = move-exception
        L_0x00ae:
            r6 = r0
        L_0x00af:
            r0 = r9
            r9 = r10
            r11 = r14
            goto L_0x003f
        L_0x00b3:
            java.util.Iterator r1 = r3.iterator()
        L_0x00b7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00c7
            java.lang.Object r3 = r1.next()
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            r3.cancel(r2)
            goto L_0x00b7
        L_0x00c7:
            goto L_0x00c9
        L_0x00c8:
            throw r0
        L_0x00c9:
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C8520j0.m40266a(com.google.common.util.concurrent.g0, java.util.Collection, boolean, long):java.lang.Object");
    }

    @C2775a
    /* renamed from: b */
    public static boolean m40279b(ExecutorService executorService, long j, TimeUnit timeUnit) {
        C7397x.m35664a(timeUnit);
        executorService.shutdown();
        try {
            long convert = TimeUnit.NANOSECONDS.convert(j, timeUnit) / 2;
            if (!executorService.awaitTermination(convert, TimeUnit.NANOSECONDS)) {
                executorService.shutdownNow();
                executorService.awaitTermination(convert, TimeUnit.NANOSECONDS);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        return executorService.isTerminated();
    }

    /* renamed from: a */
    private static <T> C8473c0<T> m40263a(C8511g0 g0Var, Callable<T> callable, BlockingQueue<Future<T>> blockingQueue) {
        C8473c0<T> submit = g0Var.submit(callable);
        submit.mo31637a(new C8521a(blockingQueue, submit), m40280c());
        return submit;
    }

    /* renamed from: a */
    private static boolean m40276a() {
        boolean z = false;
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            if (Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new Class[0]).invoke(null, new Object[0]) != null) {
                z = true;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return z;
    }

    /* renamed from: a */
    static Thread m40267a(String str, Runnable runnable) {
        C7397x.m35664a(str);
        C7397x.m35664a(runnable);
        Thread newThread = m40278b().newThread(runnable);
        try {
            newThread.setName(str);
        } catch (SecurityException unused) {
        }
        return newThread;
    }

    /* renamed from: a */
    static Executor m40268a(Executor executor, C7344g0<String> g0Var) {
        C7397x.m35664a(executor);
        C7397x.m35664a(g0Var);
        if (m40276a()) {
            return executor;
        }
        return new C8522b(executor, g0Var);
    }

    /* renamed from: a */
    static ExecutorService m40269a(ExecutorService executorService, C7344g0<String> g0Var) {
        C7397x.m35664a(executorService);
        C7397x.m35664a(g0Var);
        if (m40276a()) {
            return executorService;
        }
        return new C8523c(executorService, g0Var);
    }

    /* renamed from: a */
    static ScheduledExecutorService m40271a(ScheduledExecutorService scheduledExecutorService, C7344g0<String> g0Var) {
        C7397x.m35664a(scheduledExecutorService);
        C7397x.m35664a(g0Var);
        if (m40276a()) {
            return scheduledExecutorService;
        }
        return new C8524d(scheduledExecutorService, g0Var);
    }
}
