package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

@C5936e
/* renamed from: e.a.x0.e.b.a2 */
/* compiled from: FlowableLimit */
public final class C12517a2<T> extends C12511a<T, T> {

    /* renamed from: N */
    final long f35832N;

    /* renamed from: e.a.x0.e.b.a2$a */
    /* compiled from: FlowableLimit */
    static final class C12518a<T> extends AtomicLong implements C12297q<T>, C14063d {
        private static final long serialVersionUID = 2288246011222124525L;

        /* renamed from: N */
        C14063d f35833N;

        /* renamed from: a */
        final C14062c<? super T> f35834a;

        /* renamed from: b */
        long f35835b;

        C12518a(C14062c<? super T> cVar, long j) {
            this.f35834a = cVar;
            this.f35835b = j;
            lazySet(j);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (!C13742j.m58673a(this.f35833N, dVar)) {
                return;
            }
            if (this.f35835b == 0) {
                dVar.cancel();
                C13739g.m58654a(this.f35834a);
                return;
            }
            this.f35833N = dVar;
            this.f35834a.mo41788a((C14063d) this);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            long j2;
            long j3;
            if (C13742j.m58678b(j)) {
                do {
                    j2 = get();
                    if (j2 != 0) {
                        j3 = j2 <= j ? j2 : j;
                    } else {
                        return;
                    }
                } while (!compareAndSet(j2, j2 - j3));
                this.f35833N.mo41813c(j3);
            }
        }

        public void cancel() {
            this.f35833N.cancel();
        }

        public void onComplete() {
            if (this.f35835b > 0) {
                this.f35835b = 0;
                this.f35834a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f35835b > 0) {
                this.f35835b = 0;
                this.f35834a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            long j = this.f35835b;
            if (j > 0) {
                long j2 = j - 1;
                this.f35835b = j2;
                this.f35834a.mo41789a(t);
                if (j2 == 0) {
                    this.f35833N.cancel();
                    this.f35834a.onComplete();
                }
            }
        }
    }

    public C12517a2(C5929l<T> lVar, long j) {
        super(lVar);
        this.f35832N = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12518a<Object>(cVar, this.f35832N));
    }
}
