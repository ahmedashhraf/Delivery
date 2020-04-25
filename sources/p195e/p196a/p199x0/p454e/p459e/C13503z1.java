package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13756l;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.z1 */
/* compiled from: ObservableMergeWithCompletable */
public final class C13503z1<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C5927i f39108b;

    /* renamed from: e.a.x0.e.e.z1$a */
    /* compiled from: ObservableMergeWithCompletable */
    static final class C13504a<T> extends AtomicInteger implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: N */
        final C13505a f39109N = new C13505a(this);

        /* renamed from: O */
        final C13746c f39110O = new C13746c();

        /* renamed from: P */
        volatile boolean f39111P;

        /* renamed from: Q */
        volatile boolean f39112Q;

        /* renamed from: a */
        final C12280i0<? super T> f39113a;

        /* renamed from: b */
        final AtomicReference<C12314c> f39114b = new AtomicReference<>();

        /* renamed from: e.a.x0.e.e.z1$a$a */
        /* compiled from: ObservableMergeWithCompletable */
        static final class C13505a extends AtomicReference<C12314c> implements C12268f {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: a */
            final C13504a<?> f39115a;

            C13505a(C13504a<?> aVar) {
                this.f39115a = aVar;
            }

            /* renamed from: a */
            public void mo41921a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onComplete() {
                this.f39115a.mo42953a();
            }

            public void onError(Throwable th) {
                this.f39115a.mo42954a(th);
            }
        }

        C13504a(C12280i0<? super T> i0Var) {
            this.f39113a = i0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this.f39114b, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) this.f39114b.get());
        }

        public void dispose() {
            C12347d.m55465a(this.f39114b);
            C12347d.m55465a((AtomicReference<C12314c>) this.f39109N);
        }

        public void onComplete() {
            this.f39111P = true;
            if (this.f39112Q) {
                C13756l.m58727a(this.f39113a, (AtomicInteger) this, this.f39110O);
            }
        }

        public void onError(Throwable th) {
            C12347d.m55465a(this.f39114b);
            C13756l.m58726a(this.f39113a, th, (AtomicInteger) this, this.f39110O);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            C13756l.m58725a(this.f39113a, t, (AtomicInteger) this, this.f39110O);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42954a(Throwable th) {
            C12347d.m55465a(this.f39114b);
            C13756l.m58726a(this.f39113a, th, (AtomicInteger) this, this.f39110O);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42953a() {
            this.f39112Q = true;
            if (this.f39111P) {
                C13756l.m58727a(this.f39113a, (AtomicInteger) this, this.f39110O);
            }
        }
    }

    public C13503z1(C5923b0<T> b0Var, C5927i iVar) {
        super(b0Var);
        this.f39108b = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C13504a aVar = new C13504a(i0Var);
        i0Var.mo34123a((C12314c) aVar);
        this.f37851a.mo23893a(aVar);
        this.f39108b.mo24122a(aVar.f39109N);
    }
}
