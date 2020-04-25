package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13756l;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.b.v3 */
/* compiled from: FlowableSkipUntil */
public final class C12876v3<T, U> extends C12511a<T, T> {

    /* renamed from: N */
    final C6007b<U> f37061N;

    /* renamed from: e.a.x0.e.b.v3$a */
    /* compiled from: FlowableSkipUntil */
    static final class C12877a<T> extends AtomicInteger implements C12392a<T>, C14063d {
        private static final long serialVersionUID = -6270983465606289181L;

        /* renamed from: N */
        final AtomicLong f37062N = new AtomicLong();

        /* renamed from: O */
        final C12878a f37063O = new C12878a<>();

        /* renamed from: P */
        final C13746c f37064P = new C13746c();

        /* renamed from: Q */
        volatile boolean f37065Q;

        /* renamed from: a */
        final C14062c<? super T> f37066a;

        /* renamed from: b */
        final AtomicReference<C14063d> f37067b = new AtomicReference<>();

        /* renamed from: e.a.x0.e.b.v3$a$a */
        /* compiled from: FlowableSkipUntil */
        final class C12878a extends AtomicReference<C14063d> implements C12297q<Object> {
            private static final long serialVersionUID = -5592042965931999169L;

            C12878a() {
            }

            /* renamed from: a */
            public void mo41788a(C14063d dVar) {
                C13742j.m58676a((AtomicReference<C14063d>) this, dVar, Long.MAX_VALUE);
            }

            public void onComplete() {
                C12877a.this.f37065Q = true;
            }

            public void onError(Throwable th) {
                C13742j.m58674a(C12877a.this.f37067b);
                C12877a aVar = C12877a.this;
                C13756l.m58729a(aVar.f37066a, th, (AtomicInteger) aVar, aVar.f37064P);
            }

            /* renamed from: a */
            public void mo41789a(Object obj) {
                C12877a.this.f37065Q = true;
                ((C14063d) get()).cancel();
            }
        }

        C12877a(C14062c<? super T> cVar) {
            this.f37066a = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58677a(this.f37067b, this.f37062N, dVar);
        }

        /* renamed from: b */
        public boolean mo42138b(T t) {
            if (!this.f37065Q) {
                return false;
            }
            C13756l.m58728a(this.f37066a, t, (AtomicInteger) this, this.f37064P);
            return true;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13742j.m58671a(this.f37067b, this.f37062N, j);
        }

        public void cancel() {
            C13742j.m58674a(this.f37067b);
            C13742j.m58674a((AtomicReference<C14063d>) this.f37063O);
        }

        public void onComplete() {
            C13742j.m58674a((AtomicReference<C14063d>) this.f37063O);
            C13756l.m58730a(this.f37066a, (AtomicInteger) this, this.f37064P);
        }

        public void onError(Throwable th) {
            C13742j.m58674a((AtomicReference<C14063d>) this.f37063O);
            C13756l.m58729a(this.f37066a, th, (AtomicInteger) this, this.f37064P);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!mo42138b(t)) {
                ((C14063d) this.f37067b.get()).mo41813c(1);
            }
        }
    }

    public C12876v3(C5929l<T> lVar, C6007b<U> bVar) {
        super(lVar);
        this.f37061N = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12877a aVar = new C12877a(cVar);
        cVar.mo41788a((C14063d) aVar);
        this.f37061N.mo24397a(aVar.f37063O);
        this.f35814b.mo24393a((C12297q<? super T>) aVar);
    }
}
