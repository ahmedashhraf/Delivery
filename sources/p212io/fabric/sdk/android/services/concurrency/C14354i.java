package p212io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: io.fabric.sdk.android.services.concurrency.i */
/* compiled from: PriorityFutureTask */
public class C14354i<V> extends FutureTask<V> implements C14347c<C14368n>, C14363j, C14368n, C14346b {

    /* renamed from: a */
    final Object f42412a;

    public C14354i(Callable<V> callable) {
        super(callable);
        this.f42412a = mo45329a((Object) callable);
    }

    /* renamed from: a */
    public void addDependency(C14368n nVar) {
        ((C14347c) ((C14363j) mo45298m())).addDependency(nVar);
    }

    public boolean areDependenciesMet() {
        return ((C14347c) ((C14363j) mo45298m())).areDependenciesMet();
    }

    public int compareTo(Object obj) {
        return ((C14363j) mo45298m()).compareTo(obj);
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
        return (C14347c) this.f42412a;
    }

    public void setError(Throwable th) {
        ((C14368n) ((C14363j) mo45298m())).setError(th);
    }

    public void setFinished(boolean z) {
        ((C14368n) ((C14363j) mo45298m())).setFinished(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C14347c<C14368n> & C14363j & C14368n> T mo45329a(Object obj) {
        if (C14365l.isProperDelegate(obj)) {
            return (C14347c) obj;
        }
        return new C14365l();
    }

    public C14354i(Runnable runnable, V v) {
        super(runnable, v);
        this.f42412a = mo45329a((Object) runnable);
    }
}
