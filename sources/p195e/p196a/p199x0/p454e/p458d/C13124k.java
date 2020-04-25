package p195e.p196a.p199x0.p454e.p458d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12321v;
import p195e.p196a.C5923b0;
import p195e.p196a.C5941y;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.d.k */
/* compiled from: ObservableSwitchMapMaybe */
public final class C13124k<T, R> extends C5923b0<R> {

    /* renamed from: N */
    final boolean f37823N;

    /* renamed from: a */
    final C5923b0<T> f37824a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5941y<? extends R>> f37825b;

    /* renamed from: e.a.x0.e.d.k$a */
    /* compiled from: ObservableSwitchMapMaybe */
    static final class C13125a<T, R> extends AtomicInteger implements C12280i0<T>, C12314c {

        /* renamed from: T */
        static final C13126a<Object> f37826T = new C13126a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: N */
        final boolean f37827N;

        /* renamed from: O */
        final C13746c f37828O = new C13746c();

        /* renamed from: P */
        final AtomicReference<C13126a<R>> f37829P = new AtomicReference<>();

        /* renamed from: Q */
        C12314c f37830Q;

        /* renamed from: R */
        volatile boolean f37831R;

        /* renamed from: S */
        volatile boolean f37832S;

        /* renamed from: a */
        final C12280i0<? super R> f37833a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5941y<? extends R>> f37834b;

        /* renamed from: e.a.x0.e.d.k$a$a */
        /* compiled from: ObservableSwitchMapMaybe */
        static final class C13126a<R> extends AtomicReference<C12314c> implements C12321v<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: a */
            final C13125a<?, R> f37835a;

            /* renamed from: b */
            volatile R f37836b;

            C13126a(C13125a<?, R> aVar) {
                this.f37835a = aVar;
            }

            /* renamed from: a */
            public void mo41931a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onComplete() {
                this.f37835a.mo42651a(this);
            }

            public void onError(Throwable th) {
                this.f37835a.mo42652a(this, th);
            }

            public void onSuccess(R r) {
                this.f37836b = r;
                this.f37835a.mo42653e();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo42654a() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }
        }

        C13125a(C12280i0<? super R> i0Var, C12339o<? super T, ? extends C5941y<? extends R>> oVar, boolean z) {
            this.f37833a = i0Var;
            this.f37834b = oVar;
            this.f37827N = z;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f37830Q, cVar)) {
                this.f37830Q = cVar;
                this.f37833a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37832S;
        }

        public void dispose() {
            this.f37832S = true;
            this.f37830Q.dispose();
            mo42650a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42653e() {
            if (getAndIncrement() == 0) {
                C12280i0<? super R> i0Var = this.f37833a;
                C13746c cVar = this.f37828O;
                AtomicReference<C13126a<R>> atomicReference = this.f37829P;
                int i = 1;
                while (!this.f37832S) {
                    if (cVar.get() == null || this.f37827N) {
                        boolean z = this.f37831R;
                        C13126a aVar = (C13126a) atomicReference.get();
                        boolean z2 = aVar == null;
                        if (z && z2) {
                            Throwable d = cVar.mo43143d();
                            if (d != null) {
                                i0Var.onError(d);
                            } else {
                                i0Var.onComplete();
                            }
                            return;
                        } else if (z2 || aVar.f37836b == null) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(aVar, null);
                            i0Var.mo33453a(aVar.f37836b);
                        }
                    } else {
                        i0Var.onError(cVar.mo43143d());
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            this.f37831R = true;
            mo42653e();
        }

        public void onError(Throwable th) {
            if (this.f37828O.mo43142a(th)) {
                if (!this.f37827N) {
                    mo42650a();
                }
                this.f37831R = true;
                mo42653e();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            C13126a aVar = (C13126a) this.f37829P.get();
            if (aVar != null) {
                aVar.mo42654a();
            }
            try {
                C5941y yVar = (C5941y) C12390b.m55563a(this.f37834b.apply(t), "The mapper returned a null MaybeSource");
                C13126a aVar2 = new C13126a(this);
                while (true) {
                    C13126a<Object> aVar3 = (C13126a) this.f37829P.get();
                    if (aVar3 != f37826T) {
                        if (this.f37829P.compareAndSet(aVar3, aVar2)) {
                            yVar.mo24639a(aVar2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f37830Q.dispose();
                this.f37829P.getAndSet(f37826T);
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42650a() {
            C13126a<Object> aVar = (C13126a) this.f37829P.getAndSet(f37826T);
            if (aVar != null && aVar != f37826T) {
                aVar.mo42654a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42652a(C13126a<R> aVar, Throwable th) {
            if (!this.f37829P.compareAndSet(aVar, null) || !this.f37828O.mo43142a(th)) {
                C12205a.m54894b(th);
                return;
            }
            if (!this.f37827N) {
                this.f37830Q.dispose();
                mo42650a();
            }
            mo42653e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42651a(C13126a<R> aVar) {
            if (this.f37829P.compareAndSet(aVar, null)) {
                mo42653e();
            }
        }
    }

    public C13124k(C5923b0<T> b0Var, C12339o<? super T, ? extends C5941y<? extends R>> oVar, boolean z) {
        this.f37824a = b0Var;
        this.f37825b = oVar;
        this.f37823N = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        if (!C13130m.m57220a((Object) this.f37824a, this.f37825b, i0Var)) {
            this.f37824a.mo23893a((C12280i0<? super T>) new C13125a<Object>(i0Var, this.f37825b, this.f37823N));
        }
    }
}
