package p212io.fabric.sdk.android.services.concurrency;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.fabric.sdk.android.services.concurrency.a */
/* compiled from: AsyncTask */
public abstract class C14335a<Params, Progress, Result> {

    /* renamed from: Q */
    private static final String f42373Q = "AsyncTask";

    /* renamed from: R */
    private static final int f42374R = Runtime.getRuntime().availableProcessors();

    /* renamed from: S */
    private static final int f42375S;

    /* renamed from: T */
    private static final int f42376T;

    /* renamed from: U */
    private static final int f42377U = 1;

    /* renamed from: V */
    private static final ThreadFactory f42378V = new C14336a();

    /* renamed from: W */
    private static final BlockingQueue<Runnable> f42379W = new LinkedBlockingQueue(128);

    /* renamed from: X */
    public static final Executor f42380X;

    /* renamed from: Y */
    public static final Executor f42381Y = new C14342g(null);

    /* renamed from: Z */
    private static final int f42382Z = 1;

    /* renamed from: a0 */
    private static final int f42383a0 = 2;

    /* renamed from: b0 */
    private static final C14341f f42384b0 = new C14341f();

    /* renamed from: c0 */
    private static volatile Executor f42385c0 = f42381Y;

    /* renamed from: N */
    private volatile C14344h f42386N = C14344h.PENDING;

    /* renamed from: O */
    private final AtomicBoolean f42387O = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final AtomicBoolean f42388P = new AtomicBoolean();

    /* renamed from: a */
    private final C14345i<Params, Result> f42389a = new C14337b();

    /* renamed from: b */
    private final FutureTask<Result> f42390b = new C14338c(this.f42389a);

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$a */
    /* compiled from: AsyncTask */
    static class C14336a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f42391a = new AtomicInteger(1);

        C14336a() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTask #");
            sb.append(this.f42391a.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$b */
    /* compiled from: AsyncTask */
    class C14337b extends C14345i<Params, Result> {
        C14337b() {
            super(null);
        }

        public Result call() throws Exception {
            C14335a.this.f42388P.set(true);
            Process.setThreadPriority(10);
            C14335a aVar = C14335a.this;
            return aVar.m62069d(aVar.mo45089a(this.f42401a));
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$c */
    /* compiled from: AsyncTask */
    class C14338c extends FutureTask<Result> {
        C14338c(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            try {
                C14335a.this.m62070e(get());
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occured while executing doInBackground()", e.getCause());
            } catch (CancellationException unused2) {
                C14335a.this.m62070e(null);
            }
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$d */
    /* compiled from: AsyncTask */
    static /* synthetic */ class C14339d {

        /* renamed from: a */
        static final /* synthetic */ int[] f42394a = new int[C14344h.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                io.fabric.sdk.android.services.concurrency.a$h[] r0 = p212io.fabric.sdk.android.services.concurrency.C14335a.C14344h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42394a = r0
                int[] r0 = f42394a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.fabric.sdk.android.services.concurrency.a$h r1 = p212io.fabric.sdk.android.services.concurrency.C14335a.C14344h.RUNNING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f42394a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.fabric.sdk.android.services.concurrency.a$h r1 = p212io.fabric.sdk.android.services.concurrency.C14335a.C14344h.FINISHED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p212io.fabric.sdk.android.services.concurrency.C14335a.C14339d.<clinit>():void");
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$e */
    /* compiled from: AsyncTask */
    private static class C14340e<Data> {

        /* renamed from: a */
        final C14335a f42395a;

        /* renamed from: b */
        final Data[] f42396b;

        C14340e(C14335a aVar, Data... dataArr) {
            this.f42395a = aVar;
            this.f42396b = dataArr;
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$f */
    /* compiled from: AsyncTask */
    private static class C14341f extends Handler {
        public C14341f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C14340e eVar = (C14340e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f42395a.m62068c(eVar.f42396b[0]);
            } else if (i == 2) {
                eVar.f42395a.mo45287c((Progress[]) eVar.f42396b);
            }
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$g */
    /* compiled from: AsyncTask */
    private static class C14342g implements Executor {

        /* renamed from: a */
        final LinkedList<Runnable> f42397a;

        /* renamed from: b */
        Runnable f42398b;

        /* renamed from: io.fabric.sdk.android.services.concurrency.a$g$a */
        /* compiled from: AsyncTask */
        class C14343a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Runnable f42399a;

            C14343a(Runnable runnable) {
                this.f42399a = runnable;
            }

            public void run() {
                try {
                    this.f42399a.run();
                } finally {
                    C14342g.this.mo45295a();
                }
            }
        }

        private C14342g() {
            this.f42397a = new LinkedList<>();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public synchronized void mo45295a() {
            Runnable runnable = (Runnable) this.f42397a.poll();
            this.f42398b = runnable;
            if (runnable != null) {
                C14335a.f42380X.execute(this.f42398b);
            }
        }

        public synchronized void execute(Runnable runnable) {
            this.f42397a.offer(new C14343a(runnable));
            if (this.f42398b == null) {
                mo45295a();
            }
        }

        /* synthetic */ C14342g(C14336a aVar) {
            this();
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$h */
    /* compiled from: AsyncTask */
    public enum C14344h {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$i */
    /* compiled from: AsyncTask */
    private static abstract class C14345i<Params, Result> implements Callable<Result> {

        /* renamed from: a */
        Params[] f42401a;

        private C14345i() {
        }

        /* synthetic */ C14345i(C14336a aVar) {
            this();
        }
    }

    static {
        int i = f42374R;
        f42375S = i + 1;
        f42376T = (i * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f42375S, f42376T, 1, TimeUnit.SECONDS, f42379W, f42378V);
        f42380X = threadPoolExecutor;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public Result m62069d(Result result) {
        f42384b0.obtainMessage(1, new C14340e(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m62070e(Result result) {
        if (!this.f42388P.get()) {
            m62069d(result);
        }
    }

    /* renamed from: f */
    public static void m62071f() {
        f42384b0.getLooper();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo45089a(Params... paramsArr);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo45092b(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo45287c(Progress... progressArr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo45289d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo45093e() {
    }

    /* renamed from: b */
    public final C14344h mo45285b() {
        return this.f42386N;
    }

    /* renamed from: c */
    public final boolean mo45288c() {
        return this.f42387O.get();
    }

    /* renamed from: a */
    public static void m62065a(Executor executor) {
        f42385c0 = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m62068c(Result result) {
        if (mo45288c()) {
            mo45091a(result);
        } else {
            mo45092b(result);
        }
        this.f42386N = C14344h.FINISHED;
    }

    /* renamed from: b */
    public final C14335a<Params, Progress, Result> mo45286b(Params... paramsArr) {
        return mo45281a(f42385c0, paramsArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo45290d(Progress... progressArr) {
        if (!mo45288c()) {
            f42384b0.obtainMessage(2, new C14340e(this, progressArr)).sendToTarget();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo45091a(Result result) {
        mo45289d();
    }

    /* renamed from: a */
    public final boolean mo45284a(boolean z) {
        this.f42387O.set(true);
        return this.f42390b.cancel(z);
    }

    /* renamed from: a */
    public final Result mo45282a() throws InterruptedException, ExecutionException {
        return this.f42390b.get();
    }

    /* renamed from: a */
    public final Result mo45283a(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f42390b.get(j, timeUnit);
    }

    /* renamed from: a */
    public final C14335a<Params, Progress, Result> mo45281a(Executor executor, Params... paramsArr) {
        if (this.f42386N != C14344h.PENDING) {
            int i = C14339d.f42394a[this.f42386N.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f42386N = C14344h.RUNNING;
        mo45093e();
        this.f42389a.f42401a = paramsArr;
        executor.execute(this.f42390b);
        return this;
    }

    /* renamed from: a */
    public static void m62064a(Runnable runnable) {
        f42385c0.execute(runnable);
    }
}
