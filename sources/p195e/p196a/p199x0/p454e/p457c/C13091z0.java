package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.c.z0 */
/* compiled from: MaybeOnErrorNext */
public final class C13091z0<T> extends C12943a<T, T> {

    /* renamed from: N */
    final boolean f37643N;

    /* renamed from: b */
    final C12339o<? super Throwable, ? extends C5941y<? extends T>> f37644b;

    /* renamed from: e.a.x0.e.c.z0$a */
    /* compiled from: MaybeOnErrorNext */
    static final class C13092a<T> extends AtomicReference<C12314c> implements C12321v<T>, C12314c {
        private static final long serialVersionUID = 2026620218879969836L;

        /* renamed from: N */
        final boolean f37645N;

        /* renamed from: a */
        final C12321v<? super T> f37646a;

        /* renamed from: b */
        final C12339o<? super Throwable, ? extends C5941y<? extends T>> f37647b;

        /* renamed from: e.a.x0.e.c.z0$a$a */
        /* compiled from: MaybeOnErrorNext */
        static final class C13093a<T> implements C12321v<T> {

            /* renamed from: a */
            final C12321v<? super T> f37648a;

            /* renamed from: b */
            final AtomicReference<C12314c> f37649b;

            C13093a(C12321v<? super T> vVar, AtomicReference<C12314c> atomicReference) {
                this.f37648a = vVar;
                this.f37649b = atomicReference;
            }

            /* renamed from: a */
            public void mo41931a(C12314c cVar) {
                C12347d.m55468c(this.f37649b, cVar);
            }

            public void onComplete() {
                this.f37648a.onComplete();
            }

            public void onError(Throwable th) {
                this.f37648a.onError(th);
            }

            public void onSuccess(T t) {
                this.f37648a.onSuccess(t);
            }
        }

        C13092a(C12321v<? super T> vVar, C12339o<? super Throwable, ? extends C5941y<? extends T>> oVar, boolean z) {
            this.f37646a = vVar;
            this.f37647b = oVar;
            this.f37645N = z;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f37646a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            this.f37646a.onComplete();
        }

        public void onError(Throwable th) {
            if (this.f37645N || (th instanceof Exception)) {
                try {
                    C5941y yVar = (C5941y) C12390b.m55563a(this.f37647b.apply(th), "The resumeFunction returned a null MaybeSource");
                    C12347d.m55466a((AtomicReference<C12314c>) this, (C12314c) null);
                    yVar.mo24639a(new C13093a(this.f37646a, this));
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    this.f37646a.onError(new CompositeException(th, th2));
                }
            } else {
                this.f37646a.onError(th);
            }
        }

        public void onSuccess(T t) {
            this.f37646a.onSuccess(t);
        }
    }

    public C13091z0(C5941y<T> yVar, C12339o<? super Throwable, ? extends C5941y<? extends T>> oVar, boolean z) {
        super(yVar);
        this.f37644b = oVar;
        this.f37643N = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37333a.mo24639a(new C13092a(vVar, this.f37644b, this.f37643N));
    }
}
