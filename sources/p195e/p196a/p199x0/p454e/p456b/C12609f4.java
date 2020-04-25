package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13756l;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.b.f4 */
/* compiled from: FlowableTakeUntil */
public final class C12609f4<T, U> extends C12511a<T, T> {

    /* renamed from: N */
    final C6007b<? extends U> f36098N;

    /* renamed from: e.a.x0.e.b.f4$a */
    /* compiled from: FlowableTakeUntil */
    static final class C12610a<T> extends AtomicInteger implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -4945480365982832967L;

        /* renamed from: N */
        final AtomicReference<C14063d> f36099N = new AtomicReference<>();

        /* renamed from: O */
        final C13746c f36100O = new C13746c();

        /* renamed from: P */
        final C12611a f36101P = new C12611a<>();

        /* renamed from: a */
        final C14062c<? super T> f36102a;

        /* renamed from: b */
        final AtomicLong f36103b = new AtomicLong();

        /* renamed from: e.a.x0.e.b.f4$a$a */
        /* compiled from: FlowableTakeUntil */
        final class C12611a extends AtomicReference<C14063d> implements C12297q<Object> {
            private static final long serialVersionUID = -3592821756711087922L;

            C12611a() {
            }

            /* renamed from: a */
            public void mo41788a(C14063d dVar) {
                C13742j.m58676a((AtomicReference<C14063d>) this, dVar, Long.MAX_VALUE);
            }

            public void onComplete() {
                C13742j.m58674a(C12610a.this.f36099N);
                C12610a aVar = C12610a.this;
                C13756l.m58730a(aVar.f36102a, (AtomicInteger) aVar, aVar.f36100O);
            }

            public void onError(Throwable th) {
                C13742j.m58674a(C12610a.this.f36099N);
                C12610a aVar = C12610a.this;
                C13756l.m58729a(aVar.f36102a, th, (AtomicInteger) aVar, aVar.f36100O);
            }

            /* renamed from: a */
            public void mo41789a(Object obj) {
                C13742j.m58674a((AtomicReference<C14063d>) this);
                onComplete();
            }
        }

        C12610a(C14062c<? super T> cVar) {
            this.f36102a = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58677a(this.f36099N, this.f36103b, dVar);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13742j.m58671a(this.f36099N, this.f36103b, j);
        }

        public void cancel() {
            C13742j.m58674a(this.f36099N);
            C13742j.m58674a((AtomicReference<C14063d>) this.f36101P);
        }

        public void onComplete() {
            C13742j.m58674a((AtomicReference<C14063d>) this.f36101P);
            C13756l.m58730a(this.f36102a, (AtomicInteger) this, this.f36100O);
        }

        public void onError(Throwable th) {
            C13742j.m58674a((AtomicReference<C14063d>) this.f36101P);
            C13756l.m58729a(this.f36102a, th, (AtomicInteger) this, this.f36100O);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            C13756l.m58728a(this.f36102a, t, (AtomicInteger) this, this.f36100O);
        }
    }

    public C12609f4(C5929l<T> lVar, C6007b<? extends U> bVar) {
        super(lVar);
        this.f36098N = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12610a aVar = new C12610a(cVar);
        cVar.mo41788a((C14063d) aVar);
        this.f36098N.mo24397a(aVar.f36101P);
        this.f35814b.mo24393a((C12297q<? super T>) aVar);
    }
}
