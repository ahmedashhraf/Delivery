package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13741i;
import p195e.p196a.p449w0.C12342r;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.b.f3 */
/* compiled from: FlowableRetryPredicate */
public final class C12607f3<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12342r<? super Throwable> f36090N;

    /* renamed from: O */
    final long f36091O;

    /* renamed from: e.a.x0.e.b.f3$a */
    /* compiled from: FlowableRetryPredicate */
    static final class C12608a<T> extends AtomicInteger implements C12297q<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: N */
        final C6007b<? extends T> f36092N;

        /* renamed from: O */
        final C12342r<? super Throwable> f36093O;

        /* renamed from: P */
        long f36094P;

        /* renamed from: Q */
        long f36095Q;

        /* renamed from: a */
        final C14062c<? super T> f36096a;

        /* renamed from: b */
        final C13741i f36097b;

        C12608a(C14062c<? super T> cVar, long j, C12342r<? super Throwable> rVar, C13741i iVar, C6007b<? extends T> bVar) {
            this.f36096a = cVar;
            this.f36097b = iVar;
            this.f36092N = bVar;
            this.f36093O = rVar;
            this.f36094P = j;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            this.f36097b.mo43130b(dVar);
        }

        public void onComplete() {
            this.f36096a.onComplete();
        }

        public void onError(Throwable th) {
            long j = this.f36094P;
            if (j != Long.MAX_VALUE) {
                this.f36094P = j - 1;
            }
            if (j == 0) {
                this.f36096a.onError(th);
            } else {
                try {
                    if (!this.f36093O.mo41812b(th)) {
                        this.f36096a.onError(th);
                        return;
                    }
                    mo42306a();
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    this.f36096a.onError(new CompositeException(th, th2));
                }
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f36095Q++;
            this.f36096a.mo41789a(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42306a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f36097b.mo43132e()) {
                    long j = this.f36095Q;
                    if (j != 0) {
                        this.f36095Q = 0;
                        this.f36097b.mo43129b(j);
                    }
                    this.f36092N.mo24397a(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }
    }

    public C12607f3(C5929l<T> lVar, long j, C12342r<? super Throwable> rVar) {
        super(lVar);
        this.f36090N = rVar;
        this.f36091O = j;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C13741i iVar = new C13741i();
        cVar.mo41788a((C14063d) iVar);
        C12608a aVar = new C12608a(cVar, this.f36091O, this.f36090N, iVar, this.f35814b);
        aVar.mo42306a();
    }
}
