package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p440c1.C12211c;
import p195e.p196a.p440c1.C12223g;
import p195e.p196a.p443f1.C12274e;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.g3 */
/* compiled from: FlowableRetryWhen */
public final class C12624g3<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12339o<? super C5929l<Throwable>, ? extends C6007b<?>> f36147N;

    /* renamed from: e.a.x0.e.b.g3$a */
    /* compiled from: FlowableRetryWhen */
    static final class C12625a<T> extends C12549c<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        C12625a(C14062c<? super T> cVar, C12211c<Throwable> cVar2, C14063d dVar) {
            super(cVar, cVar2, dVar);
        }

        public void onComplete() {
            this.f35927U.cancel();
            this.f35925S.onComplete();
        }

        public void onError(Throwable th) {
            mo42241c(th);
        }
    }

    public C12624g3(C5929l<T> lVar, C12339o<? super C5929l<Throwable>, ? extends C6007b<?>> oVar) {
        super(lVar);
        this.f36147N = oVar;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12274e eVar = new C12274e(cVar);
        C12211c Y = C12223g.m55071m(8).mo41816Y();
        try {
            C6007b bVar = (C6007b) C12390b.m55563a(this.f36147N.apply(Y), "handler returned a null Publisher");
            C12548b bVar2 = new C12548b(this.f35814b);
            C12625a aVar = new C12625a(eVar, Y, bVar2);
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
