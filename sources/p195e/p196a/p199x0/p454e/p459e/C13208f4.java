package p195e.p196a.p199x0.p454e.p459e;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12429v;
import p195e.p196a.p199x0.p462f.C13660a;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p442e1.C12266j;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p195e.p196a.p467z0.C13787e;
import p195e.p196a.p467z0.C13795m;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.f4 */
/* compiled from: ObservableWindowBoundarySelector */
public final class C13208f4<T, B, V> extends C13131a<T, C5923b0<T>> {

    /* renamed from: N */
    final C12339o<? super B, ? extends C5926g0<V>> f38116N;

    /* renamed from: O */
    final int f38117O;

    /* renamed from: b */
    final C5926g0<B> f38118b;

    /* renamed from: e.a.x0.e.e.f4$a */
    /* compiled from: ObservableWindowBoundarySelector */
    static final class C13209a<T, V> extends C13787e<V> {

        /* renamed from: N */
        final C12266j<T> f38119N;

        /* renamed from: O */
        boolean f38120O;

        /* renamed from: b */
        final C13211c<T, ?, V> f38121b;

        C13209a(C13211c<T, ?, V> cVar, C12266j<T> jVar) {
            this.f38121b = cVar;
            this.f38119N = jVar;
        }

        /* renamed from: a */
        public void mo33453a(V v) {
            dispose();
            onComplete();
        }

        public void onComplete() {
            if (!this.f38120O) {
                this.f38120O = true;
                this.f38121b.mo42730a(this);
            }
        }

        public void onError(Throwable th) {
            if (this.f38120O) {
                C12205a.m54894b(th);
                return;
            }
            this.f38120O = true;
            this.f38121b.mo42731a(th);
        }
    }

    /* renamed from: e.a.x0.e.e.f4$b */
    /* compiled from: ObservableWindowBoundarySelector */
    static final class C13210b<T, B> extends C13787e<B> {

        /* renamed from: b */
        final C13211c<T, B, ?> f38122b;

        C13210b(C13211c<T, B, ?> cVar) {
            this.f38122b = cVar;
        }

        /* renamed from: a */
        public void mo33453a(B b) {
            this.f38122b.mo42732b(b);
        }

        public void onComplete() {
            this.f38122b.onComplete();
        }

        public void onError(Throwable th) {
            this.f38122b.mo42731a(th);
        }
    }

    /* renamed from: e.a.x0.e.e.f4$c */
    /* compiled from: ObservableWindowBoundarySelector */
    static final class C13211c<T, B, V> extends C12429v<T, Object, C5923b0<T>> implements C12314c {

        /* renamed from: A0 */
        final AtomicReference<C12314c> f38123A0 = new AtomicReference<>();

        /* renamed from: B0 */
        final List<C12266j<T>> f38124B0;

        /* renamed from: C0 */
        final AtomicLong f38125C0 = new AtomicLong();

        /* renamed from: v0 */
        final C5926g0<B> f38126v0;

        /* renamed from: w0 */
        final C12339o<? super B, ? extends C5926g0<V>> f38127w0;

        /* renamed from: x0 */
        final int f38128x0;

        /* renamed from: y0 */
        final C12313b f38129y0;

        /* renamed from: z0 */
        C12314c f38130z0;

        C13211c(C12280i0<? super C5923b0<T>> i0Var, C5926g0<B> g0Var, C12339o<? super B, ? extends C5926g0<V>> oVar, int i) {
            super(i0Var, new C13660a());
            this.f38126v0 = g0Var;
            this.f38127w0 = oVar;
            this.f38128x0 = i;
            this.f38129y0 = new C12313b();
            this.f38124B0 = new ArrayList();
            this.f38125C0.lazySet(1);
        }

        /* renamed from: a */
        public void mo42184a(C12280i0<? super C5923b0<T>> i0Var, Object obj) {
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38130z0, cVar)) {
                this.f38130z0 = cVar;
                this.f35600q0.mo34123a((C12314c) this);
                if (!this.f35602s0) {
                    C13210b bVar = new C13210b(this);
                    if (this.f38123A0.compareAndSet(null, bVar)) {
                        this.f38125C0.getAndIncrement();
                        this.f38126v0.mo23893a(bVar);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42732b(B b) {
            this.f35601r0.offer(new C13212d(null, b));
            if (mo42188b()) {
                mo42734h();
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35602s0;
        }

        public void dispose() {
            this.f35602s0 = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42733g() {
            this.f38129y0.dispose();
            C12347d.m55465a(this.f38123A0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo42734h() {
            C13660a aVar = (C13660a) this.f35601r0;
            C12280i0<? super V> i0Var = this.f35600q0;
            List<C12266j<T>> list = this.f38124B0;
            int i = 1;
            while (true) {
                boolean z = this.f35603t0;
                Object poll = aVar.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    mo42733g();
                    Throwable th = this.f35604u0;
                    if (th != null) {
                        for (C12266j onError : list) {
                            onError.onError(th);
                        }
                    } else {
                        for (C12266j onComplete : list) {
                            onComplete.onComplete();
                        }
                    }
                    list.clear();
                    return;
                } else if (z2) {
                    i = mo42183a(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (poll instanceof C13212d) {
                    C13212d dVar = (C13212d) poll;
                    C12266j<T> jVar = dVar.f38131a;
                    if (jVar != null) {
                        if (list.remove(jVar)) {
                            dVar.f38131a.onComplete();
                            if (this.f38125C0.decrementAndGet() == 0) {
                                mo42733g();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f35602s0) {
                        C12266j i2 = C12266j.m55270i(this.f38128x0);
                        list.add(i2);
                        i0Var.mo33453a(i2);
                        try {
                            C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f38127w0.apply(dVar.f38132b), "The ObservableSource supplied is null");
                            C13209a aVar2 = new C13209a(this, i2);
                            if (this.f38129y0.mo42072b(aVar2)) {
                                this.f38125C0.getAndIncrement();
                                g0Var.mo23893a(aVar2);
                            }
                        } catch (Throwable th2) {
                            C14398a.m62357b(th2);
                            this.f35602s0 = true;
                            i0Var.onError(th2);
                        }
                    }
                } else {
                    for (C12266j a : list) {
                        a.mo33453a(C13761q.m58751d(poll));
                    }
                }
            }
        }

        public void onComplete() {
            if (!this.f35603t0) {
                this.f35603t0 = true;
                if (mo42188b()) {
                    mo42734h();
                }
                if (this.f38125C0.decrementAndGet() == 0) {
                    this.f38129y0.dispose();
                }
                this.f35600q0.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f35603t0) {
                C12205a.m54894b(th);
                return;
            }
            this.f35604u0 = th;
            this.f35603t0 = true;
            if (mo42188b()) {
                mo42734h();
            }
            if (this.f38125C0.decrementAndGet() == 0) {
                this.f38129y0.dispose();
            }
            this.f35600q0.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (mo42186a()) {
                for (C12266j a : this.f38124B0) {
                    a.mo33453a(t);
                }
                if (mo42183a(-1) == 0) {
                    return;
                }
            } else {
                this.f35601r0.offer(C13761q.m58756i(t));
                if (!mo42188b()) {
                    return;
                }
            }
            mo42734h();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42731a(Throwable th) {
            this.f38130z0.dispose();
            this.f38129y0.dispose();
            onError(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42730a(C13209a<T, V> aVar) {
            this.f38129y0.mo42073c(aVar);
            this.f35601r0.offer(new C13212d(aVar.f38119N, null));
            if (mo42188b()) {
                mo42734h();
            }
        }
    }

    /* renamed from: e.a.x0.e.e.f4$d */
    /* compiled from: ObservableWindowBoundarySelector */
    static final class C13212d<T, B> {

        /* renamed from: a */
        final C12266j<T> f38131a;

        /* renamed from: b */
        final B f38132b;

        C13212d(C12266j<T> jVar, B b) {
            this.f38131a = jVar;
            this.f38132b = b;
        }
    }

    public C13208f4(C5926g0<T> g0Var, C5926g0<B> g0Var2, C12339o<? super B, ? extends C5926g0<V>> oVar, int i) {
        super(g0Var);
        this.f38118b = g0Var2;
        this.f38116N = oVar;
        this.f38117O = i;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super C5923b0<T>> i0Var) {
        this.f37851a.mo23893a(new C13211c(new C13795m(i0Var), this.f38118b, this.f38116N, this.f38117O));
    }
}
