package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C12321v;
import p195e.p196a.C5929l;
import p195e.p196a.C5931s;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12393b;
import p195e.p196a.p199x0.p452c.C12399h;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12327c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.w2 */
/* compiled from: FlowableReduceMaybe */
public final class C12896w2<T> extends C5931s<T> implements C12399h<T>, C12393b<T> {

    /* renamed from: a */
    final C5929l<T> f37139a;

    /* renamed from: b */
    final C12327c<T, T, T> f37140b;

    /* renamed from: e.a.x0.e.b.w2$a */
    /* compiled from: FlowableReduceMaybe */
    static final class C12897a<T> implements C12297q<T>, C12314c {

        /* renamed from: N */
        T f37141N;

        /* renamed from: O */
        C14063d f37142O;

        /* renamed from: P */
        boolean f37143P;

        /* renamed from: a */
        final C12321v<? super T> f37144a;

        /* renamed from: b */
        final C12327c<T, T, T> f37145b;

        C12897a(C12321v<? super T> vVar, C12327c<T, T, T> cVar) {
            this.f37144a = vVar;
            this.f37145b = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37142O, dVar)) {
                this.f37142O = dVar;
                this.f37144a.mo41931a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37143P;
        }

        public void dispose() {
            this.f37142O.cancel();
            this.f37143P = true;
        }

        public void onComplete() {
            if (!this.f37143P) {
                this.f37143P = true;
                T t = this.f37141N;
                if (t != null) {
                    this.f37144a.onSuccess(t);
                } else {
                    this.f37144a.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f37143P) {
                C12205a.m54894b(th);
                return;
            }
            this.f37143P = true;
            this.f37144a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f37143P) {
                T t2 = this.f37141N;
                if (t2 == null) {
                    this.f37141N = t;
                } else {
                    try {
                        this.f37141N = C12390b.m55563a(this.f37145b.mo35569a(t2, t), "The reducer returned a null value");
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f37142O.cancel();
                        onError(th);
                    }
                }
            }
        }
    }

    public C12896w2(C5929l<T> lVar, C12327c<T, T, T> cVar) {
        this.f37139a = lVar;
        this.f37140b = cVar;
    }

    /* renamed from: b */
    public C5929l<T> mo42139b() {
        return C12205a.m54871a((C5929l<T>) new C12874v2<T>(this.f37139a, this.f37140b));
    }

    public C6007b<T> source() {
        return this.f37139a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37139a.mo24393a((C12297q<? super T>) new C12897a<Object>(vVar, this.f37140b));
    }
}
