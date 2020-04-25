package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12226d0;
import p195e.p196a.C12243e0;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12345b;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12330f;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.c0 */
/* compiled from: ObservableCreate */
public final class C13162c0<T> extends C5923b0<T> {

    /* renamed from: a */
    final C12243e0<T> f37958a;

    /* renamed from: e.a.x0.e.e.c0$a */
    /* compiled from: ObservableCreate */
    static final class C13163a<T> extends AtomicReference<C12314c> implements C12226d0<T>, C12314c {
        private static final long serialVersionUID = -3434801548987643227L;

        /* renamed from: a */
        final C12280i0<? super T> f37959a;

        C13163a(C12280i0<? super T> i0Var) {
            this.f37959a = i0Var;
        }

        /* renamed from: a */
        public void mo42030a(T t) {
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (!mo41863d()) {
                this.f37959a.mo33453a(t);
            }
        }

        /* renamed from: d */
        public boolean mo41863d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            if (!mo41863d()) {
                try {
                    this.f37959a.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        public void onError(Throwable th) {
            if (!mo41862a(th)) {
                C12205a.m54894b(th);
            }
        }

        public C12226d0<T> serialize() {
            return new C13164b(this);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public boolean mo41862a(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (mo41863d()) {
                return false;
            }
            try {
                this.f37959a.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        /* renamed from: a */
        public void mo41860a(C12314c cVar) {
            C12347d.m55467b(this, cVar);
        }

        /* renamed from: a */
        public void mo41861a(C12330f fVar) {
            mo41860a((C12314c) new C12345b(fVar));
        }
    }

    /* renamed from: e.a.x0.e.e.c0$b */
    /* compiled from: ObservableCreate */
    static final class C13164b<T> extends AtomicInteger implements C12226d0<T> {
        private static final long serialVersionUID = 4883307006032401862L;

        /* renamed from: N */
        final C13663c<T> f37960N = new C13663c<>(16);

        /* renamed from: O */
        volatile boolean f37961O;

        /* renamed from: a */
        final C12226d0<T> f37962a;

        /* renamed from: b */
        final C13746c f37963b = new C13746c();

        C13164b(C12226d0<T> d0Var) {
            this.f37962a = d0Var;
        }

        /* renamed from: a */
        public void mo42030a(T t) {
            if (!this.f37962a.mo41863d() && !this.f37961O) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    C13663c<T> cVar = this.f37960N;
                    synchronized (cVar) {
                        cVar.offer(t);
                    }
                    if (getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    this.f37962a.mo42030a(t);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                mo42696e();
            }
        }

        /* renamed from: d */
        public boolean mo41863d() {
            return this.f37962a.mo41863d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42696e() {
            C12226d0<T> d0Var = this.f37962a;
            C13663c<T> cVar = this.f37960N;
            C13746c cVar2 = this.f37963b;
            int i = 1;
            while (!d0Var.mo41863d()) {
                if (cVar2.get() != null) {
                    cVar.clear();
                    d0Var.onError(cVar2.mo43143d());
                    return;
                }
                boolean z = this.f37961O;
                Object poll = cVar.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    d0Var.onComplete();
                    return;
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    d0Var.mo42030a(poll);
                }
            }
            cVar.clear();
        }

        public void onComplete() {
            if (!this.f37962a.mo41863d() && !this.f37961O) {
                this.f37961O = true;
                mo42695a();
            }
        }

        public void onError(Throwable th) {
            if (!mo41862a(th)) {
                C12205a.m54894b(th);
            }
        }

        public C12226d0<T> serialize() {
            return this;
        }

        /* renamed from: a */
        public boolean mo41862a(Throwable th) {
            if (!this.f37962a.mo41863d() && !this.f37961O) {
                if (th == null) {
                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.f37963b.mo43142a(th)) {
                    this.f37961O = true;
                    mo42695a();
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42695a() {
            if (getAndIncrement() == 0) {
                mo42696e();
            }
        }

        /* renamed from: a */
        public void mo41860a(C12314c cVar) {
            this.f37962a.mo41860a(cVar);
        }

        /* renamed from: a */
        public void mo41861a(C12330f fVar) {
            this.f37962a.mo41861a(fVar);
        }
    }

    public C13162c0(C12243e0<T> e0Var) {
        this.f37958a = e0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C13163a aVar = new C13163a(i0Var);
        i0Var.mo34123a((C12314c) aVar);
        try {
            this.f37958a.mo35286a(aVar);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            aVar.onError(th);
        }
    }
}
