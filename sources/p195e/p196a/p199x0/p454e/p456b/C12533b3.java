package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13741i;
import p195e.p196a.p449w0.C12329e;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.b3 */
/* compiled from: FlowableRepeatUntil */
public final class C12533b3<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12329e f35878N;

    /* renamed from: e.a.x0.e.b.b3$a */
    /* compiled from: FlowableRepeatUntil */
    static final class C12534a<T> extends AtomicInteger implements C12297q<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: N */
        final C6007b<? extends T> f35879N;

        /* renamed from: O */
        final C12329e f35880O;

        /* renamed from: P */
        long f35881P;

        /* renamed from: a */
        final C14062c<? super T> f35882a;

        /* renamed from: b */
        final C13741i f35883b;

        C12534a(C14062c<? super T> cVar, C12329e eVar, C13741i iVar, C6007b<? extends T> bVar) {
            this.f35882a = cVar;
            this.f35883b = iVar;
            this.f35879N = bVar;
            this.f35880O = eVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            this.f35883b.mo43130b(dVar);
        }

        public void onComplete() {
            try {
                if (this.f35880O.mo42090a()) {
                    this.f35882a.onComplete();
                } else {
                    mo42227a();
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f35882a.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.f35882a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f35881P++;
            this.f35882a.mo41789a(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42227a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f35883b.mo43132e()) {
                    long j = this.f35881P;
                    if (j != 0) {
                        this.f35881P = 0;
                        this.f35883b.mo43129b(j);
                    }
                    this.f35879N.mo24397a(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }
    }

    public C12533b3(C5929l<T> lVar, C12329e eVar) {
        super(lVar);
        this.f35878N = eVar;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C13741i iVar = new C13741i();
        cVar.mo41788a((C14063d) iVar);
        new C12534a(cVar, this.f35878N, iVar, this.f35814b).mo42227a();
    }
}
