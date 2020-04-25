package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.Callable;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p464h.C13730s;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.b.c2 */
/* compiled from: FlowableMapNotification */
public final class C12544c2<T, R> extends C12511a<T, R> {

    /* renamed from: N */
    final C12339o<? super T, ? extends R> f35914N;

    /* renamed from: O */
    final C12339o<? super Throwable, ? extends R> f35915O;

    /* renamed from: P */
    final Callable<? extends R> f35916P;

    /* renamed from: e.a.x0.e.b.c2$a */
    /* compiled from: FlowableMapNotification */
    static final class C12545a<T, R> extends C13730s<T, R> {
        private static final long serialVersionUID = 2757120512858778108L;

        /* renamed from: R */
        final C12339o<? super T, ? extends R> f35917R;

        /* renamed from: S */
        final C12339o<? super Throwable, ? extends R> f35918S;

        /* renamed from: T */
        final Callable<? extends R> f35919T;

        C12545a(C14062c<? super R> cVar, C12339o<? super T, ? extends R> oVar, C12339o<? super Throwable, ? extends R> oVar2, Callable<? extends R> callable) {
            super(cVar);
            this.f35917R = oVar;
            this.f35918S = oVar2;
            this.f35919T = callable;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            try {
                Object a = C12390b.m55563a(this.f35917R.apply(t), "The onNext publisher returned is null");
                this.f39760O++;
                this.f39761a.mo41789a(a);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f39761a.onError(th);
            }
        }

        public void onComplete() {
            try {
                mo43114c(C12390b.m55563a(this.f35919T.call(), "The onComplete publisher returned is null"));
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f39761a.onError(th);
            }
        }

        public void onError(Throwable th) {
            try {
                mo43114c(C12390b.m55563a(this.f35918S.apply(th), "The onError publisher returned is null"));
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                this.f39761a.onError(new CompositeException(th, th2));
            }
        }
    }

    public C12544c2(C5929l<T> lVar, C12339o<? super T, ? extends R> oVar, C12339o<? super Throwable, ? extends R> oVar2, Callable<? extends R> callable) {
        super(lVar);
        this.f35914N = oVar;
        this.f35915O = oVar2;
        this.f35916P = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12545a<Object>(cVar, this.f35914N, this.f35915O, this.f35916P));
    }
}
