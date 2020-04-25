package p195e.p196a.p199x0.p454e.p455a;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.a.e */
/* compiled from: CompletableConcatIterable */
public final class C12449e extends C5925c {

    /* renamed from: a */
    final Iterable<? extends C5927i> f35681a;

    /* renamed from: e.a.x0.e.a.e$a */
    /* compiled from: CompletableConcatIterable */
    static final class C12450a extends AtomicInteger implements C12268f {
        private static final long serialVersionUID = -7965400327305809232L;

        /* renamed from: N */
        final C12350g f35682N = new C12350g();

        /* renamed from: a */
        final C12268f f35683a;

        /* renamed from: b */
        final Iterator<? extends C5927i> f35684b;

        C12450a(C12268f fVar, Iterator<? extends C5927i> it) {
            this.f35683a = fVar;
            this.f35684b = it;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            this.f35682N.mo42109a(cVar);
        }

        public void onComplete() {
            mo42201a();
        }

        public void onError(Throwable th) {
            this.f35683a.onError(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42201a() {
            if (!this.f35682N.mo41878d() && getAndIncrement() == 0) {
                Iterator<? extends C5927i> it = this.f35684b;
                while (!this.f35682N.mo41878d()) {
                    try {
                        if (!it.hasNext()) {
                            this.f35683a.onComplete();
                            return;
                        }
                        try {
                            ((C5927i) C12390b.m55563a(it.next(), "The CompletableSource returned is null")).mo24122a(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th) {
                            C14398a.m62357b(th);
                            this.f35683a.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        C14398a.m62357b(th2);
                        this.f35683a.onError(th2);
                        return;
                    }
                }
            }
        }
    }

    public C12449e(Iterable<? extends C5927i> iterable) {
        this.f35681a = iterable;
    }

    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        try {
            C12450a aVar = new C12450a(fVar, (Iterator) C12390b.m55563a(this.f35681a.iterator(), "The iterator returned is null"));
            fVar.mo41921a(aVar.f35682N);
            aVar.mo42201a();
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55475a(th, fVar);
        }
    }
}
