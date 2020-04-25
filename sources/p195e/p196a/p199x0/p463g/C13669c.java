package p195e.p196a.p199x0.p463g;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.g.c */
/* compiled from: DisposeOnCancel */
final class C13669c implements Future<Object> {

    /* renamed from: a */
    final C12314c f39557a;

    C13669c(C12314c cVar) {
        this.f39557a = cVar;
    }

    public boolean cancel(boolean z) {
        this.f39557a.dispose();
        return false;
    }

    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return false;
    }
}
