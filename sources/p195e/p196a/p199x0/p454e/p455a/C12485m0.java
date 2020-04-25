package p195e.p196a.p199x0.p454e.p455a;

import p195e.p196a.C12268f;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p453d.C12410c;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.a.m0 */
/* compiled from: CompletableToObservable */
public final class C12485m0<T> extends C5923b0<T> {

    /* renamed from: a */
    final C5927i f35766a;

    /* renamed from: e.a.x0.e.a.m0$a */
    /* compiled from: CompletableToObservable */
    static final class C12486a extends C12410c<Void> implements C12268f {

        /* renamed from: a */
        final C12280i0<?> f35767a;

        /* renamed from: b */
        C12314c f35768b;

        C12486a(C12280i0<?> i0Var) {
            this.f35767a = i0Var;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return i & 2;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            if (C12347d.m55464a(this.f35768b, cVar)) {
                this.f35768b = cVar;
                this.f35767a.mo34123a((C12314c) this);
            }
        }

        public void clear() {
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35768b.mo41878d();
        }

        public void dispose() {
            this.f35768b.dispose();
        }

        public boolean isEmpty() {
            return true;
        }

        public void onComplete() {
            this.f35767a.onComplete();
        }

        public void onError(Throwable th) {
            this.f35767a.onError(th);
        }

        public Void poll() throws Exception {
            return null;
        }
    }

    public C12485m0(C5927i iVar) {
        this.f35766a = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f35766a.mo24122a(new C12486a(i0Var));
    }
}
