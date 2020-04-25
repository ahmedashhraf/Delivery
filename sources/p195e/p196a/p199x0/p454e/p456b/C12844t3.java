package p195e.p196a.p199x0.p454e.p456b;

import java.util.ArrayDeque;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.t3 */
/* compiled from: FlowableSkipLast */
public final class C12844t3<T> extends C12511a<T, T> {

    /* renamed from: N */
    final int f36914N;

    /* renamed from: e.a.x0.e.b.t3$a */
    /* compiled from: FlowableSkipLast */
    static final class C12845a<T> extends ArrayDeque<T> implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -3807491841935125653L;

        /* renamed from: N */
        C14063d f36915N;

        /* renamed from: a */
        final C14062c<? super T> f36916a;

        /* renamed from: b */
        final int f36917b;

        C12845a(C14062c<? super T> cVar, int i) {
            super(i);
            this.f36916a = cVar;
            this.f36917b = i;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36915N, dVar)) {
                this.f36915N = dVar;
                this.f36916a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f36915N.mo41813c(j);
        }

        public void cancel() {
            this.f36915N.cancel();
        }

        public void onComplete() {
            this.f36916a.onComplete();
        }

        public void onError(Throwable th) {
            this.f36916a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (this.f36917b == size()) {
                this.f36916a.mo41789a(poll());
            } else {
                this.f36915N.mo41813c(1);
            }
            offer(t);
        }
    }

    public C12844t3(C5929l<T> lVar, int i) {
        super(lVar);
        this.f36914N = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12845a<Object>(cVar, this.f36914N));
    }
}
