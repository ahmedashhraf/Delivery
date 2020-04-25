package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.TimeUnit;
import p195e.p196a.C12282j0;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p441d1.C12241d;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.j4 */
/* compiled from: FlowableTimeInterval */
public final class C12673j4<T> extends C12511a<T, C12241d<T>> {

    /* renamed from: N */
    final C12282j0 f36293N;

    /* renamed from: O */
    final TimeUnit f36294O;

    /* renamed from: e.a.x0.e.b.j4$a */
    /* compiled from: FlowableTimeInterval */
    static final class C12674a<T> implements C12297q<T>, C14063d {

        /* renamed from: N */
        final C12282j0 f36295N;

        /* renamed from: O */
        C14063d f36296O;

        /* renamed from: P */
        long f36297P;

        /* renamed from: a */
        final C14062c<? super C12241d<T>> f36298a;

        /* renamed from: b */
        final TimeUnit f36299b;

        C12674a(C14062c<? super C12241d<T>> cVar, TimeUnit timeUnit, C12282j0 j0Var) {
            this.f36298a = cVar;
            this.f36295N = j0Var;
            this.f36299b = timeUnit;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36296O, dVar)) {
                this.f36297P = this.f36295N.mo41870a(this.f36299b);
                this.f36296O = dVar;
                this.f36298a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f36296O.mo41813c(j);
        }

        public void cancel() {
            this.f36296O.cancel();
        }

        public void onComplete() {
            this.f36298a.onComplete();
        }

        public void onError(Throwable th) {
            this.f36298a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            long a = this.f36295N.mo41870a(this.f36299b);
            long j = this.f36297P;
            this.f36297P = a;
            this.f36298a.mo41789a(new C12241d(t, a - j, this.f36299b));
        }
    }

    public C12673j4(C5929l<T> lVar, TimeUnit timeUnit, C12282j0 j0Var) {
        super(lVar);
        this.f36293N = j0Var;
        this.f36294O = timeUnit;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super C12241d<T>> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12674a<Object>(cVar, this.f36294O, this.f36293N));
    }
}
