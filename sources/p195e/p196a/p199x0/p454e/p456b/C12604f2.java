package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12297q;
import p195e.p196a.C5927i;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13756l;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.f2 */
/* compiled from: FlowableMergeWithCompletable */
public final class C12604f2<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C5927i f36081N;

    /* renamed from: e.a.x0.e.b.f2$a */
    /* compiled from: FlowableMergeWithCompletable */
    static final class C12605a<T> extends AtomicInteger implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: N */
        final C12606a f36082N = new C12606a(this);

        /* renamed from: O */
        final C13746c f36083O = new C13746c();

        /* renamed from: P */
        final AtomicLong f36084P = new AtomicLong();

        /* renamed from: Q */
        volatile boolean f36085Q;

        /* renamed from: R */
        volatile boolean f36086R;

        /* renamed from: a */
        final C14062c<? super T> f36087a;

        /* renamed from: b */
        final AtomicReference<C14063d> f36088b = new AtomicReference<>();

        /* renamed from: e.a.x0.e.b.f2$a$a */
        /* compiled from: FlowableMergeWithCompletable */
        static final class C12606a extends AtomicReference<C12314c> implements C12268f {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: a */
            final C12605a<?> f36089a;

            C12606a(C12605a<?> aVar) {
                this.f36089a = aVar;
            }

            /* renamed from: a */
            public void mo41921a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onComplete() {
                this.f36089a.mo42304a();
            }

            public void onError(Throwable th) {
                this.f36089a.mo42305a(th);
            }
        }

        C12605a(C14062c<? super T> cVar) {
            this.f36087a = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58677a(this.f36088b, this.f36084P, dVar);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13742j.m58671a(this.f36088b, this.f36084P, j);
        }

        public void cancel() {
            C13742j.m58674a(this.f36088b);
            C12347d.m55465a((AtomicReference<C12314c>) this.f36082N);
        }

        public void onComplete() {
            this.f36085Q = true;
            if (this.f36086R) {
                C13756l.m58730a(this.f36087a, (AtomicInteger) this, this.f36083O);
            }
        }

        public void onError(Throwable th) {
            C13742j.m58674a(this.f36088b);
            C13756l.m58729a(this.f36087a, th, (AtomicInteger) this, this.f36083O);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            C13756l.m58728a(this.f36087a, t, (AtomicInteger) this, this.f36083O);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42305a(Throwable th) {
            C13742j.m58674a(this.f36088b);
            C13756l.m58729a(this.f36087a, th, (AtomicInteger) this, this.f36083O);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42304a() {
            this.f36086R = true;
            if (this.f36085Q) {
                C13756l.m58730a(this.f36087a, (AtomicInteger) this, this.f36083O);
            }
        }
    }

    public C12604f2(C5929l<T> lVar, C5927i iVar) {
        super(lVar);
        this.f36081N = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12605a aVar = new C12605a(cVar);
        cVar.mo41788a((C14063d) aVar);
        this.f35814b.mo24393a((C12297q<? super T>) aVar);
        this.f36081N.mo24122a(aVar.f36082N);
    }
}
