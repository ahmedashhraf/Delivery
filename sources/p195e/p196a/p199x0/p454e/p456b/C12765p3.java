package p195e.p196a.p199x0.p454e.p456b;

import java.util.NoSuchElementException;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13738f;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.p3 */
/* compiled from: FlowableSingle */
public final class C12765p3<T> extends C12511a<T, T> {

    /* renamed from: N */
    final T f36632N;

    /* renamed from: O */
    final boolean f36633O;

    /* renamed from: e.a.x0.e.b.p3$a */
    /* compiled from: FlowableSingle */
    static final class C12766a<T> extends C13738f<T> implements C12297q<T> {
        private static final long serialVersionUID = -5526049321428043809L;

        /* renamed from: V */
        final T f36634V;

        /* renamed from: W */
        final boolean f36635W;

        /* renamed from: X */
        C14063d f36636X;

        /* renamed from: Y */
        boolean f36637Y;

        C12766a(C14062c<? super T> cVar, T t, boolean z) {
            super(cVar);
            this.f36634V = t;
            this.f36635W = z;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36636X, dVar)) {
                this.f36636X = dVar;
                this.f39781a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            super.cancel();
            this.f36636X.cancel();
        }

        public void onComplete() {
            if (!this.f36637Y) {
                this.f36637Y = true;
                T t = this.f39782b;
                this.f39782b = null;
                if (t == null) {
                    t = this.f36634V;
                }
                if (t != null) {
                    mo43123c(t);
                } else if (this.f36635W) {
                    this.f39781a.onError(new NoSuchElementException());
                } else {
                    this.f39781a.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f36637Y) {
                C12205a.m54894b(th);
                return;
            }
            this.f36637Y = true;
            this.f39781a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36637Y) {
                if (this.f39782b != null) {
                    this.f36637Y = true;
                    this.f36636X.cancel();
                    this.f39781a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f39782b = t;
            }
        }
    }

    public C12765p3(C5929l<T> lVar, T t, boolean z) {
        super(lVar);
        this.f36632N = t;
        this.f36633O = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12766a<Object>(cVar, this.f36632N, this.f36633O));
    }
}
