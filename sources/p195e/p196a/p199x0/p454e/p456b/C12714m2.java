package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12331g;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.m2 */
/* compiled from: FlowableOnBackpressureDrop */
public final class C12714m2<T> extends C12511a<T, T> implements C12331g<T> {

    /* renamed from: N */
    final C12331g<? super T> f36450N;

    /* renamed from: e.a.x0.e.b.m2$a */
    /* compiled from: FlowableOnBackpressureDrop */
    static final class C12715a<T> extends AtomicLong implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -6246093802440953054L;

        /* renamed from: N */
        C14063d f36451N;

        /* renamed from: O */
        boolean f36452O;

        /* renamed from: a */
        final C14062c<? super T> f36453a;

        /* renamed from: b */
        final C12331g<? super T> f36454b;

        C12715a(C14062c<? super T> cVar, C12331g<? super T> gVar) {
            this.f36453a = cVar;
            this.f36454b = gVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36451N, dVar)) {
                this.f36451N = dVar;
                this.f36453a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a((AtomicLong) this, j);
            }
        }

        public void cancel() {
            this.f36451N.cancel();
        }

        public void onComplete() {
            if (!this.f36452O) {
                this.f36452O = true;
                this.f36453a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f36452O) {
                C12205a.m54894b(th);
                return;
            }
            this.f36452O = true;
            this.f36453a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36452O) {
                if (get() != 0) {
                    this.f36453a.mo41789a(t);
                    C13747d.m58699c(this, 1);
                } else {
                    try {
                        this.f36454b.mo33410c(t);
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        cancel();
                        onError(th);
                    }
                }
            }
        }
    }

    public C12714m2(C5929l<T> lVar) {
        super(lVar);
        this.f36450N = this;
    }

    /* renamed from: c */
    public void mo33410c(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12715a<Object>(cVar, this.f36450N));
    }

    public C12714m2(C5929l<T> lVar, C12331g<? super T> gVar) {
        super(lVar);
        this.f36450N = gVar;
    }
}
