package p076c.p082c.p083a.p088u.p090i.p093p;

import android.os.Process;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: c.c.a.u.i.p.a */
/* compiled from: FifoPriorityThreadPoolExecutor */
public class C2374a extends ThreadPoolExecutor {

    /* renamed from: N */
    private static final String f9307N = "PriorityExecutor";

    /* renamed from: a */
    private final AtomicInteger f9308a;

    /* renamed from: b */
    private final C2379d f9309b;

    /* renamed from: c.c.a.u.i.p.a$b */
    /* compiled from: FifoPriorityThreadPoolExecutor */
    public static class C2376b implements ThreadFactory {

        /* renamed from: a */
        int f9310a = 0;

        /* renamed from: c.c.a.u.i.p.a$b$a */
        /* compiled from: FifoPriorityThreadPoolExecutor */
        class C2377a extends Thread {
            C2377a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(10);
                super.run();
            }
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("fifo-pool-thread-");
            sb.append(this.f9310a);
            C2377a aVar = new C2377a(runnable, sb.toString());
            this.f9310a++;
            return aVar;
        }
    }

    /* renamed from: c.c.a.u.i.p.a$c */
    /* compiled from: FifoPriorityThreadPoolExecutor */
    static class C2378c<T> extends FutureTask<T> implements Comparable<C2378c<?>> {

        /* renamed from: a */
        private final int f9312a;

        /* renamed from: b */
        private final int f9313b;

        public C2378c(Runnable runnable, T t, int i) {
            super(runnable, t);
            if (runnable instanceof C2382b) {
                this.f9312a = ((C2382b) runnable).getPriority();
                this.f9313b = i;
                return;
            }
            throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
        }

        /* renamed from: a */
        public int compareTo(C2378c<?> cVar) {
            int i = this.f9312a - cVar.f9312a;
            return i == 0 ? this.f9313b - cVar.f9313b : i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2378c)) {
                return false;
            }
            C2378c cVar = (C2378c) obj;
            if (this.f9313b == cVar.f9313b && this.f9312a == cVar.f9312a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f9312a * 31) + this.f9313b;
        }
    }

    /* renamed from: c.c.a.u.i.p.a$d */
    /* compiled from: FifoPriorityThreadPoolExecutor */
    public enum C2379d {
        IGNORE,
        LOG {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo9791a(Throwable th) {
                boolean isLoggable = Log.isLoggable(C2374a.f9307N, 6);
            }
        },
        THROW {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo9791a(Throwable th) {
                super.mo9791a(th);
                throw new RuntimeException(th);
            }
        };

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9791a(Throwable th) {
        }
    }

    public C2374a(int i) {
        this(i, C2379d.LOG);
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            if (future.isDone() && !future.isCancelled()) {
                try {
                    future.get();
                } catch (InterruptedException e) {
                    this.f9309b.mo9791a(e);
                } catch (ExecutionException e2) {
                    this.f9309b.mo9791a(e2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C2378c(runnable, t, this.f9308a.getAndIncrement());
    }

    public C2374a(int i, C2379d dVar) {
        this(i, i, 0, TimeUnit.MILLISECONDS, new C2376b(), dVar);
    }

    public C2374a(int i, int i2, long j, TimeUnit timeUnit, ThreadFactory threadFactory, C2379d dVar) {
        super(i, i2, j, timeUnit, new PriorityBlockingQueue(), threadFactory);
        this.f9308a = new AtomicInteger();
        this.f9309b = dVar;
    }
}
