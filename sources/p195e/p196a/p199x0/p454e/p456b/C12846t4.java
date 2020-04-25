package p195e.p196a.p199x0.p454e.p456b;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p462f.C13660a;
import p195e.p196a.p199x0.p464h.C13724m;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p440c1.C12223g;
import p195e.p196a.p443f1.C12271b;
import p195e.p196a.p443f1.C12274e;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.t4 */
/* compiled from: FlowableWindowBoundarySelector */
public final class C12846t4<T, B, V> extends C12511a<T, C5929l<T>> {

    /* renamed from: N */
    final C6007b<B> f36918N;

    /* renamed from: O */
    final C12339o<? super B, ? extends C6007b<V>> f36919O;

    /* renamed from: P */
    final int f36920P;

    /* renamed from: e.a.x0.e.b.t4$a */
    /* compiled from: FlowableWindowBoundarySelector */
    static final class C12847a<T, V> extends C12271b<V> {

        /* renamed from: N */
        final C12223g<T> f36921N;

        /* renamed from: O */
        boolean f36922O;

        /* renamed from: b */
        final C12849c<T, ?, V> f36923b;

        C12847a(C12849c<T, ?, V> cVar, C12223g<T> gVar) {
            this.f36923b = cVar;
            this.f36921N = gVar;
        }

        /* renamed from: a */
        public void mo41789a(V v) {
            mo41997b();
            onComplete();
        }

        public void onComplete() {
            if (!this.f36922O) {
                this.f36922O = true;
                this.f36923b.mo42468a(this);
            }
        }

        public void onError(Throwable th) {
            if (this.f36922O) {
                C12205a.m54894b(th);
                return;
            }
            this.f36922O = true;
            this.f36923b.mo42469a(th);
        }
    }

    /* renamed from: e.a.x0.e.b.t4$b */
    /* compiled from: FlowableWindowBoundarySelector */
    static final class C12848b<T, B> extends C12271b<B> {

        /* renamed from: b */
        final C12849c<T, B, ?> f36924b;

        C12848b(C12849c<T, B, ?> cVar) {
            this.f36924b = cVar;
        }

        /* renamed from: a */
        public void mo41789a(B b) {
            this.f36924b.mo42470c(b);
        }

        public void onComplete() {
            this.f36924b.onComplete();
        }

        public void onError(Throwable th) {
            this.f36924b.mo42469a(th);
        }
    }

    /* renamed from: e.a.x0.e.b.t4$c */
    /* compiled from: FlowableWindowBoundarySelector */
    static final class C12849c<T, B, V> extends C13724m<T, Object, C5929l<T>> implements C14063d {

        /* renamed from: L0 */
        final C6007b<B> f36925L0;

        /* renamed from: M0 */
        final C12339o<? super B, ? extends C6007b<V>> f36926M0;

        /* renamed from: N0 */
        final int f36927N0;

        /* renamed from: O0 */
        final C12313b f36928O0;

        /* renamed from: P0 */
        C14063d f36929P0;

        /* renamed from: Q0 */
        final AtomicReference<C12314c> f36930Q0 = new AtomicReference<>();

        /* renamed from: R0 */
        final List<C12223g<T>> f36931R0;

        /* renamed from: S0 */
        final AtomicLong f36932S0 = new AtomicLong();

        C12849c(C14062c<? super C5929l<T>> cVar, C6007b<B> bVar, C12339o<? super B, ? extends C6007b<V>> oVar, int i) {
            super(cVar, new C13660a());
            this.f36925L0 = bVar;
            this.f36926M0 = oVar;
            this.f36927N0 = i;
            this.f36928O0 = new C12313b();
            this.f36931R0 = new ArrayList();
            this.f36932S0.lazySet(1);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36929P0, dVar)) {
                this.f36929P0 = dVar;
                this.f39705G0.mo41788a((C14063d) this);
                if (!this.f39707I0) {
                    C12848b bVar = new C12848b(this);
                    if (this.f36930Q0.compareAndSet(null, bVar)) {
                        this.f36932S0.getAndIncrement();
                        dVar.mo41813c(Long.MAX_VALUE);
                        this.f36925L0.mo24397a(bVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean mo42398a(C14062c<? super C5929l<T>> cVar, Object obj) {
            return false;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            mo43107b(j);
        }

        public void cancel() {
            this.f39707I0 = true;
        }

        /* access modifiers changed from: 0000 */
        public void dispose() {
            this.f36928O0.dispose();
            C12347d.m55465a(this.f36930Q0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo42472h() {
            C12405n<U> nVar = this.f39706H0;
            C14062c<? super V> cVar = this.f39705G0;
            List<C12223g<T>> list = this.f36931R0;
            int i = 1;
            while (true) {
                boolean z = this.f39708J0;
                Object poll = nVar.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    dispose();
                    Throwable th = this.f39709K0;
                    if (th != null) {
                        for (C12223g onError : list) {
                            onError.onError(th);
                        }
                    } else {
                        for (C12223g onComplete : list) {
                            onComplete.onComplete();
                        }
                    }
                    list.clear();
                    return;
                } else if (z2) {
                    i = mo43103a(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (poll instanceof C12850d) {
                    C12850d dVar = (C12850d) poll;
                    C12223g<T> gVar = dVar.f36933a;
                    if (gVar != null) {
                        if (list.remove(gVar)) {
                            dVar.f36933a.onComplete();
                            if (this.f36932S0.decrementAndGet() == 0) {
                                dispose();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f39707I0) {
                        C12223g m = C12223g.m55071m(this.f36927N0);
                        long a = mo43104a();
                        if (a != 0) {
                            list.add(m);
                            cVar.mo41789a(m);
                            if (a != Long.MAX_VALUE) {
                                mo43105a(1);
                            }
                            try {
                                C6007b bVar = (C6007b) C12390b.m55563a(this.f36926M0.apply(dVar.f36934b), "The publisher supplied is null");
                                C12847a aVar = new C12847a(this, m);
                                if (this.f36928O0.mo42072b(aVar)) {
                                    this.f36932S0.getAndIncrement();
                                    bVar.mo24397a(aVar);
                                }
                            } catch (Throwable th2) {
                                this.f39707I0 = true;
                                cVar.onError(th2);
                            }
                        } else {
                            this.f39707I0 = true;
                            cVar.onError(new MissingBackpressureException("Could not deliver new window due to lack of requests"));
                        }
                    }
                } else {
                    for (C12223g a2 : list) {
                        a2.mo41789a(C13761q.m58751d(poll));
                    }
                }
            }
        }

        public void onComplete() {
            if (!this.f39708J0) {
                this.f39708J0 = true;
                if (mo43109b()) {
                    mo42472h();
                }
                if (this.f36932S0.decrementAndGet() == 0) {
                    this.f36928O0.dispose();
                }
                this.f39705G0.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f39708J0) {
                C12205a.m54894b(th);
                return;
            }
            this.f39709K0 = th;
            this.f39708J0 = true;
            if (mo43109b()) {
                mo42472h();
            }
            if (this.f36932S0.decrementAndGet() == 0) {
                this.f36928O0.dispose();
            }
            this.f39705G0.onError(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo42470c(B b) {
            this.f39706H0.offer(new C12850d(null, b));
            if (mo43109b()) {
                mo42472h();
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f39708J0) {
                if (mo43113g()) {
                    for (C12223g a : this.f36931R0) {
                        a.mo41789a(t);
                    }
                    if (mo43103a(-1) == 0) {
                        return;
                    }
                } else {
                    this.f39706H0.offer(C13761q.m58756i(t));
                    if (!mo43109b()) {
                        return;
                    }
                }
                mo42472h();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42469a(Throwable th) {
            this.f36929P0.cancel();
            this.f36928O0.dispose();
            C12347d.m55465a(this.f36930Q0);
            this.f39705G0.onError(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42468a(C12847a<T, V> aVar) {
            this.f36928O0.mo42073c(aVar);
            this.f39706H0.offer(new C12850d(aVar.f36921N, null));
            if (mo43109b()) {
                mo42472h();
            }
        }
    }

    /* renamed from: e.a.x0.e.b.t4$d */
    /* compiled from: FlowableWindowBoundarySelector */
    static final class C12850d<T, B> {

        /* renamed from: a */
        final C12223g<T> f36933a;

        /* renamed from: b */
        final B f36934b;

        C12850d(C12223g<T> gVar, B b) {
            this.f36933a = gVar;
            this.f36934b = b;
        }
    }

    public C12846t4(C5929l<T> lVar, C6007b<B> bVar, C12339o<? super B, ? extends C6007b<V>> oVar, int i) {
        super(lVar);
        this.f36918N = bVar;
        this.f36919O = oVar;
        this.f36920P = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super C5929l<T>> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12849c<Object>(new C12274e(cVar), this.f36918N, this.f36919O, this.f36920P));
    }
}
