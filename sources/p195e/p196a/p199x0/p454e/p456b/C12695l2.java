package p195e.p196a.p199x0.p454e.p456b;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12199a;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12325a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.l2 */
/* compiled from: FlowableOnBackpressureBufferStrategy */
public final class C12695l2<T> extends C12511a<T, T> {

    /* renamed from: N */
    final long f36357N;

    /* renamed from: O */
    final C12325a f36358O;

    /* renamed from: P */
    final C12199a f36359P;

    /* renamed from: e.a.x0.e.b.l2$a */
    /* compiled from: FlowableOnBackpressureBufferStrategy */
    static /* synthetic */ class C12696a {

        /* renamed from: a */
        static final /* synthetic */ int[] f36360a = new int[C12199a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                e.a.a[] r0 = p195e.p196a.C12199a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36360a = r0
                int[] r0 = f36360a     // Catch:{ NoSuchFieldError -> 0x0014 }
                e.a.a r1 = p195e.p196a.C12199a.DROP_LATEST     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f36360a     // Catch:{ NoSuchFieldError -> 0x001f }
                e.a.a r1 = p195e.p196a.C12199a.DROP_OLDEST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12695l2.C12696a.<clinit>():void");
        }
    }

    /* renamed from: e.a.x0.e.b.l2$b */
    /* compiled from: FlowableOnBackpressureBufferStrategy */
    static final class C12697b<T> extends AtomicInteger implements C12297q<T>, C14063d {
        private static final long serialVersionUID = 3240706908776709697L;

        /* renamed from: N */
        final C12199a f36361N;

        /* renamed from: O */
        final long f36362O;

        /* renamed from: P */
        final AtomicLong f36363P = new AtomicLong();

        /* renamed from: Q */
        final Deque<T> f36364Q = new ArrayDeque();

        /* renamed from: R */
        C14063d f36365R;

        /* renamed from: S */
        volatile boolean f36366S;

        /* renamed from: T */
        volatile boolean f36367T;

        /* renamed from: U */
        Throwable f36368U;

        /* renamed from: a */
        final C14062c<? super T> f36369a;

        /* renamed from: b */
        final C12325a f36370b;

        C12697b(C14062c<? super T> cVar, C12325a aVar, C12199a aVar2, long j) {
            this.f36369a = cVar;
            this.f36370b = aVar;
            this.f36361N = aVar2;
            this.f36362O = j;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36365R, dVar)) {
                this.f36365R = dVar;
                this.f36369a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36363P, j);
                mo42360a();
            }
        }

        public void cancel() {
            this.f36366S = true;
            this.f36365R.cancel();
            if (getAndIncrement() == 0) {
                mo42361a(this.f36364Q);
            }
        }

        public void onComplete() {
            this.f36367T = true;
            mo42360a();
        }

        public void onError(Throwable th) {
            if (this.f36367T) {
                C12205a.m54894b(th);
                return;
            }
            this.f36368U = th;
            this.f36367T = true;
            mo42360a();
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            boolean z;
            boolean z2;
            if (!this.f36367T) {
                Deque<T> deque = this.f36364Q;
                synchronized (deque) {
                    z = false;
                    z2 = true;
                    if (((long) deque.size()) == this.f36362O) {
                        int i = C12696a.f36360a[this.f36361N.ordinal()];
                        if (i == 1) {
                            deque.pollLast();
                            deque.offer(t);
                        } else if (i == 2) {
                            deque.poll();
                            deque.offer(t);
                        }
                        z = true;
                    } else {
                        deque.offer(t);
                    }
                    z2 = false;
                }
                if (z) {
                    C12325a aVar = this.f36370b;
                    if (aVar != null) {
                        try {
                            aVar.run();
                        } catch (Throwable th) {
                            C14398a.m62357b(th);
                            this.f36365R.cancel();
                            onError(th);
                        }
                    }
                } else if (z2) {
                    this.f36365R.cancel();
                    onError(new MissingBackpressureException());
                } else {
                    mo42360a();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42361a(Deque<T> deque) {
            synchronized (deque) {
                deque.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42360a() {
            boolean isEmpty;
            Object poll;
            if (getAndIncrement() == 0) {
                Deque<T> deque = this.f36364Q;
                C14062c<? super T> cVar = this.f36369a;
                int i = 1;
                do {
                    long j = this.f36363P.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.f36366S) {
                            mo42361a(deque);
                            return;
                        }
                        boolean z = this.f36367T;
                        synchronized (deque) {
                            poll = deque.poll();
                        }
                        boolean z2 = poll == null;
                        if (z) {
                            Throwable th = this.f36368U;
                            if (th != null) {
                                mo42361a(deque);
                                cVar.onError(th);
                                return;
                            } else if (z2) {
                                cVar.onComplete();
                                return;
                            }
                        }
                        if (z2) {
                            break;
                        }
                        cVar.mo41789a(poll);
                        j2++;
                    }
                    if (j2 == j) {
                        if (this.f36366S) {
                            mo42361a(deque);
                            return;
                        }
                        boolean z3 = this.f36367T;
                        synchronized (deque) {
                            isEmpty = deque.isEmpty();
                        }
                        if (z3) {
                            Throwable th2 = this.f36368U;
                            if (th2 != null) {
                                mo42361a(deque);
                                cVar.onError(th2);
                                return;
                            } else if (isEmpty) {
                                cVar.onComplete();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C13747d.m58699c(this.f36363P, j2);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    public C12695l2(C5929l<T> lVar, long j, C12325a aVar, C12199a aVar2) {
        super(lVar);
        this.f36357N = j;
        this.f36358O = aVar;
        this.f36359P = aVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C5929l<T> lVar = this.f35814b;
        C12697b bVar = new C12697b(cVar, this.f36358O, this.f36359P, this.f36357N);
        lVar.mo24393a((C12297q<? super T>) bVar);
    }
}
