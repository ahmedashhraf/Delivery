package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13741i;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.b.a3 */
/* compiled from: FlowableRepeat */
public final class C12519a3<T> extends C12511a<T, T> {

    /* renamed from: N */
    final long f35836N;

    /* renamed from: e.a.x0.e.b.a3$a */
    /* compiled from: FlowableRepeat */
    static final class C12520a<T> extends AtomicInteger implements C12297q<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: N */
        final C6007b<? extends T> f35837N;

        /* renamed from: O */
        long f35838O;

        /* renamed from: P */
        long f35839P;

        /* renamed from: a */
        final C14062c<? super T> f35840a;

        /* renamed from: b */
        final C13741i f35841b;

        C12520a(C14062c<? super T> cVar, long j, C13741i iVar, C6007b<? extends T> bVar) {
            this.f35840a = cVar;
            this.f35841b = iVar;
            this.f35837N = bVar;
            this.f35838O = j;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            this.f35841b.mo43130b(dVar);
        }

        public void onComplete() {
            long j = this.f35838O;
            if (j != Long.MAX_VALUE) {
                this.f35838O = j - 1;
            }
            if (j != 0) {
                mo42218a();
            } else {
                this.f35840a.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f35840a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f35839P++;
            this.f35840a.mo41789a(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42218a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f35841b.mo43132e()) {
                    long j = this.f35839P;
                    if (j != 0) {
                        this.f35839P = 0;
                        this.f35841b.mo43129b(j);
                    }
                    this.f35837N.mo24397a(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }
    }

    public C12519a3(C5929l<T> lVar, long j) {
        super(lVar);
        this.f35836N = j;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C13741i iVar = new C13741i();
        cVar.mo41788a((C14063d) iVar);
        long j = this.f35836N;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j - 1;
        }
        C12520a aVar = new C12520a(cVar, j2, iVar, this.f35814b);
        aVar.mo42218a();
    }
}
