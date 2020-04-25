package p195e.p196a.p199x0.p454e.p459e;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p442e1.C12266j;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.d4 */
/* compiled from: ObservableWindow */
public final class C13182d4<T> extends C13131a<T, C5923b0<T>> {

    /* renamed from: N */
    final long f38017N;

    /* renamed from: O */
    final int f38018O;

    /* renamed from: b */
    final long f38019b;

    /* renamed from: e.a.x0.e.e.d4$a */
    /* compiled from: ObservableWindow */
    static final class C13183a<T> extends AtomicInteger implements C12280i0<T>, C12314c, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;

        /* renamed from: N */
        final int f38020N;

        /* renamed from: O */
        long f38021O;

        /* renamed from: P */
        C12314c f38022P;

        /* renamed from: Q */
        C12266j<T> f38023Q;

        /* renamed from: R */
        volatile boolean f38024R;

        /* renamed from: a */
        final C12280i0<? super C5923b0<T>> f38025a;

        /* renamed from: b */
        final long f38026b;

        C13183a(C12280i0<? super C5923b0<T>> i0Var, long j, int i) {
            this.f38025a = i0Var;
            this.f38026b = j;
            this.f38020N = i;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38022P, cVar)) {
                this.f38022P = cVar;
                this.f38025a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38024R;
        }

        public void dispose() {
            this.f38024R = true;
        }

        public void onComplete() {
            C12266j<T> jVar = this.f38023Q;
            if (jVar != null) {
                this.f38023Q = null;
                jVar.onComplete();
            }
            this.f38025a.onComplete();
        }

        public void onError(Throwable th) {
            C12266j<T> jVar = this.f38023Q;
            if (jVar != null) {
                this.f38023Q = null;
                jVar.onError(th);
            }
            this.f38025a.onError(th);
        }

        public void run() {
            if (this.f38024R) {
                this.f38022P.dispose();
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            C12266j<T> jVar = this.f38023Q;
            if (jVar == null && !this.f38024R) {
                jVar = C12266j.m55267a(this.f38020N, (Runnable) this);
                this.f38023Q = jVar;
                this.f38025a.mo33453a(jVar);
            }
            if (jVar != null) {
                jVar.mo33453a(t);
                long j = this.f38021O + 1;
                this.f38021O = j;
                if (j >= this.f38026b) {
                    this.f38021O = 0;
                    this.f38023Q = null;
                    jVar.onComplete();
                    if (this.f38024R) {
                        this.f38022P.dispose();
                    }
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.e.d4$b */
    /* compiled from: ObservableWindow */
    static final class C13184b<T> extends AtomicBoolean implements C12280i0<T>, C12314c, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;

        /* renamed from: N */
        final long f38027N;

        /* renamed from: O */
        final int f38028O;

        /* renamed from: P */
        final ArrayDeque<C12266j<T>> f38029P;

        /* renamed from: Q */
        long f38030Q;

        /* renamed from: R */
        volatile boolean f38031R;

        /* renamed from: S */
        long f38032S;

        /* renamed from: T */
        C12314c f38033T;

        /* renamed from: U */
        final AtomicInteger f38034U = new AtomicInteger();

        /* renamed from: a */
        final C12280i0<? super C5923b0<T>> f38035a;

        /* renamed from: b */
        final long f38036b;

        C13184b(C12280i0<? super C5923b0<T>> i0Var, long j, long j2, int i) {
            this.f38035a = i0Var;
            this.f38036b = j;
            this.f38027N = j2;
            this.f38028O = i;
            this.f38029P = new ArrayDeque<>();
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38033T, cVar)) {
                this.f38033T = cVar;
                this.f38035a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38031R;
        }

        public void dispose() {
            this.f38031R = true;
        }

        public void onComplete() {
            ArrayDeque<C12266j<T>> arrayDeque = this.f38029P;
            while (!arrayDeque.isEmpty()) {
                ((C12266j) arrayDeque.poll()).onComplete();
            }
            this.f38035a.onComplete();
        }

        public void onError(Throwable th) {
            ArrayDeque<C12266j<T>> arrayDeque = this.f38029P;
            while (!arrayDeque.isEmpty()) {
                ((C12266j) arrayDeque.poll()).onError(th);
            }
            this.f38035a.onError(th);
        }

        public void run() {
            if (this.f38034U.decrementAndGet() == 0 && this.f38031R) {
                this.f38033T.dispose();
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            ArrayDeque<C12266j<T>> arrayDeque = this.f38029P;
            long j = this.f38030Q;
            long j2 = this.f38027N;
            if (j % j2 == 0 && !this.f38031R) {
                this.f38034U.getAndIncrement();
                C12266j a = C12266j.m55267a(this.f38028O, (Runnable) this);
                arrayDeque.offer(a);
                this.f38035a.mo33453a(a);
            }
            long j3 = this.f38032S + 1;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((C12266j) it.next()).mo33453a(t);
            }
            if (j3 >= this.f38036b) {
                ((C12266j) arrayDeque.poll()).onComplete();
                if (!arrayDeque.isEmpty() || !this.f38031R) {
                    this.f38032S = j3 - j2;
                } else {
                    this.f38033T.dispose();
                    return;
                }
            } else {
                this.f38032S = j3;
            }
            this.f38030Q = j + 1;
        }
    }

    public C13182d4(C5926g0<T> g0Var, long j, long j2, int i) {
        super(g0Var);
        this.f38019b = j;
        this.f38017N = j2;
        this.f38018O = i;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super C5923b0<T>> i0Var) {
        long j = this.f38019b;
        long j2 = this.f38017N;
        if (j == j2) {
            this.f37851a.mo23893a(new C13183a(i0Var, j, this.f38018O));
            return;
        }
        C5926g0<T> g0Var = this.f37851a;
        C13184b bVar = new C13184b(i0Var, j, j2, this.f38018O);
        g0Var.mo23893a(bVar);
    }
}
