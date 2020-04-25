package p195e.p196a.p199x0.p454e.p456b;

import java.util.Iterator;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12327c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.z4 */
/* compiled from: FlowableZipIterable */
public final class C12941z4<T, U, V> extends C12511a<T, V> {

    /* renamed from: N */
    final Iterable<U> f37326N;

    /* renamed from: O */
    final C12327c<? super T, ? super U, ? extends V> f37327O;

    /* renamed from: e.a.x0.e.b.z4$a */
    /* compiled from: FlowableZipIterable */
    static final class C12942a<T, U, V> implements C12297q<T>, C14063d {

        /* renamed from: N */
        final C12327c<? super T, ? super U, ? extends V> f37328N;

        /* renamed from: O */
        C14063d f37329O;

        /* renamed from: P */
        boolean f37330P;

        /* renamed from: a */
        final C14062c<? super V> f37331a;

        /* renamed from: b */
        final Iterator<U> f37332b;

        C12942a(C14062c<? super V> cVar, Iterator<U> it, C12327c<? super T, ? super U, ? extends V> cVar2) {
            this.f37331a = cVar;
            this.f37332b = it;
            this.f37328N = cVar2;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37329O, dVar)) {
                this.f37329O = dVar;
                this.f37331a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f37329O.mo41813c(j);
        }

        public void cancel() {
            this.f37329O.cancel();
        }

        public void onComplete() {
            if (!this.f37330P) {
                this.f37330P = true;
                this.f37331a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f37330P) {
                C12205a.m54894b(th);
                return;
            }
            this.f37330P = true;
            this.f37331a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f37330P) {
                try {
                    try {
                        this.f37331a.mo41789a(C12390b.m55563a(this.f37328N.mo35569a(t, C12390b.m55563a(this.f37332b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                        try {
                            if (!this.f37332b.hasNext()) {
                                this.f37330P = true;
                                this.f37329O.cancel();
                                this.f37331a.onComplete();
                            }
                        } catch (Throwable th) {
                            mo42557a(th);
                        }
                    } catch (Throwable th2) {
                        mo42557a(th2);
                    }
                } catch (Throwable th3) {
                    mo42557a(th3);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42557a(Throwable th) {
            C14398a.m62357b(th);
            this.f37330P = true;
            this.f37329O.cancel();
            this.f37331a.onError(th);
        }
    }

    public C12941z4(C5929l<T> lVar, Iterable<U> iterable, C12327c<? super T, ? super U, ? extends V> cVar) {
        super(lVar);
        this.f37326N = iterable;
        this.f37327O = cVar;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super V> cVar) {
        try {
            Iterator it = (Iterator) C12390b.m55563a(this.f37326N.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    C13739g.m58654a(cVar);
                } else {
                    this.f35814b.mo24393a((C12297q<? super T>) new C12942a<Object>(cVar, it, this.f37327O));
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C13739g.m58655a(th, cVar);
            }
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C13739g.m58655a(th2, cVar);
        }
    }
}
