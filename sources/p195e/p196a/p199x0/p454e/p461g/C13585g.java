package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12292n0;
import p195e.p196a.C5927i;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p453d.C12433z;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.g.g */
/* compiled from: SingleDelayWithCompletable */
public final class C13585g<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39343a;

    /* renamed from: b */
    final C5927i f39344b;

    /* renamed from: e.a.x0.e.g.g$a */
    /* compiled from: SingleDelayWithCompletable */
    static final class C13586a<T> extends AtomicReference<C12314c> implements C12268f, C12314c {
        private static final long serialVersionUID = -8565274649390031272L;

        /* renamed from: a */
        final C12292n0<? super T> f39345a;

        /* renamed from: b */
        final C5930q0<T> f39346b;

        C13586a(C12292n0<? super T> n0Var, C5930q0<T> q0Var) {
            this.f39345a = n0Var;
            this.f39346b = q0Var;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f39345a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            this.f39346b.mo24192a(new C12433z(this, this.f39345a));
        }

        public void onError(Throwable th) {
            this.f39345a.onError(th);
        }
    }

    public C13585g(C5930q0<T> q0Var, C5927i iVar) {
        this.f39343a = q0Var;
        this.f39344b = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39344b.mo24122a(new C13586a(n0Var, this.f39343a));
    }
}
