package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.c.m */
/* compiled from: MaybeDelayOtherPublisher */
public final class C13021m<T, U> extends C12943a<T, T> {

    /* renamed from: b */
    final C6007b<U> f37509b;

    /* renamed from: e.a.x0.e.c.m$a */
    /* compiled from: MaybeDelayOtherPublisher */
    static final class C13022a<T, U> implements C12321v<T>, C12314c {

        /* renamed from: N */
        C12314c f37510N;

        /* renamed from: a */
        final C13023b<T> f37511a;

        /* renamed from: b */
        final C6007b<U> f37512b;

        C13022a(C12321v<? super T> vVar, C6007b<U> bVar) {
            this.f37511a = new C13023b<>(vVar);
            this.f37512b = bVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37510N, cVar)) {
                this.f37510N = cVar;
                this.f37511a.f37514a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C13742j.m58672a((C14063d) this.f37511a.get());
        }

        public void dispose() {
            this.f37510N.dispose();
            this.f37510N = C12347d.DISPOSED;
            C13742j.m58674a((AtomicReference<C14063d>) this.f37511a);
        }

        public void onComplete() {
            this.f37510N = C12347d.DISPOSED;
            mo42583a();
        }

        public void onError(Throwable th) {
            this.f37510N = C12347d.DISPOSED;
            this.f37511a.f37513N = th;
            mo42583a();
        }

        public void onSuccess(T t) {
            this.f37510N = C12347d.DISPOSED;
            this.f37511a.f37515b = t;
            mo42583a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42583a() {
            this.f37512b.mo24397a(this.f37511a);
        }
    }

    /* renamed from: e.a.x0.e.c.m$b */
    /* compiled from: MaybeDelayOtherPublisher */
    static final class C13023b<T> extends AtomicReference<C14063d> implements C12297q<Object> {
        private static final long serialVersionUID = -1215060610805418006L;

        /* renamed from: N */
        Throwable f37513N;

        /* renamed from: a */
        final C12321v<? super T> f37514a;

        /* renamed from: b */
        T f37515b;

        C13023b(C12321v<? super T> vVar) {
            this.f37514a = vVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a((AtomicReference<C14063d>) this, dVar, Long.MAX_VALUE);
        }

        public void onComplete() {
            Throwable th = this.f37513N;
            if (th != null) {
                this.f37514a.onError(th);
                return;
            }
            T t = this.f37515b;
            if (t != null) {
                this.f37514a.onSuccess(t);
            } else {
                this.f37514a.onComplete();
            }
        }

        public void onError(Throwable th) {
            Throwable th2 = this.f37513N;
            if (th2 == null) {
                this.f37514a.onError(th);
                return;
            }
            this.f37514a.onError(new CompositeException(th2, th));
        }

        /* renamed from: a */
        public void mo41789a(Object obj) {
            C14063d dVar = (C14063d) get();
            C13742j jVar = C13742j.CANCELLED;
            if (dVar != jVar) {
                lazySet(jVar);
                dVar.cancel();
                onComplete();
            }
        }
    }

    public C13021m(C5941y<T> yVar, C6007b<U> bVar) {
        super(yVar);
        this.f37509b = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37333a.mo24639a(new C13022a(vVar, this.f37509b));
    }
}
