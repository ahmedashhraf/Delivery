package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12321v;
import p195e.p196a.C5927i;
import p195e.p196a.C5931s;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.o */
/* compiled from: MaybeDelayWithCompletable */
public final class C13034o<T> extends C5931s<T> {

    /* renamed from: a */
    final C5941y<T> f37531a;

    /* renamed from: b */
    final C5927i f37532b;

    /* renamed from: e.a.x0.e.c.o$a */
    /* compiled from: MaybeDelayWithCompletable */
    static final class C13035a<T> implements C12321v<T> {

        /* renamed from: a */
        final AtomicReference<C12314c> f37533a;

        /* renamed from: b */
        final C12321v<? super T> f37534b;

        C13035a(AtomicReference<C12314c> atomicReference, C12321v<? super T> vVar) {
            this.f37533a = atomicReference;
            this.f37534b = vVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            C12347d.m55466a(this.f37533a, cVar);
        }

        public void onComplete() {
            this.f37534b.onComplete();
        }

        public void onError(Throwable th) {
            this.f37534b.onError(th);
        }

        public void onSuccess(T t) {
            this.f37534b.onSuccess(t);
        }
    }

    /* renamed from: e.a.x0.e.c.o$b */
    /* compiled from: MaybeDelayWithCompletable */
    static final class C13036b<T> extends AtomicReference<C12314c> implements C12268f, C12314c {
        private static final long serialVersionUID = 703409937383992161L;

        /* renamed from: a */
        final C12321v<? super T> f37535a;

        /* renamed from: b */
        final C5941y<T> f37536b;

        C13036b(C12321v<? super T> vVar, C5941y<T> yVar) {
            this.f37535a = vVar;
            this.f37536b = yVar;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f37535a.mo41931a(this);
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
            this.f37536b.mo24639a(new C13035a(this, this.f37535a));
        }

        public void onError(Throwable th) {
            this.f37535a.onError(th);
        }
    }

    public C13034o(C5941y<T> yVar, C5927i iVar) {
        this.f37531a = yVar;
        this.f37532b = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37532b.mo24122a(new C13036b(vVar, this.f37531a));
    }
}
