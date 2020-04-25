package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p443f1.C12274e;
import p195e.p196a.p449w0.C12327c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.w4 */
/* compiled from: FlowableWithLatestFrom */
public final class C12900w4<T, U, R> extends C12511a<T, R> {

    /* renamed from: N */
    final C12327c<? super T, ? super U, ? extends R> f37151N;

    /* renamed from: O */
    final C6007b<? extends U> f37152O;

    /* renamed from: e.a.x0.e.b.w4$a */
    /* compiled from: FlowableWithLatestFrom */
    final class C12901a implements C12297q<U> {

        /* renamed from: a */
        private final C12902b<T, U, R> f37153a;

        C12901a(C12902b<T, U, R> bVar) {
            this.f37153a = bVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (this.f37153a.mo42517b(dVar)) {
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            this.f37153a.mo42516a(th);
        }

        /* renamed from: a */
        public void mo41789a(U u) {
            this.f37153a.lazySet(u);
        }
    }

    /* renamed from: e.a.x0.e.b.w4$b */
    /* compiled from: FlowableWithLatestFrom */
    static final class C12902b<T, U, R> extends AtomicReference<U> implements C12392a<T>, C14063d {
        private static final long serialVersionUID = -312246233408980075L;

        /* renamed from: N */
        final AtomicReference<C14063d> f37155N = new AtomicReference<>();

        /* renamed from: O */
        final AtomicLong f37156O = new AtomicLong();

        /* renamed from: P */
        final AtomicReference<C14063d> f37157P = new AtomicReference<>();

        /* renamed from: a */
        final C14062c<? super R> f37158a;

        /* renamed from: b */
        final C12327c<? super T, ? super U, ? extends R> f37159b;

        C12902b(C14062c<? super R> cVar, C12327c<? super T, ? super U, ? extends R> cVar2) {
            this.f37158a = cVar;
            this.f37159b = cVar2;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58677a(this.f37155N, this.f37156O, dVar);
        }

        /* renamed from: b */
        public boolean mo42138b(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    this.f37158a.mo41789a(C12390b.m55563a(this.f37159b.mo35569a(t, obj), "The combiner returned a null value"));
                    return true;
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    cancel();
                    this.f37158a.onError(th);
                }
            }
            return false;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13742j.m58671a(this.f37155N, this.f37156O, j);
        }

        public void cancel() {
            C13742j.m58674a(this.f37155N);
            C13742j.m58674a(this.f37157P);
        }

        public void onComplete() {
            C13742j.m58674a(this.f37157P);
            this.f37158a.onComplete();
        }

        public void onError(Throwable th) {
            C13742j.m58674a(this.f37157P);
            this.f37158a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!mo42138b(t)) {
                ((C14063d) this.f37155N.get()).mo41813c(1);
            }
        }

        /* renamed from: a */
        public void mo42516a(Throwable th) {
            C13742j.m58674a(this.f37155N);
            this.f37158a.onError(th);
        }

        /* renamed from: b */
        public boolean mo42517b(C14063d dVar) {
            return C13742j.m58680c(this.f37157P, dVar);
        }
    }

    public C12900w4(C5929l<T> lVar, C12327c<? super T, ? super U, ? extends R> cVar, C6007b<? extends U> bVar) {
        super(lVar);
        this.f37151N = cVar;
        this.f37152O = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        C12274e eVar = new C12274e(cVar);
        C12902b bVar = new C12902b(eVar, this.f37151N);
        eVar.mo41788a((C14063d) bVar);
        this.f37152O.mo24397a(new C12901a(bVar));
        this.f35814b.mo24393a((C12297q<? super T>) bVar);
    }
}
