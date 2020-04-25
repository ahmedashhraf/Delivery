package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12401j;
import p195e.p196a.p199x0.p453d.C12409b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.e.n0 */
/* compiled from: ObservableDoFinally */
public final class C13323n0<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C12325a f38520b;

    /* renamed from: e.a.x0.e.e.n0$a */
    /* compiled from: ObservableDoFinally */
    static final class C13324a<T> extends C12409b<T> implements C12280i0<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: N */
        C12314c f38521N;

        /* renamed from: O */
        C12401j<T> f38522O;

        /* renamed from: P */
        boolean f38523P;

        /* renamed from: a */
        final C12280i0<? super T> f38524a;

        /* renamed from: b */
        final C12325a f38525b;

        C13324a(C12280i0<? super T> i0Var, C12325a aVar) {
            this.f38524a = i0Var;
            this.f38525b = aVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38521N, cVar)) {
                this.f38521N = cVar;
                if (cVar instanceof C12401j) {
                    this.f38522O = (C12401j) cVar;
                }
                this.f38524a.mo34123a((C12314c) this);
            }
        }

        public void clear() {
            this.f38522O.clear();
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38521N.mo41878d();
        }

        public void dispose() {
            this.f38521N.dispose();
            mo42814a();
        }

        public boolean isEmpty() {
            return this.f38522O.isEmpty();
        }

        public void onComplete() {
            this.f38524a.onComplete();
            mo42814a();
        }

        public void onError(Throwable th) {
            this.f38524a.onError(th);
            mo42814a();
        }

        @C5938g
        public T poll() throws Exception {
            T poll = this.f38522O.poll();
            if (poll == null && this.f38523P) {
                mo42814a();
            }
            return poll;
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38524a.mo33453a(t);
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            C12401j<T> jVar = this.f38522O;
            if (jVar == null || (i & 4) != 0) {
                return 0;
            }
            int a = jVar.mo41855a(i);
            if (a != 0) {
                boolean z = true;
                if (a != 1) {
                    z = false;
                }
                this.f38523P = z;
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42814a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f38525b.run();
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    C12205a.m54894b(th);
                }
            }
        }
    }

    public C13323n0(C5926g0<T> g0Var, C12325a aVar) {
        super(g0Var);
        this.f38520b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13324a(i0Var, this.f38520b));
    }
}
