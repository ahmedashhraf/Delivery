package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.q1 */
/* compiled from: FlowableIgnoreElements */
public final class C12778q1<T> extends C12511a<T, T> {

    /* renamed from: e.a.x0.e.b.q1$a */
    /* compiled from: FlowableIgnoreElements */
    static final class C12779a<T> implements C12297q<T>, C12403l<T> {

        /* renamed from: a */
        final C14062c<? super T> f36688a;

        /* renamed from: b */
        C14063d f36689b;

        C12779a(C14062c<? super T> cVar) {
            this.f36688a = cVar;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return i & 2;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36689b, dVar)) {
                this.f36689b = dVar;
                this.f36688a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
        }

        /* renamed from: c */
        public void mo41813c(long j) {
        }

        public void cancel() {
            this.f36689b.cancel();
        }

        public void clear() {
        }

        public boolean isEmpty() {
            return true;
        }

        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public void onComplete() {
            this.f36688a.onComplete();
        }

        public void onError(Throwable th) {
            this.f36688a.onError(th);
        }

        @C5938g
        public T poll() {
            return null;
        }

        /* renamed from: a */
        public boolean mo42104a(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    public C12778q1(C5929l<T> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12779a<Object>(cVar));
    }
}
