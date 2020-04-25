package p195e.p196a.p199x0.p454e.p456b;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13769v;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12329e;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.m */
/* compiled from: FlowableBuffer */
public final class C12706m<T, C extends Collection<? super T>> extends C12511a<T, C> {

    /* renamed from: N */
    final int f36409N;

    /* renamed from: O */
    final int f36410O;

    /* renamed from: P */
    final Callable<C> f36411P;

    /* renamed from: e.a.x0.e.b.m$a */
    /* compiled from: FlowableBuffer */
    static final class C12707a<T, C extends Collection<? super T>> implements C12297q<T>, C14063d {

        /* renamed from: N */
        final int f36412N;

        /* renamed from: O */
        C f36413O;

        /* renamed from: P */
        C14063d f36414P;

        /* renamed from: Q */
        boolean f36415Q;

        /* renamed from: R */
        int f36416R;

        /* renamed from: a */
        final C14062c<? super C> f36417a;

        /* renamed from: b */
        final Callable<C> f36418b;

        C12707a(C14062c<? super C> cVar, int i, Callable<C> callable) {
            this.f36417a = cVar;
            this.f36412N = i;
            this.f36418b = callable;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36414P, dVar)) {
                this.f36414P = dVar;
                this.f36417a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                this.f36414P.mo41813c(C13747d.m58697b(j, (long) this.f36412N));
            }
        }

        public void cancel() {
            this.f36414P.cancel();
        }

        public void onComplete() {
            if (!this.f36415Q) {
                this.f36415Q = true;
                C c = this.f36413O;
                if (c != null && !c.isEmpty()) {
                    this.f36417a.mo41789a(c);
                }
                this.f36417a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f36415Q) {
                C12205a.m54894b(th);
                return;
            }
            this.f36415Q = true;
            this.f36417a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36415Q) {
                C c = this.f36413O;
                if (c == null) {
                    try {
                        c = (Collection) C12390b.m55563a(this.f36418b.call(), "The bufferSupplier returned a null buffer");
                        this.f36413O = c;
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        cancel();
                        onError(th);
                        return;
                    }
                }
                c.add(t);
                int i = this.f36416R + 1;
                if (i == this.f36412N) {
                    this.f36416R = 0;
                    this.f36413O = null;
                    this.f36417a.mo41789a(c);
                } else {
                    this.f36416R = i;
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.b.m$b */
    /* compiled from: FlowableBuffer */
    static final class C12708b<T, C extends Collection<? super T>> extends AtomicLong implements C12297q<T>, C14063d, C12329e {
        private static final long serialVersionUID = -7370244972039324525L;

        /* renamed from: N */
        final int f36419N;

        /* renamed from: O */
        final int f36420O;

        /* renamed from: P */
        final ArrayDeque<C> f36421P = new ArrayDeque<>();

        /* renamed from: Q */
        final AtomicBoolean f36422Q = new AtomicBoolean();

        /* renamed from: R */
        C14063d f36423R;

        /* renamed from: S */
        boolean f36424S;

        /* renamed from: T */
        int f36425T;

        /* renamed from: U */
        volatile boolean f36426U;

        /* renamed from: V */
        long f36427V;

        /* renamed from: a */
        final C14062c<? super C> f36428a;

        /* renamed from: b */
        final Callable<C> f36429b;

        C12708b(C14062c<? super C> cVar, int i, int i2, Callable<C> callable) {
            this.f36428a = cVar;
            this.f36419N = i;
            this.f36420O = i2;
            this.f36429b = callable;
        }

        /* renamed from: a */
        public boolean mo42090a() {
            return this.f36426U;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                if (!C13769v.m58789b(j, this.f36428a, this.f36421P, this, this)) {
                    if (this.f36422Q.get() || !this.f36422Q.compareAndSet(false, true)) {
                        this.f36423R.mo41813c(C13747d.m58697b((long) this.f36420O, j));
                    } else {
                        this.f36423R.mo41813c(C13747d.m58695a((long) this.f36419N, C13747d.m58697b((long) this.f36420O, j - 1)));
                    }
                }
            }
        }

        public void cancel() {
            this.f36426U = true;
            this.f36423R.cancel();
        }

        public void onComplete() {
            if (!this.f36424S) {
                this.f36424S = true;
                long j = this.f36427V;
                if (j != 0) {
                    C13747d.m58699c(this, j);
                }
                C13769v.m58783a(this.f36428a, this.f36421P, this, this);
            }
        }

        public void onError(Throwable th) {
            if (this.f36424S) {
                C12205a.m54894b(th);
                return;
            }
            this.f36424S = true;
            this.f36421P.clear();
            this.f36428a.onError(th);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36423R, dVar)) {
                this.f36423R = dVar;
                this.f36428a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36424S) {
                ArrayDeque<C> arrayDeque = this.f36421P;
                int i = this.f36425T;
                int i2 = i + 1;
                if (i == 0) {
                    try {
                        arrayDeque.offer((Collection) C12390b.m55563a(this.f36429b.call(), "The bufferSupplier returned a null buffer"));
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        cancel();
                        onError(th);
                        return;
                    }
                }
                Collection collection = (Collection) arrayDeque.peek();
                if (collection != null && collection.size() + 1 == this.f36419N) {
                    arrayDeque.poll();
                    collection.add(t);
                    this.f36427V++;
                    this.f36428a.mo41789a(collection);
                }
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    ((Collection) it.next()).add(t);
                }
                if (i2 == this.f36420O) {
                    i2 = 0;
                }
                this.f36425T = i2;
            }
        }
    }

    /* renamed from: e.a.x0.e.b.m$c */
    /* compiled from: FlowableBuffer */
    static final class C12709c<T, C extends Collection<? super T>> extends AtomicInteger implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -5616169793639412593L;

        /* renamed from: N */
        final int f36430N;

        /* renamed from: O */
        final int f36431O;

        /* renamed from: P */
        C f36432P;

        /* renamed from: Q */
        C14063d f36433Q;

        /* renamed from: R */
        boolean f36434R;

        /* renamed from: S */
        int f36435S;

        /* renamed from: a */
        final C14062c<? super C> f36436a;

        /* renamed from: b */
        final Callable<C> f36437b;

        C12709c(C14062c<? super C> cVar, int i, int i2, Callable<C> callable) {
            this.f36436a = cVar;
            this.f36430N = i;
            this.f36431O = i2;
            this.f36437b = callable;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36433Q, dVar)) {
                this.f36433Q = dVar;
                this.f36436a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (!C13742j.m58678b(j)) {
                return;
            }
            if (get() != 0 || !compareAndSet(0, 1)) {
                this.f36433Q.mo41813c(C13747d.m58697b((long) this.f36431O, j));
                return;
            }
            this.f36433Q.mo41813c(C13747d.m58695a(C13747d.m58697b(j, (long) this.f36430N), C13747d.m58697b((long) (this.f36431O - this.f36430N), j - 1)));
        }

        public void cancel() {
            this.f36433Q.cancel();
        }

        public void onComplete() {
            if (!this.f36434R) {
                this.f36434R = true;
                C c = this.f36432P;
                this.f36432P = null;
                if (c != null) {
                    this.f36436a.mo41789a(c);
                }
                this.f36436a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f36434R) {
                C12205a.m54894b(th);
                return;
            }
            this.f36434R = true;
            this.f36432P = null;
            this.f36436a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36434R) {
                C c = this.f36432P;
                int i = this.f36435S;
                int i2 = i + 1;
                if (i == 0) {
                    try {
                        c = (Collection) C12390b.m55563a(this.f36437b.call(), "The bufferSupplier returned a null buffer");
                        this.f36432P = c;
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        cancel();
                        onError(th);
                        return;
                    }
                }
                if (c != null) {
                    c.add(t);
                    if (c.size() == this.f36430N) {
                        this.f36432P = null;
                        this.f36436a.mo41789a(c);
                    }
                }
                if (i2 == this.f36431O) {
                    i2 = 0;
                }
                this.f36435S = i2;
            }
        }
    }

    public C12706m(C5929l<T> lVar, int i, int i2, Callable<C> callable) {
        super(lVar);
        this.f36409N = i;
        this.f36410O = i2;
        this.f36411P = callable;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super C> cVar) {
        int i = this.f36409N;
        int i2 = this.f36410O;
        if (i == i2) {
            this.f35814b.mo24393a((C12297q<? super T>) new C12707a<Object>(cVar, i, this.f36411P));
        } else if (i2 > i) {
            this.f35814b.mo24393a((C12297q<? super T>) new C12709c<Object>(cVar, i, i2, this.f36411P));
        } else {
            this.f35814b.mo24393a((C12297q<? super T>) new C12708b<Object>(cVar, i, i2, this.f36411P));
        }
    }
}
