package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p195e.p196a.C12321v;
import p195e.p196a.C5929l;
import p195e.p196a.C5941y;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p465i.C13735c;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.c.v0 */
/* compiled from: MaybeMergeArray */
public final class C13073v0<T> extends C5929l<T> {

    /* renamed from: b */
    final C5941y<? extends T>[] f37602b;

    /* renamed from: e.a.x0.e.c.v0$a */
    /* compiled from: MaybeMergeArray */
    static final class C13074a<T> extends ConcurrentLinkedQueue<T> implements C13077d<T> {
        private static final long serialVersionUID = -4025173261791142821L;

        /* renamed from: a */
        int f37603a;

        /* renamed from: b */
        final AtomicInteger f37604b = new AtomicInteger();

        C13074a() {
        }

        /* renamed from: a */
        public boolean mo42104a(T t, T t2) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public int mo42598e() {
            return this.f37604b.get();
        }

        /* renamed from: f */
        public void mo42599f() {
            poll();
        }

        /* renamed from: j */
        public int mo42600j() {
            return this.f37603a;
        }

        public boolean offer(T t) {
            this.f37604b.getAndIncrement();
            return super.offer(t);
        }

        @C5938g
        public T poll() {
            T poll = super.poll();
            if (poll != null) {
                this.f37603a++;
            }
            return poll;
        }
    }

    /* renamed from: e.a.x0.e.c.v0$b */
    /* compiled from: MaybeMergeArray */
    static final class C13075b<T> extends C13735c<T> implements C12321v<T> {
        private static final long serialVersionUID = -660395290758764731L;

        /* renamed from: N */
        final AtomicLong f37605N = new AtomicLong();

        /* renamed from: O */
        final C13077d<Object> f37606O;

        /* renamed from: P */
        final C13746c f37607P = new C13746c();

        /* renamed from: Q */
        final int f37608Q;

        /* renamed from: R */
        volatile boolean f37609R;

        /* renamed from: S */
        boolean f37610S;

        /* renamed from: T */
        long f37611T;

        /* renamed from: a */
        final C14062c<? super T> f37612a;

        /* renamed from: b */
        final C12313b f37613b = new C12313b();

        C13075b(C14062c<? super T> cVar, int i, C13077d<Object> dVar) {
            this.f37612a = cVar;
            this.f37608Q = i;
            this.f37606O = dVar;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f37610S = true;
            return 2;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f37605N, j);
                mo42601a();
            }
        }

        public void cancel() {
            if (!this.f37609R) {
                this.f37609R = true;
                this.f37613b.dispose();
                if (getAndIncrement() == 0) {
                    this.f37606O.clear();
                }
            }
        }

        public void clear() {
            this.f37606O.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42602d() {
            C14062c<? super T> cVar = this.f37612a;
            C13077d<Object> dVar = this.f37606O;
            int i = 1;
            while (!this.f37609R) {
                Throwable th = (Throwable) this.f37607P.get();
                if (th != null) {
                    dVar.clear();
                    cVar.onError(th);
                    return;
                }
                boolean z = dVar.mo42598e() == this.f37608Q;
                if (!dVar.isEmpty()) {
                    cVar.mo41789a(null);
                }
                if (z) {
                    cVar.onComplete();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            dVar.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42603e() {
            C14062c<? super T> cVar = this.f37612a;
            C13077d<Object> dVar = this.f37606O;
            long j = this.f37611T;
            int i = 1;
            do {
                long j2 = this.f37605N.get();
                while (j != j2) {
                    if (this.f37609R) {
                        dVar.clear();
                        return;
                    } else if (((Throwable) this.f37607P.get()) != null) {
                        dVar.clear();
                        cVar.onError(this.f37607P.mo43143d());
                        return;
                    } else if (dVar.mo42600j() == this.f37608Q) {
                        cVar.onComplete();
                        return;
                    } else {
                        Object poll = dVar.poll();
                        if (poll == null) {
                            break;
                        } else if (poll != C13761q.COMPLETE) {
                            cVar.mo41789a(poll);
                            j++;
                        }
                    }
                }
                if (j == j2) {
                    if (((Throwable) this.f37607P.get()) != null) {
                        dVar.clear();
                        cVar.onError(this.f37607P.mo43143d());
                        return;
                    }
                    while (dVar.peek() == C13761q.COMPLETE) {
                        dVar.mo42599f();
                    }
                    if (dVar.mo42600j() == this.f37608Q) {
                        cVar.onComplete();
                        return;
                    }
                }
                this.f37611T = j;
                i = addAndGet(-i);
            } while (i != 0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo42604f() {
            return this.f37609R;
        }

        public boolean isEmpty() {
            return this.f37606O.isEmpty();
        }

        public void onComplete() {
            this.f37606O.offer(C13761q.COMPLETE);
            mo42601a();
        }

        public void onError(Throwable th) {
            if (this.f37607P.mo43142a(th)) {
                this.f37613b.dispose();
                this.f37606O.offer(C13761q.COMPLETE);
                mo42601a();
                return;
            }
            C12205a.m54894b(th);
        }

        public void onSuccess(T t) {
            this.f37606O.offer(t);
            mo42601a();
        }

        @C5938g
        public T poll() throws Exception {
            T poll;
            do {
                poll = this.f37606O.poll();
            } while (poll == C13761q.COMPLETE);
            return poll;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            this.f37613b.mo42072b(cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42601a() {
            if (getAndIncrement() == 0) {
                if (this.f37610S) {
                    mo42602d();
                } else {
                    mo42603e();
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.c.v0$c */
    /* compiled from: MaybeMergeArray */
    static final class C13076c<T> extends AtomicReferenceArray<T> implements C13077d<T> {
        private static final long serialVersionUID = -7969063454040569579L;

        /* renamed from: a */
        final AtomicInteger f37614a = new AtomicInteger();

        /* renamed from: b */
        int f37615b;

        C13076c(int i) {
            super(i);
        }

        /* renamed from: a */
        public boolean mo42104a(T t, T t2) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            while (poll() != null) {
                if (isEmpty()) {
                    return;
                }
            }
        }

        /* renamed from: e */
        public int mo42598e() {
            return this.f37614a.get();
        }

        /* renamed from: f */
        public void mo42599f() {
            int i = this.f37615b;
            lazySet(i, null);
            this.f37615b = i + 1;
        }

        public boolean isEmpty() {
            return this.f37615b == mo42598e();
        }

        /* renamed from: j */
        public int mo42600j() {
            return this.f37615b;
        }

        public boolean offer(T t) {
            C12390b.m55563a(t, "value is null");
            int andIncrement = this.f37614a.getAndIncrement();
            if (andIncrement >= length()) {
                return false;
            }
            lazySet(andIncrement, t);
            return true;
        }

        public T peek() {
            int i = this.f37615b;
            if (i == length()) {
                return null;
            }
            return get(i);
        }

        @C5938g
        public T poll() {
            int i = this.f37615b;
            if (i == length()) {
                return null;
            }
            AtomicInteger atomicInteger = this.f37614a;
            do {
                T t = get(i);
                if (t != null) {
                    this.f37615b = i + 1;
                    lazySet(i, null);
                    return t;
                }
            } while (atomicInteger.get() != i);
            return null;
        }
    }

    /* renamed from: e.a.x0.e.c.v0$d */
    /* compiled from: MaybeMergeArray */
    interface C13077d<T> extends C12406o<T> {
        /* renamed from: e */
        int mo42598e();

        /* renamed from: f */
        void mo42599f();

        /* renamed from: j */
        int mo42600j();

        T peek();

        @C5938g
        T poll();
    }

    public C13073v0(C5941y<? extends T>[] yVarArr) {
        this.f37602b = yVarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C13077d dVar;
        C5941y<? extends T>[] yVarArr = this.f37602b;
        int length = yVarArr.length;
        if (length <= C5929l.m26793R()) {
            dVar = new C13076c(length);
        } else {
            dVar = new C13074a();
        }
        C13075b bVar = new C13075b(cVar, length, dVar);
        cVar.mo41788a((C14063d) bVar);
        C13746c cVar2 = bVar.f37607P;
        int length2 = yVarArr.length;
        int i = 0;
        while (i < length2) {
            C5941y<? extends T> yVar = yVarArr[i];
            if (!bVar.mo42604f() && cVar2.get() == null) {
                yVar.mo24639a(bVar);
                i++;
            } else {
                return;
            }
        }
    }
}
