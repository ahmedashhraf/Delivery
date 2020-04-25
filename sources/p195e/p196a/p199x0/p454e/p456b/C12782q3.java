package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C12321v;
import p195e.p196a.C5929l;
import p195e.p196a.C5931s;
import p195e.p196a.p199x0.p452c.C12393b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.q3 */
/* compiled from: FlowableSingleMaybe */
public final class C12782q3<T> extends C5931s<T> implements C12393b<T> {

    /* renamed from: a */
    final C5929l<T> f36692a;

    /* renamed from: e.a.x0.e.b.q3$a */
    /* compiled from: FlowableSingleMaybe */
    static final class C12783a<T> implements C12297q<T>, C12314c {

        /* renamed from: N */
        boolean f36693N;

        /* renamed from: O */
        T f36694O;

        /* renamed from: a */
        final C12321v<? super T> f36695a;

        /* renamed from: b */
        C14063d f36696b;

        C12783a(C12321v<? super T> vVar) {
            this.f36695a = vVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36696b, dVar)) {
                this.f36696b = dVar;
                this.f36695a.mo41931a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f36696b == C13742j.CANCELLED;
        }

        public void dispose() {
            this.f36696b.cancel();
            this.f36696b = C13742j.CANCELLED;
        }

        public void onComplete() {
            if (!this.f36693N) {
                this.f36693N = true;
                this.f36696b = C13742j.CANCELLED;
                T t = this.f36694O;
                this.f36694O = null;
                if (t == null) {
                    this.f36695a.onComplete();
                } else {
                    this.f36695a.onSuccess(t);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f36693N) {
                C12205a.m54894b(th);
                return;
            }
            this.f36693N = true;
            this.f36696b = C13742j.CANCELLED;
            this.f36695a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36693N) {
                if (this.f36694O != null) {
                    this.f36693N = true;
                    this.f36696b.cancel();
                    this.f36696b = C13742j.CANCELLED;
                    this.f36695a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f36694O = t;
            }
        }
    }

    public C12782q3(C5929l<T> lVar) {
        this.f36692a = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f36692a.mo24393a((C12297q<? super T>) new C12783a<Object>(vVar));
    }

    /* renamed from: b */
    public C5929l<T> mo42139b() {
        return C12205a.m54871a((C5929l<T>) new C12765p3<T>(this.f36692a, null, false));
    }
}
