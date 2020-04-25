package com.google.common.util.concurrent;

import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.common.base.C7344g0;
import com.google.common.base.C7358i0;
import com.google.common.base.C7397x;
import com.google.common.util.concurrent.Service.C8435b;
import com.google.common.util.concurrent.Service.State;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.p203u.C5966a;

@C2775a
/* renamed from: com.google.common.util.concurrent.f */
/* compiled from: AbstractScheduledService */
public abstract class C8483f implements Service {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Logger f22397b = Logger.getLogger(C8483f.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8499g f22398a = new C8484a();

    /* renamed from: com.google.common.util.concurrent.f$a */
    /* compiled from: AbstractScheduledService */
    class C8484a extends C8499g {
        /* access modifiers changed from: private */

        /* renamed from: o */
        public volatile Future<?> f22399o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public volatile ScheduledExecutorService f22400p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public final ReentrantLock f22401q = new ReentrantLock();
        /* access modifiers changed from: private */

        /* renamed from: r */
        public final Runnable f22402r = new C8485a();

        /* renamed from: com.google.common.util.concurrent.f$a$a */
        /* compiled from: AbstractScheduledService */
        class C8485a implements Runnable {
            C8485a() {
            }

            public void run() {
                C8484a.this.f22401q.lock();
                try {
                    C8483f.this.mo31688h();
                    C8484a.this.f22401q.unlock();
                } catch (Throwable th) {
                    C8484a.this.f22401q.unlock();
                    throw th;
                }
            }
        }

        /* renamed from: com.google.common.util.concurrent.f$a$b */
        /* compiled from: AbstractScheduledService */
        class C8486b implements C7344g0<String> {
            C8486b() {
            }

            public String get() {
                StringBuilder sb = new StringBuilder();
                sb.append(C8483f.this.mo31690j());
                sb.append(C3868i.f12248b);
                sb.append(C8484a.this.mo31597a());
                return sb.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.f$a$c */
        /* compiled from: AbstractScheduledService */
        class C8487c implements Runnable {
            C8487c() {
            }

            public void run() {
                C8484a.this.f22401q.lock();
                try {
                    C8483f.this.mo31692l();
                    C8484a.this.f22399o = C8483f.this.mo31689i().mo31699a(C8483f.this.f22398a, C8484a.this.f22400p, C8484a.this.f22402r);
                    C8484a.this.mo31709i();
                    C8484a.this.f22401q.unlock();
                } catch (Throwable th) {
                    C8484a.this.f22401q.unlock();
                    throw th;
                }
            }
        }

        /* renamed from: com.google.common.util.concurrent.f$a$d */
        /* compiled from: AbstractScheduledService */
        class C8488d implements Runnable {
            C8488d() {
            }

            public void run() {
                try {
                    C8484a.this.f22401q.lock();
                    if (C8484a.this.mo31597a() != State.STOPPING) {
                        C8484a.this.f22401q.unlock();
                        return;
                    }
                    C8483f.this.mo31691k();
                    C8484a.this.f22401q.unlock();
                    C8484a.this.mo31710j();
                } catch (Throwable th) {
                    C8484a.this.mo31708a(th);
                    throw C7358i0.m35589d(th);
                }
            }
        }

        C8484a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final void mo31648g() {
            this.f22400p = C8520j0.m40271a(C8483f.this.mo31687g(), (C7344g0<String>) new C8486b<String>());
            this.f22400p.execute(new C8487c());
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public final void mo31649h() {
            this.f22399o.cancel(false);
            this.f22400p.execute(new C8488d());
        }
    }

    /* renamed from: com.google.common.util.concurrent.f$b */
    /* compiled from: AbstractScheduledService */
    class C8489b implements ThreadFactory {
        C8489b() {
        }

        public Thread newThread(Runnable runnable) {
            return C8520j0.m40267a(C8483f.this.mo31690j(), runnable);
        }
    }

    /* renamed from: com.google.common.util.concurrent.f$c */
    /* compiled from: AbstractScheduledService */
    class C8490c extends C8435b {

        /* renamed from: a */
        final /* synthetic */ ScheduledExecutorService f22409a;

        C8490c(ScheduledExecutorService scheduledExecutorService) {
            this.f22409a = scheduledExecutorService;
        }

        /* renamed from: a */
        public void mo31610a(State state, Throwable th) {
            this.f22409a.shutdown();
        }

        /* renamed from: b */
        public void mo31612b(State state) {
            this.f22409a.shutdown();
        }
    }

    @C2775a
    /* renamed from: com.google.common.util.concurrent.f$d */
    /* compiled from: AbstractScheduledService */
    public static abstract class C8491d extends C8494e {

        /* renamed from: com.google.common.util.concurrent.f$d$a */
        /* compiled from: AbstractScheduledService */
        private class C8492a extends C8596v<Void> implements Callable<Void> {

            /* renamed from: N */
            private final C8499g f22411N;

            /* renamed from: O */
            private final ReentrantLock f22412O = new ReentrantLock();
            @C5966a("lock")

            /* renamed from: P */
            private Future<Void> f22413P;

            /* renamed from: a */
            private final Runnable f22415a;

            /* renamed from: b */
            private final ScheduledExecutorService f22416b;

            C8492a(C8499g gVar, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                this.f22415a = runnable;
                this.f22416b = scheduledExecutorService;
                this.f22411N = gVar;
            }

            public boolean cancel(boolean z) {
                this.f22412O.lock();
                try {
                    return this.f22413P.cancel(z);
                } finally {
                    this.f22412O.unlock();
                }
            }

            /* renamed from: z */
            public void mo31702z() {
                this.f22412O.lock();
                try {
                    if (this.f22413P == null || !this.f22413P.isCancelled()) {
                        C8493b a = C8491d.this.mo31698a();
                        this.f22413P = this.f22416b.schedule(this, a.f22417a, a.f22418b);
                    }
                } catch (Throwable th) {
                    this.f22412O.unlock();
                    throw th;
                }
                this.f22412O.unlock();
            }

            public Void call() throws Exception {
                this.f22415a.run();
                mo31702z();
                return null;
            }

            /* access modifiers changed from: protected */
            /* renamed from: y */
            public Future<Void> m40156y() {
                throw new UnsupportedOperationException("Only cancel is supported by this future");
            }
        }

        @C2775a
        /* renamed from: com.google.common.util.concurrent.f$d$b */
        /* compiled from: AbstractScheduledService */
        protected static final class C8493b {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public final long f22417a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public final TimeUnit f22418b;

            public C8493b(long j, TimeUnit timeUnit) {
                this.f22417a = j;
                this.f22418b = (TimeUnit) C7397x.m35664a(timeUnit);
            }
        }

        public C8491d() {
            super(null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract C8493b mo31698a() throws Exception;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Future<?> mo31699a(C8499g gVar, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            C8492a aVar = new C8492a(gVar, scheduledExecutorService, runnable);
            aVar.mo31702z();
            return aVar;
        }
    }

    /* renamed from: com.google.common.util.concurrent.f$e */
    /* compiled from: AbstractScheduledService */
    public static abstract class C8494e {

        /* renamed from: com.google.common.util.concurrent.f$e$a */
        /* compiled from: AbstractScheduledService */
        static class C8495a extends C8494e {

            /* renamed from: a */
            final /* synthetic */ long f22419a;

            /* renamed from: b */
            final /* synthetic */ long f22420b;

            /* renamed from: c */
            final /* synthetic */ TimeUnit f22421c;

            C8495a(long j, long j2, TimeUnit timeUnit) {
                this.f22419a = j;
                this.f22420b = j2;
                this.f22421c = timeUnit;
                super(null);
            }

            /* renamed from: a */
            public Future<?> mo31699a(C8499g gVar, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return scheduledExecutorService.scheduleWithFixedDelay(runnable, this.f22419a, this.f22420b, this.f22421c);
            }
        }

        /* renamed from: com.google.common.util.concurrent.f$e$b */
        /* compiled from: AbstractScheduledService */
        static class C8496b extends C8494e {

            /* renamed from: a */
            final /* synthetic */ long f22422a;

            /* renamed from: b */
            final /* synthetic */ long f22423b;

            /* renamed from: c */
            final /* synthetic */ TimeUnit f22424c;

            C8496b(long j, long j2, TimeUnit timeUnit) {
                this.f22422a = j;
                this.f22423b = j2;
                this.f22424c = timeUnit;
                super(null);
            }

            /* renamed from: a */
            public Future<?> mo31699a(C8499g gVar, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return scheduledExecutorService.scheduleAtFixedRate(runnable, this.f22422a, this.f22423b, this.f22424c);
            }
        }

        /* synthetic */ C8494e(C8484a aVar) {
            this();
        }

        /* renamed from: a */
        public static C8494e m40160a(long j, long j2, TimeUnit timeUnit) {
            C8495a aVar = new C8495a(j, j2, timeUnit);
            return aVar;
        }

        /* renamed from: b */
        public static C8494e m40161b(long j, long j2, TimeUnit timeUnit) {
            C8496b bVar = new C8496b(j, j2, timeUnit);
            return bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Future<?> mo31699a(C8499g gVar, ScheduledExecutorService scheduledExecutorService, Runnable runnable);

        private C8494e() {
        }
    }

    protected C8483f() {
    }

    /* renamed from: b */
    public final void mo31600b() {
        this.f22398a.mo31600b();
    }

    /* renamed from: c */
    public final Throwable mo31602c() {
        return this.f22398a.mo31602c();
    }

    /* renamed from: d */
    public final Service mo31603d() {
        this.f22398a.mo31603d();
        return this;
    }

    /* renamed from: e */
    public final void mo31604e() {
        this.f22398a.mo31604e();
    }

    /* renamed from: f */
    public final Service mo31605f() {
        this.f22398a.mo31605f();
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public ScheduledExecutorService mo31687g() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new C8489b());
        mo31599a((C8435b) new C8490c(newSingleThreadScheduledExecutor), (Executor) C8520j0.m40280c());
        return newSingleThreadScheduledExecutor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo31688h() throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C8494e mo31689i();

    public final boolean isRunning() {
        return this.f22398a.isRunning();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo31690j() {
        return C8483f.class.getSimpleName();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo31691k() throws Exception {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo31692l() throws Exception {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo31690j());
        sb.append(" [");
        sb.append(mo31597a());
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final State mo31597a() {
        return this.f22398a.mo31597a();
    }

    /* renamed from: b */
    public final void mo31601b(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f22398a.mo31601b(j, timeUnit);
    }

    /* renamed from: a */
    public final void mo31599a(C8435b bVar, Executor executor) {
        this.f22398a.mo31599a(bVar, executor);
    }

    /* renamed from: a */
    public final void mo31598a(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f22398a.mo31598a(j, timeUnit);
    }
}
