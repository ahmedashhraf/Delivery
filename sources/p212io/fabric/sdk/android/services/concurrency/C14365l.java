package p212io.fabric.sdk.android.services.concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.fabric.sdk.android.services.concurrency.l */
/* compiled from: PriorityTask */
public class C14365l implements C14347c<C14368n>, C14363j, C14368n {
    private final List<C14368n> dependencies = new ArrayList();
    private final AtomicBoolean hasRun = new AtomicBoolean(false);
    private final AtomicReference<Throwable> throwable = new AtomicReference<>(null);

    public static boolean isProperDelegate(Object obj) {
        try {
            C14347c cVar = (C14347c) obj;
            C14368n nVar = (C14368n) obj;
            C14363j jVar = (C14363j) obj;
            if (cVar == null || nVar == null || jVar == null) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean areDependenciesMet() {
        for (C14368n isFinished : getDependencies()) {
            if (!isFinished.isFinished()) {
                return false;
            }
        }
        return true;
    }

    public int compareTo(Object obj) {
        return C14349f.m62094a(this, obj);
    }

    public synchronized Collection<C14368n> getDependencies() {
        return Collections.unmodifiableCollection(this.dependencies);
    }

    public Throwable getError() {
        return (Throwable) this.throwable.get();
    }

    public C14349f getPriority() {
        return C14349f.NORMAL;
    }

    public boolean isFinished() {
        return this.hasRun.get();
    }

    public void setError(Throwable th) {
        this.throwable.set(th);
    }

    public synchronized void setFinished(boolean z) {
        this.hasRun.set(z);
    }

    public synchronized void addDependency(C14368n nVar) {
        this.dependencies.add(nVar);
    }
}
