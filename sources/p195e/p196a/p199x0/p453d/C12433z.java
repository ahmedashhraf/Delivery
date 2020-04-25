package p195e.p196a.p199x0.p453d;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.d.z */
/* compiled from: ResumeSingleObserver */
public final class C12433z<T> implements C12292n0<T> {

    /* renamed from: a */
    final AtomicReference<C12314c> f35636a;

    /* renamed from: b */
    final C12292n0<? super T> f35637b;

    public C12433z(AtomicReference<C12314c> atomicReference, C12292n0<? super T> n0Var) {
        this.f35636a = atomicReference;
        this.f35637b = n0Var;
    }

    /* renamed from: a */
    public void mo41974a(C12314c cVar) {
        C12347d.m55466a(this.f35636a, cVar);
    }

    public void onError(Throwable th) {
        this.f35637b.onError(th);
    }

    public void onSuccess(T t) {
        this.f35637b.onSuccess(t);
    }
}
