package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.s3 */
/* compiled from: FlowableSkip */
public final class C12829s3<T> extends C12511a<T, T> {

    /* renamed from: N */
    final long f36862N;

    /* renamed from: e.a.x0.e.b.s3$a */
    /* compiled from: FlowableSkip */
    static final class C12830a<T> implements C12297q<T>, C14063d {

        /* renamed from: N */
        C14063d f36863N;

        /* renamed from: a */
        final C14062c<? super T> f36864a;

        /* renamed from: b */
        long f36865b;

        C12830a(C14062c<? super T> cVar, long j) {
            this.f36864a = cVar;
            this.f36865b = j;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36863N, dVar)) {
                long j = this.f36865b;
                this.f36863N = dVar;
                this.f36864a.mo41788a((C14063d) this);
                dVar.mo41813c(j);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f36863N.mo41813c(j);
        }

        public void cancel() {
            this.f36863N.cancel();
        }

        public void onComplete() {
            this.f36864a.onComplete();
        }

        public void onError(Throwable th) {
            this.f36864a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            long j = this.f36865b;
            if (j != 0) {
                this.f36865b = j - 1;
            } else {
                this.f36864a.mo41789a(t);
            }
        }
    }

    public C12829s3(C5929l<T> lVar, long j) {
        super(lVar);
        this.f36862N = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12830a<Object>(cVar, this.f36862N));
    }
}
