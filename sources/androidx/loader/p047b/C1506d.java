package androidx.loader.p047b;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
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

/* renamed from: androidx.loader.b.d */
/* compiled from: ModernAsyncTask */
abstract class C1506d<Params, Progress, Result> {

    /* renamed from: Q */
    private static final String f5787Q = "AsyncTask";

    /* renamed from: R */
    private static final int f5788R = 5;

    /* renamed from: S */
    private static final int f5789S = 128;

    /* renamed from: T */
    private static final int f5790T = 1;

    /* renamed from: U */
    private static final ThreadFactory f5791U = new C1507a();

    /* renamed from: V */
    private static final BlockingQueue<Runnable> f5792V = new LinkedBlockingQueue(10);

    /* renamed from: W */
    public static final Executor f5793W;

    /* renamed from: X */
    private static final int f5794X = 1;

    /* renamed from: Y */
    private static final int f5795Y = 2;

    /* renamed from: Z */
    private static C1512f f5796Z;

    /* renamed from: a0 */
    private static volatile Executor f5797a0 = f5793W;

    /* renamed from: N */
    private volatile C1513g f5798N = C1513g.PENDING;

    /* renamed from: O */
    final AtomicBoolean f5799O = new AtomicBoolean();

    /* renamed from: P */
    final AtomicBoolean f5800P = new AtomicBoolean();

    /* renamed from: a */
    private final C1514h<Params, Result> f5801a = new C1508b();

    /* renamed from: b */
    private final FutureTask<Result> f5802b = new C1509c(this.f5801a);

    /* renamed from: androidx.loader.b.d$a */
    /* compiled from: ModernAsyncTask */
    static class C1507a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f5803a = new AtomicInteger(1);

        C1507a() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("ModernAsyncTask #");
            sb.append(this.f5803a.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    }

    /* renamed from: androidx.loader.b.d$b */
    /* compiled from: ModernAsyncTask */
    class C1508b extends C1514h<Params, Result> {
        C1508b() {
        }

        public Result call() throws Exception {
            C1506d.this.f5800P.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = C1506d.this.mo6588a(this.f5809a);
                Binder.flushPendingCommands();
                C1506d.this.mo6645d(result);
                return result;
            } catch (Throwable th) {
                C1506d.this.mo6645d(result);
                throw th;
            }
        }
    }

    /* renamed from: androidx.loader.b.d$c */
    /* compiled from: ModernAsyncTask */
    class C1509c extends FutureTask<Result> {
        C1509c(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            String str = "An error occurred while executing doInBackground()";
            try {
                C1506d.this.mo6649e(get());
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                throw new RuntimeException(str, e.getCause());
            } catch (CancellationException unused2) {
                C1506d.this.mo6649e(null);
            } catch (Throwable th) {
                throw new RuntimeException(str, th);
            }
        }
    }

    /* renamed from: androidx.loader.b.d$d */
    /* compiled from: ModernAsyncTask */
    static /* synthetic */ class C1510d {

        /* renamed from: a */
        static final /* synthetic */ int[] f5806a = new int[C1513g.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                androidx.loader.b.d$g[] r0 = androidx.loader.p047b.C1506d.C1513g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5806a = r0
                int[] r0 = f5806a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.loader.b.d$g r1 = androidx.loader.p047b.C1506d.C1513g.RUNNING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f5806a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.loader.b.d$g r1 = androidx.loader.p047b.C1506d.C1513g.FINISHED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.loader.p047b.C1506d.C1510d.<clinit>():void");
        }
    }

    /* renamed from: androidx.loader.b.d$e */
    /* compiled from: ModernAsyncTask */
    private static class C1511e<Data> {

        /* renamed from: a */
        final C1506d f5807a;

        /* renamed from: b */
        final Data[] f5808b;

        C1511e(C1506d dVar, Data... dataArr) {
            this.f5807a = dVar;
            this.f5808b = dataArr;
        }
    }

    /* renamed from: androidx.loader.b.d$f */
    /* compiled from: ModernAsyncTask */
    private static class C1512f extends Handler {
        C1512f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C1511e eVar = (C1511e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f5807a.mo6639a(eVar.f5808b[0]);
            } else if (i == 2) {
                eVar.f5807a.mo6643c((Progress[]) eVar.f5808b);
            }
        }
    }

    /* renamed from: androidx.loader.b.d$g */
    /* compiled from: ModernAsyncTask */
    public enum C1513g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: androidx.loader.b.d$h */
    /* compiled from: ModernAsyncTask */
    private static abstract class C1514h<Params, Result> implements Callable<Result> {

        /* renamed from: a */
        Params[] f5809a;

        C1514h() {
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f5792V, f5791U);
        f5793W = threadPoolExecutor;
    }

    C1506d() {
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: a */
    public static void m7873a(Executor executor) {
        f5797a0 = executor;
    }

    /* renamed from: f */
    private static Handler mo6592f() {
        C1512f fVar;
        synchronized (C1506d.class) {
            if (f5796Z == null) {
                f5796Z = new C1512f();
            }
            fVar = f5796Z;
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo6588a(Params... paramsArr);

    /* renamed from: b */
    public final C1513g mo6641b() {
        return this.f5798N;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6591c(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6643c(Progress... progressArr) {
    }

    /* renamed from: c */
    public final boolean mo6644c() {
        return this.f5799O.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Result mo6645d(Result result) {
        mo6592f().obtainMessage(1, new C1511e(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo6646d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo6648e() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo6649e(Result result) {
        if (!this.f5800P.get()) {
            mo6645d(result);
        }
    }

    /* renamed from: a */
    public final boolean mo6640a(boolean z) {
        this.f5799O.set(true);
        return this.f5802b.cancel(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6590b(Result result) {
        mo6646d();
    }

    /* renamed from: b */
    public final C1506d<Params, Progress, Result> mo6642b(Params... paramsArr) {
        return mo6636a(f5797a0, paramsArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo6647d(Progress... progressArr) {
        if (!mo6644c()) {
            mo6592f().obtainMessage(2, new C1511e(this, progressArr)).sendToTarget();
        }
    }

    /* renamed from: a */
    public final Result mo6637a() throws InterruptedException, ExecutionException {
        return this.f5802b.get();
    }

    /* renamed from: a */
    public final Result mo6638a(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f5802b.get(j, timeUnit);
    }

    /* renamed from: a */
    public final C1506d<Params, Progress, Result> mo6636a(Executor executor, Params... paramsArr) {
        if (this.f5798N != C1513g.PENDING) {
            int i = C1510d.f5806a[this.f5798N.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f5798N = C1513g.RUNNING;
            mo6648e();
            this.f5801a.f5809a = paramsArr;
            executor.execute(this.f5802b);
            return this;
        }
    }

    /* renamed from: a */
    public static void m7872a(Runnable runnable) {
        f5797a0.execute(runnable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6639a(Result result) {
        if (mo6644c()) {
            mo6590b(result);
        } else {
            mo6591c(result);
        }
        this.f5798N = C1513g.FINISHED;
    }
}
