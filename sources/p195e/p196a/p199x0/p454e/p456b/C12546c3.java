package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13741i;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p440c1.C12211c;
import p195e.p196a.p440c1.C12223g;
import p195e.p196a.p443f1.C12274e;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.c3 */
/* compiled from: FlowableRepeatWhen */
public final class C12546c3<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12339o<? super C5929l<Object>, ? extends C6007b<?>> f35920N;

    /* renamed from: e.a.x0.e.b.c3$a */
    /* compiled from: FlowableRepeatWhen */
    static final class C12547a<T> extends C12549c<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        C12547a(C14062c<? super T> cVar, C12211c<Object> cVar2, C14063d dVar) {
            super(cVar, cVar2, dVar);
        }

        public void onComplete() {
            mo42241c(Integer.valueOf(0));
        }

        public void onError(Throwable th) {
            this.f35927U.cancel();
            this.f35925S.onError(th);
        }
    }

    /* renamed from: e.a.x0.e.b.c3$b */
    /* compiled from: FlowableRepeatWhen */
    static final class C12548b<T, U> extends AtomicInteger implements C12297q<Object>, C14063d {
        private static final long serialVersionUID = 2827772011130406689L;

        /* renamed from: N */
        final AtomicLong f35921N = new AtomicLong();

        /* renamed from: O */
        C12549c<T, U> f35922O;

        /* renamed from: a */
        final C6007b<T> f35923a;

        /* renamed from: b */
        final AtomicReference<C14063d> f35924b = new AtomicReference<>();

        C12548b(C6007b<T> bVar) {
            this.f35923a = bVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58677a(this.f35924b, this.f35921N, dVar);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13742j.m58671a(this.f35924b, this.f35921N, j);
        }

        public void cancel() {
            C13742j.m58674a(this.f35924b);
        }

        public void onComplete() {
            this.f35922O.cancel();
            this.f35922O.f35925S.onComplete();
        }

        public void onError(Throwable th) {
            this.f35922O.cancel();
            this.f35922O.f35925S.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(Object obj) {
            if (getAndIncrement() == 0) {
                while (!C13742j.m58672a((C14063d) this.f35924b.get())) {
                    this.f35923a.mo24397a(this.f35922O);
                    if (decrementAndGet() == 0) {
                    }
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.b.c3$c */
    /* compiled from: FlowableRepeatWhen */
    static abstract class C12549c<T, U> extends C13741i implements C12297q<T> {
        private static final long serialVersionUID = -5604623027276966720L;

        /* renamed from: S */
        protected final C14062c<? super T> f35925S;

        /* renamed from: T */
        protected final C12211c<U> f35926T;

        /* renamed from: U */
        protected final C14063d f35927U;

        /* renamed from: V */
        private long f35928V;

        C12549c(C14062c<? super T> cVar, C12211c<U> cVar2, C14063d dVar) {
            this.f35925S = cVar;
            this.f35926T = cVar2;
            this.f35927U = dVar;
        }

        /* renamed from: a */
        public final void mo41788a(C14063d dVar) {
            mo43130b(dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo42241c(U u) {
            long j = this.f35928V;
            if (j != 0) {
                this.f35928V = 0;
                mo43129b(j);
            }
            this.f35927U.mo41813c(1);
            this.f35926T.mo41789a(u);
        }

        public final void cancel() {
            super.cancel();
            this.f35927U.cancel();
        }

        /* renamed from: a */
        public final void mo41789a(T t) {
            this.f35928V++;
            this.f35925S.mo41789a(t);
        }
    }

    public C12546c3(C5929l<T> lVar, C12339o<? super C5929l<Object>, ? extends C6007b<?>> oVar) {
        super(lVar);
        this.f35920N = oVar;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12274e eVar = new C12274e(cVar);
        C12211c Y = C12223g.m55071m(8).mo41816Y();
        try {
            C6007b bVar = (C6007b) C12390b.m55563a(this.f35920N.apply(Y), "handler returned a null Publisher");
            C12548b bVar2 = new C12548b(this.f35814b);
            C12547a aVar = new C12547a(eVar, Y, bVar2);
            bVar2.f35922O = aVar;
            cVar.mo41788a((C14063d) aVar);
            bVar.mo24397a(bVar2);
            bVar2.mo41789a((Object) Integer.valueOf(0));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C13739g.m58655a(th, cVar);
        }
    }
}
