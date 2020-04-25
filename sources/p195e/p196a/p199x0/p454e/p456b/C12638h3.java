package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p443f1.C12274e;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.h3 */
/* compiled from: FlowableSamplePublisher */
public final class C12638h3<T> extends C5929l<T> {

    /* renamed from: N */
    final C6007b<?> f36197N;

    /* renamed from: O */
    final boolean f36198O;

    /* renamed from: b */
    final C6007b<T> f36199b;

    /* renamed from: e.a.x0.e.b.h3$a */
    /* compiled from: FlowableSamplePublisher */
    static final class C12639a<T> extends C12641c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        /* renamed from: Q */
        final AtomicInteger f36200Q = new AtomicInteger();

        /* renamed from: R */
        volatile boolean f36201R;

        C12639a(C14062c<? super T> cVar, C6007b<?> bVar) {
            super(cVar, bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42329d() {
            this.f36201R = true;
            if (this.f36200Q.getAndIncrement() == 0) {
                mo42335f();
                this.f36205a.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42330e() {
            this.f36201R = true;
            if (this.f36200Q.getAndIncrement() == 0) {
                mo42335f();
                this.f36205a.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42331g() {
            if (this.f36200Q.getAndIncrement() == 0) {
                do {
                    boolean z = this.f36201R;
                    mo42335f();
                    if (z) {
                        this.f36205a.onComplete();
                        return;
                    }
                } while (this.f36200Q.decrementAndGet() != 0);
            }
        }
    }

    /* renamed from: e.a.x0.e.b.h3$b */
    /* compiled from: FlowableSamplePublisher */
    static final class C12640b<T> extends C12641c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        C12640b(C14062c<? super T> cVar, C6007b<?> bVar) {
            super(cVar, bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42329d() {
            this.f36205a.onComplete();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42330e() {
            this.f36205a.onComplete();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42331g() {
            mo42335f();
        }
    }

    /* renamed from: e.a.x0.e.b.h3$c */
    /* compiled from: FlowableSamplePublisher */
    static abstract class C12641c<T> extends AtomicReference<T> implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: N */
        final AtomicLong f36202N = new AtomicLong();

        /* renamed from: O */
        final AtomicReference<C14063d> f36203O = new AtomicReference<>();

        /* renamed from: P */
        C14063d f36204P;

        /* renamed from: a */
        final C14062c<? super T> f36205a;

        /* renamed from: b */
        final C6007b<?> f36206b;

        C12641c(C14062c<? super T> cVar, C6007b<?> bVar) {
            this.f36205a = cVar;
            this.f36206b = bVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36204P, dVar)) {
                this.f36204P = dVar;
                this.f36205a.mo41788a((C14063d) this);
                if (this.f36203O.get() == null) {
                    this.f36206b.mo24397a(new C12642d(this));
                    dVar.mo41813c(Long.MAX_VALUE);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42334b(C14063d dVar) {
            C13742j.m58676a(this.f36203O, dVar, Long.MAX_VALUE);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36202N, j);
            }
        }

        public void cancel() {
            C13742j.m58674a(this.f36203O);
            this.f36204P.cancel();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract void mo42329d();

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public abstract void mo42330e();

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42335f() {
            Object andSet = getAndSet(null);
            if (andSet == null) {
                return;
            }
            if (this.f36202N.get() != 0) {
                this.f36205a.mo41789a(andSet);
                C13747d.m58699c(this.f36202N, 1);
                return;
            }
            cancel();
            this.f36205a.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public abstract void mo42331g();

        public void onComplete() {
            C13742j.m58674a(this.f36203O);
            mo42329d();
        }

        public void onError(Throwable th) {
            C13742j.m58674a(this.f36203O);
            this.f36205a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            lazySet(t);
        }

        /* renamed from: a */
        public void mo42333a(Throwable th) {
            this.f36204P.cancel();
            this.f36205a.onError(th);
        }

        /* renamed from: a */
        public void mo42332a() {
            this.f36204P.cancel();
            mo42330e();
        }
    }

    /* renamed from: e.a.x0.e.b.h3$d */
    /* compiled from: FlowableSamplePublisher */
    static final class C12642d<T> implements C12297q<Object> {

        /* renamed from: a */
        final C12641c<T> f36207a;

        C12642d(C12641c<T> cVar) {
            this.f36207a = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            this.f36207a.mo42334b(dVar);
        }

        public void onComplete() {
            this.f36207a.mo42332a();
        }

        public void onError(Throwable th) {
            this.f36207a.mo42333a(th);
        }

        /* renamed from: a */
        public void mo41789a(Object obj) {
            this.f36207a.mo42331g();
        }
    }

    public C12638h3(C6007b<T> bVar, C6007b<?> bVar2, boolean z) {
        this.f36199b = bVar;
        this.f36197N = bVar2;
        this.f36198O = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12274e eVar = new C12274e(cVar);
        if (this.f36198O) {
            this.f36199b.mo24397a(new C12639a(eVar, this.f36197N));
        } else {
            this.f36199b.mo24397a(new C12640b(eVar, this.f36197N));
        }
    }
}
