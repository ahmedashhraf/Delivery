package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13741i;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.b.p2 */
/* compiled from: FlowableOnErrorNext */
public final class C12763p2<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12339o<? super Throwable, ? extends C6007b<? extends T>> f36624N;

    /* renamed from: O */
    final boolean f36625O;

    /* renamed from: e.a.x0.e.b.p2$a */
    /* compiled from: FlowableOnErrorNext */
    static final class C12764a<T> implements C12297q<T> {

        /* renamed from: N */
        final boolean f36626N;

        /* renamed from: O */
        final C13741i f36627O = new C13741i();

        /* renamed from: P */
        boolean f36628P;

        /* renamed from: Q */
        boolean f36629Q;

        /* renamed from: a */
        final C14062c<? super T> f36630a;

        /* renamed from: b */
        final C12339o<? super Throwable, ? extends C6007b<? extends T>> f36631b;

        C12764a(C14062c<? super T> cVar, C12339o<? super Throwable, ? extends C6007b<? extends T>> oVar, boolean z) {
            this.f36630a = cVar;
            this.f36631b = oVar;
            this.f36626N = z;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            this.f36627O.mo43130b(dVar);
        }

        public void onComplete() {
            if (!this.f36629Q) {
                this.f36629Q = true;
                this.f36628P = true;
                this.f36630a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f36628P) {
                this.f36628P = true;
                if (!this.f36626N || (th instanceof Exception)) {
                    try {
                        C6007b bVar = (C6007b) this.f36631b.apply(th);
                        if (bVar == null) {
                            NullPointerException nullPointerException = new NullPointerException("Publisher is null");
                            nullPointerException.initCause(th);
                            this.f36630a.onError(nullPointerException);
                            return;
                        }
                        bVar.mo24397a(this);
                    } catch (Throwable th2) {
                        C14398a.m62357b(th2);
                        this.f36630a.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.f36630a.onError(th);
                }
            } else if (this.f36629Q) {
                C12205a.m54894b(th);
            } else {
                this.f36630a.onError(th);
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36629Q) {
                this.f36630a.mo41789a(t);
                if (!this.f36628P) {
                    this.f36627O.mo43129b(1);
                }
            }
        }
    }

    public C12763p2(C5929l<T> lVar, C12339o<? super Throwable, ? extends C6007b<? extends T>> oVar, boolean z) {
        super(lVar);
        this.f36624N = oVar;
        this.f36625O = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12764a aVar = new C12764a(cVar, this.f36624N, this.f36625O);
        cVar.mo41788a((C14063d) aVar.f36627O);
        this.f35814b.mo24393a((C12297q<? super T>) aVar);
    }
}
