package p212io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p212io.fabric.sdk.android.services.concurrency.C14335a.C14344h;

/* renamed from: io.fabric.sdk.android.services.concurrency.g */
/* compiled from: PriorityAsyncTask */
public abstract class C14350g<Params, Progress, Result> extends C14335a<Params, Progress, Result> implements C14347c<C14368n>, C14363j, C14368n, C14346b {

    /* renamed from: d0 */
    private final C14365l f42408d0 = new C14365l();

    /* renamed from: io.fabric.sdk.android.services.concurrency.g$a */
    /* compiled from: PriorityAsyncTask */
    private static class C14351a<Result> implements Executor {

        /* renamed from: a */
        private final Executor f42409a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C14350g f42410b;

        /* renamed from: io.fabric.sdk.android.services.concurrency.g$a$a */
        /* compiled from: PriorityAsyncTask */
        class C14352a extends C14354i<Result> {
            C14352a(Runnable runnable, Object obj) {
                super(runnable, obj);
            }

            /* renamed from: m */
            public <T extends C14347c<C14368n> & C14363j & C14368n> T mo45298m() {
                return C14351a.this.f42410b;
            }
        }

        public C14351a(Executor executor, C14350g gVar) {
            this.f42409a = executor;
            this.f42410b = gVar;
        }

        public void execute(Runnable runnable) {
            this.f42409a.execute(new C14352a(runnable, null));
        }
    }

    /* renamed from: a */
    public final void mo45322a(ExecutorService executorService, Params... paramsArr) {
        super.mo45281a((Executor) new C14351a(executorService, this), paramsArr);
    }

    public boolean areDependenciesMet() {
        return ((C14347c) ((C14363j) mo45298m())).areDependenciesMet();
    }

    public int compareTo(Object obj) {
        return C14349f.m62094a(this, obj);
    }

    public Collection<C14368n> getDependencies() {
        return ((C14347c) ((C14363j) mo45298m())).getDependencies();
    }

    public Throwable getError() {
        return ((C14368n) ((C14363j) mo45298m())).getError();
    }

    public C14349f getPriority() {
        return ((C14363j) mo45298m()).getPriority();
    }

    public boolean isFinished() {
        return ((C14368n) ((C14363j) mo45298m())).isFinished();
    }

    /* renamed from: m */
    public <T extends C14347c<C14368n> & C14363j & C14368n> T mo45298m() {
        return this.f42408d0;
    }

    public void setError(Throwable th) {
        ((C14368n) ((C14363j) mo45298m())).setError(th);
    }

    public void setFinished(boolean z) {
        ((C14368n) ((C14363j) mo45298m())).setFinished(z);
    }

    /* renamed from: a */
    public void addDependency(C14368n nVar) {
        if (mo45285b() == C14344h.PENDING) {
            ((C14347c) ((C14363j) mo45298m())).addDependency(nVar);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }
}
