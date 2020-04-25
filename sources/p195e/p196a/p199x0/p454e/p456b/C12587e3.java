package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13741i;
import p195e.p196a.p449w0.C12328d;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.b.e3 */
/* compiled from: FlowableRetryBiPredicate */
public final class C12587e3<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12328d<? super Integer, ? super Throwable> f36036N;

    /* renamed from: e.a.x0.e.b.e3$a */
    /* compiled from: FlowableRetryBiPredicate */
    static final class C12588a<T> extends AtomicInteger implements C12297q<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: N */
        final C6007b<? extends T> f36037N;

        /* renamed from: O */
        final C12328d<? super Integer, ? super Throwable> f36038O;

        /* renamed from: P */
        int f36039P;

        /* renamed from: Q */
        long f36040Q;

        /* renamed from: a */
        final C14062c<? super T> f36041a;

        /* renamed from: b */
        final C13741i f36042b;

        C12588a(C14062c<? super T> cVar, C12328d<? super Integer, ? super Throwable> dVar, C13741i iVar, C6007b<? extends T> bVar) {
            this.f36041a = cVar;
            this.f36042b = iVar;
            this.f36037N = bVar;
            this.f36038O = dVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            this.f36042b.mo43130b(dVar);
        }

        public void onComplete() {
            this.f36041a.onComplete();
        }

        public void onError(Throwable th) {
            try {
                C12328d<? super Integer, ? super Throwable> dVar = this.f36038O;
                int i = this.f36039P + 1;
                this.f36039P = i;
                if (!dVar.mo42089a(Integer.valueOf(i), th)) {
                    this.f36041a.onError(th);
                } else {
                    mo42291a();
                }
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                this.f36041a.onError(new CompositeException(th, th2));
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f36040Q++;
            this.f36041a.mo41789a(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42291a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f36042b.mo43132e()) {
                    long j = this.f36040Q;
                    if (j != 0) {
                        this.f36040Q = 0;
                        this.f36042b.mo43129b(j);
                    }
                    this.f36037N.mo24397a(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }
    }

    public C12587e3(C5929l<T> lVar, C12328d<? super Integer, ? super Throwable> dVar) {
        super(lVar);
        this.f36036N = dVar;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C13741i iVar = new C13741i();
        cVar.mo41788a((C14063d) iVar);
        new C12588a(cVar, this.f36036N, iVar, this.f35814b).mo42291a();
    }
}
