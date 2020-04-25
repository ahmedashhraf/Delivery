package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.Callable;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13740h;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.j3 */
/* compiled from: FlowableScalarXMap */
public final class C12671j3 {

    /* renamed from: e.a.x0.e.b.j3$a */
    /* compiled from: FlowableScalarXMap */
    static final class C12672a<T, R> extends C5929l<R> {

        /* renamed from: N */
        final C12339o<? super T, ? extends C6007b<? extends R>> f36291N;

        /* renamed from: b */
        final T f36292b;

        C12672a(T t, C12339o<? super T, ? extends C6007b<? extends R>> oVar) {
            this.f36292b = t;
            this.f36291N = oVar;
        }

        /* renamed from: e */
        public void mo24499e(C14062c<? super R> cVar) {
            try {
                C6007b bVar = (C6007b) C12390b.m55563a(this.f36291N.apply(this.f36292b), "The mapper returned a null Publisher");
                if (bVar instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar).call();
                        if (call == null) {
                            C13739g.m58654a(cVar);
                            return;
                        }
                        cVar.mo41788a((C14063d) new C13740h(cVar, call));
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        C13739g.m58655a(th, cVar);
                    }
                } else {
                    bVar.mo24397a(cVar);
                }
            } catch (Throwable th2) {
                C13739g.m58655a(th2, cVar);
            }
        }
    }

    private C12671j3() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T, R> boolean m56158a(C6007b<T> bVar, C14062c<? super R> cVar, C12339o<? super T, ? extends C6007b<? extends R>> oVar) {
        if (!(bVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) bVar).call();
            if (call == null) {
                C13739g.m58654a(cVar);
                return true;
            }
            try {
                C6007b bVar2 = (C6007b) C12390b.m55563a(oVar.apply(call), "The mapper returned a null Publisher");
                if (bVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) bVar2).call();
                        if (call2 == null) {
                            C13739g.m58654a(cVar);
                            return true;
                        }
                        cVar.mo41788a((C14063d) new C13740h(cVar, call2));
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        C13739g.m58655a(th, cVar);
                        return true;
                    }
                } else {
                    bVar2.mo24397a(cVar);
                }
                return true;
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                C13739g.m58655a(th2, cVar);
                return true;
            }
        } catch (Throwable th3) {
            C14398a.m62357b(th3);
            C13739g.m58655a(th3, cVar);
            return true;
        }
    }

    /* renamed from: a */
    public static <T, U> C5929l<U> m56157a(T t, C12339o<? super T, ? extends C6007b<? extends U>> oVar) {
        return C12205a.m54871a((C5929l<T>) new C12672a<T>(t, oVar));
    }
}
