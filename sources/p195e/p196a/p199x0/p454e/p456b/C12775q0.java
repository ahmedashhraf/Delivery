package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p465i.C13735c;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12325a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.b.q0 */
/* compiled from: FlowableDoFinally */
public final class C12775q0<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12325a f36677N;

    /* renamed from: e.a.x0.e.b.q0$a */
    /* compiled from: FlowableDoFinally */
    static final class C12776a<T> extends C13735c<T> implements C12392a<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: N */
        C14063d f36678N;

        /* renamed from: O */
        C12403l<T> f36679O;

        /* renamed from: P */
        boolean f36680P;

        /* renamed from: a */
        final C12392a<? super T> f36681a;

        /* renamed from: b */
        final C12325a f36682b;

        C12776a(C12392a<? super T> aVar, C12325a aVar2) {
            this.f36681a = aVar;
            this.f36682b = aVar2;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36678N, dVar)) {
                this.f36678N = dVar;
                if (dVar instanceof C12403l) {
                    this.f36679O = (C12403l) dVar;
                }
                this.f36681a.mo41788a(this);
            }
        }

        /* renamed from: b */
        public boolean mo42138b(T t) {
            return this.f36681a.mo42138b(t);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f36678N.mo41813c(j);
        }

        public void cancel() {
            this.f36678N.cancel();
            mo42424d();
        }

        public void clear() {
            this.f36679O.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42424d() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f36682b.run();
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    C12205a.m54894b(th);
                }
            }
        }

        public boolean isEmpty() {
            return this.f36679O.isEmpty();
        }

        public void onComplete() {
            this.f36681a.onComplete();
            mo42424d();
        }

        public void onError(Throwable th) {
            this.f36681a.onError(th);
            mo42424d();
        }

        @C5938g
        public T poll() throws Exception {
            T poll = this.f36679O.poll();
            if (poll == null && this.f36680P) {
                mo42424d();
            }
            return poll;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f36681a.mo41789a(t);
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            C12403l<T> lVar = this.f36679O;
            if (lVar == null || (i & 4) != 0) {
                return 0;
            }
            int a = lVar.mo41855a(i);
            if (a != 0) {
                boolean z = true;
                if (a != 1) {
                    z = false;
                }
                this.f36680P = z;
            }
            return a;
        }
    }

    /* renamed from: e.a.x0.e.b.q0$b */
    /* compiled from: FlowableDoFinally */
    static final class C12777b<T> extends C13735c<T> implements C12297q<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: N */
        C14063d f36683N;

        /* renamed from: O */
        C12403l<T> f36684O;

        /* renamed from: P */
        boolean f36685P;

        /* renamed from: a */
        final C14062c<? super T> f36686a;

        /* renamed from: b */
        final C12325a f36687b;

        C12777b(C14062c<? super T> cVar, C12325a aVar) {
            this.f36686a = cVar;
            this.f36687b = aVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36683N, dVar)) {
                this.f36683N = dVar;
                if (dVar instanceof C12403l) {
                    this.f36684O = (C12403l) dVar;
                }
                this.f36686a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f36683N.mo41813c(j);
        }

        public void cancel() {
            this.f36683N.cancel();
            mo42425d();
        }

        public void clear() {
            this.f36684O.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42425d() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f36687b.run();
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    C12205a.m54894b(th);
                }
            }
        }

        public boolean isEmpty() {
            return this.f36684O.isEmpty();
        }

        public void onComplete() {
            this.f36686a.onComplete();
            mo42425d();
        }

        public void onError(Throwable th) {
            this.f36686a.onError(th);
            mo42425d();
        }

        @C5938g
        public T poll() throws Exception {
            T poll = this.f36684O.poll();
            if (poll == null && this.f36685P) {
                mo42425d();
            }
            return poll;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f36686a.mo41789a(t);
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            C12403l<T> lVar = this.f36684O;
            if (lVar == null || (i & 4) != 0) {
                return 0;
            }
            int a = lVar.mo41855a(i);
            if (a != 0) {
                boolean z = true;
                if (a != 1) {
                    z = false;
                }
                this.f36685P = z;
            }
            return a;
        }
    }

    public C12775q0(C5929l<T> lVar, C12325a aVar) {
        super(lVar);
        this.f36677N = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        if (cVar instanceof C12392a) {
            this.f35814b.mo24393a((C12297q<? super T>) new C12776a<Object>((C12392a) cVar, this.f36677N));
        } else {
            this.f35814b.mo24393a((C12297q<? super T>) new C12777b<Object>(cVar, this.f36677N));
        }
    }
}
