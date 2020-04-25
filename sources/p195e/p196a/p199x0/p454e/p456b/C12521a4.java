package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicBoolean;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.a4 */
/* compiled from: FlowableTake */
public final class C12521a4<T> extends C12511a<T, T> {

    /* renamed from: N */
    final long f35842N;

    /* renamed from: e.a.x0.e.b.a4$a */
    /* compiled from: FlowableTake */
    static final class C12522a<T> extends AtomicBoolean implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -5636543848937116287L;

        /* renamed from: N */
        final C14062c<? super T> f35843N;

        /* renamed from: O */
        final long f35844O;

        /* renamed from: P */
        long f35845P;

        /* renamed from: a */
        boolean f35846a;

        /* renamed from: b */
        C14063d f35847b;

        C12522a(C14062c<? super T> cVar, long j) {
            this.f35843N = cVar;
            this.f35844O = j;
            this.f35845P = j;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f35847b, dVar)) {
                this.f35847b = dVar;
                if (this.f35844O == 0) {
                    dVar.cancel();
                    this.f35846a = true;
                    C13739g.m58654a(this.f35843N);
                    return;
                }
                this.f35843N.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                if (get() || !compareAndSet(false, true) || j < this.f35844O) {
                    this.f35847b.mo41813c(j);
                } else {
                    this.f35847b.mo41813c(Long.MAX_VALUE);
                }
            }
        }

        public void cancel() {
            this.f35847b.cancel();
        }

        public void onComplete() {
            if (!this.f35846a) {
                this.f35846a = true;
                this.f35843N.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f35846a) {
                this.f35846a = true;
                this.f35847b.cancel();
                this.f35843N.onError(th);
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f35846a) {
                long j = this.f35845P;
                this.f35845P = j - 1;
                if (j > 0) {
                    boolean z = this.f35845P == 0;
                    this.f35843N.mo41789a(t);
                    if (z) {
                        this.f35847b.cancel();
                        onComplete();
                    }
                }
            }
        }
    }

    public C12521a4(C5929l<T> lVar, long j) {
        super(lVar);
        this.f35842N = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12522a<Object>(cVar, this.f35842N));
    }
}
