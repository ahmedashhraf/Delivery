package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p442e1.C12252e;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.h2 */
/* compiled from: ObservablePublishSelector */
public final class C13238h2<T, R> extends C13131a<T, R> {

    /* renamed from: b */
    final C12339o<? super C5923b0<T>, ? extends C5926g0<R>> f38206b;

    /* renamed from: e.a.x0.e.e.h2$a */
    /* compiled from: ObservablePublishSelector */
    static final class C13239a<T, R> implements C12280i0<T> {

        /* renamed from: a */
        final C12252e<T> f38207a;

        /* renamed from: b */
        final AtomicReference<C12314c> f38208b;

        C13239a(C12252e<T> eVar, AtomicReference<C12314c> atomicReference) {
            this.f38207a = eVar;
            this.f38208b = atomicReference;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this.f38208b, cVar);
        }

        public void onComplete() {
            this.f38207a.onComplete();
        }

        public void onError(Throwable th) {
            this.f38207a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38207a.mo33453a(t);
        }
    }

    /* renamed from: e.a.x0.e.e.h2$b */
    /* compiled from: ObservablePublishSelector */
    static final class C13240b<T, R> extends AtomicReference<C12314c> implements C12280i0<R>, C12314c {
        private static final long serialVersionUID = 854110278590336484L;

        /* renamed from: a */
        final C12280i0<? super R> f38209a;

        /* renamed from: b */
        C12314c f38210b;

        C13240b(C12280i0<? super R> i0Var) {
            this.f38209a = i0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38210b, cVar)) {
                this.f38210b = cVar;
                this.f38209a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38210b.mo41878d();
        }

        public void dispose() {
            this.f38210b.dispose();
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
            this.f38209a.onComplete();
        }

        public void onError(Throwable th) {
            C12347d.m55465a((AtomicReference<C12314c>) this);
            this.f38209a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(R r) {
            this.f38209a.mo33453a(r);
        }
    }

    public C13238h2(C5926g0<T> g0Var, C12339o<? super C5923b0<T>, ? extends C5926g0<R>> oVar) {
        super(g0Var);
        this.f38206b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        C12252e U = C12252e.m55181U();
        try {
            C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f38206b.apply(U), "The selector returned a null ObservableSource");
            C13240b bVar = new C13240b(i0Var);
            g0Var.mo23893a(bVar);
            this.f37851a.mo23893a(new C13239a(U, bVar));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55476a(th, i0Var);
        }
    }
}
