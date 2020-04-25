package p195e.p196a.p199x0.p453d;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p195e.p196a.C12268f;
import p195e.p196a.C12292n0;
import p195e.p196a.C12321v;
import p195e.p196a.p199x0.p200j.C13748e;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.d.h */
/* compiled from: BlockingMultiObserver */
public final class C12415h<T> extends CountDownLatch implements C12292n0<T>, C12268f, C12321v<T> {

    /* renamed from: N */
    C12314c f35559N;

    /* renamed from: O */
    volatile boolean f35560O;

    /* renamed from: a */
    T f35561a;

    /* renamed from: b */
    Throwable f35562b;

    public C12415h() {
        super(1);
    }

    /* renamed from: a */
    public void mo41974a(C12314c cVar) {
        this.f35559N = cVar;
        if (this.f35560O) {
            cVar.dispose();
        }
    }

    /* renamed from: b */
    public Throwable mo42156b() {
        if (getCount() != 0) {
            try {
                C13748e.m58701a();
                await();
            } catch (InterruptedException e) {
                mo42158c();
                return e;
            }
        }
        return this.f35562b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo42158c() {
        this.f35560O = true;
        C12314c cVar = this.f35559N;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public void onComplete() {
        countDown();
    }

    public void onError(Throwable th) {
        this.f35562b = th;
        countDown();
    }

    public void onSuccess(T t) {
        this.f35561a = t;
        countDown();
    }

    /* renamed from: a */
    public T mo42153a() {
        if (getCount() != 0) {
            try {
                C13748e.m58701a();
                await();
            } catch (InterruptedException e) {
                mo42158c();
                throw C13754k.m58724c(e);
            }
        }
        Throwable th = this.f35562b;
        if (th == null) {
            return this.f35561a;
        }
        throw C13754k.m58724c(th);
    }

    /* renamed from: b */
    public Throwable mo42157b(long j, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                C13748e.m58701a();
                if (!await(j, timeUnit)) {
                    mo42158c();
                    throw C13754k.m58724c(new TimeoutException());
                }
            } catch (InterruptedException e) {
                mo42158c();
                throw C13754k.m58724c(e);
            }
        }
        return this.f35562b;
    }

    /* renamed from: a */
    public T mo42154a(T t) {
        if (getCount() != 0) {
            try {
                C13748e.m58701a();
                await();
            } catch (InterruptedException e) {
                mo42158c();
                throw C13754k.m58724c(e);
            }
        }
        Throwable th = this.f35562b;
        if (th == null) {
            T t2 = this.f35561a;
            return t2 != null ? t2 : t;
        }
        throw C13754k.m58724c(th);
    }

    /* renamed from: a */
    public boolean mo42155a(long j, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                C13748e.m58701a();
                if (!await(j, timeUnit)) {
                    mo42158c();
                    return false;
                }
            } catch (InterruptedException e) {
                mo42158c();
                throw C13754k.m58724c(e);
            }
        }
        Throwable th = this.f35562b;
        if (th == null) {
            return true;
        }
        throw C13754k.m58724c(th);
    }
}
